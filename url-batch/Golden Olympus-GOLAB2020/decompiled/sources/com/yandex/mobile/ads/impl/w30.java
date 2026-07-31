package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.w30;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface w30 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f33904a;

        /* renamed from: b, reason: collision with root package name */
        public final dw0.b f33905b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0205a> f33906c;

        /* renamed from: com.yandex.mobile.ads.impl.w30$a$a, reason: collision with other inner class name */
        private static final class C0205a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f33907a;

            /* renamed from: b, reason: collision with root package name */
            public w30 f33908b;

            public C0205a(Handler handler, w30 w30Var) {
                this.f33907a = handler;
                this.f33908b = w30Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0205a> copyOnWriteArrayList, int i4, dw0.b bVar) {
            this.f33906c = copyOnWriteArrayList;
            this.f33904a = i4;
            this.f33905b = bVar;
        }

        public final void a(Handler handler, w30 w30Var) {
            w30Var.getClass();
            this.f33906c.add(new C0205a(handler, w30Var));
        }

        public final void b() {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                final w30 w30Var = next.f33908b;
                u82.a(next.f33907a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Ak
                    @Override // java.lang.Runnable
                    public final void run() {
                        w30.a.this.b(w30Var);
                    }
                });
            }
        }

        public final void c() {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                final w30 w30Var = next.f33908b;
                u82.a(next.f33907a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Bk
                    @Override // java.lang.Runnable
                    public final void run() {
                        w30.a.this.c(w30Var);
                    }
                });
            }
        }

        public final void d() {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                final w30 w30Var = next.f33908b;
                u82.a(next.f33907a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        w30.a.this.d(w30Var);
                    }
                });
            }
        }

        public final void e(w30 w30Var) {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                if (next.f33908b == w30Var) {
                    this.f33906c.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                final w30 w30Var = next.f33908b;
                u82.a(next.f33907a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        w30.a.this.a(w30Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(w30 w30Var) {
            w30Var.d(this.f33904a, this.f33905b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(w30 w30Var) {
            w30Var.a(this.f33904a, this.f33905b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(w30 w30Var) {
            w30Var.b(this.f33904a, this.f33905b);
        }

        public final void a(final int i4) {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                final w30 w30Var = next.f33908b;
                u82.a(next.f33907a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Ek
                    @Override // java.lang.Runnable
                    public final void run() {
                        w30.a.this.a(w30Var, i4);
                    }
                });
            }
        }

        public final void a(final Exception exc) {
            Iterator<C0205a> it = this.f33906c.iterator();
            while (it.hasNext()) {
                C0205a next = it.next();
                final w30 w30Var = next.f33908b;
                u82.a(next.f33907a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Zj
                    @Override // java.lang.Runnable
                    public final void run() {
                        w30.a.this.a(w30Var, exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(w30 w30Var) {
            w30Var.c(this.f33904a, this.f33905b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(w30 w30Var, int i4) {
            w30Var.getClass();
            w30Var.a(this.f33904a, this.f33905b, i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(w30 w30Var, Exception exc) {
            w30Var.a(this.f33904a, this.f33905b, exc);
        }

        public final a a(int i4, dw0.b bVar) {
            return new a(this.f33906c, i4, bVar);
        }
    }

    default void a(int i4, dw0.b bVar) {
    }

    default void b(int i4, dw0.b bVar) {
    }

    default void c(int i4, dw0.b bVar) {
    }

    default void d(int i4, dw0.b bVar) {
    }

    default void a(int i4, dw0.b bVar, int i5) {
    }

    default void a(int i4, dw0.b bVar, Exception exc) {
    }
}
