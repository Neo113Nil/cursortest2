package l2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o2.m0;

/* loaded from: classes.dex */
final class k implements c2.h {

    /* renamed from: f, reason: collision with root package name */
    private final List<e> f18590f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f18591g;

    /* renamed from: h, reason: collision with root package name */
    private final long[] f18592h;

    public k(List<e> list) {
        this.f18590f = Collections.unmodifiableList(new ArrayList(list));
        this.f18591g = new long[list.size() * 2];
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = list.get(i7);
            int i8 = i7 * 2;
            long[] jArr = this.f18591g;
            jArr[i8] = eVar.f18559b;
            jArr[i8 + 1] = eVar.f18560c;
        }
        long[] jArr2 = this.f18591g;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f18592h = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(e eVar, e eVar2) {
        return Long.compare(eVar.f18559b, eVar2.f18559b);
    }

    @Override // c2.h
    public int b(long j7) {
        int e7 = m0.e(this.f18592h, j7, false, false);
        if (e7 < this.f18592h.length) {
            return e7;
        }
        return -1;
    }

    @Override // c2.h
    public long d(int i7) {
        o2.a.a(i7 >= 0);
        o2.a.a(i7 < this.f18592h.length);
        return this.f18592h[i7];
    }

    @Override // c2.h
    public List<c2.b> e(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < this.f18590f.size(); i7++) {
            long[] jArr = this.f18591g;
            int i8 = i7 * 2;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                e eVar = this.f18590f.get(i7);
                c2.b bVar = eVar.f18558a;
                if (bVar.f1828j == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c7;
                c7 = k.c((e) obj, (e) obj2);
                return c7;
            }
        });
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            arrayList.add(((e) arrayList2.get(i9)).f18558a.b().h((-1) - i9, 1).a());
        }
        return arrayList;
    }

    @Override // c2.h
    public int f() {
        return this.f18592h.length;
    }
}
