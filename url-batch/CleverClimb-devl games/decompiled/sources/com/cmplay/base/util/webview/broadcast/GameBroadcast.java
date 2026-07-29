package com.cmplay.base.util.webview.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmplay.base.util.webview.util.FeedbackUtil;

/* loaded from: classes.dex */
public class GameBroadcast extends BroadcastReceiver {
    public static final String ACTION = "com.cmplay.base.util.webview.broadcast.gamebroadcast";
    public static final String JUMP_TO_LEVEL = "jumpToLevel";
    public static final String POST_FEEDBACK_DATA = "post_feedback_data";
    public static final String SEND_PRIZE = "send_prize";

    public static void jumpToLevel(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.setPackage(context.getPackageName());
        intent.putExtra(JUMP_TO_LEVEL, true);
        intent.putExtra("index", i);
        context.sendBroadcast(intent);
    }

    public static void sendPrize(Context context, int i, int i2, int i3) {
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.setPackage(context.getPackageName());
        intent.putExtra(SEND_PRIZE, true);
        intent.putExtra("sence", i);
        intent.putExtra("id", i2);
        intent.putExtra("count", i3);
        context.sendBroadcast(intent);
    }

    public static void PostFeedbackData(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.setPackage(context.getPackageName());
        intent.putExtra(POST_FEEDBACK_DATA, true);
        intent.putExtra("feedback_json", str);
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || context.getApplicationContext() == null || intent.getBooleanExtra(JUMP_TO_LEVEL, false) || intent.getBooleanExtra(SEND_PRIZE, false) || !intent.getBooleanExtra(POST_FEEDBACK_DATA, false)) {
            return;
        }
        FeedbackUtil.postFeedback(context, intent.getStringExtra("feedback_json"));
    }
}
