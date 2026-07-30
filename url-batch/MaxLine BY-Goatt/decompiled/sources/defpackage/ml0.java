package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ml0 extends g0 {
    public final ArrayDeque o;
    public final /* synthetic */ ol0 p;

    public ml0(ol0 ol0Var) {
        this.p = ol0Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.o = arrayDeque;
        File file = ol0Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.m = 2;
        } else {
            file.getClass();
            arrayDeque.push(new kl0(file));
        }
    }

    @Override // defpackage.g0
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.o;
            nl0 nl0Var = (nl0) arrayDeque.peek();
            if (nl0Var == null) {
                file = null;
                break;
            }
            a = nl0Var.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(nl0Var.a) || !a.isDirectory() || arrayDeque.size() >= this.p.f) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file == null) {
            this.m = 2;
        } else {
            this.n = file;
            this.m = 1;
        }
    }

    public final il0 b(File file) {
        int ordinal = this.p.b.ordinal();
        if (ordinal == 0) {
            return new ll0(this, file);
        }
        if (ordinal == 1) {
            return new jl0(this, file);
        }
        a.b();
        return null;
    }
}
