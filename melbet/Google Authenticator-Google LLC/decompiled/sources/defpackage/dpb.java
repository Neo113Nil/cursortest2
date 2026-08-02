package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dpb extends AppCompatImageView {
    public dql a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpb(Context context) {
        super(context);
        context.getClass();
        this.a = dja.l(getContext(), false);
    }

    public abstract int a();

    public abstract Drawable b();

    protected abstract void c();

    protected void d(wo woVar) {
        throw null;
    }

    public abstract void f(int i);

    public abstract void g(Drawable drawable);

    public abstract void h(boolean z);

    public abstract void i(boolean z);

    public final void j(boolean z) {
        this.a = dja.l(getContext(), z);
        c();
    }

    public void k(Runnable runnable) {
        runnable.run();
    }

    public abstract void l();

    public abstract void m(Drawable drawable);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = dja.l(getContext(), false);
    }

    public void e() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = dja.l(getContext(), false);
    }

    public void n(float f) {
    }

    public void o(int i, int i2) {
    }
}
