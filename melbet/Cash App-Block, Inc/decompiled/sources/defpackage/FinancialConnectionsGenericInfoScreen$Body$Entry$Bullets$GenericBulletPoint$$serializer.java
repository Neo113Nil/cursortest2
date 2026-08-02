package defpackage;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownToHtmlSerializer;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.Image$$serializer;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* synthetic */ class FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer financialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer = new FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint", financialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(MarkdownToHtmlSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Image image = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                image = (Image) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Image$$serializer.INSTANCE, image);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                i |= 4;
            } else {
                if (decodeElementIndex != 3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MarkdownToHtmlSerializer.INSTANCE, str3);
                i |= 8;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint(i, str, image, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.id;
        String str2 = value.content;
        String str3 = value.title;
        Image image = value.icon;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || image != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, Image$$serializer.INSTANCE, image);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, MarkdownToHtmlSerializer.INSTANCE, str2);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
