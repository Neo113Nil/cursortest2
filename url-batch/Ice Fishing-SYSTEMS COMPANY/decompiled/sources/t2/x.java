package t2;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class x implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f40940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f40941b;

    public x(z zVar, String str) {
        Objects.requireNonNull(zVar);
        this.f40941b = zVar;
        this.f40940a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        z zVar = this.f40941b;
        synchronized (zVar) {
            try {
                Iterator it = zVar.f40944b.iterator();
                while (it.hasNext()) {
                    y yVar = (y) it.next();
                    String str2 = this.f40940a;
                    HashMap hashMap = yVar.f40942a;
                    if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                        p2.j.f39798C.f39808h.g().u(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
