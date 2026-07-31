package q1;

import android.content.Context;
import android.content.ContextWrapper;
import h1.C0438i;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778b extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0778b f6877f = new C0778b(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0778b f6878g = new C0778b(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0778b f6879h = new C0778b(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0778b f6880i = new C0778b(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0778b f6881j = new C0778b(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0778b f6882k = new C0778b(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C0778b f6883l = new C0778b(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C0778b f6884m = new C0778b(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0778b f6885n = new C0778b(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0778b f6886o = new C0778b(1, 9);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0778b(int i3, int i4) {
        super(i3);
        this.f6887e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6887e) {
            case 0:
                Context context = (Context) obj;
                Z1.i.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                Z1.i.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                H h3 = (H) obj;
                Z1.i.f(h3, "$this$navOptions");
                h3.f6869c = true;
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                w wVar = (w) obj;
                Z1.i.f(wVar, "destination");
                z zVar = wVar.f6963e;
                if (zVar == null || zVar.f6980n != wVar.f6967i) {
                    return null;
                }
                return zVar;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                w wVar2 = (w) obj;
                Z1.i.f(wVar2, "destination");
                z zVar2 = wVar2.f6963e;
                if (zVar2 == null || zVar2.f6980n != wVar2.f6967i) {
                    return null;
                }
                return zVar2;
            case 5:
                L l3 = (L) obj;
                Z1.i.f(l3, "$this$popUpTo");
                l3.f6876a = true;
                return L1.z.f2729a;
            case 6:
                w wVar3 = (w) obj;
                Z1.i.f(wVar3, "it");
                return Integer.valueOf(wVar3.f6967i);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                w wVar4 = (w) obj;
                Z1.i.f(wVar4, "it");
                return wVar4.f6963e;
            case 8:
                w wVar5 = (w) obj;
                Z1.i.f(wVar5, "it");
                if (!(wVar5 instanceof z)) {
                    return null;
                }
                z zVar3 = (z) wVar5;
                return zVar3.j(zVar3.f6980n, zVar3, false);
            default:
                H h4 = (H) obj;
                Z1.i.f(h4, "$this$navOptions");
                h4.f6868b = true;
                return L1.z.f2729a;
        }
    }
}
