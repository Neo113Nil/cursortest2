package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObjectList.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0015\"\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"", "", "index", "", "checkIndex", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "checkSubIndex", "(Ljava/util/List;II)V", "E", "Landroidx/collection/ObjectList;", "emptyObjectList", "()Landroidx/collection/ObjectList;", "element1", "objectListOf", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "mutableObjectListOf", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "", "", "EmptyArray", "[Ljava/lang/Object;", "EmptyObjectList", "Landroidx/collection/ObjectList;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ObjectListKt {
    private static final Object[] EmptyArray = new Object[0];
    private static final ObjectList EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            RuntimeHelpersKt.throwIllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 > size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final ObjectList emptyObjectList() {
        ObjectList objectList = EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final ObjectList objectListOf(Object obj) {
        return mutableObjectListOf(obj);
    }

    public static final MutableObjectList mutableObjectListOf(Object obj) {
        MutableObjectList mutableObjectList = new MutableObjectList(1);
        mutableObjectList.add(obj);
        return mutableObjectList;
    }

    public static final MutableObjectList mutableObjectListOf(Object obj, Object obj2) {
        MutableObjectList mutableObjectList = new MutableObjectList(2);
        mutableObjectList.add(obj);
        mutableObjectList.add(obj2);
        return mutableObjectList;
    }
}
