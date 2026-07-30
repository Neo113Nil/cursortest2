package t4;

import kotlin.jvm.internal.s;
import kotlin.reflect.q;

/* loaded from: classes3.dex */
public final class k {
    private final q value;

    private /* synthetic */ k(q qVar) {
        this.value = qVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k m1542boximpl(q qVar) {
        return new k(qVar);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static q m1543constructorimpl(q value) {
        s.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1544equalsimpl(q qVar, Object obj) {
        return (obj instanceof k) && s.areEqual(qVar, ((k) obj).m1548unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1545equalsimpl0(q qVar, q qVar2) {
        return s.areEqual(qVar, qVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1546hashCodeimpl(q qVar) {
        return qVar.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1547toStringimpl(q qVar) {
        return "RequestKType(value=" + qVar + ')';
    }

    public boolean equals(Object obj) {
        return m1544equalsimpl(this.value, obj);
    }

    public final q getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1546hashCodeimpl(this.value);
    }

    public String toString() {
        return m1547toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ q m1548unboximpl() {
        return this.value;
    }
}
