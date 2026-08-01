package o3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f7394d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ViewGroup f7395e;

    public g0(ViewGroup viewGroup) {
        this.f7395e = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7394d < this.f7395e.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.f7395e;
        int i3 = this.f7394d;
        this.f7394d = i3 + 1;
        View childAt = viewGroup.getChildAt(i3);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.f7395e;
        int i3 = this.f7394d - 1;
        this.f7394d = i3;
        viewGroup.removeViewAt(i3);
    }
}
