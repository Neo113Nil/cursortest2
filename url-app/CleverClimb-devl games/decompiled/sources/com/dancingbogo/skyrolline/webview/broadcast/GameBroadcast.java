package com.dancingbogo.skyrolline.webview.broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.mopub.common.AdType;

/* loaded from: classes2.dex */
public class GameBroadcast extends BroadcastReceiver {
    public static void a(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra(com.cmplay.base.util.webview.broadcast.GameBroadcast.JUMP_TO_LEVEL, true);
        intent.putExtra("index", i);
        context.sendBroadcast(intent);
    }

    public static void a(Context context, int i, int i2, int i3) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra(com.cmplay.base.util.webview.broadcast.GameBroadcast.SEND_PRIZE, true);
        intent.putExtra("sence", i);
        intent.putExtra("id", i2);
        intent.putExtra("count", i3);
        context.sendBroadcast(intent);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra(com.cmplay.base.util.webview.broadcast.GameBroadcast.POST_FEEDBACK_DATA, true);
        intent.putExtra("feedback_json", str);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("get_prop", true);
        intent.putExtra("id", i);
        context.sendBroadcast(intent);
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("get_prop_all", true);
        context.sendBroadcast(intent);
    }

    public static void b(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("get_items_info", true);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("can_show_ad", true);
        intent.putExtra("sence", i);
        context.sendBroadcast(intent);
    }

    public static void d(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("show_ad", true);
        intent.putExtra("sence", i);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("set_level_data", true);
        intent.putExtra(AdType.STATIC_NATIVE, str);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.gamebroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("set_add_prop_number_data", true);
        intent.putExtra(AdType.STATIC_NATIVE, str);
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Activity activityRef = AppActivity.getActivityRef();
        if (activityRef == null || activityRef.isFinishing()) {
            return;
        }
        if (intent.getBooleanExtra(com.cmplay.base.util.webview.broadcast.GameBroadcast.JUMP_TO_LEVEL, false)) {
            NativeUtil.getInstance().jumpToLevel(intent.getIntExtra("index", 1));
            return;
        }
        if (intent.getBooleanExtra(com.cmplay.base.util.webview.broadcast.GameBroadcast.SEND_PRIZE, false)) {
            NativeUtil.getInstance().sendPrize(intent.getIntExtra("sence", 1), intent.getIntExtra("id", 1), intent.getIntExtra("count", 0));
            return;
        }
        if (intent.getBooleanExtra(com.cmplay.base.util.webview.broadcast.GameBroadcast.POST_FEEDBACK_DATA, false)) {
            NativeUtil.getInstance().postFeedbackJson(intent.getStringExtra("feedback_json"));
            return;
        }
        if (intent.getBooleanExtra("get_prop", false)) {
            NativeUtil.getInstance().getProp(intent.getIntExtra("id", -1));
            return;
        }
        if (intent.getBooleanExtra("get_prop_all", false)) {
            NativeUtil.getInstance().getProps();
            return;
        }
        if (intent.getBooleanExtra("get_items_info", false)) {
            NativeUtil.getInstance().getItemsInfo();
            return;
        }
        if (intent.getBooleanExtra("can_show_ad", false)) {
            NativeUtil.getInstance().canShowAd(intent.getIntExtra("sence", 11));
            return;
        }
        if (intent.getBooleanExtra("show_ad", false)) {
            NativeUtil.getInstance().showAd(intent.getIntExtra("sence", 11));
        } else if (intent.getBooleanExtra("set_level_data", false)) {
            NativeUtil.getInstance().setLevelData(intent.getStringExtra(AdType.STATIC_NATIVE));
        } else if (intent.getBooleanExtra("set_add_prop_number_data", false)) {
            NativeUtil.getInstance().setAddPropNumberData(intent.getStringExtra(AdType.STATIC_NATIVE));
        }
    }
}
