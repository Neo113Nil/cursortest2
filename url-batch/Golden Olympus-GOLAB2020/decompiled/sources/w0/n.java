package w0;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import v0.InterfaceC3463c;

/* loaded from: classes.dex */
class n implements InterfaceC3463c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f46608a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final l f46609b;

    n(Context context, String str) {
        this.f46609b = new l(context, str);
    }

    @Override // v0.InterfaceC3463c
    public String getString(String str, String str2) {
        String str3 = (String) this.f46608a.get(str);
        if (str3 != null) {
            return str3;
        }
        String b4 = this.f46609b.b(str, str2);
        if (b4 == null) {
            return str2;
        }
        this.f46608a.put(str, b4);
        return b4;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
