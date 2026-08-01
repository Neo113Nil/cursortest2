package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.g;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class w4 extends g {
    @Override // androidx.fragment.app.g
    public Dialog onCreateDialog(Bundle bundle) {
        return new v4(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.g
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof v4)) {
            super.setupDialog(dialog, i);
            return;
        }
        v4 v4Var = (v4) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        v4Var.supportRequestWindowFeature(1);
    }
}
