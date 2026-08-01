package pc;

import org.json.JSONArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b {
    void cacheState();

    oc.c getChannelType();

    oc.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    oc.d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(oc.d dVar);
}
