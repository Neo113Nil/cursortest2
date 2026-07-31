package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oo {

    /* renamed from: a, reason: collision with root package name */
    private final int f9737a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9738b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9739c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9740d;

    /* renamed from: e, reason: collision with root package name */
    private final ep f9741e;

    /* renamed from: f, reason: collision with root package name */
    private final mp f9742f;

    /* renamed from: n, reason: collision with root package name */
    private int f9750n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f9743g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<String> f9744h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList<String> f9745i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList<ap> f9746j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f9747k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f9748l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f9749m = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f9751o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f9752p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f9753q = "";

    public oo(int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z6) {
        this.f9737a = i7;
        this.f9738b = i8;
        this.f9739c = i9;
        this.f9740d = z6;
        this.f9741e = new ep(i10);
        this.f9742f = new mp(i11, i12, i13);
    }

    private final void p(String str, boolean z6, float f7, float f8, float f9, float f10) {
        if (str == null || str.length() < this.f9739c) {
            return;
        }
        synchronized (this.f9743g) {
            this.f9744h.add(str);
            this.f9747k += str.length();
            if (z6) {
                this.f9745i.add(str);
                this.f9746j.add(new ap(f7, f8, f9, f10, this.f9745i.size() - 1));
            }
        }
    }

    private static final String q(ArrayList<String> arrayList, int i7) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            sb.append(arrayList.get(i8));
            sb.append(' ');
            i8++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    final int a(int i7, int i8) {
        return this.f9740d ? this.f9738b : (i7 * this.f9737a) + (i8 * this.f9738b);
    }

    public final int b() {
        return this.f9750n;
    }

    final int c() {
        return this.f9747k;
    }

    public final String d() {
        return this.f9751o;
    }

    public final String e() {
        return this.f9752p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((oo) obj).f9751o;
        return str != null && str.equals(this.f9751o);
    }

    public final String f() {
        return this.f9753q;
    }

    public final void g() {
        synchronized (this.f9743g) {
            this.f9749m--;
        }
    }

    public final void h() {
        synchronized (this.f9743g) {
            this.f9749m++;
        }
    }

    public final int hashCode() {
        return this.f9751o.hashCode();
    }

    public final void i() {
        synchronized (this.f9743g) {
            this.f9750n -= 100;
        }
    }

    public final void j(int i7) {
        this.f9748l = i7;
    }

    public final void k(String str, boolean z6, float f7, float f8, float f9, float f10) {
        p(str, z6, f7, f8, f9, f10);
    }

    public final void l(String str, boolean z6, float f7, float f8, float f9, float f10) {
        p(str, z6, f7, f8, f9, f10);
        synchronized (this.f9743g) {
            if (this.f9749m < 0) {
                io0.b("ActivityContent: negative number of WebViews.");
            }
            m();
        }
    }

    public final void m() {
        synchronized (this.f9743g) {
            int a7 = a(this.f9747k, this.f9748l);
            if (a7 > this.f9750n) {
                this.f9750n = a7;
                if (!y2.t.p().h().L()) {
                    this.f9751o = this.f9741e.a(this.f9744h);
                    this.f9752p = this.f9741e.a(this.f9745i);
                }
                if (!y2.t.p().h().v()) {
                    this.f9753q = this.f9742f.a(this.f9745i, this.f9746j);
                }
            }
        }
    }

    public final void n() {
        synchronized (this.f9743g) {
            int a7 = a(this.f9747k, this.f9748l);
            if (a7 > this.f9750n) {
                this.f9750n = a7;
            }
        }
    }

    public final boolean o() {
        boolean z6;
        synchronized (this.f9743g) {
            z6 = this.f9749m == 0;
        }
        return z6;
    }

    public final String toString() {
        int i7 = this.f9748l;
        int i8 = this.f9750n;
        int i9 = this.f9747k;
        String q7 = q(this.f9744h, 100);
        String q8 = q(this.f9745i, 100);
        String str = this.f9751o;
        String str2 = this.f9752p;
        String str3 = this.f9753q;
        int length = String.valueOf(q7).length();
        int length2 = String.valueOf(q8).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i7);
        sb.append(" score:");
        sb.append(i8);
        sb.append(" total_length:");
        sb.append(i9);
        sb.append("\n text: ");
        sb.append(q7);
        sb.append("\n viewableText");
        sb.append(q8);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
