package com.yandex.mobile.ads.impl;

import java.io.File;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1837bm {

    /* renamed from: com.yandex.mobile.ads.impl.bm$a */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bm$b */
    public interface b {
        void a(InterfaceC1837bm interfaceC1837bm, om omVar);

        void a(InterfaceC1837bm interfaceC1837bm, om omVar, om omVar2);

        void a(om omVar);
    }

    File a(String str, long j4, long j5);

    void a(om omVar);

    void a(File file, long j4);

    void a(String str);

    void a(String str, rr rrVar);

    long b(String str, long j4, long j5);

    cz b(String str);

    void b(om omVar);

    om c(String str, long j4, long j5);

    long d(String str, long j4, long j5);

    om e(String str, long j4, long j5);
}
