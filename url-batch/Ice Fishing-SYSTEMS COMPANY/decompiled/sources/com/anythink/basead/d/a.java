package com.anythink.basead.d;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6265a;

    /* renamed from: b, reason: collision with root package name */
    public int f6266b;

    /* renamed from: c, reason: collision with root package name */
    public int f6267c;

    /* renamed from: d, reason: collision with root package name */
    public int f6268d;

    /* renamed from: e, reason: collision with root package name */
    public int f6269e;

    /* renamed from: f, reason: collision with root package name */
    public int f6270f;

    /* renamed from: g, reason: collision with root package name */
    public int f6271g;

    /* renamed from: h, reason: collision with root package name */
    public int f6272h;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public long f6274k;

    /* renamed from: l, reason: collision with root package name */
    public long f6275l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f6276m;

    /* renamed from: p, reason: collision with root package name */
    public a f6279p;

    /* renamed from: j, reason: collision with root package name */
    public int f6273j = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f6277n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6278o = 13;

    /* renamed from: com.anythink.basead.d.a$a, reason: collision with other inner class name */
    public static class C0012a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6280a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6281b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6282c = 3;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6283a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6284b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6285c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6286d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f6287e = 4;
    }

    private boolean a() {
        return this.f6265a > 0 || this.f6266b > 0 || this.f6267c > 0 || this.f6268d > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdClickRecord{clickDownX=");
        sb.append(this.f6265a);
        sb.append(", clickDownY=");
        sb.append(this.f6266b);
        sb.append(", clickUpX=");
        sb.append(this.f6267c);
        sb.append(", clickUpY=");
        sb.append(this.f6268d);
        sb.append(", clickRelateDownX=");
        sb.append(this.f6269e);
        sb.append(", clickRelateDownY=");
        sb.append(this.f6270f);
        sb.append(", clickRelateUpX=");
        sb.append(this.f6271g);
        sb.append(", clickRelateUpY=");
        sb.append(this.f6272h);
        sb.append(", isDeeplinkClick=");
        sb.append(this.i);
        sb.append(", downloadType=");
        sb.append(this.f6273j);
        sb.append(", clickDownTimeMs=");
        sb.append(this.f6274k);
        sb.append(", clickUpTimeMs=");
        sb.append(this.f6275l);
        sb.append(", trackingClickType=");
        sb.append(this.f6277n);
        sb.append(", shakeMaxAccValues=");
        sb.append(this.f6276m);
        sb.append(", innerAdClickRecord=[");
        a aVar = this.f6279p;
        return AbstractC5051n.g(sb, aVar == null ? "null" : aVar.toString(), "]}");
    }
}
