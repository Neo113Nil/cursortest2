package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import f1.b1;
import f1.d0;
import java.util.Locale;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b0 extends d0 {
    public final m d;

    public b0(m mVar) {
        this.d = mVar;
    }

    @Override // f1.d0
    public final int a() {
        return this.d.f923a0.f907k;
    }

    @Override // f1.d0
    public final void c(b1 b1Var, int i) {
        m mVar = this.d;
        int i4 = mVar.f923a0.f903f.f957h + i;
        TextView textView = ((a0) b1Var).f902u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i4)));
        Context context = textView.getContext();
        textView.setContentDescription(z.b().get(1) == i4 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        c cVar = mVar.d0;
        if (z.b().get(1) == i4) {
            l2.f fVar = cVar.f910b;
        } else {
            l2.f fVar2 = cVar.f909a;
        }
        throw null;
    }

    @Override // f1.d0
    public final b1 d(ViewGroup viewGroup) {
        return new a0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
