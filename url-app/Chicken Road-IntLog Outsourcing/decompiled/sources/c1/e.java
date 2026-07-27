package c1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import f1.AbstractC0416a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0.i f4903b;

    public /* synthetic */ e(long j2, V0.i iVar) {
        this.f4902a = j2;
        this.f4903b = iVar;
    }

    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4902a));
        V0.i iVar = this.f4903b;
        String str = iVar.f3208a;
        S0.d dVar = iVar.f3210c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC0416a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f3208a);
            contentValues.put("priority", Integer.valueOf(AbstractC0416a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
