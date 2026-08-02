package com.squareup.cash.treehouse.platform;

import app.cash.redwood.treehouse.StateSnapshotKt;
import com.squareup.cash.treehouse.analytics.EventSerializerKt;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import okio.ByteString;
import papa.AppUpdateData;

/* loaded from: classes.dex */
public abstract class SerializersKt {
    public static final SerialModuleImpl treehouseSerializersModule;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        ReflectionFactory reflectionFactory = Reflection.factory;
        serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
        serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
        serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(ByteString.class), ByteStringSerializer.INSTANCE);
        SerialModuleImpl serialModuleImpl = StateSnapshotKt.SaveableStateSerializersModule;
        serialModuleImpl.getClass();
        serialModuleImpl.dumpTo(serializersModuleBuilder);
        SerialModuleImpl serialModuleImpl2 = EventSerializerKt.analyticsSerializersModule;
        serialModuleImpl2.getClass();
        serialModuleImpl2.dumpTo(serializersModuleBuilder);
        treehouseSerializersModule = serializersModuleBuilder.build();
        AppUpdateData.Json$default(new MainActivity$$ExternalSyntheticLambda5(23));
    }
}
