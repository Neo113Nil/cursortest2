package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzah extends zzar {
    private static boolean zzuu;
    private AdvertisingIdClient.Info zzuv;
    private final zzcz zzuw;
    private String zzux;
    private boolean zzuy;
    private final Object zzuz;

    zzah(zzat zzatVar) {
        super(zzatVar);
        this.zzuy = false;
        this.zzuz = new Object();
        this.zzuw = new zzcz(zzatVar.zzbt());
    }

    private final boolean zza(AdvertisingIdClient.Info info, AdvertisingIdClient.Info info2) {
        String str = null;
        String id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        String zzdn = zzcc().zzdn();
        synchronized (this.zzuz) {
            if (!this.zzuy) {
                this.zzux = zzbm();
                this.zzuy = true;
            } else if (TextUtils.isEmpty(this.zzux)) {
                if (info != null) {
                    str = info.getId();
                }
                if (str == null) {
                    String valueOf = String.valueOf(id);
                    String valueOf2 = String.valueOf(zzdn);
                    return zzp(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                }
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(zzdn);
                this.zzux = zzo(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            }
            String valueOf5 = String.valueOf(id);
            String valueOf6 = String.valueOf(zzdn);
            String zzo = zzo(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
            if (TextUtils.isEmpty(zzo)) {
                return false;
            }
            if (zzo.equals(this.zzux)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.zzux)) {
                zzq("Resetting the client id because Advertising Id changed.");
                zzdn = zzcc().zzdo();
                zza("New client Id", zzdn);
            }
            String valueOf7 = String.valueOf(id);
            String valueOf8 = String.valueOf(zzdn);
            return zzp(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7));
        }
    }

    private final synchronized AdvertisingIdClient.Info zzbk() {
        if (this.zzuw.zzj(1000L)) {
            this.zzuw.start();
            AdvertisingIdClient.Info zzbl = zzbl();
            if (!zza(this.zzuv, zzbl)) {
                zzu("Failed to reset client id on adid change. Not using adid");
                zzbl = new AdvertisingIdClient.Info("", false);
            }
            this.zzuv = zzbl;
        }
        return this.zzuv;
    }

    private final AdvertisingIdClient.Info zzbl() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(getContext());
        } catch (IllegalStateException unused) {
            zzt("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Throwable th) {
            if (!zzuu) {
                zzuu = true;
                zzd("Error getting advertiser id", th);
            }
            return null;
        }
    }

    private final String zzbm() {
        String str = null;
        try {
            FileInputStream openFileInput = getContext().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                zzt("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                getContext().deleteFile("gaClientIdData");
            } else if (read <= 0) {
                zzq("Hash file is empty.");
                openFileInput.close();
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e) {
                    e = e;
                    str = str2;
                    zzd("Error reading Hash file, deleting it", e);
                    getContext().deleteFile("gaClientIdData");
                    return str;
                }
                str = str2;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e2) {
            e = e2;
        }
        return str;
    }

    private static String zzo(String str) {
        MessageDigest messageDigest = zzdd.getMessageDigest("MD5");
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(str.getBytes())));
    }

    private final boolean zzp(String str) {
        try {
            String zzo = zzo(str);
            zzq("Storing hashed adid.");
            FileOutputStream openFileOutput = getContext().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zzo.getBytes());
            openFileOutput.close();
            this.zzux = zzo;
            return true;
        } catch (IOException e) {
            zze("Error creating hash file", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final boolean zzbc() {
        zzch();
        AdvertisingIdClient.Info zzbk = zzbk();
        return (zzbk == null || zzbk.isLimitAdTrackingEnabled()) ? false : true;
    }

    public final String zzbj() {
        zzch();
        AdvertisingIdClient.Info zzbk = zzbk();
        String id = zzbk != null ? zzbk.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }
}
