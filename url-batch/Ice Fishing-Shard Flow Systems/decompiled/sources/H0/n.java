package H0;

import G0.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f913a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f914b;

    static {
        String f7 = s.f("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(f7, "tagWithPrefix(\"WrkDbPathHelper\")");
        f913a = f7;
        f914b = new String[]{"-journal", "-shm", "-wal"};
    }
}
