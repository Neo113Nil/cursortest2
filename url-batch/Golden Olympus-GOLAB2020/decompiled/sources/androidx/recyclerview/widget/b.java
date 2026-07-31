package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final RecyclerView.h f12995a;

    public b(RecyclerView.h hVar) {
        this.f12995a = hVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void onChanged(int i4, int i5, Object obj) {
        this.f12995a.notifyItemRangeChanged(i4, i5, obj);
    }

    @Override // androidx.recyclerview.widget.n
    public void onInserted(int i4, int i5) {
        this.f12995a.notifyItemRangeInserted(i4, i5);
    }

    @Override // androidx.recyclerview.widget.n
    public void onMoved(int i4, int i5) {
        this.f12995a.notifyItemMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.n
    public void onRemoved(int i4, int i5) {
        this.f12995a.notifyItemRangeRemoved(i4, i5);
    }
}
