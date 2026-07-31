package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.T;
import h1.C0438i;

/* loaded from: classes.dex */
public final class n extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i3) {
        super(0);
        this.f4175e = i3;
        this.f4176f = oVar;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f4175e) {
            case 0:
                o oVar = this.f4176f;
                return new T(oVar.getApplication(), oVar, oVar.getIntent() != null ? oVar.getIntent().getExtras() : null);
            case 1:
                this.f4176f.reportFullyDrawn();
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                o oVar2 = this.f4176f;
                return new v(oVar2.f4182i, new n(oVar2, 1));
            default:
                o oVar3 = this.f4176f;
                F f3 = new F(new E.u(4, oVar3));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Z1.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        oVar3.getClass();
                        oVar3.f3274d.a(new C0246f(f3, oVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new D1.j(oVar3, 3, f3));
                    }
                }
                return f3;
        }
    }
}
