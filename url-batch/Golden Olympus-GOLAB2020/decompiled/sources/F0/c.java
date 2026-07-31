package F0;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f650b = "c";

    /* renamed from: c, reason: collision with root package name */
    private static final Map f651c = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f652a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(f650b, "get pkgname from context is{%s}", packageName);
        Map map = f651c;
        if (map.containsKey(str + packageName)) {
            this.f652a = (PLSharedPreferences) map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, str + packageName);
            this.f652a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        c(context);
    }

    private void c(Context context) {
        String str = f650b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String l4 = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String a4 = a("version", "");
            if (l4.equals(a4)) {
                return;
            }
            Logger.i(str, "app version changed! old version{%s} and new version{%s}", a4, l4);
            e();
            f("version", l4);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w(f650b, "get app version failed and catch NameNotFoundException");
        }
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f652a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f652a.getString(str, str2);
        }
        return string;
    }

    public Map b() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f652a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f652a.getAll();
        }
        return all;
    }

    public void d(String str) {
        PLSharedPreferences pLSharedPreferences = this.f652a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f652a.remove(str);
        }
    }

    public void e() {
        PLSharedPreferences pLSharedPreferences = this.f652a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f652a.clear();
        }
    }

    public void f(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f652a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f652a.putString(str, str2);
        }
    }
}
