package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.winfour.winrandom.R;
import h0.AbstractC0114B;
import h0.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0114B {
    public final k d;

    public y(k kVar) {
        this.d = kVar;
    }

    @Override // h0.AbstractC0114B
    public final int a() {
        return this.d.f1886V.f1866f;
    }

    @Override // h0.AbstractC0114B
    public final void c(a0 a0Var, int i) {
        k kVar = this.d;
        int i2 = kVar.f1886V.f1862a.f1924c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) a0Var).f1940u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1889Y;
        if (w.b().get(1) == i2) {
            K0.e eVar = cVar.f1869b;
        } else {
            K0.e eVar2 = cVar.f1868a;
        }
        throw null;
    }

    @Override // h0.AbstractC0114B
    public final a0 d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
