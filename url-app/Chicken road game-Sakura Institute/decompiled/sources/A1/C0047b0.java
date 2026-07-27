package A1;

import G.C0205j0;
import G.InterfaceC0191c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z1.C1381g;
import z1.C1393s;

/* renamed from: A1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047b0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f572e;

    public /* synthetic */ C0047b0(int i2, Object obj) {
        this.f571d = i2;
        this.f572e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer num;
        Object obj = this.f572e;
        switch (this.f571d) {
            case 0:
                C0205j0 c0205j0 = AbstractC0071n0.f634a;
                Q.v vVar = AbstractC1366J.f11820f;
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = vVar.listIterator();
                while (true) {
                    A2.b bVar = (A2.b) listIterator;
                    C1381g c1381g = (C1381g) obj;
                    if (!bVar.hasNext()) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            Integer valueOf = Integer.valueOf(((C1393s) it.next()).f11909c);
                            while (it.hasNext()) {
                                Integer valueOf2 = Integer.valueOf(((C1393s) it.next()).f11909c);
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            num = valueOf;
                        } else {
                            num = null;
                        }
                        AbstractC1366J.f11820f.add(new C1393s((num != null ? num.intValue() : 0) + 1, AbstractC1366J.a(), c1381g.f11863a));
                        AbstractC1366J.b();
                        break;
                    } else {
                        Object next = bVar.next();
                        if (Intrinsics.a(((C1393s) next).f11908b, c1381g.f11863a)) {
                            arrayList.add(next);
                        }
                    }
                }
            default:
                List list = N0.f513a;
                ((InterfaceC0191c0) obj).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
        }
        return Unit.f7487a;
    }
}
