package H5;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public interface b {
    void cacheState();

    G5.c getChannelType();

    G5.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    G5.d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(G5.d dVar);
}
