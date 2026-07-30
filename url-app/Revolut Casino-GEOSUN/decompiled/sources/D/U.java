package D;

import a.AbstractC0069a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class U implements InterfaceC0001b {

    /* renamed from: a, reason: collision with root package name */
    public final File f143a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f144b = new AtomicBoolean(false);

    public U(File file) {
        this.f143a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(5:44|45|47|48|(1:50)(1:51))(2:42|43))|30|31))|70|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [D.U] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(U u2, y0.b bVar) {
        T t2;
        ?? r2;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (bVar instanceof T) {
            t2 = (T) bVar;
            int i2 = t2.f142l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t2.f142l = i2 - Integer.MIN_VALUE;
                Object obj = t2.f140j;
                x0.a aVar = x0.a.f3094e;
                r2 = t2.f142l;
                G.g gVar = G.g.f334a;
                boolean z2 = true;
                if (r2 != 0) {
                    o.g.z(obj);
                    if (u2.f144b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(u2.f143a);
                        try {
                            t2.f138h = u2;
                            t2.f139i = fileInputStream2;
                            t2.f142l = 1;
                            G.b a2 = gVar.a(fileInputStream2);
                            if (a2 == aVar) {
                                return aVar;
                            }
                            fileInputStream = fileInputStream2;
                            obj = a2;
                        } catch (Throwable th3) {
                            r2 = u2;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!u2.f143a.exists()) {
                            return new G.b(z2);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(u2.f143a);
                        try {
                            t2.f138h = fileInputStream3;
                            t2.f139i = null;
                            t2.f142l = 2;
                            G.b a3 = gVar.a(fileInputStream3);
                            if (a3 == aVar) {
                                return aVar;
                            }
                            obj = a3;
                            closeable = fileInputStream3;
                            AbstractC0069a.f(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) t2.f138h;
                        try {
                            o.g.z(obj);
                            AbstractC0069a.f(closeable, null);
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    fileInputStream = t2.f139i;
                    r2 = (U) t2.f138h;
                    try {
                        o.g.z(obj);
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                AbstractC0069a.f(fileInputStream, null);
                return obj;
            }
        }
        t2 = new T(u2, bVar);
        Object obj2 = t2.f140j;
        x0.a aVar2 = x0.a.f3094e;
        r2 = t2.f142l;
        G.g gVar2 = G.g.f334a;
        boolean z22 = true;
        if (r2 != 0) {
        }
        AbstractC0069a.f(fileInputStream, null);
        return obj2;
    }

    @Override // D.InterfaceC0001b
    public final void close() {
        this.f144b.set(true);
    }
}
