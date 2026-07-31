package c6;

import X5.o;
import X5.p;
import X5.w;
import b6.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f3826a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3828c;

    /* renamed from: d, reason: collision with root package name */
    public final U.a f3829d;

    /* renamed from: e, reason: collision with root package name */
    public final D0.h f3830e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3831f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3832g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3833h;

    /* renamed from: i, reason: collision with root package name */
    public int f3834i;

    public h(q qVar, ArrayList arrayList, int i7, U.a aVar, D0.h hVar, int i8, int i9, int i10) {
        this.f3826a = qVar;
        this.f3827b = arrayList;
        this.f3828c = i7;
        this.f3829d = aVar;
        this.f3830e = hVar;
        this.f3831f = i8;
        this.f3832g = i9;
        this.f3833h = i10;
    }

    public static h a(h hVar, int i7, U.a aVar, D0.h hVar2, int i8) {
        if ((i8 & 1) != 0) {
            i7 = hVar.f3828c;
        }
        int i9 = i7;
        if ((i8 & 2) != 0) {
            aVar = hVar.f3829d;
        }
        U.a aVar2 = aVar;
        if ((i8 & 4) != 0) {
            hVar2 = hVar.f3830e;
        }
        D0.h request = hVar2;
        int i10 = hVar.f3831f;
        int i11 = hVar.f3832g;
        int i12 = hVar.f3833h;
        kotlin.jvm.internal.i.e(request, "request");
        return new h(hVar.f3826a, hVar.f3827b, i9, aVar2, request, i10, i11, i12);
    }

    public final w b(D0.h request) {
        kotlin.jvm.internal.i.e(request, "request");
        ArrayList arrayList = this.f3827b;
        int size = arrayList.size();
        int i7 = this.f3828c;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3834i++;
        U.a aVar = this.f3829d;
        if (aVar != null) {
            if (!((b6.i) aVar.f2484d).b().f((o) request.f331c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f3834i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i8 = i7 + 1;
        h a7 = a(this, i8, null, request, 58);
        p pVar = (p) arrayList.get(i7);
        w a8 = pVar.a(a7);
        if (a8 == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (aVar == null || i8 >= arrayList.size() || a7.f3834i == 1) {
            return a8;
        }
        throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
    }
}
