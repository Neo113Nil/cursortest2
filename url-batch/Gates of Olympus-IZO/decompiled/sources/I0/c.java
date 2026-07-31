package I0;

import D1.C0014b;
import F0.l;
import F0.r;
import F0.t;
import I.C0113p;
import L1.z;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import s.C0860c;

/* loaded from: classes.dex */
public final class c extends Z1.j implements Y1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, Object obj) {
        super(4);
        this.f2426e = i3;
        this.f2427f = obj;
    }

    @Override // Y1.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2426e) {
            case 0:
                int i3 = ((F0.j) obj3).f1451a;
                int i4 = ((F0.k) obj4).f1452a;
                d dVar = (d) this.f2427f;
                t b2 = ((F0.f) dVar.f2432e).b((r) obj, (l) obj2, i3, i4);
                if (b2 instanceof t) {
                    Object obj5 = b2.f1468d;
                    Z1.i.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                C0014b c0014b = new C0014b(b2, dVar.f2437j);
                dVar.f2437j = c0014b;
                Object obj6 = c0014b.f538d;
                Z1.i.d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            case 1:
                C0860c c0860c = (C0860c) obj;
                ((Number) obj2).intValue();
                C0113p c0113p = (C0113p) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0113p.f(c0860c) ? 4 : 2;
                }
                if ((intValue & 131) == 130 && c0113p.x()) {
                    c0113p.L();
                } else {
                    ((Q.a) this.f2427f).f(c0860c, c0113p, Integer.valueOf(intValue & 14));
                }
                return z.f2729a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                Z1.i.c(sQLiteQuery);
                ((v1.d) this.f2427f).e(new w1.h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
