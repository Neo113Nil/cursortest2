package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hf3 extends uf3 {
    public final /* synthetic */ int q = 4;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(cg3 cg3Var, Activity activity, ee3 ee3Var) {
        super((dg3) cg3Var.n, true);
        this.s = activity;
        this.t = ee3Var;
        this.r = cg3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:20|21|(1:23)|24|(12:55|56|57|27|(1:54)(1:31)|32|33|34|(1:36)(1:50)|37|38|(1:40)(3:42|(1:48)(1:45)|46))|26|27|(1:29)|54|32|33|34|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        r7.d(r0, true, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7 A[Catch: Exception -> 0x00b8, ve0 -> 0x00ea, TRY_ENTER, TryCatch #2 {ve0 -> 0x00ea, blocks: (B:36:0x00e7, B:37:0x00ee, B:50:0x00ec), top: B:34:0x00e5, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106 A[Catch: Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:21:0x009d, B:23:0x00b3, B:24:0x00bb, B:27:0x00d0, B:29:0x00d7, B:32:0x00e0, B:36:0x00e7, B:37:0x00ee, B:38:0x0100, B:40:0x0106, B:42:0x010e, B:46:0x0127, B:50:0x00ec, B:53:0x00fd, B:56:0x00c7), top: B:20:0x009d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e A[Catch: Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:21:0x009d, B:23:0x00b3, B:24:0x00bb, B:27:0x00d0, B:29:0x00d7, B:32:0x00e0, B:36:0x00e7, B:37:0x00ee, B:38:0x0100, B:40:0x0106, B:42:0x010e, B:46:0x0127, B:50:0x00ec, B:53:0x00fd, B:56:0x00c7), top: B:20:0x009d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[Catch: Exception -> 0x00b8, ve0 -> 0x00ea, TryCatch #2 {ve0 -> 0x00ea, blocks: (B:36:0x00e7, B:37:0x00ee, B:50:0x00ec), top: B:34:0x00e5, outer: #1 }] */
    @Override // defpackage.uf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        dg3 dg3Var;
        Bundle bundle = null;
        he3 he3Var = null;
        switch (this.q) {
            case 0:
                try {
                    Context context = (Context) this.s;
                    ll3.v(context);
                    String h = gk2.h(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(h)) {
                        h = gk2.h(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", h);
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        dg3Var = (dg3) this.r;
                        Object[] objArr = (valueOf == null && valueOf.booleanValue()) ? false : true;
                        dg3Var.getClass();
                        he3Var = ge3.asInterface(ye0.c(context, objArr == false ? ye0.c : ye0.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        dg3Var.f = he3Var;
                        if (dg3Var.f == null) {
                            int a = ye0.a(context, ModuleDescriptor.MODULE_ID);
                            ye3 ye3Var = new ye3(133005L, Math.max(a, r2), Boolean.TRUE.equals(valueOf) || ye0.d(context, ModuleDescriptor.MODULE_ID, false) < a, (Bundle) this.t, gk2.h(context));
                            he3 he3Var2 = dg3Var.f;
                            ll3.v(he3Var2);
                            he3Var2.initialize(new st1(context), ye3Var, this.m);
                            break;
                        } else {
                            Log.w("FA", "Failed to connect to measurement client.");
                            break;
                        }
                    }
                    valueOf = null;
                    dg3Var = (dg3) this.r;
                    if (valueOf == null) {
                    }
                    dg3Var.getClass();
                    he3Var = ge3.asInterface(ye0.c(context, objArr == false ? ye0.c : ye0.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    dg3Var.f = he3Var;
                    if (dg3Var.f == null) {
                    }
                } catch (Exception e) {
                    ((dg3) this.r).d(e, true, false);
                    return;
                }
            case 1:
                he3 he3Var3 = ((dg3) this.r).f;
                ll3.v(he3Var3);
                he3Var3.logHealthData(5, (String) this.s, new st1(this.t), new st1(null), new st1(null));
                break;
            case 2:
                he3 he3Var4 = ((dg3) this.r).f;
                ll3.v(he3Var4);
                he3Var4.getMaxUserProperties((String) this.s, (ee3) this.t);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.t;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                he3 he3Var5 = ((dg3) ((cg3) this.r).n).f;
                ll3.v(he3Var5);
                he3Var5.onActivityCreatedByScionActivityInfo(ze3.a((Activity) this.s), bundle, this.n);
                break;
            default:
                he3 he3Var6 = ((dg3) ((cg3) this.r).n).f;
                ll3.v(he3Var6);
                he3Var6.onActivitySaveInstanceStateByScionActivityInfo(ze3.a((Activity) this.s), (ee3) this.t, this.n);
                break;
        }
    }

    @Override // defpackage.uf3
    public void b() {
        switch (this.q) {
            case 2:
                ((ee3) this.t).m(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(cg3 cg3Var, Bundle bundle, Activity activity) {
        super((dg3) cg3Var.n, true);
        this.t = bundle;
        this.s = activity;
        this.r = cg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(dg3 dg3Var, Context context, Bundle bundle) {
        super(dg3Var, true);
        this.s = context;
        this.t = bundle;
        this.r = dg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(dg3 dg3Var, String str, Object obj) {
        super(dg3Var, false);
        this.s = str;
        this.t = obj;
        this.r = dg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(dg3 dg3Var, String str, ee3 ee3Var) {
        super(dg3Var, true);
        this.s = str;
        this.t = ee3Var;
        Objects.requireNonNull(dg3Var);
        this.r = dg3Var;
    }
}
