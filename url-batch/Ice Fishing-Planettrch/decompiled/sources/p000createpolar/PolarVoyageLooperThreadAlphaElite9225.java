package p000createpolar;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLooperThreadAlphaElite9225 extends PolarVoyageAdMobSpeedFusion2921 {
    public Uri PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageContentProviderHyperSpark3838;
    public InputStream PolarVoyageDrawableDeltaHyperion5742;
    public long PolarVoyageSnackbarGammaEclipse2140;
    public final AssetManager PolarVoyageViewRogueMaster4778;

    public PolarVoyageLooperThreadAlphaElite9225(Context context) {
        super(false);
        this.PolarVoyageViewRogueMaster4778 = context.getAssets();
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        return this.PolarVoyageCameraPixelBlaze2629;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        try {
            Uri uri = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
            long j = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageCameraPixelBlaze2629 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            PolarVoyageSnackbarGammaEclipse2140();
            InputStream open = this.PolarVoyageViewRogueMaster4778.open(path, 1);
            this.PolarVoyageDrawableDeltaHyperion5742 = open;
            if (open.skip(j) < j) {
                throw new PolarVoyageDatabaseEclipsePulseMega1401(null, 2008);
            }
            long j2 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735;
            if (j2 != -1) {
                this.PolarVoyageSnackbarGammaEclipse2140 = j2;
            } else {
                long available = this.PolarVoyageDrawableDeltaHyperion5742.available();
                this.PolarVoyageSnackbarGammaEclipse2140 = available;
                if (available == 2147483647L) {
                    this.PolarVoyageSnackbarGammaEclipse2140 = -1L;
                }
            }
            this.PolarVoyageContentProviderHyperSpark3838 = true;
            PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
            return this.PolarVoyageSnackbarGammaEclipse2140;
        } catch (PolarVoyageDatabaseEclipsePulseMega1401 e) {
            throw e;
        } catch (IOException e2) {
            throw new PolarVoyageDatabaseEclipsePulseMega1401(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final void close() {
        this.PolarVoyageCameraPixelBlaze2629 = null;
        try {
            try {
                InputStream inputStream = this.PolarVoyageDrawableDeltaHyperion5742;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new PolarVoyageDatabaseEclipsePulseMega1401(e, 2000);
            }
        } finally {
            this.PolarVoyageDrawableDeltaHyperion5742 = null;
            if (this.PolarVoyageContentProviderHyperSpark3838) {
                this.PolarVoyageContentProviderHyperSpark3838 = false;
                PolarVoyageStrictModeLegendEpic1532();
            }
        }
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.PolarVoyageSnackbarGammaEclipse2140;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new PolarVoyageDatabaseEclipsePulseMega1401(e, 2000);
                }
            }
            InputStream inputStream = this.PolarVoyageDrawableDeltaHyperion5742;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.PolarVoyageSnackbarGammaEclipse2140;
                if (j2 != -1) {
                    this.PolarVoyageSnackbarGammaEclipse2140 = j2 - read;
                }
                PolarVoyageKotlinBetaPulseBeta3653(read);
                return read;
            }
        }
        return -1;
    }
}
