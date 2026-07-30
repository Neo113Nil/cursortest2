package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m5.C4782a;
import p2.C4856a;
import q2.C4907p;
import q2.InterfaceC4877a;
import s2.C4997e;
import s2.InterfaceC4993a;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3370ic implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final C4856a f31853n;

    /* renamed from: u, reason: collision with root package name */
    public final C3165eo f31854u;

    /* renamed from: w, reason: collision with root package name */
    public final C2839Wd f31856w;

    /* renamed from: x, reason: collision with root package name */
    public final C2834Vp f31857x;

    /* renamed from: y, reason: collision with root package name */
    public final C2657Li f31858y;

    /* renamed from: z, reason: collision with root package name */
    public final C3484kk f31859z;

    /* renamed from: v, reason: collision with root package name */
    public u2.l f31855v = null;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4993a f31851A = null;

    /* renamed from: B, reason: collision with root package name */
    public final C3157eg f31852B = AbstractC3212fg.f30745h;

    public C3370ic(C4856a c4856a, C2839Wd c2839Wd, C2834Vp c2834Vp, C3165eo c3165eo, C2657Li c2657Li, C3484kk c3484kk) {
        this.f31853n = c4856a;
        this.f31856w = c2839Wd;
        this.f31857x = c2834Vp;
        this.f31854u = c3165eo;
        this.f31858y = c2657Li;
        this.f31859z = c3484kk;
    }

    public static int a(Map map) {
        String str = (String) map.get(C4782a.PUSH_MINIFIED_BUTTONS_LIST);
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, C3348i7 c3348i7, Uri uri, View view, Activity activity, C3280gu c3280gu) {
        if (c3348i7 != null) {
            try {
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vd)).booleanValue() || c3280gu == null) {
                    if (c3348i7.c(uri)) {
                        return c3348i7.b(uri, context, view, activity);
                    }
                } else if (c3348i7.c(uri)) {
                    return c3280gu.a(uri, context, view, activity);
                }
            } catch (C3400j7 unused) {
            } catch (Exception e6) {
                p2.j.f39798C.f39808h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e6);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e6) {
            String valueOf = String.valueOf(uri.toString());
            int i = t2.C.f40822b;
            u2.i.d("Error adding click uptime parameter to url: ".concat(valueOf), e6);
        }
        return uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.J9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.E9)).booleanValue() : ((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.D9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(InterfaceC4877a interfaceC4877a, Context context, String str, String str2) {
        Context context2;
        String str3;
        InterfaceC3101de interfaceC3101de;
        C3640ne c3640ne;
        u2.g gVar;
        C2834Vp c2834Vp = this.f31857x;
        C3165eo c3165eo = this.f31854u;
        if (c3165eo != null) {
            int i = BinderC2949aq.f29329A;
            context2 = context;
            str3 = str2;
            BinderC2949aq.H3(context2, c3165eo, c2834Vp, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        p2.j jVar = p2.j.f39798C;
        if (jVar.f39808h.i(context2)) {
            if (this.f31855v == null) {
                this.f31855v = new u2.l(context2.getApplicationContext(), null);
            }
            u2.l lVar = this.f31855v;
            c2834Vp.getClass();
            c2834Vp.a(new C4017ue(c2834Vp, lVar, str3, 13));
            return false;
        }
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) interfaceC4877a;
        Ut J = interfaceC3858rh.J();
        boolean z8 = (J == null || (gVar = J.f28186y0) == null || gVar.f41238c) ? false : true;
        boolean z9 = (J == null || (c3640ne = J.f28146d0) == null || !c3640ne.f32869a || c3640ne.f32870b == null || !c3640ne.f32871c) ? false : true;
        if (!z8) {
            if (z9) {
            }
            t2.u b9 = t2.G.b(context2);
            boolean a9 = D.I.a(new D.N(context2).f516b);
            boolean B8 = jVar.f39806f.B(context2);
            boolean z10 = interfaceC3858rh.e0().b() && interfaceC3858rh.h() == null;
            if (!a9) {
                if (!D.I.a(new D.N(context2).f516b)) {
                }
                e(context2, str3, "notifications_disabled");
                return false;
            }
            if (B8) {
                e(context2, str3, "notification_channel_disabled");
                return false;
            }
            if (b9 == null) {
                e(context2, str3, "work_manager_unavailable");
                return false;
            }
            if (z10) {
                e(context2, str3, "ad_no_activity");
                return false;
            }
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.B9)).booleanValue()) {
                e(context2, str3, "notification_flow_disabled");
                return false;
            }
            if (interfaceC3858rh.w0() == null || interfaceC3858rh.h() == null) {
                interfaceC3858rh.i0(str3, str);
            } else {
                Activity h9 = interfaceC3858rh.h();
                if (h9 == null) {
                    throw new NullPointerException("Null activity");
                }
                C2817Up c2817Up = new C2817Up(h9, null, str3, str);
                try {
                    AdOverlayInfoParcel adOverlayInfoParcel = interfaceC3858rh.w0().f40456v;
                    if (adOverlayInfoParcel == null || (interfaceC3101de = adOverlayInfoParcel.f23728O) == null) {
                        throw new s2.h("noioou");
                    }
                    interfaceC3101de.Q(new V2.b(c2817Up));
                } catch (Exception e6) {
                    e(context2, str3, e6.getMessage());
                    return false;
                }
            }
            interfaceC4877a.onAdClicked();
            return true;
        }
        if (c3165eo != null) {
            int i4 = BinderC2949aq.f29329A;
            BinderC2949aq.H3(context2, c3165eo, c2834Vp, str3, "onfs", new HashMap());
        }
        return false;
    }

    public final void e(Context context, String str, String str2) {
        C2834Vp c2834Vp = this.f31857x;
        c2834Vp.g(str);
        C3165eo c3165eo = this.f31854u;
        if (c3165eo != null) {
            AbstractC2720Pd.i("dialog_not_shown_reason", str2);
            BinderC2949aq.H3(context, c3165eo, c2834Vp, str, "dialog_not_shown", C3944tC.e(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC3217fl.D(r13, new java.util.ArrayList(), r6) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(InterfaceC4877a interfaceC4877a, Map map, boolean z8, String str, boolean z9, boolean z10) {
        boolean z11;
        Uri build;
        Intent intent;
        ResolveInfo D8;
        Intent intent2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo D9;
        h(true);
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) interfaceC4877a;
        Context context = interfaceC3858rh.getContext();
        C3348i7 S02 = interfaceC3858rh.S0();
        View b02 = interfaceC3858rh.b0();
        C3280gu W02 = interfaceC3858rh.W0();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intent2 = null;
        } else {
            Uri c4 = c(b(context, S02, Uri.parse(str2), b02, null, W02));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31812v5)).booleanValue()) {
                    z11 = false;
                    build = !"http".equalsIgnoreCase(c4.getScheme()) ? c4.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(c4.getScheme()) ? c4.buildUpon().scheme("http").build() : null;
                    ArrayList arrayList = new ArrayList();
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.addFlags(268435456);
                    intent3.setData(c4);
                    intent3.setAction("android.intent.action.VIEW");
                    if (build != null) {
                        intent = null;
                    } else {
                        Intent intent4 = new Intent("android.intent.action.VIEW");
                        intent4.addFlags(268435456);
                        intent4.setData(build);
                        intent4.setAction("android.intent.action.VIEW");
                        intent = intent4;
                    }
                    if (z11) {
                        t2.G g9 = p2.j.f39798C.f39803c;
                        t2.G.L(context, intent3);
                        t2.G.L(context, intent);
                    }
                    D8 = AbstractC3217fl.D(intent3, arrayList, context);
                    if (D8 == null) {
                        intent2 = AbstractC3217fl.K(intent3, D8);
                    } else {
                        if (intent != null && (D9 = AbstractC3217fl.D(intent, new ArrayList(), context)) != null) {
                            intent2 = AbstractC3217fl.K(intent3, D9);
                        }
                        if (!arrayList.isEmpty()) {
                            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                                int size = arrayList.size();
                                int i = 0;
                                loop0: while (i < size) {
                                    ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                    do {
                                        int i4 = i + 1;
                                        if (it.hasNext()) {
                                        }
                                    } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                    intent2 = AbstractC3217fl.K(intent3, resolveInfo);
                                    break loop0;
                                }
                            }
                            if (parseBoolean) {
                                intent2 = AbstractC3217fl.K(intent3, (ResolveInfo) arrayList.get(0));
                            }
                        }
                        intent2 = intent3;
                    }
                }
            }
            z11 = true;
            if (!"http".equalsIgnoreCase(c4.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent intent32 = new Intent("android.intent.action.VIEW");
            intent32.addFlags(268435456);
            intent32.setData(c4);
            intent32.setAction("android.intent.action.VIEW");
            if (build != null) {
            }
            if (z11) {
            }
            D8 = AbstractC3217fl.D(intent32, arrayList2, context);
            if (D8 == null) {
            }
        }
        if (!z8 || this.f31857x == null || intent2 == null || !d(interfaceC4877a, interfaceC3858rh.getContext(), intent2.getData().toString(), str)) {
            try {
                ((InterfaceC3858rh) interfaceC4877a).V0(new C4997e(intent2, this.f31851A), z9, z10, str);
            } catch (ActivityNotFoundException e6) {
                String message = e6.getMessage();
                int i9 = t2.C.f40822b;
                u2.i.f(message);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        C2657Li c2657Li;
        InterfaceC4877a interfaceC4877a = (InterfaceC4877a) obj;
        String str = (String) map.get("u");
        HashMap hashMap = new HashMap();
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) interfaceC4877a;
        if (interfaceC3858rh.J() != null) {
            hashMap = interfaceC3858rh.J().f28182w0;
        }
        String g9 = AbstractC3035cL.g(str, interfaceC3858rh.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = t2.C.f40822b;
            u2.i.f("Action missing from an open GMSG.");
            return;
        }
        C4856a c4856a = this.f31853n;
        if (c4856a != null && !c4856a.a()) {
            c4856a.b(g9);
        } else {
            J3.a a9 = (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vb)).booleanValue() && (c2657Li = this.f31858y) != null && C2657Li.b(g9)) ? c2657Li.a(g9, C4907p.f40108g.f40113e) : C3686oN.c(g9);
            a9.c(new MD(0, a9, new C2518Df(this, map, interfaceC4877a, str2)), this.f31852B);
        }
    }

    public final void h(boolean z8) {
        C2839Wd c2839Wd = this.f31856w;
        if (c2839Wd != null) {
            c2839Wd.x(z8);
        }
    }

    public final void i(int i) {
        C3165eo c3165eo;
        String str;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31840y5)).booleanValue() || (c3165eo = this.f31854u) == null) {
            return;
        }
        C2593Hm a9 = c3165eo.a();
        a9.r(NativeAdvancedJsUtils.f18064p, "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        a9.r("cct_open_status", str);
        a9.s();
    }
}
