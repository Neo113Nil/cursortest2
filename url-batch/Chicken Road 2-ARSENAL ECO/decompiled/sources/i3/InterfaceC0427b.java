package i3;

import h3.C0406b;
import h3.EnumC0407c;
import h3.EnumC0408d;
import org.json.JSONArray;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0427b {
    void cacheState();

    EnumC0407c getChannelType();

    C0406b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    EnumC0408d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(EnumC0408d enumC0408d);
}
