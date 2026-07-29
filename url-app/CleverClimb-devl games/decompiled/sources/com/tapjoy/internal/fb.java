package com.tapjoy.internal;

import com.tapjoy.internal.ei;

/* loaded from: classes2.dex */
public final class fb extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8065c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Integer f8066d = 0;
    public static final Integer e = 0;
    public static final Integer f = 0;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;

    public fb(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, iv ivVar) {
        super(f8065c, ivVar);
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = num;
        this.n = num2;
        this.o = num3;
        this.p = str7;
        this.q = str8;
        this.r = str9;
        this.s = str10;
        this.t = str11;
        this.u = str12;
        this.v = str13;
        this.w = str14;
        this.x = str15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return a().equals(fbVar.a()) && ep.a(this.g, fbVar.g) && ep.a(this.h, fbVar.h) && ep.a(this.i, fbVar.i) && ep.a(this.j, fbVar.j) && ep.a(this.k, fbVar.k) && ep.a(this.l, fbVar.l) && ep.a(this.m, fbVar.m) && ep.a(this.n, fbVar.n) && ep.a(this.o, fbVar.o) && ep.a(this.p, fbVar.p) && ep.a(this.q, fbVar.q) && ep.a(this.r, fbVar.r) && ep.a(this.s, fbVar.s) && ep.a(this.t, fbVar.t) && ep.a(this.u, fbVar.u) && ep.a(this.v, fbVar.v) && ep.a(this.w, fbVar.w) && ep.a(this.x, fbVar.x);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((((((((((((((((((((((((a().hashCode() * 37) + (this.g != null ? this.g.hashCode() : 0)) * 37) + (this.h != null ? this.h.hashCode() : 0)) * 37) + (this.i != null ? this.i.hashCode() : 0)) * 37) + (this.j != null ? this.j.hashCode() : 0)) * 37) + (this.k != null ? this.k.hashCode() : 0)) * 37) + (this.l != null ? this.l.hashCode() : 0)) * 37) + (this.m != null ? this.m.hashCode() : 0)) * 37) + (this.n != null ? this.n.hashCode() : 0)) * 37) + (this.o != null ? this.o.hashCode() : 0)) * 37) + (this.p != null ? this.p.hashCode() : 0)) * 37) + (this.q != null ? this.q.hashCode() : 0)) * 37) + (this.r != null ? this.r.hashCode() : 0)) * 37) + (this.s != null ? this.s.hashCode() : 0)) * 37) + (this.t != null ? this.t.hashCode() : 0)) * 37) + (this.u != null ? this.u.hashCode() : 0)) * 37) + (this.v != null ? this.v.hashCode() : 0)) * 37) + (this.w != null ? this.w.hashCode() : 0)) * 37) + (this.x != null ? this.x.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.g != null) {
            sb.append(", mac=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", deviceId=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", deviceMaker=");
            sb.append(this.i);
        }
        if (this.j != null) {
            sb.append(", deviceModel=");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append(", osName=");
            sb.append(this.k);
        }
        if (this.l != null) {
            sb.append(", osVer=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(", displayD=");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", displayW=");
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(", displayH=");
            sb.append(this.o);
        }
        if (this.p != null) {
            sb.append(", locale=");
            sb.append(this.p);
        }
        if (this.q != null) {
            sb.append(", timezone=");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", pkgId=");
            sb.append(this.r);
        }
        if (this.s != null) {
            sb.append(", pkgSign=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", sdk=");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append(", countrySim=");
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append(", countryNet=");
            sb.append(this.v);
        }
        if (this.w != null) {
            sb.append(", imei=");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append(", androidId=");
            sb.append(this.x);
        }
        StringBuilder replace = sb.replace(0, 2, "Info{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public String f8067c;

        /* renamed from: d, reason: collision with root package name */
        public String f8068d;
        public String e;
        public String f;
        public String g;
        public String h;
        public Integer i;
        public Integer j;
        public Integer k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;

        public final fb b() {
            return new fb(this.f8067c, this.f8068d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fb fbVar = (fb) obj;
            return (fbVar.g != null ? ek.p.a(1, fbVar.g) : 0) + (fbVar.h != null ? ek.p.a(2, fbVar.h) : 0) + (fbVar.i != null ? ek.p.a(3, fbVar.i) : 0) + (fbVar.j != null ? ek.p.a(4, fbVar.j) : 0) + (fbVar.k != null ? ek.p.a(5, fbVar.k) : 0) + (fbVar.l != null ? ek.p.a(6, fbVar.l) : 0) + (fbVar.m != null ? ek.f8003d.a(7, fbVar.m) : 0) + (fbVar.n != null ? ek.f8003d.a(8, fbVar.n) : 0) + (fbVar.o != null ? ek.f8003d.a(9, fbVar.o) : 0) + (fbVar.p != null ? ek.p.a(10, fbVar.p) : 0) + (fbVar.q != null ? ek.p.a(11, fbVar.q) : 0) + (fbVar.r != null ? ek.p.a(12, fbVar.r) : 0) + (fbVar.s != null ? ek.p.a(13, fbVar.s) : 0) + (fbVar.t != null ? ek.p.a(14, fbVar.t) : 0) + (fbVar.u != null ? ek.p.a(15, fbVar.u) : 0) + (fbVar.v != null ? ek.p.a(16, fbVar.v) : 0) + (fbVar.w != null ? ek.p.a(17, fbVar.w) : 0) + (fbVar.x != null ? ek.p.a(18, fbVar.x) : 0) + fbVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fb fbVar = (fb) obj;
            if (fbVar.g != null) {
                ek.p.a(emVar, 1, fbVar.g);
            }
            if (fbVar.h != null) {
                ek.p.a(emVar, 2, fbVar.h);
            }
            if (fbVar.i != null) {
                ek.p.a(emVar, 3, fbVar.i);
            }
            if (fbVar.j != null) {
                ek.p.a(emVar, 4, fbVar.j);
            }
            if (fbVar.k != null) {
                ek.p.a(emVar, 5, fbVar.k);
            }
            if (fbVar.l != null) {
                ek.p.a(emVar, 6, fbVar.l);
            }
            if (fbVar.m != null) {
                ek.f8003d.a(emVar, 7, fbVar.m);
            }
            if (fbVar.n != null) {
                ek.f8003d.a(emVar, 8, fbVar.n);
            }
            if (fbVar.o != null) {
                ek.f8003d.a(emVar, 9, fbVar.o);
            }
            if (fbVar.p != null) {
                ek.p.a(emVar, 10, fbVar.p);
            }
            if (fbVar.q != null) {
                ek.p.a(emVar, 11, fbVar.q);
            }
            if (fbVar.r != null) {
                ek.p.a(emVar, 12, fbVar.r);
            }
            if (fbVar.s != null) {
                ek.p.a(emVar, 13, fbVar.s);
            }
            if (fbVar.t != null) {
                ek.p.a(emVar, 14, fbVar.t);
            }
            if (fbVar.u != null) {
                ek.p.a(emVar, 15, fbVar.u);
            }
            if (fbVar.v != null) {
                ek.p.a(emVar, 16, fbVar.v);
            }
            if (fbVar.w != null) {
                ek.p.a(emVar, 17, fbVar.w);
            }
            if (fbVar.x != null) {
                ek.p.a(emVar, 18, fbVar.x);
            }
            emVar.a(fbVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fb.class);
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            a aVar = new a();
            long a2 = elVar.a();
            while (true) {
                int b2 = elVar.b();
                if (b2 == -1) {
                    elVar.a(a2);
                    return aVar.b();
                }
                switch (b2) {
                    case 1:
                        aVar.f8067c = (String) ek.p.a(elVar);
                        break;
                    case 2:
                        aVar.f8068d = (String) ek.p.a(elVar);
                        break;
                    case 3:
                        aVar.e = (String) ek.p.a(elVar);
                        break;
                    case 4:
                        aVar.f = (String) ek.p.a(elVar);
                        break;
                    case 5:
                        aVar.g = (String) ek.p.a(elVar);
                        break;
                    case 6:
                        aVar.h = (String) ek.p.a(elVar);
                        break;
                    case 7:
                        aVar.i = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 8:
                        aVar.j = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 9:
                        aVar.k = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 10:
                        aVar.l = (String) ek.p.a(elVar);
                        break;
                    case 11:
                        aVar.m = (String) ek.p.a(elVar);
                        break;
                    case 12:
                        aVar.n = (String) ek.p.a(elVar);
                        break;
                    case 13:
                        aVar.o = (String) ek.p.a(elVar);
                        break;
                    case 14:
                        aVar.p = (String) ek.p.a(elVar);
                        break;
                    case 15:
                        aVar.q = (String) ek.p.a(elVar);
                        break;
                    case 16:
                        aVar.r = (String) ek.p.a(elVar);
                        break;
                    case 17:
                        aVar.s = (String) ek.p.a(elVar);
                        break;
                    case 18:
                        aVar.t = (String) ek.p.a(elVar);
                        break;
                    default:
                        eh c2 = elVar.c();
                        aVar.a(b2, c2, c2.a().a(elVar));
                        break;
                }
            }
        }
    }
}
