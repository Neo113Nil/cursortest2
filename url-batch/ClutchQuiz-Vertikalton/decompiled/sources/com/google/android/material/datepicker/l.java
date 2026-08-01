package com.google.android.material.datepicker;

import K.InterfaceC0017s;
import K.w0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements InterfaceC0017s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1878a;

    /* renamed from: b, reason: collision with root package name */
    public int f1879b;

    /* renamed from: c, reason: collision with root package name */
    public int f1880c;

    public l(View view) {
        this.f1878a = view;
    }

    @Override // K.InterfaceC0017s
    public w0 c(View view, w0 w0Var) {
        int i = w0Var.f451a.f(7).f95b;
        View view2 = (View) this.f1878a;
        int i2 = this.f1879b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1880c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return w0Var;
    }

    public l(Context context, XmlResourceParser xmlResourceParser) {
        this.f1878a = new ArrayList();
        this.f1880c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.r.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1879b = obtainStyledAttributes.getResourceId(index, this.f1879b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1880c);
                this.f1880c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new v.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public l(View view, int i, int i2) {
        this.f1879b = i;
        this.f1878a = view;
        this.f1880c = i2;
    }
}
