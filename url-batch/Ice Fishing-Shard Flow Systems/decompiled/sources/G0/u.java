package G0;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f832a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.p f833b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f834c;

    public u(UUID id, P0.p workSpec, LinkedHashSet tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f832a = id;
        this.f833b = workSpec;
        this.f834c = tags;
    }
}
