package k5;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import p2.c0;
import p2.d0;
import p2.p;
import p2.s;
import vd.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5392e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f5391d = i3;
        this.f5392e = obj;
    }

    @Override // vd.o
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5391d) {
            case 0:
                j5.f fVar = (j5.f) this.f5392e;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                fVar.i(new j(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                t2.c cVar = (t2.c) this.f5392e;
                d0 b10 = ((p2.j) cVar.f9230s).b((p2.i) obj, (s) obj2, ((p2.o) obj3).f7639a, ((p) obj4).f7640a);
                if (b10 instanceof c0) {
                    Object obj5 = ((c0) b10).f7621d;
                    obj5.getClass();
                    return (Typeface) obj5;
                }
                p.e eVar = new p.e(b10, cVar.f9235x);
                cVar.f9235x = eVar;
                Object obj6 = eVar.f7590r;
                obj6.getClass();
                return (Typeface) obj6;
        }
    }
}
