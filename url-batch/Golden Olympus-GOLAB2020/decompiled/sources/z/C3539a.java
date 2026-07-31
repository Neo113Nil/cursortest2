package z;

import android.graphics.Typeface;
import android.os.Handler;
import z.f;
import z.g;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3539a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f46795a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f46796b;

    /* renamed from: z.a$a, reason: collision with other inner class name */
    class RunnableC0295a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.c f46797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f46798c;

        RunnableC0295a(g.c cVar, Typeface typeface) {
            this.f46797b = cVar;
            this.f46798c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46797b.b(this.f46798c);
        }
    }

    /* renamed from: z.a$b */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.c f46800b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f46801c;

        b(g.c cVar, int i4) {
            this.f46800b = cVar;
            this.f46801c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46800b.a(this.f46801c);
        }
    }

    C3539a(g.c cVar, Handler handler) {
        this.f46795a = cVar;
        this.f46796b = handler;
    }

    private void a(int i4) {
        this.f46796b.post(new b(this.f46795a, i4));
    }

    private void c(Typeface typeface) {
        this.f46796b.post(new RunnableC0295a(this.f46795a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f46825a);
        } else {
            a(eVar.f46826b);
        }
    }
}
