package z0;

import E7.r;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5259b extends kotlin.jvm.internal.i implements r {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y0.d f42106n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5259b(y0.d dVar) {
        super(4);
        this.f42106n = dVar;
    }

    @Override // E7.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        kotlin.jvm.internal.h.b(sQLiteQuery);
        this.f42106n.g(new C5265h(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
