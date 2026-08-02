package E;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436a;

    /* renamed from: b, reason: collision with root package name */
    public int f437b;

    /* renamed from: c, reason: collision with root package name */
    public int f438c;

    public int a() {
        int i4 = this.f438c;
        if (i4 == 2) {
            return 10;
        }
        if (i4 == 5) {
            return 11;
        }
        if (i4 == 29) {
            return 12;
        }
        if (i4 == 42) {
            return 16;
        }
        if (i4 != 22) {
            return i4 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public String toString() {
        switch (this.f436a) {
            case 4:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f437b + ", mEndLine=" + this.f438c + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r(int i4, int i5, int i6) {
        this.f436a = i6;
        this.f437b = i4;
        this.f438c = i5;
    }
}
