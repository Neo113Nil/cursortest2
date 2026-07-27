package A1;

import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z1.C1389o;

/* renamed from: A1.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061i0 implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1389o f613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f614e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f615i;

    public C0061i0(C1389o c1389o, int i2, InterfaceC0191c0 interfaceC0191c0) {
        this.f613d = c1389o;
        this.f614e = i2;
        this.f615i = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f615i.setValue(it);
        this.f613d.f11902b.set(this.f614e, kotlin.text.s.d(it));
        AbstractC1366J.b();
        return Unit.f7487a;
    }
}
