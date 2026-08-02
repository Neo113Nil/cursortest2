package okhttp3.internal;

import android.system.Os;
import android.system.OsConstants;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.jakewharton.processphoenix.ProcessPhoenix;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList$Builder;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.descriptors.WrappedSerialDescriptor;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.internal.PrimitivesKt;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Utf8;

/* loaded from: classes3.dex */
public abstract class Tags {
    public static final PrimitiveSerialDescriptor PrimitiveSerialDescriptor(String str, PrimitiveKind$INT primitiveKind$INT) {
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
            return null;
        }
        PrimitivesKt.checkNameIsNotAPrimitive(str);
        return new PrimitiveSerialDescriptor(str, primitiveKind$INT);
    }

    public static final WrappedSerialDescriptor SerialDescriptor(String str, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
            return null;
        }
        if (!str.equals(serialDescriptor.getSerialName())) {
            if (serialDescriptor.getKind() instanceof PrimitiveKind$INT) {
                PrimitivesKt.checkNameIsNotAPrimitive(str);
            }
            return new WrappedSerialDescriptor(str, serialDescriptor);
        }
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        m3m.append(serialDescriptor.getSerialName());
        m3m.append(')');
        throw new IllegalArgumentException(m3m.toString().toString());
    }

    public static final SerialDescriptorImpl buildClassSerialDescriptor(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(str, StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.elementNames.size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static final SerialDescriptorImpl buildSerialDescriptor(String str, Utf8 utf8, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
            return null;
        }
        if (utf8.equals(StructureKind.CLASS.INSTANCE)) {
            a$$ExternalSyntheticBUOutline0.m$3("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(str, utf8, classSerialDescriptorBuilder.elementNames.size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static SerialDescriptorImpl buildSerialDescriptor$default(String str, Utf8 utf8, SerialDescriptor[] serialDescriptorArr) {
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
            return null;
        }
        if (utf8.equals(StructureKind.CLASS.INSTANCE)) {
            a$$ExternalSyntheticBUOutline0.m$3("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        return new SerialDescriptorImpl(str, utf8, classSerialDescriptorBuilder.elementNames.size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static void buildTrieRecursive(long j, Buffer buffer, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ByteString) arrayList4.get(i8)).getSize$okio() < i7) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i2);
        ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
        if (i7 == byteString.getSize$okio()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            byteString = byteString3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (byteString.internalGet$okio(i7) == byteString2.internalGet$okio(i7)) {
            int min = Math.min(byteString.getSize$okio(), byteString2.getSize$okio());
            int i10 = 0;
            for (int i11 = i7; i11 < min && byteString.internalGet$okio(i11) == byteString2.internalGet$okio(i11); i11++) {
                i10++;
            }
            long j3 = (buffer.size / 4) + j + 2 + i10 + 1;
            buffer.m4336writeInt(-i10);
            buffer.m4336writeInt(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                buffer.m4336writeInt(byteString.internalGet$okio(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ByteString) arrayList4.get(i4)).getSize$okio()) {
                    buffer.m4336writeInt(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return;
                }
            }
            Buffer buffer2 = new Buffer();
            buffer.m4336writeInt(((int) ((buffer2.size / 4) + j3)) * (-1));
            buildTrieRecursive(j3, buffer2, i12, arrayList4, i4, i3, arrayList5);
            buffer.writeAll(buffer2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ByteString) arrayList4.get(i14 - 1)).internalGet$okio(i7) != ((ByteString) arrayList4.get(i14)).internalGet$okio(i7)) {
                i13++;
            }
        }
        long j4 = (buffer.size / 4) + j + 2 + (i13 * 2);
        buffer.m4336writeInt(i13);
        buffer.m4336writeInt(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int internalGet$okio = ((ByteString) arrayList4.get(i15)).internalGet$okio(i7);
            if (i15 == i4 || internalGet$okio != ((ByteString) arrayList4.get(i15 - 1)).internalGet$okio(i7)) {
                buffer.m4336writeInt(internalGet$okio & 255);
            }
        }
        Buffer buffer3 = new Buffer();
        int i16 = i4;
        while (i16 < i3) {
            byte internalGet$okio2 = ((ByteString) arrayList4.get(i16)).internalGet$okio(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (internalGet$okio2 != ((ByteString) arrayList4.get(i18)).internalGet$okio(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((ByteString) arrayList4.get(i16)).getSize$okio()) {
                buffer.m4336writeInt(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                buffer.m4336writeInt(((int) ((buffer3.size / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                buildTrieRecursive(j2, buffer3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        buffer.writeAll(buffer3);
    }

    public static final EnumEntriesList enumEntries(Enum[] enumArr) {
        enumArr.getClass();
        return new EnumEntriesList(enumArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Options of(ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new Options(new ByteString[0], new int[]{0, -1});
        }
        ArrayList mutableList = ArraysKt___ArraysKt.toMutableList(byteStringArr);
        CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
        int size = mutableList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(-1);
        }
        int length = byteStringArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStringArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((ByteString) mutableList.get(0)).getSize$okio() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < mutableList.size()) {
            ByteString byteString = (ByteString) mutableList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < mutableList.size()) {
                ByteString byteString2 = (ByteString) mutableList.get(i6);
                byteString2.getClass();
                byteString.getClass();
                if (byteString2.rangeEquals(0, byteString.getSize$okio(), byteString)) {
                    if (byteString2.getSize$okio() == byteString.getSize$okio()) {
                        Path$$ExternalSyntheticBUOutline0.m$3(byteString2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList.get(i6)).intValue() > ((Number) arrayList.get(i4)).intValue()) {
                        mutableList.remove(i6);
                        ((Number) arrayList.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        Buffer buffer = new Buffer();
        buildTrieRecursive(0L, buffer, 0, mutableList, 0, mutableList.size(), arrayList);
        int i7 = (int) (buffer.size / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = buffer.readInt();
        }
        return new Options((ByteString[]) Arrays.copyOf(byteStringArr, byteStringArr.length), iArr);
    }

    public static final AbstractPersistentList persistentListOf(Object... objArr) {
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return smallPersistentVector.addAll((Collection) asList);
    }

    public static final PersistentMap persistentMapOf(Pair... pairArr) {
        PersistentOrderedMap persistentOrderedMap = PersistentOrderedMap.EMPTY;
        PersistentMap.Builder builder = ProcessPhoenix.emptyOf$kotlinx_collections_immutable().builder();
        MapsKt__MapsKt.putAll(builder, pairArr);
        return ((PersistentOrderedMapBuilder) builder).build();
    }

    public static long readProcessStartRealtimeMillis(int i) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "/proc/", "/stat")));
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            readLine.getClass();
            return (Long.parseLong((String) StringsKt.split$default(StringsKt.substringAfter(readLine, ") ", readLine), new char[]{' '}, 6).get(19)) * 1000) / Os.sysconf(OsConstants._SC_CLK_TCK);
        } finally {
        }
    }

    public static final ImmutableList toImmutableList(Iterable iterable) {
        iterable.getClass();
        ImmutableList immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final AbstractPersistentList toPersistentList(Iterable iterable) {
        iterable.getClass();
        AbstractPersistentList abstractPersistentList = iterable instanceof AbstractPersistentList ? (AbstractPersistentList) iterable : null;
        if (abstractPersistentList != null) {
            return abstractPersistentList;
        }
        PersistentList$Builder persistentList$Builder = iterable instanceof PersistentList$Builder ? (PersistentList$Builder) iterable : null;
        AbstractPersistentList build = persistentList$Builder != null ? ((PersistentVectorBuilder) persistentList$Builder).build() : null;
        if (build != null) {
            return build;
        }
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        smallPersistentVector.getClass();
        if (iterable instanceof Collection) {
            return smallPersistentVector.addAll((Collection) iterable);
        }
        PersistentVectorBuilder builder = smallPersistentVector.builder();
        CollectionsKt__MutableCollectionsKt.addAll(iterable, builder);
        return builder.build();
    }

    public abstract Object get(KClass kClass);

    public abstract Tags plus(KClass kClass, Object obj);
}
