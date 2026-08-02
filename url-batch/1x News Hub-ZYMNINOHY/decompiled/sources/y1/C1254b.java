package y1;

import P1.l;
import P1.n;
import b0.r;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254b extends S0.a {

    /* renamed from: i, reason: collision with root package name */
    public final r f10828i;

    /* renamed from: j, reason: collision with root package name */
    public final l f10829j;

    public C1254b(l lVar, n nVar) {
        super(23);
        this.f10829j = lVar;
        this.f10828i = new r(nVar);
    }

    @Override // S0.a
    public final Object m(String str) {
        return this.f10829j.a(str);
    }

    @Override // S0.a
    public final String o() {
        return this.f10829j.f1266a;
    }

    @Override // S0.a
    public final InterfaceC1255c q() {
        return this.f10828i;
    }

    @Override // S0.a
    public final boolean s() {
        Object obj = this.f10829j.f1267b;
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
