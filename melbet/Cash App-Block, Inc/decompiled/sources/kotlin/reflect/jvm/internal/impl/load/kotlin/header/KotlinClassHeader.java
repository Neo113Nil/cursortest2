package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

/* loaded from: classes9.dex */
public final class KotlinClassHeader {
    public final String[] data;
    public final int extraInt;
    public final String extraString;
    public final String[] incompatibleData;
    public final Kind kind;
    public final MetadataVersion metadataVersion;
    public final String[] strings;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        public static final Companion Companion = new Companion(null);
        public static final LinkedHashMap entryById;
        public final int id;

        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }
        }

        static {
            Kind[] values = values();
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i) {
            this.id = i;
        }

        public static final Kind getById(int i) {
            return Companion.getById(i);
        }
    }

    public KotlinClassHeader(Kind kind, MetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        kind.getClass();
        metadataVersion.getClass();
        this.kind = kind;
        this.metadataVersion = metadataVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
    }

    public final String[] getData() {
        return this.data;
    }

    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final MetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    public final String getMultifileClassName() {
        if (this.kind == Kind.MULTIFILE_CLASS_PART) {
            return this.extraString;
        }
        return null;
    }

    public final List<String> getMultifilePartNames() {
        List<String> list = null;
        String[] strArr = this.kind == Kind.MULTIFILE_CLASS ? this.data : null;
        if (strArr != null) {
            list = Arrays.asList(strArr);
            list.getClass();
        }
        return list == null ? EmptyList.INSTANCE : list;
    }

    public final String[] getStrings() {
        return this.strings;
    }

    public final boolean isPreRelease() {
        return (this.extraInt & 2) != 0;
    }

    public final boolean isUnstableJvmIrBinary() {
        int i = this.extraInt;
        return (i & 16) != 0 && (i & 32) == 0;
    }

    public String toString() {
        return this.kind + " version=" + this.metadataVersion;
    }
}
