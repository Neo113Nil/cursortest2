package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.ironsource.b9;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f40488d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f40489a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f40490b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f40491c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f40491c = new c(new d(str), new a(), new b());
        this.f40489a = str2;
    }

    public static void init(@NonNull Context context) {
        f40488d = b9.i.f15550d + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f40490b) {
            c cVar = this.f40491c;
            String prefix = getPrefix();
            cVar.f40494b.getClass();
            ArrayList a4 = cVar.f40495c.a(a.a(prefix, str, objArr));
            int size = a4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a4.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f40493a.f40496a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f40488d + this.f40489a;
    }

    public void info(String str, Object... objArr) {
        if (this.f40490b) {
            c cVar = this.f40491c;
            String prefix = getPrefix();
            cVar.f40494b.getClass();
            ArrayList a4 = cVar.f40495c.a(a.a(prefix, str, objArr));
            int size = a4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a4.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f40493a.f40496a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z4) {
        this.f40490b = z4;
    }

    public void warning(String str, Object... objArr) {
        if (this.f40490b) {
            c cVar = this.f40491c;
            String prefix = getPrefix();
            cVar.f40494b.getClass();
            ArrayList a4 = cVar.f40495c.a(a.a(prefix, str, objArr));
            int size = a4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a4.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f40493a.f40496a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f40490b) {
            c cVar = this.f40491c;
            String prefix = getPrefix();
            cVar.f40494b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            ArrayList a4 = cVar.f40495c.a(a.a(prefix, sb.toString(), objArr));
            int size = a4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a4.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f40493a.f40496a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
