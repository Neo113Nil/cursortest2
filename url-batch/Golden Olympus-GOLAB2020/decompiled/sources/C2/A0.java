package C2;

/* loaded from: classes3.dex */
public abstract class A0 {
    public static /* synthetic */ void c(A0 a02, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i5 & 1) != 0) {
            i4 = a02.d() + 1;
        }
        a02.b(i4);
    }

    public abstract Object a();

    public abstract void b(int i4);

    public abstract int d();
}
