package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hs {
    public md a;
    private final View b;
    private md e;
    private md f;
    private int d = -1;
    private final hx c = hx.d();

    public hs(View view) {
        this.b = view;
    }

    public final void a() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                md mdVar = this.f;
                if (mdVar == null) {
                    mdVar = new md();
                    this.f = mdVar;
                }
                mdVar.a = null;
                mdVar.d = false;
                mdVar.b = null;
                mdVar.c = false;
                int i = yq.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    mdVar.d = true;
                    mdVar.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    mdVar.c = true;
                    mdVar.b = backgroundTintMode;
                }
                if (mdVar.d || mdVar.c) {
                    ls.g(background, mdVar, view.getDrawableState());
                    return;
                }
            }
            md mdVar2 = this.a;
            if (mdVar2 != null) {
                ls.g(background, mdVar2, view.getDrawableState());
                return;
            }
            md mdVar3 = this.e;
            if (mdVar3 != null) {
                ls.g(background, mdVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = em.A;
        byo u = byo.u(context, attributeSet, iArr, i, 0);
        yq.k(view, view.getContext(), iArr, attributeSet, (TypedArray) u.a, i, 0);
        try {
            if (u.p(0)) {
                this.d = u.h(0, -1);
                ColorStateList a = this.c.a(view.getContext(), this.d);
                if (a != null) {
                    d(a);
                }
            }
            if (u.p(1)) {
                view.setBackgroundTintList(u.i(1));
            }
            if (u.p(2)) {
                int e = u.e(2, -1);
                Rect rect = jl.a;
                view.setBackgroundTintMode(a.q(e, null));
            }
        } finally {
            u.n();
        }
    }

    public final void c(int i) {
        this.d = i;
        hx hxVar = this.c;
        d(hxVar != null ? hxVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            md mdVar = this.e;
            if (mdVar == null) {
                mdVar = new md();
                this.e = mdVar;
            }
            mdVar.a = colorStateList;
            mdVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
