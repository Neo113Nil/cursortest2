package p000createpolar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364 {
    public final SharedPreferences PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.PolarVoyageZipVortexCelestial6185 = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public synchronized String PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        instant = new Date(j).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public synchronized String PolarVoyageBitmapVisionAuroraPixel4705(String str) {
        for (Map.Entry<String, ?> entry : this.PolarVoyageZipVortexCelestial6185.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized void PolarVoyageDiffUtilTurboStrike5735(String str) {
        try {
            String PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(str);
            if (PolarVoyageBitmapVisionAuroraPixel4705 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.PolarVoyageZipVortexCelestial6185.getStringSet(PolarVoyageBitmapVisionAuroraPixel4705, new HashSet()));
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = this.PolarVoyageZipVortexCelestial6185;
            if (isEmpty) {
                sharedPreferences.edit().remove(PolarVoyageBitmapVisionAuroraPixel4705).commit();
            } else {
                sharedPreferences.edit().putStringSet(PolarVoyageBitmapVisionAuroraPixel4705, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void PolarVoyageItemDecorationUltraDeltaEpic7485(String str, long j) {
        String PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
        if (this.PolarVoyageZipVortexCelestial6185.getString("last-used-date", "").equals(PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
            String PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            if (PolarVoyageBitmapVisionAuroraPixel4705 == null) {
                return;
            }
            if (PolarVoyageBitmapVisionAuroraPixel4705.equals(str)) {
                return;
            }
            PolarVoyageStrictModeLegendEpic1532(str, PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            return;
        }
        long j2 = this.PolarVoyageZipVortexCelestial6185.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            PolarVoyageZipVortexCelestial6185();
            j2 = this.PolarVoyageZipVortexCelestial6185.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.PolarVoyageZipVortexCelestial6185.getStringSet(str, new HashSet()));
        hashSet.add(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        this.PolarVoyageZipVortexCelestial6185.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", PolarVoyageBarcodeScannerInfernoSolarSpark7767).commit();
    }

    public synchronized ArrayList PolarVoyageKotlinBetaPulseBeta3653() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.PolarVoyageZipVortexCelestial6185.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(PolarVoyageBarcodeScannerInfernoSolarSpark7767(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new PolarVoyageFirestoreSolarOlympian2330(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.PolarVoyageZipVortexCelestial6185.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        try {
            SharedPreferences.Editor edit = this.PolarVoyageZipVortexCelestial6185.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.PolarVoyageZipVortexCelestial6185.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void PolarVoyageStrictModeLegendEpic1532(String str, String str2) {
        PolarVoyageDiffUtilTurboStrike5735(str2);
        HashSet hashSet = new HashSet(this.PolarVoyageZipVortexCelestial6185.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.PolarVoyageZipVortexCelestial6185.edit().putStringSet(str, hashSet).commit();
    }

    public synchronized boolean PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        boolean contains = this.PolarVoyageZipVortexCelestial6185.contains("fire-global");
        SharedPreferences sharedPreferences = this.PolarVoyageZipVortexCelestial6185;
        if (!contains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767(j2).equals(PolarVoyageBarcodeScannerInfernoSolarSpark7767(j))) {
                return false;
            }
            this.PolarVoyageZipVortexCelestial6185.edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void PolarVoyageZipVortexCelestial6185() {
        try {
            long j = this.PolarVoyageZipVortexCelestial6185.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.PolarVoyageZipVortexCelestial6185.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.PolarVoyageZipVortexCelestial6185.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.PolarVoyageZipVortexCelestial6185.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public PolarVoyageDigitalInkRecognitionNebulaLegendTitanium8364(Context context, String str) {
        this.PolarVoyageZipVortexCelestial6185 = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }
}
