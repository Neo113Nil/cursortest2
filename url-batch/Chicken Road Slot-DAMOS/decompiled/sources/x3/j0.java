package x3;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(File file, Function1 function1, nd.c cVar) {
        i0 i0Var;
        int i3;
        try {
            if (cVar instanceof i0) {
                i0Var = (i0) cVar;
                int i10 = i0Var.f10387i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    i0Var.f10387i = i10 - Integer.MIN_VALUE;
                    Object obj = i0Var.f10386e;
                    Object obj2 = md.a.f6622d;
                    i3 = i0Var.f10387i;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        i0Var.f10385d = file;
                        i0Var.f10387i = 1;
                        Object invoke = function1.invoke(i0Var);
                        return invoke == obj2 ? obj2 : invoke;
                    }
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    File file2 = i0Var.f10385d;
                    cf.c.M(obj);
                    return obj;
                }
            }
            if (i3 != 0) {
            }
        } catch (IOException e2) {
            if (e2 instanceof b) {
                throw e2;
            }
            file.getClass();
            if (!file.exists()) {
                throw c0.b(file, e2);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw c0.b(file, e2);
                    }
                    throw c0.b(file, e2);
                }
                if (file.canWrite()) {
                    throw c0.b(file, e2);
                }
                throw c0.b(file, e2);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw c0.b(file, e2);
                }
                throw c0.b(file, e2);
            }
            if (file.canWrite()) {
                throw c0.b(file, e2);
            }
            throw c0.b(file, e2);
        }
        i0Var = new i0(cVar);
        Object obj3 = i0Var.f10386e;
        Object obj22 = md.a.f6622d;
        i3 = i0Var.f10387i;
    }

    public static final long b(long j, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long c(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }
}
