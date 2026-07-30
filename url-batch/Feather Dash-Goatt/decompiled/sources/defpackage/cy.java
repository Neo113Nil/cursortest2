package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class cy implements lh {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public cy(File file) {
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
    /* JADX WARN: Type inference failed for: r2v9, types: [cy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(cy cyVar, fn fnVar) {
        ay ayVar;
        ?? r2;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Throwable th2;
        if (fnVar instanceof ay) {
            ayVar = (ay) fnVar;
            int i = ayVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayVar.l = i - Integer.MIN_VALUE;
                Object obj = ayVar.j;
                tn tnVar = tn.d;
                r2 = ayVar.l;
                boolean z = true;
                if (r2 != 0) {
                    ca0.v(obj);
                    if (cyVar.b.get()) {
                        dd0.j("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new FileInputStream(cyVar.a);
                    } catch (FileNotFoundException unused) {
                        if (cyVar.a.exists()) {
                            return new qn0(z);
                        }
                        FileInputStream fileInputStream4 = new FileInputStream(cyVar.a);
                        try {
                            ayVar.h = fileInputStream4;
                            ayVar.i = null;
                            ayVar.l = 2;
                            qn0 p = j41.p(fileInputStream4);
                            if (p != tnVar) {
                                obj = p;
                                fileInputStream = fileInputStream4;
                                op.u(fileInputStream, null);
                                return obj;
                            }
                            return tnVar;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream4;
                            throw th;
                        }
                    }
                    try {
                        ayVar.h = cyVar;
                        ayVar.i = fileInputStream2;
                        ayVar.l = 1;
                        qn0 p2 = j41.p(fileInputStream2);
                        if (p2 != tnVar) {
                            fileInputStream3 = fileInputStream2;
                            obj = p2;
                        }
                        return tnVar;
                    } catch (Throwable th4) {
                        r2 = cyVar;
                        fileInputStream3 = fileInputStream2;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileInputStream = (Closeable) ayVar.h;
                    try {
                        ca0.v(obj);
                        op.u(fileInputStream, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream3 = ayVar.i;
                r2 = (cy) ayVar.h;
                try {
                    ca0.v(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                op.u(fileInputStream3, null);
                return obj;
            }
        }
        ayVar = new ay(cyVar, fnVar);
        Object obj2 = ayVar.j;
        tn tnVar2 = tn.d;
        r2 = ayVar.l;
        boolean z2 = true;
        if (r2 != 0) {
        }
        op.u(fileInputStream3, null);
        return obj2;
    }

    @Override // defpackage.lh
    public final void close() {
        this.b.set(true);
    }
}
