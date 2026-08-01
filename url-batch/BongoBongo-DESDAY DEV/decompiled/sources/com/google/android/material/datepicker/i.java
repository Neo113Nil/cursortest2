package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import h0.J;
import h0.M;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1882c;

    public i(k kVar, s sVar, MaterialButton materialButton) {
        this.f1882c = kVar;
        this.f1880a = sVar;
        this.f1881b = materialButton;
    }

    @Override // h0.M
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f1881b.getText());
        }
    }

    @Override // h0.M
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int M02;
        k kVar = this.f1882c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f1891a0.getLayoutManager();
            View O02 = linearLayoutManager.O0(0, linearLayoutManager.v(), false);
            M02 = O02 == null ? -1 : J.H(O02);
        } else {
            M02 = ((LinearLayoutManager) kVar.f1891a0.getLayoutManager()).M0();
        }
        b bVar = this.f1880a.d;
        Calendar a2 = w.a(bVar.f1862a.f1922a);
        a2.add(2, M02);
        kVar.f1887W = new o(a2);
        Calendar a3 = w.a(bVar.f1862a.f1922a);
        a3.add(2, M02);
        a3.set(5, 1);
        Calendar a4 = w.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = w.f1939a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f1881b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
