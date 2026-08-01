package defpackage;

import android.text.Editable;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.moontiko.really.admiralcasino.MainActivity2;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements ab, na, zy {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ab
    public void a(ChipGroup chipGroup, ArrayList arrayList) {
        String k;
        CharSequence text;
        String string;
        CharSequence text2;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                d2 d2Var = (d2) obj;
                Integer num = (Integer) (arrayList.isEmpty() ? null : arrayList.get(0));
                if (num != null) {
                    Chip chip = (Chip) chipGroup.findViewById(num.intValue());
                    if (chip == null || (text = chip.getText()) == null || (k = text.toString()) == null) {
                        k = d2Var.k(R.string.category_personal);
                        k.getClass();
                    }
                    d2Var.t0 = k;
                    return;
                }
                return;
            default:
                MainActivity2 mainActivity2 = (MainActivity2) obj;
                int i2 = MainActivity2.H;
                Integer num2 = (Integer) (arrayList.isEmpty() ? null : arrayList.get(0));
                Chip chip2 = num2 != null ? (Chip) chipGroup.findViewById(num2.intValue()) : null;
                if (chip2 == null || (text2 = chip2.getText()) == null || (string = text2.toString()) == null) {
                    string = mainActivity2.getString(R.string.category_all);
                    string.getClass();
                }
                if (string.equals(mainActivity2.getString(R.string.category_all))) {
                    ry r = mainActivity2.r();
                    r.f = "All";
                    r.e = "";
                    r.d();
                    return;
                }
                o1 o1Var = mainActivity2.E;
                if (o1Var == null) {
                    kr.g0("binding");
                    throw null;
                }
                Editable text3 = ((TextInputEditText) o1Var.b).getText();
                if (text3 != null) {
                    text3.clear();
                }
                ry r2 = mainActivity2.r();
                r2.f = string;
                r2.e = "";
                r2.d();
                return;
        }
    }

    @Override // defpackage.na
    public void b() {
        CheckableImageButton checkableImageButton = ((x60) this.g).i;
        kr.h0(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.zy
    public ye0 l(View view, ye0 ye0Var) {
        d80 d80Var = (d80) this.g;
        ArrayList arrayList = d80Var.b;
        ve0 ve0Var = ye0Var.a;
        er b = er.b(ve0Var.h(519), ve0Var.h(64));
        er b2 = er.b(ve0Var.i(519), ve0Var.i(64));
        if (!b.equals(d80Var.c) || !b2.equals(d80Var.d)) {
            d80Var.c = b;
            d80Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                p00 p00Var = (p00) arrayList.get(size);
                p00Var.c = b;
                p00Var.d = b2;
                p00Var.c();
            }
        }
        return ye0Var;
    }
}
