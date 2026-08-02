package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$InlineButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.InlineButton((String) obj, (PaymentHistoryButton.ButtonAction) obj2, (ClientScenario) obj3, (String) obj4, (PaymentHistoryData.InlineButtonTreatment) obj5, (LocalizedString) obj6, (LocalizableString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = PaymentHistoryButton.ButtonAction.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    try {
                        obj3 = ClientScenario.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = PaymentHistoryData.InlineButtonTreatment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.InlineButton inlineButton = (GenericNonPaymentRenderData.InlineButton) obj;
        reverseProtoWriter.getClass();
        inlineButton.getClass();
        reverseProtoWriter.writeBytes(inlineButton.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, inlineButton.localizable_title);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 6, inlineButton.localized_title);
        PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodeWithTag(reverseProtoWriter, 5, inlineButton.treatment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inlineButton.url);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 3, inlineButton.client_scenario);
        PaymentHistoryButton.ButtonAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inlineButton.action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, inlineButton.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.InlineButton inlineButton = (GenericNonPaymentRenderData.InlineButton) obj;
        inlineButton.getClass();
        int size$okio = inlineButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(7, inlineButton.localizable_title) + LocalizedString.ADAPTER.encodedSizeWithTag(6, inlineButton.localized_title) + PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodedSizeWithTag(5, inlineButton.treatment) + protoAdapter.encodedSizeWithTag(4, inlineButton.url) + ClientScenario.ADAPTER.encodedSizeWithTag(3, inlineButton.client_scenario) + PaymentHistoryButton.ButtonAction.ADAPTER.encodedSizeWithTag(2, inlineButton.action) + protoAdapter.encodedSizeWithTag(1, inlineButton.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.InlineButton inlineButton = (GenericNonPaymentRenderData.InlineButton) obj;
        inlineButton.getClass();
        LocalizedString localizedString = inlineButton.localized_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizableString localizableString = inlineButton.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inlineButton.title;
        PaymentHistoryButton.ButtonAction buttonAction = inlineButton.action;
        ClientScenario clientScenario = inlineButton.client_scenario;
        String str2 = inlineButton.url;
        PaymentHistoryData.InlineButtonTreatment inlineButtonTreatment = inlineButton.treatment;
        byteString.getClass();
        return new GenericNonPaymentRenderData.InlineButton(str, buttonAction, clientScenario, str2, inlineButtonTreatment, localizedString2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.InlineButton inlineButton = (GenericNonPaymentRenderData.InlineButton) obj;
        inlineButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, inlineButton.title);
        PaymentHistoryButton.ButtonAction.ADAPTER.encodeWithTag(protoWriter, 2, inlineButton.action);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 3, inlineButton.client_scenario);
        protoAdapter.encodeWithTag(protoWriter, 4, inlineButton.url);
        PaymentHistoryData.InlineButtonTreatment.ADAPTER.encodeWithTag(protoWriter, 5, inlineButton.treatment);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 6, inlineButton.localized_title);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 7, inlineButton.localizable_title);
        protoWriter.writeBytes(inlineButton.unknownFields());
    }
}
