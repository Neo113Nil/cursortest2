package r3;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p3.a;
import p3.f;

/* loaded from: classes.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final d F;
    private final Set<Scope> G;
    private final Account H;

    @Deprecated
    protected g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i7, @RecentlyNonNull d dVar, @RecentlyNonNull f.a aVar, @RecentlyNonNull f.b bVar) {
        this(context, looper, i7, dVar, (q3.d) aVar, (q3.j) bVar);
    }

    protected g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i7, @RecentlyNonNull d dVar, @RecentlyNonNull q3.d dVar2, @RecentlyNonNull q3.j jVar) {
        this(context, looper, h.b(context), o3.e.l(), i7, dVar, (q3.d) o.i(dVar2), (q3.j) o.i(jVar));
    }

    protected g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull h hVar, @RecentlyNonNull o3.e eVar, int i7, @RecentlyNonNull d dVar, q3.d dVar2, q3.j jVar) {
        super(context, looper, hVar, eVar, i7, dVar2 == null ? null : new b0(dVar2), jVar == null ? null : new c0(jVar), dVar.f());
        this.F = dVar;
        this.H = dVar.a();
        this.G = j0(dVar.c());
    }

    private final Set<Scope> j0(Set<Scope> set) {
        Set<Scope> i02 = i0(set);
        Iterator<Scope> it = i02.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return i02;
    }

    @Override // r3.c
    @RecentlyNonNull
    protected final Set<Scope> B() {
        return this.G;
    }

    @Override // p3.a.f
    public Set<Scope> b() {
        return o() ? this.G : Collections.emptySet();
    }

    protected Set<Scope> i0(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    @Override // r3.c
    @RecentlyNullable
    public final Account u() {
        return this.H;
    }
}
