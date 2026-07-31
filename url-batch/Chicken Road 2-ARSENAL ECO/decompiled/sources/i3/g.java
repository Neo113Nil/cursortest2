package i3;

import F5.k;
import f2.InterfaceC0365b;
import g2.InterfaceC0391a;
import h3.C0406b;
import h3.EnumC0408d;
import h3.InterfaceC0405a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import l5.AbstractC0508l;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class g implements InterfaceC0405a, InterfaceC0493a {
    private final T1.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final InterfaceC0494b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, AbstractC0426a> trackers;

    public g(InterfaceC0494b _sessionService, T1.f _applicationService, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0365b preferences, InterfaceC0391a timeProvider) {
        i.e(_sessionService, "_sessionService");
        i.e(_applicationService, "_applicationService");
        i.e(_configModelStore, "_configModelStore");
        i.e(preferences, "preferences");
        i.e(timeProvider, "timeProvider");
        this._sessionService = _sessionService;
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        ConcurrentHashMap<String, AbstractC0426a> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        f fVar = new f(preferences, _configModelStore);
        this.dataRepository = fVar;
        e eVar = e.INSTANCE;
        concurrentHashMap.put(eVar.getIAM_TAG(), new d(fVar, timeProvider));
        concurrentHashMap.put(eVar.getNOTIFICATION_TAG(), new h(fVar, timeProvider));
        _sessionService.subscribe(this);
        Collection<AbstractC0426a> values = concurrentHashMap.values();
        i.d(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((AbstractC0426a) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(T1.b bVar, String str) {
        boolean z5;
        C0406b c0406b;
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', null, 2, null);
        InterfaceC0427b channelByEntryAction = getChannelByEntryAction(bVar);
        List<InterfaceC0427b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            c0406b = channelByEntryAction.getCurrentSessionInfluence();
            EnumC0408d enumC0408d = EnumC0408d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            z5 = setSessionTracker(channelByEntryAction, enumC0408d, str, null);
        } else {
            z5 = false;
            c0406b = null;
        }
        if (z5) {
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            i.b(c0406b);
            arrayList.add(c0406b);
            for (InterfaceC0427b interfaceC0427b : channelsToResetByEntryAction) {
                EnumC0408d influenceType = interfaceC0427b.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(interfaceC0427b.getCurrentSessionInfluence());
                    interfaceC0427b.resetAndInitInfluence();
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (InterfaceC0427b interfaceC0427b2 : channelsToResetByEntryAction) {
            EnumC0408d influenceType2 = interfaceC0427b2.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = interfaceC0427b2.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    C0406b currentSessionInfluence = interfaceC0427b2.getCurrentSessionInfluence();
                    if (setSessionTracker(interfaceC0427b2, EnumC0408d.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence);
                    }
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(g gVar, T1.b bVar, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final InterfaceC0427b getChannelByEntryAction(T1.b bVar) {
        if (bVar.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    private final List<InterfaceC0427b> getChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNotificationChannelTracker());
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final List<InterfaceC0427b> getChannelsToResetByEntryAction(T1.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.isAppClose()) {
            return arrayList;
        }
        InterfaceC0427b notificationChannelTracker = bVar.isAppOpen() ? getNotificationChannelTracker() : null;
        if (notificationChannelTracker != null) {
            arrayList.add(notificationChannelTracker);
        }
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final InterfaceC0427b getIAMChannelTracker() {
        AbstractC0426a abstractC0426a = this.trackers.get(e.INSTANCE.getIAM_TAG());
        i.b(abstractC0426a);
        return abstractC0426a;
    }

    private final InterfaceC0427b getNotificationChannelTracker() {
        AbstractC0426a abstractC0426a = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        i.b(abstractC0426a);
        return abstractC0426a;
    }

    private final void restartSessionTrackersIfNeeded(T1.b bVar) {
        List<InterfaceC0427b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (InterfaceC0427b interfaceC0427b : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = interfaceC0427b.getLastReceivedIds();
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            C0406b currentSessionInfluence = interfaceC0427b.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(interfaceC0427b, EnumC0408d.INDIRECT, null, lastReceivedIds) : setSessionTracker(interfaceC0427b, EnumC0408d.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(InterfaceC0427b interfaceC0427b, EnumC0408d enumC0408d, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(interfaceC0427b, enumC0408d, str, jSONArray)) {
            return false;
        }
        com.onesignal.debug.internal.logging.b.debug$default(k.y("\n            ChannelTracker changed: " + interfaceC0427b.getIdTag() + "\n            from:\n            influenceType: " + interfaceC0427b.getInfluenceType() + ", directNotificationId: " + interfaceC0427b.getDirectId() + ", indirectNotificationIds: " + interfaceC0427b.getIndirectIds() + "\n            to:\n            influenceType: " + enumC0408d + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), null, 2, null);
        interfaceC0427b.setInfluenceType(enumC0408d);
        interfaceC0427b.setDirectId(str);
        interfaceC0427b.setIndirectIds(jSONArray);
        interfaceC0427b.cacheState();
        StringBuilder sb = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb.append(getChannels());
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(InterfaceC0427b interfaceC0427b, EnumC0408d enumC0408d, String str, JSONArray jSONArray) {
        if (enumC0408d != interfaceC0427b.getInfluenceType()) {
            return true;
        }
        EnumC0408d influenceType = interfaceC0427b.getInfluenceType();
        if (influenceType != null && influenceType.isDirect() && interfaceC0427b.getDirectId() != null && !i.a(interfaceC0427b.getDirectId(), str)) {
            return true;
        }
        if (influenceType == null || !influenceType.isIndirect() || interfaceC0427b.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = interfaceC0427b.getIndirectIds();
        i.b(indirectIds);
        return indirectIds.length() > 0 && !com.onesignal.common.f.INSTANCE.compareJSONArrays(interfaceC0427b.getIndirectIds(), jSONArray);
    }

    @Override // h3.InterfaceC0405a
    public List<C0406b> getInfluences() {
        Collection<AbstractC0426a> values = this.trackers.values();
        i.d(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(AbstractC0508l.C(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0426a) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // h3.InterfaceC0405a
    public void onDirectInfluenceFromIAM(String messageId) {
        i.e(messageId, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + messageId + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), EnumC0408d.DIRECT, messageId, null);
    }

    @Override // h3.InterfaceC0405a
    public void onDirectInfluenceFromNotification(String notificationId) {
        i.e(notificationId, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        attemptSessionUpgrade(T1.b.NOTIFICATION_CLICK, notificationId);
    }

    @Override // h3.InterfaceC0405a
    public void onInAppMessageDismissed() {
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // h3.InterfaceC0405a
    public void onInAppMessageDisplayed(String messageId) {
        i.e(messageId, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + messageId + ')', null, 2, null);
        InterfaceC0427b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(messageId);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // h3.InterfaceC0405a
    public void onNotificationReceived(String notificationId) {
        i.e(notificationId, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(notificationId);
    }

    @Override // l3.InterfaceC0493a
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // l3.InterfaceC0493a
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // l3.InterfaceC0493a
    public void onSessionEnded(long j4) {
    }
}
