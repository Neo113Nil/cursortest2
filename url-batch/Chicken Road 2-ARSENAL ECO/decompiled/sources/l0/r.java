package l0;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import u0.C0686p;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f5284a;

    /* renamed from: b, reason: collision with root package name */
    public final C0686p f5285b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5286c;

    public r(UUID id, C0686p workSpec, LinkedHashSet tags) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(workSpec, "workSpec");
        kotlin.jvm.internal.i.e(tags, "tags");
        this.f5284a = id;
        this.f5285b = workSpec;
        this.f5286c = tags;
    }
}
