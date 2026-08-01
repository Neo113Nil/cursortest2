package e3;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean f(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    public static void i(MenuItem menuItem, char c10, int i3) {
        menuItem.setAlphabeticShortcut(c10, i3);
    }

    public static void j(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void k(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void l(Notification.Builder builder, int i3) {
        builder.setGroupAlertBehavior(i3);
    }

    public static void m(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void n(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void o(MenuItem menuItem, char c10, int i3) {
        menuItem.setNumericShortcut(c10, i3);
    }

    public static void p(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void q(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void r(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void s(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void t(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
