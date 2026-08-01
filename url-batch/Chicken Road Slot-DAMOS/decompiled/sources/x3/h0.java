package x3;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f10372a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f10373b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.b f10374c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10375d;

    /* renamed from: e, reason: collision with root package name */
    public final oe.c f10376e;

    public h0(File file, s0 s0Var, a1.b bVar) {
        s0Var.getClass();
        this.f10372a = file;
        this.f10373b = s0Var;
        this.f10374c = bVar;
        this.f10375d = new AtomicBoolean(false);
        this.f10376e = new oe.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: all -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0071, blocks: (B:21:0x0070, B:28:0x0080, B:31:0x007d, B:27:0x0078), top: B:7:0x0022, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [x3.m] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m mVar, nd.c cVar) {
        f0 f0Var;
        int i3;
        Throwable th;
        d0 d0Var;
        boolean z10;
        try {
            if (cVar instanceof f0) {
                f0Var = (f0) cVar;
                int i10 = f0Var.f10360s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    f0Var.f10360s = i10 - Integer.MIN_VALUE;
                    Object obj = f0Var.f10358i;
                    md.a aVar = md.a.f6622d;
                    i3 = f0Var.f10360s;
                    oe.c cVar2 = this.f10376e;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        if (this.f10375d.get()) {
                            kotlin.collections.i0.l("StorageConnection has already been disposed.");
                            return null;
                        }
                        boolean e2 = cVar2.e();
                        try {
                            d0 d0Var2 = new d0(this.f10372a);
                            try {
                                Boolean valueOf = Boolean.valueOf(e2);
                                f0Var.f10357e = d0Var2;
                                f0Var.f10356d = e2;
                                f0Var.f10360s = 1;
                                Object a9 = mVar.a(d0Var2, valueOf, f0Var);
                                if (a9 == aVar) {
                                    return aVar;
                                }
                                obj = a9;
                                z10 = e2;
                                d0Var = d0Var2;
                            } catch (Throwable th2) {
                                th = th2;
                                mVar = e2;
                                d0Var = d0Var2;
                                d0Var.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            mVar = e2;
                            if (mVar != 0) {
                                cVar2.d(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mVar = f0Var.f10356d;
                        d0Var = f0Var.f10357e;
                        try {
                            cf.c.M(obj);
                            z10 = mVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                d0Var.close();
                            } catch (Throwable th5) {
                                hd.b.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    d0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z10) {
                        cVar2.d(null);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            d0Var.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
        }
        f0Var = new f0(this, cVar);
        Object obj2 = f0Var.f10358i;
        md.a aVar2 = md.a.f6622d;
        i3 = f0Var.f10360s;
        oe.c cVar22 = this.f10376e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0091, code lost:
    
        if (r11.a(r1) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[Catch: all -> 0x0104, IOException -> 0x0107, TRY_ENTER, TryCatch #8 {IOException -> 0x0107, all -> 0x0104, blocks: (B:18:0x00cd, B:20:0x00d3, B:22:0x00d9, B:25:0x00e5, B:26:0x0103, B:28:0x00de, B:31:0x0111, B:38:0x011f, B:41:0x011c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111 A[Catch: all -> 0x0104, IOException -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0107, all -> 0x0104, blocks: (B:18:0x00cd, B:20:0x00d3, B:22:0x00d9, B:25:0x00e5, B:26:0x0103, B:28:0x00de, B:31:0x0111, B:38:0x011f, B:41:0x011c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v29, types: [oe.a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [oe.a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y yVar, nd.c cVar) {
        g0 g0Var;
        ?? r11;
        md.a aVar;
        int i3;
        ?? r32;
        oe.c cVar2;
        Function2 function2;
        k0 k0Var;
        Throwable th;
        k0 k0Var2;
        oe.a aVar2;
        File file;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof g0) {
                            g0Var = (g0) cVar;
                            int i10 = g0Var.f10368t;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                g0Var.f10368t = i10 - Integer.MIN_VALUE;
                                r11 = g0Var.f10366r;
                                aVar = md.a.f6622d;
                                i3 = g0Var.f10368t;
                                File file2 = this.f10372a;
                                if (i3 != 0) {
                                    cf.c.M(r11);
                                    if (this.f10375d.get()) {
                                        kotlin.collections.i0.l("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file2);
                                        }
                                    }
                                    g0Var.f10363d = yVar;
                                    cVar2 = this.f10376e;
                                    g0Var.f10364e = cVar2;
                                    g0Var.f10368t = 1;
                                    function2 = yVar;
                                } else {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        k0Var2 = g0Var.f10365i;
                                        file = (File) g0Var.f10364e;
                                        aVar2 = (oe.a) g0Var.f10363d;
                                        try {
                                            cf.c.M(r11);
                                            try {
                                                k0Var2.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file.exists()) {
                                                if (!(Build.VERSION.SDK_INT >= 26 ? e3.j.f(file, file2) : file.renameTo(file2))) {
                                                    throw new IOException("Unable to rename " + file + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            aVar2.d(null);
                                            return Unit.f5554a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                k0Var2.close();
                                            } catch (Throwable th4) {
                                                hd.b.a(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    ?? r10 = (oe.a) g0Var.f10364e;
                                    Function2 function22 = (Function2) g0Var.f10363d;
                                    cf.c.M(r11);
                                    cVar2 = r10;
                                    function2 = function22;
                                }
                                r32 = new File(file2.getAbsolutePath() + ".tmp");
                                k0Var = new k0(r32);
                                g0Var.f10363d = cVar2;
                                g0Var.f10364e = r32;
                                g0Var.f10365i = k0Var;
                                g0Var.f10368t = 2;
                                if (function2.invoke(k0Var, g0Var) != aVar) {
                                    aVar2 = cVar2;
                                    file = r32;
                                    k0Var2 = k0Var;
                                    k0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        g0Var.f10363d = cVar2;
                        g0Var.f10364e = r32;
                        g0Var.f10365i = k0Var;
                        g0Var.f10368t = 2;
                        if (function2.invoke(k0Var, g0Var) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        k0Var2 = k0Var;
                        k0Var2.close();
                        throw th;
                    }
                    k0Var = new k0(r32);
                } catch (IOException e2) {
                    e = e2;
                    if (r32.exists()) {
                        r32.delete();
                    }
                    throw e;
                }
                if (i3 != 0) {
                }
                r32 = new File(file2.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r11.d(null);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            r32 = aVar;
        } catch (Throwable th7) {
            th = th7;
            r11 = g0Var;
            r11.d(null);
            throw th;
        }
        g0Var = new g0(this, cVar);
        r11 = g0Var.f10366r;
        aVar = md.a.f6622d;
        i3 = g0Var.f10368t;
        File file22 = this.f10372a;
    }

    @Override // x3.a
    public final void close() {
        this.f10375d.set(true);
        this.f10374c.invoke();
    }
}
