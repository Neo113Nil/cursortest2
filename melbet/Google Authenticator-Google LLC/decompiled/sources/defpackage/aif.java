package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aif extends kt {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ aij d;

    public aif(aij aijVar) {
        this.d = aijVar;
    }

    private final boolean d(View view, RecyclerView recyclerView) {
        lp g = recyclerView.g(view);
        if (!(g instanceof aiu) || !((aiu) g).w) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        lp g2 = recyclerView.g(recyclerView.getChildAt(indexOfChild + 1));
        return (g2 instanceof aiu) && ((aiu) g2).v;
    }

    @Override // defpackage.kt
    public final void b(Rect rect, View view, RecyclerView recyclerView) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.kt
    public final void j(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (d(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
