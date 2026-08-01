package pc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements oc.a, sc.a {
    private final ea.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final sc.b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, a> trackers;

    public g(sc.b bVar, ea.f fVar, com.onesignal.core.internal.config.b bVar2, qa.b bVar3, sa.a aVar) {
        bVar.getClass();
        fVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        aVar.getClass();
        this._sessionService = bVar;
        this._applicationService = fVar;
        this._configModelStore = bVar2;
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        f fVar2 = new f(bVar3, bVar2);
        this.dataRepository = fVar2;
        e eVar = e.INSTANCE;
        concurrentHashMap.put(eVar.getIAM_TAG(), new d(fVar2, aVar));
        concurrentHashMap.put(eVar.getNOTIFICATION_TAG(), new h(fVar2, aVar));
        bVar.subscribe(this);
        Collection<a> values = concurrentHashMap.values();
        values.getClass();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((a) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(ea.b bVar, String str) {
        boolean z10;
        oc.b bVar2;
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', null, 2, null);
        b channelByEntryAction = getChannelByEntryAction(bVar);
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            bVar2 = channelByEntryAction.getCurrentSessionInfluence();
            oc.d dVar = oc.d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            z10 = setSessionTracker(channelByEntryAction, dVar, str, null);
        } else {
            z10 = false;
            bVar2 = null;
        }
        if (z10) {
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            bVar2.getClass();
            arrayList.add(bVar2);
            for (b bVar3 : channelsToResetByEntryAction) {
                oc.d influenceType = bVar3.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(bVar3.getCurrentSessionInfluence());
                    bVar3.resetAndInitInfluence();
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (b bVar4 : channelsToResetByEntryAction) {
            oc.d influenceType2 = bVar4.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = bVar4.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    oc.b currentSessionInfluence = bVar4.getCurrentSessionInfluence();
                    if (setSessionTracker(bVar4, oc.d.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence);
                    }
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(g gVar, ea.b bVar, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final b getChannelByEntryAction(ea.b bVar) {
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

    private final List<b> getChannelsToResetByEntryAction(ea.b bVar) {
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
        aVar.getClass();
        return aVar;
    }

    private final b getNotificationChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        aVar.getClass();
        return aVar;
    }

    private final void restartSessionTrackersIfNeeded(ea.b bVar) {
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (b bVar2 : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = bVar2.getLastReceivedIds();
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            oc.b currentSessionInfluence = bVar2.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(bVar2, oc.d.INDIRECT, null, lastReceivedIds) : setSessionTracker(bVar2, oc.d.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(b bVar, oc.d dVar, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(bVar, dVar, str, jSONArray)) {
            return false;
        }
        com.onesignal.debug.internal.logging.b.debug$default(i.c("\n            ChannelTracker changed: " + bVar.getIdTag() + "\n            from:\n            influenceType: " + bVar.getInfluenceType() + ", directNotificationId: " + bVar.getDirectId() + ", indirectNotificationIds: " + bVar.getIndirectIds() + "\n            to:\n            influenceType: " + dVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), null, 2, null);
        bVar.setInfluenceType(dVar);
        bVar.setDirectId(str);
        bVar.setIndirectIds(jSONArray);
        bVar.cacheState();
        StringBuilder sb2 = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb2.append(getChannels());
        com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(b bVar, oc.d dVar, String str, JSONArray jSONArray) {
        if (dVar != bVar.getInfluenceType()) {
            return true;
        }
        oc.d influenceType = bVar.getInfluenceType();
        if (influenceType != null && influenceType.isDirect() && bVar.getDirectId() != null && !Intrinsics.a(bVar.getDirectId(), str)) {
            return true;
        }
        if (influenceType == null || !influenceType.isIndirect() || bVar.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = bVar.getIndirectIds();
        indirectIds.getClass();
        return indirectIds.length() > 0 && !com.onesignal.common.f.INSTANCE.compareJSONArrays(bVar.getIndirectIds(), jSONArray);
    }

    @Override // oc.a
    public List<oc.b> getInfluences() {
        Collection<a> values = this.trackers.values();
        values.getClass();
        Collection<a> collection = values;
        ArrayList arrayList = new ArrayList(z.j(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // oc.a
    public void onDirectInfluenceFromIAM(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + str + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), oc.d.DIRECT, str, null);
    }

    @Override // oc.a
    public void onDirectInfluenceFromNotification(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + str + ')', null, 2, null);
        if (str.length() == 0) {
            return;
        }
        attemptSessionUpgrade(ea.b.NOTIFICATION_CLICK, str);
    }

    @Override // oc.a
    public void onInAppMessageDismissed() {
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // oc.a
    public void onInAppMessageDisplayed(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + str + ')', null, 2, null);
        b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(str);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // oc.a
    public void onNotificationReceived(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + str + ')', null, 2, null);
        if (str.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(str);
    }

    @Override // sc.a
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // sc.a
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // sc.a
    public void onSessionEnded(long j) {
    }
}
