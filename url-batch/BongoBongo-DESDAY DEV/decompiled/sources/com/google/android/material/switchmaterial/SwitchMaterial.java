package com.google.android.material.switchmaterial;

import A1.d;
import D0.a;
import E0.n;
import L.H;
import L.T;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import m.W0;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public class SwitchMaterial extends W0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final int[][] f1981a0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: T, reason: collision with root package name */
    public final a f1982T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f1983U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f1984V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1985W;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(P0.a.a(context, attributeSet, com.winfour.winrandom.R.attr.switchStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet);
        Context context2 = getContext();
        this.f1982T = new a(context2);
        int[] iArr = AbstractC0285a.f3522y;
        n.a(context2, attributeSet, com.winfour.winrandom.R.attr.switchStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        n.b(context2, attributeSet, iArr, com.winfour.winrandom.R.attr.switchStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.winfour.winrandom.R.attr.switchStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f1985W = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f1983U == null) {
            int B2 = d.B(this, com.winfour.winrandom.R.attr.colorSurface);
            int B3 = d.B(this, com.winfour.winrandom.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.winfour.winrandom.R.dimen.mtrl_switch_thumb_elevation);
            a aVar = this.f1982T;
            if (aVar.f136a) {
                float f2 = RecyclerView.A0;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = T.f490a;
                    f2 += H.i((View) parent);
                }
                dimension += f2;
            }
            int a2 = aVar.a(B2, dimension);
            this.f1983U = new ColorStateList(f1981a0, new int[]{d.S(B2, B3, 1.0f), a2, d.S(B2, B3, 0.38f), a2});
        }
        return this.f1983U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f1984V == null) {
            int B2 = d.B(this, com.winfour.winrandom.R.attr.colorSurface);
            int B3 = d.B(this, com.winfour.winrandom.R.attr.colorControlActivated);
            int B4 = d.B(this, com.winfour.winrandom.R.attr.colorOnSurface);
            this.f1984V = new ColorStateList(f1981a0, new int[]{d.S(B2, B3, 0.54f), d.S(B2, B4, 0.32f), d.S(B2, B3, 0.12f), d.S(B2, B4, 0.12f)});
        }
        return this.f1984V;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1985W && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f1985W && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f1985W = z2;
        if (z2) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
