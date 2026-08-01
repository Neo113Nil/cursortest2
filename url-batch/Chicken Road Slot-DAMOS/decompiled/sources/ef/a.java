package ef;

import cf.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k7.e;
import kotlin.jvm.internal.Intrinsics;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3991a = e.s();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3992b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3993c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3994d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3995e = new ArrayList();

    public final void a(b bVar) {
        af.a aVar = bVar.f2037a;
        h hVar = aVar.f369b;
        this.f3993c.put(mf.a.a(hVar) + "::" + aVar.f368a, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.a(this.f3991a, ((a) obj).f3991a);
    }

    public final int hashCode() {
        return this.f3991a.hashCode();
    }
}
