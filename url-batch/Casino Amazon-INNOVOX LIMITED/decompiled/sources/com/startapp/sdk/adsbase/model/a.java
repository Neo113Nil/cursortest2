package com.startapp.sdk.adsbase.model;

import android.content.Context;
import android.media.AudioManager;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.startio.Omid;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.advertisingid.b;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.be;
import com.startapp.sdk.internal.g;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.q;
import com.startapp.sdk.internal.r0;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.u1;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.yf;
import com.startapp.sdk.internal.zh;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class a extends u1 {
    public Integer A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public Set F0;
    public Set G0;
    public HashSet H0;
    public Set I0;
    public HashSet J0;
    public Pair K0;
    public boolean L0;
    public final long M0;
    public final int N0;
    public final String O0;
    public String P0;
    public String Q0;
    public boolean R0;
    public Boolean S0;
    public String T0;
    public Ad.AdType U0;
    public AdPreferences.Placement n0;
    public String o0;
    public boolean p0;
    public boolean q0;
    public SDKAdPreferences.Gender r0;
    public String s0;
    public int t0;
    public boolean u0;
    public Boolean v0;
    public boolean w0;
    public Double x0;
    public String y0;
    public String z0;

    public a() {
        super(4);
        this.t0 = 1;
        this.u0 = true;
        this.w0 = AdsCommonMetaData.k().J();
        this.C0 = true;
        this.E0 = 0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.L0 = true;
        this.U0 = null;
        this.M0 = System.currentTimeMillis() - vf.d.b;
        WeakHashMap weakHashMap = zh.f528a;
        this.N0 = t.d.f428a.size();
        this.O0 = MetaData.A().L();
    }

    public void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        Set a2;
        boolean contains;
        this.n0 = placement;
        this.o0 = adPreferences.getPlacementId();
        this.K0 = pair;
        this.S0 = adPreferences.getAi();
        this.r0 = adPreferences.getGender(context);
        this.s0 = adPreferences.getKeywords();
        this.p0 = adPreferences.isTestMode();
        this.F0 = adPreferences.getCategories();
        this.G0 = adPreferences.getCategoriesExclude();
        this.u0 = adPreferences.isHardwareAccelerated();
        this.A0 = adPreferences.getAutoLoadAmount();
        this.B0 = adPreferences.isPreCached();
        this.v0 = Boolean.valueOf(m0.c(context));
        this.x0 = adPreferences.getMinCpm();
        this.y0 = adPreferences.getAdTag();
        HashSet hashSet = MetaData.f;
        boolean z = true;
        this.C0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.U0 = adPreferences.type;
        this.b = adPreferences.getCustomProductId();
        VideoConfig F = AdsCommonMetaData.k().F();
        if ((F == null || F.o() == null) ? false : F.o().equals("muted")) {
            this.D0 = false;
        } else {
            try {
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    this.D0 = ((AudioManager) systemService).getStreamVolume(3) > 0;
                }
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        try {
            if (!pg.f382a.t) {
                q qVar = (q) com.startapp.sdk.components.a.a(context).O.a();
                AdDebuggerMetadata c = MetaData.A().c();
                if (c != null) {
                    AdDebuggerMetadata c2 = MetaData.A().c();
                    if (c2 != null && (a2 = c2.a()) != null) {
                        contains = a2.contains(((b) qVar.b.a()).a().f255a);
                        if (contains && c.c()) {
                        }
                    }
                    contains = false;
                    if (contains) {
                    }
                }
                z = false;
            }
            this.q0 = z;
        } catch (Throwable unused) {
        }
        this.I0 = adPreferences.packageInclude;
    }

    @Override // com.startapp.sdk.internal.u1
    public final boolean b() {
        return true;
    }

    public void g(Context context) {
        yf yfVar = (yf) com.startapp.sdk.components.a.a(context).k.a();
        AdPreferences.Placement placement = this.n0;
        this.z0 = placement == null ? null : (String) yfVar.f511a.get(new xf(placement));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.u1
    public void a(be beVar) {
        super.a(beVar);
        beVar.a("placement", this.n0.name(), true, true);
        beVar.a("placementId", this.o0, false, true);
        beVar.a("testMode", Boolean.toString(this.p0), false, true);
        beVar.a(HintConstants.AUTOFILL_HINT_GENDER, this.r0, false, true);
        beVar.a("keywords", this.s0, false, true);
        beVar.a("adsNumber", Integer.toString(this.t0), false, true);
        beVar.a("category", this.F0);
        beVar.a("categoryExclude", this.G0);
        beVar.a("packageExclude", this.H0);
        beVar.a("campaignExclude", this.J0);
        beVar.a(TypedValues.Cycle.S_WAVE_OFFSET, Integer.toString(this.E0), false, true);
        beVar.a("ai", this.S0, false, true);
        Double d = this.x0;
        WeakHashMap weakHashMap = zh.f528a;
        beVar.a("minCPM", d != null ? String.format(Locale.US, "%.2f", d) : null, false, true);
        beVar.a("previousAdId", this.z0, false, true);
        beVar.a("twoClicks", Boolean.valueOf(!this.w0), false, true);
        beVar.a("engInclude", Boolean.toString(this.L0), false, true);
        Object obj = this.U0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            beVar.a(WebViewManager.EVENT_TYPE_KEY, obj, false, true);
        }
        beVar.a("timeSinceSessionStart", Long.valueOf(this.M0), true, true);
        beVar.a("adsDisplayed", Integer.valueOf(this.N0), true, true);
        beVar.a("profileId", this.O0, false, true);
        beVar.a("hardwareAccelerated", Boolean.valueOf(this.u0), false, true);
        beVar.a("autoLoadAmount", this.A0, false, true);
        beVar.a("dts", this.v0, false, true);
        if (this.B0) {
            beVar.a("downloadingMode", "CACHE", false, true);
        }
        beVar.a("primaryImg", this.P0, false, true);
        beVar.a("moreImg", this.Q0, false, true);
        beVar.a("contentAd", Boolean.toString(this.R0), false, true);
        if (this.q0) {
            beVar.a("testAdsEnabled", Boolean.TRUE, false, true);
        } else {
            beVar.a("adTag", this.y0, false, true);
        }
        String a2 = g.a();
        beVar.a(g.b, a2, true, true);
        String str = g.d;
        StringBuilder append = new StringBuilder().append(this.b).append(this.n0.name());
        String str2 = this.Q;
        if (str2 == null) {
            str2 = "";
        }
        beVar.a(str, g.a(append.append(str2).append(this.c).append(a2).toString()), true, false);
        beVar.a("sound", Boolean.valueOf(this.D0), false, true);
        Set set = this.I0;
        if (set != null) {
            beVar.a("packageInclude", set);
        }
        beVar.a("defaultMetaData", Boolean.valueOf(this.C0), true, true);
        Pair pair = this.K0;
        beVar.a((String) pair.first, pair.second, false, true);
        Object obj2 = this.T0;
        if (obj2 != null) {
            beVar.a("trv", obj2, false, false);
        }
        r0 r0Var = this.g0;
        if (r0Var != null) {
            Integer num = (Integer) r0Var.c.get(this.n0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                beVar.a("adsDisplayed", Integer.valueOf(intValue), false, false);
            }
        }
        beVar.a("omsdkv", Omid.getVersion(), false, true);
    }
}
