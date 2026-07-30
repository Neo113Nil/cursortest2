package d;

import I.C0117m;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.S;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i2) {
        super(0);
        this.f4588d = i2;
        this.f4589e = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar;
        switch (this.f4588d) {
            case 0:
                o oVar = this.f4589e;
                return new S(oVar.getApplication(), oVar, oVar.getIntent() != null ? oVar.getIntent().getExtras() : null);
            case 1:
                this.f4589e.reportFullyDrawn();
                return Unit.f6114a;
            case 2:
                o oVar2 = this.f4589e;
                jVar = oVar2.reportFullyDrawnExecutor;
                return new q(jVar, new n(oVar2, 1));
            default:
                o oVar3 = this.f4589e;
                C0349A c0349a = new C0349A(new d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        oVar3.getLifecycle().a(new C0117m(c0349a, 1, oVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new A.j(oVar3, 20, c0349a));
                    }
                }
                return c0349a;
        }
    }
}
