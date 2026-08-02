package i0;

import B.m;
import P.O;
import a.AbstractC0132a;
import java.util.Map;
import org.json.JSONObject;
import v0.i;

/* loaded from: classes.dex */
public final class b extends AbstractC0132a {

    /* renamed from: j, reason: collision with root package name */
    public final m f2490j;

    /* renamed from: k, reason: collision with root package name */
    public final O f2491k;

    public b(O o2, i iVar) {
        super(25);
        this.f2491k = o2;
        this.f2490j = new m(22, iVar);
    }

    @Override // a.AbstractC0132a
    public final Object s(String str) {
        return this.f2491k.i(str);
    }

    @Override // a.AbstractC0132a
    public final String t() {
        return (String) this.f2491k.f875f;
    }

    @Override // a.AbstractC0132a
    public final c v() {
        return this.f2490j;
    }

    @Override // a.AbstractC0132a
    public final boolean w() {
        Object obj = this.f2491k.f876g;
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
