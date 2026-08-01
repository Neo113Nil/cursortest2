package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f3214e;

    public /* synthetic */ c(k kVar, int i3) {
        this.f3213d = i3;
        this.f3214e = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3213d) {
            case 0:
                this.f3214e.reportFullyDrawn();
                return Unit.f5554a;
            case 1:
                k kVar = this.f3214e;
                return new w(kVar.f3247t, new c(kVar, 0));
            case 2:
                s4.a aVar = new s4.a();
                this.f3214e.c().b(aVar);
                return aVar;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                k kVar2 = this.f3214e;
                return new r0(kVar2.getApplication(), kVar2, kVar2.getIntent() != null ? kVar2.getIntent().getExtras() : null);
            default:
                k kVar3 = this.f3214e;
                c0 c0Var = new c0(new b(kVar3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        kVar3.f3790d.a(new d(c0Var, kVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a6.f(4, kVar3, c0Var));
                    }
                }
                return c0Var;
        }
    }
}
