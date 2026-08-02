package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Cell$Options$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.AppletRow.Cell.Options((LocalizedString) obj2, (LocalizedString) obj3, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PrepurchaseAfterpayAppletData.AppletRow.Cell.Option.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Options options = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Options) obj;
        reverseProtoWriter.getClass();
        options.getClass();
        reverseProtoWriter.writeBytes(options.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, options.screen_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, options.screen_title);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, options.selected_option_id);
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Option.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, options.options);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Options options = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Options) obj;
        options.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, options.selected_option_id) + PrepurchaseAfterpayAppletData.AppletRow.Cell.Option.ADAPTER.asRepeated().encodedSizeWithTag(1, options.options) + options.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, options.screen_subtitle) + protoAdapter.encodedSizeWithTag(3, options.screen_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Options options = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Options) obj;
        options.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(options.options, PrepurchaseAfterpayAppletData.AppletRow.Cell.Option.ADAPTER);
        LocalizedString localizedString = options.screen_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = options.screen_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = options.selected_option_id;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.AppletRow.Cell.Options(localizedString2, localizedString4, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Options options = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Options) obj;
        options.getClass();
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Option.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, options.options);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, options.selected_option_id);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, options.screen_title);
        protoAdapter.encodeWithTag(protoWriter, 4, options.screen_subtitle);
        protoWriter.writeBytes(options.unknownFields());
    }
}
