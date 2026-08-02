package com.squareup.cash.treehouse.analytics;

import com.squareup.cash.cdf.Event;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* loaded from: classes.dex */
public abstract class EventSerializerKt {
    public static final SerialModuleImpl analyticsSerializersModule;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.contextual(Reflection.factory.getOrCreateKotlinClass(Event.class), EventSerializer.INSTANCE);
        analyticsSerializersModule = serializersModuleBuilder.build();
    }
}
