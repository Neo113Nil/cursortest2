package kotlinx.serialization;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.ContextDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$CONTEXTUAL;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.internal.Tags;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/ContextualSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "serializer", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContextualSerializer<T> implements KSerializer {
    public final ContextDescriptor descriptor;
    public final KSerializer fallbackSerializer;
    public final KClass serializableClass;
    public final List typeArgumentsSerializers;

    public ContextualSerializer(KClass kClass, KSerializer kSerializer, KSerializer[] kSerializerArr) {
        kClass.getClass();
        this.serializableClass = kClass;
        this.fallbackSerializer = kSerializer;
        List asList = Arrays.asList(kSerializerArr);
        asList.getClass();
        this.typeArgumentsSerializers = asList;
        ForwardingFileSystem$$ExternalSyntheticLambda0 forwardingFileSystem$$ExternalSyntheticLambda0 = new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 19);
        this.descriptor = new ContextDescriptor(Tags.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", SerialKind$CONTEXTUAL.INSTANCE, new SerialDescriptor[0], forwardingFileSystem$$ExternalSyntheticLambda0), kClass);
    }

    private final KSerializer serializer(SerializersModule serializersModule) {
        List list = this.typeArgumentsSerializers;
        KClass kClass = this.serializableClass;
        KSerializer contextual = serializersModule.getContextual(kClass, list);
        if (contextual != null) {
            return contextual;
        }
        KSerializer kSerializer = this.fallbackSerializer;
        if (kSerializer != null) {
            return kSerializer;
        }
        EnumsKt.serializerNotRegistered(kClass);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.decodeSerializableValue$1(serializer(decoder.getSerializersModule()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        encoder.encodeSerializableValue(serializer(encoder.getSerializersModule()), obj);
    }
}
