package t1;

import android.content.Context;
import android.content.ContextWrapper;
import e2.InterfaceC0424c;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022b extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1022b f8856f = new C1022b(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1022b f8857g = new C1022b(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C1022b f8858h = new C1022b(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C1022b f8859i = new C1022b(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C1022b f8860j = new C1022b(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C1022b f8861k = new C1022b(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C1022b f8862l = new C1022b(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C1022b f8863m = new C1022b(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C1022b f8864n = new C1022b(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C1022b f8865o = new C1022b(1, 9);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1022b(int i3, int i4) {
        super(i3);
        this.f8866e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8866e) {
            case 0:
                Context context = (Context) obj;
                f2.j.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                f2.j.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C1017E c1017e = (C1017E) obj;
                f2.j.f(c1017e, "$this$navOptions");
                c1017e.f8848c = true;
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                u uVar = (u) obj;
                f2.j.f(uVar, "destination");
                x xVar = uVar.f8932e;
                if (xVar == null || xVar.f8949n != uVar.f8936i) {
                    return null;
                }
                return xVar;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                u uVar2 = (u) obj;
                f2.j.f(uVar2, "destination");
                x xVar2 = uVar2.f8932e;
                if (xVar2 == null || xVar2.f8949n != uVar2.f8936i) {
                    return null;
                }
                return xVar2;
            case 5:
                I i3 = (I) obj;
                f2.j.f(i3, "$this$popUpTo");
                i3.f8855a = true;
                return R1.y.f4171a;
            case 6:
                u uVar3 = (u) obj;
                f2.j.f(uVar3, "it");
                return Integer.valueOf(uVar3.f8936i);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                u uVar4 = (u) obj;
                f2.j.f(uVar4, "it");
                return uVar4.f8932e;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                u uVar5 = (u) obj;
                f2.j.f(uVar5, "it");
                if (!(uVar5 instanceof x)) {
                    return null;
                }
                x xVar3 = (x) uVar5;
                return xVar3.j(xVar3.f8949n, xVar3, false);
            default:
                C1017E c1017e2 = (C1017E) obj;
                f2.j.f(c1017e2, "$this$navOptions");
                c1017e2.f8847b = true;
                return R1.y.f4171a;
        }
    }
}
