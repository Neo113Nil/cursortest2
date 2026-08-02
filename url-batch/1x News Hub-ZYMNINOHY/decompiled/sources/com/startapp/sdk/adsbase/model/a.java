package com.startapp.sdk.adsbase.model;

import android.content.Context;
import android.media.AudioManager;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.advertisingid.b;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.AbstractC0288g;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.mg;
import com.startapp.sdk.internal.og;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.q;
import com.startapp.sdk.internal.se;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.u0;
import com.startapp.sdk.internal.y1;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a extends y1 {

    /* renamed from: A0, reason: collision with root package name */
    public Integer f3361A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f3362B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f3363C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f3364D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public Set f3365F0;

    /* renamed from: G0, reason: collision with root package name */
    public Set f3366G0;

    /* renamed from: H0, reason: collision with root package name */
    public HashSet f3367H0;
    public Set I0;

    /* renamed from: J0, reason: collision with root package name */
    public HashSet f3368J0;

    /* renamed from: K0, reason: collision with root package name */
    public Pair f3369K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f3370L0;

    /* renamed from: M0, reason: collision with root package name */
    public final long f3371M0;

    /* renamed from: N0, reason: collision with root package name */
    public final int f3372N0;

    /* renamed from: O0, reason: collision with root package name */
    public final String f3373O0;

    /* renamed from: P0, reason: collision with root package name */
    public String f3374P0;

    /* renamed from: Q0, reason: collision with root package name */
    public String f3375Q0;
    public boolean R0;

    /* renamed from: S0, reason: collision with root package name */
    public Boolean f3376S0;

    /* renamed from: T0, reason: collision with root package name */
    public String f3377T0;

    /* renamed from: U0, reason: collision with root package name */
    public Ad.AdType f3378U0;

    /* renamed from: n0, reason: collision with root package name */
    public AdPreferences.Placement f3379n0;
    public String o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f3380p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3381q0;

    /* renamed from: r0, reason: collision with root package name */
    public SDKAdPreferences.Gender f3382r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f3383s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3384t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f3385u0;

    /* renamed from: v0, reason: collision with root package name */
    public Boolean f3386v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f3387w0;

    /* renamed from: x0, reason: collision with root package name */
    public Double f3388x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f3389y0;
    public String z0;

    public a() {
        super(4);
        this.f3384t0 = 1;
        this.f3385u0 = true;
        this.f3387w0 = AdsCommonMetaData.k().J();
        this.f3363C0 = true;
        this.E0 = 0;
        this.f3365F0 = null;
        this.f3366G0 = null;
        this.f3367H0 = null;
        this.I0 = null;
        this.f3368J0 = null;
        this.f3370L0 = true;
        this.f3378U0 = null;
        this.f3371M0 = System.currentTimeMillis() - mg.f4159d.f4161b;
        WeakHashMap weakHashMap = si.f4438a;
        this.f3372N0 = t.f4445d.f4446a.size();
        this.f3373O0 = MetaData.E().Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        Set a3;
        boolean contains;
        boolean z;
        this.f3379n0 = placement;
        this.o0 = adPreferences.getPlacementId();
        this.f3369K0 = pair;
        this.f3376S0 = adPreferences.getAi();
        this.f3382r0 = adPreferences.getGender(context);
        this.f3383s0 = adPreferences.getKeywords();
        this.f3380p0 = adPreferences.isTestMode();
        this.f3365F0 = adPreferences.getCategories();
        this.f3366G0 = adPreferences.getCategoriesExclude();
        this.f3385u0 = adPreferences.isHardwareAccelerated();
        this.f3361A0 = adPreferences.getAutoLoadAmount();
        this.f3362B0 = adPreferences.isPreCached();
        this.f3386v0 = Boolean.valueOf(p0.c(context));
        this.f3388x0 = adPreferences.getMinCpm();
        this.f3389y0 = adPreferences.getAdTag();
        HashSet hashSet = MetaData.f;
        boolean z2 = true;
        this.f3363C0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.f3378U0 = adPreferences.type;
        this.f4767b = adPreferences.getCustomProductId();
        VideoConfig F3 = AdsCommonMetaData.k().F();
        if ((F3 == null || F3.m() == null) ? false : F3.m().equals("muted")) {
            this.f3364D0 = false;
        } else {
            try {
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    this.f3364D0 = ((AudioManager) systemService).getStreamVolume(3) > 0;
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        try {
            if (!fh.f3800a.f3895t) {
                q qVar = (q) com.startapp.sdk.components.a.a(context).f3457P.a();
                AdDebuggerMetadata d3 = MetaData.E().d();
                if (d3 != null) {
                    AdDebuggerMetadata d4 = MetaData.E().d();
                    if (d4 != null && (a3 = d4.a()) != null) {
                        contains = a3.contains(((b) qVar.f4329b.a()).a().f4041a);
                        if (contains && d3.c()) {
                            z = true;
                            if (!z) {
                                z2 = false;
                            }
                        }
                    }
                    contains = false;
                    if (contains) {
                        z = true;
                        if (!z) {
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
            this.f3381q0 = z2;
        } catch (Throwable unused) {
        }
        this.I0 = adPreferences.packageInclude;
    }

    @Override // com.startapp.sdk.internal.y1
    public final boolean b() {
        return true;
    }

    public void g(Context context) {
        pg pgVar = (pg) com.startapp.sdk.components.a.a(context).f3472l.a();
        AdPreferences.Placement placement = this.f3379n0;
        this.z0 = placement == null ? null : (String) pgVar.f4323a.get(new og(placement));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public void a(se seVar) {
        super.a(seVar);
        seVar.a("placement", this.f3379n0.name(), true, true);
        seVar.a("placementId", this.o0, false, true);
        seVar.a("testMode", Boolean.toString(this.f3380p0), false, true);
        seVar.a("gender", this.f3382r0, false, true);
        seVar.a("keywords", this.f3383s0, false, true);
        seVar.a("adsNumber", Integer.toString(this.f3384t0), false, true);
        seVar.a("category", this.f3365F0);
        seVar.a("categoryExclude", this.f3366G0);
        seVar.a("packageExclude", this.f3367H0);
        seVar.a("campaignExclude", this.f3368J0);
        seVar.a("offset", Integer.toString(this.E0), false, true);
        seVar.a("ai", this.f3376S0, false, true);
        Double d3 = this.f3388x0;
        WeakHashMap weakHashMap = si.f4438a;
        seVar.a("minCPM", d3 != null ? String.format(Locale.US, "%.2f", d3) : null, false, true);
        seVar.a("previousAdId", this.z0, false, true);
        seVar.a("twoClicks", Boolean.valueOf(!this.f3387w0), false, true);
        seVar.a("engInclude", Boolean.toString(this.f3370L0), false, true);
        Object obj = this.f3378U0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            seVar.a("type", obj, false, true);
        }
        seVar.a("timeSinceSessionStart", Long.valueOf(this.f3371M0), true, true);
        seVar.a("adsDisplayed", Integer.valueOf(this.f3372N0), true, true);
        seVar.a("profileId", this.f3373O0, false, true);
        seVar.a("hardwareAccelerated", Boolean.valueOf(this.f3385u0), false, true);
        seVar.a("autoLoadAmount", this.f3361A0, false, true);
        seVar.a("dts", this.f3386v0, false, true);
        if (this.f3362B0) {
            seVar.a("downloadingMode", "CACHE", false, true);
        }
        seVar.a("primaryImg", this.f3374P0, false, true);
        seVar.a("moreImg", this.f3375Q0, false, true);
        seVar.a("contentAd", Boolean.toString(this.R0), false, true);
        if (this.f3381q0) {
            seVar.a("testAdsEnabled", Boolean.TRUE, false, true);
        } else {
            seVar.a("adTag", this.f3389y0, false, true);
        }
        String a3 = AbstractC0288g.a();
        seVar.a(AbstractC0288g.f3840b, a3, true, true);
        String str = AbstractC0288g.f3842d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4767b);
        sb.append(this.f3379n0.name());
        String str2 = this.f4755Q;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(this.f4769c);
        sb.append(a3);
        seVar.a(str, AbstractC0288g.a(sb.toString()), true, false);
        seVar.a("sound", Boolean.valueOf(this.f3364D0), false, true);
        Set set = this.I0;
        if (set != null) {
            seVar.a("packageInclude", set);
        }
        seVar.a("defaultMetaData", Boolean.valueOf(this.f3363C0), true, true);
        Pair pair = this.f3369K0;
        seVar.a((String) pair.first, pair.second, false, true);
        Object obj2 = this.f3377T0;
        if (obj2 != null) {
            seVar.a("trv", obj2, false, false);
        }
        u0 u0Var = this.f4777g0;
        if (u0Var != null) {
            Integer num = (Integer) u0Var.f4500c.get(this.f3379n0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                seVar.a("adsDisplayed", Integer.valueOf(intValue), false, false);
            }
        }
        seVar.a("omsdkv", "1.6.0-Startio", false, true);
    }
}
