package y3;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f8876a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8877b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.m0 f8878c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8879d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.c f8880e;

    public h0(File file, r0 r0Var, androidx.lifecycle.m0 m0Var) {
        q6.i.e(r0Var, "coordinator");
        this.f8876a = file;
        this.f8877b = r0Var;
        this.f8878c = m0Var;
        this.f8879d = new AtomicBoolean(false);
        this.f8880e = new i7.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:54|55))|13|14|15|(2:(1:18)|19)(1:21)))|57|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:21:0x0071, B:28:0x0081, B:31:0x007e, B:27:0x0079), top: B:7:0x0020, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v0, types: [y3.n] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n nVar, i6.c cVar) {
        f0 f0Var;
        int i;
        Throwable th;
        d0 d0Var;
        boolean z3;
        try {
            if (cVar instanceof f0) {
                f0Var = (f0) cVar;
                int i8 = f0Var.f8866k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    f0Var.f8866k = i8 - Integer.MIN_VALUE;
                    Object obj = f0Var.i;
                    i = f0Var.f8866k;
                    i7.c cVar2 = this.f8880e;
                    if (i != 0) {
                        s6.a.K(obj);
                        if (this.f8879d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean e8 = cVar2.e();
                        try {
                            d0 d0Var2 = new d0(this.f8876a);
                            try {
                                Boolean valueOf = Boolean.valueOf(e8);
                                f0Var.f8864h = d0Var2;
                                f0Var.f8863g = e8;
                                f0Var.f8866k = 1;
                                Object d8 = nVar.d(d0Var2, valueOf, f0Var);
                                h6.a aVar = h6.a.f3204d;
                                if (d8 == aVar) {
                                    return aVar;
                                }
                                obj = d8;
                                z3 = e8;
                                d0Var = d0Var2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = e8;
                                d0Var = d0Var2;
                                d0Var.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            nVar = e8;
                            if (nVar != 0) {
                                cVar2.f(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar = f0Var.f8863g;
                        d0Var = f0Var.f8864h;
                        try {
                            s6.a.K(obj);
                            z3 = nVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                d0Var.close();
                            } catch (Throwable th5) {
                                s6.a.e(th, th5);
                            }
                            throw th;
                        }
                    }
                    d0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z3) {
                        cVar2.f(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            d0Var.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
        }
        f0Var = new f0(this, cVar);
        Object obj2 = f0Var.i;
        i = f0Var.f8866k;
        i7.c cVar22 = this.f8880e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0092, code lost:
    
        if (r11.d(r1) == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[Catch: all -> 0x0104, IOException -> 0x0107, TRY_ENTER, TryCatch #8 {IOException -> 0x0107, all -> 0x0104, blocks: (B:18:0x00cd, B:20:0x00d3, B:22:0x00d9, B:25:0x00e5, B:26:0x0103, B:28:0x00de, B:31:0x0112, B:38:0x011f, B:41:0x011c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112 A[Catch: all -> 0x0104, IOException -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0107, all -> 0x0104, blocks: (B:18:0x00cd, B:20:0x00d3, B:22:0x00d9, B:25:0x00e5, B:26:0x0103, B:28:0x00de, B:31:0x0112, B:38:0x011f, B:41:0x011c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v28, types: [i7.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a0 a0Var, i6.c cVar) {
        g0 g0Var;
        Object obj;
        ?? r22;
        h6.a aVar;
        i7.c cVar2;
        p6.e eVar;
        j0 j0Var;
        Throwable th;
        j0 j0Var2;
        i7.a aVar2;
        File file;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof g0) {
                            g0Var = (g0) cVar;
                            int i = g0Var.f8873l;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                g0Var.f8873l = i - Integer.MIN_VALUE;
                                obj = g0Var.f8871j;
                                r22 = g0Var.f8873l;
                                File file2 = this.f8876a;
                                aVar = h6.a.f3204d;
                                if (r22 != 0) {
                                    s6.a.K(obj);
                                    if (this.f8879d.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file2);
                                        }
                                    }
                                    g0Var.f8869g = a0Var;
                                    cVar2 = this.f8880e;
                                    g0Var.f8870h = cVar2;
                                    g0Var.f8873l = 1;
                                    eVar = a0Var;
                                } else {
                                    if (r22 != 1) {
                                        if (r22 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        j0Var2 = g0Var.i;
                                        File file3 = (File) g0Var.f8870h;
                                        aVar2 = (i7.a) g0Var.f8869g;
                                        try {
                                            s6.a.K(obj);
                                            file = file3;
                                            try {
                                                j0Var2.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file.exists()) {
                                                if (!(Build.VERSION.SDK_INT >= 26 ? q3.l.f(file, file2) : file.renameTo(file2))) {
                                                    throw new IOException("Unable to rename " + file + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            ((i7.c) aVar2).f(null);
                                            return c6.m.f1757a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                j0Var2.close();
                                            } catch (Throwable th4) {
                                                s6.a.e(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    ?? r10 = (i7.a) g0Var.f8870h;
                                    p6.e eVar2 = (p6.e) g0Var.f8869g;
                                    s6.a.K(obj);
                                    cVar2 = r10;
                                    eVar = eVar2;
                                }
                                r22 = new File(file2.getAbsolutePath() + ".tmp");
                                j0Var = new j0(r22);
                                g0Var.f8869g = cVar2;
                                g0Var.f8870h = r22;
                                g0Var.i = j0Var;
                                g0Var.f8873l = 2;
                                if (eVar.g(j0Var, g0Var) != aVar) {
                                    aVar2 = cVar2;
                                    j0Var2 = j0Var;
                                    file = r22;
                                    j0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        g0Var.f8869g = cVar2;
                        g0Var.f8870h = r22;
                        g0Var.i = j0Var;
                        g0Var.f8873l = 2;
                        if (eVar.g(j0Var, g0Var) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        j0Var2 = j0Var;
                        j0Var2.close();
                        throw th;
                    }
                    j0Var = new j0(r22);
                } catch (IOException e8) {
                    e = e8;
                    if (r22.exists()) {
                        r22.delete();
                    }
                    throw e;
                }
                if (r22 != 0) {
                }
                r22 = new File(file2.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                ((i7.c) obj).f(null);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (Throwable th7) {
            th = th7;
            obj = g0Var;
            ((i7.c) obj).f(null);
            throw th;
        }
        g0Var = new g0(this, cVar);
        obj = g0Var.f8871j;
        r22 = g0Var.f8873l;
        File file22 = this.f8876a;
        aVar = h6.a.f3204d;
    }

    @Override // y3.a
    public final void close() {
        this.f8879d.set(true);
        this.f8878c.b();
    }
}
