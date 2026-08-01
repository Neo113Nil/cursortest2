package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.derinko.gbini.n1casino.R;
import java.util.Locale;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class yb0 extends py {
    public final os d;

    public yb0(os osVar) {
        this.d = osVar;
    }

    @Override // defpackage.py
    public final int a() {
        return this.d.a0.k;
    }

    @Override // defpackage.py
    public final void d(nz nzVar, int i) {
        os osVar = this.d;
        int i2 = osVar.a0.f.h + i;
        TextView textView = ((xb0) nzVar).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(p70.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        a6 a6Var = osVar.d0;
        if (p70.b().get(1) == i2) {
            Object obj = a6Var.d;
        } else {
            Object obj2 = a6Var.c;
        }
        throw null;
    }

    @Override // defpackage.py
    public final nz e(ViewGroup viewGroup, int i) {
        return new xb0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
