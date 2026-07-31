package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public final class ei1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f25311a;

    private static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f25312b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f25313a;

        static {
            LogSessionId unused;
            unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f25313a = logSessionId;
        }
    }

    static {
        if (u82.f32873a < 31) {
            new ei1();
        } else {
            int i4 = a.f25312b;
        }
    }

    public ei1() {
        this((a) null);
        C2253tf.b(u82.f32873a < 31);
    }

    public final LogSessionId a() {
        a aVar = this.f25311a;
        aVar.getClass();
        return aVar.f25313a;
    }

    public ei1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private ei1(a aVar) {
        this.f25311a = aVar;
    }
}
