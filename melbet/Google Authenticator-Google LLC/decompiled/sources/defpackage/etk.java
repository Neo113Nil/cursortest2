package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etk {
    private static final Map a = new qi();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        synchronized (etk.class) {
            Map map = a;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                etk etkVar = (etk) it.next();
                SharedPreferences sharedPreferences = etkVar.b;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = etkVar.c;
                throw null;
            }
            map.clear();
        }
    }
}
