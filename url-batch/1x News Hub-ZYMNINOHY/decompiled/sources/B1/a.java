package B1;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f167b;

    public /* synthetic */ a(r rVar, int i3) {
        this.f166a = i3;
        this.f167b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.f166a) {
            case 0:
                return r.b(this.f167b, (LocationManager) obj);
            default:
                return r.a(this.f167b, (LocationManager) obj);
        }
    }
}
