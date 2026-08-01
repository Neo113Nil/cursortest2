package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.playbag.tripgear.R;
import g0.AbstractC0112D;
import g0.c0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0112D {
    public final k d;

    public y(k kVar) {
        this.d = kVar;
    }

    @Override // g0.AbstractC0112D
    public final int a() {
        return this.d.f1786V.f1767f;
    }

    @Override // g0.AbstractC0112D
    public final void c(c0 c0Var, int i) {
        k kVar = this.d;
        int i2 = kVar.f1786V.f1763a.f1824c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) c0Var).f1840u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1789Y;
        if (w.b().get(1) == i2) {
            J0.e eVar = cVar.f1770b;
        } else {
            J0.e eVar2 = cVar.f1769a;
        }
        throw null;
    }

    @Override // g0.AbstractC0112D
    public final c0 d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
