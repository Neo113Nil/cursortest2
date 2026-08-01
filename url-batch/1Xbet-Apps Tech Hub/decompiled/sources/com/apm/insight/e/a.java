package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.i;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class a {
    private static volatile a a;
    private com.apm.insight.e.b.b b;
    private SQLiteDatabase c;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    private void b() {
        if (this.b == null) {
            a(i.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.c = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            q.b(th);
        }
        this.b = new com.apm.insight.e.b.b();
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        com.apm.insight.e.b.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        com.apm.insight.e.b.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.c, str);
    }
}
