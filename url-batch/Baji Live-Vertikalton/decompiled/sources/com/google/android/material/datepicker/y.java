package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.playwall.bouncefield.R;
import f0.AbstractC0083A;
import f0.X;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends AbstractC0083A {

    /* renamed from: c, reason: collision with root package name */
    public final k f1713c;

    public y(k kVar) {
        this.f1713c = kVar;
    }

    @Override // f0.AbstractC0083A
    public final int a() {
        return this.f1713c.f1658V.f1639f;
    }

    @Override // f0.AbstractC0083A
    public final void c(X x2, int i) {
        k kVar = this.f1713c;
        int i2 = kVar.f1658V.f1635a.f1696c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((x) x2).f1712t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = kVar.f1661Y;
        if (w.b().get(1) == i2) {
            H0.e eVar = cVar.f1642b;
        } else {
            H0.e eVar2 = cVar.f1641a;
        }
        throw null;
    }

    @Override // f0.AbstractC0083A
    public final X d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
