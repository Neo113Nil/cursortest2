package L3;

import G3.q;
import G3.v;
import G3.y;
import K3.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f1670a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1672c;

    /* renamed from: d, reason: collision with root package name */
    public final K3.e f1673d;

    /* renamed from: e, reason: collision with root package name */
    public final v f1674e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1675f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1676g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1677h;

    /* renamed from: i, reason: collision with root package name */
    public int f1678i;

    public g(i iVar, ArrayList arrayList, int i4, K3.e eVar, v vVar, int i5, int i6, int i7) {
        this.f1670a = iVar;
        this.f1671b = arrayList;
        this.f1672c = i4;
        this.f1673d = eVar;
        this.f1674e = vVar;
        this.f1675f = i5;
        this.f1676g = i6;
        this.f1677h = i7;
    }

    public static g a(g gVar, int i4, K3.e eVar, v vVar, int i5) {
        if ((i5 & 1) != 0) {
            i4 = gVar.f1672c;
        }
        int i6 = i4;
        if ((i5 & 2) != 0) {
            eVar = gVar.f1673d;
        }
        K3.e eVar2 = eVar;
        if ((i5 & 4) != 0) {
            vVar = gVar.f1674e;
        }
        v request = vVar;
        int i7 = gVar.f1675f;
        int i8 = gVar.f1676g;
        int i9 = gVar.f1677h;
        kotlin.jvm.internal.i.e(request, "request");
        return new g(gVar.f1670a, gVar.f1671b, i6, eVar2, request, i7, i8, i9);
    }

    public final y b(v request) {
        kotlin.jvm.internal.i.e(request, "request");
        ArrayList arrayList = this.f1671b;
        int size = arrayList.size();
        int i4 = this.f1672c;
        if (i4 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1678i++;
        K3.e eVar = this.f1673d;
        if (eVar != null) {
            if (!eVar.f1546b.d(request.f1012a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i4 - 1) + " must retain the same host and port").toString());
            }
            if (this.f1678i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i4 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i5 = i4 + 1;
        g a3 = a(this, i5, null, request, 58);
        q qVar = (q) arrayList.get(i4);
        y a4 = qVar.a(a3);
        if (a4 == null) {
            throw new NullPointerException("interceptor " + qVar + " returned null");
        }
        if (eVar != null && i5 < arrayList.size() && a3.f1678i != 1) {
            throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
        }
        if (a4.f1039g != null) {
            return a4;
        }
        throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
    }
}
