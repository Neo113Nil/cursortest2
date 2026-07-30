package kotlinx.coroutines.flow;

import java.util.List;

/* loaded from: classes5.dex */
public interface n extends e {
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    Object collect(f fVar, kotlin.coroutines.c cVar);

    List<Object> getReplayCache();
}
