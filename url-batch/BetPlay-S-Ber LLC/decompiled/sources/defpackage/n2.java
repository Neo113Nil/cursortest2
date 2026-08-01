package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.awerser.monnit.betplay.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n2 extends BottomSheetDialogFragment {
    public h8 f;
    public u40 g;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_add_habit, viewGroup, false);
        int i = R.id.btnAdd;
        MaterialButton materialButton = (MaterialButton) j8.m(inflate, R.id.btnAdd);
        if (materialButton != null) {
            i = R.id.chipGroupCategory;
            ChipGroup chipGroup = (ChipGroup) j8.m(inflate, R.id.chipGroupCategory);
            if (chipGroup != null) {
                i = R.id.etHabitName;
                TextInputEditText textInputEditText = (TextInputEditText) j8.m(inflate, R.id.etHabitName);
                if (textInputEditText != null) {
                    i = R.id.tilHabitName;
                    TextInputLayout textInputLayout = (TextInputLayout) j8.m(inflate, R.id.tilHabitName);
                    if (textInputLayout != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        h8 h8Var = new h8();
                        h8Var.f = materialButton;
                        h8Var.g = chipGroup;
                        h8Var.h = textInputEditText;
                        h8Var.i = textInputLayout;
                        this.f = h8Var;
                        linearLayout.getClass();
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ei eiVar = m9.j;
        eiVar.getClass();
        h hVar = new h(eiVar);
        while (true) {
            if (!hVar.hasNext()) {
                break;
            }
            m9 m9Var = (m9) hVar.next();
            h8 h8Var = this.f;
            h8Var.getClass();
            ChipGroup chipGroup = (ChipGroup) h8Var.g;
            Chip chip = new Chip(requireContext(), null);
            chip.setText(m9Var.f + " " + m9Var.g);
            chip.setCheckable(true);
            chipGroup.addView(chip);
        }
        h8 h8Var2 = this.f;
        h8Var2.getClass();
        View childAt = ((ChipGroup) h8Var2.g).getChildAt(0);
        Chip chip2 = childAt instanceof Chip ? (Chip) childAt : null;
        if (chip2 != null) {
            chip2.setChecked(true);
        }
        h8 h8Var3 = this.f;
        h8Var3.getClass();
        ((MaterialButton) h8Var3.f).setOnClickListener(new m2(0, this));
    }
}
