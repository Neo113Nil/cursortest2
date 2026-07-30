package H5;

import M7.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import r7.AbstractC4981l;

/* loaded from: classes2.dex */
public final class g implements G5.a, K5.a {
    private final t4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final K5.b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, a> trackers;

    public g(K5.b _sessionService, t4.f _applicationService, com.onesignal.core.internal.config.c _configModelStore, F4.b preferences, G4.a timeProvider) {
        kotlin.jvm.internal.h.e(_sessionService, "_sessionService");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(preferences, "preferences");
        kotlin.jvm.internal.h.e(timeProvider, "timeProvider");
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
        kotlin.jvm.internal.h.d(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((a) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(t4.b bVar, String str) {
        boolean z8;
        G5.b bVar2;
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', null, 2, null);
        b channelByEntryAction = getChannelByEntryAction(bVar);
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            bVar2 = channelByEntryAction.getCurrentSessionInfluence();
            G5.d dVar = G5.d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            z8 = setSessionTracker(channelByEntryAction, dVar, str, null);
        } else {
            z8 = false;
            bVar2 = null;
        }
        if (z8) {
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            kotlin.jvm.internal.h.b(bVar2);
            arrayList.add(bVar2);
            for (b bVar3 : channelsToResetByEntryAction) {
                G5.d influenceType = bVar3.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(bVar3.getCurrentSessionInfluence());
                    bVar3.resetAndInitInfluence();
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (b bVar4 : channelsToResetByEntryAction) {
            G5.d influenceType2 = bVar4.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = bVar4.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    G5.b currentSessionInfluence = bVar4.getCurrentSessionInfluence();
                    if (setSessionTracker(bVar4, G5.d.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence);
                    }
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(g gVar, t4.b bVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final b getChannelByEntryAction(t4.b bVar) {
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

    private final List<b> getChannelsToResetByEntryAction(t4.b bVar) {
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
        kotlin.jvm.internal.h.b(aVar);
        return aVar;
    }

    private final b getNotificationChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        kotlin.jvm.internal.h.b(aVar);
        return aVar;
    }

    private final void restartSessionTrackersIfNeeded(t4.b bVar) {
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (b bVar2 : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = bVar2.getLastReceivedIds();
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            G5.b currentSessionInfluence = bVar2.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(bVar2, G5.d.INDIRECT, null, lastReceivedIds) : setSessionTracker(bVar2, G5.d.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(b bVar, G5.d dVar, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(bVar, dVar, str, jSONArray)) {
            return false;
        }
        com.onesignal.debug.internal.logging.b.debug$default(k.y("\n            ChannelTracker changed: " + bVar.getIdTag() + "\n            from:\n            influenceType: " + bVar.getInfluenceType() + ", directNotificationId: " + bVar.getDirectId() + ", indirectNotificationIds: " + bVar.getIndirectIds() + "\n            to:\n            influenceType: " + dVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), null, 2, null);
        bVar.setInfluenceType(dVar);
        bVar.setDirectId(str);
        bVar.setIndirectIds(jSONArray);
        bVar.cacheState();
        StringBuilder sb = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb.append(getChannels());
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(b bVar, G5.d dVar, String str, JSONArray jSONArray) {
        if (dVar != bVar.getInfluenceType()) {
            return true;
        }
        G5.d influenceType = bVar.getInfluenceType();
        if (influenceType != null && influenceType.isDirect() && bVar.getDirectId() != null && !kotlin.jvm.internal.h.a(bVar.getDirectId(), str)) {
            return true;
        }
        if (influenceType == null || !influenceType.isIndirect() || bVar.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = bVar.getIndirectIds();
        kotlin.jvm.internal.h.b(indirectIds);
        return indirectIds.length() > 0 && !com.onesignal.common.f.INSTANCE.compareJSONArrays(bVar.getIndirectIds(), jSONArray);
    }

    @Override // G5.a
    public List<G5.b> getInfluences() {
        Collection<a> values = this.trackers.values();
        kotlin.jvm.internal.h.d(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(AbstractC4981l.E(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // G5.a
    public void onDirectInfluenceFromIAM(String messageId) {
        kotlin.jvm.internal.h.e(messageId, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + messageId + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), G5.d.DIRECT, messageId, null);
    }

    @Override // G5.a
    public void onDirectInfluenceFromNotification(String notificationId) {
        kotlin.jvm.internal.h.e(notificationId, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        attemptSessionUpgrade(t4.b.NOTIFICATION_CLICK, notificationId);
    }

    @Override // G5.a
    public void onInAppMessageDismissed() {
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // G5.a
    public void onInAppMessageDisplayed(String messageId) {
        kotlin.jvm.internal.h.e(messageId, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + messageId + ')', null, 2, null);
        b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(messageId);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // G5.a
    public void onNotificationReceived(String notificationId) {
        kotlin.jvm.internal.h.e(notificationId, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(notificationId);
    }

    @Override // K5.a
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // K5.a
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // K5.a
    public void onSessionEnded(long j9) {
    }
}
