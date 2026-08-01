package C;

import B.k;
import M.j;
import a.AbstractC0016a;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends AbstractC0016a {

    /* renamed from: g, reason: collision with root package name */
    public final k f94g;

    /* renamed from: h, reason: collision with root package name */
    public final A.a f95h;

    public b(A.a aVar, j jVar) {
        super(1);
        this.f95h = aVar;
        this.f94g = new k(1, jVar);
    }

    @Override // a.AbstractC0016a
    public final Object m(String str) {
        return this.f95h.m(str);
    }

    @Override // a.AbstractC0016a
    public final String o() {
        return (String) this.f95h.f3c;
    }

    @Override // a.AbstractC0016a
    public final c q() {
        return this.f94g;
    }

    @Override // a.AbstractC0016a
    public final boolean s() {
        Object obj = this.f95h.f4d;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }
}
