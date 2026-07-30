package p6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n6.C0775h;

/* loaded from: classes.dex */
public final class o implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0775h f7262d;

    public o(C0775h c0775h) {
        this.f7262d = c0775h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        R5.l lVar = R5.n.f2421d;
        Unit unit = Unit.f6114a;
        this.f7262d.resumeWith(unit);
        return unit;
    }
}
