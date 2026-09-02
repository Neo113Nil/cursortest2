package K;

import g3.EnumC0441a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class O implements InterfaceC0052a {

    /* renamed from: a, reason: collision with root package name */
    public final File f1290a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1291b = new AtomicBoolean(false);

    public O(File file) {
        this.f1290a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|46|47|(1:49)|50)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [K.O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(O o, h3.c cVar) {
        N n;
        ?? r22;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof N) {
            n = (N) cVar;
            int i4 = n.f1289e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                n.f1289e = i4 - Integer.MIN_VALUE;
                Object obj = n.f1287c;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                r22 = n.f1289e;
                N.g gVar = N.g.f1792a;
                boolean z = true;
                if (r22 != 0) {
                    O3.l.w(obj);
                    if (o.f1291b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(o.f1290a);
                        try {
                            n.f1285a = o;
                            n.f1286b = fileInputStream2;
                            n.f1289e = 1;
                            N.b a3 = gVar.a(fileInputStream2);
                            if (a3 != enumC0441a) {
                                fileInputStream = fileInputStream2;
                                obj = a3;
                            }
                        } catch (Throwable th3) {
                            r22 = o;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!o.f1290a.exists()) {
                            return new N.b(z);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(o.f1290a);
                        try {
                            n.f1285a = fileInputStream3;
                            n.f1286b = null;
                            n.f1289e = 2;
                            N.b a4 = gVar.a(fileInputStream3);
                            if (a4 != enumC0441a) {
                                obj = a4;
                                closeable = fileInputStream3;
                                U.i.c(closeable, null);
                                return obj;
                            }
                            return enumC0441a;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                    return enumC0441a;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) n.f1285a;
                    try {
                        O3.l.w(obj);
                        U.i.c(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = n.f1286b;
                r22 = (O) n.f1285a;
                try {
                    O3.l.w(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                U.i.c(fileInputStream, null);
                return obj;
            }
        }
        n = new N(o, cVar);
        Object obj2 = n.f1287c;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        r22 = n.f1289e;
        N.g gVar2 = N.g.f1792a;
        boolean z4 = true;
        if (r22 != 0) {
        }
        U.i.c(fileInputStream, null);
        return obj2;
    }

    @Override // K.InterfaceC0052a
    public final void close() {
        this.f1291b.set(true);
    }
}
