package M;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public class S implements InterfaceC0073b {

    /* renamed from: a, reason: collision with root package name */
    public final File f1630a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1631b = new AtomicBoolean(false);

    public S(File file) {
        this.f1630a = file;
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
    /* JADX WARN: Type inference failed for: r2v9, types: [M.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(S s2, AbstractC1295c abstractC1295c) {
        Q q5;
        ?? r22;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (abstractC1295c instanceof Q) {
            q5 = (Q) abstractC1295c;
            int i2 = q5.f1629e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q5.f1629e = i2 - Integer.MIN_VALUE;
                Object obj = q5.f1627c;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                r22 = q5.f1629e;
                P.g gVar = P.g.f2275a;
                boolean z = true;
                if (r22 != 0) {
                    e5.g.y(obj);
                    if (s2.f1631b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(s2.f1630a);
                        try {
                            q5.f1625a = s2;
                            q5.f1626b = fileInputStream2;
                            q5.f1629e = 1;
                            P.b a6 = gVar.a(fileInputStream2);
                            if (a6 == enumC1260a) {
                                return enumC1260a;
                            }
                            fileInputStream = fileInputStream2;
                            obj = a6;
                        } catch (Throwable th3) {
                            r22 = s2;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!s2.f1630a.exists()) {
                            return new P.b(z);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(s2.f1630a);
                        try {
                            q5.f1625a = fileInputStream3;
                            q5.f1626b = null;
                            q5.f1629e = 2;
                            P.b a7 = gVar.a(fileInputStream3);
                            if (a7 == enumC1260a) {
                                return enumC1260a;
                            }
                            obj = a7;
                            closeable = fileInputStream3;
                            AbstractC1477a.e(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                } else {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) q5.f1625a;
                        try {
                            e5.g.y(obj);
                            AbstractC1477a.e(closeable, null);
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    fileInputStream = q5.f1626b;
                    r22 = (S) q5.f1625a;
                    try {
                        e5.g.y(obj);
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                AbstractC1477a.e(fileInputStream, null);
                return obj;
            }
        }
        q5 = new Q(s2, abstractC1295c);
        Object obj2 = q5.f1627c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        r22 = q5.f1629e;
        P.g gVar2 = P.g.f2275a;
        boolean z5 = true;
        if (r22 != 0) {
        }
        AbstractC1477a.e(fileInputStream, null);
        return obj2;
    }

    @Override // M.InterfaceC0073b
    public final void close() {
        this.f1631b.set(true);
    }
}
