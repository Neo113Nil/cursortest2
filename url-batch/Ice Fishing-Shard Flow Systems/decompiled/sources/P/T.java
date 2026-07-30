package P;

import a.AbstractC0169a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class T implements InterfaceC0136a {

    /* renamed from: a, reason: collision with root package name */
    public final File f2034a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2035b;

    public T(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        T.g serializer = T.g.f2557a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f2034a = file;
        this.f2035b = new AtomicBoolean(false);
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
    /* JADX WARN: Type inference failed for: r2v9, types: [P.T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(T t6, X5.c cVar) {
        S s7;
        ?? r22;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof S) {
            s7 = (S) cVar;
            int i2 = s7.f2033m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s7.f2033m = i2 - Integer.MIN_VALUE;
                Object obj = s7.f2031i;
                W5.a aVar = W5.a.f2787d;
                r22 = s7.f2033m;
                T.g gVar = T.g.f2557a;
                boolean z7 = true;
                if (r22 != 0) {
                    V6.b.P(obj);
                    if (t6.f2035b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(t6.f2034a);
                        try {
                            s7.f2029d = t6;
                            s7.f2030e = fileInputStream2;
                            s7.f2033m = 1;
                            T.b a7 = gVar.a(fileInputStream2);
                            if (a7 != aVar) {
                                fileInputStream = fileInputStream2;
                                obj = a7;
                            }
                        } catch (Throwable th3) {
                            r22 = t6;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!t6.f2034a.exists()) {
                            return new T.b(z7);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(t6.f2034a);
                        try {
                            s7.f2029d = fileInputStream3;
                            s7.f2030e = null;
                            s7.f2033m = 2;
                            T.b a8 = gVar.a(fileInputStream3);
                            if (a8 != aVar) {
                                obj = a8;
                                closeable = fileInputStream3;
                                AbstractC0169a.d(closeable, null);
                                return obj;
                            }
                            return aVar;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                    return aVar;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) s7.f2029d;
                    try {
                        V6.b.P(obj);
                        AbstractC0169a.d(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = s7.f2030e;
                r22 = (T) s7.f2029d;
                try {
                    V6.b.P(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                AbstractC0169a.d(fileInputStream, null);
                return obj;
            }
        }
        s7 = new S(t6, cVar);
        Object obj2 = s7.f2031i;
        W5.a aVar2 = W5.a.f2787d;
        r22 = s7.f2033m;
        T.g gVar2 = T.g.f2557a;
        boolean z72 = true;
        if (r22 != 0) {
        }
        AbstractC0169a.d(fileInputStream, null);
        return obj2;
    }

    @Override // P.InterfaceC0136a
    public final void close() {
        this.f2035b.set(true);
    }
}
