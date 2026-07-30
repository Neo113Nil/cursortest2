package y;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f17331a = new ConcurrentHashMap();

    public static String a(Object obj) {
        return a(b(), obj);
    }

    public static Gson b() {
        Map map = f17331a;
        Gson gson = (Gson) map.get("delegateGson");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = (Gson) map.get("defaultGson");
        if (gson2 != null) {
            return gson2;
        }
        Gson a8 = a();
        map.put("defaultGson", a8);
        return a8;
    }

    public static Gson c() {
        Map map = f17331a;
        Gson gson = (Gson) map.get("logUtilsGson");
        if (gson != null) {
            return gson;
        }
        Gson create = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        map.put("logUtilsGson", create);
        return create;
    }

    public static String a(Gson gson, Object obj) {
        return gson.toJson(obj);
    }

    public static Object a(String str, Class cls) {
        return a(b(), str, cls);
    }

    public static Object a(Gson gson, String str, Class cls) {
        return gson.fromJson(str, cls);
    }

    public static Gson a() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }
}
