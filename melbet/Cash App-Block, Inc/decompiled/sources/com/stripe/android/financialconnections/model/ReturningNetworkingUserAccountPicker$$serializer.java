package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownToHtmlSerializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class ReturningNetworkingUserAccountPicker$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final ReturningNetworkingUserAccountPicker$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReturningNetworkingUserAccountPicker$$serializer returningNetworkingUserAccountPicker$$serializer = new ReturningNetworkingUserAccountPicker$$serializer();
        INSTANCE = returningNetworkingUserAccountPicker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker", returningNetworkingUserAccountPicker$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("default_cta", false);
        pluginGeneratedSerialDescriptor.addElement("add_new_account", false);
        pluginGeneratedSerialDescriptor.addElement("accounts", false);
        pluginGeneratedSerialDescriptor.addElement("above_cta", true);
        pluginGeneratedSerialDescriptor.addElement("multiple_account_types_selected_data_access_notice", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ReturningNetworkingUserAccountPicker.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, AddNewAccount$$serializer.INSTANCE, lazyArr[3].getValue(), BuiltinSerializersKt.getNullable(MarkdownToHtmlSerializer.INSTANCE), BuiltinSerializersKt.getNullable(DataAccessNotice$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ReturningNetworkingUserAccountPicker deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ReturningNetworkingUserAccountPicker.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        AddNewAccount addNewAccount = null;
        List list = null;
        String str3 = null;
        DataAccessNotice dataAccessNotice = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    addNewAccount = (AddNewAccount) beginStructure.decodeSerializableElement(serialDescriptor, 2, AddNewAccount$$serializer.INSTANCE, addNewAccount);
                    i |= 4;
                    break;
                case 3:
                    list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, MarkdownToHtmlSerializer.INSTANCE, str3);
                    i |= 16;
                    break;
                case 5:
                    dataAccessNotice = (DataAccessNotice) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
                    i |= 32;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new ReturningNetworkingUserAccountPicker(i, str, str2, addNewAccount, list, str3, dataAccessNotice);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReturningNetworkingUserAccountPicker value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ReturningNetworkingUserAccountPicker.$childSerializers;
        String str = value.title;
        DataAccessNotice dataAccessNotice = value.multipleAccountTypesSelectedDataAccessNotice;
        String str2 = value.aboveCta;
        beginStructure.encodeStringElement(serialDescriptor, 0, str);
        beginStructure.encodeStringElement(serialDescriptor, 1, value.defaultCta);
        beginStructure.encodeSerializableElement(serialDescriptor, 2, AddNewAccount$$serializer.INSTANCE, value.addNewAccount);
        beginStructure.encodeSerializableElement(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), value.accounts);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, MarkdownToHtmlSerializer.INSTANCE, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || dataAccessNotice != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
