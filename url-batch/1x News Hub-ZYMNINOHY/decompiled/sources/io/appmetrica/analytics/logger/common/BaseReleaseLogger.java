package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f8790d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f8791a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f8792b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f8793c;

    public BaseReleaseLogger(String str, String str2) {
        this.f8793c = new c(new d(str), new a(), new b());
        this.f8791a = str2;
    }

    public static void init(Context context) {
        f8790d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f8792b) {
            c cVar = this.f8793c;
            String prefix = getPrefix();
            cVar.f8796b.getClass();
            Iterator it = cVar.f8797c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8795a.f8798a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public String getPrefix() {
        return f8790d + this.f8791a;
    }

    public void info(String str, Object... objArr) {
        if (this.f8792b) {
            c cVar = this.f8793c;
            String prefix = getPrefix();
            cVar.f8796b.getClass();
            Iterator it = cVar.f8797c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8795a.f8798a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f8792b = z;
    }

    public void warning(String str, Object... objArr) {
        if (this.f8792b) {
            c cVar = this.f8793c;
            String prefix = getPrefix();
            cVar.f8796b.getClass();
            Iterator it = cVar.f8797c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8795a.f8798a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f8792b) {
            c cVar = this.f8793c;
            String prefix = getPrefix();
            cVar.f8796b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(Log.getStackTraceString(th));
            Iterator it = cVar.f8797c.a(a.a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8795a.f8798a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
