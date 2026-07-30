package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jm3 extends xg3 {
    public xk3 A;
    public final AtomicLong B;
    public long C;
    public final ti3 D;
    public boolean E;
    public hl3 F;
    public hm3 G;
    public hl3 H;
    public final ot2 I;
    public cg3 o;
    public al3 p;
    public final CopyOnWriteArraySet q;
    public boolean r;
    public final AtomicReference s;
    public final Object t;
    public boolean u;
    public int v;
    public hl3 w;
    public hl3 x;
    public PriorityQueue y;
    public boolean z;

    public jm3(pj3 pj3Var) {
        super(pj3Var);
        this.q = new CopyOnWriteArraySet();
        this.t = new Object();
        this.u = false;
        this.v = 1;
        this.E = true;
        this.I = new ot2(21, this);
        this.s = new AtomicReference();
        this.A = xk3.c;
        this.C = -1L;
        this.B = new AtomicLong(0L);
        this.D = new ti3(pj3Var, 3);
    }

    public final void A(xk3 xk3Var) {
        v();
        boolean z = (xk3Var.i(vk3.ANALYTICS_STORAGE) && xk3Var.i(vk3.AD_STORAGE)) || ((pj3) this.m).p().F();
        pj3 pj3Var = (pj3) this.m;
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.v();
        if (z != pj3Var.L) {
            lj3 lj3Var2 = pj3Var.s;
            pj3.m(lj3Var2);
            lj3Var2.v();
            pj3Var.L = z;
            qi3 qi3Var = ((pj3) this.m).q;
            pj3.k(qi3Var);
            qi3Var.v();
            Boolean valueOf = qi3Var.A().contains("measurement_enabled_from_api") ? Boolean.valueOf(qi3Var.A().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                N(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r3 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            boolean z3 = !z2 || this.p == null || zq3.V(str2);
            if (str == null) {
                str = "app";
            }
            String str3 = str;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            lj3 lj3Var = ((pj3) this.m).s;
            pj3.m(lj3Var);
            lj3Var.F(new sl3(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        dn3 dn3Var = ((pj3) this.m).x;
        pj3.l(dn3Var);
        synchronized (dn3Var.x) {
            try {
                if (!dn3Var.w) {
                    vh3 vh3Var = ((pj3) dn3Var.m).r;
                    pj3.m(vh3Var);
                    vh3Var.w.b("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((pj3) dn3Var.m).p.getClass();
                    }
                    vh3 vh3Var2 = ((pj3) dn3Var.m).r;
                    pj3.m(vh3Var2);
                    vh3Var2.w.c(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((pj3) dn3Var.m).p.getClass();
                    }
                    vh3 vh3Var3 = ((pj3) dn3Var.m).r;
                    pj3.m(vh3Var3);
                    vh3Var3.w.c(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    ze3 ze3Var = dn3Var.s;
                    string2 = ze3Var != null ? dn3Var.D(ze3Var.n) : "Activity";
                }
                String str5 = string2;
                tm3 tm3Var = dn3Var.o;
                if (dn3Var.t && tm3Var != null) {
                    dn3Var.t = false;
                    boolean equals = Objects.equals(tm3Var.b, str5);
                    boolean equals2 = Objects.equals(tm3Var.a, string);
                    if (equals && equals2) {
                        vh3 vh3Var4 = ((pj3) dn3Var.m).r;
                        pj3.m(vh3Var4);
                        vh3Var4.w.b("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                pj3 pj3Var = (pj3) dn3Var.m;
                vh3 vh3Var5 = pj3Var.r;
                pj3.m(vh3Var5);
                vh3Var5.z.d(string == null ? "null" : string, str5, "Logging screen view with name, class");
                tm3 tm3Var2 = dn3Var.o == null ? dn3Var.p : dn3Var.o;
                zq3 zq3Var = pj3Var.u;
                pj3.k(zq3Var);
                tm3 tm3Var3 = new tm3(string, str5, zq3Var.t0(), true, j);
                dn3Var.o = tm3Var3;
                dn3Var.p = tm3Var2;
                dn3Var.u = tm3Var3;
                pj3Var.w.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                lj3 lj3Var2 = pj3Var.s;
                pj3.m(lj3Var2);
                lj3Var2.F(new uj3(dn3Var, bundle2, tm3Var3, tm3Var2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C() {
        vh3 vh3Var;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        fp3 fp3Var;
        fp3 fp3Var2;
        jm3 jm3Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str2;
        yl3 yl3Var;
        n82 d;
        v();
        pj3 pj3Var = (pj3) this.m;
        vh3 vh3Var2 = pj3Var.r;
        qb2 qb2Var = pj3Var.w;
        pj3.m(vh3Var2);
        vh3Var2.y.b("Handle tcf update.");
        qi3 qi3Var = pj3Var.q;
        pj3.k(qi3Var);
        SharedPreferences B = qi3Var.B();
        HashMap hashMap = new HashMap();
        tg3 tg3Var = ug3.Z0;
        int i12 = 2;
        int i13 = 1;
        if (((Boolean) tg3Var.a(null)).booleanValue()) {
            i82 i82Var = hp3.a;
            xl3 xl3Var = xl3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            vh3Var = vh3Var2;
            gp3 gp3Var = gp3.m;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(xl3Var, gp3Var);
            xl3 xl3Var2 = xl3.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            gp3 gp3Var2 = gp3.n;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(xl3Var2, gp3Var2);
            xl3 xl3Var3 = xl3.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(xl3Var3, gp3Var);
            xl3 xl3Var4 = xl3.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(xl3Var4, gp3Var);
            xl3 xl3Var5 = xl3.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List asList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(xl3Var5, gp3Var2), new AbstractMap.SimpleImmutableEntry(xl3.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, gp3Var2), new AbstractMap.SimpleImmutableEntry(xl3.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, gp3Var2));
            yf yfVar = new yf(asList != null ? asList.size() : 4);
            yfVar.k(asList);
            n82 d2 = yfVar.d();
            int i14 = p11.o;
            nl2 nl2Var = new nl2("CH");
            char[] cArr = new char[5];
            boolean contains = B.contains("IABTCF_TCString");
            try {
                i5 = B.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i5 = -1;
            }
            try {
                i6 = B.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i6 = -1;
            }
            try {
                i7 = B.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i7 = -1;
            }
            int i15 = i6;
            try {
                i8 = B.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i8 = -1;
            }
            try {
                i9 = B.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i9 = -1;
            }
            String a = hp3.a(B, "IABTCF_PublisherCC");
            int i16 = i5;
            yf yfVar2 = new yf(4);
            l82 l82Var = d2.n;
            if (l82Var == null) {
                str2 = a;
                i10 = i8;
                i11 = i9;
                l82 l82Var2 = new l82(d2, new m82(d2.q, 0, d2.r));
                d2.n = l82Var2;
                l82Var = l82Var2;
            } else {
                i10 = i8;
                i11 = i9;
                str2 = a;
            }
            g23 it = l82Var.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                yl3Var = yl3.PURPOSE_RESTRICTION_UNDEFINED;
                if (!hasNext) {
                    break;
                }
                xl3 xl3Var6 = (xl3) it.next();
                int zza = xl3Var6.zza();
                g23 g23Var = it;
                n82 n82Var = d2;
                StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(zza);
                String a2 = hp3.a(B, sb.toString());
                if (!TextUtils.isEmpty(a2) && a2.length() >= 755) {
                    int digit = Character.digit(a2.charAt(754), 10);
                    yl3 yl3Var2 = yl3.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (digit < 0 || digit > yl3.values().length || digit == 0) {
                        yl3Var = yl3Var2;
                    } else if (digit == i13) {
                        yl3Var = yl3.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (digit == i12) {
                        yl3Var = yl3.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                yfVar2.j(xl3Var6, yl3Var);
                it = g23Var;
                d2 = n82Var;
                i12 = 2;
                i13 = 1;
            }
            n82 n82Var2 = d2;
            n82 d3 = yfVar2.d();
            String a3 = hp3.a(B, "IABTCF_PurposeConsents");
            String a4 = hp3.a(B, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(a4) && a4.length() >= 755 && a4.charAt(754) == '1';
            String a5 = hp3.a(B, "IABTCF_PurposeLegitimateInterests");
            String a6 = hp3.a(B, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(a6) && a6.length() >= 755 && a6.charAt(754) == '1';
            cArr[0] = '2';
            if (contains) {
                yl3 yl3Var3 = (yl3) d3.get(xl3Var);
                yl3 yl3Var4 = (yl3) d3.get(xl3Var3);
                yl3 yl3Var5 = (yl3) d3.get(xl3Var4);
                yl3 yl3Var6 = (yl3) d3.get(xl3Var5);
                yf yfVar3 = new yf(4);
                yfVar3.j("Version", "2");
                boolean z3 = z;
                yfVar3.j("VendorConsent", true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                boolean z4 = z2;
                yfVar3.j("VendorLegitimateInterest", true != z2 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                yfVar3.j("gdprApplies", i7 != 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                int i17 = i11;
                yfVar3.j("EnableAdvertiserConsentMode", i17 != 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                yfVar3.j("PolicyVersion", String.valueOf(i15));
                yfVar3.j("CmpSdkID", String.valueOf(i16));
                int i18 = i10;
                yfVar3.j("PurposeOneTreatment", i18 != 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                String str3 = str2;
                yfVar3.j("PublisherCC", str3);
                yfVar3.j("PublisherRestrictions1", String.valueOf(yl3Var3 != null ? yl3Var3.zza() : yl3Var.zza()));
                yfVar3.j("PublisherRestrictions3", String.valueOf(yl3Var4 != null ? yl3Var4.zza() : yl3Var.zza()));
                yfVar3.j("PublisherRestrictions4", String.valueOf(yl3Var5 != null ? yl3Var5.zza() : yl3Var.zza()));
                yfVar3.j("PublisherRestrictions7", String.valueOf(yl3Var6 != null ? yl3Var6.zza() : yl3Var.zza()));
                yfVar3.k(n82.b(4, new Object[]{"Purpose1", hp3.d(xl3Var, a3, a5), "Purpose3", hp3.d(xl3Var3, a3, a5), "Purpose4", hp3.d(xl3Var4, a3, a5), "Purpose7", hp3.d(xl3Var5, a3, a5)}, null).entrySet());
                int i19 = i7;
                yfVar3.k(n82.b(5, new Object[]{"AuthorizePurpose1", true != hp3.b(xl3Var, n82Var2, d3, nl2Var, cArr, i17, i19, i18, str3, a3, a5, z3, z4) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "AuthorizePurpose3", true != hp3.b(xl3Var3, n82Var2, d3, nl2Var, cArr, i17, i19, i18, str3, a3, a5, z3, z4) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "AuthorizePurpose4", true != hp3.b(xl3Var4, n82Var2, d3, nl2Var, cArr, i17, i19, i18, str3, a3, a5, z3, z4) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "AuthorizePurpose7", true != hp3.b(xl3Var5, n82Var2, d3, nl2Var, cArr, i17, i19, i18, str3, a3, a5, z3, z4) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                d = yfVar3.d();
            } else {
                d = n82.s;
            }
            fp3Var = new fp3(d);
            str = BuildConfig.FLAVOR;
        } else {
            vh3Var = vh3Var2;
            String a7 = hp3.a(B, "IABTCF_VendorConsents");
            str = BuildConfig.FLAVOR;
            if (!str.equals(a7) && a7.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a7.charAt(754)));
            }
            try {
                i = B.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                hashMap.put("gdprApplies", String.valueOf(i));
            }
            try {
                i2 = B.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i2 = -1;
            }
            if (i2 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(i2));
            }
            try {
                i3 = B.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i3 = -1;
            }
            if (i3 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(i3));
            }
            String a8 = hp3.a(B, "IABTCF_PurposeConsents");
            if (!str.equals(a8)) {
                hashMap.put("PurposeConsents", a8);
            }
            try {
                i4 = B.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i4 = -1;
            }
            if (i4 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(i4));
            }
            fp3Var = new fp3(hashMap);
        }
        pj3.m(vh3Var);
        vh3 vh3Var3 = vh3Var;
        g10 g10Var = vh3Var3.z;
        g10Var.c(fp3Var, "Tcf preferences read");
        if (!pj3Var.p.G(null, tg3Var)) {
            if (qi3Var.E(fp3Var)) {
                Bundle b = fp3Var.b();
                pj3.m(vh3Var3);
                g10Var.c(b, "Consent generated from Tcf");
                if (b != Bundle.EMPTY) {
                    qb2Var.getClass();
                    Q(b, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", fp3Var.c());
                D("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        qi3Var.v();
        String string = qi3Var.A().getString("stored_tcf_param", str);
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            fp3Var2 = new fp3(hashMap2);
        } else {
            for (String str4 : string.split(";")) {
                String[] split = str4.split("=");
                if (split.length >= 2 && hp3.a.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            fp3Var2 = new fp3(hashMap2);
        }
        if (qi3Var.E(fp3Var)) {
            Bundle b2 = fp3Var.b();
            pj3.m(vh3Var3);
            g10Var.c(b2, "Consent generated from Tcf");
            if (b2 != Bundle.EMPTY) {
                qb2Var.getClass();
                jm3Var = this;
                jm3Var.Q(b2, -30, System.currentTimeMillis());
            } else {
                jm3Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap hashMap3 = fp3Var2.a;
            String str5 = (hashMap3.isEmpty() || ((String) hashMap3.get("Version")) != null) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
            Bundle b3 = fp3Var.b();
            Bundle b4 = fp3Var2.b();
            bundle2.putString("_tcfm", str5.concat((b3.size() == b4.size() && Objects.equals(b3.getString("ad_storage"), b4.getString("ad_storage")) && Objects.equals(b3.getString("ad_personalization"), b4.getString("ad_personalization")) && Objects.equals(b3.getString("ad_user_data"), b4.getString("ad_user_data"))) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES));
            String str6 = (String) fp3Var.a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", fp3Var.c());
            jm3Var.D("auto", "_tcf", bundle2);
        }
    }

    public final void D(String str, String str2, Bundle bundle) {
        v();
        ((pj3) this.m).w.getClass();
        E(str, str2, bundle, System.currentTimeMillis());
    }

    public final void E(String str, String str2, Bundle bundle, long j) {
        v();
        boolean z = true;
        if (this.p != null && !zq3.V(str2)) {
            z = false;
        }
        F(str, str2, j, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        qi3 qi3Var;
        qb2 qb2Var;
        ec3 ec3Var;
        qi3 qi3Var2;
        ot2 ot2Var;
        long j2;
        boolean z4;
        String str3;
        long j3;
        boolean a;
        jm3 jm3Var;
        String str4;
        long j4;
        int i;
        long j5;
        boolean D;
        Bundle[] bundleArr;
        pj3 pj3Var;
        String str5 = str;
        ll3.s(str5);
        ll3.v(bundle);
        v();
        x();
        pj3 pj3Var2 = (pj3) this.m;
        boolean b = pj3Var2.b();
        ep3 ep3Var = pj3Var2.t;
        ec3 ec3Var2 = pj3Var2.p;
        Context context = pj3Var2.m;
        zq3 zq3Var = pj3Var2.u;
        vh3 vh3Var = pj3Var2.r;
        if (!b) {
            pj3.m(vh3Var);
            vh3Var.y.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = pj3Var2.r().w;
        if (list != null && !list.contains(str2)) {
            pj3.m(vh3Var);
            vh3Var.y.d(str2, str5, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.r) {
            this.r = true;
            try {
                try {
                    (!pj3Var2.n ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    pj3.m(vh3Var);
                    vh3Var.u.c(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                pj3.m(vh3Var);
                vh3Var.x.b("Tag Manager is not found and thus will not be used");
            }
        }
        nh3 nh3Var = pj3Var2.v;
        qi3 qi3Var3 = pj3Var2.q;
        qb2 qb2Var2 = pj3Var2.w;
        if (!ec3Var2.G(null, ug3.f1) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            qb2Var2.getClass();
            qb2Var = qb2Var2;
            qi3Var = qi3Var3;
            ec3Var = ec3Var2;
            H(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            qi3Var = qi3Var3;
            qb2Var = qb2Var2;
            ec3Var = ec3Var2;
        }
        if (!z || zq3.v[0].equals(str2)) {
            qi3Var2 = qi3Var;
        } else {
            pj3.k(zq3Var);
            pj3.k(qi3Var);
            qi3Var2 = qi3Var;
            zq3Var.H(bundle, qi3Var2.K.G());
        }
        ot2 ot2Var2 = this.I;
        if (!z3 && !"_iap".equals(str2)) {
            pj3.k(zq3Var);
            int i2 = 2;
            if (zq3Var.x0("event", str2)) {
                if (zq3Var.z0("event", s93.n, s93.o, str2)) {
                    ((pj3) zq3Var.m).getClass();
                    if (zq3Var.A0(40, "event", str2)) {
                        i2 = 0;
                    }
                } else {
                    i2 = 13;
                }
            }
            if (i2 != 0) {
                pj3.m(vh3Var);
                vh3Var.t.c(nh3Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                pj3.k(zq3Var);
                zq3.M(ot2Var2, null, i2, "_ev", zq3.B(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        dn3 dn3Var = pj3Var2.x;
        pj3.l(dn3Var);
        tm3 C = dn3Var.C(false);
        if (C != null && !bundle.containsKey("_sc")) {
            C.d = true;
        }
        zq3.o0(C, bundle, z && !z3);
        boolean equals = "am".equals(str5);
        boolean V = zq3.V(str2);
        if (z) {
            ot2Var = ot2Var2;
            if (this.p != null && !V) {
                if (!equals) {
                    pj3.m(vh3Var);
                    vh3Var.y.d(nh3Var.a(str2), nh3Var.e(bundle), "Passing event to registered event handler (FE)");
                    ll3.v(this.p);
                    ((tt1) this.p).p(str5, str2, bundle, j);
                    return;
                }
                j2 = j;
                z4 = true;
                if (pj3Var2.h()) {
                    return;
                }
                pj3.k(zq3Var);
                pj3 pj3Var3 = (pj3) zq3Var.m;
                int B0 = zq3Var.B0(str2);
                if (B0 != 0) {
                    pj3.m(vh3Var);
                    vh3Var.t.c(nh3Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String B = zq3.B(str2, 40, true);
                    int length = str2 != null ? str2.length() : 0;
                    pj3.k(zq3Var);
                    zq3.M(ot2Var, null, B0, "_ev", B, length);
                    return;
                }
                Bundle E = zq3Var.E(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
                ll3.v(E);
                pj3.l(dn3Var);
                if (dn3Var.C(false) == null || !"_ae".equals(str2)) {
                    str3 = "_o";
                    j3 = 0;
                } else {
                    pj3.l(ep3Var);
                    o42 o42Var = ep3Var.r;
                    ((pj3) ((ep3) o42Var.d).m).w.getClass();
                    j3 = 0;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    str3 = "_o";
                    long j6 = elapsedRealtime - o42Var.b;
                    o42Var.b = elapsedRealtime;
                    if (j6 > 0) {
                        zq3Var.e0(E, j6);
                    }
                }
                if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                    String string2 = E.getString("_ffr");
                    int i3 = lp2.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        pj3Var = pj3Var3;
                        string2 = null;
                    } else {
                        if (string2 != null) {
                            string2 = string2.trim();
                        }
                        pj3Var = pj3Var3;
                    }
                    qi3 qi3Var4 = pj3Var.q;
                    pj3.k(qi3Var4);
                    if (Objects.equals(string2, qi3Var4.H.d())) {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.y.b("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        qi3 qi3Var5 = pj3Var.q;
                        pj3.k(qi3Var5);
                        qi3Var5.H.e(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    qi3 qi3Var6 = pj3Var3.q;
                    pj3.k(qi3Var6);
                    String d = qi3Var6.H.d();
                    if (!TextUtils.isEmpty(d)) {
                        E.putString("_ffr", d);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(E);
                if (ec3Var.G(null, ug3.U0)) {
                    pj3.l(ep3Var);
                    ep3Var.v();
                    a = ep3Var.p;
                } else {
                    pj3.k(qi3Var2);
                    a = qi3Var2.E.a();
                }
                pj3.k(qi3Var2);
                if (qi3Var2.B.a() > j3 && qi3Var2.G(j2) && a) {
                    pj3.m(vh3Var);
                    vh3Var.z.b("Current session is expired, remove the session number, ID, and engagement time");
                    qb2Var.getClass();
                    i = 0;
                    str4 = "_ae";
                    j4 = j3;
                    H(System.currentTimeMillis(), null, "auto", "_sid");
                    H(System.currentTimeMillis(), null, "auto", "_sno");
                    H(System.currentTimeMillis(), null, "auto", "_se");
                    jm3Var = this;
                    qi3Var2.C.b(j4);
                } else {
                    jm3Var = this;
                    str4 = "_ae";
                    j4 = j3;
                    i = 0;
                }
                if (E.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j4) == 1) {
                    pj3.m(vh3Var);
                    vh3Var.z.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    pj3.l(ep3Var);
                    j5 = j;
                    ep3Var.q.s(j5);
                } else {
                    j5 = j;
                }
                ArrayList arrayList2 = new ArrayList(E.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i4 = i; i4 < size; i4++) {
                    String str6 = (String) arrayList2.get(i4);
                    if (str6 != null) {
                        pj3.k(zq3Var);
                        Object obj = E.get(str6);
                        if (obj instanceof Bundle) {
                            Bundle[] bundleArr2 = new Bundle[1];
                            bundleArr2[i] = (Bundle) obj;
                            bundleArr = bundleArr2;
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            E.putParcelableArray(str6, bundleArr);
                        }
                    }
                }
                int i5 = i;
                while (i5 < arrayList.size()) {
                    Bundle bundle2 = (Bundle) arrayList.get(i5);
                    String str7 = i5 != 0 ? "_ep" : str2;
                    String str8 = str3;
                    bundle2.putString(str8, str5);
                    if (z2) {
                        bundle2 = zq3Var.Y(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    kd3 kd3Var = new kd3(str7, new jd3(bundle3), str5, j5);
                    jo3 p = pj3Var2.p();
                    p.getClass();
                    p.v();
                    p.x();
                    p.I();
                    lh3 o = ((pj3) p.m).o();
                    o.getClass();
                    Parcel obtain = Parcel.obtain();
                    va3.b(kd3Var, obtain, i);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        vh3 vh3Var3 = ((pj3) o.m).r;
                        pj3.m(vh3Var3);
                        vh3Var3.s.b("Event is too long for local database. Sending event directly to service");
                        D = false;
                    } else {
                        D = o.D(0, marshall);
                    }
                    p.K(new jn3(p, p.M(true), D, kd3Var, 1));
                    if (!z4) {
                        Iterator it = jm3Var.q.iterator();
                        while (it.hasNext()) {
                            ((bl3) it.next()).onEvent(str, str2, new Bundle(bundle3), j);
                        }
                    }
                    i5++;
                    str5 = str;
                    j5 = j;
                    str3 = str8;
                    i = 0;
                }
                pj3.l(dn3Var);
                if (dn3Var.C(false) == null || !str4.equals(str2)) {
                    return;
                }
                pj3.l(ep3Var);
                qb2Var.getClass();
                ep3Var.r.b(true, true, SystemClock.elapsedRealtime());
                return;
            }
        } else {
            ot2Var = ot2Var2;
        }
        j2 = j;
        z4 = equals;
        if (pj3Var2.h()) {
        }
    }

    public final void G(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        pj3 pj3Var = (pj3) this.m;
        if (z) {
            zq3 zq3Var = pj3Var.u;
            pj3.k(zq3Var);
            i = zq3Var.C0(str2);
        } else {
            zq3 zq3Var2 = pj3Var.u;
            pj3.k(zq3Var2);
            if (zq3Var2.x0("user property", str2)) {
                if (zq3Var2.z0("user property", tk3.k, null, str2)) {
                    ((pj3) zq3Var2.m).getClass();
                    if (zq3Var2.A0(24, "user property", str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        ot2 ot2Var = this.I;
        if (i != 0) {
            pj3.k(pj3Var.u);
            String B = zq3.B(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            pj3.k(pj3Var.u);
            zq3.M(ot2Var, null, i, "_ev", B, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.F(new uj3(this, str3, str2, null, j, 1));
            return;
        }
        zq3 zq3Var3 = pj3Var.u;
        zq3 zq3Var4 = pj3Var.u;
        pj3.k(zq3Var3);
        int J = zq3Var3.J(obj, str2);
        if (J != 0) {
            pj3.k(zq3Var4);
            String B2 = zq3.B(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            pj3.k(zq3Var4);
            zq3.M(ot2Var, null, J, "_ev", B2, length);
            return;
        }
        pj3.k(zq3Var4);
        Object K = zq3Var4.K(obj, str2);
        if (K != null) {
            lj3 lj3Var2 = pj3Var.s;
            pj3.m(lj3Var2);
            lj3Var2.F(new uj3(this, str3, str2, K, j, 1));
        }
    }

    public final void H(long j, Object obj, String str, String str2) {
        String str3;
        boolean D;
        Object obj2 = obj;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        ll3.s(str2);
        v();
        x();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j2);
                    qi3 qi3Var = pj3Var.q;
                    pj3.k(qi3Var);
                    qi3Var.y.e(j2 == 1 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.z.d("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                qi3 qi3Var2 = pj3Var.q;
                pj3.k(qi3Var2);
                qi3Var2.y.e("unset");
            } else {
                str4 = str2;
            }
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.z.d("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!pj3Var.b()) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.z.b("User property not set since app measurement is disabled");
            return;
        }
        if (pj3Var.h()) {
            tq3 tq3Var = new tq3(j, obj3, str3, str);
            jo3 p = pj3Var.p();
            p.v();
            p.x();
            p.I();
            lh3 o = ((pj3) p.m).o();
            o.getClass();
            Parcel obtain = Parcel.obtain();
            va3.c(tq3Var, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                vh3 vh3Var4 = ((pj3) o.m).r;
                pj3.m(vh3Var4);
                vh3Var4.s.b("User property too long for local database. Sending directly to service");
                D = false;
            } else {
                D = o.D(1, marshall);
            }
            p.K(new jn3(p, p.M(true), D, tq3Var, 0));
        }
    }

    public final void I() {
        v();
        x();
        pj3 pj3Var = (pj3) this.m;
        if (pj3Var.h()) {
            ec3 ec3Var = pj3Var.p;
            ((pj3) ec3Var.m).getClass();
            Boolean I = ec3Var.I("google_analytics_deferred_deep_link_enabled");
            if (I != null && I.booleanValue()) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.y.b("Deferred Deep Link feature enabled.");
                lj3 lj3Var = pj3Var.s;
                pj3.m(lj3Var);
                lj3Var.F(new fl3(this, 2));
            }
            jo3 p = pj3Var.p();
            p.v();
            p.x();
            cs3 M = p.M(true);
            p.I();
            pj3 pj3Var2 = (pj3) p.m;
            pj3Var2.p.G(null, ug3.b1);
            pj3Var2.o().D(3, new byte[0]);
            p.K(new ln3(p, M, 1));
            this.E = false;
            qi3 qi3Var = pj3Var.q;
            pj3.k(qi3Var);
            qi3Var.v();
            String string = qi3Var.A().getString("previous_os_version", null);
            ((pj3) qi3Var.m).q().y();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = qi3Var.A().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            pj3Var.q().y();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            D("auto", "_ou", bundle);
        }
    }

    public final void J(Bundle bundle, long j) {
        pj3 pj3Var = (pj3) this.m;
        ll3.v(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.u.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        hl2.r(bundle2, "app_id", String.class, null);
        hl2.r(bundle2, FirebaseAnalytics.Param.ORIGIN, String.class, null);
        hl2.r(bundle2, "name", String.class, null);
        hl2.r(bundle2, "value", Object.class, null);
        hl2.r(bundle2, "trigger_event_name", String.class, null);
        hl2.r(bundle2, "trigger_timeout", Long.class, 0L);
        hl2.r(bundle2, "timed_out_event_name", String.class, null);
        hl2.r(bundle2, "timed_out_event_params", Bundle.class, null);
        hl2.r(bundle2, "triggered_event_name", String.class, null);
        hl2.r(bundle2, "triggered_event_params", Bundle.class, null);
        hl2.r(bundle2, "time_to_live", Long.class, 0L);
        hl2.r(bundle2, "expired_event_name", String.class, null);
        hl2.r(bundle2, "expired_event_params", Bundle.class, null);
        ll3.s(bundle2.getString("name"));
        ll3.s(bundle2.getString(FirebaseAnalytics.Param.ORIGIN));
        ll3.v(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zq3 zq3Var = pj3Var.u;
        nh3 nh3Var = pj3Var.v;
        vh3 vh3Var2 = pj3Var.r;
        pj3.k(zq3Var);
        if (zq3Var.C0(string) != 0) {
            pj3.m(vh3Var2);
            vh3Var2.r.c(nh3Var.c(string), "Invalid conditional user property name");
            return;
        }
        pj3.k(zq3Var);
        if (zq3Var.J(obj, string) != 0) {
            pj3.m(vh3Var2);
            vh3Var2.r.d(nh3Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object K = zq3Var.K(obj, string);
        if (K == null) {
            pj3.m(vh3Var2);
            vh3Var2.r.d(nh3Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        hl2.q(bundle2, K);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            pj3.m(vh3Var2);
            vh3Var2.r.d(nh3Var.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            pj3.m(vh3Var2);
            vh3Var2.r.d(nh3Var.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.F(new vl3(this, bundle2, 0));
        }
    }

    public final void K(String str, String str2, Bundle bundle) {
        pj3 pj3Var = (pj3) this.m;
        pj3Var.w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ll3.s(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.F(new vl3(this, bundle2, 1));
    }

    public final String L() {
        pj3 pj3Var = (pj3) this.m;
        try {
            return th2.o(pj3Var.m, pj3Var.B);
        } catch (IllegalStateException e) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.c(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void M(xk3 xk3Var, long j, boolean z) {
        int i = xk3Var.b;
        v();
        x();
        pj3 pj3Var = (pj3) this.m;
        qi3 qi3Var = pj3Var.q;
        vh3 vh3Var = pj3Var.r;
        pj3.k(qi3Var);
        xk3 D = qi3Var.D();
        if (j <= this.C && xk3.l(D.b, i)) {
            pj3.m(vh3Var);
            vh3Var.x.c(xk3Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        qi3 qi3Var2 = pj3Var.q;
        pj3.k(qi3Var2);
        qi3Var2.v();
        if (!xk3.l(i, qi3Var2.A().getInt("consent_source", 100))) {
            pj3.m(vh3Var);
            vh3Var.x.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = qi3Var2.A().edit();
        edit.putString("consent_settings", xk3Var.g());
        edit.putInt("consent_source", i);
        edit.apply();
        pj3.m(vh3Var);
        vh3Var.z.c(xk3Var, "Setting storage consent(FE)");
        this.C = j;
        if (pj3Var.p().G()) {
            jo3 p = pj3Var.p();
            p.v();
            p.x();
            p.K(new do3(p, 2));
        } else {
            jo3 p2 = pj3Var.p();
            p2.v();
            p2.x();
            if (p2.F()) {
                p2.K(new ln3(p2, p2.M(false)));
            }
        }
        if (z) {
            pj3Var.p().A(new AtomicReference());
        }
    }

    public final void N(Boolean bool, boolean z) {
        v();
        x();
        pj3 pj3Var = (pj3) this.m;
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.y.c(bool, "Setting app measurement enabled (FE)");
        qi3 qi3Var = pj3Var.q;
        pj3.k(qi3Var);
        qi3Var.v();
        SharedPreferences.Editor edit = qi3Var.A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            qi3Var.v();
            SharedPreferences.Editor edit2 = qi3Var.A().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.v();
        if (pj3Var.L || !(bool == null || bool.booleanValue())) {
            O();
        }
    }

    public final void O() {
        v();
        pj3 pj3Var = (pj3) this.m;
        qi3 qi3Var = pj3Var.q;
        vh3 vh3Var = pj3Var.r;
        qb2 qb2Var = pj3Var.w;
        pj3.k(qi3Var);
        String d = qi3Var.y.d();
        int i = 1;
        if (d != null) {
            if ("unset".equals(d)) {
                qb2Var.getClass();
                H(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(d) ? 0L : 1L);
                qb2Var.getClass();
                H(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!pj3Var.b() || !this.E) {
            pj3.m(vh3Var);
            vh3Var.y.b("Updating Scion state (FE)");
            jo3 p = pj3Var.p();
            p.v();
            p.x();
            p.K(new ln3(p, p.M(true), 3));
            return;
        }
        pj3.m(vh3Var);
        vh3Var.y.b("Recording app launch after enabling measurement for the first time (FE)");
        I();
        ep3 ep3Var = pj3Var.t;
        pj3.l(ep3Var);
        ep3Var.q.q();
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.F(new fl3(this, i));
    }

    public final void P() {
        pj3 pj3Var = (pj3) this.m;
        if (!(pj3Var.m.getApplicationContext() instanceof Application) || this.o == null) {
            return;
        }
        ((Application) pj3Var.m.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.o);
    }

    public final void Q(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        sk3 sk3Var;
        pj3 pj3Var = (pj3) this.m;
        x();
        xk3 xk3Var = xk3.c;
        vk3[] vk3VarArr = uk3.STORAGE.m;
        int length = vk3VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                str = null;
                break;
            }
            String str2 = vk3VarArr[i2].m;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i2++;
        }
        if (str != null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.w.c(str, "Ignoring invalid consent setting");
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.w.b("Valid consent values are 'granted', 'denied'");
        }
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        boolean C = lj3Var.C();
        xk3 b = xk3.b(i, bundle);
        Iterator it = b.a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sk3Var = sk3.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((sk3) it.next()) != sk3Var) {
                S(b, C);
                break;
            }
        }
        vc3 c = vc3.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((sk3) it2.next()) != sk3Var) {
                R(c, C);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = xk3.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i == -30 ? "tcf" : "app";
            if (C) {
                H(j, bool.toString(), str3, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS);
            } else {
                G(str3, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, bool.toString(), false, j);
            }
        }
    }

    public final void R(vc3 vc3Var, boolean z) {
        iu0 iu0Var = new iu0(26, (Object) this, (Object) vc3Var, false);
        if (z) {
            v();
            iu0Var.run();
        } else {
            lj3 lj3Var = ((pj3) this.m).s;
            pj3.m(lj3Var);
            lj3Var.F(iu0Var);
        }
    }

    public final void S(xk3 xk3Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        xk3 xk3Var2;
        x();
        int i = xk3Var.b;
        if (i != -10) {
            sk3 sk3Var = (sk3) xk3Var.a.get(vk3.AD_STORAGE);
            if (sk3Var == null) {
                sk3Var = sk3.UNINITIALIZED;
            }
            sk3 sk3Var2 = sk3.UNINITIALIZED;
            if (sk3Var == sk3Var2) {
                sk3 sk3Var3 = (sk3) xk3Var.a.get(vk3.ANALYTICS_STORAGE);
                if (sk3Var3 == null) {
                    sk3Var3 = sk3Var2;
                }
                if (sk3Var3 == sk3Var2) {
                    vh3 vh3Var = ((pj3) this.m).r;
                    pj3.m(vh3Var);
                    vh3Var.w.b("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.t) {
            try {
                z2 = false;
                if (xk3.l(i, this.A.b)) {
                    xk3 xk3Var3 = this.A;
                    EnumMap enumMap = xk3Var.a;
                    vk3[] vk3VarArr = (vk3[]) enumMap.keySet().toArray(new vk3[0]);
                    int length = vk3VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        vk3 vk3Var = vk3VarArr[i2];
                        sk3 sk3Var4 = (sk3) enumMap.get(vk3Var);
                        sk3 sk3Var5 = (sk3) xk3Var3.a.get(vk3Var);
                        sk3 sk3Var6 = sk3.DENIED;
                        if (sk3Var4 == sk3Var6 && sk3Var5 != sk3Var6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    vk3 vk3Var2 = vk3.ANALYTICS_STORAGE;
                    if (xk3Var.i(vk3Var2) && !this.A.i(vk3Var2)) {
                        z2 = true;
                    }
                    xk3Var = xk3Var.k(this.A);
                    this.A = xk3Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                xk3Var2 = xk3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            vh3 vh3Var2 = ((pj3) this.m).r;
            pj3.m(vh3Var2);
            vh3Var2.x.c(xk3Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.B.getAndIncrement();
        if (z3) {
            this.s.set(null);
            am3 am3Var = new am3(this, xk3Var2, andIncrement, z4, 0);
            if (z) {
                v();
                am3Var.run();
                return;
            } else {
                lj3 lj3Var = ((pj3) this.m).s;
                pj3.m(lj3Var);
                lj3Var.H(am3Var);
                return;
            }
        }
        am3 am3Var2 = new am3(this, xk3Var2, andIncrement, z4, 1);
        if (z) {
            v();
            am3Var2.run();
        } else if (i == 30 || i == -10) {
            lj3 lj3Var2 = ((pj3) this.m).s;
            pj3.m(lj3Var2);
            lj3Var2.H(am3Var2);
        } else {
            lj3 lj3Var3 = ((pj3) this.m).s;
            pj3.m(lj3Var3);
            lj3Var3.F(am3Var2);
        }
    }

    public final void T() {
        vr3.a();
        pj3 pj3Var = (pj3) this.m;
        ec3 ec3Var = pj3Var.p;
        lj3 lj3Var = pj3Var.s;
        vh3 vh3Var = pj3Var.r;
        if (ec3Var.G(null, ug3.Q0)) {
            pj3.m(lj3Var);
            if (lj3Var.C()) {
                pj3.m(vh3Var);
                vh3Var.r.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (dq2.j()) {
                pj3.m(vh3Var);
                vh3Var.r.b("Cannot get trigger URIs from main thread");
                return;
            }
            x();
            pj3.m(vh3Var);
            vh3Var.z.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            pj3.m(lj3Var);
            lj3Var.G(atomicReference, 10000L, "get trigger URIs", new ul3(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                pj3.m(vh3Var);
                vh3Var.t.b("Timed out waiting for get trigger URIs");
            } else {
                pj3.m(lj3Var);
                lj3Var.F(new Runnable() { // from class: em3
                    @Override // java.lang.Runnable
                    public final void run() {
                        jm3 jm3Var = jm3.this;
                        jm3Var.v();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        qi3 qi3Var = ((pj3) jm3Var.m).q;
                        pj3.k(qi3Var);
                        SparseArray C = qi3Var.C();
                        for (ip3 ip3Var : list) {
                            int i = ip3Var.o;
                            if (!C.contains(i) || ((Long) C.get(i)).longValue() < ip3Var.n) {
                                jm3Var.U().add(ip3Var);
                            }
                        }
                        jm3Var.V();
                    }
                });
            }
        }
    }

    public final PriorityQueue U() {
        if (this.y == null) {
            this.y = new PriorityQueue(Comparator.comparing(fm3.a, zo0.g));
        }
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V() {
        ip3 ip3Var;
        v();
        boolean z = false;
        Object[] objArr = 0;
        this.z = false;
        if (U().isEmpty() || this.u || (ip3Var = (ip3) U().poll()) == null) {
            return;
        }
        pj3 pj3Var = (pj3) this.m;
        zq3 zq3Var = pj3Var.u;
        pj3.k(zq3Var);
        uj1 Q = zq3Var.Q();
        if (Q != null) {
            this.u = true;
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            g10 g10Var = vh3Var.z;
            String str = ip3Var.m;
            g10Var.c(str, "Registering trigger URI");
            bf1 e = Q.e(Uri.parse(str));
            if (e != null) {
                e.addListener(new iu0((int) (objArr == true ? 1 : 0), (Object) e, (Object) new tt1(24, this, ip3Var, z)), new e92(2, this));
            } else {
                this.u = false;
                U().add(ip3Var);
            }
        }
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return false;
    }
}
