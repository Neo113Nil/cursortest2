package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Calendar;
import t0.AbstractC5032P;
import t0.AbstractC5059v;
import t0.C5020D;

/* loaded from: classes2.dex */
public final class s extends AbstractC5059v {

    /* renamed from: c, reason: collision with root package name */
    public final b f36178c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.j f36179d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36180e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, I0.j jVar) {
        o oVar = bVar.f36098n;
        o oVar2 = bVar.f36101w;
        if (oVar.f36162n.compareTo(oVar2.f36162n) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f36162n.compareTo(bVar.f36099u.f36162n) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f36180e = (contextThemeWrapper.getResources().getDimensionPixelSize(C5284R.dimen.mtrl_calendar_day_height) * p.f36169d) + (m.G(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(C5284R.dimen.mtrl_calendar_day_height) : 0);
        this.f36178c = bVar;
        this.f36179d = jVar;
        if (this.f40799a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f40800b = true;
    }

    @Override // t0.AbstractC5059v
    public final int a() {
        return this.f36178c.f36104z;
    }

    @Override // t0.AbstractC5059v
    public final long b(int i) {
        Calendar a9 = w.a(this.f36178c.f36098n.f36162n);
        a9.add(2, i);
        a9.set(5, 1);
        Calendar a10 = w.a(a9);
        a10.get(2);
        a10.get(1);
        a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        return a10.getTimeInMillis();
    }

    @Override // t0.AbstractC5059v
    public final void c(AbstractC5032P abstractC5032P, int i) {
        r rVar = (r) abstractC5032P;
        b bVar = this.f36178c;
        Calendar a9 = w.a(bVar.f36098n.f36162n);
        a9.add(2, i);
        o oVar = new o(a9);
        rVar.f36176t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f36177u.findViewById(C5284R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f36171a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // t0.AbstractC5059v
    public final AbstractC5032P d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C5284R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.G(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C5020D(-1, this.f36180e));
        return new r(linearLayout, true);
    }
}
