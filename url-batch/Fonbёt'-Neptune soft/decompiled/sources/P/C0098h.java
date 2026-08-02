package P;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: P.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098h implements Comparator {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        C0100j c0100j = (C0100j) obj;
        C0100j c0100j2 = (C0100j) obj2;
        RecyclerView recyclerView = c0100j.f924d;
        if ((recyclerView == null) != (c0100j2.f924d == null)) {
            return recyclerView == null ? 1 : -1;
        }
        boolean z2 = c0100j.f921a;
        if (z2 == c0100j2.f921a) {
            int i2 = c0100j2.f922b - c0100j.f922b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = c0100j.f923c - c0100j2.f923c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
        if (z2) {
        }
    }
}
