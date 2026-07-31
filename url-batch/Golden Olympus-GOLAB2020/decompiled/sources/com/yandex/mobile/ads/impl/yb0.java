package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class yb0 implements InterfaceC2259tl {

    /* renamed from: H, reason: collision with root package name */
    private static final yb0 f34971H = new yb0(new a());

    /* renamed from: I, reason: collision with root package name */
    public static final InterfaceC2259tl.a<yb0> f34972I = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Ql
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            yb0 a4;
            a4 = yb0.a(bundle);
            return a4;
        }
    };

    /* renamed from: A, reason: collision with root package name */
    public final int f34973A;

    /* renamed from: B, reason: collision with root package name */
    public final int f34974B;

    /* renamed from: C, reason: collision with root package name */
    public final int f34975C;

    /* renamed from: D, reason: collision with root package name */
    public final int f34976D;

    /* renamed from: E, reason: collision with root package name */
    public final int f34977E;

    /* renamed from: F, reason: collision with root package name */
    public final int f34978F;

    /* renamed from: G, reason: collision with root package name */
    private int f34979G;

    /* renamed from: b, reason: collision with root package name */
    public final String f34980b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34981c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34982d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34983e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34984f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34985g;

    /* renamed from: h, reason: collision with root package name */
    public final int f34986h;

    /* renamed from: i, reason: collision with root package name */
    public final int f34987i;

    /* renamed from: j, reason: collision with root package name */
    public final String f34988j;

    /* renamed from: k, reason: collision with root package name */
    public final wz0 f34989k;

    /* renamed from: l, reason: collision with root package name */
    public final String f34990l;

    /* renamed from: m, reason: collision with root package name */
    public final String f34991m;

    /* renamed from: n, reason: collision with root package name */
    public final int f34992n;

    /* renamed from: o, reason: collision with root package name */
    public final List<byte[]> f34993o;

    /* renamed from: p, reason: collision with root package name */
    public final u30 f34994p;

    /* renamed from: q, reason: collision with root package name */
    public final long f34995q;

    /* renamed from: r, reason: collision with root package name */
    public final int f34996r;

    /* renamed from: s, reason: collision with root package name */
    public final int f34997s;

    /* renamed from: t, reason: collision with root package name */
    public final float f34998t;

    /* renamed from: u, reason: collision with root package name */
    public final int f34999u;

    /* renamed from: v, reason: collision with root package name */
    public final float f35000v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f35001w;

    /* renamed from: x, reason: collision with root package name */
    public final int f35002x;

    /* renamed from: y, reason: collision with root package name */
    public final eq f35003y;

    /* renamed from: z, reason: collision with root package name */
    public final int f35004z;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private int f35005A;

        /* renamed from: B, reason: collision with root package name */
        private int f35006B;

        /* renamed from: C, reason: collision with root package name */
        private int f35007C;

        /* renamed from: D, reason: collision with root package name */
        private int f35008D;

        /* renamed from: a, reason: collision with root package name */
        private String f35009a;

        /* renamed from: b, reason: collision with root package name */
        private String f35010b;

        /* renamed from: c, reason: collision with root package name */
        private String f35011c;

        /* renamed from: d, reason: collision with root package name */
        private int f35012d;

        /* renamed from: e, reason: collision with root package name */
        private int f35013e;

        /* renamed from: f, reason: collision with root package name */
        private int f35014f;

        /* renamed from: g, reason: collision with root package name */
        private int f35015g;

        /* renamed from: h, reason: collision with root package name */
        private String f35016h;

        /* renamed from: i, reason: collision with root package name */
        private wz0 f35017i;

        /* renamed from: j, reason: collision with root package name */
        private String f35018j;

        /* renamed from: k, reason: collision with root package name */
        private String f35019k;

        /* renamed from: l, reason: collision with root package name */
        private int f35020l;

        /* renamed from: m, reason: collision with root package name */
        private List<byte[]> f35021m;

        /* renamed from: n, reason: collision with root package name */
        private u30 f35022n;

        /* renamed from: o, reason: collision with root package name */
        private long f35023o;

        /* renamed from: p, reason: collision with root package name */
        private int f35024p;

        /* renamed from: q, reason: collision with root package name */
        private int f35025q;

        /* renamed from: r, reason: collision with root package name */
        private float f35026r;

        /* renamed from: s, reason: collision with root package name */
        private int f35027s;

        /* renamed from: t, reason: collision with root package name */
        private float f35028t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f35029u;

        /* renamed from: v, reason: collision with root package name */
        private int f35030v;

        /* renamed from: w, reason: collision with root package name */
        private eq f35031w;

        /* renamed from: x, reason: collision with root package name */
        private int f35032x;

        /* renamed from: y, reason: collision with root package name */
        private int f35033y;

        /* renamed from: z, reason: collision with root package name */
        private int f35034z;

        public a() {
            this.f35014f = -1;
            this.f35015g = -1;
            this.f35020l = -1;
            this.f35023o = Long.MAX_VALUE;
            this.f35024p = -1;
            this.f35025q = -1;
            this.f35026r = -1.0f;
            this.f35028t = 1.0f;
            this.f35030v = -1;
            this.f35032x = -1;
            this.f35033y = -1;
            this.f35034z = -1;
            this.f35007C = -1;
            this.f35008D = 0;
        }

        public final a a(int i4) {
            this.f35007C = i4;
            return this;
        }

        public final a b(int i4) {
            this.f35014f = i4;
            return this;
        }

        public final a c(int i4) {
            this.f35032x = i4;
            return this;
        }

        public final a d(int i4) {
            this.f35005A = i4;
            return this;
        }

        public final a e(int i4) {
            this.f35006B = i4;
            return this;
        }

        public final a f(int i4) {
            this.f35025q = i4;
            return this;
        }

        public final a g(int i4) {
            this.f35009a = Integer.toString(i4);
            return this;
        }

        public final a h(int i4) {
            this.f35020l = i4;
            return this;
        }

        public final a i(int i4) {
            this.f35034z = i4;
            return this;
        }

        public final a j(int i4) {
            this.f35015g = i4;
            return this;
        }

        public final a k(int i4) {
            this.f35027s = i4;
            return this;
        }

        public final a l(int i4) {
            this.f35033y = i4;
            return this;
        }

        public final a m(int i4) {
            this.f35012d = i4;
            return this;
        }

        public final a n(int i4) {
            this.f35030v = i4;
            return this;
        }

        public final a o(int i4) {
            this.f35024p = i4;
            return this;
        }

        public final a a(String str) {
            this.f35016h = str;
            return this;
        }

        public final a b() {
            this.f35018j = "image/jpeg";
            return this;
        }

        public final a c(String str) {
            this.f35010b = str;
            return this;
        }

        public final a d(String str) {
            this.f35011c = str;
            return this;
        }

        public final a e(String str) {
            this.f35019k = str;
            return this;
        }

        public final a a(eq eqVar) {
            this.f35031w = eqVar;
            return this;
        }

        public final a b(String str) {
            this.f35009a = str;
            return this;
        }

        public final a a(u30 u30Var) {
            this.f35022n = u30Var;
            return this;
        }

        public final a b(float f4) {
            this.f35028t = f4;
            return this;
        }

        public final void a(float f4) {
            this.f35026r = f4;
        }

        public final a a(List<byte[]> list) {
            this.f35021m = list;
            return this;
        }

        public final a a(wz0 wz0Var) {
            this.f35017i = wz0Var;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f35029u = bArr;
            return this;
        }

        public final a a(long j4) {
            this.f35023o = j4;
            return this;
        }

        public final yb0 a() {
            return new yb0(this);
        }

        private a(yb0 yb0Var) {
            this.f35009a = yb0Var.f34980b;
            this.f35010b = yb0Var.f34981c;
            this.f35011c = yb0Var.f34982d;
            this.f35012d = yb0Var.f34983e;
            this.f35013e = yb0Var.f34984f;
            this.f35014f = yb0Var.f34985g;
            this.f35015g = yb0Var.f34986h;
            this.f35016h = yb0Var.f34988j;
            this.f35017i = yb0Var.f34989k;
            this.f35018j = yb0Var.f34990l;
            this.f35019k = yb0Var.f34991m;
            this.f35020l = yb0Var.f34992n;
            this.f35021m = yb0Var.f34993o;
            this.f35022n = yb0Var.f34994p;
            this.f35023o = yb0Var.f34995q;
            this.f35024p = yb0Var.f34996r;
            this.f35025q = yb0Var.f34997s;
            this.f35026r = yb0Var.f34998t;
            this.f35027s = yb0Var.f34999u;
            this.f35028t = yb0Var.f35000v;
            this.f35029u = yb0Var.f35001w;
            this.f35030v = yb0Var.f35002x;
            this.f35031w = yb0Var.f35003y;
            this.f35032x = yb0Var.f35004z;
            this.f35033y = yb0Var.f34973A;
            this.f35034z = yb0Var.f34974B;
            this.f35005A = yb0Var.f34975C;
            this.f35006B = yb0Var.f34976D;
            this.f35007C = yb0Var.f34977E;
            this.f35008D = yb0Var.f34978F;
        }
    }

    public final boolean a(yb0 yb0Var) {
        if (this.f34993o.size() != yb0Var.f34993o.size()) {
            return false;
        }
        for (int i4 = 0; i4 < this.f34993o.size(); i4++) {
            if (!Arrays.equals(this.f34993o.get(i4), yb0Var.f34993o.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj != null && yb0.class == obj.getClass()) {
            yb0 yb0Var = (yb0) obj;
            int i5 = this.f34979G;
            if ((i5 == 0 || (i4 = yb0Var.f34979G) == 0 || i5 == i4) && this.f34983e == yb0Var.f34983e && this.f34984f == yb0Var.f34984f && this.f34985g == yb0Var.f34985g && this.f34986h == yb0Var.f34986h && this.f34992n == yb0Var.f34992n && this.f34995q == yb0Var.f34995q && this.f34996r == yb0Var.f34996r && this.f34997s == yb0Var.f34997s && this.f34999u == yb0Var.f34999u && this.f35002x == yb0Var.f35002x && this.f35004z == yb0Var.f35004z && this.f34973A == yb0Var.f34973A && this.f34974B == yb0Var.f34974B && this.f34975C == yb0Var.f34975C && this.f34976D == yb0Var.f34976D && this.f34977E == yb0Var.f34977E && this.f34978F == yb0Var.f34978F && Float.compare(this.f34998t, yb0Var.f34998t) == 0 && Float.compare(this.f35000v, yb0Var.f35000v) == 0 && u82.a(this.f34980b, yb0Var.f34980b) && u82.a(this.f34981c, yb0Var.f34981c) && u82.a(this.f34988j, yb0Var.f34988j) && u82.a(this.f34990l, yb0Var.f34990l) && u82.a(this.f34991m, yb0Var.f34991m) && u82.a(this.f34982d, yb0Var.f34982d) && Arrays.equals(this.f35001w, yb0Var.f35001w) && u82.a(this.f34989k, yb0Var.f34989k) && u82.a(this.f35003y, yb0Var.f35003y) && u82.a(this.f34994p, yb0Var.f34994p) && a(yb0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f34979G == 0) {
            String str = this.f34980b;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f34981c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f34982d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f34983e) * 31) + this.f34984f) * 31) + this.f34985g) * 31) + this.f34986h) * 31;
            String str4 = this.f34988j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            wz0 wz0Var = this.f34989k;
            int hashCode5 = (hashCode4 + (wz0Var == null ? 0 : wz0Var.hashCode())) * 31;
            String str5 = this.f34990l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f34991m;
            this.f34979G = ((((((((((((((((Float.floatToIntBits(this.f35000v) + ((((Float.floatToIntBits(this.f34998t) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f34992n) * 31) + ((int) this.f34995q)) * 31) + this.f34996r) * 31) + this.f34997s) * 31)) * 31) + this.f34999u) * 31)) * 31) + this.f35002x) * 31) + this.f35004z) * 31) + this.f34973A) * 31) + this.f34974B) * 31) + this.f34975C) * 31) + this.f34976D) * 31) + this.f34977E) * 31) + this.f34978F;
        }
        return this.f34979G;
    }

    public final String toString() {
        return "Format(" + this.f34980b + ", " + this.f34981c + ", " + this.f34990l + ", " + this.f34991m + ", " + this.f34988j + ", " + this.f34987i + ", " + this.f34982d + ", [" + this.f34996r + ", " + this.f34997s + ", " + this.f34998t + "], [" + this.f35004z + ", " + this.f34973A + "])";
    }

    private yb0(a aVar) {
        this.f34980b = aVar.f35009a;
        this.f34981c = aVar.f35010b;
        this.f34982d = u82.e(aVar.f35011c);
        this.f34983e = aVar.f35012d;
        this.f34984f = aVar.f35013e;
        int i4 = aVar.f35014f;
        this.f34985g = i4;
        int i5 = aVar.f35015g;
        this.f34986h = i5;
        this.f34987i = i5 != -1 ? i5 : i4;
        this.f34988j = aVar.f35016h;
        this.f34989k = aVar.f35017i;
        this.f34990l = aVar.f35018j;
        this.f34991m = aVar.f35019k;
        this.f34992n = aVar.f35020l;
        List<byte[]> list = aVar.f35021m;
        this.f34993o = list == null ? Collections.EMPTY_LIST : list;
        u30 u30Var = aVar.f35022n;
        this.f34994p = u30Var;
        this.f34995q = aVar.f35023o;
        this.f34996r = aVar.f35024p;
        this.f34997s = aVar.f35025q;
        this.f34998t = aVar.f35026r;
        int i6 = aVar.f35027s;
        this.f34999u = i6 == -1 ? 0 : i6;
        float f4 = aVar.f35028t;
        this.f35000v = f4 == -1.0f ? 1.0f : f4;
        this.f35001w = aVar.f35029u;
        this.f35002x = aVar.f35030v;
        this.f35003y = aVar.f35031w;
        this.f35004z = aVar.f35032x;
        this.f34973A = aVar.f35033y;
        this.f34974B = aVar.f35034z;
        int i7 = aVar.f35005A;
        this.f34975C = i7 == -1 ? 0 : i7;
        int i8 = aVar.f35006B;
        this.f34976D = i8 != -1 ? i8 : 0;
        this.f34977E = aVar.f35007C;
        int i9 = aVar.f35008D;
        if (i9 != 0 || u30Var == null) {
            this.f34978F = i9;
        } else {
            this.f34978F = 1;
        }
    }

    public final int b() {
        int i4;
        int i5 = this.f34996r;
        if (i5 == -1 || (i4 = this.f34997s) == -1) {
            return -1;
        }
        return i5 * i4;
    }

    public final a a() {
        return new a();
    }

    public final yb0 a(int i4) {
        a aVar = new a();
        aVar.f35008D = i4;
        return new yb0(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yb0 a(Bundle bundle) {
        a aVar = new a();
        if (bundle != null) {
            ClassLoader classLoader = C2282ul.class.getClassLoader();
            int i4 = u82.f32873a;
            bundle.setClassLoader(classLoader);
        }
        int i5 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        yb0 yb0Var = f34971H;
        String str = yb0Var.f34980b;
        if (string == null) {
            string = str;
        }
        aVar.f35009a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = yb0Var.f34981c;
        if (string2 == null) {
            string2 = str2;
        }
        aVar.f35010b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = yb0Var.f34982d;
        if (string3 == null) {
            string3 = str3;
        }
        aVar.f35011c = string3;
        aVar.f35012d = bundle.getInt(Integer.toString(3, 36), yb0Var.f34983e);
        aVar.f35013e = bundle.getInt(Integer.toString(4, 36), yb0Var.f34984f);
        aVar.f35014f = bundle.getInt(Integer.toString(5, 36), yb0Var.f34985g);
        aVar.f35015g = bundle.getInt(Integer.toString(6, 36), yb0Var.f34986h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = yb0Var.f34988j;
        if (string4 == null) {
            string4 = str4;
        }
        aVar.f35016h = string4;
        wz0 wz0Var = (wz0) bundle.getParcelable(Integer.toString(8, 36));
        wz0 wz0Var2 = yb0Var.f34989k;
        if (wz0Var == null) {
            wz0Var = wz0Var2;
        }
        aVar.f35017i = wz0Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = yb0Var.f34990l;
        if (string5 == null) {
            string5 = str5;
        }
        aVar.f35018j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = yb0Var.f34991m;
        if (string6 == null) {
            string6 = str6;
        }
        aVar.f35019k = string6;
        aVar.f35020l = bundle.getInt(Integer.toString(11, 36), yb0Var.f34992n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + BundleUtil.UNDERLINE_TAG + Integer.toString(i5, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i5++;
        }
        aVar.f35021m = arrayList;
        aVar.f35022n = (u30) bundle.getParcelable(Integer.toString(13, 36));
        String num = Integer.toString(14, 36);
        yb0 yb0Var2 = f34971H;
        aVar.f35023o = bundle.getLong(num, yb0Var2.f34995q);
        aVar.f35024p = bundle.getInt(Integer.toString(15, 36), yb0Var2.f34996r);
        aVar.f35025q = bundle.getInt(Integer.toString(16, 36), yb0Var2.f34997s);
        aVar.f35026r = bundle.getFloat(Integer.toString(17, 36), yb0Var2.f34998t);
        aVar.f35027s = bundle.getInt(Integer.toString(18, 36), yb0Var2.f34999u);
        aVar.f35028t = bundle.getFloat(Integer.toString(19, 36), yb0Var2.f35000v);
        aVar.f35029u = bundle.getByteArray(Integer.toString(20, 36));
        aVar.f35030v = bundle.getInt(Integer.toString(21, 36), yb0Var2.f35002x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            aVar.f35031w = eq.f25385g.fromBundle(bundle2);
        }
        aVar.f35032x = bundle.getInt(Integer.toString(23, 36), yb0Var2.f35004z);
        aVar.f35033y = bundle.getInt(Integer.toString(24, 36), yb0Var2.f34973A);
        aVar.f35034z = bundle.getInt(Integer.toString(25, 36), yb0Var2.f34974B);
        aVar.f35005A = bundle.getInt(Integer.toString(26, 36), yb0Var2.f34975C);
        aVar.f35006B = bundle.getInt(Integer.toString(27, 36), yb0Var2.f34976D);
        aVar.f35007C = bundle.getInt(Integer.toString(28, 36), yb0Var2.f34977E);
        aVar.f35008D = bundle.getInt(Integer.toString(29, 36), yb0Var2.f34978F);
        return new yb0(aVar);
    }
}
