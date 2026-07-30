package kotlin.io;

import d4.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes.dex */
public final class FileWalkDirection {

    /* renamed from: d, reason: collision with root package name */
    public static final FileWalkDirection f6147d;

    /* renamed from: e, reason: collision with root package name */
    public static final FileWalkDirection f6148e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f6149i;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        f6147d = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        f6148e = fileWalkDirection2;
        FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, fileWalkDirection2};
        f6149i = fileWalkDirectionArr;
        c.o(fileWalkDirectionArr);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f6149i.clone();
    }
}
