package kotlinx.coroutines.internal;

import java.util.List;
import m6.y1;

/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    y1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
