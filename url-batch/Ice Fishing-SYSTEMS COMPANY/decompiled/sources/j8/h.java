package j8;

import com.google.android.gms.internal.ads.C4088vv;
import e8.o;
import e8.p;
import e8.w;
import i8.q;
import java.util.ArrayList;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f38594a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38596c;

    /* renamed from: d, reason: collision with root package name */
    public final C4088vv f38597d;

    /* renamed from: e, reason: collision with root package name */
    public final C4903n f38598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38600g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38601h;
    public int i;

    public h(q call, ArrayList arrayList, int i, C4088vv c4088vv, C4903n c4903n, int i4, int i9, int i10) {
        kotlin.jvm.internal.h.e(call, "call");
        this.f38594a = call;
        this.f38595b = arrayList;
        this.f38596c = i;
        this.f38597d = c4088vv;
        this.f38598e = c4903n;
        this.f38599f = i4;
        this.f38600g = i9;
        this.f38601h = i10;
    }

    public static h a(h hVar, int i, C4088vv c4088vv, C4903n c4903n, int i4) {
        if ((i4 & 1) != 0) {
            i = hVar.f38596c;
        }
        int i9 = i;
        if ((i4 & 2) != 0) {
            c4088vv = hVar.f38597d;
        }
        C4088vv c4088vv2 = c4088vv;
        if ((i4 & 4) != 0) {
            c4903n = hVar.f38598e;
        }
        C4903n request = c4903n;
        kotlin.jvm.internal.h.e(request, "request");
        return new h(hVar.f38594a, hVar.f38595b, i9, c4088vv2, request, hVar.f38599f, hVar.f38600g, hVar.f38601h);
    }

    public final w b(C4903n request) {
        kotlin.jvm.internal.h.e(request, "request");
        ArrayList arrayList = this.f38595b;
        int size = arrayList.size();
        int i = this.f38596c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        C4088vv c4088vv = this.f38597d;
        if (c4088vv != null) {
            if (!((i8.i) c4088vv.f34900w).j().b((o) request.f40101u)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i + 1;
        h a9 = a(this, i4, null, request, 58);
        p pVar = (p) arrayList.get(i);
        w a10 = pVar.a(a9);
        if (a10 == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (c4088vv == null || i4 >= arrayList.size() || a9.i == 1) {
            return a10;
        }
        throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
    }
}
