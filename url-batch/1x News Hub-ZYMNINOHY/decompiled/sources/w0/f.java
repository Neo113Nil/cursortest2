package w0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import f0.C0322a;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0322a f10636a;

    /* renamed from: b, reason: collision with root package name */
    public final C1236e f10637b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10638c;

    public f(Context context, C1236e c1236e) {
        C0322a c0322a = new C0322a(context);
        this.f10638c = new HashMap();
        this.f10636a = c0322a;
        this.f10637b = c1236e;
    }

    public final synchronized g a(String str) {
        if (this.f10638c.containsKey(str)) {
            return (g) this.f10638c.get(str);
        }
        CctBackendFactory t3 = this.f10636a.t(str);
        if (t3 == null) {
            return null;
        }
        C1236e c1236e = this.f10637b;
        g create = t3.create(new C1233b(c1236e.f10633a, c1236e.f10634b, c1236e.f10635c, str));
        this.f10638c.put(str, create);
        return create;
    }
}
