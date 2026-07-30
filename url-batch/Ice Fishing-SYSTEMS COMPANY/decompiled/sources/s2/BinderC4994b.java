package s2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC3372ie;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.InterfaceC2524Dl;
import com.google.android.gms.internal.ads.InterfaceC4156x8;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import q2.InterfaceC4877a;
import q2.R0;
import q2.r;
import t2.C;
import t2.G;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4994b extends AbstractBinderC3372ie implements InterfaceC4156x8 {

    /* renamed from: u, reason: collision with root package name */
    public final AdOverlayInfoParcel f40431u;

    /* renamed from: v, reason: collision with root package name */
    public final Activity f40432v;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f40436z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40433w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40434x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40435y = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f40429A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40430B = false;

    public BinderC4994b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        C4997e c4997e;
        boolean z8 = false;
        this.f40431u = adOverlayInfoParcel;
        this.f40432v = activity;
        C3151ea c3151ea = AbstractC3368ia.f31455H5;
        r rVar = r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if ((booleanValue || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31462I5)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31497M5)).booleanValue()) && (c4997e = adOverlayInfoParcel.f23731n) != null && c4997e.f40463C && Build.MANUFACTURER.matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31479K5)) && Build.MODEL.matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31488L5))) {
            z8 = true;
        }
        this.f40436z = z8;
    }

    public final synchronized void G3() {
        try {
            if (!this.f40434x) {
                l lVar = this.f40431u.f23733v;
                if (lVar != null) {
                    lVar.R0(4);
                }
                this.f40434x = true;
                if (this.f40436z) {
                    if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31497M5)).booleanValue()) {
                        p2.j.f39798C.f39807g.k(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void I() {
        if (this.f40432v.isFinishing()) {
            G3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final boolean e() {
        return ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31462I5)).booleanValue() && this.f40436z && this.f40429A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void f() {
        l lVar = this.f40431u.f23733v;
        if (lVar != null) {
            lVar.K2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void g1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f40433w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4156x8
    public final void i0(boolean z8) {
        if (!z8) {
            this.f40430B = true;
        } else if (this.f40430B) {
            int i = C.f40822b;
            u2.i.a("Foregrounded: finishing activity from LauncherOverlay");
            this.f40432v.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void j() {
        if (this.f40433w) {
            C.k("LauncherOverlay finishing activity");
            this.f40432v.finish();
            return;
        }
        this.f40433w = true;
        this.f40429A = true;
        l lVar = this.f40431u.f23733v;
        if (lVar != null) {
            lVar.Y1();
        }
        if (this.f40436z) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31455H5)).booleanValue()) {
                G.f40858l.postDelayed(new R0(2, this), ((Integer) r1.f40119c.a(AbstractC3368ia.f31470J5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void k() {
        this.f40429A = false;
        l lVar = this.f40431u.f23733v;
        if (lVar != null) {
            lVar.y1();
        }
        if (this.f40432v.isFinishing()) {
            G3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void r3(Bundle bundle) {
        l lVar;
        C3151ea c3151ea = AbstractC3368ia.ia;
        r rVar = r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        Activity activity = this.f40432v;
        if (booleanValue && !this.f40435y) {
            activity.requestWindowFeature(1);
        }
        boolean z8 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z8 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40431u;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z8) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC4877a interfaceC4877a = adOverlayInfoParcel.f23732u;
            if (interfaceC4877a != null) {
                interfaceC4877a.onAdClicked();
            }
            InterfaceC2524Dl interfaceC2524Dl = adOverlayInfoParcel.f23727N;
            if (interfaceC2524Dl != null) {
                interfaceC2524Dl.C();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lVar = adOverlayInfoParcel.f23733v) != null) {
                lVar.g();
            }
        }
        if (this.f40436z) {
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31497M5)).booleanValue()) {
                p2.j.f39798C.f39807g.i(this);
            }
        }
        L2.i iVar = p2.j.f39798C.f39801a;
        C4997e c4997e = adOverlayInfoParcel.f23731n;
        InterfaceC4993a interfaceC4993a = c4997e.f40462B;
        InterfaceC4995c interfaceC4995c = adOverlayInfoParcel.f23716B;
        Activity activity2 = this.f40432v;
        if (L2.i.B(activity2, c4997e, interfaceC4995c, interfaceC4993a, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void w() {
        this.f40435y = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void y() {
        if (this.f40432v.isFinishing()) {
            G3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void F(V2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void d1(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void l1(int i, int i4, Intent intent) {
    }
}
