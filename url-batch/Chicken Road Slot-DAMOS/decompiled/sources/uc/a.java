package uc;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private final Map<String, String> identities;
    private final f properties;
    private final List<h> subscriptions;

    public a(Map<String, String> map, f fVar, List<h> list) {
        map.getClass();
        fVar.getClass();
        list.getClass();
        this.identities = map;
        this.properties = fVar;
        this.subscriptions = list;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final f getProperties() {
        return this.properties;
    }

    public final List<h> getSubscriptions() {
        return this.subscriptions;
    }
}
