package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jz {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public final boolean a(lm lmVar) {
        int i = this.c;
        return i >= 0 && i < lmVar.a();
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
