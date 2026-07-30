package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l92 extends gl0 {
    public static final qz1 e;
    public final ClassLoader b;
    public final gl0 c;
    public final y91 d;

    static {
        String str = qz1.n;
        e = nm1.r("/");
    }

    public l92(ClassLoader classLoader) {
        classLoader.getClass();
        e71 e71Var = gl0.a;
        e71Var.getClass();
        this.b = classLoader;
        this.c = e71Var;
        this.d = ya1.b(new u(29, this));
    }

    @Override // defpackage.gl0
    public final ol2 a(qz1 qz1Var) {
        qz1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gl0
    public final void b(qz1 qz1Var, qz1 qz1Var2) {
        qz1Var.getClass();
        qz1Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gl0
    public final void c(qz1 qz1Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gl0
    public final void d(qz1 qz1Var) {
        qz1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gl0
    public final List g(qz1 qz1Var) {
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        String p = j.b(qz1Var2, qz1Var, true).c(qz1Var2).m.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.d.getValue()) {
            gl0 gl0Var = (gl0) pair.m;
            qz1 qz1Var3 = (qz1) pair.n;
            try {
                List g = gl0Var.g(qz1Var3.d(p));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g) {
                    if (nm1.i((qz1) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(rv.l(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    qz1 qz1Var4 = (qz1) obj2;
                    qz1Var4.getClass();
                    String replace = up2.C(qz1Var4.m.p(), qz1Var3.m.p()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(qz1Var2.d(replace));
                }
                vv.o(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return zv.M(linkedHashSet);
        }
        ey.n(qz1Var, "file not found: ");
        return null;
    }

    @Override // defpackage.gl0
    public final yk0 i(qz1 qz1Var) {
        qz1Var.getClass();
        if (!nm1.i(qz1Var)) {
            return null;
        }
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        String p = j.b(qz1Var2, qz1Var, true).c(qz1Var2).m.p();
        for (Pair pair : (List) this.d.getValue()) {
            yk0 i = ((gl0) pair.m).i(((qz1) pair.n).d(p));
            if (i != null) {
                return i;
            }
        }
        return null;
    }

    @Override // defpackage.gl0
    public final d71 j(qz1 qz1Var) {
        if (!nm1.i(qz1Var)) {
            ey.n(qz1Var, "file not found: ");
            return null;
        }
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        String p = j.b(qz1Var2, qz1Var, true).c(qz1Var2).m.p();
        Iterator it = ((List) this.d.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((gl0) pair.m).j(((qz1) pair.n).d(p));
            } catch (FileNotFoundException unused) {
            }
        }
        ey.n(qz1Var, "file not found: ");
        return null;
    }

    @Override // defpackage.gl0
    public final ol2 k(qz1 qz1Var) {
        qz1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gl0
    public final pn2 l(qz1 qz1Var) {
        qz1Var.getClass();
        if (!nm1.i(qz1Var)) {
            ey.n(qz1Var, "file not found: ");
            return null;
        }
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        URL resource = this.b.getResource(j.b(qz1Var2, qz1Var, false).c(qz1Var2).m.p());
        if (resource == null) {
            ey.n(qz1Var, "file not found: ");
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        inputStream.getClass();
        return o70.J(inputStream);
    }
}
