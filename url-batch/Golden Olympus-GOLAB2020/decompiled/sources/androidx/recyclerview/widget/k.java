package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class k {

    /* renamed from: b, reason: collision with root package name */
    int f13161b;

    /* renamed from: c, reason: collision with root package name */
    int f13162c;

    /* renamed from: d, reason: collision with root package name */
    int f13163d;

    /* renamed from: e, reason: collision with root package name */
    int f13164e;

    /* renamed from: h, reason: collision with root package name */
    boolean f13167h;

    /* renamed from: i, reason: collision with root package name */
    boolean f13168i;

    /* renamed from: a, reason: collision with root package name */
    boolean f13160a = true;

    /* renamed from: f, reason: collision with root package name */
    int f13165f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f13166g = 0;

    k() {
    }

    boolean a(RecyclerView.A a4) {
        int i4 = this.f13162c;
        return i4 >= 0 && i4 < a4.b();
    }

    View b(RecyclerView.w wVar) {
        View o4 = wVar.o(this.f13162c);
        this.f13162c += this.f13163d;
        return o4;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f13161b + ", mCurrentPosition=" + this.f13162c + ", mItemDirection=" + this.f13163d + ", mLayoutDirection=" + this.f13164e + ", mStartLine=" + this.f13165f + ", mEndLine=" + this.f13166g + '}';
    }
}
