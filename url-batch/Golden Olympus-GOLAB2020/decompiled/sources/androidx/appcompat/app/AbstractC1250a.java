package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1250a {

    /* renamed from: androidx.appcompat.app.a$b */
    public static abstract class b {
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z4);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public abstract boolean o(int i4, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z4);

    public abstract void s(boolean z4);

    public abstract void t(CharSequence charSequence);

    public androidx.appcompat.view.b u(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0077a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f10174a;

        public C0077a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10174a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f36565t);
            this.f10174a = obtainStyledAttributes.getInt(e.j.f36570u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0077a(int i4, int i5) {
            super(i4, i5);
            this.f10174a = 8388627;
        }

        public C0077a(C0077a c0077a) {
            super((ViewGroup.MarginLayoutParams) c0077a);
            this.f10174a = 0;
            this.f10174a = c0077a.f10174a;
        }

        public C0077a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10174a = 0;
        }
    }
}
