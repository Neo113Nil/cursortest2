package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sk implements Function0 {
    public final /* synthetic */ int m;
    public final Object n;
    public final /* synthetic */ Object o;

    public sk(vy0 vy0Var, yy0 yy0Var) {
        this.m = 1;
        this.o = vy0Var;
        this.n = yy0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((ik) obj).a);
                return Unit.a;
            case 1:
                vy0 vy0Var = (vy0) obj;
                yy0 yy0Var = (yy0) obj2;
                try {
                } catch (IOException e) {
                    vy0Var.b(2, 2, e);
                } catch (Throwable th) {
                    vy0Var.b(3, 3, null);
                    n33.b(yy0Var);
                    throw th;
                }
                if (!yy0Var.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (yy0Var.b(false, this)) {
                }
                vy0Var.b(1, 9, null);
                n33.b(yy0Var);
                return Unit.a;
            default:
                ((Function1) obj2).invoke(Long.valueOf(((a61) obj).a));
                return Unit.a;
        }
    }

    public /* synthetic */ sk(Function1 function1, Object obj, int i) {
        this.m = i;
        this.n = function1;
        this.o = obj;
    }
}
