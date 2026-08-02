package I;

import a.AbstractC0132a;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0067b {

    /* renamed from: a, reason: collision with root package name */
    public final File f608a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f609b;

    /* renamed from: c, reason: collision with root package name */
    public final U f610c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f611d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.d f612e;

    public Y(File file, j0 j0Var, U u2) {
        Q0.h.e(j0Var, "coordinator");
        this.f608a = file;
        this.f609b = j0Var;
        this.f610c = u2;
        this.f611d = new AtomicBoolean(false);
        this.f612e = g1.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:21:0x0078, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [I.Y] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [I.W, J0.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [I.Y] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [I.s] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0083s c0083s, J0.b bVar) {
        ?? r02;
        int i2;
        S s2;
        Throwable th;
        Y y2;
        boolean z2;
        try {
            if (bVar instanceof W) {
                W w2 = (W) bVar;
                int i3 = w2.f600m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    w2.f600m = i3 - Integer.MIN_VALUE;
                    r02 = w2;
                    Object obj = r02.f598k;
                    I0.a aVar = I0.a.f733e;
                    i2 = r02.f600m;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        if (this.f611d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d2 = this.f612e.d(null);
                        try {
                            S s3 = new S(this.f608a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d2);
                                r02.f595h = this;
                                r02.f596i = s3;
                                r02.f597j = d2;
                                r02.f600m = 1;
                                Object p2 = c0083s.p(s3, valueOf, r02);
                                if (p2 == aVar) {
                                    return aVar;
                                }
                                y2 = this;
                                s2 = s3;
                                obj = p2;
                                z2 = d2;
                            } catch (Throwable th2) {
                                r02 = this;
                                s2 = s3;
                                th = th2;
                                c0083s = d2;
                                s2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            c0083s = d2;
                            if (c0083s != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0083s = r02.f597j;
                        s2 = r02.f596i;
                        r02 = r02.f595h;
                        try {
                            i1.a.G(obj);
                            y2 = r02;
                            z2 = c0083s;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                s2.close();
                            } catch (Throwable th5) {
                                AbstractC0132a.c(th, th5);
                            }
                            throw th;
                        }
                    }
                    s2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z2) {
                        y2.f612e.e(null);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            s2.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (c0083s != 0) {
                r02.f612e.e(null);
            }
            throw th;
        }
        r02 = new W(this, bVar);
        Object obj2 = r02.f598k;
        I0.a aVar2 = I0.a.f733e;
        i2 = r02.f600m;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(6:(2:3|(10:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(4:64|(2:66|(2:68|69))|70|(1:72)(1:73))(2:74|75))|45|46|47|48|49|(1:51)(5:52|14|15|16|(0)(0))))|46|47|48|49|(0)(0))|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O o2, J0.b bVar) {
        X x2;
        I0.a aVar;
        ?? r3;
        File file;
        Y y2;
        g1.a aVar2;
        P0.p pVar;
        a0 a0Var;
        Throwable th;
        a0 a0Var2;
        File file2;
        Y y3;
        try {
            try {
                try {
                    if (bVar instanceof X) {
                        x2 = (X) bVar;
                        int i2 = x2.f607n;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            x2.f607n = i2 - Integer.MIN_VALUE;
                            Object obj = x2.f605l;
                            aVar = I0.a.f733e;
                            r3 = x2.f607n;
                            if (r3 != 0) {
                                i1.a.G(obj);
                                if (this.f611d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f608a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                x2.f601h = this;
                                x2.f602i = o2;
                                g1.d dVar = this.f612e;
                                x2.f603j = dVar;
                                x2.f607n = 1;
                                if (dVar.c(x2) == aVar) {
                                    return aVar;
                                }
                                y2 = this;
                                aVar2 = dVar;
                                pVar = o2;
                            } else {
                                if (r3 != 1) {
                                    if (r3 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a0Var2 = x2.f604k;
                                    file2 = (File) x2.f603j;
                                    aVar2 = (g1.a) x2.f602i;
                                    y3 = x2.f601h;
                                    try {
                                        i1.a.G(obj);
                                        try {
                                            a0Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            File file4 = y3.f608a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0066a.a(file2, file4) : file2.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file2 + " to " + y3.f608a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((g1.d) aVar2).e(null);
                                        return F0.h.f469a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            a0Var2.close();
                                        } catch (Throwable th4) {
                                            AbstractC0132a.c(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                g1.a aVar3 = (g1.a) x2.f603j;
                                P0.p pVar2 = (P0.p) x2.f602i;
                                y2 = x2.f601h;
                                i1.a.G(obj);
                                aVar2 = aVar3;
                                pVar = pVar2;
                            }
                            file = new File(y2.f608a.getAbsolutePath() + ".tmp");
                            a0Var = new a0(file);
                            x2.f601h = y2;
                            x2.f602i = aVar2;
                            x2.f603j = file;
                            x2.f604k = a0Var;
                            x2.f607n = 2;
                            if (pVar.h(a0Var, x2) != aVar) {
                                return aVar;
                            }
                            file2 = file;
                            y3 = y2;
                            a0Var2 = a0Var;
                            a0Var2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                    }
                    x2.f601h = y2;
                    x2.f602i = aVar2;
                    x2.f603j = file;
                    x2.f604k = a0Var;
                    x2.f607n = 2;
                    if (pVar.h(a0Var, x2) != aVar) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    a0Var2 = a0Var;
                    a0Var2.close();
                    throw th;
                }
                a0Var = new a0(file);
            } catch (IOException e2) {
                e = e2;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r3 != 0) {
            }
            file = new File(y2.f608a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            ((g1.d) r3).e(null);
            throw th6;
        }
        x2 = new X(this, bVar);
        Object obj2 = x2.f605l;
        aVar = I0.a.f733e;
        r3 = x2.f607n;
    }

    @Override // I.InterfaceC0067b
    public final void close() {
        this.f611d.set(true);
        this.f610c.g();
    }
}
