package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.visualfortune.eyerest.R;
import f0.AbstractC0084A;
import f0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0084A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1748c;

    public y(k kVar) {
        this.f1748c = kVar;
    }

    @Override // f0.AbstractC0084A
    public final int a() {
        return this.f1748c.f1694V.f1675f;
    }

    @Override // f0.AbstractC0084A
    public final void c(X x2, int i) {
        k kVar = this.f1748c;
        int i2 = kVar.f1694V.f1671a.f1731c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1747t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1697Y;
        if (w.b().get(1) == i2) {
            I0.e eVar = cVar.f1678b;
        } else {
            I0.e eVar2 = cVar.f1677a;
        }
        throw null;
    }

    @Override // f0.AbstractC0084A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
