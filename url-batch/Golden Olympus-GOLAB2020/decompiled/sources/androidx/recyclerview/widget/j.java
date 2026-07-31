package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final ThreadLocal f13145f = new ThreadLocal();

    /* renamed from: g, reason: collision with root package name */
    static Comparator f13146g = new a();

    /* renamed from: c, reason: collision with root package name */
    long f13148c;

    /* renamed from: d, reason: collision with root package name */
    long f13149d;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f13147b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f13150e = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f13158d;
            if ((recyclerView == null) != (cVar2.f13158d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z4 = cVar.f13155a;
            if (z4 != cVar2.f13155a) {
                return z4 ? -1 : 1;
            }
            int i4 = cVar2.f13156b - cVar.f13156b;
            if (i4 != 0) {
                return i4;
            }
            int i5 = cVar.f13157c - cVar2.f13157c;
            if (i5 != 0) {
                return i5;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        /* renamed from: a, reason: collision with root package name */
        int f13151a;

        /* renamed from: b, reason: collision with root package name */
        int f13152b;

        /* renamed from: c, reason: collision with root package name */
        int[] f13153c;

        /* renamed from: d, reason: collision with root package name */
        int f13154d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i4, int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i6 = this.f13154d;
            int i7 = i6 * 2;
            int[] iArr = this.f13153c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f13153c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[i6 * 4];
                this.f13153c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f13153c;
            iArr4[i7] = i4;
            iArr4[i7 + 1] = i5;
            this.f13154d++;
        }

        void b() {
            int[] iArr = this.f13153c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13154d = 0;
        }

        void c(RecyclerView recyclerView, boolean z4) {
            this.f13154d = 0;
            int[] iArr = this.f13153c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z4) {
                if (!recyclerView.mAdapterHelper.p()) {
                    pVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.collectAdjacentPrefetchPositions(this.f13151a, this.f13152b, recyclerView.mState, this);
            }
            int i4 = this.f13154d;
            if (i4 > pVar.mPrefetchMaxCountObserved) {
                pVar.mPrefetchMaxCountObserved = i4;
                pVar.mPrefetchMaxObservedInInitialPrefetch = z4;
                recyclerView.mRecycler.P();
            }
        }

        boolean d(int i4) {
            if (this.f13153c != null) {
                int i5 = this.f13154d * 2;
                for (int i6 = 0; i6 < i5; i6 += 2) {
                    if (this.f13153c[i6] == i4) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i4, int i5) {
            this.f13151a = i4;
            this.f13152b = i5;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13155a;

        /* renamed from: b, reason: collision with root package name */
        public int f13156b;

        /* renamed from: c, reason: collision with root package name */
        public int f13157c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f13158d;

        /* renamed from: e, reason: collision with root package name */
        public int f13159e;

        c() {
        }

        public void a() {
            this.f13155a = false;
            this.f13156b = 0;
            this.f13157c = 0;
            this.f13158d = null;
            this.f13159e = 0;
        }
    }

    j() {
    }

    private void b() {
        c cVar;
        int size = this.f13147b.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = (RecyclerView) this.f13147b.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i4 += recyclerView.mPrefetchRegistry.f13154d;
            }
        }
        this.f13150e.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f13147b.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f13151a) + Math.abs(bVar.f13152b);
                for (int i8 = 0; i8 < bVar.f13154d * 2; i8 += 2) {
                    if (i6 >= this.f13150e.size()) {
                        cVar = new c();
                        this.f13150e.add(cVar);
                    } else {
                        cVar = (c) this.f13150e.get(i6);
                    }
                    int[] iArr = bVar.f13153c;
                    int i9 = iArr[i8 + 1];
                    cVar.f13155a = i9 <= abs;
                    cVar.f13156b = abs;
                    cVar.f13157c = i9;
                    cVar.f13158d = recyclerView2;
                    cVar.f13159e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(this.f13150e, f13146g);
    }

    private void c(c cVar, long j4) {
        RecyclerView.E i4 = i(cVar.f13158d, cVar.f13159e, cVar.f13155a ? Long.MAX_VALUE : j4);
        if (i4 == null || i4.mNestedRecyclerView == null || !i4.isBound() || i4.isInvalid()) {
            return;
        }
        h(i4.mNestedRecyclerView.get(), j4);
    }

    private void d(long j4) {
        for (int i4 = 0; i4 < this.f13150e.size(); i4++) {
            c cVar = (c) this.f13150e.get(i4);
            if (cVar.f13158d == null) {
                return;
            }
            c(cVar, j4);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i4) {
        int j4 = recyclerView.mChildHelper.j();
        for (int i5 = 0; i5 < j4; i5++) {
            RecyclerView.E childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i5));
            if (childViewHolderInt.mPosition == i4 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j4) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f13154d != 0) {
            try {
                androidx.core.os.n.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i4 = 0; i4 < bVar.f13154d * 2; i4 += 2) {
                    i(recyclerView, bVar.f13153c[i4], j4);
                }
            } finally {
                androidx.core.os.n.b();
            }
        }
    }

    private RecyclerView.E i(RecyclerView recyclerView, int i4, long j4) {
        if (e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.E N3 = wVar.N(i4, false, j4);
            if (N3 != null) {
                if (!N3.isBound() || N3.isInvalid()) {
                    wVar.a(N3, false);
                } else {
                    wVar.G(N3.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return N3;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f13147b.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f13147b.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f13147b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f13148c == 0) {
                this.f13148c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.e(i4, i5);
    }

    void g(long j4) {
        b();
        d(j4);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f13147b.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.n.a("RV Prefetch");
            if (!this.f13147b.isEmpty()) {
                int size = this.f13147b.size();
                long j4 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) this.f13147b.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j4) + this.f13149d);
                }
            }
        } finally {
            this.f13148c = 0L;
            androidx.core.os.n.b();
        }
    }
}
