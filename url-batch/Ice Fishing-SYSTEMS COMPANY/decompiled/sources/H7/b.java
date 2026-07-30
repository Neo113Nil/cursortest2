package H7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.android.gms.internal.ads.AbstractC2720Pd;
import com.google.android.gms.internal.ads.C3253gK;
import com.google.android.gms.internal.ads.C3893sF;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1216a;

    public /* synthetic */ b(int i) {
        this.f1216a = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:16|(4:31|32|23|24)|18|19|20|(4:25|26|23|24)|22|23|24) */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f1216a) {
            case 0:
                return new Random();
            case 1:
                return 0L;
            case 2:
                return ByteBuffer.allocate(32);
            case 3:
                try {
                    return (Cipher) C3253gK.f30981b.f30987a.d("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 4:
                try {
                    Cipher cipher = (Cipher) C3253gK.f30981b.f30987a.d("AES/GCM-SIV/NoPadding");
                    if (C3893sF.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 5:
                Provider e10 = AbstractC2720Pd.e();
                if (e10 != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", e10);
                    } catch (GeneralSecurityException unused) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]);
                if (provider != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } catch (GeneralSecurityException unused2) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                try {
                    return (Cipher) C3253gK.f30981b.f30987a.d("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 7:
                try {
                    return (Cipher) C3253gK.f30981b.f30987a.d("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 8:
                try {
                    return (Cipher) C3253gK.f30981b.f30987a.d("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 9:
                return new PathMeasure();
            case 10:
                return new Path();
            case 11:
                return new Path();
            case 12:
                return new float[4];
            case 13:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(f8.d.f37815a);
                return simpleDateFormat;
            default:
                return new m6.e();
        }
    }
}
