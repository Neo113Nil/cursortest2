package N2;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo11addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo12addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo13addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo14addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo15clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo16removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo17removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo18removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo19removeTriggers(Collection<String> collection);

    void setPaused(boolean z7);
}
