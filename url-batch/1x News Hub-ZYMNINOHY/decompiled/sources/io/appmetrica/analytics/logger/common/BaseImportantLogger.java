package io.appmetrica.analytics.logger.common;

import android.util.Log;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a, reason: collision with root package name */
    private final c f8789a;

    public BaseImportantLogger(String str) {
        this.f8789a = new c(new d(str), new a(), new b());
    }

    public void info(String str, String str2, Object... objArr) {
        c cVar = this.f8789a;
        cVar.f8796b.getClass();
        Iterator it = cVar.f8797c.a(a.a(str, str2, objArr)).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            String str4 = cVar.f8795a.f8798a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
