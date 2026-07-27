package A1;

import G.InterfaceC0191c0;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z1.C1377c;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f653d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f654e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f655i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f656j;

    public /* synthetic */ r(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03) {
        this.f654e = interfaceC0191c0;
        this.f655i = interfaceC0191c02;
        this.f656j = interfaceC0191c03;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1377c c1377c;
        switch (this.f653d) {
            case 0:
                ListIterator listIterator = AbstractC1366J.f11818d.listIterator();
                int i2 = 0;
                while (true) {
                    A2.b bVar = (A2.b) listIterator;
                    boolean hasNext = bVar.hasNext();
                    c1377c = (C1377c) this.f655i;
                    if (!hasNext) {
                        i2 = -1;
                    } else if (!Intrinsics.a(((C1377c) bVar.next()).f11851a, c1377c.f11851a)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    Q.v vVar = AbstractC1366J.f11818d;
                    String bio = kotlin.text.y.M((String) this.f654e.getValue()).toString();
                    String id = c1377c.f11851a;
                    Intrinsics.checkNotNullParameter(id, "id");
                    String name = c1377c.f11852b;
                    Intrinsics.checkNotNullParameter(name, "name");
                    String team = c1377c.f11854d;
                    Intrinsics.checkNotNullParameter(team, "team");
                    Intrinsics.checkNotNullParameter(bio, "bio");
                    vVar.set(i2, new C1377c(id, name, c1377c.f11853c, team, c1377c.f11855e, c1377c.f11856f, bio));
                    AbstractC1366J.b();
                }
                ((Function0) this.f656j).invoke();
                break;
            default:
                if (((Number) this.f654e.getValue()).intValue() == 0) {
                    ((InterfaceC0191c0) this.f655i).setValue(Boolean.TRUE);
                } else {
                    ((InterfaceC0191c0) this.f656j).setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ r(C1377c c1377c, Function0 function0, InterfaceC0191c0 interfaceC0191c0) {
        this.f655i = c1377c;
        this.f656j = function0;
        this.f654e = interfaceC0191c0;
    }
}
