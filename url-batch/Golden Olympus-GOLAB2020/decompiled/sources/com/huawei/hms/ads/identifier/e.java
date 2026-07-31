package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import t0.AbstractC3424a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13887a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f13888b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private static SoftReference f13889c;

    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f13890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13891c;

        a(b bVar, String str) {
            this.f13890b = bVar;
            this.f13891c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13890b.i(this.f13891c);
        }
    }

    public static class b {

        /* renamed from: h, reason: collision with root package name */
        private static final Long f13892h = 120000L;

        /* renamed from: i, reason: collision with root package name */
        private static final byte[] f13893i = new byte[0];

        /* renamed from: j, reason: collision with root package name */
        private static volatile b f13894j;

        /* renamed from: a, reason: collision with root package name */
        private SharedPreferences f13895a;

        /* renamed from: b, reason: collision with root package name */
        private SharedPreferences f13896b;

        /* renamed from: c, reason: collision with root package name */
        private SharedPreferences f13897c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f13898d = new byte[0];

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f13899e = new byte[0];

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f13900f = new byte[0];

        /* renamed from: g, reason: collision with root package name */
        private Context f13901g;

        private b(Context context) {
            this.f13895a = null;
            this.f13896b = null;
            this.f13897c = null;
            try {
                this.f13901g = context.getApplicationContext();
                Context a4 = f.a(context);
                this.f13895a = a4.getSharedPreferences("identifier_sp_story_book_file", 4);
                this.f13896b = a4.getSharedPreferences("identifier_hiad_sp_bed_rock_file", 4);
                this.f13897c = a4.getSharedPreferences("identifier_hiad_sp_red_stone_file", 4);
            } catch (Throwable th) {
                Log.w("Aes128", "get SharedPreference error: " + th.getClass().getSimpleName());
            }
        }

        public static b a(Context context) {
            b bVar;
            if (f13894j != null) {
                return f13894j;
            }
            synchronized (f13893i) {
                try {
                    if (f13894j == null) {
                        f13894j = new b(context);
                    }
                    bVar = f13894j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }

        public String b() {
            String string;
            synchronized (this.f13899e) {
                try {
                    SharedPreferences sharedPreferences = this.f13897c;
                    if (sharedPreferences == null) {
                        string = "";
                    } else {
                        string = sharedPreferences.getString("read_first_chapter", "");
                        if (!TextUtils.isEmpty(string)) {
                            string = e.c(string, e.g(this.f13901g));
                        }
                    }
                } finally {
                }
            }
            return string;
        }

        public void c(String str) {
            synchronized (this.f13899e) {
                try {
                    if (this.f13897c != null) {
                        this.f13897c.edit().putString("read_first_chapter", e.q(str, e.g(this.f13901g))).apply();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d() {
            synchronized (this.f13900f) {
                try {
                    SharedPreferences sharedPreferences = this.f13895a;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putLong("read_first_chapter_time", System.currentTimeMillis()).apply();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void e(String str) {
            synchronized (this.f13898d) {
                try {
                    SharedPreferences sharedPreferences = this.f13896b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("get_a_book", str).commit();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void f(String str) {
            synchronized (this.f13900f) {
                try {
                    SharedPreferences sharedPreferences = this.f13895a;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("catch_a_cat", str).commit();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean g() {
            boolean z4;
            synchronized (this.f13900f) {
                try {
                    SharedPreferences sharedPreferences = this.f13895a;
                    z4 = false;
                    if (sharedPreferences != null) {
                        long j4 = sharedPreferences.getLong("read_first_chapter_time", -1L);
                        if (j4 >= 0 && j4 + f13892h.longValue() > System.currentTimeMillis()) {
                            z4 = true;
                        }
                    }
                } finally {
                }
            }
            return z4;
        }

        public void h() {
            synchronized (this.f13900f) {
                try {
                    SharedPreferences sharedPreferences = this.f13895a;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putBoolean("has_read_first_chapter", true).apply();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void i(String str) {
            synchronized (this.f13900f) {
                this.f13895a.edit().putString("read_second_chapter", str).apply();
            }
        }

        public boolean j() {
            synchronized (this.f13900f) {
                try {
                    SharedPreferences sharedPreferences = this.f13895a;
                    if (sharedPreferences == null) {
                        return false;
                    }
                    return sharedPreferences.getBoolean("has_read_first_chapter", false);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        String k() {
            synchronized (this.f13898d) {
                try {
                    SharedPreferences sharedPreferences = this.f13896b;
                    if (sharedPreferences == null) {
                        return null;
                    }
                    return sharedPreferences.getString("get_a_book", null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        String l() {
            synchronized (this.f13900f) {
                try {
                    SharedPreferences sharedPreferences = this.f13895a;
                    if (sharedPreferences == null) {
                        return null;
                    }
                    String string = sharedPreferences.getString("catch_a_cat", null);
                    if (string == null) {
                        string = e.d(e.e());
                        f(string);
                    }
                    return string;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public String m() {
            String string;
            synchronized (this.f13900f) {
                string = this.f13895a.getString("read_second_chapter", "");
            }
            return string;
        }
    }

    private static String A(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16 && C()) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                String u4 = u(str);
                String z4 = z(str);
                if (TextUtils.isEmpty(u4) || TextUtils.isEmpty(z4)) {
                    Log.i("Aes128", "ivParameter or encrypedWord is null");
                    return "";
                }
                cipher.init(2, secretKeySpec, B(i(u4)));
                return new String(cipher.doFinal(i(z4)), "UTF-8");
            } catch (UnsupportedEncodingException e4) {
                e = e4;
                Log.e("Aes128", "GCM decrypt data exception: " + e.getMessage());
                return "";
            } catch (GeneralSecurityException e5) {
                e = e5;
                Log.e("Aes128", "GCM decrypt data exception: " + e.getMessage());
                return "";
            }
        }
        return "";
    }

    private static AlgorithmParameterSpec B(byte[] bArr) {
        return new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr);
    }

    private static boolean C() {
        return true;
    }

    private static byte[] D(Context context) {
        String str;
        if (context == null) {
            return new byte[0];
        }
        b a4 = b.a(context);
        try {
            return n(d(E(context)).toCharArray(), i(a4.l()));
        } catch (NoSuchAlgorithmException unused) {
            str = "get userRootKey NoSuchAlgorithmException";
            Log.w("Aes128", str);
            return null;
        } catch (InvalidKeySpecException unused2) {
            str = "get userRootKey InvalidKeySpecException";
            Log.w("Aes128", str);
            return null;
        }
    }

    private static byte[] E(Context context) {
        return h(context, F(context));
    }

    private static String F(Context context) {
        b a4 = b.a(context);
        String m4 = a4.m();
        if (!TextUtils.isEmpty(m4)) {
            return m4;
        }
        String o4 = o(64);
        f.f13902a.execute(new a(a4, o4));
        return o4;
    }

    private static String a(Context context, b bVar) {
        String d4 = d(s());
        bVar.e(q(d4, D(context)));
        return d4;
    }

    public static String b(String str, String str2) {
        String c4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (f13887a) {
            try {
                try {
                    c4 = c(str, t(str2));
                } catch (Throwable th) {
                    Log.w("Aes128", "decrypt oaid ex: " + th.getClass().getSimpleName());
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4;
    }

    public static String c(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && str.length() >= 32 && bArr != null && bArr.length != 0) {
            try {
                if (C()) {
                    return A(str, bArr);
                }
            } catch (Throwable th) {
                Log.w("Aes128", "fail to decrypt: " + th.getClass().getSimpleName());
            }
        }
        return "";
    }

    public static String d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] e() {
        return f(16);
    }

    public static byte[] f(int i4) {
        byte[] bArr = new byte[i4];
        w().nextBytes(bArr);
        return bArr;
    }

    public static byte[] g(Context context) {
        byte[] bArr;
        byte[] y4;
        synchronized (f13888b) {
            SoftReference softReference = f13889c;
            bArr = softReference != null ? (byte[]) softReference.get() : null;
            if (bArr == null) {
                try {
                    y4 = t(p(context));
                } catch (UnsupportedEncodingException unused) {
                    Log.w("Aes128", "getWorkKeyBytes UnsupportedEncodingException");
                    y4 = y(context);
                    bArr = y4;
                    f13889c = new SoftReference(bArr);
                    return bArr;
                } catch (Throwable th) {
                    Log.w("Aes128", "getWorkKeyBytes " + th.getClass().getSimpleName());
                    y4 = y(context);
                    bArr = y4;
                    f13889c = new SoftReference(bArr);
                    return bArr;
                }
                bArr = y4;
                f13889c = new SoftReference(bArr);
            }
        }
        return bArr;
    }

    private static byte[] h(Context context, String str) {
        return j(str, context.getString(AbstractC3424a.f46198a), context.getString(AbstractC3424a.f46199b));
    }

    public static byte[] i(String str) {
        byte[] bArr = new byte[0];
        try {
            return t(str);
        } catch (Throwable th) {
            Log.e("Aes128", "hex string 2 byte: " + th.getClass().getSimpleName());
            return bArr;
        }
    }

    private static byte[] j(String str, String str2, String str3) {
        byte[] i4 = i(str);
        byte[] i5 = i(str2);
        return l(l(i4, i5), i(str3));
    }

    private static byte[] k(String str, byte[] bArr, byte[] bArr2) {
        if (!TextUtils.isEmpty(str) && x(bArr) && r(bArr2) && C()) {
            try {
                return m(str.getBytes("UTF-8"), bArr, bArr2);
            } catch (UnsupportedEncodingException e4) {
                Log.e("Aes128", "GCM encrypt data error" + e4.getMessage());
            }
        } else {
            Log.i("Aes128", "gcm encrypt param is not right");
        }
        return new byte[0];
    }

    private static byte[] l(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= bArr2.length) {
            bArr2 = bArr;
            bArr = bArr2;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length];
        int i4 = 0;
        while (i4 < length2) {
            bArr3[i4] = (byte) (bArr2[i4] ^ bArr[i4]);
            i4++;
        }
        while (i4 < bArr.length) {
            bArr3[i4] = bArr[i4];
            i4++;
        }
        return bArr3;
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        if (bArr == null || bArr.length == 0) {
            str = "encrypt, contentBytes invalid.";
        } else if (bArr2 == null || bArr2.length < 16) {
            str = "encrypt, keyBytes invalid.";
        } else if (!C()) {
            str = "encrypt, osVersion too low.";
        } else if (bArr3 == null || bArr3.length < 12) {
            str = "encrypt, random invalid.";
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, B(bArr3));
                return cipher.doFinal(bArr);
            } catch (GeneralSecurityException e4) {
                Log.e("Aes128", "GCM encrypt data error" + e4.getMessage());
            }
        }
        Log.i("Aes128", str);
        return new byte[0];
    }

    public static byte[] n(char[] cArr, byte[] bArr) {
        return SecretKeyFactory.getInstance(Build.VERSION.SDK_INT > 26 ? "PBKDF2WithHmacSHA256" : "PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, 10000, UserVerificationMethods.USER_VERIFY_HANDPRINT)).getEncoded();
    }

    private static String o(int i4) {
        try {
            SecureRandom w4 = w();
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(Integer.toHexString(w4.nextInt(16)));
            }
            return sb.toString();
        } catch (Throwable th) {
            Log.w("Aes128", "generate aes key1 err:" + th.getClass().getSimpleName());
            return "";
        }
    }

    private static String p(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        synchronized (f13888b) {
            try {
                b a4 = b.a(context);
                String k4 = a4.k();
                if (k4 != null) {
                    String c4 = c(k4, D(context));
                    if (!TextUtils.isEmpty(c4)) {
                        str = c4;
                    }
                }
                str = a(context, a4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String q(String str, byte[] bArr) {
        StringBuilder sb;
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length != 0) {
            try {
                if (C()) {
                    return v(str, bArr);
                }
            } catch (Exception e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append("fail to cipher: ");
                sb.append(e.getClass().getSimpleName());
                Log.w("Aes128", sb.toString());
                return "";
            } catch (Throwable th) {
                e = th;
                sb = new StringBuilder();
                sb.append("fail to cipher: ");
                sb.append(e.getClass().getSimpleName());
                Log.w("Aes128", sb.toString());
                return "";
            }
        }
        return "";
    }

    private static boolean r(byte[] bArr) {
        return bArr != null && bArr.length >= 12;
    }

    public static byte[] s() {
        return f(16);
    }

    public static byte[] t(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = upperCase.getBytes("UTF-8");
        for (int i4 = 0; i4 < length; i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append("0x");
            int i5 = i4 * 2;
            sb.append(new String(new byte[]{bytes[i5]}, "UTF-8"));
            bArr[i4] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i5 + 1]}, "UTF-8")).byteValue());
        }
        return bArr;
    }

    private static String u(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(0, 24);
        }
        Log.i("Aes128", "IV is invalid.");
        return "";
    }

    private static String v(String str, byte[] bArr) {
        byte[] f4;
        byte[] k4;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16 || !C() || (k4 = k(str, bArr, (f4 = f(12)))) == null || k4.length == 0) {
            return "";
        }
        return d(f4) + d(k4);
    }

    private static SecureRandom w() {
        SecureRandom secureRandom;
        try {
            secureRandom = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception e4) {
            Log.w("Aes128", "getInstanceStrong, exception: " + e4.getClass().getSimpleName());
            secureRandom = null;
        }
        return secureRandom == null ? new SecureRandom() : secureRandom;
    }

    private static boolean x(byte[] bArr) {
        return bArr != null && bArr.length >= 16;
    }

    private static byte[] y(Context context) {
        Log.i("Aes128", "regenerateWorkKey");
        b.a(context).e("");
        return i(p(context));
    }

    private static String z(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 24) ? "" : str.substring(24);
    }
}
