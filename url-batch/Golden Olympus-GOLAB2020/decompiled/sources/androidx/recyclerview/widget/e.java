package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: a, reason: collision with root package name */
    final n f13021a;

    /* renamed from: b, reason: collision with root package name */
    int f13022b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f13023c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f13024d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f13025e = null;

    public e(n nVar) {
        this.f13021a = nVar;
    }

    public void a() {
        int i4 = this.f13022b;
        if (i4 == 0) {
            return;
        }
        if (i4 == 1) {
            this.f13021a.onInserted(this.f13023c, this.f13024d);
        } else if (i4 == 2) {
            this.f13021a.onRemoved(this.f13023c, this.f13024d);
        } else if (i4 == 3) {
            this.f13021a.onChanged(this.f13023c, this.f13024d, this.f13025e);
        }
        this.f13025e = null;
        this.f13022b = 0;
    }

    @Override // androidx.recyclerview.widget.n
    public void onChanged(int i4, int i5, Object obj) {
        int i6;
        if (this.f13022b == 3) {
            int i7 = this.f13023c;
            int i8 = this.f13024d;
            if (i4 <= i7 + i8 && (i6 = i4 + i5) >= i7 && this.f13025e == obj) {
                this.f13023c = Math.min(i4, i7);
                this.f13024d = Math.max(i8 + i7, i6) - this.f13023c;
                return;
            }
        }
        a();
        this.f13023c = i4;
        this.f13024d = i5;
        this.f13025e = obj;
        this.f13022b = 3;
    }

    @Override // androidx.recyclerview.widget.n
    public void onInserted(int i4, int i5) {
        int i6;
        if (this.f13022b == 1 && i4 >= (i6 = this.f13023c)) {
            int i7 = this.f13024d;
            if (i4 <= i6 + i7) {
                this.f13024d = i7 + i5;
                this.f13023c = Math.min(i4, i6);
                return;
            }
        }
        a();
        this.f13023c = i4;
        this.f13024d = i5;
        this.f13022b = 1;
    }

    @Override // androidx.recyclerview.widget.n
    public void onMoved(int i4, int i5) {
        a();
        this.f13021a.onMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.n
    public void onRemoved(int i4, int i5) {
        int i6;
        if (this.f13022b == 2 && (i6 = this.f13023c) >= i4 && i6 <= i4 + i5) {
            this.f13024d += i5;
            this.f13023c = i4;
        } else {
            a();
            this.f13023c = i4;
            this.f13024d = i5;
            this.f13022b = 2;
        }
    }
}
