package L3;

import E1.X;
import T.G;
import W.u;
import a.AbstractC0124a;
import android.net.Uri;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.C0179l;
import e0.t;
import io.appmetrica.analytics.impl.Zo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.C1279A;
import m0.C1300m;
import m0.C1301n;
import m0.z;
import u2.l;
import v2.C;
import v2.J;
import v2.K;
import v2.d0;
import v2.f0;
import v2.p0;
import v2.r;
import y0.i;
import y0.o;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1679a;

    /* renamed from: b, reason: collision with root package name */
    public int f1680b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1681c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1682d;

    public /* synthetic */ h() {
        this.f1679a = 2;
    }

    public f0 a(boolean z) {
        K k4;
        K k5;
        if (z && (k5 = (K) this.f1681c) != null) {
            throw k5.a();
        }
        f0 b4 = f0.b(this.f1680b, (Object[]) this.f1682d, this);
        if (!z || (k4 = (K) this.f1681c) == null) {
            return b4;
        }
        throw k4.a();
    }

    public Object b(int i4) {
        SparseArray sparseArray = (SparseArray) this.f1682d;
        if (this.f1680b == -1) {
            this.f1680b = 0;
        }
        while (true) {
            int i5 = this.f1680b;
            if (i5 <= 0 || i4 >= sparseArray.keyAt(i5)) {
                break;
            }
            this.f1680b--;
        }
        while (this.f1680b < sparseArray.size() - 1 && i4 >= sparseArray.keyAt(this.f1680b + 1)) {
            this.f1680b++;
        }
        return sparseArray.valueAt(this.f1680b);
    }

    public C1279A c(int i4, String str, Map map, Uri uri) {
        C1300m c1300m = (C1300m) this.f1681c;
        String str2 = c1300m.f14406c;
        int i5 = this.f1680b;
        this.f1680b = i5 + 1;
        t tVar = new t(str2, str, i5);
        if (c1300m.n != null) {
            c1300m.f14413j.getClass();
            try {
                tVar.v("Authorization", c1300m.n.a(c1300m.f14413j, uri, i4));
            } catch (G e4) {
                C1300m.a(c1300m, new C0179l(e4));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            tVar.v((String) entry.getKey(), (String) entry.getValue());
        }
        return new C1279A(uri, i4, new C1301n(tVar), "");
    }

    public void d(Object obj, Object obj2) {
        int i4 = (this.f1680b + 1) * 2;
        Object[] objArr = (Object[]) this.f1682d;
        if (i4 > objArr.length) {
            this.f1682d = Arrays.copyOf(objArr, C.e(objArr.length, i4));
        }
        r.c(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1682d;
        int i5 = this.f1680b;
        int i6 = i5 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f1680b = i5 + 1;
    }

    public void e(Set set) {
        if (set != null) {
            int size = (set.size() + this.f1680b) * 2;
            Object[] objArr = (Object[]) this.f1682d;
            if (size > objArr.length) {
                this.f1682d = Arrays.copyOf(objArr, C.e(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            d(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f() {
        ((C1279A) this.f1682d).getClass();
        J j4 = ((C1279A) this.f1682d).f14294c.f14421a;
        HashMap hashMap = new HashMap();
        p0 it = ((d0) j4.f15572d.keySet()).iterator();
        while (true) {
            v2.G g4 = (v2.G) it;
            if (!g4.hasNext()) {
                C1279A c1279a = (C1279A) this.f1682d;
                g(c(c1279a.f14293b, ((C1300m) this.f1681c).f14414k, hashMap, c1279a.f14292a));
                return;
            }
            String str = (String) g4.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) r.j(j4.g(str)));
            }
        }
    }

    public void g(C1279A c1279a) {
        String b4 = c1279a.f14294c.b("CSeq");
        b4.getClass();
        int parseInt = Integer.parseInt(b4);
        C1300m c1300m = (C1300m) this.f1681c;
        SparseArray sparseArray = c1300m.f14409f;
        AbstractC0124a.t(sparseArray.get(parseInt) == null);
        sparseArray.append(parseInt, c1279a);
        c1300m.f14412i.b(z.f(c1279a));
        this.f1682d = c1279a;
    }

    public List h(CharSequence charSequence) {
        charSequence.getClass();
        t tVar = (t) this.f1681c;
        tVar.getClass();
        l lVar = new l(tVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (lVar.hasNext()) {
            arrayList.add((String) lVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // y0.i
    public y0.h j(o oVar, long j4) {
        long j5;
        long position = oVar.getPosition();
        int min = (int) Math.min(112800, oVar.getLength() - position);
        u uVar = (u) this.f1681c;
        uVar.J(min);
        oVar.E(uVar.f3351a, 0, min);
        int i4 = uVar.f3353c;
        long j6 = -1;
        long j7 = -1;
        long j8 = -9223372036854775807L;
        while (true) {
            if (uVar.a() < 188) {
                j5 = -9223372036854775807L;
                break;
            }
            byte[] bArr = uVar.f3351a;
            int i5 = uVar.f3352b;
            while (true) {
                if (i5 >= i4) {
                    j5 = -9223372036854775807L;
                    break;
                }
                j5 = -9223372036854775807L;
                if (bArr[i5] == 71) {
                    break;
                }
                i5++;
            }
            int i6 = i5 + 188;
            if (i6 > i4) {
                break;
            }
            long x4 = V3.b.x(uVar, i5, this.f1680b);
            if (x4 != j5) {
                long b4 = ((W.G) this.f1682d).b(x4);
                if (b4 > j4) {
                    return j8 == j5 ? new y0.h(-1, b4, position) : new y0.h(0, -9223372036854775807L, position + j7);
                }
                if (100000 + b4 > j4) {
                    return new y0.h(0, -9223372036854775807L, position + i5);
                }
                j8 = b4;
                j7 = i5;
            }
            uVar.M(i6);
            j6 = i6;
        }
        return j8 != j5 ? new y0.h(-2, j8, position + j6) : y0.h.f16156d;
    }

    public String toString() {
        switch (this.f1679a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((G3.t) this.f1682d) == G3.t.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1680b);
                sb.append(' ');
                sb.append((String) this.f1681c);
                String sb2 = sb.toString();
                kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    @Override // y0.i
    public void y() {
        u uVar = (u) this.f1681c;
        byte[] bArr = W.J.f3264b;
        uVar.getClass();
        uVar.K(bArr.length, bArr);
    }

    public /* synthetic */ h(Object obj, int i4, String str, int i5) {
        this.f1679a = i5;
        this.f1682d = obj;
        this.f1680b = i4;
        this.f1681c = str;
    }

    public h(int i4, C1301n c1301n, String str) {
        this.f1679a = 6;
        this.f1680b = i4;
        this.f1682d = c1301n;
        this.f1681c = str;
    }

    public h(Zo zo) {
        this.f1679a = 7;
        this.f1682d = new SparseArray();
        this.f1681c = zo;
        this.f1680b = -1;
    }

    public h(int i4, W.G g4) {
        this.f1679a = 4;
        this.f1680b = i4;
        this.f1682d = g4;
        this.f1681c = new u();
    }

    public h(Y.g gVar) {
        this.f1679a = 3;
        X x4 = new X();
        x4.f556b = new a2.i(28);
        this.f1681c = x4;
        this.f1682d = gVar;
        this.f1680b = 1;
    }

    public h(t tVar) {
        this.f1679a = 8;
        this.f1681c = tVar;
        this.f1682d = u2.c.f15508b;
        this.f1680b = Integer.MAX_VALUE;
    }

    public h(C1300m c1300m) {
        this.f1679a = 5;
        this.f1681c = c1300m;
    }

    public h(int i4) {
        this.f1679a = 9;
        this.f1682d = new Object[i4 * 2];
        this.f1680b = 0;
    }
}
