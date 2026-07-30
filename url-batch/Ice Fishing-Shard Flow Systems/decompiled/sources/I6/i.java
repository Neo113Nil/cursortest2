package I6;

import D6.C;
import D6.s;
import D6.t;
import D6.z;
import H6.q;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f1296a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1298c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.h f1299d;

    /* renamed from: e, reason: collision with root package name */
    public final z f1300e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1301f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1302g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1303h;

    /* renamed from: i, reason: collision with root package name */
    public int f1304i;

    public i(q call, ArrayList interceptors, int i2, H6.h hVar, z request, int i5, int i7, int i8) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f1296a = call;
        this.f1297b = interceptors;
        this.f1298c = i2;
        this.f1299d = hVar;
        this.f1300e = request;
        this.f1301f = i5;
        this.f1302g = i7;
        this.f1303h = i8;
    }

    public static i a(i iVar, int i2, H6.h hVar, z zVar, int i5) {
        if ((i5 & 1) != 0) {
            i2 = iVar.f1298c;
        }
        int i7 = i2;
        if ((i5 & 2) != 0) {
            hVar = iVar.f1299d;
        }
        H6.h hVar2 = hVar;
        if ((i5 & 4) != 0) {
            zVar = iVar.f1300e;
        }
        z request = zVar;
        int i8 = iVar.f1301f;
        int i9 = iVar.f1302g;
        int i10 = iVar.f1303h;
        Intrinsics.checkNotNullParameter(request, "request");
        return new i(iVar.f1296a, iVar.f1297b, i7, hVar2, request, i8, i9, i10);
    }

    public final C b(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f1297b;
        int size = arrayList.size();
        int i2 = this.f1298c;
        if (i2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1304i++;
        H6.h hVar = this.f1299d;
        if (hVar != null) {
            if (!((H6.i) hVar.f1053d).c().h((s) request.f640c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port").toString());
            }
            if (this.f1304i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i5 = i2 + 1;
        i a7 = a(this, i5, null, request, 58);
        t tVar = (t) arrayList.get(i2);
        C a8 = tVar.a(a7);
        if (a8 == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (hVar == null || i5 >= arrayList.size() || a7.f1304i == 1) {
            return a8;
        }
        throw new IllegalStateException(("network interceptor " + tVar + " must call proceed() exactly once").toString());
    }
}
