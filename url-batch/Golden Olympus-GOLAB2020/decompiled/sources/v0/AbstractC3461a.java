package v0;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3461a implements u0.d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f46431a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f46432b = new Object();

    public static AbstractC3461a c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return d(context, context.getPackageName());
    }

    public static AbstractC3461a d(Context context, String str) {
        AbstractC3461a abstractC3461a;
        synchronized (f46432b) {
            try {
                Map map = f46431a;
                abstractC3461a = (AbstractC3461a) map.get(str);
                if (abstractC3461a == null) {
                    abstractC3461a = new w0.d(context, str);
                    map.put(str, abstractC3461a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC3461a;
    }
}
