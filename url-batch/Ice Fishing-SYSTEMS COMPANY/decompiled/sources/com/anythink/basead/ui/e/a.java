package com.anythink.basead.ui.e;

import android.text.TextUtils;
import com.anythink.core.basead.b.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f10914a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f10915b = new HashMap();

    private a() {
    }

    public static a a() {
        if (f10914a == null) {
            synchronized (a.class) {
                try {
                    if (f10914a == null) {
                        f10914a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10914a;
    }

    public final void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f10915b.put(str, cVar);
    }

    public final c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f10915b.remove(str);
    }
}
