package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class us2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ s42 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us2(s42 s42Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.n = s42Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        s42 s42Var = this.n;
        switch (i) {
            case 0:
                return new us2(s42Var, o30Var, 0);
            case 1:
                return new us2(s42Var, o30Var, 1);
            case 2:
                return new us2(s42Var, o30Var, 2);
            case 3:
                return new us2(s42Var, o30Var, 3);
            case 4:
                return new us2(s42Var, o30Var, 4);
            case 5:
                return new us2(s42Var, o30Var, 5);
            case 6:
                return new us2(s42Var, o30Var, 6);
            default:
                return new us2(s42Var, o30Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((us2) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        s42 s42Var = this.n;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                s42Var.o = true;
                s42Var.p.b(null);
                break;
            case 1:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                s42Var.n = true;
                s42Var.p.b(null);
                break;
            case 2:
                b50 b50Var3 = b50.m;
                ca2.b(obj);
                s42Var.n = true;
                s42Var.p.b(null);
                break;
            case 3:
                b50 b50Var4 = b50.m;
                ca2.b(obj);
                s42Var.o = true;
                s42Var.p.b(null);
                break;
            case 4:
                b50 b50Var5 = b50.m;
                ca2.b(obj);
                s42Var.n = true;
                s42Var.p.b(null);
                break;
            case 5:
                b50 b50Var6 = b50.m;
                ca2.b(obj);
                s42Var.n = true;
                s42Var.p.b(null);
                break;
            case 6:
                b50 b50Var7 = b50.m;
                ca2.b(obj);
                s42Var.n = true;
                s42Var.p.b(null);
                break;
            default:
                b50 b50Var8 = b50.m;
                ca2.b(obj);
                s42Var.o = true;
                s42Var.p.b(null);
                break;
        }
        return Unit.a;
    }
}
