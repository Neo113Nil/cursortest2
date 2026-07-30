package com.baidu.mapsdkplatform.comapi.map;

import android.os.Bundle;
import com.baidu.mapapi.map.WinRound;
import com.baidu.platform.comapi.basestruct.Point;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: m, reason: collision with root package name */
    public double f8160m;

    /* renamed from: n, reason: collision with root package name */
    public double f8161n;

    /* renamed from: o, reason: collision with root package name */
    public int f8162o;

    /* renamed from: p, reason: collision with root package name */
    public String f8163p;

    /* renamed from: q, reason: collision with root package name */
    public float f8164q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8165r;

    /* renamed from: s, reason: collision with root package name */
    public int f8166s;

    /* renamed from: a, reason: collision with root package name */
    public float f8148a = 12.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f8149b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f8150c = 0;

    /* renamed from: d, reason: collision with root package name */
    public double f8151d = 1.2958162E7d;

    /* renamed from: e, reason: collision with root package name */
    public double f8152e = 4825907.0d;

    /* renamed from: h, reason: collision with root package name */
    public float f8155h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f8156i = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f8153f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f8154g = -1;

    /* renamed from: j, reason: collision with root package name */
    public WinRound f8157j = new WinRound();

    /* renamed from: k, reason: collision with root package name */
    public a f8158k = new a();

    /* renamed from: l, reason: collision with root package name */
    public boolean f8159l = false;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public long f8167a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f8168b = 0;

        /* renamed from: c, reason: collision with root package name */
        public long f8169c = 0;

        /* renamed from: d, reason: collision with root package name */
        public long f8170d = 0;

        /* renamed from: e, reason: collision with root package name */
        public Point f8171e = new Point(0, 0);

        /* renamed from: f, reason: collision with root package name */
        public Point f8172f = new Point(0, 0);

        /* renamed from: g, reason: collision with root package name */
        public Point f8173g = new Point(0, 0);

        /* renamed from: h, reason: collision with root package name */
        public Point f8174h = new Point(0, 0);

        public a() {
        }
    }

    public void a(Bundle bundle) {
        int i8;
        if (bundle == null) {
            return;
        }
        this.f8148a = (float) bundle.getDouble("level");
        this.f8149b = (int) bundle.getDouble("rotation");
        this.f8150c = (int) bundle.getDouble("overlooking");
        this.f8151d = bundle.getDouble("centerptx");
        this.f8152e = bundle.getDouble("centerpty");
        this.f8157j.left = bundle.getInt(TtmlNode.LEFT);
        this.f8157j.right = bundle.getInt(TtmlNode.RIGHT);
        this.f8157j.top = bundle.getInt("top");
        this.f8157j.bottom = bundle.getInt("bottom");
        this.f8155h = bundle.getFloat("xoffset");
        float f8 = bundle.getFloat("yoffset");
        this.f8156i = f8;
        WinRound winRound = this.f8157j;
        int i9 = winRound.right;
        if (i9 != 0 && (i8 = winRound.bottom) != 0) {
            int i10 = (i9 - winRound.left) / 2;
            int i11 = (i8 - winRound.top) / 2;
            this.f8153f = ((int) this.f8155h) + i10;
            this.f8154g = ((int) (-f8)) + i11;
        }
        this.f8158k.f8167a = bundle.getLong("gleft");
        this.f8158k.f8168b = bundle.getLong("gright");
        this.f8158k.f8169c = bundle.getLong("gtop");
        this.f8158k.f8170d = bundle.getLong("gbottom");
        a aVar = this.f8158k;
        if (aVar.f8167a <= -20037508) {
            aVar.f8167a = -20037508L;
        }
        if (aVar.f8168b >= 20037508) {
            aVar.f8168b = 20037508L;
        }
        if (aVar.f8169c >= 20037508) {
            aVar.f8169c = 20037508L;
        }
        if (aVar.f8170d <= -20037508) {
            aVar.f8170d = -20037508L;
        }
        Point point = aVar.f8171e;
        double d8 = aVar.f8167a;
        point.doubleX = d8;
        double d9 = aVar.f8170d;
        point.doubleY = d9;
        Point point2 = aVar.f8172f;
        point2.doubleX = d8;
        double d10 = aVar.f8169c;
        point2.doubleY = d10;
        Point point3 = aVar.f8173g;
        double d11 = aVar.f8168b;
        point3.doubleX = d11;
        point3.doubleY = d10;
        Point point4 = aVar.f8174h;
        point4.doubleX = d11;
        point4.doubleY = d9;
        this.f8159l = bundle.getInt("bfpp") == 1;
        this.f8160m = bundle.getFloat("adapterZoomUnits");
        this.f8161n = bundle.getDouble("zoomunit");
        this.f8163p = bundle.getString("panoid");
        this.f8164q = bundle.getFloat("siangle");
        this.f8165r = bundle.getInt("isbirdeye") != 0;
        this.f8166s = bundle.getInt("ssext");
    }

    public Bundle a(b bVar) {
        int i8;
        int i9;
        WinRound winRound;
        int i10;
        int i11;
        float f8 = this.f8148a;
        float f9 = bVar.f8052e;
        if (f8 < f9) {
            this.f8148a = f9;
        }
        float f10 = this.f8148a;
        float f11 = bVar.f8051d;
        if (f10 > f11) {
            if (f10 == 1096.0f || b.f8048a == 26.0f) {
                this.f8148a = 26.0f;
                b.f8048a = 26.0f;
            } else {
                this.f8148a = f11;
            }
        }
        while (true) {
            i8 = this.f8149b;
            if (i8 >= 0) {
                break;
            }
            this.f8149b = i8 + 360;
        }
        this.f8149b = i8 % 360;
        if (this.f8150c > 0) {
            this.f8150c = 0;
        }
        if (this.f8150c < -80) {
            this.f8150c = -80;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", this.f8148a);
        bundle.putDouble("rotation", this.f8149b);
        bundle.putDouble("overlooking", this.f8150c);
        bundle.putDouble("centerptx", this.f8151d);
        bundle.putDouble("centerpty", this.f8152e);
        bundle.putInt(TtmlNode.LEFT, this.f8157j.left);
        bundle.putInt(TtmlNode.RIGHT, this.f8157j.right);
        bundle.putInt("top", this.f8157j.top);
        bundle.putInt("bottom", this.f8157j.bottom);
        int i12 = this.f8153f;
        if (i12 >= 0 && (i9 = this.f8154g) >= 0 && i12 <= (i10 = (winRound = this.f8157j).right) && i9 <= (i11 = winRound.bottom) && i10 > 0 && i11 > 0) {
            int i13 = (i10 - winRound.left) / 2;
            int i14 = i9 - ((i11 - winRound.top) / 2);
            float f12 = i12 - i13;
            this.f8155h = f12;
            this.f8156i = -i14;
            bundle.putFloat("xoffset", f12);
            bundle.putFloat("yoffset", this.f8156i);
        }
        bundle.putInt("lbx", this.f8158k.f8171e.getIntX());
        bundle.putInt("lby", this.f8158k.f8171e.getIntY());
        bundle.putInt("ltx", this.f8158k.f8172f.getIntX());
        bundle.putInt("lty", this.f8158k.f8172f.getIntY());
        bundle.putInt("rtx", this.f8158k.f8173g.getIntX());
        bundle.putInt("rty", this.f8158k.f8173g.getIntY());
        bundle.putInt("rbx", this.f8158k.f8174h.getIntX());
        bundle.putInt("rby", this.f8158k.f8174h.getIntY());
        bundle.putLong("gleft", this.f8158k.f8167a);
        bundle.putLong("gbottom", this.f8158k.f8170d);
        bundle.putLong("gtop", this.f8158k.f8169c);
        bundle.putLong("gright", this.f8158k.f8168b);
        bundle.putInt("bfpp", this.f8159l ? 1 : 0);
        bundle.putInt("animation", 1);
        bundle.putInt("animatime", this.f8162o);
        bundle.putString("panoid", this.f8163p);
        bundle.putInt("autolink", 0);
        bundle.putFloat("siangle", this.f8164q);
        bundle.putInt("isbirdeye", this.f8165r ? 1 : 0);
        bundle.putInt("ssext", this.f8166s);
        return bundle;
    }
}
