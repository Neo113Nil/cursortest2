package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.v1;

/* loaded from: classes5.dex */
public interface v {
    v1 createDispatcher(List<? extends v> list);

    int getLoadPriority();

    String hintOnError();
}
