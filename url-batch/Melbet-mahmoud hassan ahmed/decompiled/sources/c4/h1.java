package c4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1985a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, SharedPreferences.Editor> f1986b = new HashMap();

    public h1(Context context) {
        this.f1985a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor b(String str) {
        if (!this.f1986b.containsKey(str)) {
            this.f1986b.put(str, this.f1985a.getSharedPreferences(str, 0).edit());
        }
        return this.f1986b.get(str);
    }

    public final void c() {
        Iterator<SharedPreferences.Editor> it = this.f1986b.values().iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
    }

    public final boolean d(String str, Object obj) {
        String str2;
        float floatValue;
        e1 a7 = f1.a(this.f1985a, str);
        if (a7 == null) {
            return false;
        }
        SharedPreferences.Editor b7 = b(a7.f1954a);
        if (obj instanceof Integer) {
            b7.putInt(a7.f1955b, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            b7.putLong(a7.f1955b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            str2 = a7.f1955b;
            floatValue = ((Double) obj).floatValue();
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Boolean) {
                    b7.putBoolean(a7.f1955b, ((Boolean) obj).booleanValue());
                    return true;
                }
                if (!(obj instanceof String)) {
                    return false;
                }
                b7.putString(a7.f1955b, (String) obj);
                return true;
            }
            str2 = a7.f1955b;
            floatValue = ((Float) obj).floatValue();
        }
        b7.putFloat(str2, floatValue);
        return true;
    }
}
