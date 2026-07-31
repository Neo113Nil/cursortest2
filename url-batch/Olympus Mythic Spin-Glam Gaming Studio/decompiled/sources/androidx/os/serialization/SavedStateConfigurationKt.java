package androidx.os.serialization;

import android.os.Bundle;
import androidx.os.serialization.serializers.MutableStateFlowSerializer;
import androidx.os.serialization.serializers.SavedStateSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleKt;

/* compiled from: SavedStateConfiguration.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "DEFAULT_SERIALIZERS_MODULE", "Lkotlinx/serialization/modules/SerializersModule;", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateConfigurationKt {
    private static final SerializersModule DEFAULT_SERIALIZERS_MODULE;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(Bundle.class), SavedStateSerializer.INSTANCE);
        serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(MutableStateFlow.class), new Function1() { // from class: androidx.savedstate.serialization.SavedStateConfigurationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KSerializer DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0;
                DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0 = SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0((List) obj);
                return DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0;
            }
        });
        DEFAULT_SERIALIZERS_MODULE = SerializersModuleKt.plus(serializersModuleBuilder.build(), SavedStateConfiguration_androidKt.getDefaultSerializersModuleOnPlatform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0(List elementSerializers) {
        Intrinsics.checkNotNullParameter(elementSerializers, "elementSerializers");
        return new MutableStateFlowSerializer((KSerializer) CollectionsKt.first(elementSerializers));
    }
}
