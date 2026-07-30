package kotlinx.coroutines.flow;

import java.util.List;

/* loaded from: classes5.dex */
public interface t extends n {
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /* synthetic */ Object collect(f fVar, kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.flow.n
    /* synthetic */ List getReplayCache();

    Object getValue();
}
