package y0;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static Map f46728c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static Map f46729d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private Map f46730a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f46731b = new HashMap();

    d(List list, Context context) {
        a(list, context);
    }

    public void a(List list, Context context) {
        Log.d("AGC_ServiceRepository", "addService start");
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Log.d("AGC_ServiceRepository", "addService end");
    }
}
