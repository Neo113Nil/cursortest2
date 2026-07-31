package A3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.i;
import l5.AbstractC0500d;

/* loaded from: classes.dex */
public final class a extends AbstractC0500d implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f47f;

    public a(List list) {
        i.e(list, "list");
        this.f47f = new ArrayList(list);
    }

    @Override // l5.AbstractC0497a
    public final int a() {
        return this.f47f.size();
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f47f.get(i7);
    }

    @Override // l5.AbstractC0497a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f47f.toArray(new Object[0]);
    }
}
