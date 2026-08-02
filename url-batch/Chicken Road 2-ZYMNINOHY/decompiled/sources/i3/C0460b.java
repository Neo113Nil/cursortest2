package i3;

import E.AbstractC0005f;
import d3.d;
import d3.g;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460b extends d implements InterfaceC0459a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f9324a;

    public C0460b(Enum[] entries) {
        i.e(entries, "entries");
        this.f9324a = entries;
    }

    @Override // d3.d
    public final int b() {
        return this.f9324a.length;
    }

    @Override // d3.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        return ((Enum) g.U(element.ordinal(), this.f9324a)) == element;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Enum[] enumArr = this.f9324a;
        int length = enumArr.length;
        if (i4 < 0 || i4 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, length, "index: ", ", size: "));
        }
        return enumArr[i4];
    }

    @Override // d3.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) g.U(ordinal, this.f9324a)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // d3.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) g.U(ordinal, this.f9324a)) == element) {
            return ordinal;
        }
        return -1;
    }
}
