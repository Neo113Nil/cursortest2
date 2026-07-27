package Z2;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    public static final J f4637d;

    /* renamed from: e, reason: collision with root package name */
    public static final J f4638e;

    /* renamed from: i, reason: collision with root package name */
    public static final J f4639i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ J[] f4640j;

    static {
        J j4 = new J("START", 0);
        f4637d = j4;
        J j5 = new J("STOP", 1);
        f4638e = j5;
        J j6 = new J("STOP_AND_RESET_REPLAY_CACHE", 2);
        f4639i = j6;
        J[] entries = {j4, j5, j6};
        f4640j = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f4640j.clone();
    }
}
