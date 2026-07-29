package com.youappi.sdk.net;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.a.a.a.b;
import com.a.a.a.d;
import com.a.a.a.e;
import com.a.a.a.f;
import com.aiming.mdt.utils.Constants;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.AdType;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.ads.YAAdRequest;
import com.youappi.sdk.logic.impl.c;
import com.youappi.sdk.logic.model.a;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.DeviceOrientation;
import com.youappi.sdk.net.model.ProductItem;
import com.youappi.sdk.net.model.ProductRequestItem;
import com.youappi.sdk.net.model.ext.UserApps;
import com.youappi.sdk.utils.g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9464a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static String f9465b = "ads?accessToken=$accessToken";

    /* renamed from: c, reason: collision with root package name */
    private final c f9466c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9467d;
    private final String e;
    private final String f;
    private Context g;
    private String h;
    private String i;

    public a(c cVar, String str, String str2, String str3, Context context) {
        this.f9466c = cVar;
        this.f9467d = str;
        this.e = str2;
        this.f = str3;
        this.g = context;
        c();
    }

    private ProductRequestItem a(AdType adType, String str, String str2, YAAdRequest yAAdRequest) {
        String i = this.f9466c.i();
        String valueOf = String.valueOf(this.f9466c.h());
        String a2 = this.f9466c.a();
        String d2 = this.f9466c.d();
        String c2 = this.f9466c.c();
        int b2 = this.f9466c.b();
        if (a2 == null) {
            a2 = "";
        }
        ProductRequestItem productRequestItem = new ProductRequestItem(new ProductRequestItem.PublisherApp(this.e, this.f, a(adType), str != null ? str : a(adType), YouAPPi.getVersionStr(), str2, g.b(this.g), this.h), new ProductRequestItem.Device(i, TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE, valueOf, a2, d2, this.f9466c.j(), this.f9466c.l(), b2 == 2 ? DeviceOrientation.Landscape : DeviceOrientation.Portrait, c2, com.youappi.sdk.utils.b.a(this.g), com.youappi.sdk.utils.c.b(), com.youappi.sdk.utils.c.a()), new ProductRequestItem.User(YouAPPi.getInstance().hasUserConsent(), YouAPPi.getInstance().isAgeRestrictedUser(), yAAdRequest.getCustomParams(), yAAdRequest.getAge(), yAAdRequest.getGender(), YouAPPi.getInstance().isSendApps()));
        Location m = this.f9466c.m();
        if (m == null || !YouAPPi.getInstance().hasUserConsent() || YouAPPi.getInstance().isAgeRestrictedUser()) {
            this.f9466c.n();
        } else {
            productRequestItem.setGeoLocation(new ProductRequestItem.GeoLocation(m.getLatitude(), m.getLongitude()));
        }
        return productRequestItem;
    }

    private static String a(AdType adType) {
        switch (adType) {
            case CARD:
                return ProductRequestItem.PublisherApp.UNIT_TYPE_CARD;
            case REWARDED_VIDEO:
                return ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO;
            case VIDEO:
                return ProductRequestItem.PublisherApp.UNIT_TYPE_VIDEO;
            default:
                return null;
        }
    }

    private void a(e eVar) {
        eVar.a(this);
        if (eVar.k() == null) {
            eVar.b(this.f9467d);
        }
        com.a.a.a.c.a().a(eVar);
    }

    private static int b(AdType adType) {
        switch (adType) {
            case CARD:
                return 101;
            case REWARDED_VIDEO:
                return 103;
            case VIDEO:
                return 102;
            default:
                return -1;
        }
    }

    private void c() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            this.h = "Unity";
        } catch (ClassNotFoundException unused) {
            Log.i("YouAPPiAPI", "unity is not present");
            this.h = null;
        }
        try {
            Class.forName("com.youappi.sdk.mediation.admob.YouAppiAdMobUtils");
            this.i = "AdMob";
        } catch (ClassNotFoundException unused2) {
            Log.i("YouAPPiAPI", "mediation type is not AdMob");
            this.i = null;
            try {
                Class.forName("com.youappi.sdk.mediation.mopub.YouAppiMoPubUtils");
                this.i = "MoPub";
            } catch (ClassNotFoundException unused3) {
                Log.i("YouAPPiAPI", "mediation type is not MoPub");
                this.i = null;
            }
        }
    }

    private boolean d() {
        return !YouAPPi.getInstance().isRestrictedUser() && g.a(this.g).booleanValue();
    }

    public e a(b<ProductItem<? extends AdItem>> bVar, AdType adType, String str, YAAdRequest yAAdRequest) {
        e.a aVar = new e.a();
        aVar.b("POST");
        aVar.a(f9465b.replace("$accessToken", this.e));
        aVar.a((Class<? extends Object>) adType.getProductClass());
        aVar.a(b(adType));
        aVar.a(Constants.KEY_CONTENT_TYPE, "application/json");
        aVar.a(a(adType, str, this.i, yAAdRequest));
        aVar.a((b) bVar);
        e a2 = aVar.a();
        if (this.f9466c.k() != null) {
            bVar.onNetError(new d(a2, 400, this.f9466c.k()));
            return null;
        }
        a(a2);
        return a2;
    }

    public void a() {
        if (d()) {
            String.valueOf(this.f9466c.h());
            String a2 = this.f9466c.a();
            e.a aVar = new e.a();
            aVar.b("POST");
            aVar.a(TapjoyConstants.TJC_APP_PLACEMENT);
            aVar.c(this.f9467d);
            aVar.a(InputStream.class);
            aVar.a(107);
            aVar.a(Constants.KEY_CONTENT_TYPE, "application/json");
            aVar.a(new b() { // from class: com.youappi.sdk.net.a.1
                @Override // com.a.a.a.b
                public boolean onNetError(d dVar) {
                    g.a(a.this.g, new Date());
                    return false;
                }

                @Override // com.a.a.a.b
                public boolean onNetFinished(f fVar) {
                    g.a(a.this.g, new Date());
                    return false;
                }
            });
            aVar.a(new UserApps(this.g, "", a2, this.e));
            com.a.a.a.c.a().a(aVar.a());
        }
    }

    public void a(b bVar, String str) {
        e.a aVar = new e.a();
        aVar.b("GET");
        aVar.c(str);
        aVar.a(String.class);
        aVar.a(100);
        aVar.a(bVar);
        a(aVar.a());
    }

    public void a(String str) {
        e.a aVar = new e.a();
        aVar.b("GET");
        aVar.c(str);
        aVar.a((String) null);
        aVar.a(105);
        a(aVar.a());
    }

    public void a(a.C0412a... c0412aArr) {
        com.youappi.sdk.logic.model.a aVar = new com.youappi.sdk.logic.model.a();
        aVar.a(this.e);
        aVar.b(TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        aVar.c(this.f9466c.g());
        aVar.d(this.f9466c.i());
        aVar.e(this.f9466c.h() + "");
        aVar.f(this.f9466c.l());
        aVar.g(YouAPPi.getVersionStr());
        aVar.a(Arrays.asList(c0412aArr));
        e.a aVar2 = new e.a();
        aVar2.b("POST");
        aVar2.a("log");
        aVar2.a(106);
        aVar2.a(aVar);
        aVar2.a(Constants.KEY_CONTENT_TYPE, "application/json");
        a(aVar2.a());
    }

    public void b() {
        com.a.a.a.c.b();
    }

    @Override // com.a.a.a.b
    public boolean onNetError(d dVar) {
        return false;
    }

    @Override // com.a.a.a.b
    public boolean onNetFinished(f fVar) {
        switch (fVar.a().d()) {
            case 101:
                break;
        }
        return false;
    }
}
