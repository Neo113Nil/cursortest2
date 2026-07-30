package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class B0 implements F2 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23937n;

    /* renamed from: u, reason: collision with root package name */
    public int f23938u;

    /* renamed from: v, reason: collision with root package name */
    public int f23939v;

    /* renamed from: w, reason: collision with root package name */
    public int f23940w;

    /* renamed from: x, reason: collision with root package name */
    public int f23941x;

    /* renamed from: y, reason: collision with root package name */
    public Object f23942y;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
    
        if (r5.h(1) > 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b A[Catch: RuntimeException -> 0x024f, TryCatch #0 {RuntimeException -> 0x024f, blocks: (B:3:0x0009, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0083, B:18:0x00c9, B:20:0x00d7, B:22:0x00e5, B:24:0x010d, B:26:0x0113, B:28:0x0124, B:30:0x012d, B:32:0x0135, B:34:0x0146, B:36:0x0153, B:38:0x0164, B:40:0x016a, B:42:0x017b, B:44:0x0181, B:46:0x0192, B:48:0x019a, B:50:0x01a4, B:52:0x01a7, B:55:0x01a9, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d1, B:64:0x01de, B:66:0x01e4, B:68:0x01e9, B:69:0x01ec, B:72:0x01f7, B:73:0x01fe, B:76:0x0205, B:78:0x020b, B:80:0x0217, B:87:0x023a, B:90:0x0245, B:94:0x0236, B:99:0x01d8), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0217 A[Catch: RuntimeException -> 0x024f, TryCatch #0 {RuntimeException -> 0x024f, blocks: (B:3:0x0009, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0083, B:18:0x00c9, B:20:0x00d7, B:22:0x00e5, B:24:0x010d, B:26:0x0113, B:28:0x0124, B:30:0x012d, B:32:0x0135, B:34:0x0146, B:36:0x0153, B:38:0x0164, B:40:0x016a, B:42:0x017b, B:44:0x0181, B:46:0x0192, B:48:0x019a, B:50:0x01a4, B:52:0x01a7, B:55:0x01a9, B:57:0x01bf, B:58:0x01c5, B:60:0x01ce, B:61:0x01d1, B:64:0x01de, B:66:0x01e4, B:68:0x01e9, B:69:0x01ec, B:72:0x01f7, B:73:0x01fe, B:76:0x0205, B:78:0x020b, B:80:0x0217, B:87:0x023a, B:90:0x0245, B:94:0x0236, B:99:0x01d8), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static B0 e(byte[] bArr) {
        int i;
        int i4;
        int h9;
        try {
            Er er = new Er(bArr, bArr.length);
            er.e();
            int h10 = er.h(7);
            if (h10 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(h10).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(h10);
                AbstractC3217fl.I("Av1Config", sb.toString());
                return null;
            }
            int h11 = er.h(3);
            int h12 = er.h(5);
            boolean g9 = er.g();
            int i9 = er.g() ? true != er.g() ? 10 : 12 : 8;
            er.f(13);
            Object[] objArr = {Integer.valueOf(h12)};
            String str = AbstractC3548lu.f32613a;
            Locale locale = Locale.US;
            String format = String.format(locale, "%02d", objArr);
            String str2 = true != g9 ? "M" : "H";
            String format2 = String.format(locale, "%02d", Integer.valueOf(i9));
            StringBuilder sb2 = new StringBuilder(String.valueOf(h11).length() + 6 + format.length() + 2 + format2.length());
            sb2.append("av01.");
            sb2.append(h11);
            sb2.append(com.anythink.core.common.d.j.f12535z);
            sb2.append(format);
            sb2.append(str2);
            sb2.append(com.anythink.core.common.d.j.f12535z);
            sb2.append(format2);
            String sb3 = sb2.toString();
            if (er.b() <= 0) {
                return new B0(sb3, i9, -1, -1, -1);
            }
            er.e();
            int h13 = er.h(4);
            if (h13 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(h13).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(h13);
                AbstractC3217fl.y("Av1Config", sb4.toString());
                return new B0(sb3, i9, -1, -1, -1);
            }
            if (er.g()) {
                AbstractC3217fl.y("Av1Config", "Unsupported obu_extension_flag");
                return new B0(sb3, i9, -1, -1, -1);
            }
            boolean g10 = er.g();
            er.e();
            if (g10 && er.h(8) > 127) {
                AbstractC3217fl.y("Av1Config", "Excessive obu_size");
                return new B0(sb3, i9, -1, -1, -1);
            }
            int h14 = er.h(3);
            er.e();
            if (er.g()) {
                AbstractC3217fl.y("Av1Config", "Unsupported reduced_still_picture_header");
                return new B0(sb3, i9, -1, -1, -1);
            }
            if (er.g()) {
                AbstractC3217fl.y("Av1Config", "Unsupported timing_info_present_flag");
                return new B0(sb3, i9, -1, -1, -1);
            }
            if (er.g()) {
                AbstractC3217fl.y("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new B0(sb3, i9, -1, -1, -1);
            }
            int h15 = er.h(5);
            boolean z8 = false;
            for (int i10 = 0; i10 <= h15; i10++) {
                er.f(12);
                if (er.h(5) > 7) {
                    er.e();
                }
            }
            int h16 = er.h(4);
            int h17 = er.h(4);
            er.f(h16 + 1);
            er.f(h17 + 1);
            if (er.g()) {
                i = 7;
                er.f(7);
            } else {
                i = 7;
            }
            er.f(i);
            boolean g11 = er.g();
            if (g11) {
                er.f(2);
            }
            if (!er.g()) {
            }
            if (!er.g()) {
                er.f(1);
            }
            if (g11) {
                er.f(3);
            }
            er.f(3);
            boolean g12 = er.g();
            if (h14 == 2) {
                if (g12) {
                    er.e();
                }
            } else if (h14 == 1) {
                if (er.g()) {
                    return new B0(sb3, i9, -1, -1, -1);
                }
                int h18 = er.h(8);
                int h19 = er.h(8);
                int h20 = er.h(8);
                if (!z8 && h18 == 1) {
                    if (h19 == 13) {
                        if (h20 == 0) {
                            h18 = 1;
                            h9 = 1;
                            i4 = 13;
                            return new B0(sb3, i9, C2980bK.b(h18), h9 == 1 ? 1 : 2, C2980bK.c(i4));
                        }
                        h18 = 1;
                        i4 = 13;
                        h9 = er.h(1);
                        return new B0(sb3, i9, C2980bK.b(h18), h9 == 1 ? 1 : 2, C2980bK.c(i4));
                    }
                    h18 = 1;
                }
                i4 = h19;
                h9 = er.h(1);
                return new B0(sb3, i9, C2980bK.b(h18), h9 == 1 ? 1 : 2, C2980bK.c(i4));
            }
            if (er.g()) {
                z8 = true;
            }
            if (er.g()) {
            }
        } catch (RuntimeException e6) {
            throw W4.a(e6, "Error parsing AV1 config");
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public int a() {
        return this.f23938u;
    }

    public Object b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = ((LinkedHashMap) this.f23942y).get(obj);
                if (obj2 != null) {
                    this.f23940w++;
                    return obj2;
                }
                this.f23941x++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f23938u++;
                put = ((LinkedHashMap) this.f23942y).put(obj, obj2);
                if (put != null) {
                    this.f23938u--;
                }
            } finally {
            }
        }
        int i = this.f23939v;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f23938u < 0 || (((LinkedHashMap) this.f23942y).isEmpty() && this.f23938u != 0)) {
                        break;
                    }
                    if (this.f23938u <= i || ((LinkedHashMap) this.f23942y).isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) ((LinkedHashMap) this.f23942y).entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    ((LinkedHashMap) this.f23942y).remove(key);
                    this.f23938u--;
                } finally {
                }
            }
        }
        return put;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public int d() {
        return -1;
    }

    public void f() {
        int i = this.f23941x + 1;
        this.f23941x = i;
        if (i == 8) {
            this.f23941x = 0;
            int i4 = this.f23940w;
            this.f23940w = i4 + (true == o(i4 + 1) ? 2 : 1);
        }
        p();
    }

    public long g() {
        int i = this.f23940w;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f23942y;
        int i4 = this.f23938u;
        long j9 = jArr[i4];
        this.f23938u = this.f23941x & (i4 + 1);
        this.f23940w = i - 1;
        return j9;
    }

    public void h(int i) {
        int i4 = this.f23940w;
        int i9 = i / 8;
        int i10 = i4 + i9;
        this.f23940w = i10;
        int i11 = (i - (i9 * 8)) + this.f23941x;
        this.f23941x = i11;
        if (i11 > 7) {
            this.f23940w = i10 + 1;
            this.f23941x = i11 - 8;
        }
        while (true) {
            i4++;
            if (i4 > this.f23940w) {
                p();
                return;
            } else if (o(i4)) {
                this.f23940w++;
                i4 += 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public int i() {
        Lr lr = (Lr) this.f23942y;
        int i = this.f23939v;
        if (i == 8) {
            return lr.K();
        }
        if (i == 16) {
            return lr.L();
        }
        int i4 = this.f23940w;
        this.f23940w = i4 + 1;
        if (i4 % 2 != 0) {
            return this.f23941x & 15;
        }
        int K8 = lr.K();
        this.f23941x = K8;
        return (K8 & 240) >> 4;
    }

    public boolean j(int i) {
        int i4;
        int i9 = this.f23940w;
        int i10 = i / 8;
        int i11 = i9 + i10;
        int i12 = (this.f23941x + i) - (i10 * 8);
        if (i12 > 7) {
            i11++;
            i12 -= 8;
        }
        while (true) {
            i9++;
            i4 = this.f23938u;
            if (i9 > i11 || i11 > i4) {
                break;
            }
            if (o(i9)) {
                i11++;
                i9 += 2;
            }
        }
        if (i11 >= i4) {
            return i11 == i4 && i12 == 0;
        }
        return true;
    }

    public boolean k() {
        int i = ((byte[]) this.f23942y)[this.f23940w] & (128 >> this.f23941x);
        f();
        return i != 0;
    }

    public int l(int i) {
        int i4;
        byte[] bArr;
        this.f23941x += i;
        int i9 = 0;
        while (true) {
            i4 = this.f23941x;
            bArr = (byte[]) this.f23942y;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.f23941x = i10;
            int i11 = this.f23940w;
            i9 |= (bArr[i11] & 255) << i10;
            if (true != o(i11 + 1)) {
                r3 = 1;
            }
            this.f23940w = i11 + r3;
        }
        int i12 = this.f23940w;
        int i13 = i9 | ((bArr[i12] & 255) >> (8 - i4));
        int i14 = 32 - i;
        if (i4 == 8) {
            this.f23941x = 0;
            this.f23940w = i12 + (true != o(i12 + 1) ? 1 : 2);
        }
        int i15 = ((-1) >>> i14) & i13;
        p();
        return i15;
    }

    public int m() {
        int n9 = n();
        int i = n9 % 2;
        return ((n9 + 1) / 2) * (i == 0 ? -1 : 1);
    }

    public int n() {
        int i = 0;
        while (!k()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? l(i) : 0);
    }

    public boolean o(int i) {
        int i4 = i - 2;
        if (this.f23939v > i4 || i >= this.f23938u) {
            return false;
        }
        byte[] bArr = (byte[]) this.f23942y;
        return bArr[i] == 3 && bArr[i4] == 0 && bArr[i + (-1)] == 0;
    }

    public void p() {
        int i;
        int i4 = this.f23940w;
        boolean z8 = false;
        if (i4 >= 0 && (i4 < (i = this.f23938u) || (i4 == i && this.f23941x == 0))) {
            z8 = true;
        }
        PA.T(z8);
    }

    public synchronized String toString() {
        String str;
        switch (this.f23937n) {
            case 4:
                synchronized (this) {
                    try {
                        int i = this.f23940w;
                        int i4 = this.f23941x;
                        int i9 = i + i4;
                        int i10 = i9 != 0 ? (i * 100) / i9 : 0;
                        Locale locale = Locale.US;
                        str = "LruCache[maxSize=" + this.f23939v + ",hits=" + i + ",misses=" + i4 + ",hitRate=" + i10 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public B0(String str, int i, int i4, int i9, int i10) {
        this.f23937n = 0;
        this.f23938u = i;
        this.f23942y = str;
        this.f23939v = i4;
        this.f23940w = i9;
        this.f23941x = i10;
    }

    public B0(C3443jx c3443jx) {
        this.f23937n = 1;
        Lr lr = c3443jx.f32222c;
        this.f23942y = lr;
        lr.E(12);
        this.f23939v = lr.h() & com.anythink.basead.exoplayer.k.p.f8630b;
        this.f23938u = lr.h();
    }

    public B0(byte[] bArr, int i, int i4) {
        this.f23937n = 3;
        this.f23942y = bArr;
        this.f23939v = i;
        this.f23940w = i;
        this.f23938u = i4;
        this.f23941x = 0;
        p();
    }

    public B0(int i) {
        this.f23937n = 4;
        if (i > 0) {
            this.f23939v = i;
            this.f23942y = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
