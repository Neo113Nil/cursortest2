package v0;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import v0.w;

/* loaded from: classes.dex */
public interface o {

    public static class a extends IOException {

        /* renamed from: f, reason: collision with root package name */
        public final int f22690f;

        public a(Throwable th, int i7) {
            super(th);
            this.f22690f = i7;
        }
    }

    boolean a();

    Map<String, String> b();

    void c(w.a aVar);

    UUID d();

    void e(w.a aVar);

    boolean f(String str);

    a g();

    int getState();

    u0.b h();
}
