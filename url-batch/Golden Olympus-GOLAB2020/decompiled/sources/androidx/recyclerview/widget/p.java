package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f13171a;

    /* renamed from: b, reason: collision with root package name */
    private int f13172b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f13173c;

    class a extends p {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.p
        public int d(View view) {
            return this.f13171a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13171a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13171a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int g(View view) {
            return this.f13171a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int h() {
            return this.f13171a.getWidth();
        }

        @Override // androidx.recyclerview.widget.p
        public int i() {
            return this.f13171a.getWidth() - this.f13171a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.p
        public int j() {
            return this.f13171a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.p
        public int l() {
            return this.f13171a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.p
        public int m() {
            return this.f13171a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.p
        public int n() {
            return this.f13171a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.p
        public int o() {
            return (this.f13171a.getWidth() - this.f13171a.getPaddingLeft()) - this.f13171a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.p
        public int q(View view) {
            this.f13171a.getTransformedBoundingBox(view, true, this.f13173c);
            return this.f13173c.right;
        }

        @Override // androidx.recyclerview.widget.p
        public int r(View view) {
            this.f13171a.getTransformedBoundingBox(view, true, this.f13173c);
            return this.f13173c.left;
        }

        @Override // androidx.recyclerview.widget.p
        public void s(int i4) {
            this.f13171a.offsetChildrenHorizontal(i4);
        }
    }

    class b extends p {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.p
        public int d(View view) {
            return this.f13171a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13171a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13171a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int g(View view) {
            return this.f13171a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int h() {
            return this.f13171a.getHeight();
        }

        @Override // androidx.recyclerview.widget.p
        public int i() {
            return this.f13171a.getHeight() - this.f13171a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.p
        public int j() {
            return this.f13171a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.p
        public int l() {
            return this.f13171a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.p
        public int m() {
            return this.f13171a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.p
        public int n() {
            return this.f13171a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.p
        public int o() {
            return (this.f13171a.getHeight() - this.f13171a.getPaddingTop()) - this.f13171a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.p
        public int q(View view) {
            this.f13171a.getTransformedBoundingBox(view, true, this.f13173c);
            return this.f13173c.bottom;
        }

        @Override // androidx.recyclerview.widget.p
        public int r(View view) {
            this.f13171a.getTransformedBoundingBox(view, true, this.f13173c);
            return this.f13173c.top;
        }

        @Override // androidx.recyclerview.widget.p
        public void s(int i4) {
            this.f13171a.offsetChildrenVertical(i4);
        }
    }

    /* synthetic */ p(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static p a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static p b(RecyclerView.p pVar, int i4) {
        if (i4 == 0) {
            return a(pVar);
        }
        if (i4 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static p c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.f13171a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f13172b) {
            return 0;
        }
        return o() - this.f13172b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i4);

    public void t() {
        this.f13172b = o();
    }

    private p(RecyclerView.p pVar) {
        this.f13172b = Integer.MIN_VALUE;
        this.f13173c = new Rect();
        this.f13171a = pVar;
    }
}
