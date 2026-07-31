package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1328c;

/* loaded from: classes.dex */
public class s extends DialogInterfaceOnCancelListenerC1328c {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1328c
    public Dialog onCreateDialog(Bundle bundle) {
        return new r(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1328c
    public void setupDialog(Dialog dialog, int i4) {
        if (!(dialog instanceof r)) {
            super.setupDialog(dialog, i4);
            return;
        }
        r rVar = (r) dialog;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rVar.supportRequestWindowFeature(1);
    }
}
