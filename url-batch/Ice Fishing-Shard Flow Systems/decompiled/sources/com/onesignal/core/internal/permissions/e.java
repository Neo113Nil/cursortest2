package com.onesignal.core.internal.permissions;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {
    public static final e INSTANCE = new e();

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(d callback, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(d callback, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(d callback, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(Function0 function0, DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, d callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(titlePrefix, "titlePrefix");
        Intrinsics.checkNotNullParameter(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        Intrinsics.checkNotNullParameter(callback, "callback");
        show(activity, titlePrefix, previouslyDeniedPostfix, callback, null);
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final d callback, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(titlePrefix, "titlePrefix");
        Intrinsics.checkNotNullParameter(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = activity.getString(u2.b.permission_not_available_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String string2 = activity.getString(u2.b.permission_not_available_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        try {
            new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(u2.b.permission_not_available_open_settings_option, new a(0, callback)).setNegativeButton(R.string.no, new a(1, callback)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.onesignal.core.internal.permissions.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    e.show$lambda$2(d.this, dialogInterface);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.onesignal.core.internal.permissions.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    e.show$lambda$3(Function0.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }
}
