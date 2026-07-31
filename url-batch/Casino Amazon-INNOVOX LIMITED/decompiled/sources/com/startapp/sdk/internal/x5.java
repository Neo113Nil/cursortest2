package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class x5 implements qb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f490a;
    public final pa b;
    public final pa c;
    public Intent d;
    public boolean e = false;
    public boolean f = true;

    public x5(Context context, pa paVar, pa paVar2) {
        this.f490a = context;
        this.b = paVar;
        this.c = paVar2;
    }

    public static boolean a(int i) {
        ConsentConfig q = MetaData.A().q();
        ComponentInfoEventConfig f = q != null ? q.f() : null;
        return f != null && f.a((long) i);
    }

    public final boolean b() {
        Boolean valueOf = (c() && ((af) this.b.a()).contains("consentApc")) ? Boolean.valueOf(((af) this.b.a()).getBoolean("consentApc", false)) : null;
        return valueOf != null && valueOf.booleanValue();
    }

    public final boolean c() {
        ConsentConfig q = MetaData.A().q();
        return this.f && q != null && q.l();
    }

    public final void a(Integer num, Long l, Boolean bool, boolean z, boolean z2) {
        if (c()) {
            long j = ((af) this.b.a()).getLong("consentTimestamp", 0L);
            int i = ((af) this.b.a()).getInt("consentType", -1);
            boolean contains = ((af) this.b.a()).contains("consentApc");
            boolean z3 = (num == null || i == num.intValue()) ? false : true;
            boolean z4 = (bool == null || (contains && ((af) this.b.a()).getBoolean("consentApc", false) == bool.booleanValue())) ? false : true;
            boolean z5 = l != null && l.longValue() > j;
            if (z || z5) {
                if (z3 || z4) {
                    ze edit = ((af) this.b.a()).edit();
                    if (z3) {
                        int intValue = num.intValue();
                        edit.a("consentType", num);
                        edit.f526a.putInt("consentType", intValue);
                    }
                    if (z4) {
                        boolean booleanValue = bool.booleanValue();
                        edit.a("consentApc", bool);
                        edit.f526a.putBoolean("consentApc", booleanValue);
                    }
                    if (z5) {
                        long longValue = l.longValue();
                        edit.a("consentTimestamp", l);
                        edit.f526a.putLong("consentTimestamp", longValue);
                    }
                    edit.apply();
                    if (z2) {
                        MetaData.A().a(this.f490a, new AdPreferences(), MetaDataRequest$RequestReason.CONSENT, false, null, true);
                    }
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        MetaData.A().a(this);
        ConsentConfig q = MetaData.A().q();
        if (q == null || !c()) {
            return;
        }
        Integer b = q.b();
        if (b != null) {
            a(b, Long.valueOf(q.j()), null, false, false);
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.CONSENT) {
            ((af) this.b.a()).edit().putLong("consentTimestamp", q.j()).apply();
        } else if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.LAUNCH) {
            a(false, null, null, null, null, null);
        }
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a() {
        MetaData.A().a(this);
    }

    public final boolean a(boolean z, String str, String str2, String str3, String str4, String str5) {
        ConsentConfig q;
        String g;
        Integer consentTypeInfo;
        if ((z || qg.u == 2) && (q = MetaData.A().q()) != null && ((c() || z) && !this.e)) {
            Context context = this.f490a;
            WeakHashMap weakHashMap = zh.f528a;
            if (((w5) com.startapp.sdk.components.a.a(context).t.a()).b() && zh.c(this.f490a)) {
                if (!z && (q.i() == null || q.h() == null || ((af) this.b.a()).contains("consentApc"))) {
                    return false;
                }
                if (z) {
                    g = AdInformationMetaData.c().a().getDialogUrl();
                } else {
                    g = q.g();
                }
                if (g == null) {
                    return false;
                }
                Intent intent = new Intent(this.f490a, (Class<?>) ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(g));
                intent.putExtra("allowCT", q.l());
                intent.putExtra("timestamp", q.j());
                intent.putExtra("templateName", Integer.valueOf(z ? 4 : q.i().intValue()));
                intent.putExtra("templateId", Integer.valueOf(z ? 7 : q.h().intValue()));
                if (!z) {
                    str = q.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z) {
                    str2 = q.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z) {
                    str3 = q.a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z) {
                    intent.putExtra("advertisingId", ((com.startapp.sdk.common.advertisingid.b) this.c.a()).a().f255a);
                    if (((af) this.b.a()).contains("consentType")) {
                        intent.putExtra("consentType", ((af) this.b.a()).getInt("consentType", -1));
                    }
                    if (str4 != null) {
                        intent.putExtra("erid", str4);
                    }
                    if (str5 != null) {
                        intent.putExtra("eridUrl", str5);
                    }
                }
                ConsentTypeInfoConfig c = q.c();
                if (c != null) {
                    if (c.b() != null) {
                        intent.putExtra("impression", c.b());
                    }
                    if (c.a() != null) {
                        intent.putExtra("falseClick", c.a());
                    }
                    if (c.c() != null) {
                        intent.putExtra("trueClick", c.c());
                    }
                }
                if (z && (consentTypeInfo = AdInformationMetaData.c().a().getConsentTypeInfo()) != null) {
                    intent.putExtra("trueClick", consentTypeInfo);
                }
                try {
                    this.f490a.startActivity(intent);
                    this.e = true;
                    if (a(1)) {
                        n8 n8Var = new n8(o8.d);
                        n8Var.d = "CNS.shown";
                        n8Var.i = String.valueOf(z);
                        n8Var.e = String.valueOf(System.currentTimeMillis());
                        n8Var.a();
                    }
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    if (a(2)) {
                        n8.a(th);
                    }
                }
                return this.e;
            }
        }
        return false;
    }
}
