package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ya extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ m32 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(m32 m32Var, int i) {
        super(1);
        this.m = i;
        this.n = m32Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        m32 m32Var = this.n;
        switch (i) {
            case 0:
                t81 j = ((t81) obj).j();
                j.getClass();
                m32Var.l(j);
                break;
            case 1:
                m32Var.m15setPopupContentSizefhxjrPA(new x31(((x31) obj).a));
                m32Var.m();
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = m32Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = m32Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new n4(2, function0));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
