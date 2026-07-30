package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dr2 implements uy2, e62 {
    public final zq2 a;

    public dr2(zq2 zq2Var) {
        this.a = zq2Var;
    }

    @Override // defpackage.uy2
    public final Object a(ty2 ty2Var, Function2 function2, pr2 pr2Var) {
        return e(ty2Var, function2, pr2Var);
    }

    @Override // defpackage.b32
    public final Object b(String str, Function1 function1, r30 r30Var) {
        hr2 M = this.a.M(str);
        try {
            Object invoke = function1.invoke(M);
            yk3.w(M, null);
            return invoke;
        } finally {
        }
    }

    @Override // defpackage.e62
    public final nc2 c() {
        return this.a;
    }

    @Override // defpackage.uy2
    public final Object d(pr2 pr2Var) {
        return Boolean.valueOf(this.a.m.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ty2 ty2Var, Function2 function2, r30 r30Var) {
        cr2 cr2Var;
        int i;
        dr2 dr2Var;
        zs0 zs0Var;
        if (r30Var instanceof cr2) {
            cr2Var = (cr2) r30Var;
            int i2 = cr2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cr2Var.q = i2 - Integer.MIN_VALUE;
                Object obj = cr2Var.o;
                Object obj2 = b50.m;
                i = cr2Var.q;
                if (i != 0) {
                    ca2.b(obj);
                    zs0 zs0Var2 = this.a.m;
                    zs0Var2.m();
                    int ordinal = ty2Var.ordinal();
                    if (ordinal == 0) {
                        SQLiteDatabase sQLiteDatabase = zs0Var2.m;
                        y91 y91Var = zs0.p;
                        if (((Method) y91Var.getValue()) != null) {
                            y91 y91Var2 = zs0.o;
                            if (((Method) y91Var2.getValue()) != null) {
                                Method method = (Method) y91Var.getValue();
                                method.getClass();
                                Method method2 = (Method) y91Var2.getValue();
                                method2.getClass();
                                Object invoke = method2.invoke(sQLiteDatabase, null);
                                if (invoke != null) {
                                    method.invoke(invoke, 0, null, 0, null);
                                } else {
                                    lh.g("Required value was null.");
                                }
                            }
                        }
                        zs0Var2.b();
                    } else if (ordinal == 1) {
                        zs0Var2.m.beginTransactionNonExclusive();
                    } else {
                        if (ordinal != 2) {
                            a.b();
                            return null;
                        }
                        zs0Var2.b();
                    }
                    try {
                        Object d32Var = new d32(1, this);
                        cr2Var.m = this;
                        cr2Var.n = zs0Var2;
                        cr2Var.q = 1;
                        Object invoke2 = function2.invoke(d32Var, cr2Var);
                        if (invoke2 == obj2) {
                            return obj2;
                        }
                        dr2Var = this;
                        zs0Var = zs0Var2;
                        obj = invoke2;
                    } catch (Throwable th) {
                        th = th;
                        dr2Var = this;
                        zs0Var = zs0Var2;
                        zs0Var.f();
                        if (!zs0Var.m()) {
                            dr2Var.getClass();
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zs0Var = cr2Var.n;
                    dr2Var = cr2Var.m;
                    try {
                        ca2.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        zs0Var.f();
                        if (!zs0Var.m()) {
                        }
                        throw th;
                    }
                }
                zs0Var.m.setTransactionSuccessful();
                zs0Var.f();
                if (!zs0Var.m()) {
                    dr2Var.getClass();
                }
                return obj;
            }
        }
        cr2Var = new cr2(this, r30Var);
        Object obj3 = cr2Var.o;
        Object obj22 = b50.m;
        i = cr2Var.q;
        if (i != 0) {
        }
        zs0Var.m.setTransactionSuccessful();
        zs0Var.f();
        if (!zs0Var.m()) {
        }
        return obj3;
    }
}
