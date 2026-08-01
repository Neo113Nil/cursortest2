package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.neonpulse.gridlogic.R;
import f0.AbstractC0085A;
import f0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0085A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1816c;

    public y(k kVar) {
        this.f1816c = kVar;
    }

    @Override // f0.AbstractC0085A
    public final int a() {
        return this.f1816c.f1761V.f1742f;
    }

    @Override // f0.AbstractC0085A
    public final void c(X x2, int i) {
        k kVar = this.f1816c;
        int i2 = kVar.f1761V.f1738a.f1799c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1815t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1764Y;
        if (w.b().get(1) == i2) {
            I0.e eVar = cVar.f1745b;
        } else {
            I0.e eVar2 = cVar.f1744a;
        }
        throw null;
    }

    @Override // f0.AbstractC0085A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
