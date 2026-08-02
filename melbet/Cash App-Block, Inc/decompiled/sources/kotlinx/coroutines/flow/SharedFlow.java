package kotlinx.coroutines.flow;

import java.util.List;

/* loaded from: classes3.dex */
public interface SharedFlow extends Flow {
    List getReplayCache();
}
