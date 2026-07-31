package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: _UCollections.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"toUByteArray", "Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "(Ljava/util/Collection;)[S", "sum", "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes3.dex */
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] m4057constructorimpl = UByteArray.m4057constructorimpl(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UByteArray.m4068setVurrAj0(m4057constructorimpl, i, it.next().getData());
            i++;
        }
        return m4057constructorimpl;
    }

    public static final int[] toUIntArray(Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] m4136constructorimpl = UIntArray.m4136constructorimpl(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UIntArray.m4147setVXSXFK8(m4136constructorimpl, i, it.next().getData());
            i++;
        }
        return m4136constructorimpl;
    }

    public static final long[] toULongArray(Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] m4215constructorimpl = ULongArray.m4215constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            ULongArray.m4226setk8EXiF4(m4215constructorimpl, i, it.next().getData());
            i++;
        }
        return m4215constructorimpl;
    }

    public static final short[] toUShortArray(Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] m4320constructorimpl = UShortArray.m4320constructorimpl(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UShortArray.m4331set01HTLdE(m4320constructorimpl, i, it.next().getData());
            i++;
        }
        return m4320constructorimpl;
    }

    public static final int sumOfUInt(Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UInt> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = UInt.m4082constructorimpl(i + it.next().getData());
        }
        return i;
    }

    public static final long sumOfULong(Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<ULong> it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = ULong.m4161constructorimpl(j + it.next().getData());
        }
        return j;
    }

    public static final int sumOfUByte(Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UByte> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = UInt.m4082constructorimpl(i + UInt.m4082constructorimpl(it.next().getData() & UByte.MAX_VALUE));
        }
        return i;
    }

    public static final int sumOfUShort(Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UShort> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = UInt.m4082constructorimpl(i + UInt.m4082constructorimpl(it.next().getData() & UShort.MAX_VALUE));
        }
        return i;
    }
}
