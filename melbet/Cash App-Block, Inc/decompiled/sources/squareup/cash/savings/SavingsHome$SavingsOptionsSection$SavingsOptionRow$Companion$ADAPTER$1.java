package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes8.dex */
public final class SavingsHome$SavingsOptionsSection$SavingsOptionRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome.SavingsOptionsSection.SavingsOptionRow((SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage) obj3, (String) obj4, (LocalizableString) obj5, (String) obj6, (LocalizableString) obj7, (SavingsAction) obj8, (String) obj9, (LocalizableString) obj10, (CdfEvent) obj11, (String) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj3 = SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj8 = TransactorKt.decodeMessageOrMerge(SavingsAction.ADAPTER, protoReader, obj8);
                    continue;
                case 5:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    obj11 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj11);
                    continue;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    continue;
                case 8:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
                case 9:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj10);
                    continue;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    continue;
                case 11:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
            }
            obj4 = obj2;
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.SavingsOptionsSection.SavingsOptionRow savingsOptionRow = (SavingsHome.SavingsOptionsSection.SavingsOptionRow) obj;
        reverseProtoWriter.getClass();
        savingsOptionRow.getClass();
        reverseProtoWriter.writeBytes(savingsOptionRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, savingsOptionRow.row_id);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, savingsOptionRow.cdfEvent);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, savingsOptionRow.localizable_accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, savingsOptionRow.accessibility_text);
        SavingsAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsOptionRow.action);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, savingsOptionRow.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsOptionRow.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, savingsOptionRow.localizable_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, savingsOptionRow.title);
        SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsOptionRow.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.SavingsOptionsSection.SavingsOptionRow savingsOptionRow = (SavingsHome.SavingsOptionsSection.SavingsOptionRow) obj;
        savingsOptionRow.getClass();
        int encodedSizeWithTag = SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.ADAPTER.encodedSizeWithTag(1, savingsOptionRow.image) + savingsOptionRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, savingsOptionRow.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(11, savingsOptionRow.row_id) + CdfEvent.ADAPTER.encodedSizeWithTag(6, savingsOptionRow.cdfEvent) + protoAdapter2.encodedSizeWithTag(9, savingsOptionRow.localizable_accessibility_text) + protoAdapter.encodedSizeWithTag(5, savingsOptionRow.accessibility_text) + SavingsAction.ADAPTER.encodedSizeWithTag(4, savingsOptionRow.action) + protoAdapter2.encodedSizeWithTag(10, savingsOptionRow.localizable_subtitle) + protoAdapter.encodedSizeWithTag(3, savingsOptionRow.subtitle) + protoAdapter2.encodedSizeWithTag(7, savingsOptionRow.localizable_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.SavingsOptionsSection.SavingsOptionRow savingsOptionRow = (SavingsHome.SavingsOptionsSection.SavingsOptionRow) obj;
        savingsOptionRow.getClass();
        LocalizableString localizableString = savingsOptionRow.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = savingsOptionRow.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        SavingsAction savingsAction = savingsOptionRow.action;
        SavingsAction savingsAction2 = savingsAction != null ? (SavingsAction) SavingsAction.ADAPTER.redact(savingsAction) : null;
        LocalizableString localizableString5 = savingsOptionRow.localizable_accessibility_text;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        CdfEvent cdfEvent = savingsOptionRow.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage rowImage = savingsOptionRow.image;
        String str = savingsOptionRow.title;
        String str2 = savingsOptionRow.subtitle;
        String str3 = savingsOptionRow.accessibility_text;
        String str4 = savingsOptionRow.row_id;
        byteString.getClass();
        return new SavingsHome.SavingsOptionsSection.SavingsOptionRow(rowImage, str, localizableString2, str2, localizableString4, savingsAction2, str3, localizableString6, cdfEvent2, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.SavingsOptionsSection.SavingsOptionRow savingsOptionRow = (SavingsHome.SavingsOptionsSection.SavingsOptionRow) obj;
        savingsOptionRow.getClass();
        SavingsHome.SavingsOptionsSection.SavingsOptionRow.RowImage.ADAPTER.encodeWithTag(protoWriter, 1, savingsOptionRow.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, savingsOptionRow.title);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, savingsOptionRow.localizable_title);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsOptionRow.subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 10, savingsOptionRow.localizable_subtitle);
        SavingsAction.ADAPTER.encodeWithTag(protoWriter, 4, savingsOptionRow.action);
        protoAdapter.encodeWithTag(protoWriter, 5, savingsOptionRow.accessibility_text);
        protoAdapter2.encodeWithTag(protoWriter, 9, savingsOptionRow.localizable_accessibility_text);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 6, savingsOptionRow.cdfEvent);
        protoAdapter.encodeWithTag(protoWriter, 11, savingsOptionRow.row_id);
        protoWriter.writeBytes(savingsOptionRow.unknownFields());
    }
}
