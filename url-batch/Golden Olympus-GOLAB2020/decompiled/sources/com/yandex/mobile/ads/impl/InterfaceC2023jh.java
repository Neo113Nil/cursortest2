package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2023jh {

    /* renamed from: com.yandex.mobile.ads.impl.jh$b */
    public static final class b extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f27646b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27647c;

        /* renamed from: d, reason: collision with root package name */
        public final yb0 f27648d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i4, int i5, int i6, int i7, yb0 yb0Var, boolean z4, RuntimeException runtimeException) {
            super(r0.toString(), runtimeException);
            StringBuilder sb = new StringBuilder("AudioTrack init failed ");
            sb.append(i4);
            sb.append(" Config(");
            sb.append(i5);
            sb.append(", ");
            sb.append(i6);
            sb.append(", ");
            sb.append(i7);
            sb.append(")");
            sb.append(z4 ? " (recoverable)" : "");
            this.f27646b = i4;
            this.f27647c = z4;
            this.f27648d = yb0Var;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jh$c */
    public interface c {
    }

    /* renamed from: com.yandex.mobile.ads.impl.jh$d */
    public static final class d extends Exception {
        public d(long j4, long j5) {
            super("Unexpected audio track timestamp discontinuity: expected " + j5 + ", got " + j4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jh$e */
    public static final class e extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f27649b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27650c;

        /* renamed from: d, reason: collision with root package name */
        public final yb0 f27651d;

        public e(int i4, yb0 yb0Var, boolean z4) {
            super(C1877de.a("AudioTrack write failed: ", i4));
            this.f27650c = z4;
            this.f27649b = i4;
            this.f27651d = yb0Var;
        }
    }

    long a(boolean z4);

    void a(int i4);

    void a(C1856ch c1856ch);

    default void a(ei1 ei1Var) {
    }

    void a(C2187qh c2187qh);

    void a(th1 th1Var);

    void a(yb0 yb0Var, int[] iArr);

    boolean a();

    boolean a(yb0 yb0Var);

    boolean a(ByteBuffer byteBuffer, long j4, int i4);

    int b(yb0 yb0Var);

    void b();

    void b(boolean z4);

    void c();

    void d();

    boolean e();

    void f();

    void flush();

    void g();

    th1 getPlaybackParameters();

    void pause();

    void play();

    void setVolume(float f4);

    /* renamed from: com.yandex.mobile.ads.impl.jh$a */
    public static final class a extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final yb0 f27645b;

        public a(InterfaceC1976hh.b bVar, yb0 yb0Var) {
            super(bVar);
            this.f27645b = yb0Var;
        }

        public a(String str, yb0 yb0Var) {
            super(str);
            this.f27645b = yb0Var;
        }
    }
}
