package B0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: B0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0008e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f255a = 0;

    static {
        new C0007d("", null, null, null);
    }

    public static final ArrayList a(List list, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(("start (" + i3 + ") should be less than or equal to end (" + i4 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            C0005b c0005b = (C0005b) obj;
            if (b(i3, i4, c0005b.f247b, c0005b.f248c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0005b c0005b2 = (C0005b) arrayList.get(i6);
            arrayList2.add(new C0005b(c0005b2.f246a, Math.max(i3, c0005b2.f247b) - i3, Math.min(i4, c0005b2.f248c) - i3, c0005b2.f249d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final boolean b(int i3, int i4, int i5, int i6) {
        if (Math.max(i3, i5) < Math.min(i4, i6)) {
            return true;
        }
        if (i3 <= i5 && i6 <= i4) {
            if (i4 != i6) {
                return true;
            }
            if ((i5 == i6) == (i3 == i4)) {
                return true;
            }
        }
        if (i5 <= i3 && i4 <= i6) {
            if (i6 != i4) {
                return true;
            }
            if ((i3 == i4) == (i5 == i6)) {
                return true;
            }
        }
        return false;
    }
}
