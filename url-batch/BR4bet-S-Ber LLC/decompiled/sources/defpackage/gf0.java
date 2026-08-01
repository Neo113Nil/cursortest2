package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moontiko.really.admiralcasino.R;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gf0 extends t10 {
    public final pv d;

    public gf0(pv pvVar) {
        this.d = pvVar;
    }

    @Override // defpackage.t10
    public final int a() {
        return this.d.a0.k;
    }

    @Override // defpackage.t10
    public final void c(q20 q20Var, int i) {
        pv pvVar = this.d;
        int i2 = pvVar.a0.f.h + i;
        TextView textView = ((ff0) q20Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(za0.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        k6 k6Var = pvVar.d0;
        if (za0.b().get(1) == i2) {
            Object obj = k6Var.i;
        } else {
            Object obj2 = k6Var.h;
        }
        throw null;
    }

    @Override // defpackage.t10
    public final q20 d(ViewGroup viewGroup) {
        return new ff0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
