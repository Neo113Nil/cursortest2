package j0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface l {
    void A(w0.j jVar, Handler handler);

    void B(ArrayList arrayList);

    void b(Bundle bundle);

    void c(int i4, Z.b bVar, long j4, int i5);

    void e(int i4, int i5, long j4, int i6);

    void f(int i4);

    void flush();

    MediaFormat g();

    void h();

    void k(int i4, long j4);

    int l();

    default void m(g0.p pVar) {
        pVar.run();
    }

    int n(MediaCodec.BufferInfo bufferInfo);

    void o(int i4);

    default boolean p(e0.t tVar) {
        return false;
    }

    ByteBuffer q(int i4);

    void release();

    void s(Surface surface);

    ByteBuffer t(int i4);

    void w(ArrayList arrayList);
}
