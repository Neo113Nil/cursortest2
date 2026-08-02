package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class s1 extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f4409k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f4410l;

    /* renamed from: m, reason: collision with root package name */
    public com.startapp.sdk.adsbase.model.a f4411m;

    /* renamed from: n, reason: collision with root package name */
    public int f4412n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final ib f4413p;

    public s1(Context context, m8 m8Var, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, boolean z) {
        super(context, m8Var, adPreferences, adEventListener, placement, ibVar, ibVar2, ibVar3, ibVar4);
        this.f4409k = new HashSet();
        this.f4410l = new HashSet();
        this.f4412n = 0;
        this.f4413p = ibVar5;
        this.o = z;
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        return aVar != null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c3 = c();
        this.f4411m = c3;
        if (!b(c3)) {
            return null;
        }
        if (this.f4409k.size() == 0) {
            this.f4409k.add(this.f3293a.getPackageName());
        }
        com.startapp.sdk.adsbase.model.a aVar = this.f4411m;
        aVar.f3367H0 = this.f4409k;
        aVar.f3368J0 = this.f4410l;
        if (this.f4412n > 0) {
            aVar.f3370L0 = false;
            if (MetaData.E().W().a(this.f3293a)) {
                com.startapp.sdk.adsbase.g.e(this.f3293a);
            }
        }
        n8 n8Var = new n8((o8) this.f3298g.a(), this.f4411m.a(h0.a(AdsConstants$AdApiType.HTML, this.f3297e)));
        n8Var.f4196e = new Y1.E(22, this);
        a(n8Var);
        o8 o8Var = (o8) this.f3298g.a();
        n8Var.f4195d = ((HttpClientConfig) o8Var.f.a()).a(this.f4411m.f4764Z);
        return n8Var.a();
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f3300i.a();
        WeakHashMap weakHashMap = si.f4438a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
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
        if (!(obj instanceof r8)) {
            if (this.f == null) {
                this.f = "Unknown error";
            }
            return false;
        }
        r8 r8Var = (r8) obj;
        String str = r8Var.f4386b;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                if (this.f == null) {
                    com.startapp.sdk.adsbase.model.a aVar = this.f4411m;
                    if (aVar == null || ((adType = aVar.f3378U0) != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO)) {
                        this.f = "Empty Ad";
                    }
                    this.f = "Video isn't available";
                }
                return false;
            }
            boolean z = AdsCommonMetaData.k().G() && t0.a(this.f3293a, t0.a(str, this.f4412n), this.f4412n, this.f4409k, arrayList).booleanValue();
            if (z) {
                Context context = this.f3293a;
                ((Executor) com.startapp.sdk.components.a.a(context).f3443A.a()).execute(new s0(context, arrayList).f4408c);
            } else {
                m8 m8Var = (m8) this.f3294b;
                m8Var.getClass();
                m8Var.setRequestUrl(r8Var.f4385a);
                m8Var.d(str);
            }
            if (!z) {
                return true;
            }
            this.f4412n++;
            return b();
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public final void e(boolean z) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f3294b.hashCode());
        intent.putExtra("adResult", z);
        wb.a(this.f3293a).a(intent);
        if (z) {
            if (this.o) {
                ((y6) ((x6) this.f3300i.a())).c(this, fi.f3829u);
                ((pk) this.f4413p.a()).a(((m8) this.f3294b).f4130b, new r1(this, this));
                return;
            }
            Context context = this.f3293a;
            AdEventListener adEventListener = this.f3296d;
            this.f3296d = null;
            a0.b(context, adEventListener, this.f3294b, false);
            return;
        }
        Context context2 = this.f3293a;
        AdEventListener adEventListener2 = this.f3296d;
        this.f3296d = null;
        a0.a(context2, adEventListener2, this.f3294b, false);
    }
}
