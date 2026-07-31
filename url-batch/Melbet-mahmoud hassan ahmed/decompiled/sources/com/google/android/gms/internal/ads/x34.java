package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface x34 {
    ByteBuffer A(int i7);

    ByteBuffer E(int i7);

    void S(Bundle bundle);

    void a(int i7);

    void b(int i7, int i8, int i9, long j7, int i10);

    MediaFormat c();

    void d(int i7, boolean z6);

    void e(Surface surface);

    void f(int i7, int i8, v21 v21Var, long j7, int i9);

    int g(MediaCodec.BufferInfo bufferInfo);

    void h();

    void i(int i7, long j7);

    void k();

    boolean t();

    int zza();
}
