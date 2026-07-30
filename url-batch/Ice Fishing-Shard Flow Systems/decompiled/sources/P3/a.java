package P3;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.C0800b;

/* loaded from: classes.dex */
public final class a {
    private final Map<String, String> identities;
    private final f properties;
    private final C0800b rywData;
    private final List<h> subscriptions;

    public a(Map<String, String> identities, f properties, List<h> subscriptions, C0800b c0800b) {
        Intrinsics.checkNotNullParameter(identities, "identities");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.identities = identities;
        this.properties = properties;
        this.subscriptions = subscriptions;
        this.rywData = c0800b;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final f getProperties() {
        return this.properties;
    }

    public final C0800b getRywData() {
        return this.rywData;
    }

    public final List<h> getSubscriptions() {
        return this.subscriptions;
    }

    public /* synthetic */ a(Map map, f fVar, List list, C0800b c0800b, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, fVar, list, (i2 & 8) != 0 ? null : c0800b);
    }
}
