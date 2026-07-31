package com.mocatree.goldwing;

import android.content.Intent;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes2.dex */
public class AppListBridge {
    public static void shareText(String str, String str2) {
        if (UnityPlayer.currentActivity == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            Intent createChooser = Intent.createChooser(intent, "Share");
            createChooser.addFlags(268435456);
            UnityPlayer.currentActivity.startActivity(createChooser);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
