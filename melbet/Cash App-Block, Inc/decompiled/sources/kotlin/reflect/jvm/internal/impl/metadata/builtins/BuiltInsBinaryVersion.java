package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* loaded from: classes9.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final BuiltInsBinaryVersion readFrom(InputStream inputStream) {
            inputStream.getClass();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
            Iterator it = intRange.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] intArray = CollectionsKt.toIntArray(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(intArray, intArray.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        BuiltInsBinaryVersion builtInsBinaryVersion = INSTANCE;
        builtInsBinaryVersion.getClass();
        int i = builtInsBinaryVersion.minor;
        int i2 = builtInsBinaryVersion.major;
        int i3 = this.minor;
        int i4 = this.major;
        return i4 == 0 ? i2 == 0 && i3 == i : i4 == i2 && i3 <= i;
    }
}
