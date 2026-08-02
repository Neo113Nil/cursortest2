package com.stripe.android.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownToHtmlSerializer;
import com.stripe.android.model.ConsentUi;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/model/ConsentUi.ConsentPane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentPane;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/model/ConsentUi$ConsentPane;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/model/ConsentUi$ConsentPane;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class ConsentUi$ConsentPane$$serializer implements GeneratedSerializer {
    public static final ConsentUi$ConsentPane$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConsentUi$ConsentPane$$serializer consentUi$ConsentPane$$serializer = new ConsentUi$ConsentPane$$serializer();
        INSTANCE = consentUi$ConsentPane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsentUi.ConsentPane", consentUi$ConsentPane$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("scopes_section", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("deny_button_label", false);
        pluginGeneratedSerialDescriptor.addElement("allow_button_label", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(MarkdownToHtmlSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ConsentUi.ConsentPane deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        ConsentUi.ConsentPane.ScopesSection scopesSection = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                str = beginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                scopesSection = (ConsentUi.ConsentPane.ScopesSection) beginStructure.decodeSerializableElement(serialDescriptor, 1, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, scopesSection);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, MarkdownToHtmlSerializer.INSTANCE, str2);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                str4 = beginStructure.decodeStringElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ConsentUi.ConsentPane(i, str, scopesSection, str2, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ConsentUi.ConsentPane value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        beginStructure.encodeStringElement(serialDescriptor, 0, value.title);
        beginStructure.encodeSerializableElement(serialDescriptor, 1, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, value.scopesSection);
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, MarkdownToHtmlSerializer.INSTANCE, value.disclaimer);
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, value.denyButtonLabel);
        beginStructure.encodeStringElement(serialDescriptor, 4, value.allowButtonLabel);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
