package p000createpolar;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLooperSpectraBlazeNovaX7948 extends PolarVoyageAdMobSpeedFusion2921 {
    public boolean PolarVoyageAnimatorSetSparkUltraMax8233;
    public int PolarVoyageBitmapMaxTitanTitan7960;
    public final int PolarVoyageCameraPixelBlaze2629;
    public PolarVoyagePlaceholderRogueTitanium7752 PolarVoyageContentProviderHyperSpark3838;
    public long PolarVoyageDisplayMetricsVortexDragon9516;
    public final PolarVoyageZoomStateAlphaVision6590 PolarVoyageDrawableDeltaHyperion5742;
    public long PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public InputStream PolarVoyageNavigationViewHyperHyperHyperion1793;
    public HttpURLConnection PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final PolarVoyageZoomStateAlphaVision6590 PolarVoyageSnackbarGammaEclipse2140;
    public final int PolarVoyageViewRogueMaster4778;

    public PolarVoyageLooperSpectraBlazeNovaX7948(int i, int i2, PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590) {
        super(true);
        this.PolarVoyageViewRogueMaster4778 = i;
        this.PolarVoyageCameraPixelBlaze2629 = i2;
        this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageZoomStateAlphaVision6590;
        this.PolarVoyageSnackbarGammaEclipse2140 = new PolarVoyageZoomStateAlphaVision6590(27);
    }

    public final void PolarVoyageBitmapMaxTitanTitan7960() {
        HttpURLConnection httpURLConnection = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        HttpURLConnection httpURLConnection = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752 = this.PolarVoyageContentProviderHyperSpark3838;
        if (polarVoyagePlaceholderRogueTitanium7752 != null) {
            return polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0152 A[Catch: IOException -> 0x015d, TRY_LEAVE, TryCatch #5 {IOException -> 0x015d, blocks: (B:25:0x014a, B:27:0x0152), top: B:24:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        boolean z;
        long j;
        long j2;
        long parseLong;
        String str;
        this.PolarVoyageContentProviderHyperSpark3838 = polarVoyagePlaceholderRogueTitanium7752;
        this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = 0L;
        this.PolarVoyageDisplayMetricsVortexDragon9516 = 0L;
        PolarVoyageSnackbarGammaEclipse2140();
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageDisplayMetricsVortexDragon9516(new URL(polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185.toString()), polarVoyagePlaceholderRogueTitanium7752.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyagePlaceholderRogueTitanium7752.PolarVoyageKotlinBetaPulseBeta3653, polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735, (polarVoyagePlaceholderRogueTitanium7752.PolarVoyageTextInputEditTextNebulaHero6651 & 1) == 1, true, polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            long j3 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageDiffUtilTurboStrike5735;
            long j4 = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageDisplayMetricsVortexDragon9516;
            this.PolarVoyageBitmapMaxTitanTitan7960 = PolarVoyageDisplayMetricsVortexDragon9516.getResponseCode();
            PolarVoyageDisplayMetricsVortexDragon9516.getResponseMessage();
            int i = this.PolarVoyageBitmapMaxTitanTitan7960;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = PolarVoyageDisplayMetricsVortexDragon9516.getHeaderFields();
                if (this.PolarVoyageBitmapMaxTitanTitan7960 == 416) {
                    String headerField = PolarVoyageDisplayMetricsVortexDragon9516.getHeaderField("Content-Range");
                    Pattern pattern = PolarVoyageTraceHeroBlaze7534.PolarVoyageZipVortexCelestial6185;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = PolarVoyageTraceHeroBlaze7534.PolarVoyageMotionLayoutTransitionHeroVision4068.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j = Long.parseLong(group);
                        } else {
                            j = -1;
                        }
                    }
                    if (j4 == j) {
                        this.PolarVoyageAnimatorSetSparkUltraMax8233 = z;
                        PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = PolarVoyageDisplayMetricsVortexDragon9516.getErrorStream();
                try {
                    if (errorStream != null) {
                        PolarVoyageFilterPulseRogueSolar3191.PolarVoyageMotionLayoutTransitionHeroVision4068(errorStream);
                    } else {
                        String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                    }
                } catch (IOException unused) {
                    String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                }
                PolarVoyageBitmapMaxTitanTitan7960();
                throw new PolarVoyageBundleOmegaElite5533(this.PolarVoyageBitmapMaxTitanTitan7960, this.PolarVoyageBitmapMaxTitanTitan7960 == 416 ? new PolarVoyagePagingSourceFusionPhoenixThunder6968(2008) : null, headerFields);
            }
            PolarVoyageDisplayMetricsVortexDragon9516.getContentType();
            if (this.PolarVoyageBitmapMaxTitanTitan7960 != 200 || j4 == 0) {
                j4 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(PolarVoyageDisplayMetricsVortexDragon9516.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.PolarVoyageDisplayMetricsVortexDragon9516 = j3;
            } else if (j3 != -1) {
                this.PolarVoyageDisplayMetricsVortexDragon9516 = j3;
            } else {
                String headerField2 = PolarVoyageDisplayMetricsVortexDragon9516.getHeaderField("Content-Length");
                String headerField3 = PolarVoyageDisplayMetricsVortexDragon9516.getHeaderField("Content-Range");
                Pattern pattern2 = PolarVoyageTraceHeroBlaze7534.PolarVoyageZipVortexCelestial6185;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j2 = 0;
                        parseLong = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageRemoteModelManagerOlympianCelestial9141("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = PolarVoyageTraceHeroBlaze7534.PolarVoyageZipVortexCelestial6185.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong2 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                str = "]";
                                long parseLong3 = (parseLong2 - Long.parseLong(group3)) + 1;
                                if (parseLong < j2) {
                                    parseLong = parseLong3;
                                } else if (parseLong != parseLong3) {
                                    try {
                                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                        parseLong = Math.max(parseLong, parseLong3);
                                    } catch (NumberFormatException unused3) {
                                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageRemoteModelManagerOlympianCelestial9141("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                        this.PolarVoyageDisplayMetricsVortexDragon9516 = parseLong != -1 ? parseLong - j4 : -1L;
                                        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageDisplayMetricsVortexDragon9516.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.PolarVoyageAnimatorSetSparkUltraMax8233 = true;
                                        PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
                                        PolarVoyageLayerDrawableShadowTitaniumOmega1942(j4);
                                        return this.PolarVoyageDisplayMetricsVortexDragon9516;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                str = "]";
                            }
                        }
                    }
                    this.PolarVoyageDisplayMetricsVortexDragon9516 = parseLong != -1 ? parseLong - j4 : -1L;
                }
                j2 = 0;
                parseLong = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                this.PolarVoyageDisplayMetricsVortexDragon9516 = parseLong != -1 ? parseLong - j4 : -1L;
            }
            try {
                this.PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageDisplayMetricsVortexDragon9516.getInputStream();
                if (equalsIgnoreCase) {
                    this.PolarVoyageNavigationViewHyperHyperHyperion1793 = new GZIPInputStream(this.PolarVoyageNavigationViewHyperHyperHyperion1793);
                }
                this.PolarVoyageAnimatorSetSparkUltraMax8233 = true;
                PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
                try {
                    PolarVoyageLayerDrawableShadowTitaniumOmega1942(j4);
                    return this.PolarVoyageDisplayMetricsVortexDragon9516;
                } catch (IOException e) {
                    PolarVoyageBitmapMaxTitanTitan7960();
                    if (e instanceof PolarVoyageMotionLayoutTurboVortex2225) {
                        throw ((PolarVoyageMotionLayoutTurboVortex2225) e);
                    }
                    throw new PolarVoyageMotionLayoutTurboVortex2225(e, 2000, 1);
                }
            } catch (IOException e2) {
                PolarVoyageBitmapMaxTitanTitan7960();
                throw new PolarVoyageMotionLayoutTurboVortex2225(e2, 2000, 1);
            }
        } catch (IOException e3) {
            PolarVoyageBitmapMaxTitanTitan7960();
            throw PolarVoyageMotionLayoutTurboVortex2225.PolarVoyageZipVortexCelestial6185(e3, 1);
        }
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Map PolarVoyageDiffUtilTurboStrike5735() {
        HttpURLConnection httpURLConnection = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        return httpURLConnection == null ? PolarVoyageContentProviderNebulaVisionCyber2673.PolarVoyageDrawableDeltaHyperion5742 : new PolarVoyageToastPixelOlympian9562(httpURLConnection.getHeaderFields());
    }

    public final HttpURLConnection PolarVoyageDisplayMetricsVortexDragon9516(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.PolarVoyageViewRogueMaster4778);
        httpURLConnection.setReadTimeout(this.PolarVoyageCameraPixelBlaze2629);
        HashMap hashMap = new HashMap();
        PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590 = this.PolarVoyageDrawableDeltaHyperion5742;
        if (polarVoyageZoomStateAlphaVision6590 != null) {
            hashMap.putAll(polarVoyageZoomStateAlphaVision6590.PolarVoyageContentProviderHyperSpark3838());
        }
        hashMap.putAll(this.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageContentProviderHyperSpark3838());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = PolarVoyageTraceHeroBlaze7534.PolarVoyageZipVortexCelestial6185;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j2 != -1) {
                sb2.append((j + j2) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = PolarVoyagePlaceholderRogueTitanium7752.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096L);
            InputStream inputStream = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new PolarVoyageMotionLayoutTurboVortex2225(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new PolarVoyageMotionLayoutTurboVortex2225();
            }
            j -= read;
            PolarVoyageKotlinBetaPulseBeta3653(read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final void close() {
        try {
            InputStream inputStream = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                    throw new PolarVoyageMotionLayoutTurboVortex2225(e, 2000, 3);
                }
            }
        } finally {
            this.PolarVoyageNavigationViewHyperHyperHyperion1793 = null;
            PolarVoyageBitmapMaxTitanTitan7960();
            if (this.PolarVoyageAnimatorSetSparkUltraMax8233) {
                this.PolarVoyageAnimatorSetSparkUltraMax8233 = false;
                PolarVoyageStrictModeLegendEpic1532();
            }
            this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = null;
            this.PolarVoyageContentProviderHyperSpark3838 = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.PolarVoyageDisplayMetricsVortexDragon9516;
            if (j != -1) {
                long j2 = j - this.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 += read;
                PolarVoyageKotlinBetaPulseBeta3653(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            throw PolarVoyageMotionLayoutTurboVortex2225.PolarVoyageZipVortexCelestial6185(e, 2);
        }
    }
}
