package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface ou0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final su0 f30201a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f30202b;

        /* renamed from: c, reason: collision with root package name */
        public final yb0 f30203c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f30204d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f30205e;

        private a(su0 su0Var, MediaFormat mediaFormat, yb0 yb0Var, Surface surface, MediaCrypto mediaCrypto) {
            this.f30201a = su0Var;
            this.f30202b = mediaFormat;
            this.f30203c = yb0Var;
            this.f30204d = surface;
            this.f30205e = mediaCrypto;
        }

        public static a a(su0 su0Var, MediaFormat mediaFormat, yb0 yb0Var, MediaCrypto mediaCrypto) {
            return new a(su0Var, mediaFormat, yb0Var, null, mediaCrypto);
        }

        public static a a(su0 su0Var, MediaFormat mediaFormat, yb0 yb0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(su0Var, mediaFormat, yb0Var, surface, mediaCrypto);
        }
    }

    public interface b {
        ou0 a(a aVar);
    }

    public interface c {
        void a(long j4);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    void a(int i4);

    void a(int i4, int i5, long j4, int i6);

    void a(int i4, long j4);

    void a(int i4, tu tuVar, long j4);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    void a(boolean z4, int i4);

    int b();

    ByteBuffer b(int i4);

    ByteBuffer c(int i4);

    void flush();

    void release();
}
