package p000createpolar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePushNotificationDeltaAurora2165 implements PolarVoyageRotateDrawablePixelSparkStorm9570, PolarVoyageFlowMaxTitanAlpha3096, PolarVoyageModelInputOutputInfernoBeta7978 {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public Object PolarVoyageCameraPixelBlaze2629;
    public Object PolarVoyageDrawableDeltaHyperion5742;
    public Object PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;
    public Object PolarVoyageViewRogueMaster4778;
    public static final PolarVoyageColorStateListCyberPhoenixHero2775 PolarVoyageSnackbarGammaEclipse2140 = new PolarVoyageColorStateListCyberPhoenixHero2775(0);
    public static final byte[] PolarVoyageContentProviderHyperSpark3838 = {0, 7, 8, 15};
    public static final byte[] PolarVoyageRemoteModelManagerOlympianCelestial9141 = {0, 119, -120, -1};
    public static final byte[] PolarVoyageNavigationViewHyperHyperHyperion1793 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public static int[] PolarVoyageBottomSheetOmegaNeo1907() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = PolarVoyageCameraPixelBlaze2629(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = PolarVoyageCameraPixelBlaze2629(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int PolarVoyageCameraPixelBlaze2629(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static PolarVoyageDigitalInkRecognitionCosmosTitanium5488 PolarVoyageContentProviderHyperSpark3838(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087) {
        byte[] bArr;
        int PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(4);
        int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
        boolean PolarVoyageDiffUtilTurboStrike5735 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735();
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(1);
        byte[] bArr2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (PolarVoyageTextInputEditTextNebulaHero66512 == 1) {
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8) * 16);
        } else if (PolarVoyageTextInputEditTextNebulaHero66512 == 0) {
            int PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
            int PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
            if (PolarVoyageTextInputEditTextNebulaHero66513 > 0) {
                bArr2 = new byte[PolarVoyageTextInputEditTextNebulaHero66513];
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageRotateAnimationCyberCelestialDelta4768(bArr2, PolarVoyageTextInputEditTextNebulaHero66513);
            }
            if (PolarVoyageTextInputEditTextNebulaHero66514 > 0) {
                bArr = new byte[PolarVoyageTextInputEditTextNebulaHero66514];
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageRotateAnimationCyberCelestialDelta4768(bArr, PolarVoyageTextInputEditTextNebulaHero66514);
                return new PolarVoyageDigitalInkRecognitionCosmosTitanium5488(PolarVoyageTextInputEditTextNebulaHero6651, PolarVoyageDiffUtilTurboStrike5735, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new PolarVoyageDigitalInkRecognitionCosmosTitanium5488(PolarVoyageTextInputEditTextNebulaHero6651, PolarVoyageDiffUtilTurboStrike5735, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageDrawableDeltaHyperion5742(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        char c;
        char c2;
        boolean z;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        boolean z2;
        int i7;
        int PolarVoyageTextInputEditTextNebulaHero6651;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int PolarVoyageTextInputEditTextNebulaHero66512;
        int i12;
        Paint paint2 = paint;
        PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087 = new PolarVoyageAuthVortexNebulaNeo9087(bArr, bArr.length);
        int i13 = i2;
        int i14 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageMotionLayoutTransitionHeroVision4068() != 0) {
            int i15 = 8;
            int PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
            if (PolarVoyageTextInputEditTextNebulaHero66513 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (PolarVoyageTextInputEditTextNebulaHero66513) {
                    case 16:
                        byte[] bArr6 = i == 3 ? bArr3 == null ? PolarVoyageRemoteModelManagerOlympianCelestial9141 : bArr3 : i == 2 ? bArr5 == null ? PolarVoyageContentProviderHyperSpark3838 : bArr5 : null;
                        boolean z4 = false;
                        while (true) {
                            int PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                            if (PolarVoyageTextInputEditTextNebulaHero66514 != 0) {
                                z = z4;
                                i4 = PolarVoyageTextInputEditTextNebulaHero66514;
                                i5 = 1;
                            } else if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                                int PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(3) + 3;
                                z = z4;
                                i4 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                                i5 = PolarVoyageTextInputEditTextNebulaHero66515;
                            } else {
                                if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                                    z = z4;
                                    i5 = 1;
                                    c = '\b';
                                    c2 = 4;
                                } else {
                                    int PolarVoyageTextInputEditTextNebulaHero66516 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                                    if (PolarVoyageTextInputEditTextNebulaHero66516 == 0) {
                                        c = '\b';
                                        c2 = 4;
                                        z = true;
                                    } else if (PolarVoyageTextInputEditTextNebulaHero66516 == 1) {
                                        c = '\b';
                                        c2 = 4;
                                        z = z4;
                                        i5 = 2;
                                    } else if (PolarVoyageTextInputEditTextNebulaHero66516 == 2) {
                                        c = '\b';
                                        c2 = 4;
                                        i5 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4) + 12;
                                        i4 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                                        z = z4;
                                        if (i5 != 0) {
                                        }
                                        i6 = i13;
                                        i13 = i6 + i5;
                                        if (z) {
                                        }
                                    } else if (PolarVoyageTextInputEditTextNebulaHero66516 != 3) {
                                        z = z4;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        c = '\b';
                                        int PolarVoyageTextInputEditTextNebulaHero66517 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8) + 29;
                                        i4 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                                        z = z4;
                                        i5 = PolarVoyageTextInputEditTextNebulaHero66517;
                                        c2 = 4;
                                        if (i5 != 0 || paint2 == null) {
                                            i6 = i13;
                                        } else {
                                            if (bArr6 != 0) {
                                                i4 = bArr6[i4];
                                            }
                                            paint2.setColor(iArr[i4]);
                                            i6 = i13;
                                            canvas.drawRect(i13, i14, i13 + i5, i14 + 1, paint2);
                                        }
                                        i13 = i6 + i5;
                                        if (z) {
                                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageKotlinBetaPulseBeta3653();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z4 = z;
                                        }
                                    }
                                    i4 = 0;
                                    i5 = 0;
                                    if (i5 != 0) {
                                    }
                                    i6 = i13;
                                    i13 = i6 + i5;
                                    if (z) {
                                    }
                                }
                                i4 = 0;
                                if (i5 != 0) {
                                }
                                i6 = i13;
                                i13 = i6 + i5;
                                if (z) {
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (i5 != 0) {
                            }
                            i6 = i13;
                            i13 = i6 + i5;
                            if (z) {
                            }
                        }
                    case 17:
                        if (i == 3) {
                            bArr2 = bArr4 == null ? PolarVoyageNavigationViewHyperHyperHyperion1793 : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z5 = false;
                        while (true) {
                            int PolarVoyageTextInputEditTextNebulaHero66518 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i18);
                            if (PolarVoyageTextInputEditTextNebulaHero66518 != 0) {
                                z2 = z5;
                                i8 = PolarVoyageTextInputEditTextNebulaHero66518;
                                i7 = 1;
                            } else if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                                if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                                    int PolarVoyageTextInputEditTextNebulaHero66519 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i17);
                                    if (PolarVoyageTextInputEditTextNebulaHero66519 == 0) {
                                        z2 = z5;
                                        i7 = 1;
                                    } else if (PolarVoyageTextInputEditTextNebulaHero66519 != 1) {
                                        if (PolarVoyageTextInputEditTextNebulaHero66519 == i17) {
                                            i7 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i18) + 9;
                                            PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i18);
                                        } else if (PolarVoyageTextInputEditTextNebulaHero66519 != i16) {
                                            z2 = z5;
                                            i7 = 0;
                                        } else {
                                            i7 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i15) + 25;
                                            PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i18);
                                        }
                                        i8 = PolarVoyageTextInputEditTextNebulaHero6651;
                                    } else {
                                        z2 = z5;
                                        i7 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i7 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i17) + 4;
                                    i8 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i18);
                                }
                                z2 = z5;
                            } else {
                                int PolarVoyageTextInputEditTextNebulaHero665110 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i16);
                                if (PolarVoyageTextInputEditTextNebulaHero665110 != 0) {
                                    i7 = PolarVoyageTextInputEditTextNebulaHero665110 + 2;
                                    z2 = z5;
                                    i8 = 0;
                                } else {
                                    z2 = true;
                                    i7 = 0;
                                    i8 = 0;
                                }
                            }
                            if (i7 == 0 || paint2 == null) {
                                i9 = i13;
                                i10 = i16;
                                i11 = i17;
                            } else {
                                if (bArr2 != 0) {
                                    i8 = bArr2[i8];
                                }
                                paint2.setColor(iArr[i8]);
                                i10 = i16;
                                i11 = 2;
                                i9 = i13;
                                canvas.drawRect(i13, i14, i13 + i7, i14 + 1, paint2);
                            }
                            i13 = i9 + i7;
                            if (z2) {
                                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageKotlinBetaPulseBeta3653();
                                break;
                            } else {
                                z5 = z2;
                                i16 = i10;
                                i17 = i11;
                                i18 = 4;
                                i15 = 8;
                            }
                        }
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int PolarVoyageTextInputEditTextNebulaHero665111 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                            if (PolarVoyageTextInputEditTextNebulaHero665111 != 0) {
                                z3 = z6;
                                PolarVoyageTextInputEditTextNebulaHero66512 = 1;
                            } else if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735()) {
                                z3 = z6;
                                PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(7);
                                PolarVoyageTextInputEditTextNebulaHero665111 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                            } else {
                                int PolarVoyageTextInputEditTextNebulaHero665112 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(7);
                                if (PolarVoyageTextInputEditTextNebulaHero665112 != 0) {
                                    z3 = z6;
                                    PolarVoyageTextInputEditTextNebulaHero66512 = PolarVoyageTextInputEditTextNebulaHero665112;
                                    PolarVoyageTextInputEditTextNebulaHero665111 = 0;
                                } else {
                                    z3 = true;
                                    PolarVoyageTextInputEditTextNebulaHero665111 = 0;
                                    PolarVoyageTextInputEditTextNebulaHero66512 = 0;
                                }
                            }
                            if (PolarVoyageTextInputEditTextNebulaHero66512 == 0 || paint2 == null) {
                                i12 = i13;
                            } else {
                                paint2.setColor(iArr[PolarVoyageTextInputEditTextNebulaHero665111]);
                                i12 = i13;
                                canvas.drawRect(i13, i14, i13 + PolarVoyageTextInputEditTextNebulaHero66512, i14 + 1, paint2);
                            }
                            i13 = i12 + PolarVoyageTextInputEditTextNebulaHero66512;
                            if (z3) {
                                break;
                            } else {
                                z6 = z3;
                            }
                        }
                        break;
                    default:
                        switch (PolarVoyageTextInputEditTextNebulaHero66513) {
                            case 32:
                                bArr5 = PolarVoyageZipVortexCelestial6185(4, 4, polarVoyageAuthVortexNebulaNeo9087);
                                break;
                            case 33:
                                bArr3 = PolarVoyageZipVortexCelestial6185(4, 8, polarVoyageAuthVortexNebulaNeo9087);
                                break;
                            case 34:
                                bArr4 = PolarVoyageZipVortexCelestial6185(16, 8, polarVoyageAuthVortexNebulaNeo9087);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i2;
            }
            paint2 = paint;
        }
    }

    public static PolarVoyageDiffUtilDragonCelestialDragon6652 PolarVoyageSnackbarGammaEclipse2140(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087, int i) {
        int PolarVoyageTextInputEditTextNebulaHero6651;
        int i2;
        int PolarVoyageTextInputEditTextNebulaHero66512;
        int i3;
        int i4;
        int i5 = 8;
        int PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageBottomSheetOmegaNeo1907();
        int[] PolarVoyageViewRogueMaster4778 = PolarVoyageViewRogueMaster4778();
        while (i7 > 0) {
            int PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i5);
            int PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i5);
            int[] iArr2 = (PolarVoyageTextInputEditTextNebulaHero66515 & 128) != 0 ? iArr : (PolarVoyageTextInputEditTextNebulaHero66515 & 64) != 0 ? PolarVoyageBottomSheetOmegaNeo1907 : PolarVoyageViewRogueMaster4778;
            if ((PolarVoyageTextInputEditTextNebulaHero66515 & 1) != 0) {
                i3 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i5);
                i4 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i5);
                PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i5);
                PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i5);
                i2 = i7 - 6;
            } else {
                int PolarVoyageTextInputEditTextNebulaHero66516 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(6) << i6;
                int PolarVoyageTextInputEditTextNebulaHero66517 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4) << 4;
                PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4) << 4;
                i2 = i7 - 4;
                PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i6) << 6;
                i3 = PolarVoyageTextInputEditTextNebulaHero66516;
                i4 = PolarVoyageTextInputEditTextNebulaHero66517;
            }
            if (i3 == 0) {
                i4 = i8;
                PolarVoyageTextInputEditTextNebulaHero6651 = i4;
                PolarVoyageTextInputEditTextNebulaHero66512 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = PolarVoyageTextInputEditTextNebulaHero6651 - 128;
            iArr2[PolarVoyageTextInputEditTextNebulaHero66514] = PolarVoyageCameraPixelBlaze2629((byte) (255 - (PolarVoyageTextInputEditTextNebulaHero66512 & 255)), PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651((int) ((1.402d * d2) + d), 0, 255), PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651((int) ((d3 * 1.772d) + d), 0, 255));
            i7 = i2;
            i8 = 0;
            PolarVoyageTextInputEditTextNebulaHero66513 = PolarVoyageTextInputEditTextNebulaHero66513;
            PolarVoyageViewRogueMaster4778 = PolarVoyageViewRogueMaster4778;
            i5 = 8;
            i6 = 2;
        }
        return new PolarVoyageDiffUtilDragonCelestialDragon6652(PolarVoyageTextInputEditTextNebulaHero66513, iArr, PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageViewRogueMaster4778);
    }

    public static int[] PolarVoyageViewRogueMaster4778() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = PolarVoyageCameraPixelBlaze2629(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = PolarVoyageCameraPixelBlaze2629(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = PolarVoyageCameraPixelBlaze2629(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = PolarVoyageCameraPixelBlaze2629(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = PolarVoyageCameraPixelBlaze2629(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static byte[] PolarVoyageZipVortexCelestial6185(int i, int i2, PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i2);
        }
        return bArr;
    }

    public ArrayList PolarVoyageAnimatorSetSparkUltraMax8233() {
        HashMap hashMap = (HashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.PolarVoyageItemDecorationUltraDeltaEpic7485).entrySet()) {
            PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo6617 = (PolarVoyageTextViewLegendTurbo6617) entry.getKey();
            if (polarVoyageTextViewLegendTurbo6617.PolarVoyageBitmapVisionAuroraPixel4705 != 0) {
                PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350 = (PolarVoyageRemoteConfigEliteSpectra7350) entry.getValue();
                for (PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297 : polarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    if (!hashMap2.containsKey(polarVoyageRotateAnimationBlazePixelTitan5297)) {
                        hashMap2.put(polarVoyageRotateAnimationBlazePixelTitan5297, new HashSet());
                    }
                    ((Set) hashMap2.get(polarVoyageRotateAnimationBlazePixelTitan5297)).add(polarVoyageRemoteConfigEliteSpectra7350);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                PolarVoyageFragmentLegendRogue2777 polarVoyageFragmentLegendRogue2777 = (PolarVoyageFragmentLegendRogue2777) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new PolarVoyageMediaPlayerNebulaTurboLegend3509(12, polarVoyageFragmentLegendRogue2777, (PolarVoyageRemoteConfigEliteSpectra7350) it.next()));
                }
            } else {
                PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan52972 = (PolarVoyageRotateAnimationBlazePixelTitan5297) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                PolarVoyageFragmentLegendRogue2777 polarVoyageFragmentLegendRogue27772 = new PolarVoyageFragmentLegendRogue2777();
                polarVoyageFragmentLegendRogue27772.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                polarVoyageFragmentLegendRogue27772.PolarVoyageZipVortexCelestial6185 = Collections.newSetFromMap(new ConcurrentHashMap());
                polarVoyageFragmentLegendRogue27772.PolarVoyageZipVortexCelestial6185.addAll(set);
                hashMap.put(polarVoyageRotateAnimationBlazePixelTitan52972, polarVoyageFragmentLegendRogue27772);
            }
        }
        return arrayList;
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public synchronized PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297) {
        PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageRotateAnimationBlazePixelTitan5297, "Null interface requested.");
        return (PolarVoyageRemoteConfigEliteSpectra7350) ((HashMap) this.PolarVoyageStrictModeLegendEpic1532).get(polarVoyageRotateAnimationBlazePixelTitan5297);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0251, code lost:
    
        if ((r3.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1) == ((android.graphics.Bitmap) r43.PolarVoyageDrawableDeltaHyperion5742).getHeight()) goto L83;
     */
    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        int i3;
        PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846;
        int i4;
        int i5;
        PolarVoyageCameraSelectorMegaHyperion6530 polarVoyageCameraSelectorMegaHyperion6530;
        ArrayList arrayList;
        char c;
        char c2;
        int i6;
        char c3;
        int i7;
        PolarVoyageGyroscopeEclipseTitanium1056 polarVoyageGyroscopeEclipseTitanium1056;
        PolarVoyageJavaBlazePrimeForce1867 polarVoyageJavaBlazePrimeForce1867;
        int i8;
        int i9;
        int i10;
        int i11;
        PolarVoyageJavaBlazePrimeForce1867 polarVoyageJavaBlazePrimeForce18672;
        int i12;
        int i13;
        int i14;
        int i15;
        PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087 = new PolarVoyageAuthVortexNebulaNeo9087(bArr, i + i2);
        polarVoyageAuthVortexNebulaNeo9087.PolarVoyageCameraPixelBlaze2629(i);
        Paint paint = (Paint) this.PolarVoyageStrictModeLegendEpic1532;
        Canvas canvas = (Canvas) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageGyroscopeEclipseTitanium1056 polarVoyageGyroscopeEclipseTitanium10562 = (PolarVoyageGyroscopeEclipseTitanium1056) this.PolarVoyageCameraPixelBlaze2629;
        while (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageMotionLayoutTransitionHeroVision4068() >= 48 && polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8) == 15) {
            int PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
            int i16 = 16;
            int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
            int PolarVoyageTextInputEditTextNebulaHero66513 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
            int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageBarcodeScannerInfernoSolarSpark7767() + PolarVoyageTextInputEditTextNebulaHero66513;
            if (PolarVoyageTextInputEditTextNebulaHero66513 * 8 > polarVoyageAuthVortexNebulaNeo9087.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("DvbParser", "Data field length exceeds limit");
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(polarVoyageAuthVortexNebulaNeo9087.PolarVoyageMotionLayoutTransitionHeroVision4068());
            } else {
                int i17 = 4;
                switch (PolarVoyageTextInputEditTextNebulaHero6651) {
                    case 16:
                        if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageZipVortexCelestial6185) {
                            PolarVoyageMotionSceneShadowBlazeVortex9875 polarVoyageMotionSceneShadowBlazeVortex9875 = polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageStrictModeLegendEpic1532;
                            int i18 = 8;
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                            int PolarVoyageTextInputEditTextNebulaHero66514 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4);
                            int PolarVoyageTextInputEditTextNebulaHero66515 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
                            int i19 = PolarVoyageTextInputEditTextNebulaHero66513 - 2;
                            SparseArray sparseArray = new SparseArray();
                            while (i19 > 0) {
                                int PolarVoyageTextInputEditTextNebulaHero66516 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i18);
                                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(i18);
                                i19 -= 6;
                                sparseArray.put(PolarVoyageTextInputEditTextNebulaHero66516, new PolarVoyageViewPager2CelestialHeroInferno8118(polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16), polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16)));
                                i18 = 8;
                            }
                            PolarVoyageMotionSceneShadowBlazeVortex9875 polarVoyageMotionSceneShadowBlazeVortex98752 = new PolarVoyageMotionSceneShadowBlazeVortex9875();
                            polarVoyageMotionSceneShadowBlazeVortex98752.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageTextInputEditTextNebulaHero66514;
                            polarVoyageMotionSceneShadowBlazeVortex98752.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTextInputEditTextNebulaHero66515;
                            polarVoyageMotionSceneShadowBlazeVortex98752.PolarVoyageRotateAnimationCyberCelestialDelta4768 = sparseArray;
                            if (PolarVoyageTextInputEditTextNebulaHero66515 != 0) {
                                polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMotionSceneShadowBlazeVortex98752;
                                polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageKotlinBetaPulseBeta3653.clear();
                                polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageBarcodeScannerInfernoSolarSpark7767.clear();
                                polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageBitmapVisionAuroraPixel4705.clear();
                                break;
                            } else if (polarVoyageMotionSceneShadowBlazeVortex9875 != null && polarVoyageMotionSceneShadowBlazeVortex9875.PolarVoyageItemDecorationUltraDeltaEpic7485 != PolarVoyageTextInputEditTextNebulaHero66514) {
                                polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMotionSceneShadowBlazeVortex98752;
                                break;
                            }
                        }
                        break;
                    case 17:
                        PolarVoyageMotionSceneShadowBlazeVortex9875 polarVoyageMotionSceneShadowBlazeVortex98753 = polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageStrictModeLegendEpic1532;
                        SparseArray sparseArray2 = polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageKotlinBetaPulseBeta3653;
                        if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageZipVortexCelestial6185 && polarVoyageMotionSceneShadowBlazeVortex98753 != null) {
                            int PolarVoyageTextInputEditTextNebulaHero66517 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(4);
                            boolean PolarVoyageDiffUtilTurboStrike5735 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735();
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(3);
                            int PolarVoyageTextInputEditTextNebulaHero66518 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                            int PolarVoyageTextInputEditTextNebulaHero66519 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(3);
                            int PolarVoyageTextInputEditTextNebulaHero665110 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(3);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
                            int PolarVoyageTextInputEditTextNebulaHero665111 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                            int PolarVoyageTextInputEditTextNebulaHero665112 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                            int PolarVoyageTextInputEditTextNebulaHero665113 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4);
                            int PolarVoyageTextInputEditTextNebulaHero665114 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(2);
                            int i20 = PolarVoyageTextInputEditTextNebulaHero66513 - 10;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i20 > 0) {
                                int PolarVoyageTextInputEditTextNebulaHero665115 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(i16);
                                int PolarVoyageTextInputEditTextNebulaHero665116 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(2);
                                int PolarVoyageTextInputEditTextNebulaHero665117 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(12);
                                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(i17);
                                int PolarVoyageTextInputEditTextNebulaHero665118 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(12);
                                int i21 = i20 - 6;
                                if (PolarVoyageTextInputEditTextNebulaHero665116 == 1 || PolarVoyageTextInputEditTextNebulaHero665116 == 2) {
                                    polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                                    polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(8);
                                    i20 -= 8;
                                } else {
                                    i20 = i21;
                                }
                                sparseArray3.put(PolarVoyageTextInputEditTextNebulaHero665115, new PolarVoyageRealtimeDatabaseEclipseNovaX1768(PolarVoyageTextInputEditTextNebulaHero665117, PolarVoyageTextInputEditTextNebulaHero665118));
                                i17 = 4;
                                i16 = 16;
                            }
                            PolarVoyageJavaBlazePrimeForce1867 polarVoyageJavaBlazePrimeForce18673 = new PolarVoyageJavaBlazePrimeForce1867(PolarVoyageTextInputEditTextNebulaHero66517, PolarVoyageDiffUtilTurboStrike5735, PolarVoyageTextInputEditTextNebulaHero66518, PolarVoyageTextInputEditTextNebulaHero66519, PolarVoyageTextInputEditTextNebulaHero665110, PolarVoyageTextInputEditTextNebulaHero665111, PolarVoyageTextInputEditTextNebulaHero665112, PolarVoyageTextInputEditTextNebulaHero665113, PolarVoyageTextInputEditTextNebulaHero665114, sparseArray3);
                            if (polarVoyageMotionSceneShadowBlazeVortex98753.PolarVoyageStrictModeLegendEpic1532 == 0 && (polarVoyageJavaBlazePrimeForce18672 = (PolarVoyageJavaBlazePrimeForce1867) sparseArray2.get(PolarVoyageTextInputEditTextNebulaHero66517)) != null) {
                                SparseArray sparseArray4 = polarVoyageJavaBlazePrimeForce18672.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                for (int i22 = 0; i22 < sparseArray4.size(); i22++) {
                                    polarVoyageJavaBlazePrimeForce18673.PolarVoyageRotateAnimationCyberCelestialDelta4768.put(sparseArray4.keyAt(i22), (PolarVoyageRealtimeDatabaseEclipseNovaX1768) sparseArray4.valueAt(i22));
                                }
                            }
                            sparseArray2.put(polarVoyageJavaBlazePrimeForce18673.PolarVoyageZipVortexCelestial6185, polarVoyageJavaBlazePrimeForce18673);
                            break;
                        }
                        break;
                    case 18:
                        if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageZipVortexCelestial6185) {
                            PolarVoyageDiffUtilDragonCelestialDragon6652 PolarVoyageSnackbarGammaEclipse21402 = PolarVoyageSnackbarGammaEclipse2140(polarVoyageAuthVortexNebulaNeo9087, PolarVoyageTextInputEditTextNebulaHero66513);
                            polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageBarcodeScannerInfernoSolarSpark7767.put(PolarVoyageSnackbarGammaEclipse21402.PolarVoyageZipVortexCelestial6185, PolarVoyageSnackbarGammaEclipse21402);
                            break;
                        } else if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                            PolarVoyageDiffUtilDragonCelestialDragon6652 PolarVoyageSnackbarGammaEclipse21403 = PolarVoyageSnackbarGammaEclipse2140(polarVoyageAuthVortexNebulaNeo9087, PolarVoyageTextInputEditTextNebulaHero66513);
                            polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageDiffUtilTurboStrike5735.put(PolarVoyageSnackbarGammaEclipse21403.PolarVoyageZipVortexCelestial6185, PolarVoyageSnackbarGammaEclipse21403);
                            break;
                        }
                        break;
                    case 19:
                        if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageZipVortexCelestial6185) {
                            PolarVoyageDigitalInkRecognitionCosmosTitanium5488 PolarVoyageContentProviderHyperSpark38382 = PolarVoyageContentProviderHyperSpark3838(polarVoyageAuthVortexNebulaNeo9087);
                            polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageBitmapVisionAuroraPixel4705.put(PolarVoyageContentProviderHyperSpark38382.PolarVoyageZipVortexCelestial6185, PolarVoyageContentProviderHyperSpark38382);
                            break;
                        } else if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                            PolarVoyageDigitalInkRecognitionCosmosTitanium5488 PolarVoyageContentProviderHyperSpark38383 = PolarVoyageContentProviderHyperSpark3838(polarVoyageAuthVortexNebulaNeo9087);
                            polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageTextInputEditTextNebulaHero6651.put(PolarVoyageContentProviderHyperSpark38383.PolarVoyageZipVortexCelestial6185, PolarVoyageContentProviderHyperSpark38383);
                            break;
                        }
                        break;
                    case 20:
                        if (PolarVoyageTextInputEditTextNebulaHero66512 == polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageZipVortexCelestial6185) {
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(4);
                            boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageDiffUtilTurboStrike5735();
                            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(3);
                            int PolarVoyageTextInputEditTextNebulaHero665119 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                            int PolarVoyageTextInputEditTextNebulaHero665120 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                            if (PolarVoyageDiffUtilTurboStrike57352) {
                                int PolarVoyageTextInputEditTextNebulaHero665121 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                                i12 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                                i15 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                                i13 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                                i14 = PolarVoyageTextInputEditTextNebulaHero665121;
                            } else {
                                i12 = PolarVoyageTextInputEditTextNebulaHero665119;
                                i13 = PolarVoyageTextInputEditTextNebulaHero665120;
                                i14 = 0;
                                i15 = 0;
                            }
                            polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageCameraSelectorMegaHyperion6530(PolarVoyageTextInputEditTextNebulaHero665119, PolarVoyageTextInputEditTextNebulaHero665120, i14, i12, i15, i13);
                            break;
                        }
                        break;
                }
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageContentProviderHyperSpark3838(PolarVoyageBarcodeScannerInfernoSolarSpark7767 - polarVoyageAuthVortexNebulaNeo9087.PolarVoyageBarcodeScannerInfernoSolarSpark7767());
            }
        }
        PolarVoyageMotionSceneShadowBlazeVortex9875 polarVoyageMotionSceneShadowBlazeVortex98754 = polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageMotionSceneShadowBlazeVortex98754 == null) {
            PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageConstraintSetCloneOlympianMegaVision9846 = new PolarVoyageConstraintSetCloneOlympianMegaVision9846(-9223372036854775807L, -9223372036854775807L, PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778);
        } else {
            PolarVoyageCameraSelectorMegaHyperion6530 polarVoyageCameraSelectorMegaHyperion65302 = polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (polarVoyageCameraSelectorMegaHyperion65302 == null) {
                polarVoyageCameraSelectorMegaHyperion65302 = (PolarVoyageCameraSelectorMegaHyperion6530) this.PolarVoyageBottomSheetOmegaNeo1907;
            }
            Bitmap bitmap = (Bitmap) this.PolarVoyageDrawableDeltaHyperion5742;
            if (bitmap != null) {
                i3 = 1;
                if (polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageZipVortexCelestial6185 + 1 == bitmap.getWidth()) {
                }
            } else {
                i3 = 1;
            }
            Bitmap createBitmap = Bitmap.createBitmap(polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageZipVortexCelestial6185 + i3, polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageMotionLayoutTransitionHeroVision4068 + i3, Bitmap.Config.ARGB_8888);
            this.PolarVoyageDrawableDeltaHyperion5742 = createBitmap;
            canvas.setBitmap(createBitmap);
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) polarVoyageMotionSceneShadowBlazeVortex98754.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            int i23 = 0;
            while (i23 < sparseArray5.size()) {
                canvas.save();
                PolarVoyageViewPager2CelestialHeroInferno8118 polarVoyageViewPager2CelestialHeroInferno8118 = (PolarVoyageViewPager2CelestialHeroInferno8118) sparseArray5.valueAt(i23);
                PolarVoyageJavaBlazePrimeForce1867 polarVoyageJavaBlazePrimeForce18674 = (PolarVoyageJavaBlazePrimeForce1867) polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageKotlinBetaPulseBeta3653.get(sparseArray5.keyAt(i23));
                int i24 = polarVoyageViewPager2CelestialHeroInferno8118.PolarVoyageZipVortexCelestial6185 + polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageKotlinBetaPulseBeta3653;
                int i25 = polarVoyageViewPager2CelestialHeroInferno8118.PolarVoyageMotionLayoutTransitionHeroVision4068 + polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageBitmapVisionAuroraPixel4705;
                int i26 = polarVoyageJavaBlazePrimeForce18674.PolarVoyageKotlinBetaPulseBeta3653;
                int i27 = polarVoyageJavaBlazePrimeForce18674.PolarVoyageDiffUtilTurboStrike5735;
                int i28 = polarVoyageJavaBlazePrimeForce18674.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                int i29 = i24 + i26;
                int i30 = i25 + i28;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i24, i25, Math.min(i29, polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageBarcodeScannerInfernoSolarSpark7767), Math.min(i30, polarVoyageCameraSelectorMegaHyperion65302.PolarVoyageDiffUtilTurboStrike5735));
                PolarVoyageDiffUtilDragonCelestialDragon6652 polarVoyageDiffUtilDragonCelestialDragon6652 = (PolarVoyageDiffUtilDragonCelestialDragon6652) polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(i27);
                if (polarVoyageDiffUtilDragonCelestialDragon6652 == null && (polarVoyageDiffUtilDragonCelestialDragon6652 = (PolarVoyageDiffUtilDragonCelestialDragon6652) polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageDiffUtilTurboStrike5735.get(i27)) == null) {
                    polarVoyageDiffUtilDragonCelestialDragon6652 = (PolarVoyageDiffUtilDragonCelestialDragon6652) this.PolarVoyageViewRogueMaster4778;
                }
                SparseArray sparseArray7 = polarVoyageJavaBlazePrimeForce18674.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageCameraSelectorMegaHyperion6530 polarVoyageCameraSelectorMegaHyperion65303 = polarVoyageCameraSelectorMegaHyperion65302;
                int i31 = 0;
                while (i31 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i31);
                    int i32 = i23;
                    PolarVoyageRealtimeDatabaseEclipseNovaX1768 polarVoyageRealtimeDatabaseEclipseNovaX1768 = (PolarVoyageRealtimeDatabaseEclipseNovaX1768) sparseArray7.valueAt(i31);
                    SparseArray sparseArray8 = sparseArray7;
                    PolarVoyageDigitalInkRecognitionCosmosTitanium5488 polarVoyageDigitalInkRecognitionCosmosTitanium5488 = (PolarVoyageDigitalInkRecognitionCosmosTitanium5488) polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageBitmapVisionAuroraPixel4705.get(keyAt);
                    if (polarVoyageDigitalInkRecognitionCosmosTitanium5488 == null) {
                        polarVoyageDigitalInkRecognitionCosmosTitanium5488 = (PolarVoyageDigitalInkRecognitionCosmosTitanium5488) polarVoyageGyroscopeEclipseTitanium10562.PolarVoyageTextInputEditTextNebulaHero6651.get(keyAt);
                    }
                    PolarVoyageDigitalInkRecognitionCosmosTitanium5488 polarVoyageDigitalInkRecognitionCosmosTitanium54882 = polarVoyageDigitalInkRecognitionCosmosTitanium5488;
                    if (polarVoyageDigitalInkRecognitionCosmosTitanium54882 != null) {
                        Paint paint2 = polarVoyageDigitalInkRecognitionCosmosTitanium54882.PolarVoyageMotionLayoutTransitionHeroVision4068 ? null : (Paint) this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        int i33 = i24;
                        int i34 = polarVoyageJavaBlazePrimeForce18674.PolarVoyageBitmapVisionAuroraPixel4705;
                        polarVoyageGyroscopeEclipseTitanium1056 = polarVoyageGyroscopeEclipseTitanium10562;
                        int i35 = i33 + polarVoyageRealtimeDatabaseEclipseNovaX1768.PolarVoyageZipVortexCelestial6185;
                        int i36 = polarVoyageRealtimeDatabaseEclipseNovaX1768.PolarVoyageMotionLayoutTransitionHeroVision4068 + i25;
                        int i37 = i28;
                        Paint paint3 = paint2;
                        PolarVoyageJavaBlazePrimeForce1867 polarVoyageJavaBlazePrimeForce18675 = polarVoyageJavaBlazePrimeForce18674;
                        int[] iArr = i34 == 3 ? polarVoyageDiffUtilDragonCelestialDragon6652.PolarVoyageBarcodeScannerInfernoSolarSpark7767 : i34 == 2 ? polarVoyageDiffUtilDragonCelestialDragon6652.PolarVoyageKotlinBetaPulseBeta3653 : polarVoyageDiffUtilDragonCelestialDragon6652.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        polarVoyageJavaBlazePrimeForce1867 = polarVoyageJavaBlazePrimeForce18675;
                        i8 = i33;
                        i10 = i31;
                        i9 = i26;
                        i11 = i37;
                        PolarVoyageDrawableDeltaHyperion5742(polarVoyageDigitalInkRecognitionCosmosTitanium54882.PolarVoyageKotlinBetaPulseBeta3653, iArr, i34, i35, i36, paint3, canvas);
                        PolarVoyageDrawableDeltaHyperion5742(polarVoyageDigitalInkRecognitionCosmosTitanium54882.PolarVoyageBarcodeScannerInfernoSolarSpark7767, iArr, i34, i35, i36 + 1, paint3, canvas);
                    } else {
                        polarVoyageGyroscopeEclipseTitanium1056 = polarVoyageGyroscopeEclipseTitanium10562;
                        polarVoyageJavaBlazePrimeForce1867 = polarVoyageJavaBlazePrimeForce18674;
                        i8 = i24;
                        i9 = i26;
                        i10 = i31;
                        i11 = i28;
                    }
                    i31 = i10 + 1;
                    polarVoyageJavaBlazePrimeForce18674 = polarVoyageJavaBlazePrimeForce1867;
                    i24 = i8;
                    sparseArray7 = sparseArray8;
                    i23 = i32;
                    polarVoyageGyroscopeEclipseTitanium10562 = polarVoyageGyroscopeEclipseTitanium1056;
                    i26 = i9;
                    i28 = i11;
                }
                PolarVoyageGyroscopeEclipseTitanium1056 polarVoyageGyroscopeEclipseTitanium10563 = polarVoyageGyroscopeEclipseTitanium10562;
                int i38 = i23;
                PolarVoyageJavaBlazePrimeForce1867 polarVoyageJavaBlazePrimeForce18676 = polarVoyageJavaBlazePrimeForce18674;
                int i39 = i24;
                int i40 = i26;
                int i41 = i28;
                if (polarVoyageJavaBlazePrimeForce18676.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    int i42 = polarVoyageJavaBlazePrimeForce18676.PolarVoyageBitmapVisionAuroraPixel4705;
                    if (i42 == 3) {
                        i7 = polarVoyageDiffUtilDragonCelestialDragon6652.PolarVoyageBarcodeScannerInfernoSolarSpark7767[polarVoyageJavaBlazePrimeForce18676.PolarVoyageTextInputEditTextNebulaHero6651];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i7 = i42 == 2 ? polarVoyageDiffUtilDragonCelestialDragon6652.PolarVoyageKotlinBetaPulseBeta3653[polarVoyageJavaBlazePrimeForce18676.PolarVoyageItemDecorationUltraDeltaEpic7485] : polarVoyageDiffUtilDragonCelestialDragon6652.PolarVoyageMotionLayoutTransitionHeroVision4068[polarVoyageJavaBlazePrimeForce18676.PolarVoyageStrictModeLegendEpic1532];
                    }
                    paint.setColor(i7);
                    i4 = i39;
                    c2 = c3;
                    polarVoyageCameraSelectorMegaHyperion6530 = polarVoyageCameraSelectorMegaHyperion65303;
                    i6 = 0;
                    c = 3;
                    i5 = i25;
                    arrayList = arrayList2;
                    canvas.drawRect(i4, i25, i29, i30, paint);
                } else {
                    i4 = i39;
                    i5 = i25;
                    polarVoyageCameraSelectorMegaHyperion6530 = polarVoyageCameraSelectorMegaHyperion65303;
                    arrayList = arrayList2;
                    c = 3;
                    c2 = 2;
                    i6 = 0;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.PolarVoyageDrawableDeltaHyperion5742, i4, i5, i40, i41);
                float f = polarVoyageCameraSelectorMegaHyperion6530.PolarVoyageZipVortexCelestial6185;
                float f2 = polarVoyageCameraSelectorMegaHyperion6530.PolarVoyageMotionLayoutTransitionHeroVision4068;
                arrayList.add(new PolarVoyageProcessCameraProviderHeroBetaSolar3759(null, null, null, createBitmap2, i5 / f2, 0, 0, i4 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f, i41 / f2, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(i6, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i23 = i38 + 1;
                polarVoyageCameraSelectorMegaHyperion65302 = polarVoyageCameraSelectorMegaHyperion6530;
                arrayList2 = arrayList;
                sparseArray5 = sparseArray6;
                polarVoyageGyroscopeEclipseTitanium10562 = polarVoyageGyroscopeEclipseTitanium10563;
            }
            polarVoyageConstraintSetCloneOlympianMegaVision9846 = new PolarVoyageConstraintSetCloneOlympianMegaVision9846(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        polarVoyageScaleAnimationVortexAurora2886.accept(polarVoyageConstraintSetCloneOlympianMegaVision9846);
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo6617 = (PolarVoyageTextViewLegendTurbo6617) entry.getKey();
            PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350 = (PolarVoyageRemoteConfigEliteSpectra7350) entry.getValue();
            int i = polarVoyageTextViewLegendTurbo6617.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i == 1 || (i == 2 && z)) {
                polarVoyageRemoteConfigEliteSpectra7350.get();
            }
        }
        PolarVoyageAdapterDelegateAlphaVortex7437 polarVoyageAdapterDelegateAlphaVortex7437 = (PolarVoyageAdapterDelegateAlphaVortex7437) this.PolarVoyageViewRogueMaster4778;
        synchronized (polarVoyageAdapterDelegateAlphaVortex7437) {
            try {
                arrayDeque = polarVoyageAdapterDelegateAlphaVortex7437.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (arrayDeque != null) {
                    polarVoyageAdapterDelegateAlphaVortex7437.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
            }
        }
    }

    public ArrayList PolarVoyageNavigationViewHyperHyperHyperion1793(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.PolarVoyageStrictModeLegendEpic1532;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo6617 = (PolarVoyageTextViewLegendTurbo6617) obj;
            if (polarVoyageTextViewLegendTurbo6617.PolarVoyageBitmapVisionAuroraPixel4705 == 0) {
                PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350 = (PolarVoyageRemoteConfigEliteSpectra7350) ((HashMap) this.PolarVoyageItemDecorationUltraDeltaEpic7485).get(polarVoyageTextViewLegendTurbo6617);
                for (PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297 : polarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    if (hashMap.containsKey(polarVoyageRotateAnimationBlazePixelTitan5297)) {
                        arrayList2.add(new PolarVoyageMediaPlayerNebulaTurboLegend3509(11, (PolarVoyagePermissionFusionSpark4903) ((PolarVoyageRemoteConfigEliteSpectra7350) hashMap.get(polarVoyageRotateAnimationBlazePixelTitan5297)), polarVoyageRemoteConfigEliteSpectra7350));
                    } else {
                        hashMap.put(polarVoyageRotateAnimationBlazePixelTitan5297, polarVoyageRemoteConfigEliteSpectra7350);
                    }
                }
            }
        }
        return arrayList2;
    }

    public void PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        for (PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo6617 : ((HashMap) this.PolarVoyageItemDecorationUltraDeltaEpic7485).keySet()) {
            for (PolarVoyageAssetManagerMasterMaster2094 polarVoyageAssetManagerMasterMaster2094 : polarVoyageTextViewLegendTurbo6617.PolarVoyageKotlinBetaPulseBeta3653) {
                if (polarVoyageAssetManagerMasterMaster2094.PolarVoyageMotionLayoutTransitionHeroVision4068 == 2 && !((HashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).containsKey(polarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185)) {
                    HashMap hashMap = (HashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297 = polarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185;
                    Set set = Collections.EMPTY_SET;
                    PolarVoyageFragmentLegendRogue2777 polarVoyageFragmentLegendRogue2777 = new PolarVoyageFragmentLegendRogue2777();
                    polarVoyageFragmentLegendRogue2777.PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                    polarVoyageFragmentLegendRogue2777.PolarVoyageZipVortexCelestial6185 = Collections.newSetFromMap(new ConcurrentHashMap());
                    polarVoyageFragmentLegendRogue2777.PolarVoyageZipVortexCelestial6185.addAll(set);
                    hashMap.put(polarVoyageRotateAnimationBlazePixelTitan5297, polarVoyageFragmentLegendRogue2777);
                } else if (((HashMap) this.PolarVoyageStrictModeLegendEpic1532).containsKey(polarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185)) {
                    continue;
                } else {
                    int i = polarVoyageAssetManagerMasterMaster2094.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (i == 1) {
                        throw new PolarVoyageOnPreDrawListenerPhantomPulseHyperion5951("Unsatisfied dependency for component " + polarVoyageTextViewLegendTurbo6617 + ": " + polarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = (HashMap) this.PolarVoyageStrictModeLegendEpic1532;
                        PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan52972 = polarVoyageAssetManagerMasterMaster2094.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageR8UltraEliteBeta8736 polarVoyageR8UltraEliteBeta8736 = PolarVoyagePermissionFusionSpark4903.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageColorStateListCyberPhoenixHero2775 polarVoyageColorStateListCyberPhoenixHero2775 = PolarVoyagePermissionFusionSpark4903.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        PolarVoyagePermissionFusionSpark4903 polarVoyagePermissionFusionSpark4903 = new PolarVoyagePermissionFusionSpark4903();
                        polarVoyagePermissionFusionSpark4903.PolarVoyageZipVortexCelestial6185 = polarVoyageR8UltraEliteBeta8736;
                        polarVoyagePermissionFusionSpark4903.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageColorStateListCyberPhoenixHero2775;
                        hashMap2.put(polarVoyageRotateAnimationBlazePixelTitan52972, polarVoyagePermissionFusionSpark4903);
                    }
                }
            }
        }
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public synchronized PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297) {
        PolarVoyageFragmentLegendRogue2777 polarVoyageFragmentLegendRogue2777 = (PolarVoyageFragmentLegendRogue2777) ((HashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(polarVoyageRotateAnimationBlazePixelTitan5297);
        if (polarVoyageFragmentLegendRogue2777 != null) {
            return polarVoyageFragmentLegendRogue2777;
        }
        return PolarVoyageSnackbarGammaEclipse2140;
    }

    @Override // p000createpolar.PolarVoyageDebugCelestialNebula7743
    public Object get() {
        return new PolarVoyageWorkManagerVortexNova2773((Context) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageItemDecorationUltraDeltaEpic7485).get(), (PolarVoyageLintMegaMaxRogue5881) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageStrictModeLegendEpic1532).get(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(), (PolarVoyageAlarmManagerAlphaInferno3493) ((PolarVoyageDrawableCosmosEclipseMax6944) this.PolarVoyageBottomSheetOmegaNeo1907).get(), (Executor) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageViewRogueMaster4778).get(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageCameraPixelBlaze2629).get(), new PolarVoyageConstraintLayoutVisionMasterDragon8646(10), new PolarVoyageDrawableTitanNovaBlaze5744(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageDrawableDeltaHyperion5742).get());
    }

    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    public void reset() {
        PolarVoyageGyroscopeEclipseTitanium1056 polarVoyageGyroscopeEclipseTitanium1056 = (PolarVoyageGyroscopeEclipseTitanium1056) this.PolarVoyageCameraPixelBlaze2629;
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageKotlinBetaPulseBeta3653.clear();
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageBarcodeScannerInfernoSolarSpark7767.clear();
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageBitmapVisionAuroraPixel4705.clear();
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageDiffUtilTurboStrike5735.clear();
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageTextInputEditTextNebulaHero6651.clear();
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
        polarVoyageGyroscopeEclipseTitanium1056.PolarVoyageStrictModeLegendEpic1532 = null;
    }
}
