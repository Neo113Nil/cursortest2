package Z2;

import kotlin.jvm.internal.i;
import w3.f;

/* loaded from: classes.dex */
public final class a {
    private final String id;
    private final f status;

    public a(String str, f status) {
        i.e(status, "status");
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
