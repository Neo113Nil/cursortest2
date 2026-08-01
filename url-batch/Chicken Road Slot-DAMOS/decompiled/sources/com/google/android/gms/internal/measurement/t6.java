package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2811s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2812t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2813u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2814v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(c7 c7Var, Activity activity, a6 a6Var) {
        super(c7Var.f2191d, true);
        this.f2811s = 3;
        this.f2813u = activity;
        this.f2814v = a6Var;
        this.f2812t = c7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:19|20|(1:22)|23|24|(12:64|65|66|27|(1:63)(1:31)|32|33|34|(1:36)(1:59)|37|38|(1:40)(7:42|(1:57)(1:45)|46|47|(1:49)(1:56)|50|(1:52)(1:54)))|26|27|(1:29)|63|32|33|34|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
    
        r7.b(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[Catch: Exception -> 0x0091, a -> 0x00c4, TRY_ENTER, TryCatch #0 {a -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:59:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e9, B:46:0x0102, B:52:0x0127, B:54:0x013d, B:59:0x00c6, B:62:0x00d7, B:65:0x00a1), top: B:19:0x0076, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e9, B:46:0x0102, B:52:0x0127, B:54:0x013d, B:59:0x00c6, B:62:0x00d7, B:65:0x00a1), top: B:19:0x0076, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6 A[Catch: Exception -> 0x0091, a -> 0x00c4, TryCatch #0 {a -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:59:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    @Override // com.google.android.gms.internal.measurement.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        d7 d7Var;
        Bundle bundle;
        switch (this.f2811s) {
            case 0:
                try {
                    Context context = (Context) this.f2813u;
                    c7.c0.g(context);
                    String a9 = s7.d2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(a9)) {
                        a9 = s7.d2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", a9);
                    d6 d6Var = null;
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        d7Var = (d7) this.f2812t;
                        boolean z10 = (valueOf == null && valueOf.booleanValue()) ? false : true;
                        d7Var.getClass();
                        d6Var = c6.asInterface(k7.c.c(context, !z10 ? k7.c.f5486c : k7.c.f5485b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        d7Var.f2229e = d6Var;
                        if (d7Var.f2229e == null) {
                            int a10 = k7.c.a(context, ModuleDescriptor.MODULE_ID);
                            int d10 = k7.c.d(ModuleDescriptor.MODULE_ID, false, context);
                            int max = Math.max(a10, d10);
                            boolean z11 = Boolean.TRUE.equals(valueOf) || d10 < a10;
                            long j = max;
                            d7Var.f2230f = j;
                            n6 n6Var = new n6(161000L, j, z11, (Bundle) this.f2814v, s7.d2.a(context));
                            boolean z12 = d7Var.f2230f >= 169;
                            d6 d6Var2 = d7Var.f2229e;
                            if (!z12) {
                                c7.c0.g(d6Var2);
                                d6Var2.initialize(new j7.b(context), n6Var, this.f2137d);
                                break;
                            } else {
                                c7.c0.g(d6Var2);
                                d6Var2.initializeWithElapsedTime(new j7.b(context), n6Var, this.f2137d, this.f2138e);
                                break;
                            }
                        } else {
                            Log.w("FA", "Failed to connect to measurement client.");
                            break;
                        }
                    }
                    valueOf = null;
                    d7Var = (d7) this.f2812t;
                    if (valueOf == null) {
                    }
                    d7Var.getClass();
                    d6Var = c6.asInterface(k7.c.c(context, !z10 ? k7.c.f5486c : k7.c.f5485b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    d7Var.f2229e = d6Var;
                    if (d7Var.f2229e == null) {
                    }
                } catch (Exception e2) {
                    ((d7) this.f2812t).b(e2, true, false);
                    return;
                }
            case 1:
                d6 d6Var3 = ((d7) this.f2812t).f2229e;
                c7.c0.g(d6Var3);
                d6Var3.getMaxUserProperties((String) this.f2813u, (a6) this.f2814v);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f2814v;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                d6 d6Var4 = ((c7) this.f2812t).f2191d.f2229e;
                c7.c0.g(d6Var4);
                d6Var4.onActivityCreatedByScionActivityInfo(p6.b((Activity) this.f2813u), bundle, this.f2138e);
                break;
            default:
                d6 d6Var5 = ((c7) this.f2812t).f2191d.f2229e;
                c7.c0.g(d6Var5);
                d6Var5.onActivitySaveInstanceStateByScionActivityInfo(p6.b((Activity) this.f2813u), (a6) this.f2814v, this.f2138e);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public void b() {
        switch (this.f2811s) {
            case 1:
                ((a6) this.f2814v).j(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(d7 d7Var, Object obj, Object obj2, int i3) {
        super(d7Var, true);
        this.f2811s = i3;
        this.f2813u = obj;
        this.f2814v = obj2;
        this.f2812t = d7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(c7 c7Var, Bundle bundle, Activity activity) {
        super(c7Var.f2191d, true);
        this.f2811s = 2;
        this.f2814v = bundle;
        this.f2813u = activity;
        this.f2812t = c7Var;
    }
}
