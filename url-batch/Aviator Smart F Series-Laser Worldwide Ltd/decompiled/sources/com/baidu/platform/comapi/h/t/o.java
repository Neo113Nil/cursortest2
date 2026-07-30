package com.baidu.platform.comapi.h.t;

import com.baidu.mapapi.map.MapLanguage;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f9297a;

    /* renamed from: b, reason: collision with root package name */
    private int f9298b;

    /* renamed from: c, reason: collision with root package name */
    private int f9299c;

    /* renamed from: d, reason: collision with root package name */
    private String f9300d;

    /* renamed from: e, reason: collision with root package name */
    private String f9301e;

    private o() {
    }

    public static synchronized o b() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f9297a == null) {
                    f9297a = new o();
                }
                oVar = f9297a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public void a() {
        this.f9301e = "";
        this.f9300d = "";
    }

    public String c() {
        return this.f9301e;
    }

    public String d() {
        return this.f9300d;
    }

    public void a(int i8, int i9, MapLanguage mapLanguage) {
        if (i8 == 0 && i9 == 0) {
            return;
        }
        if (mapLanguage == null) {
            mapLanguage = MapLanguage.CHINESE;
        }
        this.f9298b = i8;
        this.f9299c = i9;
        StringBuffer stringBuffer = new StringBuffer();
        g.a(i9, mapLanguage, stringBuffer);
        this.f9301e = stringBuffer.toString();
        this.f9300d = g.a(i8, mapLanguage);
    }
}
