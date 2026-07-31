package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.ew0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface ew0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25468a;

        /* renamed from: b, reason: collision with root package name */
        public final dw0.b f25469b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0187a> f25470c;

        /* renamed from: d, reason: collision with root package name */
        private final long f25471d;

        /* renamed from: com.yandex.mobile.ads.impl.ew0$a$a, reason: collision with other inner class name */
        private static final class C0187a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f25472a;

            /* renamed from: b, reason: collision with root package name */
            public ew0 f25473b;

            public C0187a(Handler handler, ew0 ew0Var) {
                this.f25472a = handler;
                this.f25473b = ew0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i4, dw0.b bVar) {
            this.f25470c = copyOnWriteArrayList;
            this.f25468a = i4;
            this.f25469b = bVar;
            this.f25471d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ew0 ew0Var, mr0 mr0Var, tv0 tv0Var) {
            ew0Var.b(this.f25468a, this.f25469b, mr0Var, tv0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(ew0 ew0Var, mr0 mr0Var, tv0 tv0Var) {
            ew0Var.c(this.f25468a, this.f25469b, mr0Var, tv0Var);
        }

        public final void a(Handler handler, ew0 ew0Var) {
            ew0Var.getClass();
            this.f25470c.add(new C0187a(handler, ew0Var));
        }

        public final void b(final mr0 mr0Var, final tv0 tv0Var) {
            Iterator<C0187a> it = this.f25470c.iterator();
            while (it.hasNext()) {
                C0187a next = it.next();
                final ew0 ew0Var = next.f25473b;
                u82.a(next.f25472a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew0.a.this.b(ew0Var, mr0Var, tv0Var);
                    }
                });
            }
        }

        public final void c(final mr0 mr0Var, final tv0 tv0Var) {
            Iterator<C0187a> it = this.f25470c.iterator();
            while (it.hasNext()) {
                C0187a next = it.next();
                final ew0 ew0Var = next.f25473b;
                u82.a(next.f25472a, new Runnable() { // from class: com.yandex.mobile.ads.impl.Y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew0.a.this.c(ew0Var, mr0Var, tv0Var);
                    }
                });
            }
        }

        private long a(long j4) {
            long b4 = u82.b(j4);
            if (b4 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f25471d + b4;
        }

        public final void a(int i4, yb0 yb0Var, long j4) {
            a(new tv0(1, i4, yb0Var, 0, null, a(j4), -9223372036854775807L));
        }

        public final void b(mr0 mr0Var, yb0 yb0Var, long j4, long j5) {
            c(mr0Var, new tv0(1, -1, yb0Var, 0, null, a(j4), a(j5)));
        }

        public final void a(final tv0 tv0Var) {
            Iterator<C0187a> it = this.f25470c.iterator();
            while (it.hasNext()) {
                C0187a next = it.next();
                final ew0 ew0Var = next.f25473b;
                u82.a(next.f25472a, new Runnable() { // from class: com.yandex.mobile.ads.impl.B2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew0.a.this.a(ew0Var, tv0Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ew0 ew0Var, tv0 tv0Var) {
            ew0Var.a(this.f25468a, this.f25469b, tv0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ew0 ew0Var, mr0 mr0Var, tv0 tv0Var) {
            ew0Var.a(this.f25468a, this.f25469b, mr0Var, tv0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ew0 ew0Var, mr0 mr0Var, tv0 tv0Var, IOException iOException, boolean z4) {
            ew0Var.a(this.f25468a, this.f25469b, mr0Var, tv0Var, iOException, z4);
        }

        public final void a(mr0 mr0Var, long j4, long j5) {
            a(mr0Var, new tv0(1, -1, null, 0, null, a(j4), a(j5)));
        }

        public final void a(final mr0 mr0Var, final tv0 tv0Var) {
            Iterator<C0187a> it = this.f25470c.iterator();
            while (it.hasNext()) {
                C0187a next = it.next();
                final ew0 ew0Var = next.f25473b;
                u82.a(next.f25472a, new Runnable() { // from class: com.yandex.mobile.ads.impl.A2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew0.a.this.a(ew0Var, mr0Var, tv0Var);
                    }
                });
            }
        }

        public final void a(mr0 mr0Var, yb0 yb0Var, long j4, long j5) {
            b(mr0Var, new tv0(1, -1, yb0Var, 0, null, a(j4), a(j5)));
        }

        public final void a(mr0 mr0Var, int i4, yb0 yb0Var, long j4, long j5, IOException iOException, boolean z4) {
            a(mr0Var, new tv0(i4, -1, yb0Var, 0, null, a(j4), a(j5)), iOException, z4);
        }

        public final void a(final mr0 mr0Var, final tv0 tv0Var, final IOException iOException, final boolean z4) {
            Iterator<C0187a> it = this.f25470c.iterator();
            while (it.hasNext()) {
                C0187a next = it.next();
                final ew0 ew0Var = next.f25473b;
                u82.a(next.f25472a, new Runnable() { // from class: com.yandex.mobile.ads.impl.C2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew0.a.this.a(ew0Var, mr0Var, tv0Var, iOException, z4);
                    }
                });
            }
        }

        public final void a(ew0 ew0Var) {
            Iterator<C0187a> it = this.f25470c.iterator();
            while (it.hasNext()) {
                C0187a next = it.next();
                if (next.f25473b == ew0Var) {
                    this.f25470c.remove(next);
                }
            }
        }

        public final a a(int i4, dw0.b bVar) {
            return new a(this.f25470c, i4, bVar);
        }
    }

    default void a(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
    }

    default void b(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
    }

    default void c(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
    }

    default void a(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var, IOException iOException, boolean z4) {
    }

    default void a(int i4, dw0.b bVar, tv0 tv0Var) {
    }
}
