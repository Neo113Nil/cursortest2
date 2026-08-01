package h3;

import c3.n;
import c3.s;
import c3.u;
import g3.i;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f2021a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2022b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final g3.d f2023d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2024e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2025f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2026i;

    public g(i iVar, ArrayList arrayList, int i4, g3.d dVar, s sVar, int i5, int i6, int i7) {
        this.f2021a = iVar;
        this.f2022b = arrayList;
        this.c = i4;
        this.f2023d = dVar;
        this.f2024e = sVar;
        this.f2025f = i5;
        this.g = i6;
        this.h = i7;
    }

    public static g a(g gVar, int i4, g3.d dVar, s sVar, int i5) {
        if ((i5 & 1) != 0) {
            i4 = gVar.c;
        }
        int i6 = i4;
        if ((i5 & 2) != 0) {
            dVar = gVar.f2023d;
        }
        g3.d dVar2 = dVar;
        if ((i5 & 4) != 0) {
            sVar = gVar.f2024e;
        }
        s sVar2 = sVar;
        int i7 = gVar.f2025f;
        int i8 = gVar.g;
        int i9 = gVar.h;
        u2.c.e(sVar2, "request");
        return new g(gVar.f2021a, gVar.f2022b, i6, dVar2, sVar2, i7, i8, i9);
    }

    public final u b(s sVar) {
        u2.c.e(sVar, "request");
        ArrayList arrayList = this.f2022b;
        int size = arrayList.size();
        int i4 = this.c;
        if (i4 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f2026i++;
        g3.d dVar = this.f2023d;
        if (dVar != null) {
            if (!dVar.f1931b.b(sVar.f1127a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i4 - 1) + " must retain the same host and port").toString());
            }
            if (this.f2026i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i4 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i5 = i4 + 1;
        g a4 = a(this, i5, null, sVar, 58);
        n nVar = (n) arrayList.get(i4);
        u a5 = nVar.a(a4);
        if (a5 == null) {
            throw new NullPointerException("interceptor " + nVar + " returned null");
        }
        if (dVar != null && i5 < arrayList.size() && a4.f2026i != 1) {
            throw new IllegalStateException(("network interceptor " + nVar + " must call proceed() exactly once").toString());
        }
        if (a5.f1145l != null) {
            return a5;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
