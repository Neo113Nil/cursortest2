package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public interface B0 {
    @MetaExoPlayerCustomization("No longer in upstream exo")
    void A58(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj);

    int A5s();

    int A5u(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer A8J(int i);

    ByteBuffer A8e(int i);

    MediaFormat A8f();

    @MetaExoPlayerCustomization("Added in D39791066")
    Pair<Long, Integer> A8j();

    @MetaExoPlayerCustomization("Added in D39791066")
    int A9K();

    void AHI(int i, int i4, int i9, long j9, int i10);

    void AHK(int i, int i4, C06765z c06765z, long j9, int i9);

    void AHb();

    void AHh(int i, long j9);

    void AHi(int i, boolean z8);

    void AJa(InterfaceC0790Az interfaceC0790Az, Handler handler);

    void AJb(Surface surface);

    void AJs(int i);

    void flush();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void reset();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    void start();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void stop();
}
