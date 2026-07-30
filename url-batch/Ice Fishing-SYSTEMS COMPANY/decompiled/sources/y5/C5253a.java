package y5;

import V5.f;
import kotlin.jvm.internal.h;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5253a {
    private final String id;
    private final f status;

    public C5253a(String str, f status) {
        h.e(status, "status");
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
