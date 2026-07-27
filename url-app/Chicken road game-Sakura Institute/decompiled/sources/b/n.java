package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.P;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i2) {
        super(0);
        this.f5558d = i2;
        this.f5559e = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5558d) {
            case 0:
                o oVar = this.f5559e;
                return new P(oVar.getApplication(), oVar, oVar.getIntent() != null ? oVar.getIntent().getExtras() : null);
            case 1:
                this.f5559e.reportFullyDrawn();
                return Unit.f7487a;
            case 2:
                o oVar2 = this.f5559e;
                return new u(oVar2.f5566l, new n(oVar2, 1));
            default:
                o oVar3 = this.f5559e;
                D d4 = new D(new RunnableC0489d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        oVar3.getClass();
                        oVar3.f5561d.a(new C0492g(d4, oVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B1.o(oVar3, 6, d4));
                    }
                }
                return d4;
        }
    }
}
