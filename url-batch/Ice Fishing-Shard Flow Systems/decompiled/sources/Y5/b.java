package Y5;

import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.AbstractC0627f;
import kotlin.collections.C0624c;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends AbstractC0627f implements a, RandomAccess, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Enum[] f2924e;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f2924e = entries;
    }

    @Override // kotlin.collections.AbstractC0622a
    public final int a() {
        return this.f2924e.length;
    }

    @Override // kotlin.collections.AbstractC0622a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) p.m(this.f2924e, element.ordinal())) == element;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        C0624c c0624c = AbstractC0627f.f6131d;
        Enum[] enumArr = this.f2924e;
        int length = enumArr.length;
        c0624c.getClass();
        C0624c.b(i2, length);
        return enumArr[i2];
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) p.m(this.f2924e, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) p.m(this.f2924e, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }
}
