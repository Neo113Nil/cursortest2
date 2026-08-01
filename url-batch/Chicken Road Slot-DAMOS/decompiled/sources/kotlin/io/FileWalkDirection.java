package kotlin.io;

import a4.j;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {2, j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileWalkDirection {

    /* renamed from: d, reason: collision with root package name */
    public static final FileWalkDirection f5593d;

    /* renamed from: e, reason: collision with root package name */
    public static final FileWalkDirection f5594e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f5595i;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        f5593d = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        f5594e = fileWalkDirection2;
        f5595i = new FileWalkDirection[]{fileWalkDirection, fileWalkDirection2};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f5595i.clone();
    }
}
