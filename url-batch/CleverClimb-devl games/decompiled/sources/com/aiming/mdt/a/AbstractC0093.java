package com.aiming.mdt.a;

import com.google.android.gms.gcm.Task;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0093 {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f266 = 1;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f267 = 0;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static char[] f268 = {48826, 30494, 11749, 21254, 39615, 49225, 4080, 56592, 5265, 20069, 33175, 64436, 11528, 25729, 24193, 36864, 52223, 15701, 30537, 'U', 51700, 37632, 23729, 9975, 61520, 47498, 33775, 19795, 5794, 57365, 43597, 29606, 15694, 1917, 53449, 39488, 25672, 11737, 63294, 49300, 35506, 21511, 7554, 59381, 45397, 31415, 17570, 3686, 55211, 41216, 27501, 13487, 65044, 51303, 37276, 'H', 51666, 37688, 23682, 9912, 61529, 47489, 33790, 19828, 5815, 57352, 43587, 29672, 15627, 1894, 53448, 39439, 25716, 11670, 30858, 45327, 60393, 9301, 24106, 34961, 49485, 64290, 'R', 51651, 37674, 23680, 9981, 61517, 47500, 'R', 51651, 37693, 23687, 9981, 61517, 47504, 33712, 41424, 37117, 22805, 986, 52337, 46606, 24819, '\n', 51694, 37673, 23699, 9980, 61531, 47510, 33712};

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static long f269 = 7227180451341978022L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f272 = m357(48893, 3, 0).intern();

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f270 = m357(21334, 4, 3).intern();

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f275 = 30000;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected URLConnection f274 = null;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected String f271 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected C0090 f273 = null;

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m351(HashMap<String, String> hashMap) {
        if ((hashMap != null ? 'X' : 'E') != 'E') {
            int i = f267 + 25;
            f266 = i % 128;
            if (i % 2 == 0) {
            }
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                int i2 = f267 + 123;
                f266 = i2 % 128;
                int i3 = i2 % 2;
                this.f274.setRequestProperty(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private void m352(C0145 c0145) {
        int i = f267 + 89;
        f266 = i % 128;
        int i2 = i % 2;
        this.f274.setConnectTimeout(this.f275);
        this.f274.setReadTimeout(this.f275);
        this.f274.setUseCaches(false);
        this.f274.setDoInput(c0145.m567());
        mo20(c0145);
        int i3 = f266 + 35;
        f267 = i3 % 128;
        if (i3 % 2 != 0) {
        }
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static void m353(C0145 c0145) {
        m357((char) 0, 8, 89).intern();
        m357((char) 41450, 1, 97).intern();
        if (c0145.m557() != null) {
            int i = f267 + 93;
            f266 = i % 128;
            int i2 = i % 2;
            c0145.m557();
        } else {
            c0145.m563();
        }
        if (c0145.m560() != null) {
            int i3 = f266 + 55;
            f267 = i3 % 128;
            ((i3 % 2 != 0 ? 'T' : '3') != '3' ? m357((char) 37111, 13, 99) : m357((char) 37111, 6, 98)).intern();
            c0145.m560();
        }
        if ((c0145.m566() != null ? 'M' : (char) 6) == 'M') {
            int i4 = f267 + 61;
            f266 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = f266 + 51;
            f267 = i6 % 128;
            int i7 = i6 % 2;
            for (Map.Entry<String, String> entry : c0145.m566().entrySet()) {
                int i8 = f267 + 97;
                f266 = i8 % 128;
                int i9 = i8 % 2;
                m357((char) 0, 8, 104).intern();
                entry.getKey();
                m357((char) 41450, 1, 97).intern();
                entry.getValue();
            }
        }
        C0044.m108();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private C0090 m354() {
        this.f273 = new C0090();
        this.f273.m324(this.f274.getURL());
        this.f273.m330(this.f274.getHeaderFields());
        this.f273.m323(this.f274.getHeaderField(m357((char) 30918, 8, 74).intern()));
        this.f273.m327(this.f274.getHeaderField(m357((char) 0, 7, 82).intern()));
        C0090 mo19 = mo19();
        int i = f267 + 3;
        f266 = i % 128;
        if (!(i % 2 == 0)) {
        }
        return mo19;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private void m355(byte[] bArr) {
        int i = f267 + 63;
        f266 = i % 128;
        int i2 = i % 2;
        if (!(bArr == null)) {
            int i3 = f266 + 111;
            f267 = i3 % 128;
            if (i3 % 2 != 0) {
            }
            this.f274.setDoOutput(true);
            OutputStream outputStream = this.f274.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            outputStream.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r1 = '(';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        r0 = m358(new java.net.URL(r4.m557()));
        r1 = com.aiming.mdt.a.AbstractC0093.f267 + 39;
        com.aiming.mdt.a.AbstractC0093.f266 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.m557()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.m557()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (r4.m563() == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r1 = 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r1 == '(') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        r0 = m358(r4.m563().toURL());
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0090 m356(C0145 c0145) {
        URLConnection m358;
        int i = f267 + 55;
        f266 = i % 128;
        if (i % 2 == 0) {
            m353(c0145);
        } else {
            m353(c0145);
        }
        if (m358 == null) {
            throw new NullPointerException(m357((char) 56645, 12, 7).intern());
        }
        m352(c0145);
        m351(c0145.m566());
        m355(c0145.m560());
        return m354();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m357(char c2, int i, int i2) {
        int i3 = f267 + 55;
        f266 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i];
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                return new String(cArr);
            }
            int i6 = f266 + 111;
            f267 = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((f268[i2 + i5] ^ (i5 * f269)) ^ c2);
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r4 = r3.f274;
        r0 = com.aiming.mdt.a.AbstractC0093.f267 + 51;
        com.aiming.mdt.a.AbstractC0093.f266 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r3.f274 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3.f274 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        throw new java.net.ConnectException(m357(0, 36, 19).intern());
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private URLConnection m358(URL url) {
        int i = f267 + 111;
        f266 = i % 128;
        if (!(i % 2 == 0)) {
            this.f274 = url.openConnection();
        } else {
            this.f274 = url.openConnection();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected static byte[] m359(InputStream inputStream, int i) {
        if (i == -1) {
            i = Task.EXTRAS_LIMIT_BYTES;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if ((read != -1 ? '+' : 'E') != '+') {
                        break;
                    }
                    int i2 = f267 + 25;
                    f266 = i2 % 128;
                    if (i2 % 2 == 0) {
                        byteArrayOutputStream.write(bArr, 1, read);
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                if ((inputStream != null ? (char) 23 : 'b') != 'b') {
                    int i3 = f267 + 105;
                    f266 = i3 % 128;
                    int i4 = i3 % 2;
                    inputStream.close();
                }
                return byteArray;
            } catch (Exception e) {
                m357((char) 0, 19, 55).intern();
                C0044.m109();
                throw e;
            }
        } catch (Throwable th) {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final C0090 m360(C0145 c0145) {
        C0090 m356;
        int i = f266 + 45;
        f267 = i % 128;
        Object obj = null;
        if (i % 2 == 0) {
            m356 = m356(c0145);
        } else {
            m356 = m356(c0145);
            super.hashCode();
        }
        int i2 = f267 + 17;
        f266 = i2 % 128;
        if ((i2 % 2 == 0 ? 'H' : '*') == '*') {
            return m356;
        }
        super.hashCode();
        return m356;
    }

    /* renamed from: ʻʼ */
    abstract C0090 mo19();

    /* renamed from: ʻʽ */
    abstract void mo20(C0145 c0145);

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0090 m361(C0145 c0145) {
        int i = f266 + 111;
        f267 = i % 128;
        int i2 = i % 2;
        this.f271 = this.f270;
        C0090 m356 = m356(c0145);
        int i3 = f266 + 39;
        f267 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return m356;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0090 m362(C0145 c0145, String str) {
        int i = f267 + 19;
        f266 = i % 128;
        int i2 = i % 2;
        this.f271 = str;
        C0090 m356 = m356(c0145);
        int i3 = f266 + 69;
        f267 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return m356;
    }
}
