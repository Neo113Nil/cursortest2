package com.tapjoy.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.TapjoyConstants;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String a2 = a(intent);
        if (a2 != null) {
            a(context, "install_referrer", a2);
        }
    }

    @Nullable
    public static String a(Intent intent) {
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            return intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
        }
        return null;
    }

    private static boolean a(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            try {
                fileOutputStream = context.openFileOutput(str, 0);
            } catch (FileNotFoundException unused) {
                return false;
            }
        } catch (IOException unused2) {
            fileOutputStream = null;
        }
        try {
            bg.a(fileOutputStream, str2);
            fileOutputStream.close();
            return true;
        } catch (IOException unused3) {
            ka.a(fileOutputStream);
            context.deleteFile("install_referrer");
            return false;
        }
    }
}
