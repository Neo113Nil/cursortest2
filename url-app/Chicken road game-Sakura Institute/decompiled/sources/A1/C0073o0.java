package A1;

import G.InterfaceC0191c0;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import z1.AbstractC1366J;
import z1.C1362F;
import z1.C1364H;
import z1.C1369M;
import z1.C1372P;
import z2.C1403G;
import z2.C1441y;
import z2.C1442z;

/* renamed from: A1.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0073o0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f638d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f639e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f640i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f641j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f642k;

    public /* synthetic */ C0073o0(Q.v vVar, Q.v vVar2, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02) {
        this.f639e = vVar;
        this.f641j = vVar2;
        this.f640i = interfaceC0191c0;
        this.f642k = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        A2.b bVar;
        String str;
        switch (this.f638d) {
            case 0:
                this.f640i.setValue(null);
                ((InterfaceC0191c0) this.f642k).setValue(0L);
                Q.v vVar = (Q.v) this.f639e;
                int size = vVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    vVar.set(i2, null);
                    ((Q.v) this.f641j).set(i2, null);
                }
                return Unit.f7487a;
            case 1:
                InterfaceC0191c0 interfaceC0191c0 = this.f640i;
                if (!kotlin.text.y.x((String) interfaceC0191c0.getValue())) {
                    Q.v vVar2 = (Q.v) this.f639e;
                    if (vVar2 == null || !vVar2.isEmpty()) {
                        ListIterator listIterator = vVar2.listIterator();
                        do {
                            bVar = (A2.b) listIterator;
                            if (bVar.hasNext()) {
                            }
                        } while (((String) bVar.next()) != null);
                    }
                    String a4 = AbstractC1366J.a();
                    C1372P c1372p = (C1372P) this.f641j;
                    if (c1372p == null || (str = c1372p.f11837a) == null) {
                        str = "";
                    }
                    String str2 = str;
                    String obj = kotlin.text.y.M((String) interfaceC0191c0.getValue()).toString();
                    ArrayList arrayList = new ArrayList(C1442z.h(vVar2, 10));
                    ListIterator listIterator2 = vVar2.listIterator();
                    int i4 = 0;
                    while (true) {
                        A2.b bVar2 = (A2.b) listIterator2;
                        if (bVar2.hasNext()) {
                            Object next = bVar2.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                C1441y.g();
                                throw null;
                            }
                            arrayList.add(new C1362F(i5, (String) next));
                            i4 = i5;
                        } else {
                            AbstractC1366J.f11822h.add(new C1364H(a4, str2, obj, "4x100m", C1403G.I(arrayList)));
                            AbstractC1366J.b();
                            ((Function0) this.f642k).invoke();
                        }
                    }
                }
                return Unit.f7487a;
            default:
                InterfaceC0191c0 interfaceC0191c02 = this.f640i;
                if (!kotlin.text.y.x((String) interfaceC0191c02.getValue())) {
                    InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) this.f642k;
                    if (!kotlin.text.y.x((String) interfaceC0191c03.getValue())) {
                        AbstractC1366J.f11819e.add(new C1369M(AbstractC1366J.a(), kotlin.text.y.M((String) interfaceC0191c02.getValue()).toString(), kotlin.text.y.M((String) interfaceC0191c03.getValue()).toString(), ((Number) ((InterfaceC0191c0) this.f641j).getValue()).longValue()));
                        AbstractC1366J.b();
                        ((Function0) this.f639e).invoke();
                    }
                }
                return Unit.f7487a;
        }
    }

    public /* synthetic */ C0073o0(Q.v vVar, C1372P c1372p, Function0 function0, InterfaceC0191c0 interfaceC0191c0) {
        this.f639e = vVar;
        this.f641j = c1372p;
        this.f642k = function0;
        this.f640i = interfaceC0191c0;
    }

    public /* synthetic */ C0073o0(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03) {
        this.f639e = function0;
        this.f640i = interfaceC0191c0;
        this.f642k = interfaceC0191c02;
        this.f641j = interfaceC0191c03;
    }
}
