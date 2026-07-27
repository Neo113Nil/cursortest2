package w;

import D.Q1;
import Z.C0310g;
import Z.C0316m;
import Z.C0317n;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262b extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1262b(long j4, int i2) {
        super(1);
        this.f11135d = i2;
        this.f11136e = j4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11135d) {
            case 0:
                W.c cVar = (W.c) obj;
                float d4 = Y.f.d(cVar.f4193d.h()) / 2.0f;
                C0310g t4 = M1.a.t(cVar, d4);
                int i2 = Build.VERSION.SDK_INT;
                long j4 = this.f11136e;
                return cVar.a(new Q1(d4, t4, new C0316m(j4, 5, i2 >= 29 ? C0317n.f4537a.a(j4, 5) : new PorterDuffColorFilter(Z.K.D(j4), Z.K.G(5)))));
            default:
                ((y0.i) obj).s(A.G.f23c, new A.F(EnumC1256E.f11019d, this.f11136e, 2, true));
                return Unit.f7487a;
        }
    }
}
