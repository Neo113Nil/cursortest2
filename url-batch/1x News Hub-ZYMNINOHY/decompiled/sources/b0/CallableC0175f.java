package b0;

import io.appmetrica.analytics.impl.C0918w0;
import io.appmetrica.analytics.impl.U;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0175f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2528b;

    public /* synthetic */ CallableC0175f(int i3, Object obj) {
        this.f2527a = i3;
        this.f2528b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2527a) {
            case 0:
                return new C0176g((JsReplyProxyBoundaryInterface) this.f2528b);
            case 1:
                return U.e((U) this.f2528b);
            default:
                return ((C0918w0) this.f2528b).p();
        }
    }
}
