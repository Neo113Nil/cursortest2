package defpackage;

import android.widget.CompoundButton;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiz implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aiz(TwoStatePreference twoStatePreference, int i) {
        this.b = i;
        this.a = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            if (((Preference) obj).L(Boolean.valueOf(z))) {
                ((TwoStatePreference) obj).k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        if (i == 1) {
            Object obj2 = this.a;
            if (((Preference) obj2).L(Boolean.valueOf(z))) {
                ((TwoStatePreference) obj2).k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        Object obj3 = this.a;
        if (i != 2) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj3).d;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                return;
            }
            return;
        }
        if (((Preference) obj3).L(Boolean.valueOf(z))) {
            ((TwoStatePreference) obj3).k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }

    public /* synthetic */ aiz(Chip chip, int i) {
        this.b = i;
        this.a = chip;
    }
}
