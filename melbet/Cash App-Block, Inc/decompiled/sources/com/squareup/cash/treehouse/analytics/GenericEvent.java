package com.squareup.cash.treehouse.analytics;

import com.squareup.cash.cdf.Event;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes.dex */
public final class GenericEvent implements Event {
    public final String name;
    public final Map parameters;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Moneys$$ExternalSyntheticLambda0(20))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/analytics/GenericEvent$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/analytics/GenericEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return GenericEvent$$serializer.INSTANCE;
        }
    }

    public GenericEvent(Event event) {
        event.getClass();
        String name = event.getName();
        Map parameters = event.getParameters();
        name.getClass();
        parameters.getClass();
        this.name = name;
        this.parameters = parameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericEvent)) {
            return false;
        }
        GenericEvent genericEvent = (GenericEvent) obj;
        return Intrinsics.areEqual(this.name, genericEvent.name) && Intrinsics.areEqual(this.parameters, genericEvent.parameters);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.parameters.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "GenericEvent(name=" + this.name + ", parameters=" + this.parameters + ")";
    }

    public /* synthetic */ GenericEvent(String str, Map map, int i) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, GenericEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.parameters = map;
    }
}
