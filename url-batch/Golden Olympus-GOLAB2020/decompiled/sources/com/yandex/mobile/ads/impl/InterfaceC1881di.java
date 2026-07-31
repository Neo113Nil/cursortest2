package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.InterfaceC1881di;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.di, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1881di {
    yy a();

    void a(Handler handler, InterfaceC2296vc interfaceC2296vc);

    void a(InterfaceC2296vc interfaceC2296vc);

    /* renamed from: com.yandex.mobile.ads.impl.di$a */
    public interface a {
        void b(int i4, long j4, long j5);

        /* renamed from: com.yandex.mobile.ads.impl.di$a$a, reason: collision with other inner class name */
        public static final class C0184a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0185a> f24635a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: com.yandex.mobile.ads.impl.di$a$a$a, reason: collision with other inner class name */
            static final class C0185a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f24636a;

                /* renamed from: b, reason: collision with root package name */
                private final a f24637b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f24638c;

                public C0185a(Handler handler, InterfaceC2296vc interfaceC2296vc) {
                    this.f24636a = handler;
                    this.f24637b = interfaceC2296vc;
                }
            }

            public final void a(Handler handler, InterfaceC2296vc interfaceC2296vc) {
                interfaceC2296vc.getClass();
                a(interfaceC2296vc);
                this.f24635a.add(new C0185a(handler, interfaceC2296vc));
            }

            public final void a(final int i4, final long j4, final long j5) {
                Iterator<C0185a> it = this.f24635a.iterator();
                while (it.hasNext()) {
                    final C0185a next = it.next();
                    if (!next.f24638c) {
                        next.f24636a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Z0
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC1881di.a.C0184a.a(InterfaceC1881di.a.C0184a.C0185a.this, i4, j4, j5);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0185a c0185a, int i4, long j4, long j5) {
                c0185a.f24637b.b(i4, j4, j5);
            }

            public final void a(InterfaceC2296vc interfaceC2296vc) {
                Iterator<C0185a> it = this.f24635a.iterator();
                while (it.hasNext()) {
                    C0185a next = it.next();
                    if (next.f24637b == interfaceC2296vc) {
                        next.f24638c = true;
                        this.f24635a.remove(next);
                    }
                }
            }
        }
    }
}
