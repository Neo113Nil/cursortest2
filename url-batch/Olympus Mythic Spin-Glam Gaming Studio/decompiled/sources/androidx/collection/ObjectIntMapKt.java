package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObjectIntMap.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"K", "Landroidx/collection/ObjectIntMap;", "emptyObjectIntMap", "()Landroidx/collection/ObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "", "EmptyObjectIntMap", "Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ObjectIntMapKt {
    private static final MutableObjectIntMap EmptyObjectIntMap = new MutableObjectIntMap(0);

    public static final ObjectIntMap emptyObjectIntMap() {
        MutableObjectIntMap mutableObjectIntMap = EmptyObjectIntMap;
        Intrinsics.checkNotNull(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }
}
