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

/* loaded from: classes.dex */
public final class g6 implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6972a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f6973b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f6974c;

    /* renamed from: d, reason: collision with root package name */
    public Intent f6975d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6976e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6977f = true;

    public g6(Context context, ib ibVar, ib ibVar2) {
        this.f6972a = context;
        this.f6973b = ibVar;
        this.f6974c = ibVar2;
    }

    public static boolean a(int i4) {
        ConsentConfig r4 = MetaData.E().r();
        ComponentInfoEventConfig f4 = r4 != null ? r4.f() : null;
        return f4 != null && f4.a((long) i4);
    }

    public final boolean b() {
        ConsentConfig r4 = MetaData.E().r();
        return this.f6977f && r4 != null && r4.l();
    }

    public final void a(Integer num, Long l4, Boolean bool, boolean z, boolean z4) {
        if (b()) {
            long j4 = ((sf) this.f6973b.a()).getLong("consentTimestamp", 0L);
            int i4 = ((sf) this.f6973b.a()).getInt("consentType", -1);
            boolean contains = ((sf) this.f6973b.a()).contains("consentApc");
            boolean z5 = (num == null || i4 == num.intValue()) ? false : true;
            boolean z6 = (bool == null || (contains && ((sf) this.f6973b.a()).getBoolean("consentApc", false) == bool.booleanValue())) ? false : true;
            boolean z7 = l4 != null && l4.longValue() > j4;
            if (z || z7) {
                if (z5 || z6) {
                    rf edit = ((sf) this.f6973b.a()).edit();
                    if (z5) {
                        int intValue = num.intValue();
                        edit.a("consentType", num);
                        edit.f7532a.putInt("consentType", intValue);
                    }
                    if (z6) {
                        boolean booleanValue = bool.booleanValue();
                        edit.a("consentApc", bool);
                        edit.f7532a.putBoolean("consentApc", booleanValue);
                    }
                    if (z7) {
                        long longValue = l4.longValue();
                        edit.a("consentTimestamp", l4);
                        edit.f7532a.putLong("consentTimestamp", longValue);
                    }
                    edit.apply();
                    if (z4) {
                        MetaData.E().a(this.f6972a, new AdPreferences(), MetaDataRequest$RequestReason.CONSENT, false, null, true);
                    }
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        MetaData.E().a(this);
        ConsentConfig r4 = MetaData.E().r();
        if (r4 == null || !b()) {
            return;
        }
        Integer b4 = r4.b();
        if (b4 != null) {
            a(b4, Long.valueOf(r4.j()), null, false, false);
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.CONSENT) {
            rf edit = ((sf) this.f6973b.a()).edit();
            long j4 = r4.j();
            edit.a("consentTimestamp", Long.valueOf(j4));
            edit.f7532a.putLong("consentTimestamp", j4);
            edit.apply();
            return;
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.LAUNCH) {
            a(false, null, null, null, null, null);
        }
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        MetaData.E().a(this);
    }

    public final boolean a(boolean z, String str, String str2, String str3, String str4, String str5) {
        ConsentConfig r4;
        String g4;
        Integer consentTypeInfo;
        if ((z || gh.f6998u == 2) && (r4 = MetaData.E().r()) != null && ((b() || z) && !this.f6976e)) {
            Context context = this.f6972a;
            WeakHashMap weakHashMap = si.f7575a;
            if (((f6) com.startapp.sdk.components.a.a(context).f6577t.a()).b() && si.c(this.f6972a)) {
                if (!z && (r4.i() == null || r4.h() == null || ((sf) this.f6973b.a()).contains("consentApc"))) {
                    return false;
                }
                if (z) {
                    g4 = AdInformationMetaData.c().a().getDialogUrl();
                } else {
                    g4 = r4.g();
                }
                if (g4 == null) {
                    return false;
                }
                Intent intent = new Intent(this.f6972a, (Class<?>) ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(g4));
                intent.putExtra("allowCT", r4.l());
                intent.putExtra("timestamp", r4.j());
                intent.putExtra("templateName", Integer.valueOf(z ? 4 : r4.i().intValue()));
                intent.putExtra("templateId", Integer.valueOf(z ? 7 : r4.h().intValue()));
                if (!z) {
                    str = r4.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z) {
                    str2 = r4.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z) {
                    str3 = r4.a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z) {
                    intent.putExtra("advertisingId", ((com.startapp.sdk.common.advertisingid.b) this.f6974c.a()).a().f7169a);
                    if (((sf) this.f6973b.a()).contains("consentType")) {
                        intent.putExtra("consentType", ((sf) this.f6973b.a()).getInt("consentType", -1));
                    }
                    if (str4 != null) {
                        intent.putExtra("erid", str4);
                    }
                    if (str5 != null) {
                        intent.putExtra("eridUrl", str5);
                    }
                }
                ConsentTypeInfoConfig c4 = r4.c();
                if (c4 != null) {
                    if (c4.b() != null) {
                        intent.putExtra("impression", c4.b());
                    }
                    if (c4.a() != null) {
                        intent.putExtra("falseClick", c4.a());
                    }
                    if (c4.c() != null) {
                        intent.putExtra("trueClick", c4.c());
                    }
                }
                if (z && (consentTypeInfo = AdInformationMetaData.c().a().getConsentTypeInfo()) != null) {
                    intent.putExtra("trueClick", consentTypeInfo);
                }
                try {
                    this.f6972a.startActivity(intent);
                    this.f6976e = true;
                    if (a(1)) {
                        d9 d9Var = new d9(e9.f6838d);
                        d9Var.f6792d = "CNS.shown";
                        d9Var.f6797i = String.valueOf(z);
                        d9Var.f6793e = String.valueOf(System.currentTimeMillis());
                        d9Var.a();
                    }
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    if (a(2)) {
                        d9.a(th);
                    }
                }
                return this.f6976e;
            }
        }
        return false;
    }
}
