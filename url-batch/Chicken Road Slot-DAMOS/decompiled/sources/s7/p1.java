package s7;

import com.google.android.gms.internal.measurement.cf;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f6 f8912e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f8913i;

    public /* synthetic */ p1(AppMeasurementDynamiteService appMeasurementDynamiteService, f6 f6Var, int i3) {
        this.f8911d = i3;
        this.f8912e = f6Var;
        this.f8913i = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8911d) {
            case 0:
                l3 o6 = this.f8913i.f3062d.o();
                f6 f6Var = this.f8912e;
                o6.s();
                o6.t();
                o6.G(new cf((Object) o6, (d7.a) o6.I(false), (Object) f6Var, 10));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f8913i;
                p4 p4Var = appMeasurementDynamiteService.f3062d.f8940w;
                q1.j(p4Var);
                q1 q1Var = appMeasurementDynamiteService.f3062d;
                p4Var.j0(this.f8912e, q1Var.M != null && q1Var.M.booleanValue());
                break;
        }
    }
}
