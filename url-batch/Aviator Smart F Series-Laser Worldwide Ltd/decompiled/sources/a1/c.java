package a1;

import android.app.Activity;
import android.content.Context;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.c0;

/* loaded from: classes2.dex */
public class c {
    private static final String[] PERMISSION_CALENDAR = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    public static boolean hasCalendarPermission(Context context) {
        return q7.b.hasSelfPermissions(context, PERMISSION_CALENDAR);
    }

    public static boolean isFirstRequestCalendarPermission() {
        return !g.getInstance().contains(BaseParamNames.FIRST_REQUEST_CALENDAR_PERMISSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showCalendarPermissionDialog$0(Activity activity, MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        c0.jumpAppDetailsSetting(activity);
    }

    public static void saveFirstRequestCalendarPermission() {
        g.getInstance().putBoolean(BaseParamNames.FIRST_REQUEST_CALENDAR_PERMISSION, true);
    }

    public static MaterialDialog showCalendarPermissionDialog(final Activity activity) {
        return new MaterialDialog.e(activity).content(R.string.cricket_request_calendar_permission_hint).positiveText(R.string.allow).negativeText(R.string.deny).onPositive(new MaterialDialog.l() { // from class: a1.a
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                c.lambda$showCalendarPermissionDialog$0(activity, materialDialog, dialogAction);
            }
        }).onNegative(new MaterialDialog.l() { // from class: a1.b
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                materialDialog.dismiss();
            }
        }).cancelable(false).show();
    }
}
