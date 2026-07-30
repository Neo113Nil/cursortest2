package M3;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1027d;

/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void run(InterfaceC1027d databaseProvider) {
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        databaseProvider.getOs().delete("outcome", "name = \"os__session_duration\" AND (session_time = 0 OR session_time IS NULL)", null);
    }
}
