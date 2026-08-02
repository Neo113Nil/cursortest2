package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.StandardMethodCodec;

/* loaded from: classes.dex */
public final class MessagesKt {
    private static final StandardMethodCodec MessagesPigeonMethodCodec = new StandardMethodCodec(new MessagesPigeonCodec());

    public static final StandardMethodCodec getMessagesPigeonMethodCodec() {
        return MessagesPigeonMethodCodec;
    }
}
