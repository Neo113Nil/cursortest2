package C0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import s0.EnumC1186c;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.i f204b;

    public /* synthetic */ g(long j3, v0.i iVar) {
        this.f203a = j3;
        this.f204b = iVar;
    }

    @Override // C0.i, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f203a));
        v0.i iVar = this.f204b;
        String str = iVar.f10554a;
        EnumC1186c enumC1186c = iVar.f10556c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(F0.a.a(enumC1186c))}) < 1) {
            contentValues.put("backend_name", iVar.f10554a);
            contentValues.put("priority", Integer.valueOf(F0.a.a(enumC1186c)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
