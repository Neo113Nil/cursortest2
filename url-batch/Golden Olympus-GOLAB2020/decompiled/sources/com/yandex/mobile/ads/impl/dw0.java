package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes3.dex */
public interface dw0 {

    public interface a {
    }

    public static final class b extends zv0 {
        public b(int i4, long j4, Object obj) {
            super(i4, j4, obj);
        }

        public b(zv0 zv0Var) {
            super(zv0Var);
        }

        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i4, int i5, long j4) {
            super(obj, i4, i5, j4);
        }

        public b(Object obj, long j4) {
            super(obj, j4);
        }
    }

    public interface c {
        void a(dw0 dw0Var, x42 x42Var);
    }

    xv0 a(b bVar, InterfaceC2250tc interfaceC2250tc, long j4);

    void a(Handler handler, ew0 ew0Var);

    void a(Handler handler, w30 w30Var);

    void a(c cVar);

    void a(c cVar, s62 s62Var, ei1 ei1Var);

    void a(ew0 ew0Var);

    void a(w30 w30Var);

    void a(xv0 xv0Var);

    void b(c cVar);

    void c(c cVar);

    rv0 getMediaItem();

    void maybeThrowSourceInfoRefreshError();
}
