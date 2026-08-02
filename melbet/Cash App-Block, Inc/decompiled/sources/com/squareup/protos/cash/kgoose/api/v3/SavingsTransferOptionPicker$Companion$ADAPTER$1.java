package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavingsTransferOptionPicker$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsTransferOptionPicker(m, arrayList, (String) obj, (String) obj2, arrayList2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        TransferOptionKind.ADAPTER.tryDecode(protoReader, m);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    arrayList.add(LinkTransferOption.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    arrayList2.add(PickerOptionRule.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsTransferOptionPicker savingsTransferOptionPicker = (SavingsTransferOptionPicker) obj;
        reverseProtoWriter.getClass();
        savingsTransferOptionPicker.getClass();
        reverseProtoWriter.writeBytes(savingsTransferOptionPicker.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, savingsTransferOptionPicker.cta);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, savingsTransferOptionPicker.title_template);
        PickerOptionRule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, savingsTransferOptionPicker.option_rules);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, savingsTransferOptionPicker.amount_field_placeholder_key);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, savingsTransferOptionPicker.prefilled_value);
        LinkTransferOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, savingsTransferOptionPicker.link_transfer_options);
        TransferOptionKind.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, savingsTransferOptionPicker.transfer_option_kinds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsTransferOptionPicker savingsTransferOptionPicker = (SavingsTransferOptionPicker) obj;
        savingsTransferOptionPicker.getClass();
        int encodedSizeWithTag = LinkTransferOption.ADAPTER.asRepeated().encodedSizeWithTag(2, savingsTransferOptionPicker.link_transfer_options) + TransferOptionKind.ADAPTER.asRepeated().encodedSizeWithTag(1, savingsTransferOptionPicker.transfer_option_kinds) + savingsTransferOptionPicker.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = PickerOptionRule.ADAPTER.asRepeated().encodedSizeWithTag(5, savingsTransferOptionPicker.option_rules) + protoAdapter.encodedSizeWithTag(4, savingsTransferOptionPicker.amount_field_placeholder_key) + protoAdapter.encodedSizeWithTag(3, savingsTransferOptionPicker.prefilled_value) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, savingsTransferOptionPicker.cta) + protoAdapter2.encodedSizeWithTag(6, savingsTransferOptionPicker.title_template) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsTransferOptionPicker savingsTransferOptionPicker = (SavingsTransferOptionPicker) obj;
        savingsTransferOptionPicker.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(savingsTransferOptionPicker.link_transfer_options, LinkTransferOption.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(savingsTransferOptionPicker.option_rules, PickerOptionRule.ADAPTER);
        LocalizedString localizedString = savingsTransferOptionPicker.title_template;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = savingsTransferOptionPicker.cta;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        List<TransferOptionKind> list = savingsTransferOptionPicker.transfer_option_kinds;
        String str = savingsTransferOptionPicker.prefilled_value;
        String str2 = savingsTransferOptionPicker.amount_field_placeholder_key;
        list.getClass();
        byteString.getClass();
        return new SavingsTransferOptionPicker(list, m1169redactElements, str, str2, m1169redactElements2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsTransferOptionPicker savingsTransferOptionPicker = (SavingsTransferOptionPicker) obj;
        savingsTransferOptionPicker.getClass();
        TransferOptionKind.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, savingsTransferOptionPicker.transfer_option_kinds);
        LinkTransferOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, savingsTransferOptionPicker.link_transfer_options);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, savingsTransferOptionPicker.prefilled_value);
        protoAdapter.encodeWithTag(protoWriter, 4, savingsTransferOptionPicker.amount_field_placeholder_key);
        PickerOptionRule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, savingsTransferOptionPicker.option_rules);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, savingsTransferOptionPicker.title_template);
        protoAdapter2.encodeWithTag(protoWriter, 7, savingsTransferOptionPicker.cta);
        protoWriter.writeBytes(savingsTransferOptionPicker.unknownFields());
    }
}
