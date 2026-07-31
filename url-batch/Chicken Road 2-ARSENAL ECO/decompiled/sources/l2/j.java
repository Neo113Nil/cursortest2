package l2;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface j {
    /* renamed from: addClickListener */
    void mo9addClickListener(c cVar);

    /* renamed from: addLifecycleListener */
    void mo10addLifecycleListener(g gVar);

    /* renamed from: addTrigger */
    void mo11addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo12addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo13clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo14removeClickListener(c cVar);

    /* renamed from: removeLifecycleListener */
    void mo15removeLifecycleListener(g gVar);

    /* renamed from: removeTrigger */
    void mo16removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo17removeTriggers(Collection<String> collection);

    void setPaused(boolean z5);
}
