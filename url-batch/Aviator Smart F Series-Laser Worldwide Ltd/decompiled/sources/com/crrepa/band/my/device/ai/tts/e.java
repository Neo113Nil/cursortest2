package com.crrepa.band.my.device.ai.tts;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.tts.AITTSPlayer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static void a(AITTSPlayer.b bVar, String str) {
    }

    public static void b(AITTSPlayer.b bVar) {
    }

    public static void c(AITTSPlayer.b bVar) {
        i4.getInstance().sendPlayChatResponseComplete();
    }

    public static void d(AITTSPlayer.b bVar) {
    }

    public static void e(AITTSPlayer.b bVar) {
        i4.getInstance().startPlayChatResponse();
    }

    public static void f(AITTSPlayer.b bVar) {
        i4.getInstance().sendPlayChatResponseError();
    }
}
