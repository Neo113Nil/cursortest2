package r5;

import C1.c;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import l5.AbstractC0500d;
import l5.AbstractC0505i;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621b extends AbstractC0500d implements InterfaceC0620a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Enum[] f5861f;

    public C0621b(Enum[] entries) {
        i.e(entries, "entries");
        this.f5861f = entries;
    }

    @Override // l5.AbstractC0497a
    public final int a() {
        return this.f5861f.length;
    }

    @Override // l5.AbstractC0497a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        return ((Enum) AbstractC0505i.L(this.f5861f, element.ordinal())) == element;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f5861f;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(c.f(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    @Override // l5.AbstractC0500d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC0505i.L(this.f5861f, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // l5.AbstractC0500d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC0505i.L(this.f5861f, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }
}
