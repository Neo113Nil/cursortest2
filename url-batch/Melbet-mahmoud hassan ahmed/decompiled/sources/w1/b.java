package w1;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import m4.t;
import o2.m0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f22990a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f22991b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, x1.b> f22992c;

    /* renamed from: d, reason: collision with root package name */
    private final Random f22993d;

    public b() {
        this(new Random());
    }

    b(Random random) {
        this.f22992c = new HashMap();
        this.f22993d = random;
        this.f22990a = new HashMap();
        this.f22991b = new HashMap();
    }

    private static <T> void b(T t6, long j7, Map<T, Long> map) {
        if (map.containsKey(t6)) {
            j7 = Math.max(j7, ((Long) m0.j(map.get(t6))).longValue());
        }
        map.put(t6, Long.valueOf(j7));
    }

    private List<x1.b> c(List<x1.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f22990a);
        h(elapsedRealtime, this.f22991b);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            x1.b bVar = list.get(i7);
            if (!this.f22990a.containsKey(bVar.f23088b) && !this.f22991b.containsKey(Integer.valueOf(bVar.f23089c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(x1.b bVar, x1.b bVar2) {
        int compare = Integer.compare(bVar.f23089c, bVar2.f23089c);
        return compare != 0 ? compare : bVar.f23088b.compareTo(bVar2.f23088b);
    }

    public static int f(List<x1.b> list) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < list.size(); i7++) {
            hashSet.add(Integer.valueOf(list.get(i7).f23089c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j7, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j7) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            map.remove(arrayList.get(i7));
        }
    }

    private x1.b k(List<x1.b> list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += list.get(i8).f23090d;
        }
        int nextInt = this.f22993d.nextInt(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            x1.b bVar = list.get(i10);
            i9 += bVar.f23090d;
            if (nextInt < i9) {
                return bVar;
            }
        }
        return (x1.b) t.c(list);
    }

    public void e(x1.b bVar, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        b(bVar.f23088b, elapsedRealtime, this.f22990a);
        int i7 = bVar.f23089c;
        if (i7 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i7), elapsedRealtime, this.f22991b);
        }
    }

    public int g(List<x1.b> list) {
        HashSet hashSet = new HashSet();
        List<x1.b> c7 = c(list);
        for (int i7 = 0; i7 < c7.size(); i7++) {
            hashSet.add(Integer.valueOf(c7.get(i7).f23089c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f22990a.clear();
        this.f22991b.clear();
        this.f22992c.clear();
    }

    public x1.b j(List<x1.b> list) {
        Object obj;
        List<x1.b> c7 = c(list);
        if (c7.size() >= 2) {
            Collections.sort(c7, new Comparator() { // from class: w1.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int d7;
                    d7 = b.d((x1.b) obj2, (x1.b) obj3);
                    return d7;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i7 = c7.get(0).f23089c;
            int i8 = 0;
            while (true) {
                if (i8 >= c7.size()) {
                    break;
                }
                x1.b bVar = c7.get(i8);
                if (i7 == bVar.f23089c) {
                    arrayList.add(new Pair(bVar.f23088b, Integer.valueOf(bVar.f23090d)));
                    i8++;
                } else if (arrayList.size() == 1) {
                    obj = c7.get(0);
                }
            }
            x1.b bVar2 = this.f22992c.get(arrayList);
            if (bVar2 != null) {
                return bVar2;
            }
            x1.b k7 = k(c7.subList(0, arrayList.size()));
            this.f22992c.put(arrayList, k7);
            return k7;
        }
        obj = t.b(c7, null);
        return (x1.b) obj;
    }
}
