package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1976hh {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f26738a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.yandex.mobile.ads.impl.hh$a */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f26739e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f26740a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26742c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26743d;

        public a(int i4, int i5, int i6) {
            this.f26740a = i4;
            this.f26741b = i5;
            this.f26742c = i6;
            this.f26743d = u82.e(i6) ? u82.b(i6, i5) : -1;
        }

        public final String toString() {
            return "AudioFormat[sampleRate=" + this.f26740a + ", channelCount=" + this.f26741b + ", encoding=" + this.f26742c + ']';
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hh$b */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar);

    void a(ByteBuffer byteBuffer);

    boolean a();

    void b();

    ByteBuffer c();

    void d();

    void flush();

    boolean isActive();
}
