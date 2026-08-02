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
import com.startapp.sdk.internal.AbstractC0366g;
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
    public Integer f6453A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f6454B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f6455C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f6456D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f6457E0;

    /* renamed from: F0, reason: collision with root package name */
    public Set f6458F0;

    /* renamed from: G0, reason: collision with root package name */
    public Set f6459G0;

    /* renamed from: H0, reason: collision with root package name */
    public HashSet f6460H0;

    /* renamed from: I0, reason: collision with root package name */
    public Set f6461I0;

    /* renamed from: J0, reason: collision with root package name */
    public HashSet f6462J0;

    /* renamed from: K0, reason: collision with root package name */
    public Pair f6463K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f6464L0;

    /* renamed from: M0, reason: collision with root package name */
    public final long f6465M0;

    /* renamed from: N0, reason: collision with root package name */
    public final int f6466N0;

    /* renamed from: O0, reason: collision with root package name */
    public final String f6467O0;

    /* renamed from: P0, reason: collision with root package name */
    public String f6468P0;

    /* renamed from: Q0, reason: collision with root package name */
    public String f6469Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f6470R0;

    /* renamed from: S0, reason: collision with root package name */
    public Boolean f6471S0;

    /* renamed from: T0, reason: collision with root package name */
    public String f6472T0;
    public Ad.AdType U0;

    /* renamed from: n0, reason: collision with root package name */
    public AdPreferences.Placement f6473n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f6474o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f6475p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f6476q0;

    /* renamed from: r0, reason: collision with root package name */
    public SDKAdPreferences.Gender f6477r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f6478s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f6479t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f6480u0;

    /* renamed from: v0, reason: collision with root package name */
    public Boolean f6481v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f6482w0;

    /* renamed from: x0, reason: collision with root package name */
    public Double f6483x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f6484y0;

    /* renamed from: z0, reason: collision with root package name */
    public String f6485z0;

    public a() {
        super(4);
        this.f6479t0 = 1;
        this.f6480u0 = true;
        this.f6482w0 = AdsCommonMetaData.k().J();
        this.f6455C0 = true;
        this.f6457E0 = 0;
        this.f6458F0 = null;
        this.f6459G0 = null;
        this.f6460H0 = null;
        this.f6461I0 = null;
        this.f6462J0 = null;
        this.f6464L0 = true;
        this.U0 = null;
        this.f6465M0 = System.currentTimeMillis() - mg.f7288d.f7290b;
        WeakHashMap weakHashMap = si.f7575a;
        this.f6466N0 = t.f7582d.f7583a.size();
        this.f6467O0 = MetaData.E().Q();
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
        this.f6473n0 = placement;
        this.f6474o0 = adPreferences.getPlacementId();
        this.f6463K0 = pair;
        this.f6471S0 = adPreferences.getAi();
        this.f6477r0 = adPreferences.getGender(context);
        this.f6478s0 = adPreferences.getKeywords();
        this.f6475p0 = adPreferences.isTestMode();
        this.f6458F0 = adPreferences.getCategories();
        this.f6459G0 = adPreferences.getCategoriesExclude();
        this.f6480u0 = adPreferences.isHardwareAccelerated();
        this.f6453A0 = adPreferences.getAutoLoadAmount();
        this.f6454B0 = adPreferences.isPreCached();
        this.f6481v0 = Boolean.valueOf(p0.c(context));
        this.f6483x0 = adPreferences.getMinCpm();
        this.f6484y0 = adPreferences.getAdTag();
        HashSet hashSet = MetaData.f6503f;
        boolean z4 = true;
        this.f6455C0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.U0 = adPreferences.type;
        this.f7913b = adPreferences.getCustomProductId();
        VideoConfig F4 = AdsCommonMetaData.k().F();
        if ((F4 == null || F4.m() == null) ? false : F4.m().equals("muted")) {
            this.f6456D0 = false;
        } else {
            try {
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    this.f6456D0 = ((AudioManager) systemService).getStreamVolume(3) > 0;
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        try {
            if (!fh.f6918a.f7017t) {
                q qVar = (q) com.startapp.sdk.components.a.a(context).f6555P.a();
                AdDebuggerMetadata d4 = MetaData.E().d();
                if (d4 != null) {
                    AdDebuggerMetadata d5 = MetaData.E().d();
                    if (d5 != null && (a3 = d5.a()) != null) {
                        contains = a3.contains(((b) qVar.f7465b.a()).a().f7169a);
                        if (contains && d4.c()) {
                            z = true;
                            if (!z) {
                                z4 = false;
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
            this.f6476q0 = z4;
        } catch (Throwable unused) {
        }
        this.f6461I0 = adPreferences.packageInclude;
    }

    @Override // com.startapp.sdk.internal.y1
    public final boolean b() {
        return true;
    }

    public void g(Context context) {
        pg pgVar = (pg) com.startapp.sdk.components.a.a(context).f6571l.a();
        AdPreferences.Placement placement = this.f6473n0;
        this.f6485z0 = placement == null ? null : (String) pgVar.f7459a.get(new og(placement));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public void a(se seVar) {
        super.a(seVar);
        seVar.a("placement", this.f6473n0.name(), true, true);
        seVar.a("placementId", this.f6474o0, false, true);
        seVar.a("testMode", Boolean.toString(this.f6475p0), false, true);
        seVar.a("gender", this.f6477r0, false, true);
        seVar.a("keywords", this.f6478s0, false, true);
        seVar.a("adsNumber", Integer.toString(this.f6479t0), false, true);
        seVar.a("category", this.f6458F0);
        seVar.a("categoryExclude", this.f6459G0);
        seVar.a("packageExclude", this.f6460H0);
        seVar.a("campaignExclude", this.f6462J0);
        seVar.a("offset", Integer.toString(this.f6457E0), false, true);
        seVar.a("ai", this.f6471S0, false, true);
        Double d4 = this.f6483x0;
        WeakHashMap weakHashMap = si.f7575a;
        seVar.a("minCPM", d4 != null ? String.format(Locale.US, "%.2f", d4) : null, false, true);
        seVar.a("previousAdId", this.f6485z0, false, true);
        seVar.a("twoClicks", Boolean.valueOf(!this.f6482w0), false, true);
        seVar.a("engInclude", Boolean.toString(this.f6464L0), false, true);
        Object obj = this.U0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            seVar.a("type", obj, false, true);
        }
        seVar.a("timeSinceSessionStart", Long.valueOf(this.f6465M0), true, true);
        seVar.a("adsDisplayed", Integer.valueOf(this.f6466N0), true, true);
        seVar.a("profileId", this.f6467O0, false, true);
        seVar.a("hardwareAccelerated", Boolean.valueOf(this.f6480u0), false, true);
        seVar.a("autoLoadAmount", this.f6453A0, false, true);
        seVar.a("dts", this.f6481v0, false, true);
        if (this.f6454B0) {
            seVar.a("downloadingMode", "CACHE", false, true);
        }
        seVar.a("primaryImg", this.f6468P0, false, true);
        seVar.a("moreImg", this.f6469Q0, false, true);
        seVar.a("contentAd", Boolean.toString(this.f6470R0), false, true);
        if (this.f6476q0) {
            seVar.a("testAdsEnabled", Boolean.TRUE, false, true);
        } else {
            seVar.a("adTag", this.f6484y0, false, true);
        }
        String a3 = AbstractC0366g.a();
        seVar.a(AbstractC0366g.f6958b, a3, true, true);
        String str = AbstractC0366g.f6960d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7913b);
        sb.append(this.f6473n0.name());
        String str2 = this.f7901Q;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(this.f7915c);
        sb.append(a3);
        seVar.a(str, AbstractC0366g.a(sb.toString()), true, false);
        seVar.a("sound", Boolean.valueOf(this.f6456D0), false, true);
        Set set = this.f6461I0;
        if (set != null) {
            seVar.a("packageInclude", set);
        }
        seVar.a("defaultMetaData", Boolean.valueOf(this.f6455C0), true, true);
        Pair pair = this.f6463K0;
        seVar.a((String) pair.first, pair.second, false, true);
        Object obj2 = this.f6472T0;
        if (obj2 != null) {
            seVar.a("trv", obj2, false, false);
        }
        u0 u0Var = this.f7924g0;
        if (u0Var != null) {
            Integer num = (Integer) u0Var.f7639c.get(this.f6473n0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                seVar.a("adsDisplayed", Integer.valueOf(intValue), false, false);
            }
        }
        seVar.a("omsdkv", "1.6.0-Startio", false, true);
    }
}
