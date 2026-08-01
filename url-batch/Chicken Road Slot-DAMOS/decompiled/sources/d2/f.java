package d2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: c, reason: collision with root package name */
    public static f f3407c;

    @Override // d2.b
    public final int[] a(int i3) {
        int length = c().length();
        if (length <= 0 || i3 >= length) {
            return null;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < length && c().charAt(i3) == '\n' && (c().charAt(i3) == '\n' || (i3 != 0 && c().charAt(i3 - 1) != '\n'))) {
            i3++;
        }
        if (i3 >= length) {
            return null;
        }
        int i10 = i3 + 1;
        while (i10 < length && !j(i10)) {
            i10++;
        }
        return b(i3, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // d2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] i(int i3) {
        int length = c().length();
        if (length <= 0 || i3 <= 0) {
            return null;
        }
        if (i3 > length) {
            i3 = length;
        }
        while (i3 > 0 && c().charAt(i3 - 1) == '\n' && !j(i3)) {
            i3--;
        }
        int i10 = i3 - 1;
        while (i10 > 0 && (c().charAt(i10) == '\n' || (i10 != 0 && c().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return b(i10, i3);
    }

    public final boolean j(int i3) {
        if (i3 <= 0 || c().charAt(i3 - 1) == '\n') {
            return false;
        }
        return i3 == c().length() || c().charAt(i3) == '\n';
    }
}
