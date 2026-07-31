package O;

import android.widget.CompoundButton;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(CompoundButton compoundButton, boolean z4) {
        if (compoundButton.isChecked() != z4) {
            compoundButton.setChecked(z4);
        }
    }
}
