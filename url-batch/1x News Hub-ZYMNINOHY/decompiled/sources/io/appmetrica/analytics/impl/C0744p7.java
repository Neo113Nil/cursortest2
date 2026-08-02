package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744p7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8063b;

    /* renamed from: c, reason: collision with root package name */
    public final Y8 f8064c;

    /* renamed from: d, reason: collision with root package name */
    public final E8 f8065d;

    /* renamed from: e, reason: collision with root package name */
    public final C0556i0 f8066e;
    public final O8 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0821s7 f8067g;

    /* renamed from: h, reason: collision with root package name */
    public final W5 f8068h;

    public C0744p7(Context context, Yk yk, int i3, Y8 y8, E8 e8, C0556i0 c0556i0, O8 o8, C0821s7 c0821s7) {
        this.f8062a = context;
        this.f8063b = i3;
        this.f8064c = y8;
        this.f8065d = e8;
        this.f8066e = c0556i0;
        this.f = o8;
        this.f8067g = c0821s7;
        this.f8068h = e8.f5954a;
    }

    public static String b() {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        C0786qn C3 = C0876ua.f8420H.C();
        C0718o7 c0718o7 = new C0718o7(qVar);
        synchronized (C3) {
            C3.f8186b.a(c0718o7);
        }
        return (String) qVar.f9692a;
    }

    public final C0640l7 a() {
        JSONObject optJSONObject;
        Jo jo;
        Integer valueOf = Integer.valueOf(this.f8068h.f6819e);
        String name = this.f8068h.getName();
        String value = this.f8068h.getValue();
        Y8 y8 = this.f8064c;
        int i3 = this.f8063b;
        zo zoVar = y8.f6896a.f6935a;
        synchronized (zoVar) {
            optJSONObject = zoVar.f8716a.a().optJSONObject("numbers_of_type");
        }
        long optLong = optJSONObject != null ? optJSONObject.optLong(String.valueOf(i3)) : 0L;
        y8.f6896a.a(i3, 1 + optLong);
        Long valueOf2 = Long.valueOf(optLong);
        C0821s7 c0821s7 = this.f8067g;
        c0821s7.getClass();
        Rb m3 = C0876ua.f8420H.m();
        Location userLocation = m3.getUserLocation();
        if (userLocation != null) {
            int i4 = Jo.f6219b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo = new Jo(location, provider);
        } else {
            Location systemLocation = m3.getSystemLocation();
            jo = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z = c0821s7.f8298a.f8082d;
        Double valueOf3 = jo != null ? Double.valueOf(jo.getLatitude()) : null;
        Double valueOf4 = jo != null ? Double.valueOf(jo.getLongitude()) : null;
        Long valueOf5 = jo != null ? Long.valueOf(jo.getTime()) : null;
        Integer valueOf6 = jo != null ? Integer.valueOf((int) jo.getAccuracy()) : null;
        Integer valueOf7 = jo != null ? Integer.valueOf((int) jo.getBearing()) : null;
        Integer valueOf8 = jo != null ? Integer.valueOf((int) jo.getSpeed()) : null;
        C0770q7 c0770q7 = new C0770q7(Boolean.valueOf(z), valueOf4, valueOf3, jo != null ? Integer.valueOf((int) jo.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, jo != null ? jo.getProvider() : null, jo != null ? jo.f6220a : null);
        String str = this.f8068h.f6817c;
        C0556i0 c0556i0 = this.f8066e;
        String str2 = c0556i0.f7491a;
        Long valueOf9 = Long.valueOf(c0556i0.f7492b);
        Integer valueOf10 = Integer.valueOf(this.f8068h.f6820g);
        Context context = this.f8062a;
        He he = Le.f6279a;
        Integer num = (Integer) Le.f6281c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
        num.intValue();
        String b3 = b();
        N8 n8 = this.f8065d.f5955b;
        W5 w5 = this.f8068h;
        return new C0640l7(valueOf, name, value, valueOf2, c0770q7, str, str2, valueOf9, valueOf10, num, b3, n8, w5.f6821h, w5.f6824k, w5.f6825l, w5.f6827n, w5.o, this.f.fromModel(w5.f6828p));
    }

    public /* synthetic */ C0744p7(Context context, Yk yk, int i3, Y8 y8, E8 e8, C0754ph c0754ph, C0556i0 c0556i0) {
        this(context, yk, i3, y8, e8, c0556i0, new O8(), new C0821s7(c0754ph));
    }
}
