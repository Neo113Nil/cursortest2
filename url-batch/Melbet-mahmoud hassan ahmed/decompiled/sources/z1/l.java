package z1;

import android.net.Uri;
import java.io.IOException;
import n2.g0;
import t1.e0;

/* loaded from: classes.dex */
public interface l {

    public interface a {
        l a(y1.g gVar, g0 g0Var, k kVar);
    }

    public interface b {
        void d();

        boolean j(Uri uri, g0.c cVar, boolean z6);
    }

    public static final class c extends IOException {

        /* renamed from: f, reason: collision with root package name */
        public final Uri f23634f;

        public c(Uri uri) {
            this.f23634f = uri;
        }
    }

    public static final class d extends IOException {

        /* renamed from: f, reason: collision with root package name */
        public final Uri f23635f;

        public d(Uri uri) {
            this.f23635f = uri;
        }
    }

    public interface e {
        void h(g gVar);
    }

    void B();

    boolean a();

    h b();

    boolean c(Uri uri, long j7);

    void d(Uri uri, e0.a aVar, e eVar);

    boolean e(Uri uri);

    void f();

    void g(Uri uri);

    void h(Uri uri);

    g i(Uri uri, boolean z6);

    void j(b bVar);

    void k(b bVar);

    long n();
}
