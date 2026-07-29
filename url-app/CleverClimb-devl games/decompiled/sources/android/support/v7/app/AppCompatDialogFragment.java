package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new i(getContext(), getTheme());
    }

    @Override // android.support.v4.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof i) {
            i iVar = (i) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
                default:
                    return;
            }
            iVar.a(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
