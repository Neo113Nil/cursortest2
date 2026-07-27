package P0;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;

/* loaded from: classes.dex */
public final class l extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f3744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(B b4, int i2) {
        super(1);
        this.f3743d = i2;
        this.f3744e = b4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3743d) {
            case 0:
                InterfaceC0980p x2 = ((InterfaceC0980p) obj).x();
                Intrinsics.c(x2);
                this.f3744e.k(x2);
                break;
            case 1:
                M0.j jVar = new M0.j(((M0.j) obj).f3554a);
                B b4 = this.f3744e;
                b4.m1setPopupContentSizefhxjrPA(jVar);
                b4.l();
                break;
            default:
                Function0 function0 = (Function0) obj;
                B b5 = this.f3744e;
                Handler handler = b5.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = b5.getHandler();
                    if (handler2 != null) {
                        handler2.post(new z(function0, 0));
                    }
                }
                break;
        }
        return Unit.f7487a;
    }
}
