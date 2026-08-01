package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import f0.H;
import f0.K;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1864c;

    public i(k kVar, s sVar, MaterialButton materialButton) {
        this.f1864c = kVar;
        this.f1862a = sVar;
        this.f1863b = materialButton;
    }

    @Override // f0.K
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f1863b.getText());
        }
    }

    @Override // f0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int K02;
        k kVar = this.f1864c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f1873a0.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            K02 = M02 == null ? -1 : H.H(M02);
        } else {
            K02 = ((LinearLayoutManager) kVar.f1873a0.getLayoutManager()).K0();
        }
        b bVar = this.f1862a.f1919c;
        Calendar a2 = w.a(bVar.f1845a.f1905a);
        a2.add(2, K02);
        kVar.f1869W = new o(a2);
        Calendar a3 = w.a(bVar.f1845a.f1905a);
        a3.add(2, K02);
        a3.set(5, 1);
        Calendar a4 = w.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = w.f1922a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f1863b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
