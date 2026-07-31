package b2;

import android.net.Uri;
import e1.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o2.k0;
import o2.m0;
import r0.s1;
import s1.c;

/* loaded from: classes.dex */
public class a implements s1.a<a> {

    /* renamed from: a, reason: collision with root package name */
    public final int f1629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1631c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1632d;

    /* renamed from: e, reason: collision with root package name */
    public final C0037a f1633e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f1634f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1635g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1636h;

    /* renamed from: b2.a$a, reason: collision with other inner class name */
    public static class C0037a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f1637a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f1638b;

        /* renamed from: c, reason: collision with root package name */
        public final p[] f1639c;

        public C0037a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f1637a = uuid;
            this.f1638b = bArr;
            this.f1639c = pVarArr;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1640a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1641b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1642c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1643d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1644e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1645f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1646g;

        /* renamed from: h, reason: collision with root package name */
        public final int f1647h;

        /* renamed from: i, reason: collision with root package name */
        public final String f1648i;

        /* renamed from: j, reason: collision with root package name */
        public final s1[] f1649j;

        /* renamed from: k, reason: collision with root package name */
        public final int f1650k;

        /* renamed from: l, reason: collision with root package name */
        private final String f1651l;

        /* renamed from: m, reason: collision with root package name */
        private final String f1652m;

        /* renamed from: n, reason: collision with root package name */
        private final List<Long> f1653n;

        /* renamed from: o, reason: collision with root package name */
        private final long[] f1654o;

        /* renamed from: p, reason: collision with root package name */
        private final long f1655p;

        public b(String str, String str2, int i7, String str3, long j7, String str4, int i8, int i9, int i10, int i11, String str5, s1[] s1VarArr, List<Long> list, long j8) {
            this(str, str2, i7, str3, j7, str4, i8, i9, i10, i11, str5, s1VarArr, list, m0.O0(list, 1000000L, j7), m0.N0(j8, 1000000L, j7));
        }

        private b(String str, String str2, int i7, String str3, long j7, String str4, int i8, int i9, int i10, int i11, String str5, s1[] s1VarArr, List<Long> list, long[] jArr, long j8) {
            this.f1651l = str;
            this.f1652m = str2;
            this.f1640a = i7;
            this.f1641b = str3;
            this.f1642c = j7;
            this.f1643d = str4;
            this.f1644e = i8;
            this.f1645f = i9;
            this.f1646g = i10;
            this.f1647h = i11;
            this.f1648i = str5;
            this.f1649j = s1VarArr;
            this.f1653n = list;
            this.f1654o = jArr;
            this.f1655p = j8;
            this.f1650k = list.size();
        }

        public Uri a(int i7, int i8) {
            o2.a.f(this.f1649j != null);
            o2.a.f(this.f1653n != null);
            o2.a.f(i8 < this.f1653n.size());
            String num = Integer.toString(this.f1649j[i7].f20952m);
            String l7 = this.f1653n.get(i8).toString();
            return k0.e(this.f1651l, this.f1652m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l7).replace("{start_time}", l7));
        }

        public b b(s1[] s1VarArr) {
            return new b(this.f1651l, this.f1652m, this.f1640a, this.f1641b, this.f1642c, this.f1643d, this.f1644e, this.f1645f, this.f1646g, this.f1647h, this.f1648i, s1VarArr, this.f1653n, this.f1654o, this.f1655p);
        }

        public long c(int i7) {
            if (i7 == this.f1650k - 1) {
                return this.f1655p;
            }
            long[] jArr = this.f1654o;
            return jArr[i7 + 1] - jArr[i7];
        }

        public int d(long j7) {
            return m0.i(this.f1654o, j7, true, true);
        }

        public long e(int i7) {
            return this.f1654o[i7];
        }
    }

    private a(int i7, int i8, long j7, long j8, int i9, boolean z6, C0037a c0037a, b[] bVarArr) {
        this.f1629a = i7;
        this.f1630b = i8;
        this.f1635g = j7;
        this.f1636h = j8;
        this.f1631c = i9;
        this.f1632d = z6;
        this.f1633e = c0037a;
        this.f1634f = bVarArr;
    }

    public a(int i7, int i8, long j7, long j8, long j9, int i9, boolean z6, C0037a c0037a, b[] bVarArr) {
        this(i7, i8, j8 == 0 ? -9223372036854775807L : m0.N0(j8, 1000000L, j7), j9 != 0 ? m0.N0(j9, 1000000L, j7) : -9223372036854775807L, i9, z6, c0037a, bVarArr);
    }

    @Override // s1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            c cVar = (c) arrayList.get(i7);
            b bVar2 = this.f1634f[cVar.f21609g];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((s1[]) arrayList3.toArray(new s1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f1649j[cVar.f21610h]);
            i7++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((s1[]) arrayList3.toArray(new s1[0])));
        }
        return new a(this.f1629a, this.f1630b, this.f1635g, this.f1636h, this.f1631c, this.f1632d, this.f1633e, (b[]) arrayList2.toArray(new b[0]));
    }
}
