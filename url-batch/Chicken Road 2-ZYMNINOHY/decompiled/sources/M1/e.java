package M1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l2.e f1746a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1747b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1748c;

    public e(Context context, d dVar) {
        l2.e eVar = new l2.e(context, 11);
        this.f1748c = new HashMap();
        this.f1746a = eVar;
        this.f1747b = dVar;
    }

    public final synchronized f a(String str) {
        if (this.f1748c.containsKey(str)) {
            return (f) this.f1748c.get(str);
        }
        CctBackendFactory p2 = this.f1746a.p(str);
        if (p2 == null) {
            return null;
        }
        d dVar = this.f1747b;
        f create = p2.create(new b(dVar.f1743a, dVar.f1744b, dVar.f1745c, str));
        this.f1748c.put(str, create);
        return create;
    }
}
