package i1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import r0.s1;

/* loaded from: classes.dex */
public interface l {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n f16941a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f16942b;

        /* renamed from: c, reason: collision with root package name */
        public final s1 f16943c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f16944d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f16945e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16946f;

        private a(n nVar, MediaFormat mediaFormat, s1 s1Var, Surface surface, MediaCrypto mediaCrypto, int i7) {
            this.f16941a = nVar;
            this.f16942b = mediaFormat;
            this.f16943c = s1Var;
            this.f16944d = surface;
            this.f16945e = mediaCrypto;
            this.f16946f = i7;
        }

        public static a a(n nVar, MediaFormat mediaFormat, s1 s1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, s1Var, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, s1 s1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, s1Var, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        l a(a aVar);
    }

    public interface c {
        void a(l lVar, long j7, long j8);
    }

    void a();

    int b(MediaCodec.BufferInfo bufferInfo);

    boolean c();

    void d(int i7, boolean z6);

    void e(int i7);

    void f(int i7, int i8, u0.c cVar, long j7, int i9);

    void flush();

    void g(c cVar, Handler handler);

    MediaFormat h();

    ByteBuffer i(int i7);

    void j(Surface surface);

    void k(int i7, int i8, int i9, long j7, int i10);

    void l(Bundle bundle);

    ByteBuffer m(int i7);

    void n(int i7, long j7);

    int o();
}
