package com.chartboost.sdk.InPlay;

import android.graphics.Bitmap;
import android.os.Handler;
import com.applovin.mediation.AppLovinNativeAdapter;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.a;
import com.chartboost.sdk.b;
import com.chartboost.sdk.h;
import com.chartboost.sdk.impl.ah;
import com.chartboost.sdk.impl.aj;
import com.chartboost.sdk.impl.ak;
import com.chartboost.sdk.impl.ap;
import com.chartboost.sdk.impl.bh;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.c.a;
import com.chartboost.sdk.impl.e;
import com.chartboost.sdk.impl.e.a;
import com.chartboost.sdk.impl.g;
import com.chartboost.sdk.impl.s;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CBInPlay {

    /* renamed from: a, reason: collision with root package name */
    private final e f3563a;
    public final String appName;

    /* renamed from: b, reason: collision with root package name */
    private final ah f3564b;

    /* renamed from: c, reason: collision with root package name */
    private final ap f3565c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3566d;
    private final ak e;
    private final com.chartboost.sdk.Model.a f;
    private Bitmap g;
    public final File largeAppIconFile;
    public final String largeAppIconUrl;
    public final String location;

    private CBInPlay(e eVar, ah ahVar, ap apVar, a aVar, ak akVar, com.chartboost.sdk.Model.a aVar2, String str, File file, String str2) {
        this.f3563a = eVar;
        this.f3564b = ahVar;
        this.f3565c = apVar;
        this.f3566d = aVar;
        this.e = akVar;
        this.f = aVar2;
        this.appName = aVar2.q;
        this.largeAppIconUrl = str;
        this.largeAppIconFile = file;
        this.location = str2;
    }

    public void show() {
        aj ajVar = new aj("/inplay/show", this.f3565c, this.f3566d, 2, new g(this.f3563a, this.location));
        ajVar.j = 1;
        ajVar.a("inplay-dictionary", this.f.f3610a);
        ajVar.a(GooglePlayServicesInterstitial.LOCATION_KEY, this.location);
        this.f3564b.a(ajVar);
    }

    public void click() {
        String str = this.f.j;
        String str2 = this.f.i;
        String str3 = (str2.isEmpty() || !this.e.a(str2)) ? str : str2;
        aj ajVar = new aj("/api/click", this.f3565c, this.f3566d, 2, null);
        ajVar.a(GooglePlayServicesInterstitial.LOCATION_KEY, this.location);
        ajVar.a(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO, this.f.m);
        ajVar.a("cgn", this.f.g);
        ajVar.a("creative", this.f.h);
        ajVar.a(AppLovinNativeAdapter.KEY_EXTRA_AD_ID, this.f.f);
        ajVar.a("type", TapjoyConstants.TJC_PLUGIN_NATIVE);
        if (str3 != null && !str3.isEmpty()) {
            this.e.a(null, str3, ajVar);
        } else {
            this.e.a(null, false, str3, CBError.CBClickError.URI_INVALID, ajVar);
        }
    }

    public String getLocation() {
        return this.location;
    }

    public Bitmap getAppIcon() throws Exception {
        if (this.g == null) {
            try {
                byte[] b2 = bh.b(this.largeAppIconFile);
                if (b2 != null) {
                    this.g = s.a().a(b2);
                }
                if (this.g == null) {
                    CBLogging.b("CBInPlay", "Error decoding inplay bitmap " + this.largeAppIconFile.getAbsolutePath());
                    if (!this.largeAppIconFile.delete()) {
                        CBLogging.b("CBInPlay", "Unable to delete corrupt inplay bitmap " + this.largeAppIconFile.getAbsolutePath());
                    }
                    throw new Exception("decodeByteArrayToBitmap returned null");
                }
            } catch (OutOfMemoryError e) {
                CBLogging.b("CBInPlay", "Out of memory decoding inplay bitmap " + this.largeAppIconFile.getAbsolutePath());
                throw new Exception(e);
            }
        }
        return this.g;
    }

    public String getAppName() {
        return this.appName;
    }

    public static void cacheInPlay(String str) {
        h a2 = h.a();
        if (a2 == null || !b.a()) {
            return;
        }
        if (s.a().a(str)) {
            CBLogging.b("CBInPlay", "cacheInPlay location cannot be empty");
            Handler handler = a2.p;
            c cVar = a2.e;
            cVar.getClass();
            handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
            return;
        }
        com.chartboost.sdk.Model.e eVar = a2.m.get();
        if ((eVar.y && eVar.z) || (eVar.e && eVar.f)) {
            e eVar2 = a2.f3670d;
            eVar2.getClass();
            a2.f3667a.execute(eVar2.new a(3, str, null, null));
            return;
        }
        Handler handler2 = a2.p;
        c cVar2 = a2.e;
        cVar2.getClass();
        handler2.post(cVar2.new a(4, str, CBError.CBImpressionError.END_POINT_DISABLED));
    }

    public static boolean hasInPlay(String str) {
        h a2 = h.a();
        if (a2 == null || !b.a()) {
            return false;
        }
        if (!s.a().a(str)) {
            return a2.f3670d.a(str) != null;
        }
        CBLogging.b("CBInPlay", "hasInPlay location cannot be empty");
        Handler handler = a2.p;
        c cVar = a2.e;
        cVar.getClass();
        handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
        return false;
    }

    public static CBInPlay getInPlay(String str) {
        h a2 = h.a();
        CBInPlay cBInPlay = null;
        if (a2 == null || !b.a()) {
            return null;
        }
        if (s.a().a(str)) {
            CBLogging.b("CBInPlay", "Inplay location cannot be empty");
            Handler handler = a2.p;
            c cVar = a2.e;
            cVar.getClass();
            handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
            return null;
        }
        com.chartboost.sdk.Model.e eVar = a2.m.get();
        CBError.CBImpressionError cBImpressionError = CBError.CBImpressionError.NO_AD_FOUND;
        if ((eVar.y && eVar.z) || (eVar.e && eVar.f)) {
            com.chartboost.sdk.Model.a a3 = a2.f3670d.a(str);
            if (a3 != null) {
                com.chartboost.sdk.Model.b bVar = a3.f3612c.get("lg");
                if (bVar != null) {
                    File a4 = bVar.a(a2.f3670d.f3817b.d().f3587a);
                    if (!a4.exists()) {
                        cBImpressionError = CBError.CBImpressionError.ASSET_MISSING;
                    } else {
                        cBInPlay = new CBInPlay(a2.f3670d, a2.h, a2.j, a2.o, a2.r, a3, bVar.f3616c, a4, str);
                    }
                }
                Executor executor = a2.f3667a;
                e eVar2 = a2.f3670d;
                eVar2.getClass();
                executor.execute(eVar2.new a(8, str, null, null));
            }
            if (cBInPlay == null) {
                Executor executor2 = a2.f3667a;
                e eVar3 = a2.f3670d;
                eVar3.getClass();
                executor2.execute(eVar3.new a(3, str, null, null));
            }
        }
        if (cBInPlay == null) {
            Handler handler2 = a2.p;
            c cVar2 = a2.e;
            cVar2.getClass();
            handler2.post(cVar2.new a(4, str, cBImpressionError));
        }
        return cBInPlay;
    }
}
