package d4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC0627f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363a extends AbstractC0627f implements RandomAccess, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4650e;

    public C0363a(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f4650e = new ArrayList(list);
    }

    @Override // kotlin.collections.AbstractC0622a
    public final int a() {
        return this.f4650e.size();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f4650e.get(i2);
    }

    @Override // kotlin.collections.AbstractC0622a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f4650e.toArray(new Object[0]);
    }
}
