package com.yandex.div.core.view2;

import O1.Xb;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivVisibilityTokenHolder {

    @NotNull
    private final ConcurrentLinkedQueue<Map<CompositeLogId, Xb>> tokens = new ConcurrentLinkedQueue<>();

    public final boolean add(@NotNull Map<CompositeLogId, Xb> logIds) {
        Intrinsics.checkNotNullParameter(logIds, "logIds");
        return this.tokens.add(logIds);
    }

    @Nullable
    public final CompositeLogId getLogId(@NotNull CompositeLogId logId) {
        Object obj;
        Set keySet;
        Intrinsics.checkNotNullParameter(logId, "logId");
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Map) obj).containsKey(logId)) {
                break;
            }
        }
        Map map = (Map) obj;
        if (map != null && (keySet = map.keySet()) != null) {
            CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) keySet.toArray(new CompositeLogId[0]);
            if (compositeLogIdArr != null) {
                for (CompositeLogId compositeLogId : compositeLogIdArr) {
                    if (Intrinsics.areEqual(compositeLogId, logId)) {
                        return compositeLogId;
                    }
                }
            }
        }
        return null;
    }

    public final void remove(@NotNull CompositeLogId logId, @NotNull Function1<? super Map<CompositeLogId, ? extends Xb>, Unit> emptyTokenCallback) {
        Object obj;
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(emptyTokenCallback, "emptyTokenCallback");
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map) obj).remove(logId) != null) {
                    break;
                }
            }
        }
        Map map = (Map) obj;
        if (map != null && map.isEmpty()) {
            emptyTokenCallback.invoke(map);
            this.tokens.remove(map);
        }
    }
}
