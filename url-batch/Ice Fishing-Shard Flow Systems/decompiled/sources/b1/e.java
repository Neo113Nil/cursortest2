package b1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final P0.e f4144a;

    /* renamed from: b, reason: collision with root package name */
    public final C0269d f4145b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4146c;

    public e(Context context, C0269d c0269d) {
        P0.e eVar = new P0.e(context);
        this.f4146c = new HashMap();
        this.f4144a = eVar;
        this.f4145b = c0269d;
    }

    public final synchronized f a(String str) {
        if (this.f4146c.containsKey(str)) {
            return (f) this.f4146c.get(str);
        }
        CctBackendFactory p7 = this.f4144a.p(str);
        if (p7 == null) {
            return null;
        }
        C0269d c0269d = this.f4145b;
        f create = p7.create(new C0267b(c0269d.f4141a, c0269d.f4142b, c0269d.f4143c, str));
        this.f4146c.put(str, create);
        return create;
    }
}
