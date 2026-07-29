package com.ironsource.b.a;

/* compiled from: ConfigFile.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f6717a;

    /* renamed from: b, reason: collision with root package name */
    private String f6718b;

    /* renamed from: c, reason: collision with root package name */
    private String f6719c;

    /* renamed from: d, reason: collision with root package name */
    private String f6720d;
    private String[] e = {"Unity", "AdobeAir", "Xamarin", "Corona", "AdMob", "MoPub"};

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f6717a == null) {
                f6717a = new a();
            }
            aVar = f6717a;
        }
        return aVar;
    }

    public String b() {
        return this.f6718b;
    }

    public String c() {
        return this.f6719c;
    }

    public String d() {
        return this.f6720d;
    }
}
