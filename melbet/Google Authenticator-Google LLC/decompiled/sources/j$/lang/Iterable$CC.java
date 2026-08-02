package j$.lang;

import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* renamed from: j$.lang.Iterable$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        consumer.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
