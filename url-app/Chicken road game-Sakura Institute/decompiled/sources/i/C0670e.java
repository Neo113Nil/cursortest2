package i;

import androidx.datastore.preferences.protobuf.h0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670e extends G implements Map {

    /* renamed from: j, reason: collision with root package name */
    public h0 f6913j;

    /* renamed from: k, reason: collision with root package name */
    public C0667b f6914k;

    /* renamed from: l, reason: collision with root package name */
    public C0669d f6915l;

    @Override // java.util.Map
    public final Set entrySet() {
        h0 h0Var = this.f6913j;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this, 1);
        this.f6913j = h0Var2;
        return h0Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0667b c0667b = this.f6914k;
        if (c0667b != null) {
            return c0667b;
        }
        C0667b c0667b2 = new C0667b(this);
        this.f6914k = c0667b2;
        return c0667b2;
    }

    public final boolean l(Collection collection) {
        int i2 = this.f6895i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.f6895i;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f6895i;
        int i2 = this.f6895i;
        int[] iArr = this.f6893d;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f6893d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6894e, size * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f6894e = copyOf2;
        }
        if (this.f6895i != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0669d c0669d = this.f6915l;
        if (c0669d != null) {
            return c0669d;
        }
        C0669d c0669d2 = new C0669d(this);
        this.f6915l = c0669d2;
        return c0669d2;
    }
}
