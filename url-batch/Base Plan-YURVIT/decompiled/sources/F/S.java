package F;

import a.AbstractC0086a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class S implements InterfaceC0020b {

    /* renamed from: a, reason: collision with root package name */
    public final File f305a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f306b = new AtomicBoolean(false);

    public S(File file) {
        this.f305a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|46|47|(1:49)|50)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [F.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(S s2, I0.b bVar) {
        Q q2;
        ?? r1;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (bVar instanceof Q) {
            q2 = (Q) bVar;
            int i2 = q2.f304l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2.f304l = i2 - Integer.MIN_VALUE;
                Object obj = q2.f302j;
                r1 = q2.f304l;
                I.g gVar = I.g.f521a;
                boolean z2 = true;
                H0.a aVar = H0.a.f511e;
                if (r1 != 0) {
                    AbstractC0086a.I(obj);
                    if (s2.f306b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(s2.f305a);
                        try {
                            q2.f300h = s2;
                            q2.f301i = fileInputStream2;
                            q2.f304l = 1;
                            I.b a2 = gVar.a(fileInputStream2);
                            if (a2 != aVar) {
                                fileInputStream = fileInputStream2;
                                obj = a2;
                            }
                        } catch (Throwable th3) {
                            r1 = s2;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!s2.f305a.exists()) {
                            return new I.b(z2);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(s2.f305a);
                        try {
                            q2.f300h = fileInputStream3;
                            q2.f301i = null;
                            q2.f304l = 2;
                            I.b a3 = gVar.a(fileInputStream3);
                            if (a3 != aVar) {
                                obj = a3;
                                closeable = fileInputStream3;
                                AbstractC0086a.g(closeable, null);
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
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) q2.f300h;
                    try {
                        AbstractC0086a.I(obj);
                        AbstractC0086a.g(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = q2.f301i;
                r1 = (S) q2.f300h;
                try {
                    AbstractC0086a.I(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                AbstractC0086a.g(fileInputStream, null);
                return obj;
            }
        }
        q2 = new Q(s2, bVar);
        Object obj2 = q2.f302j;
        r1 = q2.f304l;
        I.g gVar2 = I.g.f521a;
        boolean z22 = true;
        H0.a aVar2 = H0.a.f511e;
        if (r1 != 0) {
        }
        AbstractC0086a.g(fileInputStream, null);
        return obj2;
    }

    @Override // F.InterfaceC0020b
    public final void close() {
        this.f306b.set(true);
    }
}
