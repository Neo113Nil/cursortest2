package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class al0 implements xu {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public al0(File file) {
        this.a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(0)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006c, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [al0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(al0 al0Var, r30 r30Var) {
        zk0 zk0Var;
        ?? r2;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Throwable th2;
        if (r30Var instanceof zk0) {
            zk0Var = (zk0) r30Var;
            int i = zk0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                zk0Var.q = i - Integer.MIN_VALUE;
                Object obj = zk0Var.o;
                b50 b50Var = b50.m;
                r2 = zk0Var.q;
                if (r2 != 0) {
                    ca2.b(obj);
                    if (al0Var.b.get()) {
                        lh.g("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new FileInputStream(al0Var.a);
                    } catch (FileNotFoundException unused) {
                        if (al0Var.a.exists()) {
                            return new on1(true);
                        }
                        FileInputStream fileInputStream4 = new FileInputStream(al0Var.a);
                        try {
                            zk0Var.m = fileInputStream4;
                            zk0Var.n = null;
                            zk0Var.q = 2;
                            on1 q = by1.q(fileInputStream4);
                            if (q != b50Var) {
                                obj = q;
                                fileInputStream = fileInputStream4;
                                ll3.y(fileInputStream, null);
                                return obj;
                            }
                            return b50Var;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream4;
                            throw th;
                        }
                    }
                    try {
                        zk0Var.m = al0Var;
                        zk0Var.n = fileInputStream2;
                        zk0Var.q = 1;
                        on1 q2 = by1.q(fileInputStream2);
                        if (q2 != b50Var) {
                            fileInputStream3 = fileInputStream2;
                            obj = q2;
                        }
                        return b50Var;
                    } catch (Throwable th4) {
                        r2 = al0Var;
                        fileInputStream3 = fileInputStream2;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileInputStream = (Closeable) zk0Var.m;
                    try {
                        ca2.b(obj);
                        ll3.y(fileInputStream, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream3 = zk0Var.n;
                r2 = (al0) zk0Var.m;
                try {
                    ca2.b(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                ll3.y(fileInputStream3, null);
                return obj;
            }
        }
        zk0Var = new zk0(al0Var, r30Var);
        Object obj2 = zk0Var.o;
        b50 b50Var2 = b50.m;
        r2 = zk0Var.q;
        if (r2 != 0) {
        }
        ll3.y(fileInputStream3, null);
        return obj2;
    }

    @Override // defpackage.xu
    public final void close() {
        this.b.set(true);
    }
}
