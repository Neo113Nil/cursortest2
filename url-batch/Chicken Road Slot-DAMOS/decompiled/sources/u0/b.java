package u0;

import com.google.android.gms.internal.measurement.bf;
import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b extends kotlin.collections.j {

    /* renamed from: t, reason: collision with root package name */
    public static final b f9576t = new b(i.f9590e, 0);

    /* renamed from: r, reason: collision with root package name */
    public final i f9577r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9578s;

    public b(i iVar, int i3) {
        this.f9577r = iVar;
        this.f9578s = i3;
    }

    @Override // kotlin.collections.j
    public final Set a() {
        return new g(this, 0);
    }

    @Override // kotlin.collections.j
    public final Set b() {
        return new g(this, 1);
    }

    @Override // kotlin.collections.j
    public final int c() {
        return this.f9578s;
    }

    @Override // kotlin.collections.j, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f9577r.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.j
    public final Collection d() {
        return new kotlin.collections.i(2, this);
    }

    public final b f(Object obj, v0.a aVar) {
        bf u2 = this.f9577r.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u2 == null ? this : new b((i) u2.f2175e, this.f9578s + u2.f2174d);
    }

    @Override // kotlin.collections.j, java.util.Map
    public Object get(Object obj) {
        return this.f9577r.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
