package Q;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B implements Map.Entry, N2.d {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3799d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3800e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C f3801i;

    public B(C c4) {
        this.f3801i = c4;
        Map.Entry entry = c4.f3805j;
        Intrinsics.c(entry);
        this.f3799d = entry.getKey();
        Map.Entry entry2 = c4.f3805j;
        Intrinsics.c(entry2);
        this.f3800e = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3799d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3800e;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C c4 = this.f3801i;
        if (c4.f3802d.b().f3900d != c4.f3804i) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f3800e;
        c4.f3802d.put(this.f3799d, obj);
        this.f3800e = obj;
        return obj2;
    }
}
