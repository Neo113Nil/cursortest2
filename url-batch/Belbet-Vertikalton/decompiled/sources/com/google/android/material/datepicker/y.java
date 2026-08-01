package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.winpower.neonfit.R;
import h0.AbstractC0174y;
import h0.V;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0174y {

    /* renamed from: c, reason: collision with root package name */
    public final k f2434c;

    public y(k kVar) {
        this.f2434c = kVar;
    }

    @Override // h0.AbstractC0174y
    public final int a() {
        return this.f2434c.f2379V.f2359f;
    }

    @Override // h0.AbstractC0174y
    public final void c(V v2, int i) {
        k kVar = this.f2434c;
        int i2 = kVar.f2379V.f2355a.f2417c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) v2).f2433t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f2382Y;
        if (w.b().get(1) == i2) {
            N0.e eVar = cVar.f2362b;
        } else {
            N0.e eVar2 = cVar.f2361a;
        }
        throw null;
    }

    @Override // h0.AbstractC0174y
    public final V d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
