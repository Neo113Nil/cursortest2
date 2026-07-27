package com.onesignal.core.internal.permissions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.onesignal.core.R;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class AlertDialogPrepromptForAndroidSettings {
    public static final AlertDialogPrepromptForAndroidSettings INSTANCE = new AlertDialogPrepromptForAndroidSettings();
    private static AlertDialog currentDialog;

    public interface Callback {
        void onAccept();

        void onDecline();
    }

    private AlertDialogPrepromptForAndroidSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(Callback callback, DialogInterface dialogInterface, int i2) {
        i.e(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(Callback callback, DialogInterface dialogInterface, int i2) {
        i.e(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(Callback callback, DialogInterface dialogInterface) {
        i.e(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(InterfaceC1430a interfaceC1430a, DialogInterface dialogInterface) {
        currentDialog = null;
        if (interfaceC1430a != null) {
            interfaceC1430a.invoke();
        }
    }

    public final void dismissCurrentDialog() {
        AlertDialog alertDialog = currentDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        currentDialog = null;
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, Callback callback) {
        i.e(activity, "activity");
        i.e(titlePrefix, "titlePrefix");
        i.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        i.e(callback, "callback");
        show(activity, titlePrefix, previouslyDeniedPostfix, callback, null);
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final Callback callback, final InterfaceC1430a interfaceC1430a) {
        i.e(activity, "activity");
        i.e(titlePrefix, "titlePrefix");
        i.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        i.e(callback, "callback");
        String string = activity.getString(R.string.permission_not_available_title);
        i.d(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        String string2 = activity.getString(R.string.permission_not_available_message);
        i.d(string2, "getString(...)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1));
        try {
            final int i2 = 0;
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(R.string.permission_not_available_open_settings_option, new DialogInterface.OnClickListener() { // from class: com.onesignal.core.internal.permissions.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i2) {
                        case 0:
                            AlertDialogPrepromptForAndroidSettings.show$lambda$0(callback, dialogInterface, i3);
                            break;
                        default:
                            AlertDialogPrepromptForAndroidSettings.show$lambda$1(callback, dialogInterface, i3);
                            break;
                    }
                }
            });
            final int i3 = 1;
            currentDialog = positiveButton.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.onesignal.core.internal.permissions.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i32) {
                    switch (i3) {
                        case 0:
                            AlertDialogPrepromptForAndroidSettings.show$lambda$0(callback, dialogInterface, i32);
                            break;
                        default:
                            AlertDialogPrepromptForAndroidSettings.show$lambda$1(callback, dialogInterface, i32);
                            break;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.onesignal.core.internal.permissions.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AlertDialogPrepromptForAndroidSettings.show$lambda$2(AlertDialogPrepromptForAndroidSettings.Callback.this, dialogInterface);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.onesignal.core.internal.permissions.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertDialogPrepromptForAndroidSettings.show$lambda$3(InterfaceC1430a.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            Logging.log(LogLevel.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }
}
