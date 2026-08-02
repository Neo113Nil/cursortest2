package y0;

import android.net.Uri;
import d2.C0389g;
import f1.C0413a;
import f1.C0415c;
import f1.C0416d;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.impl.Zo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v2.I;
import v2.a0;
import z0.C1580a;

/* loaded from: classes.dex */
public final class l implements q {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f16173f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: g, reason: collision with root package name */
    public static final C0389g f16174g = new C0389g(new Zo(14));

    /* renamed from: h, reason: collision with root package name */
    public static final C0389g f16175h = new C0389g(new Zo(15));

    /* renamed from: a, reason: collision with root package name */
    public a0 f16176a;

    /* renamed from: d, reason: collision with root package name */
    public int f16179d;

    /* renamed from: e, reason: collision with root package name */
    public int f16180e;

    /* renamed from: c, reason: collision with root package name */
    public a2.i f16178c = new a2.i(28);

    /* renamed from: b, reason: collision with root package name */
    public boolean f16177b = true;

    public final void a(int i4, ArrayList arrayList) {
        switch (i4) {
            case 0:
                arrayList.add(new C0413a());
                break;
            case 1:
                arrayList.add(new C0415c());
                break;
            case 2:
                arrayList.add(new C0416d(0));
                break;
            case 3:
                arrayList.add(new C1580a());
                break;
            case 4:
                n G4 = f16174g.G(0);
                if (G4 == null) {
                    arrayList.add(new D0.e());
                    break;
                } else {
                    arrayList.add(G4);
                    break;
                }
            case 5:
                arrayList.add(new E0.b());
                break;
            case 6:
                arrayList.add(new Q0.f(this.f16178c, this.f16177b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new R0.d(0));
                break;
            case 8:
                a2.i iVar = this.f16178c;
                int i5 = this.f16177b ? 0 : 32;
                v2.G g4 = I.f15571b;
                arrayList.add(new S0.o(iVar, i5, null, null, a0.f15605e, null));
                arrayList.add(new S0.s(this.f16178c, this.f16177b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new T0.d());
                break;
            case 10:
                arrayList.add(new f1.y());
                break;
            case 11:
                if (this.f16176a == null) {
                    v2.G g5 = I.f15571b;
                    this.f16176a = a0.f15605e;
                }
                arrayList.add(new f1.C(1, !this.f16177b ? 1 : 0, this.f16178c, new W.G(0L), new B.k(0, this.f16176a)));
                break;
            case 12:
                arrayList.add(new g1.d());
                break;
            case 14:
                arrayList.add(new C0.a(this.f16179d));
                break;
            case 15:
                n G5 = f16175h.G(new Object[0]);
                if (G5 != null) {
                    arrayList.add(G5);
                    break;
                }
                break;
            case 16:
                arrayList.add(new A0.d(1 ^ (this.f16177b ? 1 : 0), this.f16178c));
                break;
            case 17:
                arrayList.add(new C0.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new B0.a(1));
                break;
            case C0583e9.f11743C /* 19 */:
                arrayList.add(new C0.a(0, (byte) 0));
                break;
            case C0583e9.f11744D /* 20 */:
                arrayList.add(new F0.b(this.f16180e));
                break;
            case 21:
                arrayList.add(new B0.a(0));
                break;
        }
    }

    @Override // y0.q
    public final synchronized n[] b() {
        return c(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // y0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized n[] c(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int m4;
        int n;
        int i4;
        try {
            int[] iArr = f16173f;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                m4 = U.i.m(str);
                if (m4 != -1) {
                    a(m4, arrayList);
                }
                n = U.i.n(uri);
                if (n != -1 && n != m4) {
                    a(n, arrayList);
                }
                for (i4 = 0; i4 < 21; i4++) {
                    int i5 = iArr[i4];
                    if (i5 != m4 && i5 != n) {
                        a(i5, arrayList);
                    }
                }
            }
            str = null;
            m4 = U.i.m(str);
            if (m4 != -1) {
            }
            n = U.i.n(uri);
            if (n != -1) {
                a(n, arrayList);
            }
            while (i4 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (n[]) arrayList.toArray(new n[0]);
    }
}
