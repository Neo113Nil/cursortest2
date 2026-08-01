package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f1890U;

    /* renamed from: V, reason: collision with root package name */
    public b f1891V;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f1400f;
        }
        this.f1890U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1891V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(d(), this.f1890U));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1890U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1891V);
    }
}
