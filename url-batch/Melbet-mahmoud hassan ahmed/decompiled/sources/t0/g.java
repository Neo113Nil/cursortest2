package t0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o2.m0;

/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f21740a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f21741e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f21742a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21743b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21744c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21745d;

        public a(int i7, int i8, int i9) {
            this.f21742a = i7;
            this.f21743b = i8;
            this.f21744c = i9;
            this.f21745d = m0.t0(i9) ? m0.d0(i9, i8) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f21742a + ", channelCount=" + this.f21743b + ", encoding=" + this.f21744c + ']';
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    void a();

    boolean b();

    boolean c();

    ByteBuffer d();

    void e();

    void f(ByteBuffer byteBuffer);

    void flush();

    a g(a aVar);
}
