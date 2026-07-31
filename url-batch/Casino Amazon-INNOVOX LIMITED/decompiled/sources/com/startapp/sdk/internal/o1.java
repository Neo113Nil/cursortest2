package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import dev.hyo.openiap.OpenIapError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class o1 extends com.startapp.sdk.adsbase.c {
    public final HashSet k;
    public final HashSet l;
    public com.startapp.sdk.adsbase.model.a m;
    public int n;
    public final boolean o;
    public final pa p;

    public o1(Context context, x7 x7Var, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, boolean z) {
        super(context, x7Var, adPreferences, adEventListener, placement, paVar, paVar2, paVar3, paVar4);
        this.k = new HashSet();
        this.l = new HashSet();
        this.n = 0;
        this.p = paVar5;
        this.o = z;
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        return aVar != null;
    }

    public final void d(boolean z) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adResult", z);
        db.a(this.f132a).a(intent);
        this.b.setState(z ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
        if (!z) {
            Context context = this.f132a;
            AdEventListener adEventListener = this.d;
            this.d = null;
            a0.a(context, adEventListener, this.b, false);
            return;
        }
        if (this.o) {
            ((w6) this.i.a()).c(this, mh.u);
            ((sj) this.p.a()).a(((x7) this.b).b, new n1(this, this));
        } else {
            Context context2 = this.f132a;
            AdEventListener adEventListener2 = this.d;
            this.d = null;
            a0.b(context2, adEventListener2, this.b, false);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c = c();
        this.m = c;
        if (!b(c)) {
            return null;
        }
        if (this.k.size() == 0) {
            this.k.add(this.f132a.getPackageName());
        }
        com.startapp.sdk.adsbase.model.a aVar = this.m;
        aVar.H0 = this.k;
        aVar.J0 = this.l;
        if (this.n > 0) {
            aVar.L0 = false;
            if (MetaData.A().R().a(this.f132a)) {
                com.startapp.sdk.adsbase.g.e(this.f132a);
            }
        }
        y7 y7Var = new y7((z7) this.g.a(), this.m.a(MetaData.A().a(this.e) + f0.b));
        y7Var.e = new a7() { // from class: com.startapp.sdk.internal.o1$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.a7
            public final Object a(Object obj) {
                return o1.this.a((Throwable) obj);
            }
        };
        new a7() { // from class: com.startapp.sdk.internal.o1$$ExternalSyntheticLambda1
            @Override // com.startapp.sdk.internal.a7
            public final Object a(Object obj) {
                return o1.this.a((y7) obj);
            }
        }.a(y7Var);
        y7Var.d = ((z7) this.g.a()).a(this.m.Z);
        return y7Var.a();
    }

    public final Void a(y7 y7Var) {
        w6 w6Var = (w6) this.i.a();
        WeakHashMap weakHashMap = zh.f528a;
        y7Var.getClass();
        w6Var.a(this, y7Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public boolean a(Object obj) {
        Ad.AdType adType;
        if (obj == null) {
            if (this.f == null) {
                this.f = "No response";
            }
            return false;
        }
        if (!(obj instanceof c8)) {
            if (this.f == null) {
                this.f = OpenIapError.UnknownError.MESSAGE;
            }
            return false;
        }
        c8 c8Var = (c8) obj;
        String str = c8Var.b;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                if (this.f == null) {
                    com.startapp.sdk.adsbase.model.a aVar = this.m;
                    if (aVar != null && ((adType = aVar.U0) == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO)) {
                        this.f = "Video isn't available";
                    } else {
                        this.f = "Empty Ad";
                    }
                }
                return false;
            }
            boolean z = AdsCommonMetaData.k().G() && q0.a(this.f132a, q0.a(str, this.n), this.n, this.k, arrayList).booleanValue();
            if (z) {
                Context context = this.f132a;
                ((Executor) com.startapp.sdk.components.a.a(context).A.a()).execute(new p0(context, arrayList).c);
            } else {
                x7 x7Var = (x7) this.b;
                x7Var.setRequestUrl(c8Var.f196a);
                x7Var.d(str);
            }
            if (!z) {
                return true;
            }
            this.n++;
            return b();
        } catch (Throwable th) {
            n8.a(th);
            return false;
        }
    }
}
