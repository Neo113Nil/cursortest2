package F;

import a.AbstractC0086a;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0020b {

    /* renamed from: a, reason: collision with root package name */
    public final File f327a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f328b;

    /* renamed from: c, reason: collision with root package name */
    public final U f329c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f330d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.d f331e;

    public Y(File file, k0 k0Var, U u2) {
        P0.h.e(k0Var, "coordinator");
        this.f327a = file;
        this.f328b = k0Var;
        this.f329c = u2;
        this.f330d = new AtomicBoolean(false);
        this.f331e = new e1.d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:54|55))|13|14|15|(2:(1:18)|19)(1:21)))|57|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0078, blocks: (B:21:0x0077, B:28:0x0087, B:31:0x0084, B:27:0x007f), top: B:7:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [F.Y] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [F.W, I0.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [F.Y] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [F.s] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0036s c0036s, I0.b bVar) {
        ?? r02;
        int i2;
        S s2;
        Throwable th;
        boolean z2;
        Y y2;
        try {
            if (bVar instanceof W) {
                W w2 = (W) bVar;
                int i3 = w2.f319m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    w2.f319m = i3 - Integer.MIN_VALUE;
                    r02 = w2;
                    Object obj = r02.f317k;
                    i2 = r02.f319m;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        if (this.f330d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d2 = this.f331e.d();
                        try {
                            s2 = new S(this.f327a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d2);
                                r02.f314h = this;
                                r02.f315i = s2;
                                r02.f316j = d2;
                                r02.f319m = 1;
                                Object k2 = c0036s.k(s2, valueOf, r02);
                                H0.a aVar = H0.a.f511e;
                                if (k2 == aVar) {
                                    return aVar;
                                }
                                obj = k2;
                                z2 = d2;
                                y2 = this;
                            } catch (Throwable th2) {
                                th = th2;
                                c0036s = d2;
                                r02 = this;
                                s2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c0036s = d2;
                            r02 = this;
                            if (c0036s != 0) {
                                r02.f331e.e(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0036s = r02.f316j;
                        s2 = r02.f315i;
                        r02 = r02.f314h;
                        try {
                            AbstractC0086a.I(obj);
                            y2 = r02;
                            z2 = c0036s;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                s2.close();
                            } catch (Throwable th5) {
                                AbstractC0086a.c(th, th5);
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
                        y2.f331e.e(null);
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
            if (c0036s != 0) {
            }
            throw th;
        }
        r02 = new W(this, bVar);
        Object obj2 = r02.f317k;
        i2 = r02.f319m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9 A[Catch: all -> 0x0114, IOException -> 0x0117, TRY_ENTER, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:18:0x00d9, B:20:0x00df, B:22:0x00e7, B:25:0x00f3, B:26:0x0113, B:28:0x00ec, B:31:0x0122, B:38:0x012f, B:41:0x012c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122 A[Catch: all -> 0x0114, IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:18:0x00d9, B:20:0x00df, B:22:0x00e7, B:25:0x00f3, B:26:0x0113, B:28:0x00ec, B:31:0x0122, B:38:0x012f, B:41:0x012c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v28, types: [e1.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O o2, I0.b bVar) {
        X x2;
        Object obj;
        ?? r2;
        H0.a aVar;
        e1.d dVar;
        Y y2;
        O0.p pVar;
        a0 a0Var;
        Throwable th;
        a0 a0Var2;
        e1.a aVar2;
        Y y3;
        File file;
        try {
            try {
                try {
                    try {
                        if (bVar instanceof X) {
                            x2 = (X) bVar;
                            int i2 = x2.f326n;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                x2.f326n = i2 - Integer.MIN_VALUE;
                                obj = x2.f324l;
                                r2 = x2.f326n;
                                aVar = H0.a.f511e;
                                if (r2 != 0) {
                                    AbstractC0086a.I(obj);
                                    if (this.f330d.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File file2 = this.f327a;
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file2);
                                        }
                                    }
                                    x2.f320h = this;
                                    x2.f321i = o2;
                                    dVar = this.f331e;
                                    x2.f322j = dVar;
                                    x2.f326n = 1;
                                    if (dVar.c(x2) != aVar) {
                                        y2 = this;
                                        pVar = o2;
                                    }
                                    return aVar;
                                }
                                if (r2 != 1) {
                                    if (r2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a0Var2 = x2.f323k;
                                    File file3 = (File) x2.f322j;
                                    aVar2 = (e1.a) x2.f321i;
                                    y3 = x2.f320h;
                                    try {
                                        AbstractC0086a.I(obj);
                                        file = file3;
                                        try {
                                            a0Var2.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file.exists()) {
                                            File file4 = y3.f327a;
                                            if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0019a.a(file, file4) : file.renameTo(file4))) {
                                                throw new IOException("Unable to rename " + file + " to " + y3.f327a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((e1.d) aVar2).e(null);
                                        return D0.h.f206a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            a0Var2.close();
                                        } catch (Throwable th4) {
                                            AbstractC0086a.c(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                ?? r10 = (e1.a) x2.f322j;
                                O0.p pVar2 = (O0.p) x2.f321i;
                                y2 = x2.f320h;
                                AbstractC0086a.I(obj);
                                dVar = r10;
                                pVar = pVar2;
                                r2 = new File(y2.f327a.getAbsolutePath() + ".tmp");
                                a0Var = new a0(r2);
                                x2.f320h = y2;
                                x2.f321i = dVar;
                                x2.f322j = r2;
                                x2.f323k = a0Var;
                                x2.f326n = 2;
                                if (pVar.i(a0Var, x2) != aVar) {
                                    aVar2 = dVar;
                                    y3 = y2;
                                    a0Var2 = a0Var;
                                    file = r2;
                                    a0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        x2.f320h = y2;
                        x2.f321i = dVar;
                        x2.f322j = r2;
                        x2.f323k = a0Var;
                        x2.f326n = 2;
                        if (pVar.i(a0Var, x2) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        a0Var2 = a0Var;
                        a0Var2.close();
                        throw th;
                    }
                    a0Var = new a0(r2);
                } catch (IOException e2) {
                    e = e2;
                    if (r2.exists()) {
                        r2.delete();
                    }
                    throw e;
                }
                if (r2 != 0) {
                }
                r2 = new File(y2.f327a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                ((e1.d) obj).e(null);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th7) {
            th = th7;
            obj = 2;
            ((e1.d) obj).e(null);
            throw th;
        }
        x2 = new X(this, bVar);
        obj = x2.f324l;
        r2 = x2.f326n;
        aVar = H0.a.f511e;
    }

    @Override // F.InterfaceC0020b
    public final void close() {
        this.f330d.set(true);
        this.f329c.h();
    }
}
