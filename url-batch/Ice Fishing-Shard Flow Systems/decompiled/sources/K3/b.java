package K3;

import org.json.JSONArray;

/* loaded from: classes.dex */
public interface b {
    void cacheState();

    J3.c getChannelType();

    J3.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    J3.d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(J3.d dVar);
}
