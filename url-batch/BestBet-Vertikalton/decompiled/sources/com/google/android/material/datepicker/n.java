package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n<S> extends t {

    /* renamed from: U, reason: collision with root package name */
    public int f2301U;

    /* renamed from: V, reason: collision with root package name */
    public b f2302V;

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1463f;
        }
        this.f2301U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2302V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f2301U));
        throw null;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2301U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2302V);
    }
}
