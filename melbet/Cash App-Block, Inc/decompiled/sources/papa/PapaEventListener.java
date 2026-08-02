package papa;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface PapaEventListener {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final CopyOnWriteArrayList listeners = new CopyOnWriteArrayList();

        public static void sendEvent$papa_release(PapaEvent papaEvent) {
            Handlers.checkOnMainThread();
            Iterator it = listeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((PapaEventListener) it.next()).onEvent(papaEvent);
            }
        }
    }

    void onEvent(PapaEvent papaEvent);
}
