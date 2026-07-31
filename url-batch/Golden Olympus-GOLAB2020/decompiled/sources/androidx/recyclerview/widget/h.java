package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f13084a = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f13087a - dVar2.f13087a;
        }
    }

    public static abstract class b {
        public abstract boolean areContentsTheSame(int i4, int i5);

        public abstract boolean areItemsTheSame(int i4, int i5);

        public Object getChangePayload(int i4, int i5) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f13085a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13086b;

        c(int i4) {
            int[] iArr = new int[i4];
            this.f13085a = iArr;
            this.f13086b = iArr.length / 2;
        }

        int[] a() {
            return this.f13085a;
        }

        int b(int i4) {
            return this.f13085a[i4 + this.f13086b];
        }

        void c(int i4, int i5) {
            this.f13085a[i4 + this.f13086b] = i5;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f13087a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13088b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13089c;

        d(int i4, int i5, int i6) {
            this.f13087a = i4;
            this.f13088b = i5;
            this.f13089c = i6;
        }

        int a() {
            return this.f13087a + this.f13089c;
        }

        int b() {
            return this.f13088b + this.f13089c;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final List f13090a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f13091b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f13092c;

        /* renamed from: d, reason: collision with root package name */
        private final b f13093d;

        /* renamed from: e, reason: collision with root package name */
        private final int f13094e;

        /* renamed from: f, reason: collision with root package name */
        private final int f13095f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f13096g;

        e(b bVar, List list, int[] iArr, int[] iArr2, boolean z4) {
            this.f13090a = list;
            this.f13091b = iArr;
            this.f13092c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f13093d = bVar;
            this.f13094e = bVar.getOldListSize();
            this.f13095f = bVar.getNewListSize();
            this.f13096g = z4;
            a();
            d();
        }

        private void a() {
            d dVar = this.f13090a.isEmpty() ? null : (d) this.f13090a.get(0);
            if (dVar == null || dVar.f13087a != 0 || dVar.f13088b != 0) {
                this.f13090a.add(0, new d(0, 0, 0));
            }
            this.f13090a.add(new d(this.f13094e, this.f13095f, 0));
        }

        private void c(int i4) {
            int size = this.f13090a.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                d dVar = (d) this.f13090a.get(i6);
                while (i5 < dVar.f13088b) {
                    if (this.f13092c[i5] == 0 && this.f13093d.areItemsTheSame(i4, i5)) {
                        int i7 = this.f13093d.areContentsTheSame(i4, i5) ? 8 : 4;
                        this.f13091b[i4] = (i5 << 4) | i7;
                        this.f13092c[i5] = (i4 << 4) | i7;
                        return;
                    }
                    i5++;
                }
                i5 = dVar.b();
            }
        }

        private void d() {
            for (d dVar : this.f13090a) {
                for (int i4 = 0; i4 < dVar.f13089c; i4++) {
                    int i5 = dVar.f13087a + i4;
                    int i6 = dVar.f13088b + i4;
                    int i7 = this.f13093d.areContentsTheSame(i5, i6) ? 1 : 2;
                    this.f13091b[i5] = (i6 << 4) | i7;
                    this.f13092c[i6] = (i5 << 4) | i7;
                }
            }
            if (this.f13096g) {
                e();
            }
        }

        private void e() {
            int i4 = 0;
            for (d dVar : this.f13090a) {
                while (i4 < dVar.f13087a) {
                    if (this.f13091b[i4] == 0) {
                        c(i4);
                    }
                    i4++;
                }
                i4 = dVar.a();
            }
        }

        private static g f(Collection collection, int i4, boolean z4) {
            g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f13097a == i4 && gVar.f13099c == z4) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z4) {
                    gVar2.f13098b--;
                } else {
                    gVar2.f13098b++;
                }
            }
            return gVar;
        }

        public void b(n nVar) {
            int i4;
            androidx.recyclerview.widget.e eVar = nVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) nVar : new androidx.recyclerview.widget.e(nVar);
            int i5 = this.f13094e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i6 = this.f13094e;
            int i7 = this.f13095f;
            for (int size = this.f13090a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f13090a.get(size);
                int a4 = dVar.a();
                int b4 = dVar.b();
                while (true) {
                    if (i6 <= a4) {
                        break;
                    }
                    i6--;
                    int i8 = this.f13091b[i6];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g f4 = f(arrayDeque, i9, false);
                        if (f4 != null) {
                            int i10 = (i5 - f4.f13098b) - 1;
                            eVar.onMoved(i6, i10);
                            if ((i8 & 4) != 0) {
                                eVar.onChanged(i10, 1, this.f13093d.getChangePayload(i6, i9));
                            }
                        } else {
                            arrayDeque.add(new g(i6, (i5 - i6) - 1, true));
                        }
                    } else {
                        eVar.onRemoved(i6, 1);
                        i5--;
                    }
                }
                while (i7 > b4) {
                    i7--;
                    int i11 = this.f13092c[i7];
                    if ((i11 & 12) != 0) {
                        int i12 = i11 >> 4;
                        g f5 = f(arrayDeque, i12, true);
                        if (f5 == null) {
                            arrayDeque.add(new g(i7, i5 - i6, false));
                        } else {
                            eVar.onMoved((i5 - f5.f13098b) - 1, i6);
                            if ((i11 & 4) != 0) {
                                eVar.onChanged(i6, 1, this.f13093d.getChangePayload(i12, i7));
                            }
                        }
                    } else {
                        eVar.onInserted(i6, 1);
                        i5++;
                    }
                }
                int i13 = dVar.f13087a;
                int i14 = dVar.f13088b;
                for (i4 = 0; i4 < dVar.f13089c; i4++) {
                    if ((this.f13091b[i13] & 15) == 2) {
                        eVar.onChanged(i13, 1, this.f13093d.getChangePayload(i13, i14));
                    }
                    i13++;
                    i14++;
                }
                i6 = dVar.f13087a;
                i7 = dVar.f13088b;
            }
            eVar.a();
        }
    }

    public static abstract class f {
        public abstract boolean areContentsTheSame(Object obj, Object obj2);

        public abstract boolean areItemsTheSame(Object obj, Object obj2);

        public Object getChangePayload(Object obj, Object obj2) {
            return null;
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        int f13097a;

        /* renamed from: b, reason: collision with root package name */
        int f13098b;

        /* renamed from: c, reason: collision with root package name */
        boolean f13099c;

        g(int i4, int i5, boolean z4) {
            this.f13097a = i4;
            this.f13098b = i5;
            this.f13099c = z4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    static class C0124h {

        /* renamed from: a, reason: collision with root package name */
        int f13100a;

        /* renamed from: b, reason: collision with root package name */
        int f13101b;

        /* renamed from: c, reason: collision with root package name */
        int f13102c;

        /* renamed from: d, reason: collision with root package name */
        int f13103d;

        public C0124h() {
        }

        int a() {
            return this.f13103d - this.f13102c;
        }

        int b() {
            return this.f13101b - this.f13100a;
        }

        public C0124h(int i4, int i5, int i6, int i7) {
            this.f13100a = i4;
            this.f13101b = i5;
            this.f13102c = i6;
            this.f13103d = i7;
        }
    }

    static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f13104a;

        /* renamed from: b, reason: collision with root package name */
        public int f13105b;

        /* renamed from: c, reason: collision with root package name */
        public int f13106c;

        /* renamed from: d, reason: collision with root package name */
        public int f13107d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13108e;

        i() {
        }

        int a() {
            return Math.min(this.f13106c - this.f13104a, this.f13107d - this.f13105b);
        }

        boolean b() {
            return this.f13107d - this.f13105b != this.f13106c - this.f13104a;
        }

        boolean c() {
            return this.f13107d - this.f13105b > this.f13106c - this.f13104a;
        }

        d d() {
            if (b()) {
                return this.f13108e ? new d(this.f13104a, this.f13105b, a()) : c() ? new d(this.f13104a, this.f13105b + 1, a()) : new d(this.f13104a + 1, this.f13105b, a());
            }
            int i4 = this.f13104a;
            return new d(i4, this.f13105b, this.f13106c - i4);
        }
    }

    private static i a(C0124h c0124h, b bVar, c cVar, c cVar2, int i4) {
        int b4;
        int i5;
        int i6;
        boolean z4 = (c0124h.b() - c0124h.a()) % 2 == 0;
        int b5 = c0124h.b() - c0124h.a();
        int i7 = -i4;
        for (int i8 = i7; i8 <= i4; i8 += 2) {
            if (i8 == i7 || (i8 != i4 && cVar2.b(i8 + 1) < cVar2.b(i8 - 1))) {
                b4 = cVar2.b(i8 + 1);
                i5 = b4;
            } else {
                b4 = cVar2.b(i8 - 1);
                i5 = b4 - 1;
            }
            int i9 = c0124h.f13103d - ((c0124h.f13101b - i5) - i8);
            int i10 = (i4 == 0 || i5 != b4) ? i9 : i9 + 1;
            while (i5 > c0124h.f13100a && i9 > c0124h.f13102c && bVar.areItemsTheSame(i5 - 1, i9 - 1)) {
                i5--;
                i9--;
            }
            cVar2.c(i8, i5);
            if (z4 && (i6 = b5 - i8) >= i7 && i6 <= i4 && cVar.b(i6) >= i5) {
                i iVar = new i();
                iVar.f13104a = i5;
                iVar.f13105b = i9;
                iVar.f13106c = b4;
                iVar.f13107d = i10;
                iVar.f13108e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z4) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0124h(0, oldListSize, 0, newListSize));
        int i4 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i4);
        c cVar2 = new c(i4);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0124h c0124h = (C0124h) arrayList2.remove(arrayList2.size() - 1);
            i e4 = e(c0124h, bVar, cVar, cVar2);
            if (e4 != null) {
                if (e4.a() > 0) {
                    arrayList.add(e4.d());
                }
                C0124h c0124h2 = arrayList3.isEmpty() ? new C0124h() : (C0124h) arrayList3.remove(arrayList3.size() - 1);
                c0124h2.f13100a = c0124h.f13100a;
                c0124h2.f13102c = c0124h.f13102c;
                c0124h2.f13101b = e4.f13104a;
                c0124h2.f13103d = e4.f13105b;
                arrayList2.add(c0124h2);
                c0124h.f13101b = c0124h.f13101b;
                c0124h.f13103d = c0124h.f13103d;
                c0124h.f13100a = e4.f13106c;
                c0124h.f13102c = e4.f13107d;
                arrayList2.add(c0124h);
            } else {
                arrayList3.add(c0124h);
            }
        }
        Collections.sort(arrayList, f13084a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z4);
    }

    private static i d(C0124h c0124h, b bVar, c cVar, c cVar2, int i4) {
        int b4;
        int i5;
        int i6;
        boolean z4 = Math.abs(c0124h.b() - c0124h.a()) % 2 == 1;
        int b5 = c0124h.b() - c0124h.a();
        int i7 = -i4;
        for (int i8 = i7; i8 <= i4; i8 += 2) {
            if (i8 == i7 || (i8 != i4 && cVar.b(i8 + 1) > cVar.b(i8 - 1))) {
                b4 = cVar.b(i8 + 1);
                i5 = b4;
            } else {
                b4 = cVar.b(i8 - 1);
                i5 = b4 + 1;
            }
            int i9 = (c0124h.f13102c + (i5 - c0124h.f13100a)) - i8;
            int i10 = (i4 == 0 || i5 != b4) ? i9 : i9 - 1;
            while (i5 < c0124h.f13101b && i9 < c0124h.f13103d && bVar.areItemsTheSame(i5, i9)) {
                i5++;
                i9++;
            }
            cVar.c(i8, i5);
            if (z4 && (i6 = b5 - i8) >= i7 + 1 && i6 <= i4 - 1 && cVar2.b(i6) <= i5) {
                i iVar = new i();
                iVar.f13104a = b4;
                iVar.f13105b = i10;
                iVar.f13106c = i5;
                iVar.f13107d = i9;
                iVar.f13108e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0124h c0124h, b bVar, c cVar, c cVar2) {
        if (c0124h.b() >= 1 && c0124h.a() >= 1) {
            int b4 = ((c0124h.b() + c0124h.a()) + 1) / 2;
            cVar.c(1, c0124h.f13100a);
            cVar2.c(1, c0124h.f13101b);
            for (int i4 = 0; i4 < b4; i4++) {
                i d4 = d(c0124h, bVar, cVar, cVar2, i4);
                if (d4 != null) {
                    return d4;
                }
                i a4 = a(c0124h, bVar, cVar, cVar2, i4);
                if (a4 != null) {
                    return a4;
                }
            }
        }
        return null;
    }
}
