package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.v1;

/* loaded from: classes5.dex */
public final class w {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final w INSTANCE;
    public static final v1 dispatcher;

    static {
        w wVar = new w();
        INSTANCE = wVar;
        h0.systemProp("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = wVar.loadMainDispatcher();
    }

    private w() {
    }

    private final v1 loadMainDispatcher() {
        kotlin.sequences.m asSequence;
        List<v> list;
        Object next;
        v1 tryCreateDispatcher;
        try {
            if (FAST_SERVICE_LOADER_ENABLED) {
                list = m.INSTANCE.loadMainDispatcherFactory$kotlinx_coroutines_core();
            } else {
                asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(v.class, v.class.getClassLoader()).iterator());
                list = SequencesKt___SequencesKt.toList(asSequence);
            }
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((v) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((v) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            v vVar = (v) next;
            return (vVar == null || (tryCreateDispatcher = x.tryCreateDispatcher(vVar, list)) == null) ? x.createMissingDispatcher$default(null, null, 3, null) : tryCreateDispatcher;
        } catch (Throwable th) {
            return x.createMissingDispatcher$default(th, null, 2, null);
        }
    }
}
