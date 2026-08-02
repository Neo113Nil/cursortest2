package papa;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class MainThreadMessageSpy {
    public static String currentMessageAsString;
    public static boolean enabled;
    public static final CopyOnWriteArrayList tracers = new CopyOnWriteArrayList();

    public interface Tracer {
        void onMessageDispatch(String str, boolean z);
    }

    public static void addTracer(Tracer tracer) {
        Handlers.checkOnMainThread();
        CopyOnWriteArrayList copyOnWriteArrayList = tracers;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (((Tracer) it.next()) == tracer) {
                    Handlers$$ExternalSyntheticBUOutline0.m("Tracer ", tracer, " already in ", copyOnWriteArrayList);
                    return;
                }
            }
        }
        copyOnWriteArrayList.add(tracer);
    }
}
