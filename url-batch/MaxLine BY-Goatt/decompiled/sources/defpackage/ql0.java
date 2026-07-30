package defpackage;

import java.io.FileOutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ql0 extends al0 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, r30 r30Var) {
        pl0 pl0Var;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (r30Var instanceof pl0) {
            pl0Var = (pl0) r30Var;
            int i2 = pl0Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pl0Var.q = i2 - Integer.MIN_VALUE;
                Object obj2 = pl0Var.o;
                b50 b50Var = b50.m;
                i = pl0Var.q;
                if (i != 0) {
                    ca2.b(obj2);
                    if (this.b.get()) {
                        lh.g("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        v13 v13Var = new v13(fileOutputStream3);
                        pl0Var.m = fileOutputStream3;
                        pl0Var.n = fileOutputStream3;
                        pl0Var.q = 1;
                        if (by1.r(obj, v13Var) == b50Var) {
                            return b50Var;
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
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = pl0Var.n;
                    fileOutputStream = pl0Var.m;
                    try {
                        ca2.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            ll3.y(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Unit unit = Unit.a;
                ll3.y(fileOutputStream, null);
                return Unit.a;
            }
        }
        pl0Var = new pl0(this, r30Var);
        Object obj22 = pl0Var.o;
        b50 b50Var2 = b50.m;
        i = pl0Var.q;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        Unit unit2 = Unit.a;
        ll3.y(fileOutputStream, null);
        return Unit.a;
    }
}
