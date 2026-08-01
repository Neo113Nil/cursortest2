package n0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements kotlin.coroutines.f {

    /* renamed from: e, reason: collision with root package name */
    public static final kotlin.collections.i0 f6658e = new kotlin.collections.i0(15);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e f6659i = new e(1);

    /* renamed from: r, reason: collision with root package name */
    public static final e f6660r = new e(2);

    /* renamed from: s, reason: collision with root package name */
    public static final e f6661s = new e(3);

    /* renamed from: t, reason: collision with root package name */
    public static final e f6662t = new e(4);

    /* renamed from: u, reason: collision with root package name */
    public static final e f6663u = new e(5);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6664d;

    public /* synthetic */ e(int i3) {
        this.f6664d = i3;
    }

    public static final void a(e eVar) {
        je.l0 l0Var;
        v0.b bVar;
        v0.b bVar2;
        je.l0 l0Var2 = z1.f6873y;
        do {
            l0Var = z1.f6873y;
            bVar = (v0.b) l0Var.getValue();
            u0.b bVar3 = bVar.f9932r;
            v0.a aVar = (v0.a) bVar3.get(eVar);
            if (aVar == null) {
                bVar2 = bVar;
            } else {
                Object obj = aVar.f9927a;
                Object obj2 = aVar.f9928b;
                u0.i iVar = bVar3.f9577r;
                u0.i v10 = iVar.v(eVar != null ? eVar.hashCode() : 0, 0, eVar);
                if (iVar != v10) {
                    bVar3 = v10 == null ? u0.b.f9576t : new u0.b(v10, bVar3.f9578s - 1);
                }
                w0.b bVar4 = w0.b.f10002a;
                if (obj != bVar4) {
                    Object obj3 = bVar3.get(obj);
                    obj3.getClass();
                    bVar3 = bVar3.f(obj, new v0.a(((v0.a) obj3).f9927a, obj2));
                }
                if (obj2 != bVar4) {
                    Object obj4 = bVar3.get(obj2);
                    obj4.getClass();
                    bVar3 = bVar3.f(obj2, new v0.a(obj, ((v0.a) obj4).f9928b));
                }
                Object obj5 = obj != bVar4 ? bVar.f9930e : obj2;
                if (obj2 != bVar4) {
                    obj = bVar.f9931i;
                }
                bVar2 = new v0.b(obj5, obj, bVar3);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!l0Var.i(bVar, bVar2));
    }

    public boolean b(Object obj, Object obj2) {
        switch (this.f6664d) {
            case 2:
                return false;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return obj == obj2;
            default:
                return Intrinsics.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f6664d) {
            case 2:
                return "NeverEqualPolicy";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "ReferentialEqualityPolicy";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                return super.toString();
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "StructuralEqualityPolicy";
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Empty";
        }
    }
}
