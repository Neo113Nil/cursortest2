package z1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;

/* renamed from: z1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1383i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11875d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11876e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11877i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11878j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11879k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f11880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11881m;

    public /* synthetic */ C1383i(String str, String str2, String str3, Function0 function0, int i2, int i4) {
        this.f11876e = str;
        this.f11877i = str2;
        this.f11880l = str3;
        this.f11881m = function0;
        this.f11878j = i2;
        this.f11879k = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f11875d) {
            case 0:
                ((Integer) obj2).getClass();
                int U3 = C0192d.U(this.f11878j | 1);
                String str = this.f11876e;
                String str2 = this.f11877i;
                Function0 function0 = (Function0) this.f11881m;
                AbstractC0864b.e(str, str2, (String) this.f11880l, function0, (C0216p) obj, U3, this.f11879k);
                break;
            default:
                ((Integer) obj2).getClass();
                int U4 = C0192d.U(this.f11878j | 1);
                String str3 = this.f11877i;
                S.o oVar = (S.o) this.f11881m;
                AbstractC0864b.i(this.f11876e, (Function1) this.f11880l, str3, oVar, (C0216p) obj, U4, this.f11879k);
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ C1383i(String str, Function1 function1, String str2, S.o oVar, int i2, int i4) {
        this.f11876e = str;
        this.f11880l = function1;
        this.f11877i = str2;
        this.f11881m = oVar;
        this.f11878j = i2;
        this.f11879k = i4;
    }
}
