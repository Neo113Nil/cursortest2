package io.ktor.client.plugins.json;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultJvm.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"defaultSerializer", "Lio/ktor/client/plugins/json/JsonSerializer;", "ktor-client-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultJvmKt {
    public static final JsonSerializer defaultSerializer() {
        Object obj;
        ServiceLoader load = ServiceLoader.load(JsonSerializer.class);
        Intrinsics.checkNotNullExpressionValue(load, "load(...)");
        List list = CollectionsKt.toList(load);
        if (list.isEmpty()) {
            throw new IllegalStateException("Fail to find serializer. Consider to add one of the following dependencies: \n - ktor-client-gson\n - ktor-client-json\n - ktor-client-serialization".toString());
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                do {
                    Object next2 = it.next();
                    if (r3.compareTo(r5) < 0) {
                        next = next2;
                        r3 = r5;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj);
        return (JsonSerializer) obj;
    }
}
