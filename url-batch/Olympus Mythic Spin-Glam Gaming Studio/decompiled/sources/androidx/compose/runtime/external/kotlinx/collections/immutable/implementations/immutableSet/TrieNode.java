package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrieNode.kt */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0001\u0018\u0000 p*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001pB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J5\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J=\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010&JG\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102J-\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u0010\u0014J%\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<J)\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010<J)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\bB\u0010@J3\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010GJ/\u0010H\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010IJ/\u0010J\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010IJ\u000f\u0010K\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u001d\u0010M\u001a\u00020\r2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010PJ%\u0010S\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bS\u0010TJ=\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bU\u0010VJ9\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bW\u0010XJ9\u0010Y\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bY\u0010XJ#\u0010Z\u001a\u00020\r2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bZ\u0010[J+\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b\\\u0010]J7\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\b^\u0010_J+\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b`\u0010]J7\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\ba\u0010_R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010b\u001a\u0004\bc\u0010L\"\u0004\bd\u0010eR*\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006q"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "", "bitmap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "positionMask", "", "hasNoCellAt", "(I)Z", "index", "elementAtIndex", "(I)Ljava/lang/Object;", "nodeAtIndex", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "element", "addElementAt", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "owner", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "nodeIndex", "newNode", "updateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableUpdateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "elementIndex", "newElementHash", "newElement", "shift", "makeNodeAtIndex", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableMoveElementToNode", "elementHash1", "element1", "elementHash2", "element2", "makeNode", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "cellIndex", "removeCellAtIndex", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRemoveCellAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "i", "collisionRemoveElementAtIndex", "mutableCollisionRemoveElementAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "(Ljava/lang/Object;)Z", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionRemove", "mutableCollisionRemove", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "mutableCollisionAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Ljava/lang/Object;", "mutableCollisionRemoveAll", "calculateSize", "()I", "elementsIdentityEquals", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "indexOfCellAt$runtime", "(I)I", "indexOfCellAt", "elementHash", "contains", "(ILjava/lang/Object;I)Z", "mutableAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "mutableRemoveAll", "containsAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", m.l, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "remove", "mutableRemove", "I", "getBitmap", "setBitmap", "(I)V", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public TrieNode(int i, Object[] objArr) {
        this(i, objArr, null);
    }

    private final boolean hasNoCellAt(int positionMask) {
        return (positionMask & this.bitmap) == 0;
    }

    public final int indexOfCellAt$runtime(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    private final Object elementAtIndex(int index) {
        return this.buffer[index];
    }

    private final TrieNode nodeAtIndex(int index) {
        Object obj = this.buffer[index];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode addElementAt(int positionMask, Object element) {
        Object[] addElementAtIndex;
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime(positionMask), element);
        return new TrieNode(positionMask | this.bitmap, addElementAtIndex);
    }

    private final TrieNode mutableAddElementAt(int positionMask, Object element, MutabilityOwnership owner) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        int indexOfCellAt$runtime = indexOfCellAt$runtime(positionMask);
        if (this.ownedBy == owner) {
            addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime, element);
            this.buffer = addElementAtIndex2;
            this.bitmap = positionMask | this.bitmap;
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime, element);
        return new TrieNode(positionMask | this.bitmap, addElementAtIndex, owner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode updateNodeAtIndex(int nodeIndex, TrieNode newNode) {
        ?? r0 = newNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = r02;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[nodeIndex] = newNode;
        return new TrieNode(this.bitmap, copyOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode mutableUpdateNodeAtIndex(int nodeIndex, TrieNode newNode, MutabilityOwnership owner) {
        ?? r0 = newNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = r02;
            }
        }
        if (this.ownedBy == owner) {
            this.buffer[nodeIndex] = newNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[nodeIndex] = newNode;
        return new TrieNode(this.bitmap, copyOf, owner);
    }

    private final TrieNode makeNodeAtIndex(int elementIndex, int newElementHash, Object newElement, int shift, MutabilityOwnership owner) {
        Object elementAtIndex = elementAtIndex(elementIndex);
        return makeNode(elementAtIndex != null ? elementAtIndex.hashCode() : 0, elementAtIndex, newElementHash, newElement, shift + 5, owner);
    }

    private final TrieNode moveElementToNode(int elementIndex, int newElementHash, Object newElement, int shift) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, null);
        return new TrieNode(this.bitmap, copyOf);
    }

    private final TrieNode mutableMoveElementToNode(int elementIndex, int newElementHash, Object newElement, int shift, MutabilityOwnership owner) {
        if (this.ownedBy == owner) {
            this.buffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, owner);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, owner);
        return new TrieNode(this.bitmap, copyOf, owner);
    }

    private final TrieNode makeNode(int elementHash1, Object element1, int elementHash2, Object element2, int shift, MutabilityOwnership owner) {
        Object[] objArr;
        if (shift > 30) {
            return new TrieNode(0, new Object[]{element1, element2}, owner);
        }
        int indexSegment = TrieNodeKt.indexSegment(elementHash1, shift);
        int indexSegment2 = TrieNodeKt.indexSegment(elementHash2, shift);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new Object[]{element1, element2};
            } else {
                objArr = new Object[]{element2, element1};
            }
            return new TrieNode((1 << indexSegment) | (1 << indexSegment2), objArr, owner);
        }
        return new TrieNode(1 << indexSegment, new Object[]{makeNode(elementHash1, element1, elementHash2, element2, shift + 5, owner)}, owner);
    }

    private final TrieNode removeCellAtIndex(int cellIndex, int positionMask) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
        return new TrieNode(positionMask ^ this.bitmap, removeCellAtIndex);
    }

    private final TrieNode mutableRemoveCellAtIndex(int cellIndex, int positionMask, MutabilityOwnership owner) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy == owner) {
            removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
            this.buffer = removeCellAtIndex2;
            this.bitmap ^= positionMask;
            return this;
        }
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
        return new TrieNode(positionMask ^ this.bitmap, removeCellAtIndex, owner);
    }

    private final TrieNode collisionRemoveElementAtIndex(int i) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode(0, removeCellAtIndex);
    }

    private final TrieNode mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership owner) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy == owner) {
            removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i);
            this.buffer = removeCellAtIndex2;
            return this;
        }
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode(0, removeCellAtIndex, owner);
    }

    private final boolean collisionContainsElement(Object element) {
        return ArraysKt.contains(this.buffer, element);
    }

    private final TrieNode collisionAdd(Object element) {
        Object[] addElementAtIndex;
        if (collisionContainsElement(element)) {
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
        return new TrieNode(0, addElementAtIndex);
    }

    private final TrieNode mutableCollisionAdd(Object element, PersistentHashSetBuilder mutator) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        if (collisionContainsElement(element)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        if (this.ownedBy == mutator.getOwnership()) {
            addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
            this.buffer = addElementAtIndex2;
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
        return new TrieNode(0, addElementAtIndex, mutator.getOwnership());
    }

    private final TrieNode collisionRemove(Object element) {
        int indexOf = ArraysKt.indexOf(this.buffer, element);
        return indexOf != -1 ? collisionRemoveElementAtIndex(indexOf) : this;
    }

    private final TrieNode mutableCollisionRemove(Object element, PersistentHashSetBuilder mutator) {
        int indexOf = ArraysKt.indexOf(this.buffer, element);
        if (indexOf == -1) {
            return this;
        }
        mutator.setSize(mutator.size() - 1);
        return mutableCollisionRemoveElementAtIndex(indexOf, mutator.getOwnership());
    }

    private final TrieNode mutableCollisionAddAll(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        Object[] objArr2 = otherNode.buffer;
        int length = this.buffer.length;
        int i = 0;
        int i2 = 0;
        while (i < objArr2.length) {
            CommonFunctionsKt.m1202assert(i2 <= i);
            if (!collisionContainsElement(objArr2[i])) {
                copyOf[length + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m1202assert(length + i2 <= copyOf.length);
            }
            i++;
        }
        int length2 = i2 + this.buffer.length;
        intersectionSizeRef.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        }
        if (Intrinsics.areEqual(this.ownedBy, owner)) {
            this.buffer = copyOf;
            return this;
        }
        return new TrieNode(0, copyOf, owner);
    }

    private final Object mutableCollisionRetainAll(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m1202assert(i2 <= i);
            if (otherNode.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m1202assert(i2 <= objArr.length);
            }
            i++;
        }
        intersectionSizeRef.plusAssign(i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, owner);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return new TrieNode(0, copyOf, owner);
    }

    private final Object mutableCollisionRemoveAll(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m1202assert(i2 <= i);
            if (!otherNode.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m1202assert(i2 <= objArr.length);
            }
            i++;
        }
        intersectionSizeRef.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, owner);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return new TrieNode(0, copyOf, owner);
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i = 0;
        for (Object obj : this.buffer) {
            i += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return i;
    }

    private final boolean elementsIdentityEquals(TrieNode otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.bitmap != otherNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(int elementHash, Object element, int shift) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
            if (shift == 30) {
                return nodeAtIndex.collisionContainsElement(element);
            }
            return nodeAtIndex.contains(elementHash, element, shift + 5);
        }
        return Intrinsics.areEqual(element, obj);
    }

    public final TrieNode mutableAddAll(TrieNode otherNode, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder mutator) {
        Object[] objArr;
        int i;
        Object makeNode;
        TrieNode mutableAdd;
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i2 = this.bitmap;
        int i3 = otherNode.bitmap | i2;
        TrieNode trieNode = (i3 == i2 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) ? this : new TrieNode(i3, new Object[Integer.bitCount(i3)], mutator.getOwnership());
        int i4 = i3;
        int i5 = 0;
        while (i4 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i4);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            Object[] objArr2 = trieNode.buffer;
            if (hasNoCellAt(lowestOneBit)) {
                makeNode = otherNode.buffer[indexOfCellAt$runtime2];
            } else if (otherNode.hasNoCellAt(lowestOneBit)) {
                makeNode = this.buffer[indexOfCellAt$runtime];
            } else {
                Object obj = this.buffer[indexOfCellAt$runtime];
                Object obj2 = otherNode.buffer[indexOfCellAt$runtime2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    makeNode = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
                } else {
                    if (z) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        TrieNode trieNode2 = (TrieNode) obj;
                        int size = mutator.size();
                        mutableAdd = trieNode2.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                        if (mutator.size() == size) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        }
                        Unit unit = Unit.INSTANCE;
                    } else if (z2) {
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        TrieNode trieNode3 = (TrieNode) obj2;
                        int size2 = mutator.size();
                        mutableAdd = trieNode3.mutableAdd(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                        if (mutator.size() == size2) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } else if (Intrinsics.areEqual(obj, obj2)) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        Unit unit3 = Unit.INSTANCE;
                        makeNode = obj;
                    } else {
                        objArr = objArr2;
                        i = lowestOneBit;
                        makeNode = makeNode(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator.getOwnership());
                        objArr[i5] = makeNode;
                        i5++;
                        i4 ^= i;
                    }
                    makeNode = mutableAdd;
                }
            }
            objArr = objArr2;
            i = lowestOneBit;
            objArr[i5] = makeNode;
            i5++;
            i4 ^= i;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    public final Object mutableRetainAll(TrieNode otherNode, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder mutator) {
        TrieNode trieNode;
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i = this.bitmap & otherNode.bitmap;
        if (i == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode2 = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && i == this.bitmap) ? this : new TrieNode<>(i, new Object[Integer.bitCount(i)], mutator.getOwnership());
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i2 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i2);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime];
            Object obj2 = otherNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj instanceof TrieNode;
            boolean z2 = obj2 instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
            } else if (z) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj).contains(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
            } else if (Intrinsics.areEqual(obj, obj2)) {
                intersectionSizeRef.plusAssign(1);
            } else {
                obj = EMPTY;
            }
            if (obj != EMPTY) {
                i3 |= lowestOneBit;
            }
            trieNode2.buffer[i4] = obj;
            i4++;
            i2 ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == i) {
            return trieNode2.elementsIdentityEquals(this) ? this : trieNode2.elementsIdentityEquals(otherNode) ? otherNode : trieNode2;
        }
        if (bitCount == 1 && shift != 0) {
            Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime(i3)];
            if (!(obj3 instanceof TrieNode)) {
                return obj3;
            }
            trieNode = new TrieNode(i3, new Object[]{obj3}, mutator.getOwnership());
        } else {
            Object[] objArr = new Object[bitCount];
            Object[] objArr2 = trieNode2.buffer;
            int i5 = 0;
            int i6 = 0;
            while (i5 < objArr2.length) {
                CommonFunctionsKt.m1202assert(i6 <= i5);
                if (objArr2[i5] != INSTANCE.getEMPTY$runtime()) {
                    objArr[i6] = objArr2[i5];
                    i6++;
                    CommonFunctionsKt.m1202assert(i6 <= bitCount);
                }
                i5++;
            }
            trieNode = new TrieNode(i3, objArr, mutator.getOwnership());
        }
        return trieNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mutableRemoveAll(TrieNode otherNode, int shift, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder mutator) {
        TrieNode<E> trieNode;
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return EMPTY;
        }
        if (shift > 30) {
            return mutableCollisionRemoveAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i = this.bitmap & otherNode.bitmap;
        if (i == 0) {
            return this;
        }
        if (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) {
            trieNode = this;
        } else {
            int i2 = this.bitmap;
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            trieNode = new TrieNode<>(i2, copyOf, mutator.getOwnership());
        }
        int i3 = this.bitmap;
        while (i != 0) {
            int lowestOneBit = Integer.lowestOneBit(i);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime];
            Object obj2 = otherNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj instanceof TrieNode;
            boolean z2 = obj2 instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                obj = ((TrieNode) obj).mutableRemoveAll((TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
            } else if (z) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                TrieNode trieNode2 = (TrieNode) obj;
                int size = mutator.size();
                TrieNode mutableRemove = trieNode2.mutableRemove(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                if (size != mutator.size()) {
                    intersectionSizeRef.plusAssign(1);
                    Object[] objArr2 = mutableRemove.buffer;
                    if (objArr2.length == 1) {
                        obj = objArr2[0];
                    }
                    obj = mutableRemove;
                }
            } else if (z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    obj = EMPTY;
                }
            } else if (Intrinsics.areEqual(obj, obj2)) {
                intersectionSizeRef.plusAssign(1);
                obj = EMPTY;
            }
            if (obj == EMPTY) {
                i3 ^= lowestOneBit;
            }
            trieNode.buffer[indexOfCellAt$runtime] = obj;
            i ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == this.bitmap) {
            return trieNode.elementsIdentityEquals(this) ? this : trieNode;
        }
        if (bitCount == 1 && shift != 0) {
            Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$runtime(i3)];
            return obj3 instanceof TrieNode ? new TrieNode(i3, new Object[]{obj3}, mutator.getOwnership()) : obj3;
        }
        Object[] objArr3 = new Object[bitCount];
        Object[] objArr4 = trieNode.buffer;
        int i4 = 0;
        int i5 = 0;
        while (i4 < objArr4.length) {
            CommonFunctionsKt.m1202assert(i5 <= i4);
            if (objArr4[i4] != INSTANCE.getEMPTY$runtime()) {
                objArr3[i5] = objArr4[i4];
                i5++;
                CommonFunctionsKt.m1202assert(i5 <= bitCount);
            }
            i4++;
        }
        return new TrieNode(i3, objArr3, mutator.getOwnership());
    }

    public final boolean containsAll(TrieNode otherNode, int shift) {
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (Object obj : otherNode.buffer) {
                if (!ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i = this.bitmap;
        int i2 = otherNode.bitmap;
        int i3 = i & i2;
        if (i3 != i2) {
            return false;
        }
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime];
            Object obj3 = otherNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, shift + 5)) {
                    return false;
                }
            } else if (z) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i3 ^= lowestOneBit;
        }
        return true;
    }

    public final TrieNode add(int elementHash, Object element, int shift) {
        TrieNode add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, element);
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(element, obj) ? this : moveElementToNode(indexOfCellAt$runtime, elementHash, element, shift);
        }
        TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
        if (shift == 30) {
            add = nodeAtIndex.collisionAdd(element);
        } else {
            add = nodeAtIndex.add(elementHash, element, shift + 5);
        }
        return nodeAtIndex == add ? this : updateNodeAtIndex(indexOfCellAt$runtime, add);
    }

    public final TrieNode mutableAdd(int elementHash, Object element, int shift, PersistentHashSetBuilder mutator) {
        TrieNode mutableAdd;
        int indexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableAddElementAt(indexSegment, element, mutator.getOwnership());
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
            if (shift == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(element, mutator);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(elementHash, element, shift + 5, mutator);
            }
            return nodeAtIndex == mutableAdd ? this : mutableUpdateNodeAtIndex(indexOfCellAt$runtime, mutableAdd, mutator.getOwnership());
        }
        if (Intrinsics.areEqual(element, obj)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        return mutableMoveElementToNode(indexOfCellAt$runtime, elementHash, element, shift, mutator.getOwnership());
    }

    public final TrieNode remove(int elementHash, Object element, int shift) {
        TrieNode remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(element, obj) ? removeCellAtIndex(indexOfCellAt$runtime, indexSegment) : this;
        }
        TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
        if (shift == 30) {
            remove = nodeAtIndex.collisionRemove(element);
        } else {
            remove = nodeAtIndex.remove(elementHash, element, shift + 5);
        }
        return nodeAtIndex == remove ? this : updateNodeAtIndex(indexOfCellAt$runtime, remove);
    }

    public final TrieNode mutableRemove(int elementHash, Object element, int shift, PersistentHashSetBuilder mutator) {
        TrieNode mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
            if (shift == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(element, mutator);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(elementHash, element, shift + 5, mutator);
            }
            return (this.ownedBy == mutator.getOwnership() || nodeAtIndex != mutableRemove) ? mutableUpdateNodeAtIndex(indexOfCellAt$runtime, mutableRemove, mutator.getOwnership()) : this;
        }
        if (!Intrinsics.areEqual(element, obj)) {
            return this;
        }
        mutator.setSize(mutator.size() - 1);
        return mutableRemoveCellAtIndex(indexOfCellAt$runtime, indexSegment, mutator.getOwnership());
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }
    }
}
