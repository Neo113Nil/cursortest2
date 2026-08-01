package wa;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo3addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo4addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo5addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo6addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo7clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo8removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo9removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo10removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo11removeTriggers(Collection<String> collection);

    void setPaused(boolean z10);
}
