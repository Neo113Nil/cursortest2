package r3;

import A0.q;
import C.F;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m3.m;
import m3.n;
import m3.w;
import q3.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f9865a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9867c;

    /* renamed from: d, reason: collision with root package name */
    public final F f9868d;

    /* renamed from: e, reason: collision with root package name */
    public final q f9869e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9870f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9871g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9872h;

    /* renamed from: i, reason: collision with root package name */
    public int f9873i;

    public f(g call, ArrayList interceptors, int i2, F f4, q request, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f9865a = call;
        this.f9866b = interceptors;
        this.f9867c = i2;
        this.f9868d = f4;
        this.f9869e = request;
        this.f9870f = i4;
        this.f9871g = i5;
        this.f9872h = i6;
    }

    public static f a(f fVar, int i2, F f4, q qVar, int i4) {
        if ((i4 & 1) != 0) {
            i2 = fVar.f9867c;
        }
        int i5 = i2;
        if ((i4 & 2) != 0) {
            f4 = fVar.f9868d;
        }
        F f5 = f4;
        if ((i4 & 4) != 0) {
            qVar = fVar.f9869e;
        }
        q request = qVar;
        int i6 = fVar.f9870f;
        int i7 = fVar.f9871g;
        int i8 = fVar.f9872h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new f(fVar.f9865a, fVar.f9866b, i5, f5, request, i6, i7, i8);
    }

    public final w b(q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f9866b;
        int size = arrayList.size();
        int i2 = this.f9867c;
        if (i2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9873i++;
        F f4 = this.f9868d;
        if (f4 != null) {
            if (!((q3.d) f4.f1053c).b((m) request.f362c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port").toString());
            }
            if (this.f9873i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i2 + 1;
        f a4 = a(this, i4, null, request, 58);
        n nVar = (n) arrayList.get(i2);
        w a5 = nVar.a(a4);
        if (a5 == null) {
            throw new NullPointerException("interceptor " + nVar + " returned null");
        }
        if (f4 != null && i4 < arrayList.size() && a4.f9873i != 1) {
            throw new IllegalStateException(("network interceptor " + nVar + " must call proceed() exactly once").toString());
        }
        if (a5.f8479m != null) {
            return a5;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
