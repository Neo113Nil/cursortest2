package com.tapjoy.internal;

import com.tapjoy.internal.ei;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* loaded from: classes2.dex */
public final class fe extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8077c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Integer f8078d = 1;
    public static final Double e = Double.valueOf(0.0d);
    public static final Integer f = 0;
    public static final Long g = 0L;
    public final String h;
    public final Integer i;
    public final Double j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Integer p;
    public final Long q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public fe(String str, Integer num, Double d2, String str2, String str3, String str4, String str5, String str6, Integer num2, Long l, String str7, String str8, String str9, String str10, iv ivVar) {
        super(f8077c, ivVar);
        this.h = str;
        this.i = num;
        this.j = d2;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = num2;
        this.q = l;
        this.r = str7;
        this.s = str8;
        this.t = str9;
        this.u = str10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return a().equals(feVar.a()) && this.h.equals(feVar.h) && ep.a(this.i, feVar.i) && ep.a(this.j, feVar.j) && ep.a(this.k, feVar.k) && ep.a(this.l, feVar.l) && ep.a(this.m, feVar.m) && ep.a(this.n, feVar.n) && ep.a(this.o, feVar.o) && ep.a(this.p, feVar.p) && ep.a(this.q, feVar.q) && ep.a(this.r, feVar.r) && ep.a(this.s, feVar.s) && ep.a(this.t, feVar.t) && ep.a(this.u, feVar.u);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((((((((((((((((a().hashCode() * 37) + this.h.hashCode()) * 37) + (this.i != null ? this.i.hashCode() : 0)) * 37) + (this.j != null ? this.j.hashCode() : 0)) * 37) + (this.k != null ? this.k.hashCode() : 0)) * 37) + (this.l != null ? this.l.hashCode() : 0)) * 37) + (this.m != null ? this.m.hashCode() : 0)) * 37) + (this.n != null ? this.n.hashCode() : 0)) * 37) + (this.o != null ? this.o.hashCode() : 0)) * 37) + (this.p != null ? this.p.hashCode() : 0)) * 37) + (this.q != null ? this.q.hashCode() : 0)) * 37) + (this.r != null ? this.r.hashCode() : 0)) * 37) + (this.s != null ? this.s.hashCode() : 0)) * 37) + (this.t != null ? this.t.hashCode() : 0)) * 37) + (this.u != null ? this.u.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", productId=");
        sb.append(this.h);
        if (this.i != null) {
            sb.append(", productQuantity=");
            sb.append(this.i);
        }
        if (this.j != null) {
            sb.append(", productPrice=");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append(", productPriceCurrency=");
            sb.append(this.k);
        }
        if (this.l != null) {
            sb.append(", productType=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(", productTitle=");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", productDescription=");
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(", transactionId=");
            sb.append(this.o);
        }
        if (this.p != null) {
            sb.append(", transactionState=");
            sb.append(this.p);
        }
        if (this.q != null) {
            sb.append(", transactionDate=");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", campaignId=");
            sb.append(this.r);
        }
        if (this.s != null) {
            sb.append(", currencyPrice=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", receipt=");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append(", signature=");
            sb.append(this.u);
        }
        StringBuilder replace = sb.replace(0, 2, "Purchase{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public String f8079c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f8080d;
        public Double e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public Integer k;
        public Long l;
        public String m;
        public String n;
        public String o;
        public String p;

        public final fe b() {
            if (this.f8079c != null) {
                return new fe(this.f8079c, this.f8080d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, super.a());
            }
            throw ep.a(this.f8079c, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fe feVar = (fe) obj;
            return ek.p.a(1, feVar.h) + (feVar.i != null ? ek.f8003d.a(2, feVar.i) : 0) + (feVar.j != null ? ek.o.a(3, feVar.j) : 0) + (feVar.k != null ? ek.p.a(4, feVar.k) : 0) + (feVar.l != null ? ek.p.a(5, feVar.l) : 0) + (feVar.m != null ? ek.p.a(6, feVar.m) : 0) + (feVar.n != null ? ek.p.a(7, feVar.n) : 0) + (feVar.o != null ? ek.p.a(8, feVar.o) : 0) + (feVar.p != null ? ek.f8003d.a(9, feVar.p) : 0) + (feVar.q != null ? ek.i.a(10, feVar.q) : 0) + (feVar.r != null ? ek.p.a(11, feVar.r) : 0) + (feVar.s != null ? ek.p.a(12, feVar.s) : 0) + (feVar.t != null ? ek.p.a(13, feVar.t) : 0) + (feVar.u != null ? ek.p.a(14, feVar.u) : 0) + feVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fe feVar = (fe) obj;
            ek.p.a(emVar, 1, feVar.h);
            if (feVar.i != null) {
                ek.f8003d.a(emVar, 2, feVar.i);
            }
            if (feVar.j != null) {
                ek.o.a(emVar, 3, feVar.j);
            }
            if (feVar.k != null) {
                ek.p.a(emVar, 4, feVar.k);
            }
            if (feVar.l != null) {
                ek.p.a(emVar, 5, feVar.l);
            }
            if (feVar.m != null) {
                ek.p.a(emVar, 6, feVar.m);
            }
            if (feVar.n != null) {
                ek.p.a(emVar, 7, feVar.n);
            }
            if (feVar.o != null) {
                ek.p.a(emVar, 8, feVar.o);
            }
            if (feVar.p != null) {
                ek.f8003d.a(emVar, 9, feVar.p);
            }
            if (feVar.q != null) {
                ek.i.a(emVar, 10, feVar.q);
            }
            if (feVar.r != null) {
                ek.p.a(emVar, 11, feVar.r);
            }
            if (feVar.s != null) {
                ek.p.a(emVar, 12, feVar.s);
            }
            if (feVar.t != null) {
                ek.p.a(emVar, 13, feVar.t);
            }
            if (feVar.u != null) {
                ek.p.a(emVar, 14, feVar.u);
            }
            emVar.a(feVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fe.class);
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
                        aVar.f8079c = (String) ek.p.a(elVar);
                        break;
                    case 2:
                        aVar.f8080d = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 3:
                        aVar.e = (Double) ek.o.a(elVar);
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
                        aVar.i = (String) ek.p.a(elVar);
                        break;
                    case 8:
                        aVar.j = (String) ek.p.a(elVar);
                        break;
                    case 9:
                        aVar.k = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 10:
                        aVar.l = (Long) ek.i.a(elVar);
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
                    default:
                        eh c2 = elVar.c();
                        aVar.a(b2, c2, c2.a().a(elVar));
                        break;
                }
            }
        }
    }
}
