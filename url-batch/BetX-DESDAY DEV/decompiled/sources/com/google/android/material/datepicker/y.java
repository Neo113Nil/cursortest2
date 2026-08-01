package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.luckyarcade.spinthrow.R;
import e0.AbstractC0108A;
import e0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0108A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1914c;

    public y(k kVar) {
        this.f1914c = kVar;
    }

    @Override // e0.AbstractC0108A
    public final int a() {
        return this.f1914c.f1857V.f1838f;
    }

    @Override // e0.AbstractC0108A
    public final void c(X x2, int i) {
        k kVar = this.f1914c;
        int i2 = kVar.f1857V.f1833a.f1894c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1913t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1860Y;
        if (w.b().get(1) == i2) {
            H0.e eVar = cVar.f1841b;
        } else {
            H0.e eVar2 = cVar.f1840a;
        }
        throw null;
    }

    @Override // e0.AbstractC0108A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
