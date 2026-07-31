package V;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.j;
import x5.InterfaceC0749r;

/* loaded from: classes.dex */
public final class b extends j implements InterfaceC0749r {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.e f2679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(U.e eVar) {
        super(4);
        this.f2679f = eVar;
    }

    @Override // x5.InterfaceC0749r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        kotlin.jvm.internal.i.b(sQLiteQuery);
        this.f2679f.a(new h(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
