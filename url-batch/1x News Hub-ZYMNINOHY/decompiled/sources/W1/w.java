package W1;

import f2.AbstractC0326c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public K f1712d;

    /* renamed from: e, reason: collision with root package name */
    public Set f1713e;
    public Map f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f1714g;

    /* renamed from: h, reason: collision with root package name */
    public N.d f1715h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1716i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K f1717j;

    /* renamed from: k, reason: collision with root package name */
    public int f1718k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(K k3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f1717j = k3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f1716i = obj;
        this.f1718k |= Integer.MIN_VALUE;
        return K.i(this.f1717j, null, this);
    }
}
