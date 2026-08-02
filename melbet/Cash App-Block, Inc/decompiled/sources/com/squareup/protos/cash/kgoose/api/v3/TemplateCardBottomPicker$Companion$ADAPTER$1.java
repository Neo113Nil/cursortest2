package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardBottomPicker;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardBottomPicker$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        TemplateCardBottomPicker.Source source = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardBottomPicker((String) obj, (LocalizedString) obj2, source, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                source = new TemplateCardBottomPicker.Source.P2pTransferOptionPicker((P2PTransferOptionPicker) P2PTransferOptionPicker.ADAPTER.decode(protoReader));
            } else if (nextTag == 5) {
                source = new TemplateCardBottomPicker.Source.StaticSource((StaticPickerSource) StaticPickerSource.ADAPTER.decode(protoReader));
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                source = new TemplateCardBottomPicker.Source.SavingsTransferOptionPicker((SavingsTransferOptionPicker) SavingsTransferOptionPicker.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardBottomPicker templateCardBottomPicker = (TemplateCardBottomPicker) obj;
        reverseProtoWriter.getClass();
        templateCardBottomPicker.getClass();
        reverseProtoWriter.writeBytes(templateCardBottomPicker.unknownFields());
        TemplateCardBottomPicker.Source source = templateCardBottomPicker.source;
        if (source instanceof TemplateCardBottomPicker.Source.StaticSource) {
            StaticPickerSource.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((TemplateCardBottomPicker.Source.StaticSource) source).getValue());
        } else if (source instanceof TemplateCardBottomPicker.Source.P2pTransferOptionPicker) {
            P2PTransferOptionPicker.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((TemplateCardBottomPicker.Source.P2pTransferOptionPicker) source).getValue());
        } else if (source instanceof TemplateCardBottomPicker.Source.SavingsTransferOptionPicker) {
            SavingsTransferOptionPicker.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((TemplateCardBottomPicker.Source.SavingsTransferOptionPicker) source).getValue());
        } else if (source != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, templateCardBottomPicker.accessibility_label);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, templateCardBottomPicker.placeholder_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        TemplateCardBottomPicker templateCardBottomPicker = (TemplateCardBottomPicker) obj;
        templateCardBottomPicker.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(2, templateCardBottomPicker.accessibility_label) + ProtoAdapter.STRING.encodedSizeWithTag(1, templateCardBottomPicker.placeholder_key) + templateCardBottomPicker.unknownFields().getSize$okio();
        TemplateCardBottomPicker.Source source = templateCardBottomPicker.source;
        if (source instanceof TemplateCardBottomPicker.Source.StaticSource) {
            encodedSizeWithTag = StaticPickerSource.ADAPTER.encodedSizeWithTag(5, ((TemplateCardBottomPicker.Source.StaticSource) source).getValue());
        } else if (source instanceof TemplateCardBottomPicker.Source.P2pTransferOptionPicker) {
            encodedSizeWithTag = P2PTransferOptionPicker.ADAPTER.encodedSizeWithTag(3, ((TemplateCardBottomPicker.Source.P2pTransferOptionPicker) source).getValue());
        } else {
            if (!(source instanceof TemplateCardBottomPicker.Source.SavingsTransferOptionPicker)) {
                if (source == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SavingsTransferOptionPicker.ADAPTER.encodedSizeWithTag(6, ((TemplateCardBottomPicker.Source.SavingsTransferOptionPicker) source).getValue());
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardBottomPicker templateCardBottomPicker = (TemplateCardBottomPicker) obj;
        templateCardBottomPicker.getClass();
        LocalizedString localizedString = templateCardBottomPicker.accessibility_label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = templateCardBottomPicker.placeholder_key;
        TemplateCardBottomPicker.Source source = templateCardBottomPicker.source;
        byteString.getClass();
        return new TemplateCardBottomPicker(str, localizedString2, source, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardBottomPicker templateCardBottomPicker = (TemplateCardBottomPicker) obj;
        templateCardBottomPicker.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, templateCardBottomPicker.placeholder_key);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, templateCardBottomPicker.accessibility_label);
        TemplateCardBottomPicker.Source source = templateCardBottomPicker.source;
        if (source instanceof TemplateCardBottomPicker.Source.StaticSource) {
            StaticPickerSource.ADAPTER.encodeWithTag(protoWriter, 5, ((TemplateCardBottomPicker.Source.StaticSource) source).getValue());
        } else if (source instanceof TemplateCardBottomPicker.Source.P2pTransferOptionPicker) {
            P2PTransferOptionPicker.ADAPTER.encodeWithTag(protoWriter, 3, ((TemplateCardBottomPicker.Source.P2pTransferOptionPicker) source).getValue());
        } else if (source instanceof TemplateCardBottomPicker.Source.SavingsTransferOptionPicker) {
            SavingsTransferOptionPicker.ADAPTER.encodeWithTag(protoWriter, 6, ((TemplateCardBottomPicker.Source.SavingsTransferOptionPicker) source).getValue());
        } else if (source != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(templateCardBottomPicker.unknownFields());
    }
}
