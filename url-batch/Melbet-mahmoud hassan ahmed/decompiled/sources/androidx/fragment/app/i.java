package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: g, reason: collision with root package name */
    static final g f686g = new g();

    /* renamed from: f, reason: collision with root package name */
    private g f687f = null;

    public static abstract class a {
    }

    public interface b {
        void a();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public g c() {
        if (this.f687f == null) {
            this.f687f = f686g;
        }
        return this.f687f;
    }

    public abstract List<Fragment> d();

    public abstract void e(int i7, int i8);

    public abstract boolean f();

    public void g(g gVar) {
        this.f687f = gVar;
    }
}
