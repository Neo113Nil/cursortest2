package p000createpolar;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentPhoenixThunderForce2600 extends PolarVoyageAdMobSpeedFusion2921 {
    public Uri PolarVoyageCameraPixelBlaze2629;
    public long PolarVoyageDrawableDeltaHyperion5742;
    public boolean PolarVoyageSnackbarGammaEclipse2140;
    public RandomAccessFile PolarVoyageViewRogueMaster4778;

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        return this.PolarVoyageCameraPixelBlaze2629;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        Uri uri = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        long j = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705;
        this.PolarVoyageCameraPixelBlaze2629 = uri;
        PolarVoyageSnackbarGammaEclipse2140();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.PolarVoyageViewRogueMaster4778 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735;
                if (j2 == -1) {
                    j2 = this.PolarVoyageViewRogueMaster4778.length() - j;
                }
                this.PolarVoyageDrawableDeltaHyperion5742 = j2;
                if (j2 < 0) {
                    throw new PolarVoyageWithContextVisionSolar8714(null, null, 2008);
                }
                this.PolarVoyageSnackbarGammaEclipse2140 = true;
                PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
                return this.PolarVoyageDrawableDeltaHyperion5742;
            } catch (IOException e) {
                throw new PolarVoyageWithContextVisionSolar8714(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new PolarVoyageWithContextVisionSolar8714(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new PolarVoyageWithContextVisionSolar8714("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, ErrorCodes.PROTOCOL_EXCEPTION);
        } catch (SecurityException e3) {
            throw new PolarVoyageWithContextVisionSolar8714(e3, 2006);
        } catch (RuntimeException e4) {
            throw new PolarVoyageWithContextVisionSolar8714(e4, 2000);
        }
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final void close() {
        this.PolarVoyageCameraPixelBlaze2629 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.PolarVoyageViewRogueMaster4778;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new PolarVoyageWithContextVisionSolar8714(e, 2000);
            }
        } finally {
            this.PolarVoyageViewRogueMaster4778 = null;
            if (this.PolarVoyageSnackbarGammaEclipse2140) {
                this.PolarVoyageSnackbarGammaEclipse2140 = false;
                PolarVoyageStrictModeLegendEpic1532();
            }
        }
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.PolarVoyageDrawableDeltaHyperion5742;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.PolarVoyageViewRogueMaster4778;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.PolarVoyageDrawableDeltaHyperion5742 -= read;
                PolarVoyageKotlinBetaPulseBeta3653(read);
            }
            return read;
        } catch (IOException e) {
            throw new PolarVoyageWithContextVisionSolar8714(e, 2000);
        }
    }
}
