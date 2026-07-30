package s2;

import K2.n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.AbstractBinderC3372ie;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2588Hh;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2817Up;
import com.google.android.gms.internal.ads.C2837Wb;
import com.google.android.gms.internal.ads.C2858Xf;
import com.google.android.gms.internal.ads.C2914a9;
import com.google.android.gms.internal.ads.C2955aw;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3276gq;
import com.google.android.gms.internal.ads.C3330hq;
import com.google.android.gms.internal.ads.C3431jl;
import com.google.android.gms.internal.ads.C4293zk;
import com.google.android.gms.internal.ads.InterfaceC2524Dl;
import com.google.android.gms.internal.ads.InterfaceC2639Kh;
import com.google.android.gms.internal.ads.InterfaceC2769Sb;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import com.google.android.gms.internal.ads.InterfaceC3858rh;
import com.google.android.gms.internal.ads.RunnableC3167eq;
import com.google.android.gms.internal.ads.RunnableC3329hp;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import com.google.android.gms.internal.ads.Vv;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.gms.internal.ads.Yr;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
import q2.InterfaceC4877a;
import q2.R0;
import q2.r;
import t2.C;
import t2.G;
import u2.C5107a;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4996d extends AbstractBinderC3372ie {

    /* renamed from: S, reason: collision with root package name */
    public static final int f40437S = Color.argb(0, 0, 0, 0);

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f40438A;

    /* renamed from: B, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f40439B;

    /* renamed from: E, reason: collision with root package name */
    public i f40442E;
    public R0 J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f40447K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f40448L;

    /* renamed from: P, reason: collision with root package name */
    public Toolbar f40452P;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ int f40454R;

    /* renamed from: u, reason: collision with root package name */
    public final Activity f40455u;

    /* renamed from: v, reason: collision with root package name */
    public AdOverlayInfoParcel f40456v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC3858rh f40457w;

    /* renamed from: x, reason: collision with root package name */
    public n f40458x;

    /* renamed from: y, reason: collision with root package name */
    public m f40459y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f40460z = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40440C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f40441D = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f40443F = false;

    /* renamed from: Q, reason: collision with root package name */
    public int f40453Q = 1;

    /* renamed from: G, reason: collision with root package name */
    public int f40444G = 0;

    /* renamed from: H, reason: collision with root package name */
    public final Object f40445H = new Object();

    /* renamed from: I, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f40446I = new com.google.android.material.datepicker.j(this);

    /* renamed from: M, reason: collision with root package name */
    public boolean f40449M = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f40450N = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f40451O = true;

    public BinderC4996d(Activity activity, int i) {
        this.f40454R = i;
        this.f40455u = activity;
    }

    public static final void J3(View view, C3330hq c3330hq) {
        if (c3330hq == null || view == null) {
            return;
        }
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31703j6)).booleanValue()) {
            A3 a32 = c3330hq.f31273b;
            if (((Vv) a32.f23813z) == Vv.HTML) {
                return;
            }
        }
        C3431jl c3431jl = p2.j.f39798C.f39823x;
        Wv wv = c3330hq.f31272a;
        c3431jl.getClass();
        C3431jl.j(wv, view);
    }

    public final void G3() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        l lVar;
        if (!this.f40455u.isFinishing() || this.f40449M) {
            return;
        }
        this.f40449M = true;
        InterfaceC3858rh interfaceC3858rh = this.f40457w;
        if (interfaceC3858rh != null) {
            interfaceC3858rh.T0(this.f40453Q - 1);
            synchronized (this.f40445H) {
                try {
                    if (!this.f40447K && this.f40457w.Z0()) {
                        C3151ea c3151ea = AbstractC3368ia.f31593X5;
                        r rVar = r.f40116e;
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && !this.f40450N && (adOverlayInfoParcel = this.f40456v) != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
                            lVar.G2();
                        }
                        R0 r02 = new R0(3, this);
                        this.J = r02;
                        G.f40858l.postDelayed(r02, ((Long) rVar.f40119c.a(AbstractC3368ia.f31435F1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        H3();
    }

    public final void H3() {
        InterfaceC3858rh interfaceC3858rh;
        l lVar;
        if (this.f40450N) {
            return;
        }
        this.f40450N = true;
        InterfaceC3858rh interfaceC3858rh2 = this.f40457w;
        if (interfaceC3858rh2 != null) {
            this.f40442E.removeView(interfaceC3858rh2.b0());
            n nVar = this.f40458x;
            if (nVar != null) {
                this.f40457w.A0((Context) nVar.f1605b);
                this.f40457w.d1(false);
                if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.fe)).booleanValue() && this.f40457w.getParent() != null) {
                    ((ViewGroup) this.f40457w.getParent()).removeView(this.f40457w.b0());
                }
                ViewGroup viewGroup = (ViewGroup) this.f40458x.f1607d;
                View b02 = this.f40457w.b0();
                n nVar2 = this.f40458x;
                viewGroup.addView(b02, nVar2.f1604a, (ViewGroup.LayoutParams) nVar2.f1606c);
                this.f40458x = null;
            } else {
                Activity activity = this.f40455u;
                if (activity.getApplicationContext() != null) {
                    this.f40457w.A0(activity.getApplicationContext());
                }
            }
            this.f40457w = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
            lVar.R0(this.f40453Q);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40456v;
        if (adOverlayInfoParcel2 == null || (interfaceC3858rh = adOverlayInfoParcel2.f23734w) == null) {
            return;
        }
        J3(this.f40456v.f23734w.b0(), interfaceC3858rh.Z());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void I() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
            lVar.D0();
        }
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31601Y5)).booleanValue() && this.f40457w != null && (!this.f40455u.isFinishing() || this.f40458x == null)) {
            this.f40457w.onPause();
        }
        G3();
    }

    public final void I3(View view) {
        C3330hq Z8;
        C3276gq F02;
        InterfaceC3858rh interfaceC3858rh = this.f40457w;
        if (interfaceC3858rh == null) {
            return;
        }
        C3151ea c3151ea = AbstractC3368ia.k6;
        r rVar = r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && (F02 = interfaceC3858rh.F0()) != null) {
            synchronized (F02) {
                C2955aw c2955aw = F02.f31109f;
                if (c2955aw != null) {
                    p2.j.f39798C.f39823x.getClass();
                    C3431jl.r(new RunnableC3329hp(2, c2955aw, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31703j6)).booleanValue() && (Z8 = interfaceC3858rh.Z()) != null && ((Vv) Z8.f31273b.f23813z) == Vv.HTML) {
            C3431jl c3431jl = p2.j.f39798C.f39823x;
            Wv wv = Z8.f31272a;
            c3431jl.getClass();
            C3431jl.r(new RunnableC3167eq(wv, view, 0));
        }
    }

    public final void K3(boolean z8) {
        if (this.f40456v.f23729P) {
            return;
        }
        C3151ea c3151ea = AbstractC3368ia.f31620a6;
        r rVar = r.f40116e;
        int intValue = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        boolean z9 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31459I1)).booleanValue() || z8;
        Yr yr = new Yr();
        yr.f28896a = 0;
        yr.f28897b = 0;
        yr.f28898c = 0;
        yr.f28899d = 50;
        yr.f28896a = true != z9 ? 0 : intValue;
        yr.f28897b = true != z9 ? intValue : 0;
        yr.f28898c = intValue;
        this.f40459y = new m(this.f40455u, yr, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z9 ? 9 : 11);
        L3(z8, this.f40456v.f23737z);
        this.f40442E.addView(this.f40459y, layoutParams);
        I3(this.f40459y);
    }

    public final void L3(boolean z8, boolean z9) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        p2.f fVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        p2.f fVar2;
        C3151ea c3151ea = AbstractC3368ia.f31444G1;
        r rVar = r.f40116e;
        boolean z10 = true;
        boolean z11 = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && (adOverlayInfoParcel2 = this.f40456v) != null && (fVar2 = adOverlayInfoParcel2.f23722H) != null && fVar2.f39781A;
        C3151ea c3151ea2 = AbstractC3368ia.H1;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        boolean z12 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && (adOverlayInfoParcel = this.f40456v) != null && (fVar = adOverlayInfoParcel.f23722H) != null && fVar.f39782B;
        if (z8 && z9 && z11 && !z12) {
            InterfaceC3858rh interfaceC3858rh = this.f40457w;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put(NativeAdvancedJsUtils.f18064p, "useCustomClose");
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.c("onError", put);
                }
            } catch (JSONException e6) {
                int i = C.f40822b;
                u2.i.d("Error occurred while dispatching error event.", e6);
            }
        }
        m mVar = this.f40459y;
        if (mVar != null) {
            if (!z12 && (!z9 || z11)) {
                z10 = false;
            }
            ImageButton imageButton = mVar.f40486n;
            if (!z10) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31475K1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void M3(int i, boolean z8) {
        if (!z8) {
            this.f40442E.setBackgroundColor(-16777216);
            return;
        }
        this.f40442E.setBackgroundColor(0);
        this.f40444G = i;
        Window window = this.f40455u.getWindow();
        if (!((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31762q1)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i);
    }

    public final void N3(int i) {
        int i4;
        Activity activity = this.f40455u;
        int i9 = activity.getApplicationInfo().targetSdkVersion;
        C3151ea c3151ea = AbstractC3368ia.f31550S6;
        r rVar = r.f40116e;
        if (i9 >= ((Integer) rVar.f40119c.a(c3151ea)).intValue()) {
            int i10 = activity.getApplicationInfo().targetSdkVersion;
            C3151ea c3151ea2 = AbstractC3368ia.f31559T6;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (i10 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue() && (i4 = Build.VERSION.SDK_INT) >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31568U6)).intValue() && i4 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31576V6)).intValue()) {
                return;
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.e("AdOverlay.setRequestedOrientation", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O3(boolean z8) {
        boolean z9;
        boolean z10;
        Window window;
        int i;
        boolean z11;
        int i4;
        InterfaceC3858rh interfaceC3858rh;
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z12;
        boolean z13 = this.f40448L;
        Activity activity = this.f40455u;
        if (!z13) {
            activity.requestWindowFeature(1);
        }
        Window window2 = activity.getWindow();
        if (window2 == null) {
            throw new h("Invalid activity, no window available.");
        }
        InterfaceC3858rh interfaceC3858rh2 = this.f40456v.f23734w;
        C2588Hh j02 = interfaceC3858rh2 != null ? interfaceC3858rh2.j0() : null;
        if (j02 != null) {
            synchronized (j02.f25409w) {
                z12 = j02.J;
            }
            if (z12) {
                z9 = true;
                this.f40443F = false;
                if (z9) {
                    int i9 = this.f40456v.f23717C;
                    if (i9 == 6) {
                        z10 = activity.getResources().getConfiguration().orientation == 1;
                        this.f40443F = z10;
                    } else if (i9 == 7) {
                        z10 = activity.getResources().getConfiguration().orientation == 2;
                        this.f40443F = z10;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(z10).length() + 41);
                    sb.append("Delay onShow to next orientation change: ");
                    sb.append(z10);
                    String sb2 = sb.toString();
                    int i10 = C.f40822b;
                    u2.i.a(sb2);
                    N3(this.f40456v.f23717C);
                    window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
                    u2.i.a("Hardware acceleration on the AdActivity window enabled.");
                    activity.setContentView(this.f40442E);
                    this.f40448L = true;
                    if (this.f40441D) {
                        this.f40442E.setBackgroundColor(f40437S);
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31762q1)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                            window2.setBackgroundBlurRadius(this.f40444G);
                        }
                    } else {
                        this.f40442E.setBackgroundColor(-16777216);
                    }
                    if (z8) {
                        try {
                            C2837Wb c2837Wb = p2.j.f39798C.f39804d;
                            InterfaceC3858rh interfaceC3858rh3 = this.f40456v.f23734w;
                            W2.b e02 = interfaceC3858rh3 != null ? interfaceC3858rh3.e0() : null;
                            InterfaceC3858rh interfaceC3858rh4 = this.f40456v.f23734w;
                            String P8 = interfaceC3858rh4 != null ? interfaceC3858rh4.P() : null;
                            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40456v;
                            C5107a c5107a = adOverlayInfoParcel2.f23720F;
                            InterfaceC3858rh interfaceC3858rh5 = adOverlayInfoParcel2.f23734w;
                            window = window2;
                            i = 31;
                            InterfaceC3858rh g9 = C2837Wb.g(interfaceC3858rh5 != null ? interfaceC3858rh5.j() : null, e02, activity, null, new C2914a9(), null, null, null, null, null, null, null, P8, c5107a, true, z9);
                            z11 = z9;
                            this.f40457w = g9;
                            C2588Hh j03 = g9.j0();
                            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f40456v;
                            InterfaceC2769Sb interfaceC2769Sb = adOverlayInfoParcel3.f23723I;
                            InterfaceC3858rh interfaceC3858rh6 = adOverlayInfoParcel3.f23734w;
                            j03.l(null, interfaceC2769Sb, null, adOverlayInfoParcel3.f23735x, adOverlayInfoParcel3.f23716B, true, null, interfaceC3858rh6 != null ? interfaceC3858rh6.j0().f25395P : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                            this.f40457w.j0().f25412z = new InterfaceC2639Kh() { // from class: s2.g
                                @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
                                public final /* synthetic */ void k(String str, int i11, String str2, boolean z14) {
                                    InterfaceC3858rh interfaceC3858rh7 = BinderC4996d.this.f40457w;
                                    if (interfaceC3858rh7 != null) {
                                        interfaceC3858rh7.n0();
                                    }
                                }
                            };
                            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f40456v;
                            String str = adOverlayInfoParcel4.f23719E;
                            if (str != null) {
                                this.f40457w.loadUrl(str);
                            } else {
                                String str2 = adOverlayInfoParcel4.f23715A;
                                if (str2 == null) {
                                    throw new h("No URL or HTML to display in ad overlay.");
                                }
                                this.f40457w.loadDataWithBaseURL(adOverlayInfoParcel4.f23736y, str2, "text/html", "UTF-8", null);
                            }
                            InterfaceC3858rh interfaceC3858rh7 = this.f40456v.f23734w;
                            if (interfaceC3858rh7 != null) {
                                interfaceC3858rh7.q0(this);
                            }
                        } catch (Exception e6) {
                            u2.i.d("Error obtaining webview.", e6);
                            throw new h("Could not obtain webview for the overlay.", e6);
                        }
                    } else {
                        window = window2;
                        i = 31;
                        z11 = z9;
                        InterfaceC3858rh interfaceC3858rh8 = this.f40456v.f23734w;
                        this.f40457w = interfaceC3858rh8;
                        interfaceC3858rh8.A0(activity);
                    }
                    if (this.f40456v.f23729P) {
                        i4 = 0;
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f40457w.s(), false);
                        C3151ea c3151ea = AbstractC3368ia.f31827x1;
                        r rVar = r.f40116e;
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                            this.f40457w.s().setTextClassifier(TextClassifier.NO_OP);
                        }
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31836y1)).booleanValue()) {
                            this.f40457w.s().setDownloadListener(f.f40472n);
                        }
                    } else {
                        i4 = 0;
                    }
                    this.f40457w.p0(this);
                    interfaceC3858rh = this.f40456v.f23734w;
                    if (interfaceC3858rh != null) {
                        J3(this.f40442E, interfaceC3858rh.Z());
                    }
                    if (this.f40456v.f23718D != 5) {
                        ViewParent parent = this.f40457w.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(this.f40457w.b0());
                        }
                        if (this.f40441D) {
                            this.f40457w.P0();
                            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31762q1)).booleanValue() && Build.VERSION.SDK_INT >= i) {
                                window.setBackgroundBlurRadius(this.f40444G);
                            }
                        }
                        if (this.f40456v.f23729P) {
                            Toolbar toolbar = new Toolbar(activity);
                            this.f40452P = toolbar;
                            toolbar.setId(View.generateViewId());
                            this.f40457w.b0().setId(View.generateViewId());
                            this.f40452P.setBackgroundColor(-12303292);
                            this.f40452P.setVisibility(i4);
                            try {
                                this.f40452P.setNavigationIcon(p2.j.f39798C.f39808h.c().getDrawable(C5284R.drawable.admob_close_button_white_cross, null));
                            } catch (Resources.NotFoundException | NullPointerException e9) {
                                C.l("Error obtaining close icon.", e9);
                            }
                            this.f40452P.setNavigationOnClickListener(this.f40446I);
                            this.f40452P.setTitleMarginStart(i4);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(10);
                            this.f40442E.addView(this.f40452P, layoutParams);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(3, this.f40452P.getId());
                            layoutParams2.addRule(12);
                            this.f40442E.addView(this.f40457w.b0(), layoutParams2);
                            I3(this.f40452P);
                        } else {
                            this.f40442E.addView(this.f40457w.b0(), -1, -1);
                        }
                    }
                    if (!z8 && !this.f40443F) {
                        this.f40457w.n0();
                    }
                    adOverlayInfoParcel = this.f40456v;
                    if (adOverlayInfoParcel.f23718D != 5) {
                        K3(z11);
                        if (this.f40457w.i1()) {
                            L3(z11, true);
                            return;
                        }
                        return;
                    }
                    C2817Up c2817Up = new C2817Up(activity, this, adOverlayInfoParcel.J, adOverlayInfoParcel.f23724K);
                    if (adOverlayInfoParcel != null) {
                        try {
                            InterfaceC3101de interfaceC3101de = adOverlayInfoParcel.f23728O;
                            if (interfaceC3101de != null) {
                                interfaceC3101de.Q(new V2.b(c2817Up));
                                return;
                            }
                        } catch (RemoteException | h e10) {
                            throw new h(e10.getMessage(), e10);
                        }
                    }
                    throw new h("noioou");
                }
                z10 = false;
                StringBuilder sb3 = new StringBuilder(String.valueOf(z10).length() + 41);
                sb3.append("Delay onShow to next orientation change: ");
                sb3.append(z10);
                String sb22 = sb3.toString();
                int i102 = C.f40822b;
                u2.i.a(sb22);
                N3(this.f40456v.f23717C);
                window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
                u2.i.a("Hardware acceleration on the AdActivity window enabled.");
                activity.setContentView(this.f40442E);
                this.f40448L = true;
                if (this.f40441D) {
                }
                if (z8) {
                }
                if (this.f40456v.f23729P) {
                }
                this.f40457w.p0(this);
                interfaceC3858rh = this.f40456v.f23734w;
                if (interfaceC3858rh != null) {
                }
                if (this.f40456v.f23718D != 5) {
                }
                if (!z8) {
                    this.f40457w.n0();
                }
                adOverlayInfoParcel = this.f40456v;
                if (adOverlayInfoParcel.f23718D != 5) {
                }
            }
        }
        z9 = false;
        this.f40443F = false;
        if (z9) {
        }
        z10 = false;
        StringBuilder sb32 = new StringBuilder(String.valueOf(z10).length() + 41);
        sb32.append("Delay onShow to next orientation change: ");
        sb32.append(z10);
        String sb222 = sb32.toString();
        int i1022 = C.f40822b;
        u2.i.a(sb222);
        N3(this.f40456v.f23717C);
        window2.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
        u2.i.a("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.f40442E);
        this.f40448L = true;
        if (this.f40441D) {
        }
        if (z8) {
        }
        if (this.f40456v.f23729P) {
        }
        this.f40457w.p0(this);
        interfaceC3858rh = this.f40456v.f23734w;
        if (interfaceC3858rh != null) {
        }
        if (this.f40456v.f23718D != 5) {
        }
        if (!z8) {
        }
        adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel.f23718D != 5) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void c() {
        this.f40453Q = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void d1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f40455u;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
            try {
                adOverlayInfoParcel.f23728O.Z2(strArr, iArr, new V2.b(new C2817Up(activity, adOverlayInfoParcel.f23718D == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final boolean e() {
        this.f40453Q = 1;
        if (this.f40457w == null) {
            return true;
        }
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.ka)).booleanValue() && this.f40457w.canGoBack()) {
            this.f40457w.goBack();
            return false;
        }
        boolean g12 = this.f40457w.g1();
        if (!g12) {
            this.f40457w.a("onbackblocked", Collections.EMPTY_MAP);
        }
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void f() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f23733v) == null) {
            return;
        }
        lVar.K2();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void g1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f40440C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void h() {
        l lVar;
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31601Y5)).booleanValue()) {
            InterfaceC3858rh interfaceC3858rh = this.f40457w;
            if (interfaceC3858rh == null || interfaceC3858rh.r0()) {
                int i = C.f40822b;
                u2.i.f("The webview does not exist. Ignoring action.");
            } else {
                this.f40457w.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f23733v) == null) {
            return;
        }
        lVar.K1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void j() {
        int i;
        p2.f fVar;
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
            lVar.Y1();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40456v;
        boolean z8 = (adOverlayInfoParcel2 == null || (fVar = adOverlayInfoParcel2.f23722H) == null || !fVar.f39789z) ? false : true;
        Window window = this.f40455u.getWindow();
        C3151ea c3151ea = AbstractC3368ia.f31493M1;
        r rVar = r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z8 ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z8) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        C3151ea c3151ea2 = AbstractC3368ia.Se;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && (i = Build.VERSION.SDK_INT) <= 34 && i >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            com.bumptech.glide.g.R(window, false);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31601Y5)).booleanValue()) {
            return;
        }
        InterfaceC3858rh interfaceC3858rh = this.f40457w;
        if (interfaceC3858rh != null && !interfaceC3858rh.r0()) {
            this.f40457w.onResume();
        } else {
            int i4 = C.f40822b;
            u2.i.f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void k() {
        l lVar;
        x();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
            lVar.y1();
        }
        if (!((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31601Y5)).booleanValue() && this.f40457w != null && (!this.f40455u.isFinishing() || this.f40458x == null)) {
            this.f40457w.onPause();
        }
        G3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void l() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f23733v) == null) {
            return;
        }
        lVar.u0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void l1(int i, int i4, Intent intent) {
        C3165eo c3165eo;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            C3151ea c3151ea = AbstractC3368ia.De;
            r rVar = r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i4);
                C.k(sb.toString());
                InterfaceC3858rh interfaceC3858rh = this.f40457w;
                if (interfaceC3858rh == null || interfaceC3858rh.j0() == null || (c3165eo = interfaceC3858rh.j0().f25398S) == null || (adOverlayInfoParcel = this.f40456v) == null || !((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    return;
                }
                C2593Hm a9 = c3165eo.a();
                a9.r(NativeAdvancedJsUtils.f18064p, "hilca");
                String str = adOverlayInfoParcel.J;
                if (str == null) {
                    str = "";
                }
                a9.r("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length());
                sb2.append(i4);
                a9.r("hilr", sb2.toString());
                if (i4 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a9.r("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a9.r("hills", stringExtra2);
                    }
                }
                a9.v();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: h -> 0x003c, TryCatch #0 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[Catch: h -> 0x003c, TryCatch #0 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f A[Catch: h -> 0x003c, TryCatch #0 {h -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r3(Bundle bundle) {
        Activity activity;
        AdOverlayInfoParcel a9;
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        l lVar;
        switch (this.f40454R) {
            case 4:
                C.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f40453Q = 4;
                this.f40455u.finish();
                return;
            default:
                if (!this.f40448L) {
                    this.f40455u.requestWindowFeature(1);
                }
                this.f40440C = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    activity = this.f40455u;
                    a9 = AdOverlayInfoParcel.a(activity.getIntent());
                    this.f40456v = a9;
                } catch (h e6) {
                    String message = e6.getMessage();
                    int i4 = C.f40822b;
                    u2.i.f(message);
                    this.f40453Q = 4;
                    this.f40455u.finish();
                    return;
                }
                if (a9 == null) {
                    throw new h("Could not get info for ad overlay.");
                }
                if (a9.f23729P) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        activity.setShowWhenLocked(true);
                    } else {
                        activity.getWindow().addFlags(524288);
                    }
                }
                if (this.f40456v.f23720F.f41219v > 7500000) {
                    this.f40453Q = 4;
                }
                if (activity.getIntent() != null) {
                    this.f40451O = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f40456v;
                p2.f fVar = adOverlayInfoParcel2.f23722H;
                if (fVar != null) {
                    boolean z8 = fVar.f39783n;
                    this.f40441D = z8;
                    this.f40444G = (int) fVar.f39787x;
                    if (z8) {
                        if (adOverlayInfoParcel2.f23718D != 5 && fVar.f39788y != -1) {
                            new C2858Xf(this).l();
                        }
                    }
                    if (bundle == null) {
                        if (this.f40451O) {
                            C4293zk c4293zk = this.f40456v.f23726M;
                            if (c4293zk != null) {
                                synchronized (c4293zk) {
                                    ScheduledFuture scheduledFuture = c4293zk.f35600w;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            l lVar2 = this.f40456v.f23733v;
                            if (lVar2 != null) {
                                lVar2.g();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel3 = this.f40456v;
                        if (adOverlayInfoParcel3.f23718D != 1) {
                            InterfaceC4877a interfaceC4877a = adOverlayInfoParcel3.f23732u;
                            if (interfaceC4877a != null) {
                                interfaceC4877a.onAdClicked();
                            }
                            InterfaceC2524Dl interfaceC2524Dl = this.f40456v.f23727N;
                            if (interfaceC2524Dl != null) {
                                interfaceC2524Dl.C();
                            }
                        }
                    }
                    adOverlayInfoParcel = this.f40456v;
                    if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
                        lVar.o1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f40456v;
                    i iVar = new i(activity, adOverlayInfoParcel4.f23721G, adOverlayInfoParcel4.f23720F.f41217n, adOverlayInfoParcel4.f23725L);
                    this.f40442E = iVar;
                    iVar.setId(1000);
                    p2.j.f39798C.f39806f.D(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.f40456v;
                    i = adOverlayInfoParcel5.f23718D;
                    if (i == 1) {
                        O3(false);
                        return;
                    }
                    if (i == 2) {
                        this.f40458x = new n(adOverlayInfoParcel5.f23734w);
                        O3(false);
                        return;
                    } else if (i == 3) {
                        O3(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new h("Could not determine ad overlay type.");
                        }
                        O3(false);
                        return;
                    }
                }
                if (adOverlayInfoParcel2.f23718D == 5) {
                    this.f40441D = true;
                    if (adOverlayInfoParcel2.f23718D != 5) {
                        new C2858Xf(this).l();
                    }
                    if (bundle == null) {
                    }
                    adOverlayInfoParcel = this.f40456v;
                    if (adOverlayInfoParcel != null) {
                        lVar.o1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.f40456v;
                    i iVar2 = new i(activity, adOverlayInfoParcel42.f23721G, adOverlayInfoParcel42.f23720F.f41217n, adOverlayInfoParcel42.f23725L);
                    this.f40442E = iVar2;
                    iVar2.setId(1000);
                    p2.j.f39798C.f39806f.D(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel52 = this.f40456v;
                    i = adOverlayInfoParcel52.f23718D;
                    if (i == 1) {
                    }
                } else {
                    this.f40441D = false;
                    if (bundle == null) {
                    }
                    adOverlayInfoParcel = this.f40456v;
                    if (adOverlayInfoParcel != null) {
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.f40456v;
                    i iVar22 = new i(activity, adOverlayInfoParcel422.f23721G, adOverlayInfoParcel422.f23720F.f41217n, adOverlayInfoParcel422.f23725L);
                    this.f40442E = iVar22;
                    iVar22.setId(1000);
                    p2.j.f39798C.f39806f.D(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel522 = this.f40456v;
                    i = adOverlayInfoParcel522.f23718D;
                    if (i == 1) {
                    }
                }
                String message2 = e6.getMessage();
                int i42 = C.f40822b;
                u2.i.f(message2);
                this.f40453Q = 4;
                this.f40455u.finish();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void w() {
        this.f40448L = true;
    }

    public final void x() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel != null && this.f40460z) {
            N3(adOverlayInfoParcel.f23717C);
        }
        if (this.f40438A != null) {
            this.f40455u.setContentView(this.f40442E);
            this.f40448L = true;
            this.f40438A.removeAllViews();
            this.f40438A = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f40439B;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f40439B = null;
        }
        this.f40460z = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void y() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f23733v) != null) {
            lVar.f1();
        }
        InterfaceC3858rh interfaceC3858rh = this.f40457w;
        if (interfaceC3858rh != null) {
            try {
                this.f40442E.removeView(interfaceC3858rh.b0());
            } catch (NullPointerException unused) {
            }
        }
        G3();
    }

    public final void z() {
        this.f40453Q = 3;
        Activity activity = this.f40455u;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f40456v;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f23718D != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        InterfaceC3858rh interfaceC3858rh = this.f40457w;
        if (interfaceC3858rh != null) {
            interfaceC3858rh.p0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void F(V2.a aVar) {
    }
}
