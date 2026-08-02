package v2;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class V implements u2.m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f15593a;

    public V() {
        r.d(2, "expectedValuesPerKey");
        this.f15593a = 2;
    }

    @Override // u2.m
    public final Object get() {
        return new ArrayList(this.f15593a);
    }
}
