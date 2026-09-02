package K;

import E.AbstractC0012m;
import android.os.Build;
import c3.C0297i;
import g3.EnumC0441a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class U implements InterfaceC0052a {

    /* renamed from: a, reason: collision with root package name */
    public final File f1310a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f1311b;

    /* renamed from: c, reason: collision with root package name */
    public final G3.k f1312c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1313d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.d f1314e;

    public U(File file, g0 coordinator, G3.k kVar) {
        kotlin.jvm.internal.i.e(coordinator, "coordinator");
        this.f1310a = file;
        this.f1311b = coordinator;
        this.f1312c = kVar;
        this.f1313d = new AtomicBoolean(false);
        this.f1314e = new F3.d();
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
    /* JADX WARN: Type inference failed for: r0v13, types: [K.U] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.S, h3.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K.U] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [K.q] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0068q c0068q, h3.c cVar) {
        ?? r02;
        int i4;
        Throwable th;
        O o;
        boolean z;
        U u4;
        try {
            if (cVar instanceof S) {
                S s4 = (S) cVar;
                int i5 = s4.f1302f;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    s4.f1302f = i5 - Integer.MIN_VALUE;
                    r02 = s4;
                    Object obj = r02.f1300d;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = r02.f1302f;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        if (this.f1313d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d4 = this.f1314e.d();
                        try {
                            O o4 = new O(this.f1310a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d4);
                                r02.f1297a = this;
                                r02.f1298b = o4;
                                r02.f1299c = d4;
                                r02.f1302f = 1;
                                Object a3 = c0068q.a(o4, valueOf, r02);
                                if (a3 == enumC0441a) {
                                    return enumC0441a;
                                }
                                obj = a3;
                                z = d4;
                                u4 = this;
                                o = o4;
                            } catch (Throwable th2) {
                                th = th2;
                                c0068q = d4;
                                r02 = this;
                                o = o4;
                                o.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c0068q = d4;
                            r02 = this;
                            if (c0068q != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0068q = r02.f1299c;
                        o = r02.f1298b;
                        r02 = r02.f1297a;
                        try {
                            O3.l.w(obj);
                            u4 = r02;
                            z = c0068q;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                o.close();
                            } catch (Throwable th5) {
                                O3.d.c(th, th5);
                            }
                            throw th;
                        }
                    }
                    o.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z) {
                        u4.f1314e.e(null);
                    }
                    return obj;
                }
            }
            if (i4 != 0) {
            }
            o.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (c0068q != 0) {
                r02.f1314e.e(null);
            }
            throw th;
        }
        r02 = new S(this, cVar);
        Object obj2 = r02.f1300d;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = r02.f1302f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(5:64|(2:66|(2:68|69))|70|(1:72)|51)(2:73|74))|45|46|47|48|49|(5:52|14|15|16|(0)(0))|51))|46|47|48|49|(0)|51)|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(L l4, h3.c cVar) {
        T t4;
        EnumC0441a enumC0441a;
        ?? r32;
        File file;
        U u4;
        F3.a aVar;
        o3.p pVar;
        W w4;
        Throwable th;
        W w5;
        File file2;
        U u5;
        try {
            try {
                try {
                    if (cVar instanceof T) {
                        t4 = (T) cVar;
                        int i4 = t4.f1309g;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            t4.f1309g = i4 - Integer.MIN_VALUE;
                            Object obj = t4.f1307e;
                            enumC0441a = EnumC0441a.f9038a;
                            r32 = t4.f1309g;
                            if (r32 != 0) {
                                O3.l.w(obj);
                                if (this.f1313d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f1310a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                t4.f1303a = this;
                                t4.f1304b = l4;
                                F3.d dVar = this.f1314e;
                                t4.f1305c = dVar;
                                t4.f1309g = 1;
                                if (dVar.c(t4) != enumC0441a) {
                                    u4 = this;
                                    aVar = dVar;
                                    pVar = l4;
                                }
                                return enumC0441a;
                            }
                            if (r32 != 1) {
                                if (r32 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                w5 = t4.f1306d;
                                file2 = (File) t4.f1305c;
                                aVar = (F3.a) t4.f1304b;
                                u5 = t4.f1303a;
                                try {
                                    O3.l.w(obj);
                                    try {
                                        w5.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        File file4 = u5.f1310a;
                                        if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0012m.e(file2, file4) : file2.renameTo(file4))) {
                                            throw new IOException("Unable to rename " + file2 + " to " + u5.f1310a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    ((F3.d) aVar).e(null);
                                    return C0297i.f5732a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        w5.close();
                                    } catch (Throwable th4) {
                                        O3.d.c(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            F3.a aVar2 = (F3.a) t4.f1305c;
                            o3.p pVar2 = (o3.p) t4.f1304b;
                            u4 = t4.f1303a;
                            O3.l.w(obj);
                            aVar = aVar2;
                            pVar = pVar2;
                            file = new File(u4.f1310a.getAbsolutePath() + ".tmp");
                            w4 = new W(file);
                            t4.f1303a = u4;
                            t4.f1304b = aVar;
                            t4.f1305c = file;
                            t4.f1306d = w4;
                            t4.f1309g = 2;
                            if (pVar.invoke(w4, t4) != enumC0441a) {
                                file2 = file;
                                u5 = u4;
                                w5 = w4;
                                w5.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return enumC0441a;
                        }
                    }
                    t4.f1303a = u4;
                    t4.f1304b = aVar;
                    t4.f1305c = file;
                    t4.f1306d = w4;
                    t4.f1309g = 2;
                    if (pVar.invoke(w4, t4) != enumC0441a) {
                    }
                    return enumC0441a;
                } catch (Throwable th5) {
                    th = th5;
                    w5 = w4;
                    w5.close();
                    throw th;
                }
                w4 = new W(file);
            } catch (IOException e4) {
                e = e4;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r32 != 0) {
            }
            file = new File(u4.f1310a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            ((F3.d) r32).e(null);
            throw th6;
        }
        t4 = new T(this, cVar);
        Object obj2 = t4.f1307e;
        enumC0441a = EnumC0441a.f9038a;
        r32 = t4.f1309g;
    }

    @Override // K.InterfaceC0052a
    public final void close() {
        this.f1313d.set(true);
        this.f1312c.invoke();
    }
}
