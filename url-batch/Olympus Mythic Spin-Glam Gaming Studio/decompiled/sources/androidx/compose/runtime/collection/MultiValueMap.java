package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import com.safedk.android.analytics.brandsafety.m;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: MultiValueMap.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b#\u0010$J)\u0010*\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00110&¢\u0006\u0004\b(\u0010)J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u00065"}, d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "", "K", "V", "Landroidx/collection/MutableScatterMap;", "map", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "value", "", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", m.l, "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "Landroidx/collection/ObjectList;", "get-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "get", "isEmpty-impl", "(Landroidx/collection/MutableScatterMap;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "removeLast-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;", "removeLast", "removeFirst-impl", "removeFirst", "values-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/ObjectList;", "values", "Lkotlin/Function1;", "condition", "removeValueIf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "removeValueIf", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/collection/MutableScatterMap;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiValueMap<K, V> {
    private final MutableScatterMap map;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m1172boximpl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableScatterMap m1174constructorimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1177equalsimpl(MutableScatterMap mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && Intrinsics.areEqual(mutableScatterMap, ((MultiValueMap) obj).getMap());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1179hashCodeimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1185toStringimpl(MutableScatterMap mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object other) {
        return m1177equalsimpl(this.map, other);
    }

    public int hashCode() {
        return m1179hashCodeimpl(this.map);
    }

    public String toString() {
        return m1185toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m1175constructorimpl$default(MutableScatterMap mutableScatterMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, i2, null);
        }
        return m1174constructorimpl(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m1173clearimpl(MutableScatterMap mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m1176containsimpl(MutableScatterMap mutableScatterMap, Object obj) {
        return mutableScatterMap.contains(obj);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final ObjectList m1178getimpl(MutableScatterMap mutableScatterMap, Object obj) {
        Object obj2 = mutableScatterMap.get(obj);
        if (obj2 == null) {
            return ObjectListKt.emptyObjectList();
        }
        return obj2 instanceof MutableObjectList ? (ObjectList) obj2 : ObjectListKt.objectListOf(obj2);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1180isEmptyimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1181isNotEmptyimpl(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final Object m1183removeLastimpl(MutableScatterMap mutableScatterMap, Object obj) {
        Object obj2 = mutableScatterMap.get(obj);
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) obj2;
            Object removeLast = ExtensionsKt.removeLast(mutableObjectList);
            Intrinsics.checkNotNull(removeLast, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(obj);
            }
            if (mutableObjectList.get_size() == 1) {
                mutableScatterMap.set(obj, mutableObjectList.first());
            }
            return removeLast;
        }
        mutableScatterMap.remove(obj);
        return obj2;
    }

    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final Object m1182removeFirstimpl(MutableScatterMap mutableScatterMap, Object obj) {
        Object obj2 = mutableScatterMap.get(obj);
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) obj2;
            Object removeAt = mutableObjectList.removeAt(0);
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(obj);
            }
            if (mutableObjectList.get_size() == 1) {
                mutableScatterMap.set(obj, mutableObjectList.first());
            }
            return removeAt;
        }
        mutableScatterMap.remove(obj);
        return obj2;
    }

    /* renamed from: values-impl, reason: not valid java name */
    public static final ObjectList m1186valuesimpl(MutableScatterMap mutableScatterMap) {
        if (mutableScatterMap.isEmpty()) {
            return ObjectListKt.emptyObjectList();
        }
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object[] objArr = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof MutableObjectList) {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                mutableObjectList.addAll((MutableObjectList) obj);
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                mutableObjectList.add(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return mutableObjectList;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m1184removeValueIfimpl(MutableScatterMap mutableScatterMap, Object obj, Function1 function1) {
        Object obj2 = mutableScatterMap.get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableObjectList) {
                MutableObjectList mutableObjectList = (MutableObjectList) obj2;
                int i = mutableObjectList._size;
                Object[] objArr = mutableObjectList.content;
                int i2 = 0;
                IntRange until = RangesKt.until(0, i);
                int first = until.getFirst();
                int last = until.getLast();
                if (first <= last) {
                    while (true) {
                        objArr[first - i2] = objArr[first];
                        if (((Boolean) function1.invoke(objArr[first])).booleanValue()) {
                            i2++;
                        }
                        if (first == last) {
                            break;
                        } else {
                            first++;
                        }
                    }
                }
                ArraysKt.fill(objArr, (Object) null, i - i2, i);
                mutableObjectList._size -= i2;
                if (mutableObjectList.isEmpty()) {
                    mutableScatterMap.remove(obj);
                }
                if (mutableObjectList.get_size() == 0) {
                    mutableScatterMap.set(obj, mutableObjectList.first());
                    return;
                }
                return;
            }
            if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                mutableScatterMap.remove(obj);
            }
        }
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m1171addimpl(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int findInsertIndex = mutableScatterMap.findInsertIndex(obj);
        boolean z = findInsertIndex < 0;
        Object obj3 = z ? null : mutableScatterMap.values[findInsertIndex];
        TypeIntrinsics.isMutableList(obj3);
        if (obj3 != null) {
            if (obj3 instanceof MutableObjectList) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                MutableObjectList mutableObjectList = (MutableObjectList) obj3;
                mutableObjectList.add(obj2);
                obj2 = mutableObjectList;
            } else {
                obj2 = ObjectListKt.mutableObjectListOf(obj3, obj2);
            }
        }
        if (z) {
            int i = ~findInsertIndex;
            mutableScatterMap.keys[i] = obj;
            mutableScatterMap.values[i] = obj2;
            return;
        }
        mutableScatterMap.values[findInsertIndex] = obj2;
    }
}
