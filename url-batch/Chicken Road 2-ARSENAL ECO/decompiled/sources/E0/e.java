package E0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import u0.C0682l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C0682l f595a;

    /* renamed from: b, reason: collision with root package name */
    public final d f596b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f597c;

    public e(Context context, d dVar) {
        C0682l c0682l = new C0682l(context, 2);
        this.f597c = new HashMap();
        this.f595a = c0682l;
        this.f596b = dVar;
    }

    public final synchronized f a(String str) {
        if (this.f597c.containsKey(str)) {
            return (f) this.f597c.get(str);
        }
        CctBackendFactory i7 = this.f595a.i(str);
        if (i7 == null) {
            return null;
        }
        d dVar = this.f596b;
        f create = i7.create(new b(dVar.f592a, dVar.f593b, dVar.f594c, str));
        this.f597c.put(str, create);
        return create;
    }
}
