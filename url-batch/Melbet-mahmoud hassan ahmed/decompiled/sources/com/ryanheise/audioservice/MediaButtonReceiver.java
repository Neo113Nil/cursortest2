package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends s.a {
    @Override // s.a, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AudioService audioService;
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || (audioService = AudioService.G) == null) {
            super.onReceive(context, intent);
        } else {
            audioService.N();
        }
    }
}
