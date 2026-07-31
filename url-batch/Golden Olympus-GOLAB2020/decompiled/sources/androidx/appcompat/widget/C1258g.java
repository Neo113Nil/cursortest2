package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC1281a0;
import f.AbstractC2415a;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1258g {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f10909a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f10910b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f10911c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10912d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10913e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10914f;

    C1258g(CompoundButton compoundButton) {
        this.f10909a = compoundButton;
    }

    void a() {
        Drawable a4 = androidx.core.widget.c.a(this.f10909a);
        if (a4 != null) {
            if (this.f10912d || this.f10913e) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(a4).mutate();
                if (this.f10912d) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f10910b);
                }
                if (this.f10913e) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f10911c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f10909a.getDrawableState());
                }
                this.f10909a.setButtonDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f10910b;
    }

    PorterDuff.Mode c() {
        return this.f10911c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005d, B:11:0x0065, B:12:0x0070, B:14:0x0078, B:21:0x0040, B:23:0x0048, B:25:0x0050), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d(AttributeSet attributeSet, int i4) {
        int n4;
        int n5;
        Z v4 = Z.v(this.f10909a.getContext(), attributeSet, e.j.f36447U0, i4, 0);
        CompoundButton compoundButton = this.f10909a;
        AbstractC1281a0.m0(compoundButton, compoundButton.getContext(), e.j.f36447U0, attributeSet, v4.r(), i4, 0);
        try {
            if (v4.s(e.j.f36455W0) && (n5 = v4.n(e.j.f36455W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f10909a;
                    compoundButton2.setButtonDrawable(AbstractC2415a.b(compoundButton2.getContext(), n5));
                } catch (Resources.NotFoundException unused) {
                }
                if (v4.s(e.j.f36459X0)) {
                    androidx.core.widget.c.c(this.f10909a, v4.c(e.j.f36459X0));
                }
                if (v4.s(e.j.f36463Y0)) {
                    androidx.core.widget.c.d(this.f10909a, F.e(v4.k(e.j.f36463Y0, -1), null));
                }
                v4.x();
            }
            if (v4.s(e.j.f36451V0) && (n4 = v4.n(e.j.f36451V0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f10909a;
                compoundButton3.setButtonDrawable(AbstractC2415a.b(compoundButton3.getContext(), n4));
            }
            if (v4.s(e.j.f36459X0)) {
            }
            if (v4.s(e.j.f36463Y0)) {
            }
            v4.x();
        } catch (Throwable th) {
            v4.x();
            throw th;
        }
    }

    void e() {
        if (this.f10914f) {
            this.f10914f = false;
        } else {
            this.f10914f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f10910b = colorStateList;
        this.f10912d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f10911c = mode;
        this.f10913e = true;
        a();
    }
}
