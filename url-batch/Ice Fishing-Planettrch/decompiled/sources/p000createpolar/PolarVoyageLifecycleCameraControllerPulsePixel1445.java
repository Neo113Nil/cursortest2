package p000createpolar;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLifecycleCameraControllerPulsePixel1445 {
    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Layout PolarVoyageBitmapVisionAuroraPixel4705;
    public final boolean PolarVoyageBottomSheetOmegaNeo1907;
    public final int PolarVoyageCameraPixelBlaze2629;
    public PolarVoyageServiceUltraUltraNeo9663 PolarVoyageContentProviderHyperSpark3838;
    public final int PolarVoyageDiffUtilTurboStrike5735;
    public final PolarVoyageFCMElitePixelHero9343[] PolarVoyageDrawableDeltaHyperion5742;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageKotlinBetaPulseBeta3653;
    public final TextUtils.TruncateAt PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Rect PolarVoyageSnackbarGammaEclipse2140 = new Rect();
    public final float PolarVoyageStrictModeLegendEpic1532;
    public final int PolarVoyageTextInputEditTextNebulaHero6651;
    public final Paint.FontMetricsInt PolarVoyageViewRogueMaster4778;
    public final TextPaint PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageLifecycleCameraControllerPulsePixel1445(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, PolarVoyageRotateAnimationAuroraNovaXDragon8562 polarVoyageRotateAnimationAuroraNovaXDragon8562) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout PolarVoyageDiffUtilTurboStrike5735;
        char c;
        boolean z2;
        int i10;
        int i11;
        long j;
        PolarVoyageFCMElitePixelHero9343[] polarVoyageFCMElitePixelHero9343Arr;
        long j2;
        int i12;
        Layout layout;
        int i13;
        boolean z3;
        this.PolarVoyageZipVortexCelestial6185 = textPaint;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = truncateAt;
        this.PolarVoyageKotlinBetaPulseBeta3653 = z;
        int length = charSequence.length();
        TextDirectionHeuristic PolarVoyageZipVortexCelestial6185 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageZipVortexCelestial6185(i2);
        Layout.Alignment alignment = PolarVoyageScaleGestureDetectorVisionHyperSpark4155.PolarVoyageZipVortexCelestial6185;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : PolarVoyageScaleGestureDetectorVisionHyperSpark4155.PolarVoyageMotionLayoutTransitionHeroVision4068 : PolarVoyageScaleGestureDetectorVisionHyperSpark4155.PolarVoyageZipVortexCelestial6185 : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, PolarVoyageVectorDrawableNeoNovaX7438.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics PolarVoyageZipVortexCelestial61852 = polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageZipVortexCelestial6185();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (PolarVoyageZipVortexCelestial61852 == null || polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageKotlinBetaPulseBeta3653() > f || z4) {
                this.PolarVoyageBottomSheetOmegaNeo1907 = false;
                i9 = i3;
                textDirectionHeuristic = PolarVoyageZipVortexCelestial6185;
                PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageDiffUtilTurboStrike5735(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.PolarVoyageBottomSheetOmegaNeo1907 = true;
                if (ceil < 0) {
                    PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("negative width");
                }
                if (ceil < 0) {
                    PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("negative ellipsized width");
                }
                PolarVoyageDiffUtilTurboStrike5735 = Build.VERSION.SDK_INT >= 33 ? PolarVoyageOnAttachStateChangeListenerForceQuantumMega6979.PolarVoyageStrictModeLegendEpic1532(charSequence, textPaint, ceil, alignment2, PolarVoyageZipVortexCelestial61852, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, PolarVoyageZipVortexCelestial61852, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = PolarVoyageZipVortexCelestial6185;
            }
            this.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageDiffUtilTurboStrike5735;
            Trace.endSection();
            int min = Math.min(PolarVoyageDiffUtilTurboStrike5735.getLineCount(), i9);
            this.PolarVoyageDiffUtilTurboStrike5735 = min;
            int i14 = min - 1;
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = min >= i9 && (PolarVoyageDiffUtilTurboStrike5735.getEllipsisCount(i14) > 0 || PolarVoyageDiffUtilTurboStrike5735.getLineEnd(i14) != charSequence.length());
            long j3 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageMotionLayoutTransitionHeroVision4068;
            long j4 = 4294967295L;
            if (z) {
                c = ' ';
                z2 = true;
                i10 = 33;
            } else if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                BoringLayout boringLayout = (BoringLayout) PolarVoyageDiffUtilTurboStrike5735;
                i10 = 33;
                if (Build.VERSION.SDK_INT >= 33) {
                    z3 = boringLayout.isFallbackLineSpacingEnabled();
                    if (!z3) {
                        TextPaint paint = PolarVoyageDiffUtilTurboStrike5735.getPaint();
                        CharSequence text = PolarVoyageDiffUtilTurboStrike5735.getText();
                        i11 = 0;
                        Rect PolarVoyageCameraViewSpectraMaxSpectra2824 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageCameraViewSpectraMaxSpectra2824(paint, text, PolarVoyageDiffUtilTurboStrike5735.getLineStart(0), PolarVoyageDiffUtilTurboStrike5735.getLineEnd(0));
                        int lineAscent = PolarVoyageDiffUtilTurboStrike5735.getLineAscent(0);
                        c = ' ';
                        int i15 = PolarVoyageCameraViewSpectraMaxSpectra2824.top;
                        int topPadding = i15 < lineAscent ? lineAscent - i15 : PolarVoyageDiffUtilTurboStrike5735.getTopPadding();
                        z2 = true;
                        PolarVoyageCameraViewSpectraMaxSpectra2824 = min != 1 ? PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageCameraViewSpectraMaxSpectra2824(paint, text, PolarVoyageDiffUtilTurboStrike5735.getLineStart(i14), PolarVoyageDiffUtilTurboStrike5735.getLineEnd(i14)) : PolarVoyageCameraViewSpectraMaxSpectra2824;
                        int lineDescent = PolarVoyageDiffUtilTurboStrike5735.getLineDescent(i14);
                        int i16 = PolarVoyageCameraViewSpectraMaxSpectra2824.bottom;
                        int bottomPadding = i16 > lineDescent ? i16 - lineDescent : PolarVoyageDiffUtilTurboStrike5735.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            j = (bottomPadding & 4294967295L) | (topPadding << 32);
                            Paint.FontMetricsInt fontMetricsInt = null;
                            if (PolarVoyageDiffUtilTurboStrike5735.getText() instanceof Spanned) {
                                CharSequence text2 = PolarVoyageDiffUtilTurboStrike5735.getText();
                                text2.getClass();
                                if (PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageBottomSheetOmegaNeo1907((Spanned) text2, PolarVoyageFCMElitePixelHero9343.class) || PolarVoyageDiffUtilTurboStrike5735.getText().length() <= 0) {
                                    CharSequence text3 = PolarVoyageDiffUtilTurboStrike5735.getText();
                                    text3.getClass();
                                    polarVoyageFCMElitePixelHero9343Arr = (PolarVoyageFCMElitePixelHero9343[]) ((Spanned) text3).getSpans(i11, PolarVoyageDiffUtilTurboStrike5735.getText().length(), PolarVoyageFCMElitePixelHero9343.class);
                                    this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageFCMElitePixelHero9343Arr;
                                    if (polarVoyageFCMElitePixelHero9343Arr == null) {
                                        int length2 = polarVoyageFCMElitePixelHero9343Arr.length;
                                        int i17 = i11;
                                        int i18 = i17;
                                        int i19 = i18;
                                        while (i17 < length2) {
                                            boolean z5 = z2;
                                            PolarVoyageFCMElitePixelHero9343 polarVoyageFCMElitePixelHero9343 = polarVoyageFCMElitePixelHero9343Arr[i17];
                                            long j5 = j4;
                                            int i20 = polarVoyageFCMElitePixelHero9343.PolarVoyageNavigationViewHyperHyperHyperion1793;
                                            i18 = i20 < 0 ? Math.max(i18, Math.abs(i20)) : i18;
                                            int i21 = polarVoyageFCMElitePixelHero9343.PolarVoyageAnimatorSetSparkUltraMax8233;
                                            if (i21 < 0) {
                                                i19 = Math.max(i18, Math.abs(i21));
                                            }
                                            i17++;
                                            j4 = j5;
                                            z2 = z5;
                                        }
                                        j2 = j4;
                                        j3 = (i18 == 0 && i19 == 0) ? PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageMotionLayoutTransitionHeroVision4068 : (i18 << c) | (i19 & j2);
                                    } else {
                                        j2 = 4294967295L;
                                    }
                                    this.PolarVoyageTextInputEditTextNebulaHero6651 = Math.max((int) (j >> c), (int) (j3 >> c));
                                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Math.max((int) (j & j2), (int) (j3 & j2));
                                    TextPaint textPaint2 = this.PolarVoyageZipVortexCelestial6185;
                                    PolarVoyageFCMElitePixelHero9343[] polarVoyageFCMElitePixelHero9343Arr2 = this.PolarVoyageDrawableDeltaHyperion5742;
                                    i12 = this.PolarVoyageDiffUtilTurboStrike5735 - 1;
                                    layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
                                    if (layout.getLineStart(i12) == layout.getLineEnd(i12) || polarVoyageFCMElitePixelHero9343Arr2 == null || polarVoyageFCMElitePixelHero9343Arr2.length == 0) {
                                        i13 = i11;
                                    } else {
                                        SpannableString spannableString = new SpannableString("\u200b");
                                        if (polarVoyageFCMElitePixelHero9343Arr2.length == 0) {
                                            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("Array is empty.");
                                            throw null;
                                        }
                                        PolarVoyageFCMElitePixelHero9343 polarVoyageFCMElitePixelHero93432 = polarVoyageFCMElitePixelHero9343Arr2[i11];
                                        spannableString.setSpan(new PolarVoyageFCMElitePixelHero9343(polarVoyageFCMElitePixelHero93432.PolarVoyageItemDecorationUltraDeltaEpic7485, spannableString.length(), (i12 == 0 || !polarVoyageFCMElitePixelHero93432.PolarVoyageBottomSheetOmegaNeo1907) ? polarVoyageFCMElitePixelHero93432.PolarVoyageBottomSheetOmegaNeo1907 : i11, polarVoyageFCMElitePixelHero93432.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageFCMElitePixelHero93432.PolarVoyageViewRogueMaster4778, polarVoyageFCMElitePixelHero93432.PolarVoyageCameraPixelBlaze2629), i11, spannableString.length(), i10);
                                        i13 = i11;
                                        StaticLayout PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageInAppPurchasePhoenixPrime4331.PolarVoyageDiffUtilTurboStrike5735(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, PolarVoyageCombineDragonSpectra9934.PolarVoyageZipVortexCelestial6185, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.PolarVoyageKotlinBetaPulseBeta3653, 0, 0, 0, 0);
                                        fontMetricsInt = new Paint.FontMetricsInt();
                                        fontMetricsInt.ascent = PolarVoyageDiffUtilTurboStrike57352.getLineAscent(i13);
                                        fontMetricsInt.descent = PolarVoyageDiffUtilTurboStrike57352.getLineDescent(i13);
                                        fontMetricsInt.top = PolarVoyageDiffUtilTurboStrike57352.getLineTop(i13);
                                        fontMetricsInt.bottom = PolarVoyageDiffUtilTurboStrike57352.getLineBottom(i13);
                                    }
                                    this.PolarVoyageCameraPixelBlaze2629 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (PolarVoyageBarcodeScannerInfernoSolarSpark7767(i14) - PolarVoyageDiffUtilTurboStrike5735(i14))) : i13;
                                    this.PolarVoyageViewRogueMaster4778 = fontMetricsInt;
                                    Layout layout2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                                    this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageBitmapMaxTitanTitan7960(layout2, i14, layout2.getPaint());
                                    Layout layout3 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageTransformNeoTitanium1654.PolarVoyageDisplayMetricsVortexDragon9516(layout3, i14, layout3.getPaint());
                                }
                            }
                            polarVoyageFCMElitePixelHero9343Arr = null;
                            this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageFCMElitePixelHero9343Arr;
                            if (polarVoyageFCMElitePixelHero9343Arr == null) {
                            }
                            this.PolarVoyageTextInputEditTextNebulaHero6651 = Math.max((int) (j >> c), (int) (j3 >> c));
                            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Math.max((int) (j & j2), (int) (j3 & j2));
                            TextPaint textPaint22 = this.PolarVoyageZipVortexCelestial6185;
                            PolarVoyageFCMElitePixelHero9343[] polarVoyageFCMElitePixelHero9343Arr22 = this.PolarVoyageDrawableDeltaHyperion5742;
                            i12 = this.PolarVoyageDiffUtilTurboStrike5735 - 1;
                            layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
                            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                            }
                            i13 = i11;
                            this.PolarVoyageCameraPixelBlaze2629 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (PolarVoyageBarcodeScannerInfernoSolarSpark7767(i14) - PolarVoyageDiffUtilTurboStrike5735(i14))) : i13;
                            this.PolarVoyageViewRogueMaster4778 = fontMetricsInt;
                            Layout layout22 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                            this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageBitmapMaxTitanTitan7960(layout22, i14, layout22.getPaint());
                            Layout layout32 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageTransformNeoTitanium1654.PolarVoyageDisplayMetricsVortexDragon9516(layout32, i14, layout32.getPaint());
                        }
                        j = j3;
                        Paint.FontMetricsInt fontMetricsInt2 = null;
                        if (PolarVoyageDiffUtilTurboStrike5735.getText() instanceof Spanned) {
                        }
                        polarVoyageFCMElitePixelHero9343Arr = null;
                        this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageFCMElitePixelHero9343Arr;
                        if (polarVoyageFCMElitePixelHero9343Arr == null) {
                        }
                        this.PolarVoyageTextInputEditTextNebulaHero6651 = Math.max((int) (j >> c), (int) (j3 >> c));
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Math.max((int) (j & j2), (int) (j3 & j2));
                        TextPaint textPaint222 = this.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageFCMElitePixelHero9343[] polarVoyageFCMElitePixelHero9343Arr222 = this.PolarVoyageDrawableDeltaHyperion5742;
                        i12 = this.PolarVoyageDiffUtilTurboStrike5735 - 1;
                        layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
                        if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                        }
                        i13 = i11;
                        this.PolarVoyageCameraPixelBlaze2629 = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (PolarVoyageBarcodeScannerInfernoSolarSpark7767(i14) - PolarVoyageDiffUtilTurboStrike5735(i14))) : i13;
                        this.PolarVoyageViewRogueMaster4778 = fontMetricsInt2;
                        Layout layout222 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageBitmapMaxTitanTitan7960(layout222, i14, layout222.getPaint());
                        Layout layout322 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageTransformNeoTitanium1654.PolarVoyageDisplayMetricsVortexDragon9516(layout322, i14, layout322.getPaint());
                    }
                    c = ' ';
                    z2 = true;
                }
                z3 = false;
                if (!z3) {
                }
            } else {
                i10 = 33;
                StaticLayout staticLayout = (StaticLayout) PolarVoyageDiffUtilTurboStrike5735;
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 33) {
                    z3 = staticLayout.isFallbackLineSpacingEnabled();
                } else {
                    if (i22 >= 28) {
                        z3 = true;
                    }
                    z3 = false;
                }
                if (!z3) {
                }
            }
            i11 = 0;
            j = j3;
            Paint.FontMetricsInt fontMetricsInt22 = null;
            if (PolarVoyageDiffUtilTurboStrike5735.getText() instanceof Spanned) {
            }
            polarVoyageFCMElitePixelHero9343Arr = null;
            this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageFCMElitePixelHero9343Arr;
            if (polarVoyageFCMElitePixelHero9343Arr == null) {
            }
            this.PolarVoyageTextInputEditTextNebulaHero6651 = Math.max((int) (j >> c), (int) (j3 >> c));
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Math.max((int) (j & j2), (int) (j3 & j2));
            TextPaint textPaint2222 = this.PolarVoyageZipVortexCelestial6185;
            PolarVoyageFCMElitePixelHero9343[] polarVoyageFCMElitePixelHero9343Arr2222 = this.PolarVoyageDrawableDeltaHyperion5742;
            i12 = this.PolarVoyageDiffUtilTurboStrike5735 - 1;
            layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
            }
            i13 = i11;
            this.PolarVoyageCameraPixelBlaze2629 = fontMetricsInt22 != null ? fontMetricsInt22.bottom - ((int) (PolarVoyageBarcodeScannerInfernoSolarSpark7767(i14) - PolarVoyageDiffUtilTurboStrike5735(i14))) : i13;
            this.PolarVoyageViewRogueMaster4778 = fontMetricsInt22;
            Layout layout2222 = this.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageBitmapMaxTitanTitan7960(layout2222, i14, layout2222.getPaint());
            Layout layout3222 = this.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageTransformNeoTitanium1654.PolarVoyageDisplayMetricsVortexDragon9516(layout3222, i14, layout3222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final float PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.PolarVoyageDiffUtilTurboStrike5735;
        int i3 = i2 - 1;
        Layout layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
        if (i != i3 || (fontMetricsInt = this.PolarVoyageViewRogueMaster4778) == null) {
            return this.PolarVoyageTextInputEditTextNebulaHero6651 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.PolarVoyageItemDecorationUltraDeltaEpic7485 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        PolarVoyageRunnableVisionPhoenix2735 polarVoyageRunnableVisionPhoenix2735 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageZipVortexCelestial6185;
        Layout layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return (layout.getEllipsisCount(i) <= 0 || this.PolarVoyageMotionLayoutTransitionHeroVision4068 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float PolarVoyageDiffUtilTurboStrike5735(int i) {
        return this.PolarVoyageBitmapVisionAuroraPixel4705.getLineTop(i) + (i == 0 ? 0 : this.PolarVoyageTextInputEditTextNebulaHero6651);
    }

    public final float PolarVoyageItemDecorationUltraDeltaEpic7485(int i, boolean z) {
        return (this.PolarVoyageBitmapVisionAuroraPixel4705.getLineForOffset(i) == this.PolarVoyageDiffUtilTurboStrike5735 + (-1) ? this.PolarVoyageStrictModeLegendEpic1532 + this.PolarVoyageRotateAnimationCyberCelestialDelta4768 : 0.0f) + PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageContentProviderHyperSpark3838(i, false, z);
    }

    public final float PolarVoyageKotlinBetaPulseBeta3653(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.PolarVoyageTextInputEditTextNebulaHero6651 + ((i != this.PolarVoyageDiffUtilTurboStrike5735 + (-1) || (fontMetricsInt = this.PolarVoyageViewRogueMaster4778) == null) ? this.PolarVoyageBitmapVisionAuroraPixel4705.getLineBaseline(i) : PolarVoyageDiffUtilTurboStrike5735(i) - fontMetricsInt.ascent);
    }

    public final PolarVoyageServiceUltraUltraNeo9663 PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo9663 = this.PolarVoyageContentProviderHyperSpark3838;
        if (polarVoyageServiceUltraUltraNeo9663 != null) {
            return polarVoyageServiceUltraUltraNeo9663;
        }
        PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo96632 = new PolarVoyageServiceUltraUltraNeo9663();
        polarVoyageServiceUltraUltraNeo96632.PolarVoyageRotateAnimationCyberCelestialDelta4768 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int PolarVoyageLooperThreadAlphaPrime1279 = PolarVoyageDebugTitaniumInferno5712.PolarVoyageLooperThreadAlphaPrime1279(((Layout) polarVoyageServiceUltraUltraNeo96632.PolarVoyageRotateAnimationCyberCelestialDelta4768).getText(), '\n', i, 4);
            i = PolarVoyageLooperThreadAlphaPrime1279 < 0 ? ((Layout) polarVoyageServiceUltraUltraNeo96632.PolarVoyageRotateAnimationCyberCelestialDelta4768).getText().length() : PolarVoyageLooperThreadAlphaPrime1279 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) polarVoyageServiceUltraUltraNeo96632.PolarVoyageRotateAnimationCyberCelestialDelta4768).getText().length());
        polarVoyageServiceUltraUltraNeo96632.PolarVoyageItemDecorationUltraDeltaEpic7485 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        polarVoyageServiceUltraUltraNeo96632.PolarVoyageStrictModeLegendEpic1532 = arrayList2;
        polarVoyageServiceUltraUltraNeo96632.PolarVoyageBottomSheetOmegaNeo1907 = new boolean[((ArrayList) polarVoyageServiceUltraUltraNeo96632.PolarVoyageItemDecorationUltraDeltaEpic7485).size()];
        ((ArrayList) polarVoyageServiceUltraUltraNeo96632.PolarVoyageItemDecorationUltraDeltaEpic7485).size();
        this.PolarVoyageContentProviderHyperSpark3838 = polarVoyageServiceUltraUltraNeo96632;
        return polarVoyageServiceUltraUltraNeo96632;
    }

    public final float PolarVoyageTextInputEditTextNebulaHero6651(int i, boolean z) {
        return (this.PolarVoyageBitmapVisionAuroraPixel4705.getLineForOffset(i) == this.PolarVoyageDiffUtilTurboStrike5735 - 1 ? this.PolarVoyageStrictModeLegendEpic1532 + this.PolarVoyageRotateAnimationCyberCelestialDelta4768 : 0.0f) + PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageContentProviderHyperSpark3838(i, true, z);
    }

    public final int PolarVoyageZipVortexCelestial6185() {
        boolean z = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Layout layout = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return (z ? layout.getLineBottom(this.PolarVoyageDiffUtilTurboStrike5735 - 1) : layout.getHeight()) + this.PolarVoyageTextInputEditTextNebulaHero6651 + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + this.PolarVoyageCameraPixelBlaze2629;
    }
}
