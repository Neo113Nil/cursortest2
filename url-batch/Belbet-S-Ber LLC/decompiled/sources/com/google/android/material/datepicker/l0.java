package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.focus.FocusRingDrawable;
import g1.q0;
import g1.q1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l0 extends q0 {
    public final q d;

    public l0(q qVar) {
        this.d = qVar;
    }

    @Override // g1.q0
    public final int a() {
        return this.d.f1087b0.f1036k;
    }

    @Override // g1.q0
    public final void c(q1 q1Var, int i) {
        q qVar = this.d;
        int i4 = qVar.f1087b0.f1033f.h + i;
        TextView textView = ((k0) q1Var).f1078u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i4)));
        Context context = textView.getContext();
        textView.setContentDescription(i0.d().get(1) == i4 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        d dVar = qVar.f1089e0;
        Calendar d = i0.d();
        c cVar = d.get(1) == i4 ? dVar.f1053f : dVar.d;
        ArrayList a5 = qVar.f1086a0.a();
        int size = a5.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = a5.get(i5);
            i5++;
            d.setTimeInMillis(((Long) obj).longValue());
            if (d.get(1) == i4) {
                cVar = dVar.f1052e;
            }
        }
        cVar.w(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.f1152u;
            if (b4.d.P(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                o2.o oVar = (o2.o) cVar.f1044f;
                h2.b bVar = focusRingDrawable.f1168t;
                bVar.f1990t = oVar;
                bVar.f1986p = ((Rect) cVar.f1041b).top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(cVar == dVar.f1052e);
        textView.setOnClickListener(new j0(this, i4));
    }

    @Override // g1.q0
    public final q1 d(ViewGroup viewGroup) {
        return new k0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
