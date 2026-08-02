package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final Companion Companion = new Companion(null);
    public static final List PREDEFINED_STRINGS;
    public final Set localNameIndices;
    public final List records;
    public final String[] strings;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62);
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{joinToString$default.concat("/Any"), joinToString$default.concat("/Nothing"), joinToString$default.concat("/Unit"), joinToString$default.concat("/Throwable"), joinToString$default.concat("/Number"), joinToString$default.concat("/Byte"), joinToString$default.concat("/Double"), joinToString$default.concat("/Float"), joinToString$default.concat("/Int"), joinToString$default.concat("/Long"), joinToString$default.concat("/Short"), joinToString$default.concat("/Boolean"), joinToString$default.concat("/Char"), joinToString$default.concat("/CharSequence"), joinToString$default.concat("/String"), joinToString$default.concat("/Comparable"), joinToString$default.concat("/Enum"), joinToString$default.concat("/Array"), joinToString$default.concat("/ByteArray"), joinToString$default.concat("/DoubleArray"), joinToString$default.concat("/FloatArray"), joinToString$default.concat("/IntArray"), joinToString$default.concat("/LongArray"), joinToString$default.concat("/ShortArray"), joinToString$default.concat("/BooleanArray"), joinToString$default.concat("/CharArray"), joinToString$default.concat("/Cloneable"), joinToString$default.concat("/Annotation"), joinToString$default.concat("/collections/Iterable"), joinToString$default.concat("/collections/MutableIterable"), joinToString$default.concat("/collections/Collection"), joinToString$default.concat("/collections/MutableCollection"), joinToString$default.concat("/collections/List"), joinToString$default.concat("/collections/MutableList"), joinToString$default.concat("/collections/Set"), joinToString$default.concat("/collections/MutableSet"), joinToString$default.concat("/collections/Map"), joinToString$default.concat("/collections/MutableMap"), joinToString$default.concat("/collections/Map.Entry"), joinToString$default.concat("/collections/MutableMap.MutableEntry"), joinToString$default.concat("/collections/Iterator"), joinToString$default.concat("/collections/MutableIterator"), joinToString$default.concat("/collections/ListIterator"), joinToString$default.concat("/collections/MutableListIterator")});
        PREDEFINED_STRINGS = listOf;
        IndexingIterable withIndex = CollectionsKt.withIndex(listOf);
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = withIndex.iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
            linkedHashMap.put((String) indexedValue.value, Integer.valueOf(indexedValue.index));
        }
    }

    public JvmNameResolverBase(String[] strArr, Set<Integer> set, List<JvmProtoBuf.StringTableTypes.Record> list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.strings = strArr;
        this.localNameIndices = set;
        this.records = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i) {
        String str;
        JvmProtoBuf.StringTableTypes.Record record = (JvmProtoBuf.StringTableTypes.Record) this.records.get(i);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List list = PREDEFINED_STRINGS;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    str = (String) list.get(record.getPredefinedIndex());
                }
            }
            str = this.strings[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            substringIndexList.getClass();
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                str = str.substring(num.intValue(), num2.intValue());
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            replaceCharList.getClass();
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            str.getClass();
            str = StringsKt__StringsJVMKt.replace(str, (char) num3.intValue(), (char) num4.intValue(), false);
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation2 = record.getOperation();
        if (operation2 == null) {
            operation2 = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[operation2.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str.getClass();
                str = StringsKt__StringsJVMKt.replace(str, '$', '.', false);
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (str.length() >= 2) {
                    str = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str);
                }
                str = StringsKt__StringsJVMKt.replace(str, '$', '.', false);
            }
        }
        str.getClass();
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }
}
