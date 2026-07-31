package x3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.b9;
import d3.AbstractC2404a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class c {
    public static final JSONObject a(Context context, t3.b libraryInfo, String sessionUuid, Date date, String str, List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libraryInfo, "libraryInfo");
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        PackageInfo a4 = g3.b.a(packageManager, packageName, 0);
        String a5 = AbstractC2404a.a(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", a4.packageName);
        jSONObject.put("versionName", a4.versionName);
        jSONObject.put("versionCode", g3.a.a(a4));
        jSONObject.put("buildUuid", a5);
        jSONObject.put("sessionUuid", sessionUuid);
        jSONObject.put(b9.h.f15441G, Build.MODEL);
        jSONObject.put("deviceId", j3.a.a(context));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("inBackground", !i3.a.f(context));
        jSONObject.put("connection", i3.a.b(context));
        jSONObject.put("isRooted", i3.a.g(context));
        jSONObject.put("properties", c(date, str));
        jSONObject.put("tags", d(list));
        jSONObject.put("libraryInfo", b(libraryInfo));
        return jSONObject;
    }

    private static final JSONObject b(t3.b bVar) {
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", bVar.c());
        jSONObject.put("versionName", bVar.d());
        jSONObject.put("buildUuid", bVar.a());
        jSONObject.put("environment", bVar.b());
        return jSONObject;
    }

    private static final JSONObject c(Date date, String str) {
        JSONObject jSONObject = new JSONObject();
        if (date != null) {
            jSONObject.put("date", h3.a.a(date));
        }
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
        jSONObject.put(b9.h.f15441G, Build.DEVICE);
        jSONObject.put(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        jSONObject.put("osVersionSdkInt", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("osVersionRelease", Build.VERSION.RELEASE);
        if (str != null) {
            jSONObject.put("issueKey", str);
        }
        return jSONObject;
    }

    private static final JSONArray d(List list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }
}
