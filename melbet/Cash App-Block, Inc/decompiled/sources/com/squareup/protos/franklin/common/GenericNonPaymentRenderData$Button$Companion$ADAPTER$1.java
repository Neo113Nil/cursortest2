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
public final class GenericNonPaymentRenderData$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.Button((String) obj, (PaymentHistoryButton.ButtonAction) obj2, (ClientScenario) obj3, (PaymentHistoryButton.Icon) obj4, (PaymentHistoryData.UiStatusTreatment) obj5, (String) obj6, (LocalizedString) obj7, (LocalizableString) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    try {
                        obj4 = PaymentHistoryButton.Icon.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 5:
                    try {
                        obj5 = PaymentHistoryData.UiStatusTreatment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.Button button = (GenericNonPaymentRenderData.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, button.localizable_title);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, button.localized_title);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, button.url);
        PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button.treatment);
        PaymentHistoryButton.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button.icon);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.client_scenario);
        PaymentHistoryButton.ButtonAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, button.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.Button button = (GenericNonPaymentRenderData.Button) obj;
        button.getClass();
        int size$okio = button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(8, button.localizable_title) + LocalizedString.ADAPTER.encodedSizeWithTag(7, button.localized_title) + protoAdapter.encodedSizeWithTag(6, button.url) + PaymentHistoryData.UiStatusTreatment.ADAPTER.encodedSizeWithTag(5, button.treatment) + PaymentHistoryButton.Icon.ADAPTER.encodedSizeWithTag(4, button.icon) + ClientScenario.ADAPTER.encodedSizeWithTag(3, button.client_scenario) + PaymentHistoryButton.ButtonAction.ADAPTER.encodedSizeWithTag(2, button.action) + protoAdapter.encodedSizeWithTag(1, button.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.Button button = (GenericNonPaymentRenderData.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.localized_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizableString localizableString = button.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.title;
        PaymentHistoryButton.ButtonAction buttonAction = button.action;
        ClientScenario clientScenario = button.client_scenario;
        PaymentHistoryButton.Icon icon = button.icon;
        PaymentHistoryData.UiStatusTreatment uiStatusTreatment = button.treatment;
        String str2 = button.url;
        byteString.getClass();
        return new GenericNonPaymentRenderData.Button(str, buttonAction, clientScenario, icon, uiStatusTreatment, str2, localizedString2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.Button button = (GenericNonPaymentRenderData.Button) obj;
        button.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, button.title);
        PaymentHistoryButton.ButtonAction.ADAPTER.encodeWithTag(protoWriter, 2, button.action);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 3, button.client_scenario);
        PaymentHistoryButton.Icon.ADAPTER.encodeWithTag(protoWriter, 4, button.icon);
        PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(protoWriter, 5, button.treatment);
        protoAdapter.encodeWithTag(protoWriter, 6, button.url);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 7, button.localized_title);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 8, button.localizable_title);
        protoWriter.writeBytes(button.unknownFields());
    }
}
