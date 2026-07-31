package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.InterfaceC1999ih;

/* renamed from: com.yandex.mobile.ads.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1999ih {

    /* renamed from: com.yandex.mobile.ads.impl.ih$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f27199a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1999ih f27200b;

        public a(Handler handler, InterfaceC1999ih interfaceC1999ih) {
            this.f27199a = (Handler) C2253tf.a(handler);
            this.f27200b = interfaceC1999ih;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Exception exc) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Exception exc) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.a(exc);
        }

        public final void a(final Exception exc) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.J7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.c(exc);
                    }
                });
            }
        }

        public final void b(final Exception exc) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.G7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.d(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(ey eyVar) {
            synchronized (eyVar) {
            }
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.a(eyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ey eyVar) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.b(eyVar);
        }

        public final void a(final String str, final long j4, final long j5) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.B7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.b(str, j4, j5);
                    }
                });
            }
        }

        public final void b(final ey eyVar) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.F7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.d(eyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j4, long j5) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.b(str, j4, j5);
        }

        public final void a(final String str) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.C7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.b(str);
        }

        public final void a(final ey eyVar) {
            synchronized (eyVar) {
            }
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.E7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.c(eyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yb0 yb0Var, iy iyVar) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.getClass();
            this.f27200b.a(yb0Var, iyVar);
        }

        public final void a(final yb0 yb0Var, final iy iyVar) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.I7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.b(yb0Var, iyVar);
                    }
                });
            }
        }

        public final void b(final long j4) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.H7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.a(j4);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j4) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.a(j4);
        }

        public final void b(final boolean z4) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.D7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.a(z4);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z4) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i4 = u82.f32873a;
            interfaceC1999ih.onSkipSilenceEnabledChanged(z4);
        }

        public final void b(final int i4, final long j4, final long j5) {
            Handler handler = this.f27199a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.K7
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1999ih.a.this.a(i4, j4, j5);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i4, long j4, long j5) {
            InterfaceC1999ih interfaceC1999ih = this.f27200b;
            int i5 = u82.f32873a;
            interfaceC1999ih.a(i4, j4, j5);
        }
    }

    default void a(int i4, long j4, long j5) {
    }

    default void b(ey eyVar) {
    }

    default void onSkipSilenceEnabledChanged(boolean z4) {
    }

    default void a(long j4) {
    }

    default void b(Exception exc) {
    }

    default void a(ey eyVar) {
    }

    default void b(String str) {
    }

    default void a(yb0 yb0Var, iy iyVar) {
    }

    default void b(String str, long j4, long j5) {
    }

    default void a(Exception exc) {
    }
}
