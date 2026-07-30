package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gy implements lh {
    public final File a;
    public final ua1 b;
    public final ce c;
    public final AtomicBoolean d;
    public final oo0 e;

    public gy(File file, ua1 ua1Var, ce ceVar) {
        ua1Var.getClass();
        this.a = file;
        this.b = ua1Var;
        this.c = ceVar;
        this.d = new AtomicBoolean(false);
        this.e = new oo0();
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
    /* JADX WARN: Type inference failed for: r8v0, types: [zo] */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zo zoVar, fn fnVar) {
        ey eyVar;
        Object obj;
        int i;
        Throwable th;
        cy cyVar;
        gy gyVar;
        ?? r7;
        Object obj2;
        try {
            if (fnVar instanceof ey) {
                eyVar = (ey) fnVar;
                int i2 = eyVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eyVar.m = i2 - Integer.MIN_VALUE;
                    obj = eyVar.k;
                    tn tnVar = tn.d;
                    i = eyVar.m;
                    if (i != 0) {
                        ca0.v(obj);
                        if (this.d.get()) {
                            dd0.j("StorageConnection has already been disposed.");
                            return null;
                        }
                        ?? f = this.e.f();
                        cy cyVar2 = new cy(this.a);
                        try {
                            Boolean valueOf = Boolean.valueOf((boolean) f);
                            eyVar.h = this;
                            eyVar.i = cyVar2;
                            eyVar.j = f;
                            eyVar.m = 1;
                            Object a = zoVar.a(cyVar2, valueOf, eyVar);
                            if (a == tnVar) {
                                return tnVar;
                            }
                            gyVar = this;
                            r7 = f == true ? 1 : 0;
                            obj2 = a;
                            cyVar = cyVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            cyVar = cyVar2;
                            obj = f;
                            cyVar.close();
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r7 = eyVar.j;
                        cyVar = eyVar.i;
                        gyVar = eyVar.h;
                        try {
                            ca0.v(obj);
                            obj2 = obj;
                        } catch (Throwable th3) {
                            obj = r7;
                            this = gyVar;
                            th = th3;
                            try {
                                cyVar.close();
                                throw th;
                            } catch (Throwable th4) {
                                lw.a(th, th4);
                                throw th;
                            }
                        }
                    }
                    cyVar.close();
                    th = null;
                    if (th != null) {
                        if (r7 != false) {
                            gyVar.e.h(null);
                        }
                        return obj2;
                    }
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        obj = r7;
                        this = gyVar;
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            cyVar.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (obj != null) {
                this.e.h(null);
            }
            throw th;
        }
        eyVar = new ey(this, fnVar);
        obj = eyVar.k;
        tn tnVar2 = tn.d;
        i = eyVar.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0096, code lost:
    
        if (r11.e(r1) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TryCatch #5 {all -> 0x0119, blocks: (B:18:0x00d7, B:20:0x00dd, B:23:0x00e0, B:25:0x00f8, B:26:0x0118, B:32:0x0125, B:39:0x0133, B:42:0x0130), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0119, blocks: (B:18:0x00d7, B:20:0x00dd, B:23:0x00e0, B:25:0x00f8, B:26:0x0118, B:32:0x0125, B:39:0x0133, B:42:0x0130), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lp lpVar, fn fnVar) {
        fy fyVar;
        oo0 oo0Var;
        tn tnVar;
        int i;
        File file;
        oo0 oo0Var2;
        Function2 function2;
        py pyVar;
        Throwable th;
        py pyVar2;
        gy gyVar;
        oo0 oo0Var3;
        File file2;
        try {
            try {
                try {
                    try {
                        try {
                            if (fnVar instanceof fy) {
                                fyVar = (fy) fnVar;
                                int i2 = fyVar.n;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    fyVar.n = i2 - Integer.MIN_VALUE;
                                    oo0Var = fyVar.l;
                                    tnVar = tn.d;
                                    i = fyVar.n;
                                    boolean z = true;
                                    if (i != 0) {
                                        ca0.v(oo0Var);
                                        if (this.d.get()) {
                                            dd0.j("StorageConnection has already been disposed.");
                                            return null;
                                        }
                                        File file3 = this.a;
                                        File parentFile = file3.getCanonicalFile().getParentFile();
                                        if (parentFile != null) {
                                            parentFile.mkdirs();
                                            if (!parentFile.isDirectory()) {
                                                throw new IOException("Unable to create parent directories of " + file3);
                                            }
                                        }
                                        fyVar.h = this;
                                        fyVar.i = lpVar;
                                        oo0Var2 = this.e;
                                        fyVar.j = oo0Var2;
                                        fyVar.n = 1;
                                        function2 = lpVar;
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            pyVar2 = fyVar.k;
                                            file2 = (File) fyVar.j;
                                            oo0Var3 = (oo0) fyVar.i;
                                            gyVar = fyVar.h;
                                            try {
                                                ca0.v(oo0Var);
                                                try {
                                                    pyVar2.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th == null) {
                                                    throw th;
                                                }
                                                if (file2.exists()) {
                                                    try {
                                                        Files.move(file2.toPath(), gyVar.a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                    } catch (IOException unused) {
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        throw new IOException("Unable to rename " + file2 + " to " + gyVar.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                    }
                                                }
                                                oo0Var3.h(null);
                                                return Unit.a;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    pyVar2.close();
                                                } catch (Throwable th4) {
                                                    lw.a(th, th4);
                                                }
                                                throw th;
                                            }
                                        }
                                        oo0 oo0Var4 = (oo0) fyVar.j;
                                        Function2 function22 = (Function2) fyVar.i;
                                        gy gyVar2 = fyVar.h;
                                        ca0.v(oo0Var);
                                        oo0Var2 = oo0Var4;
                                        this = gyVar2;
                                        function2 = function22;
                                    }
                                    file = new File(this.a.getAbsolutePath() + ".tmp");
                                    pyVar = new py(file);
                                    fyVar.h = this;
                                    fyVar.i = oo0Var2;
                                    fyVar.j = file;
                                    fyVar.k = pyVar;
                                    fyVar.n = 2;
                                    if (function2.b(pyVar, fyVar) != tnVar) {
                                        gyVar = this;
                                        oo0Var3 = oo0Var2;
                                        file2 = file;
                                        pyVar2 = pyVar;
                                        pyVar2.close();
                                        th = null;
                                        if (th == null) {
                                        }
                                    }
                                    return tnVar;
                                }
                            }
                            fyVar.h = this;
                            fyVar.i = oo0Var2;
                            fyVar.j = file;
                            fyVar.k = pyVar;
                            fyVar.n = 2;
                            if (function2.b(pyVar, fyVar) != tnVar) {
                            }
                            return tnVar;
                        } catch (Throwable th5) {
                            th = th5;
                            pyVar2 = pyVar;
                            pyVar2.close();
                            throw th;
                        }
                        pyVar = new py(file);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    if (i != 0) {
                    }
                    file = new File(this.a.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    oo0Var.h(null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                oo0Var = tnVar;
                oo0Var.h(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file = lpVar;
        }
        fyVar = new fy(this, fnVar);
        oo0Var = fyVar.l;
        tnVar = tn.d;
        i = fyVar.n;
        boolean z2 = true;
    }

    @Override // defpackage.lh
    public final void close() {
        this.d.set(true);
        this.c.invoke();
    }
}
