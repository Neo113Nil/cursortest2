package p000createpolar;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObjectDetectionGammaQuantumShadow9070 extends PolarVoyageAdMobSpeedFusion2921 {
    public PolarVoyagePlaceholderRogueTitanium7752 PolarVoyageCameraPixelBlaze2629;
    public long PolarVoyageContentProviderHyperSpark3838;
    public AssetFileDescriptor PolarVoyageDrawableDeltaHyperion5742;
    public boolean PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public FileInputStream PolarVoyageSnackbarGammaEclipse2140;
    public final Context PolarVoyageViewRogueMaster4778;

    public PolarVoyageObjectDetectionGammaQuantumShadow9070(Context context) {
        super(false);
        this.PolarVoyageViewRogueMaster4778 = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752 = this.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyagePlaceholderRogueTitanium7752 != null) {
            return polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyagePlaceholderRogueTitanium7752;
        PolarVoyageSnackbarGammaEclipse2140();
        Uri uri = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        long j = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735;
        long j2 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.PolarVoyageViewRogueMaster4778;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new PolarVoyageActionBarCelestialTitanium8103("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new PolarVoyageActionBarCelestialTitanium8103("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new PolarVoyageActionBarCelestialTitanium8103("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new PolarVoyageActionBarCelestialTitanium8103("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new PolarVoyageActionBarCelestialTitanium8103("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (parseInt == 0) {
                    throw new PolarVoyageActionBarCelestialTitanium8103("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new PolarVoyageActionBarCelestialTitanium8103("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.PolarVoyageDrawableDeltaHyperion5742 = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.PolarVoyageDrawableDeltaHyperion5742.getFileDescriptor());
            this.PolarVoyageSnackbarGammaEclipse2140 = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new PolarVoyageActionBarCelestialTitanium8103(null, null, 2008);
                }
                long startOffset = this.PolarVoyageDrawableDeltaHyperion5742.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new PolarVoyageActionBarCelestialTitanium8103(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.PolarVoyageContentProviderHyperSpark3838 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.PolarVoyageContentProviderHyperSpark3838 = size;
                        if (size < 0) {
                            throw new PolarVoyageActionBarCelestialTitanium8103(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.PolarVoyageContentProviderHyperSpark3838 = j3;
                    if (j3 < 0) {
                        throw new PolarVoyagePagingSourceFusionPhoenixThunder6968(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.PolarVoyageContentProviderHyperSpark3838;
                    this.PolarVoyageContentProviderHyperSpark3838 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = true;
                PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
                return j != -1 ? j : this.PolarVoyageContentProviderHyperSpark3838;
            } catch (PolarVoyageActionBarCelestialTitanium8103 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new PolarVoyageActionBarCelestialTitanium8103(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new PolarVoyageActionBarCelestialTitanium8103(null, e4, 2005);
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
                        throw new PolarVoyageActionBarCelestialTitanium8103(null, e, 2000);
                    }
                } finally {
                    this.PolarVoyageDrawableDeltaHyperion5742 = null;
                    if (this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = false;
                        PolarVoyageStrictModeLegendEpic1532();
                    }
                }
            } catch (IOException e2) {
                throw new PolarVoyageActionBarCelestialTitanium8103(null, e2, 2000);
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
                    throw new PolarVoyageActionBarCelestialTitanium8103(null, e3, 2000);
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
                    throw new PolarVoyageActionBarCelestialTitanium8103(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.PolarVoyageSnackbarGammaEclipse2140;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.PolarVoyageContentProviderHyperSpark3838;
            if (read != -1) {
                if (j2 != -1) {
                    this.PolarVoyageContentProviderHyperSpark3838 = j2 - read;
                }
                PolarVoyageKotlinBetaPulseBeta3653(read);
                return read;
            }
            if (j2 != -1) {
                throw new PolarVoyageActionBarCelestialTitanium8103("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
