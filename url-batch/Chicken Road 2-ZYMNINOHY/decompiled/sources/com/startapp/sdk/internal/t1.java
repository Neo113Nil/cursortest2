package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class t1 extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public int f7586k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f7587l;

    public t1(Context context, db dbVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4) {
        super(context, dbVar, adPreferences, adEventListener, placement, ibVar, ibVar2, ibVar3, ibVar4);
        this.f7586k = 0;
        this.f7587l = new HashSet();
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f6387f = th != null ? th.getMessage() : null;
        return null;
    }

    public abstract void a(Ad ad);

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f6383b.hashCode());
        intent.putExtra("adResult", z);
        wb.a(this.f6382a).a(intent);
        if (z) {
            a(this.f6383b);
            Context context = this.f6382a;
            AdEventListener adEventListener = this.f6385d;
            this.f6385d = null;
            a0.b(context, adEventListener, this.f6383b, false);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c4 = c();
        if (c4 != null) {
            if (this.f7587l.size() == 0) {
                this.f7587l.add(this.f6382a.getPackageName());
            }
            int i4 = this.f7586k;
            if (i4 > 0) {
                c4.f6464L0 = false;
            }
            c4.f6460H0 = this.f7587l;
            c4.f6464L0 = i4 == 0;
            n8 n8Var = new n8((o8) this.f6388g.a(), c4.a(h0.a(AdsConstants$AdApiType.JSON, this.f6386e)));
            n8Var.f7329e = new D0.a(27, this);
            a(n8Var);
            n8Var.f7328d = ((HttpClientConfig) ((o8) this.f6388g.a()).f7374f.a()).a(c4.f7910Z);
            r8 a3 = n8Var.a();
            if (a3 != null) {
                try {
                    return JsonParser.fromJson(a3.f7523b, GetAdResponse.class);
                } catch (Throwable th) {
                    d9.a(th);
                }
            }
        }
        return null;
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f6390i.a();
        WeakHashMap weakHashMap = si.f7575a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        int i4;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z = false;
        if (obj == null) {
            this.f6387f = "Empty Response";
            return false;
        }
        if (!getAdResponse.b()) {
            this.f6387f = getAdResponse.a();
            return false;
        }
        db dbVar = (db) this.f6383b;
        ArrayList a3 = t0.a(this.f6382a, getAdResponse.d(), this.f7586k, this.f7587l, true);
        dbVar.a(a3);
        dbVar.setAdInfoOverride(getAdResponse.c());
        if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
            z = true;
        }
        if (!z) {
            this.f6387f = "Empty Response";
            return z;
        }
        if (a3.size() != 0 || (i4 = this.f7586k) != 0) {
            return z;
        }
        this.f7586k = i4 + 1;
        return b();
    }
}
