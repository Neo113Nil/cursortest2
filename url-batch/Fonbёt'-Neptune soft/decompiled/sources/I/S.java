package I;

import a.AbstractC0132a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class S implements InterfaceC0067b {

    /* renamed from: a, reason: collision with root package name */
    public final File f586a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f587b = new AtomicBoolean(false);

    public S(File file) {
        this.f586a = file;
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
    /* JADX WARN: Type inference failed for: r2v9, types: [I.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(S s2, J0.b bVar) {
        Q q2;
        ?? r2;
        Throwable th;
        Closeable closeable;
        Throwable th2;
        Closeable closeable2;
        if (bVar instanceof Q) {
            q2 = (Q) bVar;
            int i2 = q2.f585l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2.f585l = i2 - Integer.MIN_VALUE;
                Object obj = q2.f583j;
                I0.a aVar = I0.a.f733e;
                r2 = q2.f585l;
                L.g gVar = L.g.f764a;
                boolean z2 = true;
                if (r2 != 0) {
                    i1.a.G(obj);
                    if (s2.f587b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(s2.f586a);
                        try {
                            q2.f581h = s2;
                            q2.f582i = fileInputStream;
                            q2.f585l = 1;
                            L.b a2 = gVar.a(fileInputStream);
                            if (a2 == aVar) {
                                return aVar;
                            }
                            closeable2 = fileInputStream;
                            obj = a2;
                        } catch (Throwable th3) {
                            r2 = s2;
                            closeable2 = fileInputStream;
                            th2 = th3;
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!s2.f586a.exists()) {
                            return new L.b(z2);
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(s2.f586a);
                        try {
                            q2.f581h = fileInputStream2;
                            q2.f582i = null;
                            q2.f585l = 2;
                            L.b a3 = gVar.a(fileInputStream2);
                            if (a3 == aVar) {
                                return aVar;
                            }
                            obj = a3;
                            closeable = fileInputStream2;
                            AbstractC0132a.k(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream2;
                            throw th2;
                        }
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) q2.f581h;
                        try {
                            i1.a.G(obj);
                            AbstractC0132a.k(closeable, null);
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    closeable2 = q2.f582i;
                    r2 = (S) q2.f581h;
                    try {
                        i1.a.G(obj);
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                AbstractC0132a.k(closeable2, null);
                return obj;
            }
        }
        q2 = new Q(s2, bVar);
        Object obj2 = q2.f583j;
        I0.a aVar2 = I0.a.f733e;
        r2 = q2.f585l;
        L.g gVar2 = L.g.f764a;
        boolean z22 = true;
        if (r2 != 0) {
        }
        AbstractC0132a.k(closeable2, null);
        return obj2;
    }

    @Override // I.InterfaceC0067b
    public final void close() {
        this.f587b.set(true);
    }
}
