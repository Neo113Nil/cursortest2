package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;

@Deprecated
/* loaded from: classes3.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i8, boolean z7) {
        if ((i8 >>> 8) == 3368816) {
            return true;
        }
        if (i8 == 1751476579 && z7) {
            return true;
        }
        for (int i9 : COMPATIBLE_BRANDS) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, true, false);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z7, boolean z8) {
        boolean z9;
        boolean z10;
        int i8;
        long length = extractorInput.getLength();
        long j8 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j9 = -1;
        int i9 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i9 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j8 = length;
        }
        int i10 = (int) j8;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < i10) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), z11 ? 1 : 0, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                parsableByteArray.setLimit(16);
                readUnsignedInt = parsableByteArray.readLong();
                i8 = 16;
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j9) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                i8 = 8;
            }
            long j10 = i8;
            if (readUnsignedInt < j10) {
                return z11;
            }
            i11 += i8;
            if (readInt == 1836019574) {
                i10 += (int) readUnsignedInt;
                if (i9 != 0 && i10 > length) {
                    i10 = (int) length;
                }
                j9 = -1;
            } else {
                if (readInt == 1836019558 || readInt == 1836475768) {
                    z9 = true;
                    z10 = true;
                    break;
                }
                int i12 = i9;
                if ((i11 + readUnsignedInt) - j10 >= i10) {
                    break;
                }
                int i13 = (int) (readUnsignedInt - j10);
                i11 += i13;
                if (readInt == 1718909296) {
                    if (i13 < 8) {
                        return false;
                    }
                    parsableByteArray.reset(i13);
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i13);
                    int i14 = i13 / 4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            break;
                        }
                        if (i15 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt(), z8)) {
                            z12 = true;
                            break;
                        }
                        i15++;
                    }
                    if (!z12) {
                        return false;
                    }
                } else if (i13 != 0) {
                    extractorInput.advancePeekPosition(i13);
                }
                i9 = i12;
                j9 = -1;
                z11 = false;
            }
        }
        z9 = true;
        z10 = false;
        if (z12 && z7 == z10) {
            return z9;
        }
        return false;
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, false, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput, boolean z7) {
        return sniffInternal(extractorInput, false, z7);
    }
}
