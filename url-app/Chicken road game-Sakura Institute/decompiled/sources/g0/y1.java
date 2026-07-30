package g0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y1 implements Iterable, s6.a {

    /* renamed from: g, reason: collision with root package name */
    public int f3975g;

    /* renamed from: i, reason: collision with root package name */
    public int f3977i;

    /* renamed from: j, reason: collision with root package name */
    public int f3978j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3979k;

    /* renamed from: l, reason: collision with root package name */
    public int f3980l;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f3982n;

    /* renamed from: o, reason: collision with root package name */
    public i.p f3983o;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3974f = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public Object[] f3976h = new Object[0];

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3981m = new ArrayList();

    public final int a(c cVar) {
        if (this.f3979k) {
            d.w("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (cVar.a()) {
            return cVar.f3695a;
        }
        d.R("Anchor refers to a group that was removed");
        throw null;
    }

    public final void g() {
        this.f3982n = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k0(this, 0, this.f3975g);
    }

    public final x1 m() {
        if (this.f3979k) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f3978j++;
        return new x1(this);
    }

    public final a2 w() {
        if (this.f3979k) {
            d.w("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f3978j > 0) {
            d.w("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f3979k = true;
        this.f3980l++;
        return new a2(this);
    }
}
