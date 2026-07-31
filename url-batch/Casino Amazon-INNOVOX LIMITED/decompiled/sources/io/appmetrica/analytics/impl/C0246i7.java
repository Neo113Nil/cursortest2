package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.i7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0246i7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1302a;
    public final int b;
    public final yo c;
    public final A8 d;
    public final C0239i0 e;
    public final K8 f;
    public final C0323l7 g;
    public final Q5 h;

    public C0246i7(Context context, Uk uk, int i, yo yoVar, A8 a8, C0239i0 c0239i0, K8 k8, C0323l7 c0323l7) {
        this.f1302a = context;
        this.b = i;
        this.c = yoVar;
        this.d = a8;
        this.e = c0239i0;
        this.f = k8;
        this.g = c0323l7;
        this.h = a8.f758a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0439pn C = C0401oa.I.C();
        C0220h7 c0220h7 = new C0220h7(objectRef);
        synchronized (C) {
            C.b.a(c0220h7);
        }
        return (String) objectRef.element;
    }

    public final C0142e7 a() {
        long optLong;
        Jo jo;
        Integer valueOf = Integer.valueOf(this.h.e);
        String name = this.h.getName();
        String value = this.h.getValue();
        yo yoVar = this.c;
        int i = this.b;
        synchronized (yoVar) {
            JSONObject a2 = yoVar.f1591a.a();
            JSONObject optJSONObject = a2.optJSONObject("numbers_of_type");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optLong = optJSONObject.optLong(String.valueOf(i));
            optJSONObject.put(String.valueOf(i), 1 + optLong);
            yoVar.f1591a.a(a2.put("numbers_of_type", optJSONObject));
        }
        Long valueOf2 = Long.valueOf(optLong);
        C0323l7 c0323l7 = this.g;
        c0323l7.getClass();
        Lb m = C0401oa.I.m();
        Location userLocation = m.getUserLocation();
        if (userLocation != null) {
            int i2 = Jo.b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo = new Jo(location, provider);
        } else {
            Location systemLocation = m.getSystemLocation();
            jo = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z = c0323l7.f1355a.d;
        Double valueOf3 = jo != null ? Double.valueOf(jo.getLatitude()) : null;
        Double valueOf4 = jo != null ? Double.valueOf(jo.getLongitude()) : null;
        Long valueOf5 = jo != null ? Long.valueOf(jo.getTime()) : null;
        Integer valueOf6 = jo != null ? Integer.valueOf((int) jo.getAccuracy()) : null;
        Integer valueOf7 = jo != null ? Integer.valueOf((int) jo.getBearing()) : null;
        Integer valueOf8 = jo != null ? Integer.valueOf((int) jo.getSpeed()) : null;
        C0271j7 c0271j7 = new C0271j7(Boolean.valueOf(z), valueOf4, valueOf3, jo != null ? Integer.valueOf((int) jo.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, jo != null ? jo.getProvider() : null, jo != null ? jo.f911a : null);
        String str = this.h.c;
        C0239i0 c0239i0 = this.e;
        String str2 = c0239i0.f1297a;
        Long valueOf9 = Long.valueOf(c0239i0.b);
        Integer valueOf10 = Integer.valueOf(this.h.g);
        Context context = this.f1302a;
        De de = He.f873a;
        Integer valueOf11 = Integer.valueOf(((Integer) He.c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ge()))).intValue());
        String b = b();
        J8 j8 = this.d.b;
        Q5 q5 = this.h;
        return new C0142e7(valueOf, name, value, valueOf2, c0271j7, str, str2, valueOf9, valueOf10, valueOf11, b, j8, q5.h, q5.k, q5.l, q5.n, q5.o, this.f.fromModel(q5.p));
    }

    public /* synthetic */ C0246i7(Context context, Uk uk, int i, yo yoVar, A8 a8, C0333lh c0333lh, C0239i0 c0239i0) {
        this(context, uk, i, yoVar, a8, c0239i0, new K8(), new C0323l7(c0333lh));
    }
}
