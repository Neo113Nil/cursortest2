package P;

import R5.C0164d;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class Z implements InterfaceC0136a {

    /* renamed from: a, reason: collision with root package name */
    public final File f2055a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2056b;

    /* renamed from: c, reason: collision with root package name */
    public final V f2057c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2058d;

    /* renamed from: e, reason: collision with root package name */
    public final v6.c f2059e;

    public Z(File file, l0 coordinator, V onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        T.g serializer = T.g.f2557a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f2055a = file;
        this.f2056b = coordinator;
        this.f2057c = onClose;
        this.f2058d = new AtomicBoolean(false);
        this.f2059e = new v6.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:21:0x0078, B:28:0x0089, B:31:0x0086, B:27:0x0081), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [P.Z] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [P.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [P.Z] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [P.r] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, X5.c cVar) {
        ?? r0;
        int i2;
        Throwable th;
        T t6;
        boolean z7;
        Z z8;
        try {
            if (cVar instanceof X) {
                X x7 = (X) cVar;
                int i5 = x7.f2047n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    x7.f2047n = i5 - Integer.MIN_VALUE;
                    r0 = x7;
                    Object obj = r0.f2045l;
                    W5.a aVar = W5.a.f2787d;
                    i2 = r0.f2047n;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        if (this.f2058d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d7 = this.f2059e.d();
                        try {
                            T t7 = new T(this.f2055a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d7);
                                r0.f2042d = this;
                                r0.f2043e = t7;
                                r0.f2044i = d7;
                                r0.f2047n = 1;
                                Object invoke = rVar.invoke(t7, valueOf, r0);
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                obj = invoke;
                                z7 = d7;
                                z8 = this;
                                t6 = t7;
                            } catch (Throwable th2) {
                                th = th2;
                                rVar = d7;
                                r0 = this;
                                t6 = t7;
                                t6.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            rVar = d7;
                            r0 = this;
                            if (rVar != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = r0.f2044i;
                        t6 = r0.f2043e;
                        r0 = r0.f2042d;
                        try {
                            V6.b.P(obj);
                            z8 = r0;
                            z7 = rVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                t6.close();
                            } catch (Throwable th5) {
                                C0164d.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    t6.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z7) {
                        z8.f2059e.e(null);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            t6.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (rVar != 0) {
                r0.f2059e.e(null);
            }
            throw th;
        }
        r0 = new X(this, cVar);
        Object obj2 = r0.f2045l;
        W5.a aVar2 = W5.a.f2787d;
        i2 = r0.f2047n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9 A[Catch: all -> 0x012e, IOException -> 0x0130, TRY_ENTER, TryCatch #3 {IOException -> 0x0130, blocks: (B:19:0x00e9, B:21:0x00ef, B:23:0x0101, B:26:0x010d, B:27:0x012d, B:29:0x0106, B:33:0x013d, B:40:0x014a, B:43:0x0147), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d A[Catch: all -> 0x012e, IOException -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0130, blocks: (B:19:0x00e9, B:21:0x00ef, B:23:0x0101, B:26:0x010d, B:27:0x012d, B:29:0x0106, B:33:0x013d, B:40:0x014a, B:43:0x0147), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(P p7, X5.c cVar) {
        Y y7;
        W5.a aVar;
        int i2;
        File file;
        Z z7;
        InterfaceC0979a interfaceC0979a;
        Function2 function2;
        b0 b0Var;
        Throwable th;
        b0 b0Var2;
        File file2;
        Z z8;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof Y) {
                            y7 = (Y) cVar;
                            int i5 = y7.f2054o;
                            if ((i5 & Integer.MIN_VALUE) != 0) {
                                y7.f2054o = i5 - Integer.MIN_VALUE;
                                Object obj = y7.f2052m;
                                aVar = W5.a.f2787d;
                                i2 = y7.f2054o;
                                if (i2 != 0) {
                                    V6.b.P(obj);
                                    if (this.f2058d.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File file3 = this.f2055a;
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file3);
                                        }
                                    }
                                    y7.f2048d = this;
                                    y7.f2049e = p7;
                                    v6.c cVar2 = this.f2059e;
                                    y7.f2050i = cVar2;
                                    y7.f2054o = 1;
                                    if (cVar2.c(y7) != aVar) {
                                        z7 = this;
                                        interfaceC0979a = cVar2;
                                        function2 = p7;
                                    }
                                    return aVar;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    b0Var2 = y7.f2051l;
                                    file2 = (File) y7.f2050i;
                                    interfaceC0979a = (InterfaceC0979a) y7.f2049e;
                                    z8 = y7.f2048d;
                                    try {
                                        V6.b.P(obj);
                                        Unit unit = Unit.f6114a;
                                        try {
                                            b0Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File toFile = z8.f2055a;
                                            Intrinsics.checkNotNullParameter(file2, "<this>");
                                            Intrinsics.checkNotNullParameter(toFile, "toFile");
                                            if (!(Build.VERSION.SDK_INT >= 26 ? C.a.e(file2, toFile) : file2.renameTo(toFile))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + z8.f2055a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        Unit unit2 = Unit.f6114a;
                                        ((v6.c) interfaceC0979a).e(null);
                                        return Unit.f6114a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            b0Var2.close();
                                        } catch (Throwable th4) {
                                            C0164d.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                InterfaceC0979a interfaceC0979a2 = (InterfaceC0979a) y7.f2050i;
                                Function2 function22 = (Function2) y7.f2049e;
                                z7 = y7.f2048d;
                                V6.b.P(obj);
                                interfaceC0979a = interfaceC0979a2;
                                function2 = function22;
                                file = new File(z7.f2055a.getAbsolutePath() + ".tmp");
                                T.g serializer = T.g.f2557a;
                                Intrinsics.checkNotNullParameter(file, "file");
                                Intrinsics.checkNotNullParameter(serializer, "serializer");
                                b0Var = new b0(file);
                                y7.f2048d = z7;
                                y7.f2049e = interfaceC0979a;
                                y7.f2050i = file;
                                y7.f2051l = b0Var;
                                y7.f2054o = 2;
                                if (function2.invoke(b0Var, y7) != aVar) {
                                    file2 = file;
                                    z8 = z7;
                                    b0Var2 = b0Var;
                                    Unit unit3 = Unit.f6114a;
                                    b0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        y7.f2048d = z7;
                        y7.f2049e = interfaceC0979a;
                        y7.f2050i = file;
                        y7.f2051l = b0Var;
                        y7.f2054o = 2;
                        if (function2.invoke(b0Var, y7) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        b0Var2 = b0Var;
                        b0Var2.close();
                        throw th;
                    }
                    T.g serializer2 = T.g.f2557a;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(serializer2, "serializer");
                    b0Var = new b0(file);
                } catch (IOException e7) {
                    e = e7;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(z7.f2055a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ((v6.c) interfaceC0979a).e(null);
                throw th6;
            }
            if (i2 != 0) {
            }
        } catch (IOException e8) {
            e = e8;
            file = aVar;
        }
        y7 = new Y(this, cVar);
        Object obj2 = y7.f2052m;
        aVar = W5.a.f2787d;
        i2 = y7.f2054o;
    }

    @Override // P.InterfaceC0136a
    public final void close() {
        this.f2058d.set(true);
        this.f2057c.invoke();
    }
}
