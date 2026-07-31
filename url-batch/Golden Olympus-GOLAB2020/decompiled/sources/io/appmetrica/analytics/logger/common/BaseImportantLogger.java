package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a, reason: collision with root package name */
    private final c f40487a;

    public BaseImportantLogger(@NonNull String str) {
        this.f40487a = new c(new d(str), new a(), new b());
    }

    public void info(@NonNull String str, String str2, Object... objArr) {
        c cVar = this.f40487a;
        cVar.f40494b.getClass();
        ArrayList a4 = cVar.f40495c.a(a.a(str, str2, objArr));
        int size = a4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a4.get(i4);
            i4++;
            String str3 = (String) obj;
            String str4 = cVar.f40493a.f40496a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
