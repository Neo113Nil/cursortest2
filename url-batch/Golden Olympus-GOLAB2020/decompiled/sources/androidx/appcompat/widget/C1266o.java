package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1266o extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f10961b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f10962a;

    public C1266o(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    private void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        Z v4 = Z.v(context, attributeSet, e.j.f36464Y1, i4, i5);
        if (v4.s(e.j.f36473a2)) {
            b(v4.a(e.j.f36473a2, false));
        }
        setBackgroundDrawable(v4.g(e.j.f36468Z1));
        v4.x();
    }

    private void b(boolean z4) {
        if (f10961b) {
            this.f10962a = z4;
        } else {
            androidx.core.widget.i.a(this, z4);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (f10961b && this.f10962a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f10961b && this.f10962a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f10961b && this.f10962a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
