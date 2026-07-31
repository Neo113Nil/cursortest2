package com.onesignal.core.internal.permissions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.R;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¨\u0006\u000f"}, d2 = {"Lcom/onesignal/core/internal/permissions/AlertDialogPrepromptForAndroidSettings;", "", "()V", "show", "", "activity", "Landroid/app/Activity;", "titlePrefix", "", "previouslyDeniedPostfix", "callback", "Lcom/onesignal/core/internal/permissions/AlertDialogPrepromptForAndroidSettings$Callback;", "dismissCallback", "Lkotlin/Function0;", "Callback", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlertDialogPrepromptForAndroidSettings {
    public static final AlertDialogPrepromptForAndroidSettings INSTANCE = new AlertDialogPrepromptForAndroidSettings();

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/onesignal/core/internal/permissions/AlertDialogPrepromptForAndroidSettings$Callback;", "", "onAccept", "", "onDecline", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Callback {
        void onAccept();

        void onDecline();
    }

    private AlertDialogPrepromptForAndroidSettings() {
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, Callback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(titlePrefix, "titlePrefix");
        Intrinsics.checkNotNullParameter(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        Intrinsics.checkNotNullParameter(callback, "callback");
        show(activity, titlePrefix, previouslyDeniedPostfix, callback, null);
    }

    public final void show(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final Callback callback, final Function0<Unit> dismissCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(titlePrefix, "titlePrefix");
        Intrinsics.checkNotNullParameter(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = activity.getString(R.string.permission_not_available_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String string2 = activity.getString(R.string.permission_not_available_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        try {
            new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(R.string.permission_not_available_open_settings_option, new DialogInterface.OnClickListener() { // from class: com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertDialogPrepromptForAndroidSettings.show$lambda$0(AlertDialogPrepromptForAndroidSettings.Callback.this, dialogInterface, i);
                }
            }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertDialogPrepromptForAndroidSettings.show$lambda$1(AlertDialogPrepromptForAndroidSettings.Callback.this, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AlertDialogPrepromptForAndroidSettings.show$lambda$2(AlertDialogPrepromptForAndroidSettings.Callback.this, dialogInterface);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertDialogPrepromptForAndroidSettings.show$lambda$3(Function0.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            Logging.log(LogLevel.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(Callback callback, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(Callback callback, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(Callback callback, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(Function0 function0, DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }
}
