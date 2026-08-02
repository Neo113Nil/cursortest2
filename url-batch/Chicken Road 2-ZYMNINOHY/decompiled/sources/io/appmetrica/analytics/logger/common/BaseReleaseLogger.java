package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f13186d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f13187a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f13188b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f13189c;

    public BaseReleaseLogger(String str, String str2) {
        this.f13189c = new c(new d(str), new a(), new b());
        this.f13187a = str2;
    }

    public static void init(Context context) {
        f13186d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f13188b) {
            c cVar = this.f13189c;
            String prefix = getPrefix();
            cVar.f13192b.getClass();
            ArrayList a3 = cVar.f13193c.a(a.a(prefix, str, objArr));
            int size = a3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a3.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f13191a.f13194a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public String getPrefix() {
        return f13186d + this.f13187a;
    }

    public void info(String str, Object... objArr) {
        if (this.f13188b) {
            c cVar = this.f13189c;
            String prefix = getPrefix();
            cVar.f13192b.getClass();
            ArrayList a3 = cVar.f13193c.a(a.a(prefix, str, objArr));
            int size = a3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a3.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f13191a.f13194a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f13188b = z;
    }

    public void warning(String str, Object... objArr) {
        if (this.f13188b) {
            c cVar = this.f13189c;
            String prefix = getPrefix();
            cVar.f13192b.getClass();
            ArrayList a3 = cVar.f13193c.a(a.a(prefix, str, objArr));
            int size = a3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a3.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f13191a.f13194a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f13188b) {
            c cVar = this.f13189c;
            String prefix = getPrefix();
            cVar.f13192b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(Log.getStackTraceString(th));
            ArrayList a3 = cVar.f13193c.a(a.a(prefix, sb.toString(), objArr));
            int size = a3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a3.get(i4);
                i4++;
                String str2 = (String) obj;
                String str3 = cVar.f13191a.f13194a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
