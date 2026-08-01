package a4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static /* synthetic */ boolean a(int i3, int i10) {
        if (i3 != 0) {
            return i3 == i10;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i3) {
        if (i3 != 0) {
            return i3 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i3) {
        int[] iArr = new int[i3];
        System.arraycopy(f282a, 0, iArr, 0, i3);
        return iArr;
    }
}
