package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import com.safedk.android.analytics.brandsafety.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScopeMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006."}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "Landroidx/collection/MutableScatterMap;", "map", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "scope", "", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", m.l, "value", "set-impl", "set", "element", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "remove-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "removeScope-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V", "removeScope", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "getSize-impl", "(Landroidx/collection/MutableScatterMap;)I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScopeMap<Key, Scope> {
    private final MutableScatterMap map;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableScatterMap m1190constructorimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1193equalsimpl(MutableScatterMap mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && Intrinsics.areEqual(mutableScatterMap, ((ScopeMap) obj).getMap());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1195hashCodeimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1199toStringimpl(MutableScatterMap mutableScatterMap) {
        return "ScopeMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object other) {
        return m1193equalsimpl(this.map, other);
    }

    public int hashCode() {
        return m1195hashCodeimpl(this.map);
    }

    public String toString() {
        return m1199toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m1191constructorimpl$default(MutableScatterMap mutableScatterMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
        }
        return m1190constructorimpl(mutableScatterMap);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1194getSizeimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.get_size();
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1198setimpl(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        mutableScatterMap.set(obj, obj2);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m1192containsimpl(MutableScatterMap mutableScatterMap, Object obj) {
        return mutableScatterMap.containsKey(obj);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m1189clearimpl(MutableScatterMap mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m1196removeimpl(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        Object obj3 = mutableScatterMap.get(obj);
        if (obj3 == null) {
            return false;
        }
        if (obj3 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
            boolean remove = mutableScatterSet.remove(obj2);
            if (remove && mutableScatterSet.isEmpty()) {
                mutableScatterMap.remove(obj);
            }
            return remove;
        }
        if (!Intrinsics.areEqual(obj3, obj2)) {
            return false;
        }
        mutableScatterMap.remove(obj);
        return true;
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m1197removeScopeimpl(MutableScatterMap mutableScatterMap, Object obj) {
        boolean z;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = mutableScatterMap.keys[i4];
                        Object obj3 = mutableScatterMap.values[i4];
                        if (obj3 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                            mutableScatterSet.remove(obj);
                            z = mutableScatterSet.isEmpty();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            mutableScatterMap.removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m1188addimpl(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int findInsertIndex = mutableScatterMap.findInsertIndex(obj);
        int i = 0;
        int i2 = 1;
        boolean z = findInsertIndex < 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj3 = z ? null : mutableScatterMap.values[findInsertIndex];
        if (obj3 != null) {
            if (obj3 instanceof MutableScatterSet) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((MutableScatterSet) obj3).add(obj2);
            } else if (obj3 != obj2) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet(i, i2, defaultConstructorMarker);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                mutableScatterSet.add(obj3);
                mutableScatterSet.add(obj2);
                obj2 = mutableScatterSet;
            }
            obj2 = obj3;
        }
        if (z) {
            int i3 = ~findInsertIndex;
            mutableScatterMap.keys[i3] = obj;
            mutableScatterMap.values[i3] = obj2;
            return;
        }
        mutableScatterMap.values[findInsertIndex] = obj2;
    }
}
