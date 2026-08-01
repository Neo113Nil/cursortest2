package l3;

import a.a0;
import a.e0;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f2677a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f2678b;

    public c(a0 a0Var, e0 e0Var) {
        this.f2677a = a0Var;
        this.f2678b = e0Var;
    }

    @Override // l3.d
    public final Iterator iterator() {
        return new b(this);
    }
}
