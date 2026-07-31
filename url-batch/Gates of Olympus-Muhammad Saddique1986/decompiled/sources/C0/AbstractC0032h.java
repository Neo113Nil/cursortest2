package C0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: C0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0032h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0031g f600a = new C0031g("", null, 6);

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
            C0029e c0029e = (C0029e) obj;
            if (c(i3, i4, c0029e.f593b, c0029e.f594c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0029e c0029e2 = (C0029e) arrayList.get(i6);
            arrayList2.add(new C0029e(Math.max(i3, c0029e2.f593b) - i3, Math.min(i4, c0029e2.f594c) - i3, c0029e2.f592a, c0029e2.f595d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(C0031g c0031g, int i3, int i4) {
        List list;
        if (i3 == i4 || (list = c0031g.f597b) == null) {
            return null;
        }
        if (i3 == 0 && i4 >= c0031g.f596a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            C0029e c0029e = (C0029e) obj;
            if (c(i3, i4, c0029e.f593b, c0029e.f594c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0029e c0029e2 = (C0029e) arrayList.get(i6);
            arrayList2.add(new C0029e(O2.d.y(c0029e2.f593b, i3, i4) - i3, O2.d.y(c0029e2.f594c, i3, i4) - i3, c0029e2.f592a));
        }
        return arrayList2;
    }

    public static final boolean c(int i3, int i4, int i5, int i6) {
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
