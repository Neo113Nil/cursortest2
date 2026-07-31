package d4;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
final class y extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Bundle f15743j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Activity f15744k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ f0 f15745l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(f0 f0Var, Bundle bundle, Activity activity) {
        super(f0Var.f15667f, true);
        this.f15745l = f0Var;
        this.f15743j = bundle;
        this.f15744k = activity;
    }

    @Override // d4.x
    final void a() {
        Bundle bundle;
        p0 p0Var;
        if (this.f15743j != null) {
            bundle = new Bundle();
            if (this.f15743j.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f15743j.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        p0Var = this.f15745l.f15667f.f15679i;
        ((p0) r3.o.i(p0Var)).P5(x3.b.B3(this.f15744k), bundle, this.f15740g);
    }
}
