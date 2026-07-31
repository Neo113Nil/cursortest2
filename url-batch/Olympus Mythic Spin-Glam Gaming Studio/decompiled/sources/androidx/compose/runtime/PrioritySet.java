package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import com.safedk.android.analytics.brandsafety.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "Landroidx/collection/MutableIntList;", "list", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "", "value", "", "add-impl", "(Landroidx/collection/MutableIntList;I)V", m.l, "", "isNotEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isNotEmpty", "peek-impl", "(Landroidx/collection/MutableIntList;)I", "peek", "takeMax-impl", "takeMax", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/collection/MutableIntList;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PrioritySet {
    private final MutableIntList list;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m1112constructorimpl(MutableIntList mutableIntList) {
        return mutableIntList;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1114equalsimpl(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && Intrinsics.areEqual(mutableIntList, ((PrioritySet) obj).getList());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1115hashCodeimpl(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1119toStringimpl(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    public boolean equals(Object other) {
        return m1114equalsimpl(this.list, other);
    }

    public int hashCode() {
        return m1115hashCodeimpl(this.list);
    }

    public String toString() {
        return m1119toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableIntList getList() {
        return this.list;
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m1118takeMaximpl(MutableIntList mutableIntList) {
        int i;
        int i2 = mutableIntList._size;
        int i3 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i3) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i4 = mutableIntList._size;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = mutableIntList.get(i6);
                int i8 = (i6 + 1) * 2;
                int i9 = i8 - 1;
                int i10 = mutableIntList.get(i9);
                if (i8 >= i4 || (i = mutableIntList.get(i8)) <= i10) {
                    if (i10 > i7) {
                        mutableIntList.set(i6, i10);
                        mutableIntList.set(i9, i7);
                        i6 = i9;
                    }
                } else if (i > i7) {
                    mutableIntList.set(i6, i);
                    mutableIntList.set(i8, i7);
                    i6 = i8;
                }
            }
        }
        return i3;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m1111addimpl(MutableIntList mutableIntList, int i) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i || mutableIntList.get(mutableIntList._size - 1) == i)) {
            int i2 = mutableIntList._size;
            mutableIntList.add(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int i4 = mutableIntList.get(i3);
                if (i <= i4) {
                    break;
                }
                mutableIntList.set(i2, i4);
                i2 = i3;
            }
            mutableIntList.set(i2, i);
        }
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1116isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m1113constructorimpl$default(MutableIntList mutableIntList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            mutableIntList = new MutableIntList(0, i2, null);
        }
        return m1112constructorimpl(mutableIntList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m1117peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }
}
