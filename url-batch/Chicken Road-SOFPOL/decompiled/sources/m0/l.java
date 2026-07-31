package m0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final o.e0 f4998d;

    /* renamed from: e, reason: collision with root package name */
    public final o.e0 f4999e;

    /* renamed from: f, reason: collision with root package name */
    public final o.w f5000f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5001g;

    public l(o.e0 e0Var, o.e0 e0Var2, o.w wVar, int i, Exception exc) {
        super(exc);
        this.f4998d = e0Var;
        this.f4999e = e0Var2;
        this.f5000f = wVar;
        this.f5001g = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        Collection collection;
        String substring;
        StringBuilder sb = new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |");
        x6.f E = r2.r.E(new k(this, null));
        boolean hasNext = E.hasNext();
        List list2 = d6.u.f2326d;
        if (hasNext) {
            Object next = E.next();
            if (E.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (E.hasNext()) {
                    arrayList.add(E.next());
                }
                list = arrayList;
            } else {
                list = s6.a.x(next);
            }
        } else {
            list = list2;
        }
        int size = list.size();
        if (10 >= size) {
            collection = d6.m.g0(list);
        } else {
            ArrayList arrayList2 = new ArrayList(10);
            if (list instanceof RandomAccess) {
                for (int i = size - 10; i < size; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - 10);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb.append(d6.m.W(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        String sb2 = sb.toString();
        q6.i.e(sb2, "<this>");
        if (y6.j.e0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        y6.a aVar = new y6.a(sb2);
        if (aVar.hasNext()) {
            Object next2 = aVar.next();
            if (aVar.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(next2);
                while (aVar.hasNext()) {
                    arrayList3.add(aVar.next());
                }
                list2 = arrayList3;
            } else {
                list2 = s6.a.x(next2);
            }
        }
        int length = sb2.length();
        list2.size();
        int t3 = s6.a.t(list2);
        ArrayList arrayList4 = new ArrayList();
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                s6.a.J();
                throw null;
            }
            String str = (String) obj;
            if ((i8 == 0 || i8 == t3) && y6.j.e0(str)) {
                str = null;
            } else {
                int length2 = str.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!r2.o.X(str.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && str.startsWith("|", i10)) {
                    substring = str.substring(1 + i10);
                    q6.i.d(substring, "substring(...)");
                } else {
                    substring = null;
                }
                if (substring != null) {
                    str = substring;
                }
            }
            if (str != null) {
                arrayList4.add(str);
            }
            i8 = i9;
        }
        StringBuilder sb3 = new StringBuilder(length);
        d6.m.U(arrayList4, sb3, "\n", "", "", "...", null);
        return sb3.toString();
    }
}
