package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jj extends kt {
    private static final int[] a = {R.attr.listDivider};
    private Drawable b;
    private final Rect c = new Rect();

    public jj(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.b = drawable;
    }

    @Override // defpackage.kt
    public final void b(Rect rect, View view, RecyclerView recyclerView) {
        Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.kt
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        if (recyclerView.m == null || this.b == null) {
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
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            Rect rect = this.c;
            RecyclerView.I(childAt, rect);
            int round = rect.bottom + Math.round(childAt.getTranslationY());
            this.b.setBounds(i, round - this.b.getIntrinsicHeight(), width, round);
            this.b.draw(canvas);
        }
        canvas.restore();
    }
}
