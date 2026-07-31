package k3;

import W1.d;
import kotlin.jvm.internal.i;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470a {
    public static final C0470a INSTANCE = new C0470a();

    private C0470a() {
    }

    public final void run(d databaseProvider) {
        i.e(databaseProvider, "databaseProvider");
        databaseProvider.getOs().delete("outcome", "name = \"os__session_duration\" AND (session_time = 0 OR session_time IS NULL)", null);
    }
}
