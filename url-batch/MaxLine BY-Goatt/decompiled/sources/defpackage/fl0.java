package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fl0 implements xu {
    public final File a;
    public final ll2 b;
    public final u c;
    public final AtomicBoolean d;
    public final qo1 e;

    public fl0(File file, ll2 ll2Var, u uVar) {
        ll2Var.getClass();
        this.a = file;
        this.b = ll2Var;
        this.c = uVar;
        this.d = new AtomicBoolean(false);
        this.e = new qo1();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:41|42))(2:43|(5:45|46|47|48|(1:50)(1:51))(2:55|56))|13|14|15|(2:(1:18)|19)(2:21|22)))|58|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [v60] */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v60 v60Var, r30 r30Var) {
        dl0 dl0Var;
        Object obj;
        int i;
        Throwable th;
        al0 al0Var;
        fl0 fl0Var;
        ?? r7;
        Object obj2;
        try {
            if (r30Var instanceof dl0) {
                dl0Var = (dl0) r30Var;
                int i2 = dl0Var.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dl0Var.r = i2 - Integer.MIN_VALUE;
                    obj = dl0Var.p;
                    b50 b50Var = b50.m;
                    i = dl0Var.r;
                    if (i != 0) {
                        ca2.b(obj);
                        if (this.d.get()) {
                            lh.g("StorageConnection has already been disposed.");
                            return null;
                        }
                        ?? g = this.e.g();
                        al0 al0Var2 = new al0(this.a);
                        try {
                            Boolean valueOf = Boolean.valueOf((boolean) g);
                            dl0Var.m = this;
                            dl0Var.n = al0Var2;
                            dl0Var.o = g;
                            dl0Var.r = 1;
                            Object a = v60Var.a(al0Var2, valueOf, dl0Var);
                            if (a == b50Var) {
                                return b50Var;
                            }
                            fl0Var = this;
                            r7 = g == true ? 1 : 0;
                            obj2 = a;
                            al0Var = al0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            al0Var = al0Var2;
                            obj = g;
                            al0Var.close();
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r7 = dl0Var.o;
                        al0Var = dl0Var.n;
                        fl0Var = dl0Var.m;
                        try {
                            ca2.b(obj);
                            obj2 = obj;
                        } catch (Throwable th3) {
                            obj = r7;
                            this = fl0Var;
                            th = th3;
                            try {
                                al0Var.close();
                                throw th;
                            } catch (Throwable th4) {
                                wi0.a(th, th4);
                                throw th;
                            }
                        }
                    }
                    al0Var.close();
                    th = null;
                    if (th != null) {
                        if (r7 != false) {
                            fl0Var.e.b(null);
                        }
                        return obj2;
                    }
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        obj = r7;
                        this = fl0Var;
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            al0Var.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (obj != null) {
                this.e.b(null);
            }
            throw th;
        }
        dl0Var = new dl0(this, r30Var);
        obj = dl0Var.p;
        b50 b50Var2 = b50.m;
        i = dl0Var.r;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(5:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(3:21|(1:23)(1:29)|(1:25)(2:26|27))|30|31|32)(1:33))(2:44|45))(1:46))(2:64|(3:66|(2:68|(2:70|71))|72)(2:74|75))|47|48|49|51|52|(6:55|14|15|16|17|(0)(0))|54))|51|52|(0)|54)|48|49)|7|(0)(0)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0088, code lost:
    
        if (r10.f(r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0109, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb A[Catch: all -> 0x0106, IOException -> 0x0109, TRY_ENTER, TryCatch #0 {IOException -> 0x0109, blocks: (B:19:0x00cb, B:21:0x00d1, B:23:0x00d9, B:26:0x00e5, B:27:0x0105, B:29:0x00de, B:33:0x0115, B:40:0x0123, B:43:0x0120), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[Catch: all -> 0x0106, IOException -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0109, blocks: (B:19:0x00cb, B:21:0x00d1, B:23:0x00d9, B:26:0x00e5, B:27:0x0105, B:29:0x00de, B:33:0x0115, B:40:0x0123, B:43:0x0120), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [oo1] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [oo1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h70 h70Var, r30 r30Var) {
        el0 el0Var;
        ?? r10;
        b50 b50Var;
        int i;
        ?? r3;
        qo1 qo1Var;
        Function2 function2;
        ql0 ql0Var;
        Throwable th;
        ql0 ql0Var2;
        fl0 fl0Var;
        oo1 oo1Var;
        File file;
        try {
            try {
                try {
                    try {
                        if (r30Var instanceof el0) {
                            el0Var = (el0) r30Var;
                            int i2 = el0Var.s;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                el0Var.s = i2 - Integer.MIN_VALUE;
                                r10 = el0Var.q;
                                b50Var = b50.m;
                                i = el0Var.s;
                                if (i != 0) {
                                    ca2.b(r10);
                                    if (this.d.get()) {
                                        lh.g("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File file2 = this.a;
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            ch2.j(file2, "Unable to create parent directories of ");
                                            return null;
                                        }
                                    }
                                    el0Var.m = this;
                                    el0Var.n = h70Var;
                                    qo1Var = this.e;
                                    el0Var.o = qo1Var;
                                    el0Var.s = 1;
                                    function2 = h70Var;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            lh.g("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        ql0Var2 = el0Var.p;
                                        file = (File) el0Var.o;
                                        oo1Var = (oo1) el0Var.n;
                                        fl0Var = el0Var.m;
                                        try {
                                            ca2.b(r10);
                                            Unit unit = Unit.a;
                                            try {
                                                ql0Var2.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file.exists()) {
                                                File file3 = fl0Var.a;
                                                if (!(Build.VERSION.SDK_INT >= 26 ? k31.q(file, file3) : file.renameTo(file3))) {
                                                    throw new IOException("Unable to rename " + file + " to " + fl0Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            Unit unit2 = Unit.a;
                                            oo1Var.b(null);
                                            return Unit.a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                ql0Var2.close();
                                            } catch (Throwable th4) {
                                                wi0.a(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    ?? r8 = (oo1) el0Var.o;
                                    Function2 function22 = (Function2) el0Var.n;
                                    fl0 fl0Var2 = el0Var.m;
                                    ca2.b(r10);
                                    qo1Var = r8;
                                    this = fl0Var2;
                                    function2 = function22;
                                }
                                r3 = new File(this.a.getAbsolutePath() + ".tmp");
                                ql0Var = new ql0(r3);
                                el0Var.m = this;
                                el0Var.n = qo1Var;
                                el0Var.o = r3;
                                el0Var.p = ql0Var;
                                el0Var.s = 2;
                                if (function2.invoke(ql0Var, el0Var) != b50Var) {
                                    fl0Var = this;
                                    oo1Var = qo1Var;
                                    file = r3;
                                    ql0Var2 = ql0Var;
                                    Unit unit3 = Unit.a;
                                    ql0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return b50Var;
                            }
                        }
                        el0Var.m = this;
                        el0Var.n = qo1Var;
                        el0Var.o = r3;
                        el0Var.p = ql0Var;
                        el0Var.s = 2;
                        if (function2.invoke(ql0Var, el0Var) != b50Var) {
                        }
                        return b50Var;
                    } catch (Throwable th5) {
                        th = th5;
                        ql0Var2 = ql0Var;
                        ql0Var2.close();
                        throw th;
                    }
                    ql0Var = new ql0(r3);
                } catch (IOException e) {
                    e = e;
                    if (r3.exists()) {
                        r3.delete();
                    }
                    throw e;
                }
                if (i != 0) {
                }
                r3 = new File(this.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r10.b(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r10 = b50Var;
            r10.b(null);
            throw th;
        }
        el0Var = new el0(this, r30Var);
        r10 = el0Var.q;
        b50Var = b50.m;
        i = el0Var.s;
    }

    @Override // defpackage.xu
    public final void close() {
        this.d.set(true);
        this.c.invoke();
    }
}
