package p000createpolar;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBottomSheetForcePrime4164 {
    public static final Pattern PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Pattern.compile("[0-9]+s");
    public static final Charset PolarVoyageBitmapVisionAuroraPixel4705 = Charset.forName(Constants.ENCODING);
    public final PolarVoyageFragmentManagerForceRogueCyber8904 PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Context PolarVoyageZipVortexCelestial6185;

    public PolarVoyageBottomSheetForcePrime4164(Context context, PolarVoyageRemoteConfigEliteSpectra7350 polarVoyageRemoteConfigEliteSpectra7350) {
        this.PolarVoyageZipVortexCelestial6185 = context;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageRemoteConfigEliteSpectra7350;
        PolarVoyageFragmentManagerForceRogueCyber8904 polarVoyageFragmentManagerForceRogueCyber8904 = new PolarVoyageFragmentManagerForceRogueCyber8904();
        if (PolarVoyageServiceInfoNovaCyber2044.PolarVoyageStrictModeLegendEpic1532 == null) {
            Pattern pattern = PolarVoyageJobIntentServiceFusionMax9020.PolarVoyageMotionLayoutTransitionHeroVision4068;
            PolarVoyageServiceInfoNovaCyber2044.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageServiceInfoNovaCyber2044(4);
        }
        PolarVoyageServiceInfoNovaCyber2044 polarVoyageServiceInfoNovaCyber2044 = PolarVoyageServiceInfoNovaCyber2044.PolarVoyageStrictModeLegendEpic1532;
        if (PolarVoyageJobIntentServiceFusionMax9020.PolarVoyageKotlinBetaPulseBeta3653 == null) {
            PolarVoyageJobIntentServiceFusionMax9020.PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageJobIntentServiceFusionMax9020(polarVoyageServiceInfoNovaCyber2044);
        }
        polarVoyageFragmentManagerForceRogueCyber8904.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageJobIntentServiceFusionMax9020.PolarVoyageKotlinBetaPulseBeta3653;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageFragmentManagerForceRogueCyber8904;
    }

    public static long PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str) {
        if (!PolarVoyageBarcodeScannerInfernoSolarSpark7767.matcher(str).matches()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Invalid Expiration Timestamp.");
            return 0L;
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static PolarVoyageDrawableCompatLegendThunder4543 PolarVoyageBitmapVisionAuroraPixel4705(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, PolarVoyageBitmapVisionAuroraPixel4705));
        PolarVoyageImageCaptureShadowBlaze1163 PolarVoyageZipVortexCelestial6185 = PolarVoyageLooperGammaInferno3959.PolarVoyageZipVortexCelestial6185();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        PolarVoyageLooperGammaInferno3959 polarVoyageLooperGammaInferno3959 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        PolarVoyageZipVortexCelestial6185.PolarVoyageBottomSheetOmegaNeo1907 = Long.valueOf(PolarVoyageBarcodeScannerInfernoSolarSpark7767(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                PolarVoyageLooperGammaInferno3959 PolarVoyageZipVortexCelestial61852 = PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185();
                jsonReader.endObject();
                polarVoyageLooperGammaInferno3959 = PolarVoyageZipVortexCelestial61852;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new PolarVoyageDrawableCompatLegendThunder4543(str, str2, str3, polarVoyageLooperGammaInferno3959, 1);
    }

    public static PolarVoyageLooperGammaInferno3959 PolarVoyageDiffUtilTurboStrike5735(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, PolarVoyageBitmapVisionAuroraPixel4705));
        PolarVoyageImageCaptureShadowBlaze1163 PolarVoyageZipVortexCelestial6185 = PolarVoyageLooperGammaInferno3959.PolarVoyageZipVortexCelestial6185();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                PolarVoyageZipVortexCelestial6185.PolarVoyageBottomSheetOmegaNeo1907 = Long.valueOf(PolarVoyageBarcodeScannerInfernoSolarSpark7767(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532 = 1;
        return PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185();
    }

    public static void PolarVoyageItemDecorationUltraDeltaEpic7485(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            PolarVoyageStrictModeLegendEpic1532(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String str4;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str5 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, PolarVoyageBitmapVisionAuroraPixel4705));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str5 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str5)) {
            return;
        }
        Log.w("Firebase-Installations", str5);
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + str4);
    }

    public static void PolarVoyageStrictModeLegendEpic1532(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void PolarVoyageTextInputEditTextNebulaHero6651(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            PolarVoyageStrictModeLegendEpic1532(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static URL PolarVoyageZipVortexCelestial6185(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            throw new PolarVoyageFlipAnimationPhoenixVisionInferno4063(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[Catch: NameNotFoundException -> 0x00c2, TryCatch #2 {NameNotFoundException -> 0x00c2, blocks: (B:8:0x006a, B:10:0x0082, B:17:0x008c, B:21:0x0099, B:23:0x00a9, B:27:0x00c4, B:29:0x00ce, B:31:0x00e7), top: B:7:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4 A[Catch: NameNotFoundException -> 0x00c2, TryCatch #2 {NameNotFoundException -> 0x00c2, blocks: (B:8:0x006a, B:10:0x0082, B:17:0x008c, B:21:0x0099, B:23:0x00a9, B:27:0x00c4, B:29:0x00ce, B:31:0x00e7), top: B:7:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection PolarVoyageKotlinBetaPulseBeta3653(URL url, String str) {
        PackageInfo packageInfo;
        Signature[] signatureArr;
        byte[] bArr;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.PolarVoyageZipVortexCelestial6185;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            PolarVoyageConstraintSetDeltaOmega5946 polarVoyageConstraintSetDeltaOmega5946 = (PolarVoyageConstraintSetDeltaOmega5946) this.PolarVoyageMotionLayoutTransitionHeroVision4068.get();
            if (polarVoyageConstraintSetDeltaOmega5946 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageBarcodeScannerInfernoSolarSpark7767(((PolarVoyageColorDrawableSpectraSolarMega2051) polarVoyageConstraintSetDeltaOmega5946).PolarVoyageZipVortexCelestial6185()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            String str2 = null;
            try {
                packageInfo = PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185(context).PolarVoyageItemDecorationUltraDeltaEpic7485.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                signatureArr = packageInfo.signatures;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e3);
            }
            if (signatureArr != null && signatureArr.length == 1) {
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        messageDigest = null;
                        break;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i++;
                }
                if (messageDigest != null) {
                    bArr = messageDigest.digest(packageInfo.signatures[0].toByteArray());
                    if (bArr != null) {
                        Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    } else {
                        int length = bArr.length;
                        StringBuilder sb = new StringBuilder(length + length);
                        for (int i2 = 0; i2 < length; i2++) {
                            char[] cArr = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
                            sb.append(cArr[bArr[i2] & 15]);
                        }
                        str2 = sb.toString();
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            bArr = null;
            if (bArr != null) {
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new PolarVoyageFlipAnimationPhoenixVisionInferno4063("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
