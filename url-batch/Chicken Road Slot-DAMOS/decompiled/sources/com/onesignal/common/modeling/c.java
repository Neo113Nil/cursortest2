package com.onesignal.common.modeling;

import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c extends com.onesignal.common.events.d {
    void add(int i3, i iVar, String str);

    void add(i iVar, String str);

    void clear(String str);

    i create(JSONObject jSONObject);

    i get(String str);

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Collection<i> list();

    void remove(String str, String str2);

    void replaceAll(List<i> list, String str);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
