package P;

import a.AbstractC0169a;
import java.io.FileOutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class b0 extends T {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, X5.c cVar) {
        a0 a0Var;
        int i2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i5 = a0Var.f2064m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                a0Var.f2064m = i5 - Integer.MIN_VALUE;
                Object obj2 = a0Var.f2062i;
                W5.a aVar = W5.a.f2787d;
                i2 = a0Var.f2064m;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    if (this.f2035b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f2034a);
                    try {
                        T.g gVar = T.g.f2557a;
                        o0 o0Var = new o0(fileOutputStream3);
                        a0Var.f2060d = fileOutputStream3;
                        a0Var.f2061e = fileOutputStream3;
                        a0Var.f2064m = 1;
                        if (gVar.b(obj, o0Var) == aVar) {
                            return aVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = a0Var.f2061e;
                    fileOutputStream = a0Var.f2060d;
                    try {
                        V6.b.P(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC0169a.d(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Unit unit = Unit.f6114a;
                AbstractC0169a.d(fileOutputStream, null);
                return Unit.f6114a;
            }
        }
        a0Var = new a0(this, cVar);
        Object obj22 = a0Var.f2062i;
        W5.a aVar2 = W5.a.f2787d;
        i2 = a0Var.f2064m;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        Unit unit2 = Unit.f6114a;
        AbstractC0169a.d(fileOutputStream, null);
        return Unit.f6114a;
    }
}
