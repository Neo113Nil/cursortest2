package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fho extends kt {
    public int a;
    public boolean b;
    private final Drawable c;
    private int d;
    private final int e;
    private final int f;
    private final Rect g = new Rect();

    public fho(Context context) {
        TypedArray a = fjw.a(context, null, fhp.a, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.d = fny.e(context, a, 0).getDefaultColor();
        this.a = a.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.e = a.getDimensionPixelOffset(2, 0);
        this.f = a.getDimensionPixelOffset(1, 0);
        this.b = a.getBoolean(4, true);
        a.recycle();
        this.c = new ShapeDrawable();
        d(this.d);
    }

    private final boolean e(RecyclerView recyclerView, View view) {
        int c = recyclerView.c(view);
        kr krVar = recyclerView.l;
        return c != -1 && (!(krVar != null && c == krVar.a() + (-1)) || this.b);
    }

    @Override // defpackage.kt
    public final void b(Rect rect, View view, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
        if (e(recyclerView, view)) {
            rect.bottom = this.a;
        }
    }

    @Override // defpackage.kt
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        if (recyclerView.m == null) {
            return;
        }
        canvas.save();
        if (recyclerView.i) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        boolean i2 = fik.i(recyclerView);
        int i3 = i + (i2 ? this.f : this.e);
        int i4 = width - (i2 ? this.e : this.f);
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            if (e(recyclerView, childAt)) {
                Rect rect = this.g;
                RecyclerView.I(childAt, rect);
                int round = rect.bottom + Math.round(childAt.getTranslationY());
                int i6 = round - this.a;
                Drawable drawable = this.c;
                drawable.setBounds(i3, i6, i4, round);
                drawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final void d(int i) {
        this.d = i;
        this.c.setTint(i);
    }
}
