package defpackage;

import java.io.FileOutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class py extends cy {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, fn fnVar) {
        oy oyVar;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (fnVar instanceof oy) {
            oyVar = (oy) fnVar;
            int i2 = oyVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oyVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = oyVar.j;
                tn tnVar = tn.d;
                i = oyVar.l;
                if (i != 0) {
                    ca0.v(obj2);
                    if (this.b.get()) {
                        dd0.j("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        xk1 xk1Var = new xk1(fileOutputStream3);
                        oyVar.h = fileOutputStream3;
                        oyVar.i = fileOutputStream3;
                        oyVar.l = 1;
                        if (j41.q(obj, xk1Var) == tnVar) {
                            return tnVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = oyVar.i;
                    fileOutputStream = oyVar.h;
                    try {
                        ca0.v(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            op.u(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                op.u(fileOutputStream, null);
                return Unit.a;
            }
        }
        oyVar = new oy(this, fnVar);
        Object obj22 = oyVar.j;
        tn tnVar2 = tn.d;
        i = oyVar.l;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        op.u(fileOutputStream, null);
        return Unit.a;
    }
}
