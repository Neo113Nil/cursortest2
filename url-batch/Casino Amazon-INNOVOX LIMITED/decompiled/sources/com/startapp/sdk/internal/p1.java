package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class p1 extends com.startapp.sdk.adsbase.c {
    public int k;
    public final HashSet l;

    public p1(Context context, ka kaVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4) {
        super(context, kaVar, adPreferences, adEventListener, placement, paVar, paVar2, paVar3, paVar4);
        this.k = 0;
        this.l = new HashSet();
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public abstract void a(Ad ad);

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adResult", z);
        db.a(this.f132a).a(intent);
        if (z) {
            a(this.b);
            Context context = this.f132a;
            AdEventListener adEventListener = this.d;
            this.d = null;
            a0.b(context, adEventListener, this.b, false);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c = c();
        if (c == null) {
            return null;
        }
        if (this.l.size() == 0) {
            this.l.add(this.f132a.getPackageName());
        }
        int i = this.k;
        if (i > 0) {
            c.L0 = false;
        }
        c.H0 = this.l;
        c.L0 = i == 0;
        y7 y7Var = new y7((z7) this.g.a(), c.a(MetaData.A().a(this.e) + f0.f233a));
        y7Var.e = new a7() { // from class: com.startapp.sdk.internal.p1$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.a7
            public final Object a(Object obj) {
                return p1.this.a((Throwable) obj);
            }
        };
        new a7() { // from class: com.startapp.sdk.internal.p1$$ExternalSyntheticLambda1
            @Override // com.startapp.sdk.internal.a7
            public final Object a(Object obj) {
                return p1.this.a((y7) obj);
            }
        }.a(y7Var);
        y7Var.d = ((z7) this.g.a()).a(c.Z);
        c8 a2 = y7Var.a();
        if (a2 != null) {
            try {
                return JsonParser.fromJson(a2.b, GetAdResponse.class);
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        return null;
    }

    public final Void a(y7 y7Var) {
        w6 w6Var = (w6) this.i.a();
        WeakHashMap weakHashMap = zh.f528a;
        y7Var.getClass();
        w6Var.a(this, y7Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        int i;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z = false;
        if (obj == null) {
            this.f = "Empty Response";
            return false;
        }
        if (!getAdResponse.b()) {
            this.f = getAdResponse.a();
            return false;
        }
        ka kaVar = (ka) this.b;
        ArrayList a2 = q0.a(this.f132a, getAdResponse.d(), this.k, this.l, true);
        kaVar.a(a2);
        kaVar.setAdInfoOverride(getAdResponse.c());
        if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
            z = true;
        }
        if (!z) {
            this.f = "Empty Response";
            return z;
        }
        if (a2.size() != 0 || (i = this.k) != 0) {
            return z;
        }
        this.k = i + 1;
        return b();
    }
}
