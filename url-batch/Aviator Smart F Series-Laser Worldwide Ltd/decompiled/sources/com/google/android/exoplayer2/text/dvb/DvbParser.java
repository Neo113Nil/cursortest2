package com.google.android.exoplayer2.text.dvb;

import a4.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import h4.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
final class DvbParser {
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, a.f79r1, a.E1, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, a.L0, 85, a.f23c1, a.f79r1, a.E1, -103, a.R1, a.f28d2, -52, -35, p.f16767c, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    private static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i8;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    private static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.width = i8;
            this.height = i9;
            this.horizontalPositionMinimum = i10;
            this.horizontalPositionMaximum = i11;
            this.verticalPositionMinimum = i12;
            this.verticalPositionMaximum = i13;
        }
    }

    private static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i8, boolean z7, byte[] bArr, byte[] bArr2) {
            this.id = i8;
            this.nonModifyingColorFlag = z7;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    private static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i8, int i9, int i10, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i8;
            this.version = i9;
            this.state = i10;
            this.regions = sparseArray;
        }
    }

    private static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i8, int i9) {
            this.horizontalAddress = i8;
            this.verticalAddress = i9;
        }
    }

    private static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i8, boolean z7, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, SparseArray<RegionObject> sparseArray) {
            this.id = i8;
            this.fillFlag = z7;
            this.width = i9;
            this.height = i10;
            this.levelOfCompatibility = i11;
            this.depth = i12;
            this.clutId = i13;
            this.pixelCode8Bit = i14;
            this.pixelCode4Bit = i15;
            this.pixelCode2Bit = i16;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(RegionComposition regionComposition) {
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                this.regionObjects.put(sparseArray.keyAt(i8), sparseArray.valueAt(i8));
            }
        }
    }

    private static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.type = i8;
            this.provider = i9;
            this.horizontalPosition = i10;
            this.verticalPosition = i11;
            this.foregroundPixelCode = i12;
            this.backgroundPixelCode = i13;
        }
    }

    private static final class SubtitleService {
        public final int ancillaryPageId;

        @Nullable
        public DisplayDefinition displayDefinition;

        @Nullable
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i8, int i9) {
            this.subtitlePageId = i8;
            this.ancillaryPageId = i9;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(int i8, int i9) {
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(i8, i9);
    }

    private static byte[] buildClutMapTable(int i8, int i9, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) parsableBitArray.readBits(i9);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i8 = 1; i8 < 16; i8++) {
            if (i8 < 8) {
                iArr[i8] = getColor(255, (i8 & 1) != 0 ? 255 : 0, (i8 & 2) != 0 ? 255 : 0, (i8 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i8] = getColor(255, (i8 & 1) != 0 ? 127 : 0, (i8 & 2) != 0 ? 127 : 0, (i8 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            if (i8 < 8) {
                iArr[i8] = getColor(63, (i8 & 1) != 0 ? 255 : 0, (i8 & 2) != 0 ? 255 : 0, (i8 & 4) == 0 ? 0 : 255);
            } else {
                int i9 = i8 & GattError.GATT_PENDING;
                if (i9 == 0) {
                    iArr[i8] = getColor(255, ((i8 & 1) != 0 ? 85 : 0) + ((i8 & 16) != 0 ? 170 : 0), ((i8 & 2) != 0 ? 85 : 0) + ((i8 & 32) != 0 ? 170 : 0), ((i8 & 4) == 0 ? 0 : 85) + ((i8 & 64) == 0 ? 0 : 170));
                } else if (i9 == 8) {
                    iArr[i8] = getColor(127, ((i8 & 1) != 0 ? 85 : 0) + ((i8 & 16) != 0 ? 170 : 0), ((i8 & 2) != 0 ? 85 : 0) + ((i8 & 32) != 0 ? 170 : 0), ((i8 & 4) == 0 ? 0 : 85) + ((i8 & 64) == 0 ? 0 : 170));
                } else if (i9 == 128) {
                    iArr[i8] = getColor(255, ((i8 & 1) != 0 ? 43 : 0) + 127 + ((i8 & 16) != 0 ? 85 : 0), ((i8 & 2) != 0 ? 43 : 0) + 127 + ((i8 & 32) != 0 ? 85 : 0), ((i8 & 4) == 0 ? 0 : 43) + 127 + ((i8 & 64) == 0 ? 0 : 85));
                } else if (i9 == 136) {
                    iArr[i8] = getColor(255, ((i8 & 1) != 0 ? 43 : 0) + ((i8 & 16) != 0 ? 85 : 0), ((i8 & 2) != 0 ? 43 : 0) + ((i8 & 32) != 0 ? 85 : 0), ((i8 & 4) == 0 ? 0 : 43) + ((i8 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i8, int i9, int i10, int i11) {
        return (i8 << 24) | (i9 << 16) | (i10 << 8) | i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[LOOP:0: B:2:0x0009->B:13:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i8, int i9, @Nullable Paint paint, Canvas canvas) {
        boolean z7;
        int i10;
        int readBits;
        int readBits2;
        int i11 = i8;
        boolean z8 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 != 0) {
                z7 = z8;
            } else {
                if (parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(3) + 3;
                    readBits2 = parsableBitArray.readBits(2);
                } else if (parsableBitArray.readBit()) {
                    z7 = z8;
                    readBits3 = 0;
                } else {
                    int readBits4 = parsableBitArray.readBits(2);
                    if (readBits4 == 0) {
                        readBits3 = 0;
                        z7 = true;
                    } else if (readBits4 == 1) {
                        z7 = z8;
                        readBits3 = 0;
                        i10 = 2;
                        if (i10 != 0 && paint != null) {
                            if (bArr != null) {
                                readBits3 = bArr[readBits3];
                            }
                            paint.setColor(iArr[readBits3]);
                            canvas.drawRect(i11, i9, i11 + i10, i9 + 1, paint);
                        }
                        i11 += i10;
                        if (!z7) {
                            return i11;
                        }
                        z8 = z7;
                    } else if (readBits4 == 2) {
                        readBits = parsableBitArray.readBits(4) + 12;
                        readBits2 = parsableBitArray.readBits(2);
                    } else if (readBits4 != 3) {
                        z7 = z8;
                        readBits3 = 0;
                    } else {
                        readBits = parsableBitArray.readBits(8) + 29;
                        readBits2 = parsableBitArray.readBits(2);
                    }
                    i10 = 0;
                    if (i10 != 0) {
                        if (bArr != null) {
                        }
                        paint.setColor(iArr[readBits3]);
                        canvas.drawRect(i11, i9, i11 + i10, i9 + 1, paint);
                    }
                    i11 += i10;
                    if (!z7) {
                    }
                }
                z7 = z8;
                i10 = readBits;
                readBits3 = readBits2;
                if (i10 != 0) {
                }
                i11 += i10;
                if (!z7) {
                }
            }
            i10 = 1;
            if (i10 != 0) {
            }
            i11 += i10;
            if (!z7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[LOOP:0: B:2:0x0009->B:13:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i8, int i9, @Nullable Paint paint, Canvas canvas) {
        boolean z7;
        int i10;
        int readBits;
        int readBits2;
        int i11 = i8;
        boolean z8 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(4);
            if (readBits3 != 0) {
                z7 = z8;
            } else {
                if (parsableBitArray.readBit()) {
                    if (parsableBitArray.readBit()) {
                        int readBits4 = parsableBitArray.readBits(2);
                        if (readBits4 == 0) {
                            z7 = z8;
                            readBits3 = 0;
                        } else if (readBits4 == 1) {
                            z7 = z8;
                            readBits3 = 0;
                            i10 = 2;
                        } else if (readBits4 == 2) {
                            readBits = parsableBitArray.readBits(4) + 9;
                            readBits2 = parsableBitArray.readBits(4);
                        } else if (readBits4 != 3) {
                            z7 = z8;
                            readBits3 = 0;
                            i10 = 0;
                        } else {
                            readBits = parsableBitArray.readBits(8) + 25;
                            readBits2 = parsableBitArray.readBits(4);
                        }
                    } else {
                        readBits = parsableBitArray.readBits(2) + 4;
                        readBits2 = parsableBitArray.readBits(4);
                    }
                    z7 = z8;
                    i10 = readBits;
                    readBits3 = readBits2;
                } else {
                    int readBits5 = parsableBitArray.readBits(3);
                    if (readBits5 != 0) {
                        z7 = z8;
                        i10 = readBits5 + 2;
                        readBits3 = 0;
                    } else {
                        readBits3 = 0;
                        z7 = true;
                        i10 = 0;
                    }
                }
                if (i10 != 0 && paint != null) {
                    if (bArr != null) {
                        readBits3 = bArr[readBits3];
                    }
                    paint.setColor(iArr[readBits3]);
                    canvas.drawRect(i11, i9, i11 + i10, i9 + 1, paint);
                }
                i11 += i10;
                if (!z7) {
                    return i11;
                }
                z8 = z7;
            }
            i10 = 1;
            if (i10 != 0) {
                if (bArr != null) {
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i11, i9, i11 + i10, i9 + 1, paint);
            }
            i11 += i10;
            if (!z7) {
            }
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i8, int i9, @Nullable Paint paint, Canvas canvas) {
        boolean z7;
        int readBits;
        int i10 = i8;
        boolean z8 = false;
        while (true) {
            int readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z7 = z8;
                readBits = 1;
            } else if (parsableBitArray.readBit()) {
                z7 = z8;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            } else {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z7 = z8;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    readBits2 = 0;
                    z7 = true;
                    readBits = 0;
                }
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i10, i9, i10 + readBits, i9 + 1, paint);
            }
            i10 += readBits;
            if (z7) {
                return i10;
            }
            z8 = z7;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i8, int i9, int i10, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i11 = i9;
        int i12 = i10;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        if (i8 != 3) {
                            if (i8 != 2) {
                                bArr2 = null;
                                i11 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i11, i12, paint, canvas);
                                parsableBitArray.byteAlign();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? defaultMap2To4 : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? defaultMap2To8 : bArr5;
                        }
                        bArr2 = bArr3;
                        i11 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i11, i12, paint, canvas);
                        parsableBitArray.byteAlign();
                    case 17:
                        if (i8 == 3) {
                            bArr4 = bArr6 == null ? defaultMap4To8 : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i11 = paint4BitPixelCodeString(parsableBitArray, iArr, bArr4, i11, i12, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        i11 = paint8BitPixelCodeString(parsableBitArray, iArr, null, i11, i12, paint, canvas);
                        break;
                    default:
                        switch (readBits) {
                            case 32:
                                bArr7 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArr5 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArr6 = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                }
            } else {
                i12 += 2;
                i11 = i9;
            }
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i8, int i9, int i10, @Nullable Paint paint, Canvas canvas) {
        int[] iArr = i8 == 3 ? clutDefinition.clutEntries8Bit : i8 == 2 ? clutDefinition.clutEntries4Bit : clutDefinition.clutEntries2Bit;
        paintPixelDataSubBlock(objectData.topFieldData, iArr, i8, i9, i10, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr, i8, i9, i10 + 1, paint, canvas);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i8) {
        int readBits;
        int i9;
        int readBits2;
        int i10;
        int i11;
        int i12 = 8;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i13 = 2;
        int i14 = i8 - 2;
        int[] generateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i14 > 0) {
            int readBits4 = parsableBitArray.readBits(i12);
            int readBits5 = parsableBitArray.readBits(i12);
            int[] iArr = (readBits5 & 128) != 0 ? generateDefault2BitClutEntries : (readBits5 & 64) != 0 ? generateDefault4BitClutEntries : generateDefault8BitClutEntries;
            if ((readBits5 & 1) != 0) {
                i10 = parsableBitArray.readBits(i12);
                i11 = parsableBitArray.readBits(i12);
                readBits = parsableBitArray.readBits(i12);
                readBits2 = parsableBitArray.readBits(i12);
                i9 = i14 - 6;
            } else {
                int readBits6 = parsableBitArray.readBits(6) << i13;
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i9 = i14 - 4;
                readBits2 = parsableBitArray.readBits(i13) << 6;
                i10 = readBits6;
                i11 = readBits7;
            }
            if (i10 == 0) {
                i11 = 0;
                readBits = 0;
                readBits2 = 255;
            }
            double d8 = i10;
            double d9 = i11 + ErrorCode.ERR_OUTPUT_EXCEPTION;
            double d10 = readBits + ErrorCode.ERR_OUTPUT_EXCEPTION;
            iArr[readBits4] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) (d8 + (1.402d * d9)), 0, 255), Util.constrainValue((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), Util.constrainValue((int) (d8 + (d10 * 1.772d)), 0, 255));
            i14 = i9;
            readBits3 = readBits3;
            i12 = 8;
            i13 = 2;
        }
        return new ClutDefinition(readBits3, generateDefault2BitClutEntries, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i8;
        int i9;
        int i10;
        int i11;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i9 = parsableBitArray.readBits(16);
            i8 = readBits4;
            i11 = readBits5;
            i10 = readBits3;
        } else {
            i8 = readBits;
            i9 = readBits2;
            i10 = 0;
            i11 = 0;
        }
        return new DisplayDefinition(readBits, readBits2, i10, i8, i11, i9);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int readBits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int readBits2 = parsableBitArray.readBits(2);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (readBits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                parsableBitArray.readBytes(bArr2, 0, readBits3);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                parsableBitArray.readBytes(bArr, 0, readBits4);
                return new ObjectData(readBits, readBit, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(readBits, readBit, bArr2, bArr);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i8) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i9 = i8 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i9 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i9 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i8) {
        int i9;
        int i10;
        int readBits = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i11 = 16;
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int readBits4 = parsableBitArray.readBits(3);
        int readBits5 = parsableBitArray.readBits(3);
        int i12 = 2;
        parsableBitArray.skipBits(2);
        int readBits6 = parsableBitArray.readBits(8);
        int readBits7 = parsableBitArray.readBits(8);
        int readBits8 = parsableBitArray.readBits(4);
        int readBits9 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i13 = i8 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int readBits10 = parsableBitArray.readBits(i11);
            int readBits11 = parsableBitArray.readBits(i12);
            int readBits12 = parsableBitArray.readBits(i12);
            int readBits13 = parsableBitArray.readBits(12);
            int i14 = readBits9;
            parsableBitArray.skipBits(4);
            int readBits14 = parsableBitArray.readBits(12);
            int i15 = i13 - 6;
            if (readBits11 != 1 && readBits11 != 2) {
                i13 = i15;
                i10 = 0;
                i9 = 0;
                sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i10, i9));
                readBits9 = i14;
                i12 = 2;
                i11 = 16;
            }
            i13 -= 8;
            i10 = parsableBitArray.readBits(8);
            i9 = parsableBitArray.readBits(8);
            sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i10, i9));
            readBits9 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new RegionComposition(readBits, readBit, readBits2, readBits3, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        RegionComposition regionComposition;
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + readBits3;
        if (readBits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (readBits) {
            case 16:
                if (readBits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition parsePageComposition = parsePageComposition(parsableBitArray, readBits3);
                    if (parsePageComposition.state == 0) {
                        if (pageComposition != null && pageComposition.version != parsePageComposition.version) {
                            subtitleService.pageComposition = parsePageComposition;
                            break;
                        }
                    } else {
                        subtitleService.pageComposition = parsePageComposition;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition2 = subtitleService.pageComposition;
                if (readBits2 == subtitleService.subtitlePageId && pageComposition2 != null) {
                    RegionComposition parseRegionComposition = parseRegionComposition(parsableBitArray, readBits3);
                    if (pageComposition2.state == 0 && (regionComposition = subtitleService.regions.get(parseRegionComposition.id)) != null) {
                        parseRegionComposition.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(parseRegionComposition.id, parseRegionComposition);
                    break;
                }
                break;
            case 18:
                if (readBits2 != subtitleService.subtitlePageId) {
                    if (readBits2 == subtitleService.ancillaryPageId) {
                        ClutDefinition parseClutDefinition = parseClutDefinition(parsableBitArray, readBits3);
                        subtitleService.ancillaryCluts.put(parseClutDefinition.id, parseClutDefinition);
                        break;
                    }
                } else {
                    ClutDefinition parseClutDefinition2 = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.cluts.put(parseClutDefinition2.id, parseClutDefinition2);
                    break;
                }
                break;
            case 19:
                if (readBits2 != subtitleService.subtitlePageId) {
                    if (readBits2 == subtitleService.ancillaryPageId) {
                        ObjectData parseObjectData = parseObjectData(parsableBitArray);
                        subtitleService.ancillaryObjects.put(parseObjectData.id, parseObjectData);
                        break;
                    }
                } else {
                    ObjectData parseObjectData2 = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(parseObjectData2.id, parseObjectData2);
                    break;
                }
                break;
            case 20:
                if (readBits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    public List<Cue> decode(byte[] bArr, int i8) {
        int i9;
        SparseArray<RegionObject> sparseArray;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i8);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        SubtitleService subtitleService = this.subtitleService;
        PageComposition pageComposition = subtitleService.pageComposition;
        if (pageComposition == null) {
            return Collections.emptyList();
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = createBitmap;
            this.canvas.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = pageComposition.regions;
        for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
            this.canvas.save();
            PageRegion valueAt = sparseArray2.valueAt(i10);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i10));
            int i11 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i12 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.canvas.clipRect(i11, i12, Math.min(regionComposition.width + i11, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i12, displayDefinition.verticalPositionMaximum));
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i13 = 0;
            while (i13 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i13);
                RegionObject valueAt2 = sparseArray3.valueAt(i13);
                ObjectData objectData = this.subtitleService.objects.get(keyAt);
                ObjectData objectData2 = objectData == null ? this.subtitleService.ancillaryObjects.get(keyAt) : objectData;
                if (objectData2 != null) {
                    i9 = i13;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(objectData2, clutDefinition, regionComposition.depth, valueAt2.horizontalPosition + i11, i12 + valueAt2.verticalPosition, objectData2.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                } else {
                    i9 = i13;
                    sparseArray = sparseArray3;
                }
                i13 = i9 + 1;
                sparseArray3 = sparseArray;
            }
            if (regionComposition.fillFlag) {
                int i14 = regionComposition.depth;
                this.fillRegionPaint.setColor(i14 == 3 ? clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit] : i14 == 2 ? clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit] : clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit]);
                this.canvas.drawRect(i11, i12, regionComposition.width + i11, regionComposition.height + i12, this.fillRegionPaint);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.bitmap, i11, i12, regionComposition.width, regionComposition.height)).setPosition(i11 / displayDefinition.width).setPositionAnchor(0).setLine(i12 / displayDefinition.height, 0).setLineAnchor(0).setSize(regionComposition.width / displayDefinition.width).setBitmapHeight(regionComposition.height / displayDefinition.height).build());
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.canvas.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void reset() {
        this.subtitleService.reset();
    }
}
