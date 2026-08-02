package io.appmetrica.analytics.logger.common;

import android.util.Log;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a, reason: collision with root package name */
    private final c f13185a;

    public BaseImportantLogger(String str) {
        this.f13185a = new c(new d(str), new a(), new b());
    }

    public void info(String str, String str2, Object... objArr) {
        c cVar = this.f13185a;
        cVar.f13192b.getClass();
        ArrayList a3 = cVar.f13193c.a(a.a(str, str2, objArr));
        int size = a3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a3.get(i4);
            i4++;
            String str3 = (String) obj;
            String str4 = cVar.f13191a.f13194a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
