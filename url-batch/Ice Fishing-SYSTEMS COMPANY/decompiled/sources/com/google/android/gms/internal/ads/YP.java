package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface YP {
    ByteBuffer A(int i);

    void D(int i);

    void G(int i, int i4, int i9, long j9);

    void H(int i, long j9);

    int c();

    ByteBuffer d(int i);

    MediaFormat e();

    void f(ArrayList arrayList);

    void g(Bundle bundle);

    void j();

    void k();

    void l(Surface surface);

    void q();

    default void r(RunnableC3903sP runnableC3903sP) {
        runnableC3903sP.run();
    }

    void t(int i, FN fn, long j9, int i4);

    int v(MediaCodec.BufferInfo bufferInfo);

    void w(int i);

    default boolean x(C4086vt c4086vt) {
        return false;
    }
}
