package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* loaded from: classes5.dex */
public final class j {
    private final Long createdAtMillis;
    private final Map<kotlin.reflect.d, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final o0 symlinkTarget;

    public j() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public final j copy(boolean z7, boolean z8, o0 o0Var, Long l8, Long l9, Long l10, Long l11, Map<kotlin.reflect.d, ? extends Object> extras) {
        kotlin.jvm.internal.s.checkNotNullParameter(extras, "extras");
        return new j(z7, z8, o0Var, l8, l9, l10, l11, extras);
    }

    public final <T> T extra(kotlin.reflect.d type) {
        kotlin.jvm.internal.s.checkNotNullParameter(type, "type");
        Object obj = this.extras.get(type);
        if (obj == null) {
            return null;
        }
        return (T) kotlin.reflect.e.cast(type, obj);
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<kotlin.reflect.d, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final o0 getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        Long l8 = this.size;
        if (l8 != null) {
            arrayList.add(kotlin.jvm.internal.s.stringPlus("byteCount=", l8));
        }
        Long l9 = this.createdAtMillis;
        if (l9 != null) {
            arrayList.add(kotlin.jvm.internal.s.stringPlus("createdAt=", l9));
        }
        Long l10 = this.lastModifiedAtMillis;
        if (l10 != null) {
            arrayList.add(kotlin.jvm.internal.s.stringPlus("lastModifiedAt=", l10));
        }
        Long l11 = this.lastAccessedAtMillis;
        if (l11 != null) {
            arrayList.add(kotlin.jvm.internal.s.stringPlus("lastAccessedAt=", l11));
        }
        if (!this.extras.isEmpty()) {
            arrayList.add(kotlin.jvm.internal.s.stringPlus("extras=", this.extras));
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
        return joinToString$default;
    }

    public j(boolean z7, boolean z8, o0 o0Var, Long l8, Long l9, Long l10, Long l11, Map<kotlin.reflect.d, ? extends Object> extras) {
        Map<kotlin.reflect.d, Object> map;
        kotlin.jvm.internal.s.checkNotNullParameter(extras, "extras");
        this.isRegularFile = z7;
        this.isDirectory = z8;
        this.symlinkTarget = o0Var;
        this.size = l8;
        this.createdAtMillis = l9;
        this.lastModifiedAtMillis = l10;
        this.lastAccessedAtMillis = l11;
        map = kotlin.collections.m0.toMap(extras);
        this.extras = map;
    }

    public /* synthetic */ j(boolean z7, boolean z8, o0 o0Var, Long l8, Long l9, Long l10, Long l11, Map map, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? false : z7, (i8 & 2) == 0 ? z8 : false, (i8 & 4) != 0 ? null : o0Var, (i8 & 8) != 0 ? null : l8, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : l10, (i8 & 64) == 0 ? l11 : null, (i8 & 128) != 0 ? kotlin.collections.m0.emptyMap() : map);
    }
}
