package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class D7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37343b;

    /* renamed from: c, reason: collision with root package name */
    public final C2802m9 f37344c;

    /* renamed from: d, reason: collision with root package name */
    public final S8 f37345d;

    /* renamed from: e, reason: collision with root package name */
    public final C2638g0 f37346e;

    /* renamed from: f, reason: collision with root package name */
    public final C2540c9 f37347f;

    /* renamed from: g, reason: collision with root package name */
    public final G7 f37348g;

    /* renamed from: h, reason: collision with root package name */
    public final C2773l6 f37349h;

    public D7(Context context, Uk uk, int i4, C2802m9 c2802m9, S8 s8, C2638g0 c2638g0, C2540c9 c2540c9, G7 g7) {
        this.f37342a = context;
        this.f37343b = i4;
        this.f37344c = c2802m9;
        this.f37345d = s8;
        this.f37346e = c2638g0;
        this.f37347f = c2540c9;
        this.f37348g = g7;
        this.f37349h = s8.f38248a;
    }

    public static String b() {
        kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        C2790ln A4 = Ia.f37730F.A();
        C7 c7 = new C7(g4);
        synchronized (A4) {
            A4.f39412b.a(c7);
        }
        return (String) g4.f41132b;
    }

    public final C3137z7 a() {
        JSONObject optJSONObject;
        Eo eo;
        Integer valueOf = Integer.valueOf(this.f37349h.f39380e);
        String name = this.f37349h.getName();
        String value = this.f37349h.getValue();
        C2802m9 c2802m9 = this.f37344c;
        int i4 = this.f37343b;
        C3024uo c3024uo = c2802m9.f39440a.f39493a;
        synchronized (c3024uo) {
            optJSONObject = c3024uo.f39951a.a().optJSONObject("numbers_of_type");
        }
        long optLong = optJSONObject != null ? optJSONObject.optLong(String.valueOf(i4)) : 0L;
        c2802m9.f39440a.a(i4, 1 + optLong);
        Long valueOf2 = Long.valueOf(optLong);
        G7 g7 = this.f37348g;
        g7.getClass();
        InterfaceC2623fc l4 = Ia.f37730F.l();
        Location userLocation = l4.getUserLocation();
        if (userLocation != null) {
            int i5 = Eo.f37485b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            eo = new Eo(location, provider);
        } else {
            Location systemLocation = l4.getSystemLocation();
            eo = systemLocation != null ? new Eo(new Location(systemLocation), "") : null;
        }
        boolean z4 = g7.f37567a.f40177d;
        Double valueOf3 = eo != null ? Double.valueOf(eo.getLatitude()) : null;
        Double valueOf4 = eo != null ? Double.valueOf(eo.getLongitude()) : null;
        Long valueOf5 = eo != null ? Long.valueOf(eo.getTime()) : null;
        Integer valueOf6 = eo != null ? Integer.valueOf((int) eo.getAccuracy()) : null;
        Integer valueOf7 = eo != null ? Integer.valueOf((int) eo.getBearing()) : null;
        Integer valueOf8 = eo != null ? Integer.valueOf((int) eo.getSpeed()) : null;
        E7 e7 = new E7(Boolean.valueOf(z4), valueOf4, valueOf3, eo != null ? Integer.valueOf((int) eo.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, eo != null ? eo.getProvider() : null, eo != null ? eo.f37486a : null);
        String str = this.f37349h.f39378c;
        C2638g0 c2638g0 = this.f37346e;
        String str2 = c2638g0.f39022a;
        Long valueOf9 = Long.valueOf(c2638g0.f39023b);
        Integer valueOf10 = Integer.valueOf(this.f37349h.f39382g);
        Context context = this.f37342a;
        SafePackageManager safePackageManager = Ue.f38360a;
        Integer num = (Integer) Ue.f38363d.a((Te) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Te.UNDEFINED, new Se()));
        num.intValue();
        String b4 = b();
        EnumC2513b9 enumC2513b9 = this.f37345d.f38249b;
        C2773l6 c2773l6 = this.f37349h;
        return new C3137z7(valueOf, name, value, valueOf2, e7, str, str2, valueOf9, valueOf10, num, b4, enumC2513b9, c2773l6.f39383h, c2773l6.f39386k, c2773l6.f39387l, c2773l6.f39389n, c2773l6.f39390o, this.f37347f.fromModel(c2773l6.f39391p));
    }

    public /* synthetic */ D7(Context context, Uk uk, int i4, C2802m9 c2802m9, S8 s8, C3095xh c3095xh, C2638g0 c2638g0) {
        this(context, uk, i4, c2802m9, s8, c2638g0, new C2540c9(), new G7(c3095xh));
    }
}
