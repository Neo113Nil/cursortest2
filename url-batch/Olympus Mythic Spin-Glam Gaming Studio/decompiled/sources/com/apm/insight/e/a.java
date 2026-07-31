package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* compiled from: NpthDataManager.java */
/* loaded from: classes13.dex */
public class a {
    private static volatile a a;
    private com.apm.insight.e.a.b b;
    private SQLiteDatabase c;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                try {
                    if (a == null) {
                        a = new a();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public final synchronized void a(Context context) {
        try {
            this.c = new b(context).getWritableDatabase();
        } finally {
            this.b = new com.apm.insight.e.a.b();
        }
        this.b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.c, str);
    }

    private void b() {
        if (this.b == null) {
            a(e.g());
        }
    }
}
