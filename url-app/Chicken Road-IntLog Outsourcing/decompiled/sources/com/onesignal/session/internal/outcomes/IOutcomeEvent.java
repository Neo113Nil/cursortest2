package com.onesignal.session.internal.outcomes;

import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;

/* loaded from: classes.dex */
public interface IOutcomeEvent {
    String getName();

    JSONArray getNotificationIds();

    InfluenceType getSession();

    long getSessionTime();

    long getTimestamp();

    float getWeight();
}
