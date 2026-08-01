package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clutchquizarena.app.R;
import f0.AbstractC0119z;
import f0.W;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0119z {

    /* renamed from: c, reason: collision with root package name */
    public final k f1924c;

    public y(k kVar) {
        this.f1924c = kVar;
    }

    @Override // f0.AbstractC0119z
    public final int a() {
        return this.f1924c.f1868V.f1849f;
    }

    @Override // f0.AbstractC0119z
    public final void c(W w2, int i) {
        k kVar = this.f1924c;
        int i2 = kVar.f1868V.f1845a.f1907c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) w2).f1923t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1871Y;
        if (w.b().get(1) == i2) {
            O0.e eVar = cVar.f1852b;
        } else {
            O0.e eVar2 = cVar.f1851a;
        }
        throw null;
    }

    @Override // f0.AbstractC0119z
    public final W d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
