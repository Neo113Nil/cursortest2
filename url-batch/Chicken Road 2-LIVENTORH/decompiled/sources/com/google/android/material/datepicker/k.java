package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import f1.m0;
import f1.p0;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f920b;

    public k(m mVar, v vVar) {
        this.f920b = mVar;
        this.f919a = vVar;
    }

    @Override // f1.p0
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int L0;
        b bVar = this.f919a.d;
        m mVar = this.f920b;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar.f927f0.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            L0 = N0 == null ? -1 : m0.H(N0);
        } else {
            L0 = ((LinearLayoutManager) mVar.f927f0.getLayoutManager()).L0();
        }
        Calendar a2 = z.a(bVar.f903f.f955f);
        a2.add(2, L0);
        r rVar = new r(a2);
        mVar.f924b0 = rVar;
        MaterialButton materialButton = mVar.f931k0;
        Calendar a4 = z.a(bVar.f903f.f955f);
        a4.add(2, L0);
        a4.set(5, 1);
        Calendar a5 = z.a(a4);
        a5.get(2);
        a5.get(1);
        a5.getMaximum(7);
        a5.getActualMaximum(5);
        a5.getTimeInMillis();
        long timeInMillis = a5.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z.f972a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        mVar.I(bVar.f903f.d(rVar));
    }
}
