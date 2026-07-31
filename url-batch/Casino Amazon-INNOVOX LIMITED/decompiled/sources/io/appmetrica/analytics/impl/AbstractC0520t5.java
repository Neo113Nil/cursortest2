package io.appmetrica.analytics.impl;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0520t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1495a = CollectionUtils.createSortedListWithoutRepetitions("id", "session_id", "session_type", "number_in_session", WebViewManager.EVENT_TYPE_KEY, "global_number", InfluenceConstants.TIME, "event_description");
}
