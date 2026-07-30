package B3;

import Y3.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    private final String id;
    private final f status;

    public a(String str, f status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = str;
        this.status = status;
    }

    public final String getId() {
        return this.id;
    }

    public final f getStatus() {
        return this.status;
    }
}
