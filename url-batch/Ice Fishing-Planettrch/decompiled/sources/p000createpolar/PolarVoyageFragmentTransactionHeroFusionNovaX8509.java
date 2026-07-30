package p000createpolar;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentTransactionHeroFusionNovaX8509 extends PolarVoyageAdMobSpeedFusion2921 {
    public Uri PolarVoyageCameraPixelBlaze2629;
    public long PolarVoyageContentProviderHyperSpark3838;
    public AssetFileDescriptor PolarVoyageDrawableDeltaHyperion5742;
    public boolean PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public FileInputStream PolarVoyageSnackbarGammaEclipse2140;
    public final ContentResolver PolarVoyageViewRogueMaster4778;

    public PolarVoyageFragmentTransactionHeroFusionNovaX8509(Context context) {
        super(false);
        this.PolarVoyageViewRogueMaster4778 = context.getContentResolver();
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        return this.PolarVoyageCameraPixelBlaze2629;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
                long j = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735;
                long j2 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705;
                Uri normalizeScheme = uri.normalizeScheme();
                this.PolarVoyageCameraPixelBlaze2629 = normalizeScheme;
                PolarVoyageSnackbarGammaEclipse2140();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.PolarVoyageViewRogueMaster4778;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.PolarVoyageDrawableDeltaHyperion5742 = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new PolarVoyageBarcodeScannerVortexCyber1490(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new PolarVoyageBarcodeScannerVortexCyber1490(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.PolarVoyageSnackbarGammaEclipse2140 = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new PolarVoyageBarcodeScannerVortexCyber1490(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new PolarVoyageBarcodeScannerVortexCyber1490(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.PolarVoyageContentProviderHyperSpark3838 = -1L;
                    } else {
                        long position = size - channel.position();
                        this.PolarVoyageContentProviderHyperSpark3838 = position;
                        if (position < 0) {
                            throw new PolarVoyageBarcodeScannerVortexCyber1490(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.PolarVoyageContentProviderHyperSpark3838 = j3;
                    if (j3 < 0) {
                        throw new PolarVoyageBarcodeScannerVortexCyber1490(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.PolarVoyageContentProviderHyperSpark3838;
                    this.PolarVoyageContentProviderHyperSpark3838 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = true;
                PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
                return j != -1 ? j : this.PolarVoyageContentProviderHyperSpark3838;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (PolarVoyageBarcodeScannerVortexCyber1490 e3) {
            throw e3;
        }
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final void close() {
        this.PolarVoyageCameraPixelBlaze2629 = null;
        try {
            try {
                FileInputStream fileInputStream = this.PolarVoyageSnackbarGammaEclipse2140;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.PolarVoyageSnackbarGammaEclipse2140 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.PolarVoyageDrawableDeltaHyperion5742;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new PolarVoyageBarcodeScannerVortexCyber1490(e, 2000);
                    }
                } finally {
                    this.PolarVoyageDrawableDeltaHyperion5742 = null;
                    if (this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = false;
                        PolarVoyageStrictModeLegendEpic1532();
                    }
                }
            } catch (IOException e2) {
                throw new PolarVoyageBarcodeScannerVortexCyber1490(e2, 2000);
            }
        } catch (Throwable th) {
            this.PolarVoyageSnackbarGammaEclipse2140 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.PolarVoyageDrawableDeltaHyperion5742;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.PolarVoyageDrawableDeltaHyperion5742 = null;
                    if (this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = false;
                        PolarVoyageStrictModeLegendEpic1532();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new PolarVoyageBarcodeScannerVortexCyber1490(e3, 2000);
                }
            } finally {
                this.PolarVoyageDrawableDeltaHyperion5742 = null;
                if (this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                    this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = false;
                    PolarVoyageStrictModeLegendEpic1532();
                }
            }
        }
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.PolarVoyageContentProviderHyperSpark3838;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new PolarVoyageBarcodeScannerVortexCyber1490(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.PolarVoyageSnackbarGammaEclipse2140;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.PolarVoyageContentProviderHyperSpark3838;
                if (j2 != -1) {
                    this.PolarVoyageContentProviderHyperSpark3838 = j2 - read;
                }
                PolarVoyageKotlinBetaPulseBeta3653(read);
                return read;
            }
        }
        return -1;
    }
}
