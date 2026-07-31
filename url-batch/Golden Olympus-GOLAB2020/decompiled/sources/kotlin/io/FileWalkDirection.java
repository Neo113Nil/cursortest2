package kotlin.io;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes3.dex */
public final class FileWalkDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f41125b = new FileWalkDirection("TOP_DOWN", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final FileWalkDirection f41126c = new FileWalkDirection("BOTTOM_UP", 1);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ FileWalkDirection[] f41127d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f41128e;

    static {
        FileWalkDirection[] c4 = c();
        f41127d = c4;
        f41128e = AbstractC1372b.a(c4);
    }

    private FileWalkDirection(String str, int i4) {
    }

    private static final /* synthetic */ FileWalkDirection[] c() {
        return new FileWalkDirection[]{f41125b, f41126c};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f41127d.clone();
    }
}
