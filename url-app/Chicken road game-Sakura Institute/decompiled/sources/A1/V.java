package A1;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z1.C1377c;
import z1.C1393s;
import z2.C1400D;

/* loaded from: classes.dex */
public final class V implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1393s f545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f546e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f547i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1377c f548j;

    public V(C1393s c1393s, boolean z4, int i2, C1377c c1377c) {
        this.f545d = c1393s;
        this.f546e = z4;
        this.f547i = i2;
        this.f548j = c1377c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1393s c1393s = this.f545d;
        Set entrySet = c1393s.f11910d.entrySet();
        C1377c c1377c = this.f548j;
        U predicate = new U(c1377c);
        Intrinsics.checkNotNullParameter(entrySet, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        C1400D.k(entrySet, predicate, true);
        if (!this.f546e) {
            c1393s.f11910d.put(Integer.valueOf(this.f547i), c1377c.f11851a);
        }
        AbstractC1366J.b();
        return Unit.f7487a;
    }
}
