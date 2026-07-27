package Y4;

import T4.q;
import T4.z;
import X4.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f3712a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3714c;

    /* renamed from: d, reason: collision with root package name */
    public final X4.i f3715d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.e f3716e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3717f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3718g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3719h;

    /* renamed from: i, reason: collision with root package name */
    public int f3720i;

    public i(r call, ArrayList arrayList, int i2, X4.i iVar, M0.e eVar, int i3, int i6, int i7) {
        kotlin.jvm.internal.i.e(call, "call");
        this.f3712a = call;
        this.f3713b = arrayList;
        this.f3714c = i2;
        this.f3715d = iVar;
        this.f3716e = eVar;
        this.f3717f = i3;
        this.f3718g = i6;
        this.f3719h = i7;
    }

    public static i a(i iVar, int i2, X4.i iVar2, M0.e eVar, int i3) {
        if ((i3 & 1) != 0) {
            i2 = iVar.f3714c;
        }
        int i6 = i2;
        if ((i3 & 2) != 0) {
            iVar2 = iVar.f3715d;
        }
        X4.i iVar3 = iVar2;
        if ((i3 & 4) != 0) {
            eVar = iVar.f3716e;
        }
        M0.e request = eVar;
        int i7 = iVar.f3717f;
        int i8 = iVar.f3718g;
        int i9 = iVar.f3719h;
        iVar.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        return new i(iVar.f3712a, iVar.f3713b, i6, iVar3, request, i7, i8, i9);
    }

    public final z b(M0.e request) {
        kotlin.jvm.internal.i.e(request, "request");
        ArrayList arrayList = this.f3713b;
        int size = arrayList.size();
        int i2 = this.f3714c;
        if (i2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3720i++;
        X4.i iVar = this.f3715d;
        if (iVar != null) {
            if (!((X4.j) iVar.f3572d).c().a((q) request.f1783c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port").toString());
            }
            if (this.f3720i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i3 = i2 + 1;
        i a6 = a(this, i3, null, request, 58);
        T4.r rVar = (T4.r) arrayList.get(i2);
        z a7 = rVar.a(a6);
        if (a7 == null) {
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        if (iVar == null || i3 >= arrayList.size() || a6.f3720i == 1) {
            return a7;
        }
        throw new IllegalStateException(("network interceptor " + rVar + " must call proceed() exactly once").toString());
    }
}
