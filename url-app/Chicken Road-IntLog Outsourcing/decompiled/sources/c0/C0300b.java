package c0;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import b0.InterfaceC0263d;
import kotlin.jvm.internal.j;
import t4.InterfaceC1447r;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300b extends j implements InterfaceC1447r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0263d f4867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0300b(InterfaceC0263d interfaceC0263d) {
        super(4);
        this.f4867e = interfaceC0263d;
    }

    @Override // t4.InterfaceC1447r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        kotlin.jvm.internal.i.b(sQLiteQuery);
        this.f4867e.b(new C0306h(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
