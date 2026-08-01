package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.winfour.neondrop.R;
import h0.AbstractC0113A;
import h0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0113A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1927c;

    public y(k kVar) {
        this.f1927c = kVar;
    }

    @Override // h0.AbstractC0113A
    public final int a() {
        return this.f1927c.f1871V.f1851f;
    }

    @Override // h0.AbstractC0113A
    public final void c(X x2, int i) {
        k kVar = this.f1927c;
        int i2 = kVar.f1871V.f1847a.f1910c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1926t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1874Y;
        if (w.b().get(1) == i2) {
            L0.e eVar = cVar.f1854b;
        } else {
            L0.e eVar2 = cVar.f1853a;
        }
        throw null;
    }

    @Override // h0.AbstractC0113A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
