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
    public final HashSet f7547k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f7548l;

    /* renamed from: m, reason: collision with root package name */
    public com.startapp.sdk.adsbase.model.a f7549m;
    public int n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final ib f7550p;

    public s1(Context context, m8 m8Var, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, boolean z) {
        super(context, m8Var, adPreferences, adEventListener, placement, ibVar, ibVar2, ibVar3, ibVar4);
        this.f7547k = new HashSet();
        this.f7548l = new HashSet();
        this.n = 0;
        this.f7550p = ibVar5;
        this.o = z;
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f6387f = th != null ? th.getMessage() : null;
        return null;
    }

    public boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        return aVar != null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c4 = c();
        this.f7549m = c4;
        if (!b(c4)) {
            return null;
        }
        if (this.f7547k.size() == 0) {
            this.f7547k.add(this.f6382a.getPackageName());
        }
        com.startapp.sdk.adsbase.model.a aVar = this.f7549m;
        aVar.f6460H0 = this.f7547k;
        aVar.f6462J0 = this.f7548l;
        if (this.n > 0) {
            aVar.f6464L0 = false;
            if (MetaData.E().W().a(this.f6382a)) {
                com.startapp.sdk.adsbase.g.e(this.f6382a);
            }
        }
        n8 n8Var = new n8((o8) this.f6388g.a(), this.f7549m.a(h0.a(AdsConstants$AdApiType.HTML, this.f6386e)));
        n8Var.f7329e = new D0.a(26, this);
        a(n8Var);
        o8 o8Var = (o8) this.f6388g.a();
        n8Var.f7328d = ((HttpClientConfig) o8Var.f7374f.a()).a(this.f7549m.f7910Z);
        return n8Var.a();
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f6390i.a();
        WeakHashMap weakHashMap = si.f7575a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public boolean a(Object obj) {
        Ad.AdType adType;
        if (obj == null) {
            if (this.f6387f == null) {
                this.f6387f = "No response";
            }
            return false;
        }
        if (!(obj instanceof r8)) {
            if (this.f6387f == null) {
                this.f6387f = "Unknown error";
            }
            return false;
        }
        r8 r8Var = (r8) obj;
        String str = r8Var.f7523b;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                if (this.f6387f == null) {
                    com.startapp.sdk.adsbase.model.a aVar = this.f7549m;
                    if (aVar == null || ((adType = aVar.U0) != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO)) {
                        this.f6387f = "Empty Ad";
                    }
                    this.f6387f = "Video isn't available";
                }
                return false;
            }
            boolean z = AdsCommonMetaData.k().G() && t0.a(this.f6382a, t0.a(str, this.n), this.n, this.f7547k, arrayList).booleanValue();
            if (z) {
                Context context = this.f6382a;
                ((Executor) com.startapp.sdk.components.a.a(context).f6541A.a()).execute(new s0(context, arrayList).f7546c);
            } else {
                m8 m8Var = (m8) this.f6383b;
                m8Var.getClass();
                m8Var.setRequestUrl(r8Var.f7522a);
                m8Var.d(str);
            }
            if (!z) {
                return true;
            }
            this.n++;
            return b();
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public final void e(boolean z) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f6383b.hashCode());
        intent.putExtra("adResult", z);
        wb.a(this.f6382a).a(intent);
        if (z) {
            if (this.o) {
                ((y6) ((x6) this.f6390i.a())).c(this, fi.f6947u);
                ((pk) this.f7550p.a()).a(((m8) this.f6383b).f7258b, new r1(this, this));
                return;
            }
            Context context = this.f6382a;
            AdEventListener adEventListener = this.f6385d;
            this.f6385d = null;
            a0.b(context, adEventListener, this.f6383b, false);
            return;
        }
        Context context2 = this.f6382a;
        AdEventListener adEventListener2 = this.f6385d;
        this.f6385d = null;
        a0.a(context2, adEventListener2, this.f6383b, false);
    }
}
