package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fortunequest.neontrack.R;
import g0.AbstractC0161z;
import g0.Y;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0161z {
    public final k d;

    public y(k kVar) {
        this.d = kVar;
    }

    @Override // g0.AbstractC0161z
    public final int a() {
        return this.d.f2266V.f2247f;
    }

    @Override // g0.AbstractC0161z
    public final void c(Y y2, int i) {
        k kVar = this.d;
        int i2 = kVar.f2266V.f2243a.f2305c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) y2).f2321u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f2269Y;
        if (w.b().get(1) == i2) {
            R0.e eVar = cVar.f2250b;
        } else {
            R0.e eVar2 = cVar.f2249a;
        }
        throw null;
    }

    @Override // g0.AbstractC0161z
    public final Y d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
