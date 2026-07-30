package kotlin.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FileWalkDirection {
    public static final FileWalkDirection m;
    public static final FileWalkDirection n;
    public static final /* synthetic */ FileWalkDirection[] o;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        m = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        n = fileWalkDirection2;
        o = new FileWalkDirection[]{fileWalkDirection, fileWalkDirection2};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) o.clone();
    }
}
