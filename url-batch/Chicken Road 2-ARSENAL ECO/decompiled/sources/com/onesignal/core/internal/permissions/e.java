package com.onesignal.core.internal.permissions;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class e {
    public static final e INSTANCE = new e();

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(d callback, DialogInterface dialogInterface, int i7) {
        i.e(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(d callback, DialogInterface dialogInterface, int i7) {
        i.e(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(d callback, DialogInterface dialogInterface) {
        i.e(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(InterfaceC0732a interfaceC0732a, DialogInterface dialogInterface) {
        if (interfaceC0732a != null) {
            interfaceC0732a.invoke();
        }
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, d callback) {
        i.e(activity, "activity");
        i.e(titlePrefix, "titlePrefix");
        i.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        i.e(callback, "callback");
        show(activity, titlePrefix, previouslyDeniedPostfix, callback, null);
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final d callback, final InterfaceC0732a interfaceC0732a) {
        i.e(activity, "activity");
        i.e(titlePrefix, "titlePrefix");
        i.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        i.e(callback, "callback");
        String string = activity.getString(S1.b.permission_not_available_title);
        i.d(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        String string2 = activity.getString(S1.b.permission_not_available_message);
        i.d(string2, "getString(...)");
        try {
            new AlertDialog.Builder(activity).setTitle(format).setMessage(String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1))).setPositiveButton(S1.b.permission_not_available_open_settings_option, new a(0, callback)).setNegativeButton(R.string.no, new a(1, callback)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.onesignal.core.internal.permissions.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    e.show$lambda$2(d.this, dialogInterface);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.onesignal.core.internal.permissions.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    e.show$lambda$3(InterfaceC0732a.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }
}
