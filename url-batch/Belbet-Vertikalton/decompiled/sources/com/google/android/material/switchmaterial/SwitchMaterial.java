package com.google.android.material.switchmaterial;

import G0.a;
import H0.m;
import H1.l;
import M.E;
import M.P;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import n.V0;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public class SwitchMaterial extends V0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final int[][] f2476a0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: T, reason: collision with root package name */
    public final a f2477T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f2478U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f2479V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2480W;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(S0.a.a(context, attributeSet, com.winpower.neonfit.R.attr.switchStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet);
        Context context2 = getContext();
        this.f2477T = new a(context2);
        int[] iArr = AbstractC0383a.f4168y;
        m.a(context2, attributeSet, com.winpower.neonfit.R.attr.switchStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        m.b(context2, attributeSet, iArr, com.winpower.neonfit.R.attr.switchStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winpower.neonfit.R.attr.switchStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f2480W = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f2478U == null) {
            int u2 = l.u(this, com.winpower.neonfit.R.attr.colorSurface);
            int u3 = l.u(this, com.winpower.neonfit.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.winpower.neonfit.R.dimen.mtrl_switch_thumb_elevation);
            a aVar = this.f2477T;
            if (aVar.f334a) {
                float f2 = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = P.f711a;
                    f2 += E.i((View) parent);
                }
                dimension += f2;
            }
            int a2 = aVar.a(u2, dimension);
            this.f2478U = new ColorStateList(f2476a0, new int[]{l.H(u2, u3, 1.0f), a2, l.H(u2, u3, 0.38f), a2});
        }
        return this.f2478U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f2479V == null) {
            int u2 = l.u(this, com.winpower.neonfit.R.attr.colorSurface);
            int u3 = l.u(this, com.winpower.neonfit.R.attr.colorControlActivated);
            int u4 = l.u(this, com.winpower.neonfit.R.attr.colorOnSurface);
            this.f2479V = new ColorStateList(f2476a0, new int[]{l.H(u2, u3, 0.54f), l.H(u2, u4, 0.32f), l.H(u2, u3, 0.12f), l.H(u2, u4, 0.12f)});
        }
        return this.f2479V;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2480W && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f2480W && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f2480W = z2;
        if (z2) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
