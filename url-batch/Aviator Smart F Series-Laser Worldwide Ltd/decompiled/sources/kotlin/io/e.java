package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e {
    private final File root;
    private final List<File> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public e(File root, List<? extends File> segments) {
        s.checkNotNullParameter(root, "root");
        s.checkNotNullParameter(segments, "segments");
        this.root = root;
        this.segments = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e copy$default(e eVar, File file, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            file = eVar.root;
        }
        if ((i8 & 2) != 0) {
            list = eVar.segments;
        }
        return eVar.copy(file, list);
    }

    public final File component1() {
        return this.root;
    }

    public final List<File> component2() {
        return this.segments;
    }

    public final e copy(File root, List<? extends File> segments) {
        s.checkNotNullParameter(root, "root");
        s.checkNotNullParameter(segments, "segments");
        return new e(root, segments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.areEqual(this.root, eVar.root) && s.areEqual(this.segments, eVar.segments);
    }

    public final File getRoot() {
        return this.root;
    }

    public final String getRootName() {
        String path = this.root.getPath();
        s.checkNotNullExpressionValue(path, "root.path");
        return path;
    }

    public final List<File> getSegments() {
        return this.segments;
    }

    public final int getSize() {
        return this.segments.size();
    }

    public int hashCode() {
        return (this.root.hashCode() * 31) + this.segments.hashCode();
    }

    public final boolean isRooted() {
        String path = this.root.getPath();
        s.checkNotNullExpressionValue(path, "root.path");
        return path.length() > 0;
    }

    public final File subPath(int i8, int i9) {
        String joinToString$default;
        if (i8 < 0 || i8 > i9 || i9 > getSize()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.segments.subList(i8, i9);
        String separator = File.separator;
        s.checkNotNullExpressionValue(separator, "separator");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(subList, separator, null, null, 0, null, null, 62, null);
        return new File(joinToString$default);
    }

    public String toString() {
        return "FilePathComponents(root=" + this.root + ", segments=" + this.segments + ')';
    }
}
