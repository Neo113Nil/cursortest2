package e0;

import E1.C0025a;
import T.C0102u;
import T.O;
import W.J;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import l0.InterfaceC1243a;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393c implements InterfaceC1243a {

    /* renamed from: a, reason: collision with root package name */
    public final long f8346a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8348c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8349d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8350e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8351f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8352g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8353h;

    /* renamed from: i, reason: collision with root package name */
    public final C0025a f8354i;

    /* renamed from: j, reason: collision with root package name */
    public final C0102u f8355j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f8356k;

    /* renamed from: l, reason: collision with root package name */
    public final i f8357l;

    /* renamed from: m, reason: collision with root package name */
    public final List f8358m;

    public C0393c(long j4, long j5, long j6, boolean z, long j7, long j8, long j9, long j10, i iVar, C0025a c0025a, C0102u c0102u, Uri uri, ArrayList arrayList) {
        this.f8346a = j4;
        this.f8347b = j5;
        this.f8348c = j6;
        this.f8349d = z;
        this.f8350e = j7;
        this.f8351f = j8;
        this.f8352g = j9;
        this.f8353h = j10;
        this.f8357l = iVar;
        this.f8354i = c0025a;
        this.f8356k = uri;
        this.f8355j = c0102u;
        this.f8358m = arrayList;
    }

    @Override // l0.InterfaceC1243a
    public final Object a(List list) {
        long j4;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new O());
        ArrayList arrayList = new ArrayList();
        long j5 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f8358m.size()) {
                break;
            }
            if (((O) linkedList.peek()).f2678a != i4) {
                long c4 = c(i4);
                if (c4 != -9223372036854775807L) {
                    j5 += c4;
                }
            } else {
                h b4 = b(i4);
                List list2 = b4.f8380c;
                O o = (O) linkedList.poll();
                int i5 = o.f2678a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i6 = o.f2679b;
                    C0391a c0391a = (C0391a) list2.get(i6);
                    List list3 = c0391a.f8338c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(o.f2680c));
                        o = (O) linkedList.poll();
                        if (o.f2678a != i5) {
                            break;
                        }
                    } while (o.f2679b == i6);
                    j4 = j5;
                    arrayList2.add(new C0391a(c0391a.f8336a, c0391a.f8337b, arrayList3, c0391a.f8339d, c0391a.f8340e, c0391a.f8341f));
                    if (o.f2678a != i5) {
                        break;
                    }
                    j5 = j4;
                }
                linkedList.addFirst(o);
                arrayList.add(new h(b4.f8378a, b4.f8379b - j4, arrayList2, b4.f8381d));
                j5 = j4;
            }
            i4++;
        }
        long j6 = j5;
        long j7 = this.f8347b;
        return new C0393c(this.f8346a, j7 != -9223372036854775807L ? j7 - j6 : -9223372036854775807L, this.f8348c, this.f8349d, this.f8350e, this.f8351f, this.f8352g, this.f8353h, this.f8357l, this.f8354i, this.f8355j, this.f8356k, arrayList);
    }

    public final h b(int i4) {
        return (h) this.f8358m.get(i4);
    }

    public final long c(int i4) {
        long j4;
        long j5;
        List list = this.f8358m;
        if (i4 == list.size() - 1) {
            j4 = this.f8347b;
            if (j4 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j5 = ((h) list.get(i4)).f8379b;
        } else {
            j4 = ((h) list.get(i4 + 1)).f8379b;
            j5 = ((h) list.get(i4)).f8379b;
        }
        return j4 - j5;
    }

    public final long d(int i4) {
        return J.M(c(i4));
    }
}
