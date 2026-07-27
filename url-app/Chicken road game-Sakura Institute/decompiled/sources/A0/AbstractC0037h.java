package A0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: A0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0037h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0036g f332a = new C0036g("", null, 6);

    public static final ArrayList a(List list, int i2, int i4) {
        if (i2 > i4) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i4 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            C0034e c0034e = (C0034e) obj;
            if (c(i2, i4, c0034e.f325b, c0034e.f326c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0034e c0034e2 = (C0034e) arrayList.get(i6);
            arrayList2.add(new C0034e(c0034e2.f324a, Math.max(i2, c0034e2.f325b) - i2, Math.min(i4, c0034e2.f326c) - i2, c0034e2.f327d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(C0036g c0036g, int i2, int i4) {
        List list;
        if (i2 == i4 || (list = c0036g.f329b) == null) {
            return null;
        }
        if (i2 == 0 && i4 >= c0036g.f328a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            C0034e c0034e = (C0034e) obj;
            if (c(i2, i4, c0034e.f325b, c0034e.f326c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0034e c0034e2 = (C0034e) arrayList.get(i6);
            arrayList2.add(new C0034e(kotlin.ranges.b.e(c0034e2.f325b, i2, i4) - i2, kotlin.ranges.b.e(c0034e2.f326c, i2, i4) - i2, c0034e2.f324a));
        }
        return arrayList2;
    }

    public static final boolean c(int i2, int i4, int i5, int i6) {
        if (Math.max(i2, i5) < Math.min(i4, i6)) {
            return true;
        }
        if (i2 <= i5 && i6 <= i4) {
            if (i4 != i6) {
                return true;
            }
            if ((i5 == i6) == (i2 == i4)) {
                return true;
            }
        }
        if (i5 <= i2 && i4 <= i6) {
            if (i6 != i4) {
                return true;
            }
            if ((i2 == i4) == (i5 == i6)) {
                return true;
            }
        }
        return false;
    }
}
