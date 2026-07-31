package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.yandex.mobile.ads.impl.kf2;

/* loaded from: classes3.dex */
public interface kf2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f28190a;

        /* renamed from: b, reason: collision with root package name */
        private final kf2 f28191b;

        public a(Handler handler, kf2 kf2Var) {
            this.f28190a = (Handler) C2253tf.a(handler);
            this.f28191b = kf2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(ey eyVar) {
            synchronized (eyVar) {
            }
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.c(eyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ey eyVar) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.d(eyVar);
        }

        public final void a(final String str, final long j4, final long j5) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.M8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.b(str, j4, j5);
                    }
                });
            }
        }

        public final void b(final ey eyVar) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.N8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.d(eyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j4, long j5) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.a(str, j4, j5);
        }

        public final void a(final String str) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.S8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.a(str);
        }

        public final void a(final ey eyVar) {
            synchronized (eyVar) {
            }
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.T8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.c(eyVar);
                    }
                });
            }
        }

        public final void c(final int i4, final long j4) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.O8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.a(j4, i4);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i4, long j4) {
            kf2 kf2Var = this.f28191b;
            int i5 = u82.f32873a;
            kf2Var.b(i4, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yb0 yb0Var, iy iyVar) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.getClass();
            this.f28191b.b(yb0Var, iyVar);
        }

        public final void a(final int i4, final long j4) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.L8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.b(i4, j4);
                    }
                });
            }
        }

        public final void a(final yb0 yb0Var, final iy iyVar) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.P8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.b(yb0Var, iyVar);
                    }
                });
            }
        }

        public final void b(final Exception exc) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.U8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.a(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, long j4) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.a(obj, j4);
        }

        public final void b(final rf2 rf2Var) {
            Handler handler = this.f28190a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Q8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.a(rf2Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j4, int i4) {
            kf2 kf2Var = this.f28191b;
            int i5 = u82.f32873a;
            kf2Var.a(i4, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Exception exc) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(rf2 rf2Var) {
            kf2 kf2Var = this.f28191b;
            int i4 = u82.f32873a;
            kf2Var.a(rf2Var);
        }

        public final void a(final Surface surface) {
            if (this.f28190a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f28190a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.R8
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf2.a.this.a(surface, elapsedRealtime);
                    }
                });
            }
        }
    }

    default void a(int i4, long j4) {
    }

    default void b(int i4, long j4) {
    }

    default void c(ey eyVar) {
    }

    default void d(ey eyVar) {
    }

    default void a(rf2 rf2Var) {
    }

    default void b(yb0 yb0Var, iy iyVar) {
    }

    default void c(Exception exc) {
    }

    default void a(Object obj, long j4) {
    }

    default void a(String str) {
    }

    default void a(String str, long j4, long j5) {
    }
}
