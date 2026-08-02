package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fjp extends FrameLayout {
    public Drawable a;
    public Rect b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private Rect g;

    public fjp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Rect();
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        TypedArray a = fjw.a(context, attributeSet, fjm.b, i, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        fpe fpeVar = new fpe(this, 1);
        int i2 = yq.a;
        yi.c(this, fpeVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b == null || this.a == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.c) {
            this.g.set(0, 0, width, this.b.top);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        if (this.d) {
            this.g.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        if (this.e) {
            this.g.set(0, this.b.top, this.b.left, height - this.b.bottom);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        if (this.f) {
            this.g.set(width - this.b.right, this.b.top, width, height - this.b.bottom);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void a(zz zzVar) {
    }

    public fjp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fjp(Context context) {
        this(context, null);
    }
}
