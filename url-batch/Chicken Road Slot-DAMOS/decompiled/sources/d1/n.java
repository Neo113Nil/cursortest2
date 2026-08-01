package d1;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface n extends CoroutineContext.Element {
    float C();

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.f getKey() {
        return a.B;
    }
}
