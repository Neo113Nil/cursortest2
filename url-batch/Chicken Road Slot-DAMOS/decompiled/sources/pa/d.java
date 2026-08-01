package pa;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(c cVar, DialogInterface dialogInterface, int i3) {
        cVar.getClass();
        cVar.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(c cVar, DialogInterface dialogInterface, int i3) {
        cVar.getClass();
        cVar.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(c cVar, DialogInterface dialogInterface) {
        cVar.getClass();
        cVar.onDecline();
    }

    public final void show(Activity activity, String str, String str2, final c cVar) {
        activity.getClass();
        str.getClass();
        str2.getClass();
        cVar.getClass();
        String string = activity.getString(ca.b.permission_not_available_title);
        string.getClass();
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        String string2 = activity.getString(ca.b.permission_not_available_message);
        string2.getClass();
        try {
            new AlertDialog.Builder(activity).setTitle(format).setMessage(String.format(string2, Arrays.copyOf(new Object[]{str2}, 1))).setPositiveButton(ca.b.permission_not_available_open_settings_option, new a(0, cVar)).setNegativeButton(R.string.no, new a(1, cVar)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pa.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    d.show$lambda$2(c.this, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            cVar.onDecline();
        }
    }
}
