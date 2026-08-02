package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ars implements Runnable {
    private final int a;
    private final RecyclerView b;

    public ars(int i, RecyclerView recyclerView) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.aa(this.a);
    }
}
