package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f12996a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12997b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f12998c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final Object f12999d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private static Executor f13000e;

        /* renamed from: a, reason: collision with root package name */
        private Executor f13001a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f13002b;

        /* renamed from: c, reason: collision with root package name */
        private final h.f f13003c;

        public a(h.f fVar) {
            this.f13003c = fVar;
        }

        public c a() {
            if (this.f13002b == null) {
                synchronized (f12999d) {
                    try {
                        if (f13000e == null) {
                            f13000e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f13002b = f13000e;
            }
            return new c(this.f13001a, this.f13002b, this.f13003c);
        }
    }

    c(Executor executor, Executor executor2, h.f fVar) {
        this.f12996a = executor;
        this.f12997b = executor2;
        this.f12998c = fVar;
    }

    public Executor a() {
        return this.f12997b;
    }

    public h.f b() {
        return this.f12998c;
    }

    public Executor c() {
        return this.f12996a;
    }
}
