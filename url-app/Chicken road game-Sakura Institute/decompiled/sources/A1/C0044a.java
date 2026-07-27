package A1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import q.AbstractC1024c;

/* renamed from: A1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0044a implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f559e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f561j;

    public /* synthetic */ C0044a(String str, Function0 function0, int i2, int i4) {
        this.f558d = i4;
        this.f559e = str;
        this.f560i = function0;
        this.f561j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f558d;
        C0216p c0216p = (C0216p) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                j0.c.c(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case 1:
                j0.c.c(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case 2:
                j0.c.a(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case 3:
                j0.c.e(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case 4:
                AbstractC0071n0.h(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case 5:
                AbstractC0071n0.g(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case 6:
                AbstractC0071n0.b(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0071n0.h(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0071n0.g(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            case AbstractC1024c.f9242c /* 9 */:
                u3.l.L(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
            default:
                u3.l.L(this.f559e, this.f560i, c0216p, C0192d.U(this.f561j | 1));
                break;
        }
        return Unit.f7487a;
    }
}
