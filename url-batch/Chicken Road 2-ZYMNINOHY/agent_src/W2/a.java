package W2;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3464b;

    public /* synthetic */ a(r rVar, int i4) {
        this.f3463a = i4;
        this.f3464b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.f3463a) {
            case 0:
                return r.b(this.f3464b, (LocationManager) obj);
            default:
                return r.a(this.f3464b, (LocationManager) obj);
        }
    }
}
