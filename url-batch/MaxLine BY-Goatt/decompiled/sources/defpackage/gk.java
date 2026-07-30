package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gk extends pr2 implements Function1 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ hk o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk(hk hkVar, String str, boolean z, o30 o30Var, int i) {
        super(1, o30Var);
        this.m = i;
        this.o = hkVar;
        this.p = str;
        this.q = z;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        switch (this.m) {
            case 0:
                return new gk(this.o, this.p, this.q, o30Var, 0);
            case 1:
                return new gk(this.o, this.p, this.q, o30Var, 1);
            default:
                return new gk(this.o, this.p, this.q, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o30 o30Var = (o30) obj;
        switch (this.m) {
        }
        return ((gk) create(o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        boolean z = this.q;
        String str = this.p;
        hk hkVar = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    hkVar.getClass();
                    if (hk.c(hkVar, str, z, this) == b50Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            case 1:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    hkVar.getClass();
                    if (hk.d(hkVar, str, z, this) == b50Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    hkVar.getClass();
                    if (hk.e(hkVar, str, z, this) == b50Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
        }
        return Unit.a;
    }
}
