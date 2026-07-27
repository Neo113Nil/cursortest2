package kotlin.io;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes.dex */
public final class FileWalkDirection {

    /* renamed from: d, reason: collision with root package name */
    public static final FileWalkDirection f7499d;

    /* renamed from: e, reason: collision with root package name */
    public static final FileWalkDirection f7500e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f7501i;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        f7499d = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        f7500e = fileWalkDirection2;
        FileWalkDirection[] entries = {fileWalkDirection, fileWalkDirection2};
        f7501i = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f7501i.clone();
    }
}
