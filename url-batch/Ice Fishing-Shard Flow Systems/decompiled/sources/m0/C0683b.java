package m0;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import e6.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683b extends p implements o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.e f6487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683b(l0.e eVar) {
        super(4);
        this.f6487d = eVar;
    }

    @Override // e6.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        Intrinsics.b(sQLiteQuery);
        this.f6487d.d(new i(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
