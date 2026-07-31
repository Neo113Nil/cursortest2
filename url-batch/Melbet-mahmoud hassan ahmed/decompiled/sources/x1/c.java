package x1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import o2.m0;

/* loaded from: classes.dex */
public class c implements s1.a<c> {

    /* renamed from: a, reason: collision with root package name */
    public final long f23091a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23092b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23093c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23094d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23095e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23096f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23097g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23098h;

    /* renamed from: i, reason: collision with root package name */
    public final o f23099i;

    /* renamed from: j, reason: collision with root package name */
    public final l f23100j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f23101k;

    /* renamed from: l, reason: collision with root package name */
    public final h f23102l;

    /* renamed from: m, reason: collision with root package name */
    private final List<g> f23103m;

    public c(long j7, long j8, long j9, boolean z6, long j10, long j11, long j12, long j13, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f23091a = j7;
        this.f23092b = j8;
        this.f23093c = j9;
        this.f23094d = z6;
        this.f23095e = j10;
        this.f23096f = j11;
        this.f23097g = j12;
        this.f23098h = j13;
        this.f23102l = hVar;
        this.f23099i = oVar;
        this.f23101k = uri;
        this.f23100j = lVar;
        this.f23103m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<s1.c> linkedList) {
        s1.c poll = linkedList.poll();
        int i7 = poll.f21608f;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i8 = poll.f21609g;
            a aVar = list.get(i8);
            List<j> list2 = aVar.f23083c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f21610h));
                poll = linkedList.poll();
                if (poll.f21608f != i7) {
                    break;
                }
            } while (poll.f21609g == i8);
            arrayList.add(new a(aVar.f23081a, aVar.f23082b, arrayList2, aVar.f23084d, aVar.f23085e, aVar.f23086f));
        } while (poll.f21608f == i7);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // s1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<s1.c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new s1.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= e()) {
                break;
            }
            if (((s1.c) linkedList.peek()).f21608f != i7) {
                long f7 = f(i7);
                if (f7 != -9223372036854775807L) {
                    j7 += f7;
                }
            } else {
                g d7 = d(i7);
                arrayList.add(new g(d7.f23126a, d7.f23127b - j7, c(d7.f23128c, linkedList), d7.f23129d));
            }
            i7++;
        }
        long j8 = this.f23092b;
        return new c(this.f23091a, j8 != -9223372036854775807L ? j8 - j7 : -9223372036854775807L, this.f23093c, this.f23094d, this.f23095e, this.f23096f, this.f23097g, this.f23098h, this.f23102l, this.f23099i, this.f23100j, this.f23101k, arrayList);
    }

    public final g d(int i7) {
        return this.f23103m.get(i7);
    }

    public final int e() {
        return this.f23103m.size();
    }

    public final long f(int i7) {
        long j7;
        if (i7 == this.f23103m.size() - 1) {
            long j8 = this.f23092b;
            if (j8 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j7 = j8 - this.f23103m.get(i7).f23127b;
        } else {
            j7 = this.f23103m.get(i7 + 1).f23127b - this.f23103m.get(i7).f23127b;
        }
        return j7;
    }

    public final long g(int i7) {
        return m0.B0(f(i7));
    }
}
