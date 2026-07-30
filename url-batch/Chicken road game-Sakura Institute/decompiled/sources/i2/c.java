package i2;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;
import f2.q;
import f2.s;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends l implements q6.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4857g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Object obj) {
        super(4);
        this.f4857g = i7;
        this.f4858h = obj;
    }

    @Override // q6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f4857g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = ((f2.i) obj3).f3275a;
                int i8 = ((f2.j) obj4).f3276a;
                d dVar = (d) this.f4858h;
                s b9 = ((f2.e) dVar.f4863e).b((q) obj, (f2.k) obj2, i7, i8);
                if (b9 instanceof s) {
                    Object obj5 = b9.f3290f;
                    r6.k.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                b1.b bVar = new b1.b(b9, dVar.f4868j);
                dVar.f4868j = bVar;
                Object obj6 = bVar.f1232i;
                r6.k.d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                y3.d dVar2 = (y3.d) this.f4858h;
                r6.k.c(sQLiteQuery);
                dVar2.c(new z3.h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
