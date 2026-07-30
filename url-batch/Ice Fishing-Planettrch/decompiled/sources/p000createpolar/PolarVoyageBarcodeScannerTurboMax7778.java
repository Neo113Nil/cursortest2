package p000createpolar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBarcodeScannerTurboMax7778 implements PolarVoyageViewPagerStrikeBlaze5840 {
    public final Bitmap PolarVoyageZipVortexCelestial6185;

    public PolarVoyageBarcodeScannerTurboMax7778(Bitmap bitmap) {
        this.PolarVoyageZipVortexCelestial6185 = bitmap;
    }

    @Override // p000createpolar.PolarVoyageViewPagerStrikeBlaze5840
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(Canvas canvas) {
        canvas.drawBitmap(this.PolarVoyageZipVortexCelestial6185, 0.0f, 0.0f, (Paint) null);
    }

    @Override // p000createpolar.PolarVoyageViewPagerStrikeBlaze5840
    public final long PolarVoyageBitmapVisionAuroraPixel4705() {
        int i;
        Bitmap.Config config;
        int i2;
        Bitmap bitmap = this.PolarVoyageZipVortexCelestial6185;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            i2 = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config2 == config) {
                        i = 8;
                    }
                }
                i = 4;
            }
            i2 = i * height;
        }
        return i2;
    }

    @Override // p000createpolar.PolarVoyageViewPagerStrikeBlaze5840
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        return true;
    }

    @Override // p000createpolar.PolarVoyageViewPagerStrikeBlaze5840
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return this.PolarVoyageZipVortexCelestial6185.getWidth();
    }

    @Override // p000createpolar.PolarVoyageViewPagerStrikeBlaze5840
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageZipVortexCelestial6185.getHeight();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PolarVoyageBarcodeScannerTurboMax7778) && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageZipVortexCelestial6185, ((PolarVoyageBarcodeScannerTurboMax7778) obj).PolarVoyageZipVortexCelestial6185);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.PolarVoyageZipVortexCelestial6185.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.PolarVoyageZipVortexCelestial6185 + ", shareable=true)";
    }
}
