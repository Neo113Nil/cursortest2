package A;

import Z.C0310g;
import Z.C0316m;
import Z.C0317n;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: A.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013i extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f153e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f154i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013i(long j4, Function0 function0, boolean z4) {
        super(1);
        this.f152d = j4;
        this.f153e = function0;
        this.f154i = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        W.c cVar = (W.c) obj;
        C0310g t4 = M1.a.t(cVar, Y.f.d(cVar.f4193d.h()) / 2.0f);
        int i2 = Build.VERSION.SDK_INT;
        long j4 = this.f152d;
        return cVar.a(new C0012h(this.f153e, this.f154i, t4, new C0316m(j4, 5, i2 >= 29 ? C0317n.f4537a.a(j4, 5) : new PorterDuffColorFilter(Z.K.D(j4), Z.K.G(5)))));
    }
}
