package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.collections.b implements RandomAccess {
    public static final a Companion = new a(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private final void buildTrieRecursive(long j8, c cVar, int i8, List<? extends ByteString> list, int i9, int i10, List<Integer> list2) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            c cVar2;
            int i16 = i8;
            if (!(i9 < i10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i9 < i10) {
                int i17 = i9;
                while (true) {
                    int i18 = i17 + 1;
                    if (!(list.get(i17).size() >= i16)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i18 >= i10) {
                        break;
                    } else {
                        i17 = i18;
                    }
                }
            }
            ByteString byteString = list.get(i9);
            ByteString byteString2 = list.get(i10 - 1);
            if (i16 == byteString.size()) {
                int intValue = list2.get(i9).intValue();
                int i19 = i9 + 1;
                ByteString byteString3 = list.get(i19);
                i11 = i19;
                i12 = intValue;
                byteString = byteString3;
            } else {
                i11 = i9;
                i12 = -1;
            }
            if (byteString.getByte(i16) == byteString2.getByte(i16)) {
                int min = Math.min(byteString.size(), byteString2.size());
                if (i16 < min) {
                    int i20 = i16;
                    i13 = 0;
                    while (true) {
                        int i21 = i20 + 1;
                        if (byteString.getByte(i20) != byteString2.getByte(i20)) {
                            break;
                        }
                        i13++;
                        if (i21 >= min) {
                            break;
                        } else {
                            i20 = i21;
                        }
                    }
                } else {
                    i13 = 0;
                }
                long intCount = j8 + getIntCount(cVar) + 2 + i13 + 1;
                cVar.writeInt(-i13);
                cVar.writeInt(i12);
                int i22 = i16 + i13;
                if (i16 < i22) {
                    while (true) {
                        int i23 = i16 + 1;
                        cVar.writeInt(byteString.getByte(i16) & 255);
                        if (i23 >= i22) {
                            break;
                        } else {
                            i16 = i23;
                        }
                    }
                }
                if (i11 + 1 == i10) {
                    if (!(i22 == list.get(i11).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    cVar.writeInt(list2.get(i11).intValue());
                    return;
                } else {
                    c cVar3 = new c();
                    cVar.writeInt(((int) (getIntCount(cVar3) + intCount)) * (-1));
                    buildTrieRecursive(intCount, cVar3, i22, list, i11, i10, list2);
                    cVar.writeAll(cVar3);
                    return;
                }
            }
            int i24 = i11 + 1;
            int i25 = 1;
            if (i24 < i10) {
                while (true) {
                    int i26 = i24 + 1;
                    if (list.get(i24 - 1).getByte(i16) != list.get(i24).getByte(i16)) {
                        i25++;
                    }
                    if (i26 >= i10) {
                        break;
                    } else {
                        i24 = i26;
                    }
                }
            }
            long intCount2 = j8 + getIntCount(cVar) + 2 + (i25 * 2);
            cVar.writeInt(i25);
            cVar.writeInt(i12);
            if (i11 < i10) {
                int i27 = i11;
                while (true) {
                    int i28 = i27 + 1;
                    byte b8 = list.get(i27).getByte(i16);
                    if (i27 == i11 || b8 != list.get(i27 - 1).getByte(i16)) {
                        cVar.writeInt(b8 & 255);
                    }
                    if (i28 >= i10) {
                        break;
                    } else {
                        i27 = i28;
                    }
                }
            }
            c cVar4 = new c();
            while (i11 < i10) {
                byte b9 = list.get(i11).getByte(i16);
                int i29 = i11 + 1;
                if (i29 < i10) {
                    int i30 = i29;
                    while (true) {
                        int i31 = i30 + 1;
                        if (b9 != list.get(i30).getByte(i16)) {
                            i14 = i30;
                            break;
                        } else if (i31 >= i10) {
                            break;
                        } else {
                            i30 = i31;
                        }
                    }
                }
                i14 = i10;
                if (i29 == i14 && i16 + 1 == list.get(i11).size()) {
                    cVar.writeInt(list2.get(i11).intValue());
                    i15 = i14;
                    cVar2 = cVar4;
                } else {
                    cVar.writeInt(((int) (intCount2 + getIntCount(cVar4))) * (-1));
                    i15 = i14;
                    cVar2 = cVar4;
                    buildTrieRecursive(intCount2, cVar4, i16 + 1, list, i11, i14, list2);
                }
                cVar4 = cVar2;
                i11 = i15;
            }
            cVar.writeAll(cVar4);
        }

        static /* synthetic */ void buildTrieRecursive$default(a aVar, long j8, c cVar, int i8, List list, int i9, int i10, List list2, int i11, Object obj) {
            aVar.buildTrieRecursive((i11 & 1) != 0 ? 0L : j8, cVar, (i11 & 4) != 0 ? 0 : i8, list, (i11 & 16) != 0 ? 0 : i9, (i11 & 32) != 0 ? list.size() : i10, list2);
        }

        private final long getIntCount(c cVar) {
            return cVar.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final m0 of(ByteString... byteStrings) {
            List mutableListOf;
            int binarySearch$default;
            kotlin.jvm.internal.s.checkNotNullParameter(byteStrings, "byteStrings");
            kotlin.jvm.internal.o oVar = null;
            int i8 = 0;
            if (byteStrings.length == 0) {
                return new m0(new ByteString[0], new int[]{0, -1}, oVar);
            }
            List mutableList = ArraysKt___ArraysKt.toMutableList(byteStrings);
            kotlin.collections.u.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i9], 0, 0, 6, (Object) null);
                mutableListOf.set(binarySearch$default, Integer.valueOf(i10));
                i9++;
                i10++;
            }
            if (!(((ByteString) mutableList.get(0)).size() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i11 = 0;
            while (i11 < mutableList.size()) {
                ByteString byteString2 = (ByteString) mutableList.get(i11);
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < mutableList.size()) {
                    ByteString byteString3 = (ByteString) mutableList.get(i13);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (!(byteString3.size() != byteString2.size())) {
                        throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("duplicate option: ", byteString3).toString());
                    }
                    if (((Number) mutableListOf.get(i13)).intValue() > ((Number) mutableListOf.get(i11)).intValue()) {
                        mutableList.remove(i13);
                        mutableListOf.remove(i13);
                    } else {
                        i13++;
                    }
                }
                i11 = i12;
            }
            c cVar = new c();
            buildTrieRecursive$default(this, 0L, cVar, 0, mutableList, 0, 0, mutableListOf, 53, null);
            int[] iArr = new int[(int) getIntCount(cVar)];
            while (!cVar.exhausted()) {
                iArr[i8] = cVar.readInt();
                i8++;
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new m0((ByteString[]) copyOf, iArr, oVar);
        }
    }

    public /* synthetic */ m0(ByteString[] byteStringArr, int[] iArr, kotlin.jvm.internal.o oVar) {
        this(byteStringArr, iArr);
    }

    public static final m0 of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private m0(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // kotlin.collections.b, java.util.List
    public ByteString get(int i8) {
        return this.byteStrings[i8];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
