package androidx.loader.app;

import defpackage.b90;
import defpackage.dc;
import defpackage.gh;
import defpackage.gk0;
import defpackage.mv;
import defpackage.ne0;
import defpackage.om0;
import defpackage.rm0;
import defpackage.s9;
import defpackage.sm0;
import defpackage.uy;
import defpackage.wi;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
class LoaderManagerImpl$LoaderViewModel extends om0 {
    private static final rm0 FACTORY = new a();
    private ne0 mLoaders = new ne0();
    private boolean mCreatingLoader = false;

    public static LoaderManagerImpl$LoaderViewModel getInstance(sm0 sm0Var) {
        rm0 rm0Var = FACTORY;
        sm0Var.getClass();
        rm0Var.getClass();
        gh ghVar = gh.b;
        ghVar.getClass();
        wi wiVar = new wi(sm0Var, rm0Var, ghVar);
        dc a = b90.a(LoaderManagerImpl$LoaderViewModel.class);
        String b = a.b();
        if (b != null) {
            return (LoaderManagerImpl$LoaderViewModel) wiVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        s9.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.mLoaders.d() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (this.mLoaders.d() <= 0) {
                return;
            }
            if (this.mLoaders.e(0) != null) {
                s9.c();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            ne0 ne0Var = this.mLoaders;
            if (ne0Var.f) {
                mv.a(ne0Var);
            }
            printWriter.print(ne0Var.g[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public void finishCreatingLoader() {
        this.mCreatingLoader = false;
    }

    public <D> uy getLoader(int i) {
        if (this.mLoaders.b(i) == null) {
            return null;
        }
        s9.c();
        return null;
    }

    public boolean hasRunningLoaders() {
        if (this.mLoaders.d() <= 0) {
            return false;
        }
        this.mLoaders.e(0).getClass();
        s9.c();
        return false;
    }

    public boolean isCreatingLoader() {
        return this.mCreatingLoader;
    }

    public void markForRedelivery() {
        if (this.mLoaders.d() <= 0) {
            return;
        }
        this.mLoaders.e(0).getClass();
        s9.c();
    }

    @Override // defpackage.om0
    public void onCleared() {
        super.onCleared();
        int d = this.mLoaders.d();
        ne0 ne0Var = this.mLoaders;
        if (d > 0) {
            ne0Var.e(0).getClass();
            s9.c();
            return;
        }
        int i = ne0Var.i;
        Object[] objArr = ne0Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        ne0Var.i = 0;
        ne0Var.f = false;
    }

    public void putLoader(int i, uy uyVar) {
        this.mLoaders.c(i, uyVar);
    }

    public void removeLoader(int i) {
        ne0 ne0Var = this.mLoaders;
        int c = gk0.c(ne0Var.i, i, ne0Var.g);
        if (c >= 0) {
            Object[] objArr = ne0Var.h;
            Object obj = objArr[c];
            Object obj2 = mv.m;
            if (obj != obj2) {
                objArr[c] = obj2;
                ne0Var.f = true;
            }
        }
    }

    public void startCreatingLoader() {
        this.mCreatingLoader = true;
    }
}
