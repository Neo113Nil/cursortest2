package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.winworm.neongrid.R;
import g0.AbstractC0112B;
import g0.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0112B {
    public final k d;

    public y(k kVar) {
        this.d = kVar;
    }

    @Override // g0.AbstractC0112B
    public final int a() {
        return this.d.f1817V.f1798f;
    }

    @Override // g0.AbstractC0112B
    public final void c(a0 a0Var, int i) {
        k kVar = this.d;
        int i2 = kVar.f1817V.f1794a.f1856c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) a0Var).f1872u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1820Y;
        if (w.b().get(1) == i2) {
            J0.e eVar = cVar.f1801b;
        } else {
            J0.e eVar2 = cVar.f1800a;
        }
        throw null;
    }

    @Override // g0.AbstractC0112B
    public final a0 d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
