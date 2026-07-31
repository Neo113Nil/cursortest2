package G0;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f693b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f694c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private a f695a;

    public b() {
        this.f695a = new d(true, true);
    }

    public static b a(String str) {
        return (b) f693b.get(str);
    }

    private void e(Context context, boolean z4) {
        String[] split;
        long currentTimeMillis = System.currentTimeMillis();
        String a4 = K0.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent TimeCost:%d  Content:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), a4);
        if (TextUtils.isEmpty(a4)) {
            long currentTimeMillis2 = System.currentTimeMillis();
            split = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            Logger.i("LocalManagerProxy", "list by AssetsManager, timeCost:" + (System.currentTimeMillis() - currentTimeMillis2));
        } else {
            split = a4.split("#");
        }
        List arrayList = split == null ? new ArrayList() : Arrays.asList(split);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.f695a = new d(false, z4);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f695a = new d(context, appConfigName, z4);
        }
        if (!this.f695a.o() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f695a = new c(context, z4);
        }
        this.f695a.h(context, arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append("on initLocalManager finish, check appGrs: ");
        sb.append(this.f695a.f688a == null);
        Logger.i("LocalManagerProxy", sb.toString());
    }

    public N0.a b() {
        return this.f695a.k();
    }

    public String c(Context context, F0.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z4) {
        String b4;
        synchronized (f694c) {
            b4 = this.f695a.b(context, aVar, grsBaseInfo, str, str2, z4);
        }
        return b4;
    }

    public Map d(Context context, F0.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z4) {
        Map e4;
        synchronized (f694c) {
            e4 = this.f695a.e(context, aVar, grsBaseInfo, str, z4);
        }
        return e4;
    }

    public void f(String str, F0.c cVar) {
        String str2;
        try {
            cVar.f(str + "#localConfig", this.f695a.g().toString());
        } catch (JSONException unused) {
            str2 = "save local config encounter JSONException.";
            Logger.w("LocalManagerProxy", str2);
        } catch (Throwable th) {
            str2 = "save local config encounter Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.w("LocalManagerProxy", str2);
        }
    }

    public boolean g(Context context, String str) {
        boolean p4 = this.f695a.p(str);
        f693b.put(context.getPackageName(), this);
        return p4;
    }

    public Set h() {
        return this.f695a.n();
    }

    public b(Context context, boolean z4) {
        e(context, z4);
        f693b.put(context.getPackageName(), this);
    }
}
