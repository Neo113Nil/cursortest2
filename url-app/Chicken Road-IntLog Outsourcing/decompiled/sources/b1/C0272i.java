package b1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0272i implements d1.b, c1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4786c;

    public /* synthetic */ C0272i(long j2, Object obj, Object obj2) {
        this.f4785b = obj;
        this.f4786c = obj2;
        this.f4784a = j2;
    }

    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i2 = ((Y0.c) this.f4786c).f3675a;
        String num = Integer.toString(i2);
        String str = (String) this.f4785b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j2 = this.f4784a;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i2)});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i2));
                contentValues.put("events_dropped_count", Long.valueOf(j2));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            }
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // d1.b
    public Object execute() {
        C0273j c0273j = (C0273j) this.f4785b;
        long e3 = c0273j.f4793g.e() + this.f4784a;
        c1.i iVar = (c1.i) c0273j.f4789c;
        V0.i iVar2 = (V0.i) this.f4786c;
        iVar.getClass();
        iVar.c(new c1.e(e3, iVar2));
        return null;
    }
}
