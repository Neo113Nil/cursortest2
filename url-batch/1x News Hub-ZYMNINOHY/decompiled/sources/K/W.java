package K;

import E.AbstractC0005f;
import a.AbstractC0129a;
import android.os.Build;
import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class W implements InterfaceC0037a {

    /* renamed from: a, reason: collision with root package name */
    public final File f729a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f730b;

    /* renamed from: c, reason: collision with root package name */
    public final S f731c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f732d;

    /* renamed from: e, reason: collision with root package name */
    public final B2.d f733e;

    public W(File file, h0 coordinator, S s3) {
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.f729a = file;
        this.f730b = coordinator;
        this.f731c = s3;
        this.f732d = new AtomicBoolean(false);
        this.f733e = new B2.d();
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
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [K.W] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.U, f2.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K.W] */
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
    public final Object a(C0053q c0053q, AbstractC0326c abstractC0326c) {
        ?? r02;
        int i3;
        Throwable th;
        P p3;
        boolean z;
        W w3;
        try {
            if (abstractC0326c instanceof U) {
                U u3 = (U) abstractC0326c;
                int i4 = u3.f722i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    u3.f722i = i4 - Integer.MIN_VALUE;
                    r02 = u3;
                    Object obj = r02.f720g;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = r02.f722i;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        if (this.f732d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d3 = this.f733e.d();
                        try {
                            P p4 = new P(this.f729a);
                            try {
                                Boolean valueOf = Boolean.valueOf(d3);
                                r02.f718d = this;
                                r02.f719e = p4;
                                r02.f = d3;
                                r02.f722i = 1;
                                Object i5 = c0053q.i(p4, valueOf, r02);
                                if (i5 == enumC0317a) {
                                    return enumC0317a;
                                }
                                obj = i5;
                                z = d3;
                                w3 = this;
                                p3 = p4;
                            } catch (Throwable th2) {
                                th = th2;
                                c0053q = d3;
                                r02 = this;
                                p3 = p4;
                                p3.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c0053q = d3;
                            r02 = this;
                            if (c0053q != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0053q = r02.f;
                        p3 = r02.f719e;
                        r02 = r02.f718d;
                        try {
                            android.support.v4.media.session.a.T(obj);
                            w3 = r02;
                            z = c0053q;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                p3.close();
                            } catch (Throwable th5) {
                                AbstractC0129a.e(th, th5);
                            }
                            throw th;
                        }
                    }
                    p3.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z) {
                        w3.f733e.e(null);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            p3.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (c0053q != 0) {
                r02.f733e.e(null);
            }
            throw th;
        }
        r02 = new U(this, abstractC0326c);
        Object obj2 = r02.f720g;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = r02.f722i;
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
    public final Object b(M m3, AbstractC0326c abstractC0326c) {
        V v;
        EnumC0317a enumC0317a;
        ?? r3;
        File file;
        W w3;
        B2.a aVar;
        l2.p pVar;
        Y y3;
        Throwable th;
        Y y4;
        File file2;
        W w4;
        try {
            try {
                try {
                    if (abstractC0326c instanceof V) {
                        v = (V) abstractC0326c;
                        int i3 = v.f728j;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            v.f728j = i3 - Integer.MIN_VALUE;
                            Object obj = v.f726h;
                            enumC0317a = EnumC0317a.f4969a;
                            r3 = v.f728j;
                            if (r3 != 0) {
                                android.support.v4.media.session.a.T(obj);
                                if (this.f732d.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File file3 = this.f729a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                v.f723d = this;
                                v.f724e = m3;
                                B2.d dVar = this.f733e;
                                v.f = dVar;
                                v.f728j = 1;
                                if (dVar.c(v) != enumC0317a) {
                                    w3 = this;
                                    aVar = dVar;
                                    pVar = m3;
                                }
                                return enumC0317a;
                            }
                            if (r3 != 1) {
                                if (r3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y4 = v.f725g;
                                file2 = (File) v.f;
                                aVar = (B2.a) v.f724e;
                                w4 = v.f723d;
                                try {
                                    android.support.v4.media.session.a.T(obj);
                                    try {
                                        y4.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        File file4 = w4.f729a;
                                        if (!(Build.VERSION.SDK_INT >= 26 ? AbstractC0005f.e(file2, file4) : file2.renameTo(file4))) {
                                            throw new IOException("Unable to rename " + file2 + " to " + w4.f729a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    ((B2.d) aVar).e(null);
                                    return C0195i.f2555a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        y4.close();
                                    } catch (Throwable th4) {
                                        AbstractC0129a.e(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            B2.a aVar2 = (B2.a) v.f;
                            l2.p pVar2 = (l2.p) v.f724e;
                            w3 = v.f723d;
                            android.support.v4.media.session.a.T(obj);
                            aVar = aVar2;
                            pVar = pVar2;
                            file = new File(w3.f729a.getAbsolutePath() + ".tmp");
                            y3 = new Y(file);
                            v.f723d = w3;
                            v.f724e = aVar;
                            v.f = file;
                            v.f725g = y3;
                            v.f728j = 2;
                            if (pVar.invoke(y3, v) != enumC0317a) {
                                file2 = file;
                                w4 = w3;
                                y4 = y3;
                                y4.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return enumC0317a;
                        }
                    }
                    v.f723d = w3;
                    v.f724e = aVar;
                    v.f = file;
                    v.f725g = y3;
                    v.f728j = 2;
                    if (pVar.invoke(y3, v) != enumC0317a) {
                    }
                    return enumC0317a;
                } catch (Throwable th5) {
                    th = th5;
                    y4 = y3;
                    y4.close();
                    throw th;
                }
                y3 = new Y(file);
            } catch (IOException e3) {
                e = e3;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r3 != 0) {
            }
            file = new File(w3.f729a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            ((B2.d) r3).e(null);
            throw th6;
        }
        v = new V(this, abstractC0326c);
        Object obj2 = v.f726h;
        enumC0317a = EnumC0317a.f4969a;
        r3 = v.f728j;
    }

    @Override // K.InterfaceC0037a
    public final void close() {
        this.f732d.set(true);
        this.f731c.invoke();
    }
}
