package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.v8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4048v8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34719c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34720d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.a f34721e;

    /* renamed from: f, reason: collision with root package name */
    public final C3826r2 f34722f;

    /* renamed from: n, reason: collision with root package name */
    public int f34729n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f34723g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f34724h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f34725j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f34726k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f34727l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f34728m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f34730o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f34731p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f34732q = "";

    public C4048v8(int i, int i4, int i9, int i10, int i11, int i12, int i13, boolean z8) {
        this.f34717a = i;
        this.f34718b = i4;
        this.f34719c = i9;
        this.f34720d = z8;
        this.f34721e = new G1.a(i10, 8);
        C3826r2 c3826r2 = new C3826r2();
        c3826r2.f33936n = i11;
        i12 = (i12 > 64 || i12 < 0) ? 64 : i12;
        if (i13 <= 0) {
            c3826r2.f33937u = 1;
        } else {
            c3826r2.f33937u = i13;
        }
        c3826r2.f33938v = new E8(i12);
        this.f34722f = c3826r2;
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a(String str, boolean z8, float f6, float f9, float f10, float f11) {
        c(str, z8, f6, f9, f10, f11);
        synchronized (this.f34723g) {
            try {
                if (this.f34728m < 0) {
                    int i = t2.C.f40822b;
                    u2.i.a("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f34723g) {
            try {
                int i = this.f34726k;
                int i4 = this.f34727l;
                boolean z8 = this.f34720d;
                int i9 = this.f34718b;
                if (!z8) {
                    i9 = (i4 * i9) + (i * this.f34717a);
                }
                if (i9 > this.f34729n) {
                    this.f34729n = i9;
                    p2.j jVar = p2.j.f39798C;
                    if (!jVar.f39808h.g().l()) {
                        G1.a aVar = this.f34721e;
                        this.f34730o = aVar.p(this.f34724h);
                        this.f34731p = aVar.p(this.i);
                    }
                    if (!jVar.f39808h.g().m()) {
                        this.f34732q = this.f34722f.b(this.i, this.f34725j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z8, float f6, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f34719c) {
                return;
            }
            synchronized (this.f34723g) {
                try {
                    this.f34724h.add(str);
                    this.f34726k += str.length();
                    if (z8) {
                        this.i.add(str);
                        this.f34725j.add(new A8(f6, f9, f10, f11, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4048v8)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C4048v8) obj).f34730o;
        return str != null && str.equals(this.f34730o);
    }

    public final int hashCode() {
        return this.f34730o.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f34724h;
        int i = this.f34727l;
        int i4 = this.f34729n;
        int i9 = this.f34726k;
        String d2 = d(arrayList);
        String d3 = d(this.i);
        String str = this.f34730o;
        String str2 = this.f34731p;
        String str3 = this.f34732q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i9).length();
        int length4 = String.valueOf(d2).length();
        int length5 = String.valueOf(d3).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        AbstractC5051n.i(sb, "ActivityContent fetchId: ", i, " score:", i4);
        sb.append(" total_length:");
        sb.append(i9);
        sb.append("\n text: ");
        sb.append(d2);
        AbstractC5051n.j(sb, "\n viewableText", d3, "\n signture: ", str);
        return com.anythink.basead.b.c.i.q(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
