package com.squareup.util.android;

import android.util.Property;
import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class Views$SCALE$1 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        View view = (View) obj;
        view.getClass();
        if (view.getScaleX() == view.getScaleY()) {
            return Float.valueOf(view.getScaleX());
        }
        a$$ExternalSyntheticBUOutline0.m$1("scaleX != scaleY");
        return null;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        if (view != null) {
            f.getClass();
            float floatValue = f.floatValue();
            view.setScaleX(floatValue);
            view.setScaleY(floatValue);
        }
    }
}
