package com.moyoung.lib.ai.chat;

/* loaded from: classes4.dex */
public interface f {
    void onError(String str);

    void onNotStreamResponse(String str);

    void onStreamComplete();

    void onStreamResponse(String str);
}
