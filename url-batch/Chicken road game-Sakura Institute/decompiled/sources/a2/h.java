package a2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final g f387a = new g("", null, 6);

    public static final ArrayList a(List list, int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException(("start (" + i7 + ") should be less than or equal to end (" + i8 + ')').toString());
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = list.get(i9);
                e eVar = (e) obj;
                if (c(i7, i8, eVar.f364b, eVar.f365c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                e eVar2 = (e) arrayList.get(i10);
                arrayList2.add(new e(eVar2.f363a, Math.max(i7, eVar2.f364b) - i7, Math.min(i8, eVar2.f365c) - i7, eVar2.f366d));
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return null;
    }

    public static final List b(g gVar, int i7, int i8) {
        List list;
        if (i7 == i8 || (list = gVar.f374g) == null) {
            return null;
        }
        if (i7 == 0 && i8 >= gVar.f373f.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            e eVar = (e) obj;
            if (c(i7, i8, eVar.f364b, eVar.f365c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            e eVar2 = (e) arrayList.get(i10);
            arrayList2.add(new e(v1.g.e(eVar2.f364b, i7, i8) - i7, v1.g.e(eVar2.f365c, i7, i8) - i7, eVar2.f363a));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if ((r6 == r7) == (r4 == r5)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(int i7, int i8, int i9, int i10) {
        if (Math.max(i7, i9) >= Math.min(i8, i10)) {
            if (i7 <= i9 && i10 <= i8) {
                if (i8 == i10) {
                }
            }
            if (i9 <= i7 && i8 <= i10) {
                if (i10 == i8) {
                    if ((i7 == i8) == (i9 == i10)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
