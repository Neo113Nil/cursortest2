package w0;

import android.content.Context;
import com.unity.purchasing.BuildConfig;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import u0.C3455b;
import u0.f;
import v0.InterfaceC3463c;

/* loaded from: classes.dex */
public class c implements u0.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f46571a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46572b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46573c;

    /* renamed from: d, reason: collision with root package name */
    private final C3455b f46574d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3463c f46575e;

    /* renamed from: f, reason: collision with root package name */
    private final f f46576f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f46577g;

    /* renamed from: h, reason: collision with root package name */
    private final List f46578h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f46579i = new HashMap();

    public c(Context context, String str, C3455b c3455b, InputStream inputStream, Map map, List list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f46572b = context;
        str = str == null ? context.getPackageName() : str;
        this.f46573c = str;
        if (inputStream != null) {
            this.f46575e = new j(inputStream, str);
            b.a(inputStream);
        } else {
            this.f46575e = new n(context, str);
        }
        this.f46576f = new f(this.f46575e);
        C3455b c3455b2 = C3455b.f46375b;
        if (c3455b != c3455b2 && BuildConfig.VERSION_NAME.equals(this.f46575e.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f46574d = (c3455b == null || c3455b == c3455b2) ? b.f(this.f46575e.getString("/region", null), this.f46575e.getString("/agcgw/url", null)) : c3455b;
        this.f46577g = b.d(map);
        this.f46578h = list;
        this.f46571a = str2 == null ? e() : str2;
    }

    private String c(String str) {
        Map a4 = u0.f.a();
        if (!a4.containsKey(str)) {
            return null;
        }
        if (this.f46579i.containsKey(str)) {
            return (String) this.f46579i.get(str);
        }
        f.a aVar = (f.a) a4.get(str);
        if (aVar == null) {
            return null;
        }
        String a5 = aVar.a(this);
        this.f46579i.put(str, a5);
        return a5;
    }

    private String e() {
        return String.valueOf(("{packageName='" + this.f46573c + "', routePolicy=" + this.f46574d + ", reader=" + this.f46575e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.f46577g).toString().hashCode() + '}').hashCode());
    }

    @Override // u0.d
    public String a(String str) {
        return f(str, null);
    }

    @Override // u0.d
    public C3455b b() {
        C3455b c3455b = this.f46574d;
        return c3455b == null ? C3455b.f46375b : c3455b;
    }

    public List d() {
        return this.f46578h;
    }

    public String f(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String e4 = b.e(str);
        String str3 = (String) this.f46577g.get(e4);
        if (str3 != null) {
            return str3;
        }
        String c4 = c(e4);
        if (c4 != null) {
            return c4;
        }
        String string = this.f46575e.getString(e4, str2);
        return f.c(string) ? this.f46576f.a(string, str2) : string;
    }

    @Override // u0.d
    public Context getContext() {
        return this.f46572b;
    }

    @Override // u0.d
    public String getIdentifier() {
        return this.f46571a;
    }
}
