package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.AbstractC1281a0;
import f.AbstractC2415a;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1257f {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f10902a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f10903b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f10904c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10905d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10906e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10907f;

    C1257f(CheckedTextView checkedTextView) {
        this.f10902a = checkedTextView;
    }

    void a() {
        Drawable a4 = androidx.core.widget.b.a(this.f10902a);
        if (a4 != null) {
            if (this.f10905d || this.f10906e) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(a4).mutate();
                if (this.f10905d) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f10903b);
                }
                if (this.f10906e) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f10904c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f10902a.getDrawableState());
                }
                this.f10902a.setCheckMarkDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f10903b;
    }

    PorterDuff.Mode c() {
        return this.f10904c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d(AttributeSet attributeSet, int i4) {
        int n4;
        int n5;
        Z v4 = Z.v(this.f10902a.getContext(), attributeSet, e.j.f36427P0, i4, 0);
        CheckedTextView checkedTextView = this.f10902a;
        AbstractC1281a0.m0(checkedTextView, checkedTextView.getContext(), e.j.f36427P0, attributeSet, v4.r(), i4, 0);
        try {
            if (v4.s(e.j.f36435R0) && (n5 = v4.n(e.j.f36435R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f10902a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC2415a.b(checkedTextView2.getContext(), n5));
                } catch (Resources.NotFoundException unused) {
                }
                if (v4.s(e.j.f36439S0)) {
                    androidx.core.widget.b.b(this.f10902a, v4.c(e.j.f36439S0));
                }
                if (v4.s(e.j.f36443T0)) {
                    androidx.core.widget.b.c(this.f10902a, F.e(v4.k(e.j.f36443T0, -1), null));
                }
                v4.x();
            }
            if (v4.s(e.j.f36431Q0) && (n4 = v4.n(e.j.f36431Q0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f10902a;
                checkedTextView3.setCheckMarkDrawable(AbstractC2415a.b(checkedTextView3.getContext(), n4));
            }
            if (v4.s(e.j.f36439S0)) {
            }
            if (v4.s(e.j.f36443T0)) {
            }
            v4.x();
        } catch (Throwable th) {
            v4.x();
            throw th;
        }
    }

    void e() {
        if (this.f10907f) {
            this.f10907f = false;
        } else {
            this.f10907f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f10903b = colorStateList;
        this.f10905d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f10904c = mode;
        this.f10906e = true;
        a();
    }
}
