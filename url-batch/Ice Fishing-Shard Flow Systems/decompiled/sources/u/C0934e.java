package u;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934e extends C0939j implements Map {

    /* renamed from: l, reason: collision with root package name */
    public a0 f8025l;

    /* renamed from: m, reason: collision with root package name */
    public C0931b f8026m;

    /* renamed from: n, reason: collision with root package name */
    public C0933d f8027n;

    @Override // java.util.Map
    public final Set entrySet() {
        a0 a0Var = this.f8025l;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this, 1);
        this.f8025l = a0Var2;
        return a0Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i2 = this.f8045i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.f8045i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0931b c0931b = this.f8026m;
        if (c0931b != null) {
            return c0931b;
        }
        C0931b c0931b2 = new C0931b(this);
        this.f8026m = c0931b2;
        return c0931b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f8045i;
        int i2 = this.f8045i;
        int[] iArr = this.f8043d;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8043d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8044e, size * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8044e = copyOf2;
        }
        if (this.f8045i != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0933d c0933d = this.f8027n;
        if (c0933d != null) {
            return c0933d;
        }
        C0933d c0933d2 = new C0933d(this);
        this.f8027n = c0933d2;
        return c0933d2;
    }
}
