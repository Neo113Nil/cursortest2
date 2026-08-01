package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import b1.c1;
import b1.e0;
import com.gglhk.bofio.fortunetiger.R;
import java.util.Locale;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final l f1283d;

    public c0(l lVar) {
        this.f1283d = lVar;
    }

    @Override // b1.e0
    public final int a() {
        return this.f1283d.a0.f1279k;
    }

    @Override // b1.e0
    public final void c(c1 c1Var, int i4) {
        l lVar = this.f1283d;
        int i5 = lVar.a0.f1276f.h + i4;
        TextView textView = ((b0) c1Var).f1281u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i5)));
        Context context = textView.getContext();
        textView.setContentDescription(a0.b().get(1) == i5 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i5)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i5)));
        androidx.emoji2.text.s sVar = lVar.f1294d0;
        if (a0.b().get(1) == i5) {
            Object obj = sVar.f358d;
        } else {
            Object obj2 = sVar.c;
        }
        throw null;
    }

    @Override // b1.e0
    public final c1 d(ViewGroup viewGroup) {
        return new b0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
