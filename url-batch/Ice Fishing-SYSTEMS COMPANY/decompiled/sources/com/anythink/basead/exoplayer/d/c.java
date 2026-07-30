package com.anythink.basead.exoplayer.d;

import android.os.Handler;
import com.anythink.basead.exoplayer.k.C0544a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface c {
    void a(Exception exc);

    void d();

    void e();

    void f();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0018a> f6968a = new CopyOnWriteArrayList<>();

        /* renamed from: com.anythink.basead.exoplayer.d.c$a$a, reason: collision with other inner class name */
        public static final class C0018a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f6978a;

            /* renamed from: b, reason: collision with root package name */
            public final c f6979b;

            public C0018a(Handler handler, c cVar) {
                this.f6978a = handler;
                this.f6979b = cVar;
            }
        }

        public final void a(Handler handler, c cVar) {
            C0544a.a((handler == null || cVar == null) ? false : true);
            this.f6968a.add(new C0018a(handler, cVar));
        }

        public final void b() {
            Iterator<C0018a> it = this.f6968a.iterator();
            while (it.hasNext()) {
                C0018a next = it.next();
                final c cVar = next.f6979b;
                next.f6978a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        public final void c() {
            Iterator<C0018a> it = this.f6968a.iterator();
            while (it.hasNext()) {
                C0018a next = it.next();
                final c cVar = next.f6979b;
                next.f6978a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.f();
                    }
                });
            }
        }

        public final void a(c cVar) {
            Iterator<C0018a> it = this.f6968a.iterator();
            while (it.hasNext()) {
                C0018a next = it.next();
                if (next.f6979b == cVar) {
                    this.f6968a.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0018a> it = this.f6968a.iterator();
            while (it.hasNext()) {
                C0018a next = it.next();
                final c cVar = next.f6979b;
                next.f6978a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.d();
                    }
                });
            }
        }

        public final void a(final Exception exc) {
            Iterator<C0018a> it = this.f6968a.iterator();
            while (it.hasNext()) {
                C0018a next = it.next();
                final c cVar = next.f6979b;
                next.f6978a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a(exc);
                    }
                });
            }
        }
    }
}
