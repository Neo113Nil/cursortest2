package io.flutter.plugins.sharedpreferences;

import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.videoplayer.AndroidVideoPlayerApi;
import io.flutter.plugins.videoplayer.MessagesPigeonCodec;
import io.flutter.plugins.videoplayer.VideoPlayerInstanceApi;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13586a;

    public /* synthetic */ c(int i4) {
        this.f13586a = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        MessagesAsyncPigeonCodec codec_delegate$lambda$0;
        MessagesPigeonCodec codec_delegate$lambda$02;
        MessagesPigeonCodec codec_delegate$lambda$03;
        switch (this.f13586a) {
            case 0:
                codec_delegate$lambda$0 = SharedPreferencesAsyncApi.Companion.codec_delegate$lambda$0();
                return codec_delegate$lambda$0;
            case 1:
                codec_delegate$lambda$02 = AndroidVideoPlayerApi.Companion.codec_delegate$lambda$0();
                return codec_delegate$lambda$02;
            default:
                codec_delegate$lambda$03 = VideoPlayerInstanceApi.Companion.codec_delegate$lambda$0();
                return codec_delegate$lambda$03;
        }
    }
}
