package n3;

import java.util.List;
import java.util.Map;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543a {
    private final Map<String, String> identities;
    private final C0548f properties;
    private final M1.b rywData;
    private final List<C0550h> subscriptions;

    public C0543a(Map<String, String> identities, C0548f properties, List<C0550h> subscriptions, M1.b bVar) {
        kotlin.jvm.internal.i.e(identities, "identities");
        kotlin.jvm.internal.i.e(properties, "properties");
        kotlin.jvm.internal.i.e(subscriptions, "subscriptions");
        this.identities = identities;
        this.properties = properties;
        this.subscriptions = subscriptions;
        this.rywData = bVar;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final C0548f getProperties() {
        return this.properties;
    }

    public final M1.b getRywData() {
        return this.rywData;
    }

    public final List<C0550h> getSubscriptions() {
        return this.subscriptions;
    }

    public /* synthetic */ C0543a(Map map, C0548f c0548f, List list, M1.b bVar, int i7, kotlin.jvm.internal.e eVar) {
        this(map, c0548f, list, (i7 & 8) != 0 ? null : bVar);
    }
}
