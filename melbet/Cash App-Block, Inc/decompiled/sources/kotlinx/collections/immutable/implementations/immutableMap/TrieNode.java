package kotlinx.collections.immutable.implementations.immutableMap;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.EndOfChain;
import papa.AppUpdateData;

/* loaded from: classes3.dex */
public final class TrieNode {
    public static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0], null);
    public Object[] buffer;
    public int dataMap;
    public int nodeMap;
    public final EndOfChain ownedBy;

    public TrieNode(int i, int i2, Object[] objArr, EndOfChain endOfChain) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = endOfChain;
        this.buffer = objArr;
    }

    public static TrieNode makeNode(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, EndOfChain endOfChain) {
        if (i3 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, endOfChain);
        }
        int indexSegment = AppUpdateData.indexSegment(i, i3);
        int indexSegment2 = AppUpdateData.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, endOfChain);
        }
        return new TrieNode(0, 1 << indexSegment, new Object[]{makeNode(i, obj, obj2, i2, obj3, obj4, i3 + 5, endOfChain)}, endOfChain);
    }

    public final Object[] bufferMoveEntryToNode(int i, int i2, int i3, Object obj, Object obj2, int i4, EndOfChain endOfChain) {
        Object obj3 = this.buffer[i];
        TrieNode makeNode = makeNode(obj3 != null ? obj3.hashCode() : 0, obj3, valueAtKeyIndex(i), i3, obj, obj2, i4 + 5, endOfChain);
        int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(i2);
        int i5 = nodeIndex$kotlinx_collections_immutable + 1;
        Object[] objArr = this.buffer;
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 2, i5, objArr, objArr2);
        objArr2[nodeIndex$kotlinx_collections_immutable - 1] = makeNode;
        ArraysKt___ArraysJvmKt.copyInto(nodeIndex$kotlinx_collections_immutable, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$kotlinx_collections_immutable(i).calculateSize();
        }
        return bitCount;
    }

    public final int collisionKeyIndex(Object obj) {
        IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, this.buffer.length));
        int i = step.first;
        int i2 = step.last;
        int i3 = step.step;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!Intrinsics.areEqual(obj, this.buffer[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean containsKey(int i, int i2, Object obj) {
        int indexSegment = 1 << AppUpdateData.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            return Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$kotlinx_collections_immutable(indexSegment)]);
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(indexSegment));
        return i2 == 30 ? nodeAtIndex$kotlinx_collections_immutable.collisionKeyIndex(obj) != -1 : nodeAtIndex$kotlinx_collections_immutable.containsKey(i, i2 + 5, obj);
    }

    public final boolean elementsIdentityEquals(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap == trieNode.nodeMap && this.dataMap == trieNode.dataMap) {
            int length = this.buffer.length;
            for (int i = 0; i < length; i++) {
                if (this.buffer[i] == trieNode.buffer[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int entryKeyIndex$kotlinx_collections_immutable(int i) {
        return Integer.bitCount(this.dataMap & (i - 1)) * 2;
    }

    public final boolean equalsWith$kotlinx_collections_immutable(TrieNode trieNode, Function2 function2) {
        int i;
        trieNode.getClass();
        function2.getClass();
        if (this == trieNode) {
            return true;
        }
        int i2 = this.dataMap;
        if (i2 == trieNode.dataMap && (i = this.nodeMap) == trieNode.nodeMap) {
            if (i2 != 0 || i != 0) {
                int bitCount = Integer.bitCount(i2) * 2;
                IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, bitCount));
                int i3 = step.first;
                int i4 = step.last;
                int i5 = step.step;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (Intrinsics.areEqual(this.buffer[i3], trieNode.buffer[i3]) && ((Boolean) function2.invoke(valueAtKeyIndex(i3), trieNode.valueAtKeyIndex(i3))).booleanValue()) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                }
                int length = this.buffer.length;
                while (bitCount < length) {
                    if (nodeAtIndex$kotlinx_collections_immutable(bitCount).equalsWith$kotlinx_collections_immutable(trieNode.nodeAtIndex$kotlinx_collections_immutable(bitCount), function2)) {
                        bitCount++;
                    }
                }
                return true;
            }
            Object[] objArr = this.buffer;
            if (objArr.length == trieNode.buffer.length) {
                Iterable step2 = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, objArr.length));
                if ((step2 instanceof Collection) && ((Collection) step2).isEmpty()) {
                    return true;
                }
                IntProgressionIterator it = step2.iterator();
                while (it.hasNext) {
                    int nextInt = it.nextInt();
                    Object obj = trieNode.buffer[nextInt];
                    Object valueAtKeyIndex = trieNode.valueAtKeyIndex(nextInt);
                    int collisionKeyIndex = collisionKeyIndex(obj);
                    if (!(collisionKeyIndex != -1 ? ((Boolean) function2.invoke(valueAtKeyIndex(collisionKeyIndex), valueAtKeyIndex)).booleanValue() : false)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object get(int i, int i2, Object obj) {
        int indexSegment = 1 << AppUpdateData.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            if (Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$kotlinx_collections_immutable])) {
                return valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable);
            }
            return null;
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(indexSegment));
        if (i2 != 30) {
            return nodeAtIndex$kotlinx_collections_immutable.get(i, i2 + 5, obj);
        }
        int collisionKeyIndex = nodeAtIndex$kotlinx_collections_immutable.collisionKeyIndex(obj);
        if (collisionKeyIndex != -1) {
            return nodeAtIndex$kotlinx_collections_immutable.valueAtKeyIndex(collisionKeyIndex);
        }
        return null;
    }

    public final boolean hasEntryAt$kotlinx_collections_immutable(int i) {
        return (this.dataMap & i) != 0;
    }

    public final boolean hasNodeAt(int i) {
        return (this.nodeMap & i) != 0;
    }

    public final TrieNode mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size - 1);
        persistentHashMapBuilder.operationResult = valueAtKeyIndex(i);
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.ownership) {
            return new TrieNode(0, 0, AppUpdateData.access$removeEntryAtIndex(i, objArr), persistentHashMapBuilder.ownership);
        }
        this.buffer = AppUpdateData.access$removeEntryAtIndex(i, objArr);
        return this;
    }

    public final TrieNode mutablePut(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode mutablePut;
        int indexSegment = 1 << AppUpdateData.indexSegment(i, i2);
        boolean hasEntryAt$kotlinx_collections_immutable = hasEntryAt$kotlinx_collections_immutable(indexSegment);
        EndOfChain endOfChain = this.ownedBy;
        if (hasEntryAt$kotlinx_collections_immutable) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            if (!Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$kotlinx_collections_immutable])) {
                persistentHashMapBuilder.setSize(persistentHashMapBuilder.size + 1);
                EndOfChain endOfChain2 = persistentHashMapBuilder.ownership;
                if (endOfChain != endOfChain2) {
                    return new TrieNode(this.dataMap ^ indexSegment, this.nodeMap | indexSegment, bufferMoveEntryToNode(entryKeyIndex$kotlinx_collections_immutable, indexSegment, i, obj, obj2, i2, endOfChain2), endOfChain2);
                }
                this.buffer = bufferMoveEntryToNode(entryKeyIndex$kotlinx_collections_immutable, indexSegment, i, obj, obj2, i2, endOfChain2);
                this.dataMap ^= indexSegment;
                this.nodeMap |= indexSegment;
                return this;
            }
            persistentHashMapBuilder.operationResult = valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable);
            if (valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable) != obj2) {
                if (endOfChain == persistentHashMapBuilder.ownership) {
                    this.buffer[entryKeyIndex$kotlinx_collections_immutable + 1] = obj2;
                    return this;
                }
                persistentHashMapBuilder.modCount++;
                Object[] objArr = this.buffer;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[entryKeyIndex$kotlinx_collections_immutable + 1] = obj2;
                return new TrieNode(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.ownership);
            }
        } else {
            if (!hasNodeAt(indexSegment)) {
                persistentHashMapBuilder.setSize(persistentHashMapBuilder.size + 1);
                EndOfChain endOfChain3 = persistentHashMapBuilder.ownership;
                int entryKeyIndex$kotlinx_collections_immutable2 = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
                Object[] objArr2 = this.buffer;
                if (endOfChain != endOfChain3) {
                    return new TrieNode(this.dataMap | indexSegment, this.nodeMap, AppUpdateData.access$insertEntryAtIndex(objArr2, entryKeyIndex$kotlinx_collections_immutable2, obj, obj2), endOfChain3);
                }
                this.buffer = AppUpdateData.access$insertEntryAtIndex(objArr2, entryKeyIndex$kotlinx_collections_immutable2, obj, obj2);
                this.dataMap |= indexSegment;
                return this;
            }
            int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
            TrieNode nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
            if (i2 == 30) {
                int collisionKeyIndex = nodeAtIndex$kotlinx_collections_immutable.collisionKeyIndex(obj);
                if (collisionKeyIndex != -1) {
                    persistentHashMapBuilder.operationResult = nodeAtIndex$kotlinx_collections_immutable.valueAtKeyIndex(collisionKeyIndex);
                    if (nodeAtIndex$kotlinx_collections_immutable.ownedBy == persistentHashMapBuilder.ownership) {
                        nodeAtIndex$kotlinx_collections_immutable.buffer[collisionKeyIndex + 1] = obj2;
                        mutablePut = nodeAtIndex$kotlinx_collections_immutable;
                    } else {
                        persistentHashMapBuilder.modCount++;
                        Object[] objArr3 = nodeAtIndex$kotlinx_collections_immutable.buffer;
                        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        copyOf2[collisionKeyIndex + 1] = obj2;
                        mutablePut = new TrieNode(0, 0, copyOf2, persistentHashMapBuilder.ownership);
                    }
                } else {
                    persistentHashMapBuilder.setSize(persistentHashMapBuilder.size + 1);
                    mutablePut = new TrieNode(0, 0, AppUpdateData.access$insertEntryAtIndex(nodeAtIndex$kotlinx_collections_immutable.buffer, 0, obj, obj2), persistentHashMapBuilder.ownership);
                }
            } else {
                mutablePut = nodeAtIndex$kotlinx_collections_immutable.mutablePut(i, obj, obj2, i2 + 5, persistentHashMapBuilder);
            }
            if (nodeAtIndex$kotlinx_collections_immutable != mutablePut) {
                return updateNodeAtIndex(nodeIndex$kotlinx_collections_immutable, indexSegment, mutablePut, persistentHashMapBuilder.ownership);
            }
        }
        return this;
    }

    public final TrieNode mutablePutAll(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] objArr;
        TrieNode makeNode;
        trieNode.getClass();
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            EndOfChain endOfChain = persistentHashMapBuilder.ownership;
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + trieNode.buffer.length);
            int length = this.buffer.length;
            IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, trieNode.buffer.length));
            int i3 = step.first;
            int i4 = step.last;
            int i5 = step.step;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (collisionKeyIndex(trieNode.buffer[i3]) != -1) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    } else {
                        Object[] objArr3 = trieNode.buffer;
                        copyOf[length] = objArr3[i3];
                        copyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.buffer.length) {
                if (length != trieNode.buffer.length) {
                    return length == copyOf.length ? new TrieNode(0, 0, copyOf, endOfChain) : new TrieNode(0, 0, Arrays.copyOf(copyOf, length), endOfChain);
                }
            }
            return this;
        }
        int i6 = this.nodeMap | trieNode.nodeMap;
        int i7 = this.dataMap;
        int i8 = trieNode.dataMap;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i10);
            if (Intrinsics.areEqual(this.buffer[entryKeyIndex$kotlinx_collections_immutable(lowestOneBit)], trieNode.buffer[trieNode.entryKeyIndex$kotlinx_collections_immutable(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i6 |= lowestOneBit;
            }
            i10 ^= lowestOneBit;
        }
        if ((i6 & i11) != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        TrieNode trieNode2 = (Intrinsics.areEqual(this.ownedBy, persistentHashMapBuilder.ownership) && this.dataMap == i11 && this.nodeMap == i6) ? this : new TrieNode(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = trieNode2.buffer;
            int length2 = (objArr4.length - 1) - i13;
            if (hasNodeAt(lowestOneBit2)) {
                makeNode = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable(lowestOneBit2));
                if (trieNode.hasNodeAt(lowestOneBit2)) {
                    makeNode = makeNode.mutablePutAll(trieNode.nodeAtIndex$kotlinx_collections_immutable(trieNode.nodeIndex$kotlinx_collections_immutable(lowestOneBit2)), i + 5, deltaCounter, persistentHashMapBuilder);
                    objArr = objArr4;
                } else if (trieNode.hasEntryAt$kotlinx_collections_immutable(lowestOneBit2)) {
                    int entryKeyIndex$kotlinx_collections_immutable = trieNode.entryKeyIndex$kotlinx_collections_immutable(lowestOneBit2);
                    Object obj = trieNode.buffer[entryKeyIndex$kotlinx_collections_immutable];
                    Object valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable);
                    int i14 = persistentHashMapBuilder.size;
                    objArr = objArr4;
                    makeNode = makeNode.mutablePut(obj != null ? obj.hashCode() : i2, obj, valueAtKeyIndex, i + 5, persistentHashMapBuilder);
                    if (persistentHashMapBuilder.size == i14) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (trieNode.hasNodeAt(lowestOneBit2)) {
                    TrieNode nodeAtIndex$kotlinx_collections_immutable = trieNode.nodeAtIndex$kotlinx_collections_immutable(trieNode.nodeIndex$kotlinx_collections_immutable(lowestOneBit2));
                    if (hasEntryAt$kotlinx_collections_immutable(lowestOneBit2)) {
                        int entryKeyIndex$kotlinx_collections_immutable2 = entryKeyIndex$kotlinx_collections_immutable(lowestOneBit2);
                        Object obj2 = this.buffer[entryKeyIndex$kotlinx_collections_immutable2];
                        int i15 = i + 5;
                        if (nodeAtIndex$kotlinx_collections_immutable.containsKey(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        } else {
                            makeNode = nodeAtIndex$kotlinx_collections_immutable.mutablePut(obj2 != null ? obj2.hashCode() : 0, obj2, valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable2), i15, persistentHashMapBuilder);
                        }
                    }
                    makeNode = nodeAtIndex$kotlinx_collections_immutable;
                } else {
                    int entryKeyIndex$kotlinx_collections_immutable3 = entryKeyIndex$kotlinx_collections_immutable(lowestOneBit2);
                    Object obj3 = this.buffer[entryKeyIndex$kotlinx_collections_immutable3];
                    Object valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable3);
                    int entryKeyIndex$kotlinx_collections_immutable4 = trieNode.entryKeyIndex$kotlinx_collections_immutable(lowestOneBit2);
                    Object obj4 = trieNode.buffer[entryKeyIndex$kotlinx_collections_immutable4];
                    makeNode = makeNode(obj3 != null ? obj3.hashCode() : 0, obj3, valueAtKeyIndex2, obj4 != null ? obj4.hashCode() : 0, obj4, trieNode.valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable4), i + 5, persistentHashMapBuilder.ownership);
                }
            }
            objArr[length2] = makeNode;
            i13++;
            i12 ^= lowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (trieNode.hasEntryAt$kotlinx_collections_immutable(lowestOneBit3)) {
                int entryKeyIndex$kotlinx_collections_immutable5 = trieNode.entryKeyIndex$kotlinx_collections_immutable(lowestOneBit3);
                Object[] objArr5 = trieNode2.buffer;
                objArr5[i17] = trieNode.buffer[entryKeyIndex$kotlinx_collections_immutable5];
                objArr5[i17 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable5);
                if (hasEntryAt$kotlinx_collections_immutable(lowestOneBit3)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
            } else {
                int entryKeyIndex$kotlinx_collections_immutable6 = entryKeyIndex$kotlinx_collections_immutable(lowestOneBit3);
                Object[] objArr6 = trieNode2.buffer;
                objArr6[i17] = this.buffer[entryKeyIndex$kotlinx_collections_immutable6];
                objArr6[i17 + 1] = valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable6);
            }
            i16++;
            i11 ^= lowestOneBit3;
        }
        if (!elementsIdentityEquals(trieNode2)) {
            return trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
        }
        return this;
    }

    public final TrieNode mutableRemove(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        PersistentHashMapBuilder persistentHashMapBuilder2;
        int indexSegment = 1 << AppUpdateData.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            return (Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$kotlinx_collections_immutable]) && Intrinsics.areEqual(obj2, valueAtKeyIndex(entryKeyIndex$kotlinx_collections_immutable))) ? mutableRemoveEntryAtIndex(entryKeyIndex$kotlinx_collections_immutable, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
        TrieNode nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
        if (i2 == 30) {
            int collisionKeyIndex = nodeAtIndex$kotlinx_collections_immutable.collisionKeyIndex(obj);
            if (collisionKeyIndex != -1 && Intrinsics.areEqual(obj2, nodeAtIndex$kotlinx_collections_immutable.valueAtKeyIndex(collisionKeyIndex))) {
                nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable.mutableCollisionRemoveEntryAtIndex(collisionKeyIndex, persistentHashMapBuilder);
            }
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable.mutableRemove(i, obj, obj2, i2 + 5, persistentHashMapBuilder2);
        }
        return mutableReplaceNode(nodeIndex$kotlinx_collections_immutable, indexSegment, nodeAtIndex$kotlinx_collections_immutable, persistentHashMapBuilder2.ownership);
    }

    public final TrieNode mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size - 1);
        persistentHashMapBuilder.operationResult = valueAtKeyIndex(i);
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.ownership) {
            return new TrieNode(i2 ^ this.dataMap, this.nodeMap, AppUpdateData.access$removeEntryAtIndex(i, objArr), persistentHashMapBuilder.ownership);
        }
        this.buffer = AppUpdateData.access$removeEntryAtIndex(i, objArr);
        this.dataMap ^= i2;
        return this;
    }

    public final TrieNode mutableReplaceNode(int i, int i2, TrieNode trieNode, EndOfChain endOfChain) {
        if (trieNode != null) {
            return updateNodeAtIndex(i, i2, trieNode, endOfChain);
        }
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != endOfChain) {
            Object[] objArr2 = new Object[objArr.length - 1];
            ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
            ArraysKt___ArraysJvmKt.copyInto(i, i + 1, objArr.length, objArr, objArr2);
            return new TrieNode(this.dataMap, this.nodeMap ^ i2, objArr2, endOfChain);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr3);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 1, objArr.length, objArr, objArr3);
        this.buffer = objArr3;
        this.nodeMap ^= i2;
        return this;
    }

    public final TrieNode nodeAtIndex$kotlinx_collections_immutable(int i) {
        Object obj = this.buffer[i];
        obj.getClass();
        return (TrieNode) obj;
    }

    public final int nodeIndex$kotlinx_collections_immutable(int i) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (i - 1));
    }

    public final TrieNode updateNodeAtIndex(int i, int i2, TrieNode trieNode, EndOfChain endOfChain) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            if (endOfChain != null && this.ownedBy == endOfChain) {
                this.buffer[i] = trieNode;
                return this;
            }
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = trieNode;
            return new TrieNode(this.dataMap, this.nodeMap, copyOf, endOfChain);
        }
        if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(i2);
        Object[] objArr3 = this.buffer;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        ArraysKt___ArraysJvmKt.copyInto(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        ArraysKt___ArraysJvmKt.copyInto(entryKeyIndex$kotlinx_collections_immutable + 2, entryKeyIndex$kotlinx_collections_immutable, i, copyOf2, copyOf2);
        copyOf2[entryKeyIndex$kotlinx_collections_immutable] = obj;
        copyOf2[entryKeyIndex$kotlinx_collections_immutable + 1] = obj2;
        return new TrieNode(this.dataMap ^ i2, this.nodeMap ^ i2, copyOf2, endOfChain);
    }

    public final Object valueAtKeyIndex(int i) {
        return this.buffer[i + 1];
    }

    public final TrieNode mutableRemove(int i, Object obj, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        int indexSegment = 1 << AppUpdateData.indexSegment(i, i2);
        if (hasEntryAt$kotlinx_collections_immutable(indexSegment)) {
            int entryKeyIndex$kotlinx_collections_immutable = entryKeyIndex$kotlinx_collections_immutable(indexSegment);
            return Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$kotlinx_collections_immutable]) ? mutableRemoveEntryAtIndex(entryKeyIndex$kotlinx_collections_immutable, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$kotlinx_collections_immutable = nodeIndex$kotlinx_collections_immutable(indexSegment);
        TrieNode nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable(nodeIndex$kotlinx_collections_immutable);
        if (i2 == 30) {
            int collisionKeyIndex = nodeAtIndex$kotlinx_collections_immutable.collisionKeyIndex(obj);
            if (collisionKeyIndex != -1) {
                nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable.mutableCollisionRemoveEntryAtIndex(collisionKeyIndex, persistentHashMapBuilder);
            }
        } else {
            nodeAtIndex$kotlinx_collections_immutable = nodeAtIndex$kotlinx_collections_immutable.mutableRemove(i, obj, i2 + 5, persistentHashMapBuilder);
        }
        return mutableReplaceNode(nodeIndex$kotlinx_collections_immutable, indexSegment, nodeAtIndex$kotlinx_collections_immutable, persistentHashMapBuilder.ownership);
    }
}
