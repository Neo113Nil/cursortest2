package K3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.j;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class g implements J3.a, N3.a {
    private final v2.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final N3.b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, a> trackers;

    public g(N3.b _sessionService, v2.f _applicationService, com.onesignal.core.internal.config.c _configModelStore, H2.b preferences, I2.a timeProvider) {
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this._sessionService = _sessionService;
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        f fVar = new f(preferences, _configModelStore);
        this.dataRepository = fVar;
        e eVar = e.INSTANCE;
        concurrentHashMap.put(eVar.getIAM_TAG(), new d(fVar, timeProvider));
        concurrentHashMap.put(eVar.getNOTIFICATION_TAG(), new h(fVar, timeProvider));
        _sessionService.subscribe(this);
        Collection<a> values = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((a) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(v2.b bVar, String str) {
        boolean z7;
        J3.b bVar2;
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', null, 2, null);
        b channelByEntryAction = getChannelByEntryAction(bVar);
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            bVar2 = channelByEntryAction.getCurrentSessionInfluence();
            J3.d dVar = J3.d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            z7 = setSessionTracker(channelByEntryAction, dVar, str, null);
        } else {
            z7 = false;
            bVar2 = null;
        }
        if (z7) {
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            Intrinsics.b(bVar2);
            arrayList.add(bVar2);
            for (b bVar3 : channelsToResetByEntryAction) {
                J3.d influenceType = bVar3.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(bVar3.getCurrentSessionInfluence());
                    bVar3.resetAndInitInfluence();
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (b bVar4 : channelsToResetByEntryAction) {
            J3.d influenceType2 = bVar4.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = bVar4.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    J3.b currentSessionInfluence = bVar4.getCurrentSessionInfluence();
                    if (setSessionTracker(bVar4, J3.d.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence);
                    }
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(g gVar, v2.b bVar, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final b getChannelByEntryAction(v2.b bVar) {
        if (bVar.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    private final List<b> getChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNotificationChannelTracker());
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final List<b> getChannelsToResetByEntryAction(v2.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.isAppClose()) {
            return arrayList;
        }
        b notificationChannelTracker = bVar.isAppOpen() ? getNotificationChannelTracker() : null;
        if (notificationChannelTracker != null) {
            arrayList.add(notificationChannelTracker);
        }
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final b getIAMChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getIAM_TAG());
        Intrinsics.b(aVar);
        return aVar;
    }

    private final b getNotificationChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        Intrinsics.b(aVar);
        return aVar;
    }

    private final void restartSessionTrackersIfNeeded(v2.b bVar) {
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (b bVar2 : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = bVar2.getLastReceivedIds();
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            J3.b currentSessionInfluence = bVar2.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(bVar2, J3.d.INDIRECT, null, lastReceivedIds) : setSessionTracker(bVar2, J3.d.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(b bVar, J3.d dVar, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(bVar, dVar, str, jSONArray)) {
            return false;
        }
        com.onesignal.debug.internal.logging.b.debug$default(j.b("\n            ChannelTracker changed: " + bVar.getIdTag() + "\n            from:\n            influenceType: " + bVar.getInfluenceType() + ", directNotificationId: " + bVar.getDirectId() + ", indirectNotificationIds: " + bVar.getIndirectIds() + "\n            to:\n            influenceType: " + dVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), null, 2, null);
        bVar.setInfluenceType(dVar);
        bVar.setDirectId(str);
        bVar.setIndirectIds(jSONArray);
        bVar.cacheState();
        StringBuilder sb = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb.append(getChannels());
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(b bVar, J3.d dVar, String str, JSONArray jSONArray) {
        if (dVar != bVar.getInfluenceType()) {
            return true;
        }
        J3.d influenceType = bVar.getInfluenceType();
        if (influenceType != null && influenceType.isDirect() && bVar.getDirectId() != null && !Intrinsics.a(bVar.getDirectId(), str)) {
            return true;
        }
        if (influenceType == null || !influenceType.isIndirect() || bVar.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = bVar.getIndirectIds();
        Intrinsics.b(indirectIds);
        return indirectIds.length() > 0 && !com.onesignal.common.f.INSTANCE.compareJSONArrays(bVar.getIndirectIds(), jSONArray);
    }

    @Override // J3.a
    public List<J3.b> getInfluences() {
        Collection<a> values = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(s.g(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // J3.a
    public void onDirectInfluenceFromIAM(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + messageId + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), J3.d.DIRECT, messageId, null);
    }

    @Override // J3.a
    public void onDirectInfluenceFromNotification(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        attemptSessionUpgrade(v2.b.NOTIFICATION_CLICK, notificationId);
    }

    @Override // J3.a
    public void onInAppMessageDismissed() {
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // J3.a
    public void onInAppMessageDisplayed(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + messageId + ')', null, 2, null);
        b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(messageId);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // J3.a
    public void onNotificationReceived(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(notificationId);
    }

    @Override // N3.a
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // N3.a
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // N3.a
    public void onSessionEnded(long j) {
    }
}
