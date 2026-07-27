package L;

import G1.y;
import java.util.Collection;
import java.util.Set;
import z2.AbstractC1423g;

/* loaded from: classes.dex */
public class c extends AbstractC1423g implements J.e {

    /* renamed from: l, reason: collision with root package name */
    public static final c f3459l = new c(m.f3483e, 0);

    /* renamed from: j, reason: collision with root package name */
    public final m f3460j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3461k;

    public c(m mVar, int i2) {
        this.f3460j = mVar;
        this.f3461k = i2;
    }

    @Override // z2.AbstractC1423g
    public final Set b() {
        return new j(this, 0);
    }

    @Override // z2.AbstractC1423g
    public final Set c() {
        return new j(this, 1);
    }

    @Override // z2.AbstractC1423g, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3460j.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // z2.AbstractC1423g
    public final int d() {
        return this.f3461k;
    }

    @Override // z2.AbstractC1423g
    public final Collection e() {
        return new l(this, 0);
    }

    @Override // J.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this);
    }

    @Override // z2.AbstractC1423g, java.util.Map
    public Object get(Object obj) {
        return this.f3460j.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final c h(Object obj, M.a aVar) {
        y u4 = this.f3460j.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        if (u4 == null) {
            return this;
        }
        return new c((m) u4.f3165b, this.f3461k + u4.f3164a);
    }
}
