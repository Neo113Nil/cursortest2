package B0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements D0.b, C0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f147c;

    public /* synthetic */ l(long j3, Object obj, Object obj2) {
        this.f146b = obj;
        this.f147c = obj2;
        this.f145a = j3;
    }

    @Override // C0.i, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((y0.c) this.f147c).f10815a;
        String num = Integer.toString(i3);
        String str = (String) this.f146b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j3 = this.f145a;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i3));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // D0.b
    public Object execute() {
        m mVar = (m) this.f146b;
        long d3 = mVar.f153g.d() + this.f145a;
        C0.k kVar = (C0.k) mVar.f150c;
        v0.i iVar = (v0.i) this.f147c;
        kVar.getClass();
        kVar.c(new C0.g(d3, iVar));
        return null;
    }
}
