package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11973b;

    /* renamed from: c, reason: collision with root package name */
    public final C1090xo f11974c;

    /* renamed from: d, reason: collision with root package name */
    public final C1126z8 f11975d;

    /* renamed from: e, reason: collision with root package name */
    public final C0678i0 f11976e;

    /* renamed from: f, reason: collision with root package name */
    public final J8 f11977f;

    /* renamed from: g, reason: collision with root package name */
    public final C0736k7 f11978g;

    /* renamed from: h, reason: collision with root package name */
    public final P5 f11979h;

    public C0659h7(Context context, Tk tk, int i4, C1090xo c1090xo, C1126z8 c1126z8, C0678i0 c0678i0, J8 j8, C0736k7 c0736k7) {
        this.f11972a = context;
        this.f11973b = i4;
        this.f11974c = c1090xo;
        this.f11975d = c1126z8;
        this.f11976e = c0678i0;
        this.f11977f = j8;
        this.f11978g = c0736k7;
        this.f11979h = c1126z8.f13094a;
    }

    public static String b() {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        C0856on C4 = C0817na.f12417I.C();
        C0633g7 c0633g7 = new C0633g7(pVar);
        synchronized (C4) {
            C4.f12535b.a(c0633g7);
        }
        return (String) pVar.f14159a;
    }

    public final C0556d7 a() {
        long optLong;
        Io io2;
        Integer valueOf = Integer.valueOf(this.f11979h.f10798e);
        String name = this.f11979h.getName();
        String value = this.f11979h.getValue();
        C1090xo c1090xo = this.f11974c;
        int i4 = this.f11973b;
        synchronized (c1090xo) {
            try {
                JSONObject a3 = c1090xo.f13040a.a();
                JSONObject optJSONObject = a3.optJSONObject("numbers_of_type");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optLong = optJSONObject.optLong(String.valueOf(i4));
                optJSONObject.put(String.valueOf(i4), 1 + optLong);
                c1090xo.f13040a.a(a3.put("numbers_of_type", optJSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
        Long valueOf2 = Long.valueOf(optLong);
        C0736k7 c0736k7 = this.f11978g;
        c0736k7.getClass();
        Kb m4 = C0817na.f12417I.m();
        Location userLocation = m4.getUserLocation();
        if (userLocation != null) {
            int i5 = Io.f10448b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            io2 = new Io(location, provider);
        } else {
            Location systemLocation = m4.getSystemLocation();
            io2 = systemLocation != null ? new Io(new Location(systemLocation), "") : null;
        }
        boolean z = c0736k7.f12198a.f12222d;
        Double valueOf3 = io2 != null ? Double.valueOf(io2.getLatitude()) : null;
        Double valueOf4 = io2 != null ? Double.valueOf(io2.getLongitude()) : null;
        Long valueOf5 = io2 != null ? Long.valueOf(io2.getTime()) : null;
        Integer valueOf6 = io2 != null ? Integer.valueOf((int) io2.getAccuracy()) : null;
        Integer valueOf7 = io2 != null ? Integer.valueOf((int) io2.getBearing()) : null;
        Integer valueOf8 = io2 != null ? Integer.valueOf((int) io2.getSpeed()) : null;
        C0685i7 c0685i7 = new C0685i7(Boolean.valueOf(z), valueOf4, valueOf3, io2 != null ? Integer.valueOf((int) io2.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, io2 != null ? io2.getProvider() : null, io2 != null ? io2.f10449a : null);
        String str = this.f11979h.f10796c;
        C0678i0 c0678i0 = this.f11976e;
        String str2 = c0678i0.f12011a;
        Long valueOf9 = Long.valueOf(c0678i0.f12012b);
        Integer valueOf10 = Integer.valueOf(this.f11979h.f10800g);
        Context context = this.f11972a;
        Ce ce = Ge.f10317a;
        Integer num = (Integer) Ge.f10319c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
        num.intValue();
        String b4 = b();
        I8 i8 = this.f11975d.f13095b;
        P5 p5 = this.f11979h;
        return new C0556d7(valueOf, name, value, valueOf2, c0685i7, str, str2, valueOf9, valueOf10, num, b4, i8, p5.f10801h, p5.f10804k, p5.f10805l, p5.n, p5.o, this.f11977f.fromModel(p5.f10807p));
    }

    public /* synthetic */ C0659h7(Context context, Tk tk, int i4, C1090xo c1090xo, C1126z8 c1126z8, C0746kh c0746kh, C0678i0 c0678i0) {
        this(context, tk, i4, c1090xo, c1126z8, c0678i0, new J8(), new C0736k7(c0746kh));
    }
}
