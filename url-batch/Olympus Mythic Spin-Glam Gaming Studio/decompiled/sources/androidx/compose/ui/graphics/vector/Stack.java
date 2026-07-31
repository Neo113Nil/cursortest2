package androidx.compose.ui.graphics.vector;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageVector.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B$\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/vector/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "size", "", "getSize-impl", "(Ljava/util/ArrayList;)I", "equals", "", "other", "equals-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "peek", "peek-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "pop-impl", Constants.PUSH, "value", "push-impl", "toString", "", "toString-impl", "(Ljava/util/ArrayList;)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Stack<T> {
    private final ArrayList backing;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static ArrayList m1732constructorimpl(ArrayList backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        return backing;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1734equalsimpl(ArrayList arrayList, Object obj) {
        return (obj instanceof Stack) && Intrinsics.areEqual(arrayList, ((Stack) obj).getBacking());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1736hashCodeimpl(ArrayList arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1740toStringimpl(ArrayList arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m1734equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m1736hashCodeimpl(this.backing);
    }

    public String toString() {
        return m1740toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ ArrayList getBacking() {
        return this.backing;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m1733constructorimpl$default(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m1732constructorimpl(arrayList);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1735getSizeimpl(ArrayList arrayList) {
        return arrayList.size();
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m1739pushimpl(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final Object m1738popimpl(ArrayList arrayList) {
        return arrayList.remove(m1735getSizeimpl(arrayList) - 1);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final Object m1737peekimpl(ArrayList arrayList) {
        return arrayList.get(m1735getSizeimpl(arrayList) - 1);
    }
}
