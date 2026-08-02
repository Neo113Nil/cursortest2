package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PromptButton$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptButton;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PromptButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PromptButton((String) obj, (LocalizedString) obj2, (LocalizedString) obj3, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                m.add(CdfEvent.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(CdfEvent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PromptButton promptButton = (PromptButton) obj;
        reverseProtoWriter.getClass();
        promptButton.getClass();
        reverseProtoWriter.writeBytes(promptButton.unknownFields());
        ProtoAdapter protoAdapter = CdfEvent.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, promptButton.tap_cdf_events);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, promptButton.view_cdf_events);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, promptButton.prompt);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, promptButton.text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, promptButton.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PromptButton promptButton = (PromptButton) obj;
        promptButton.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, promptButton.id) + promptButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, promptButton.prompt) + protoAdapter.encodedSizeWithTag(2, promptButton.text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        return protoAdapter2.asRepeated().encodedSizeWithTag(5, promptButton.tap_cdf_events) + protoAdapter2.asRepeated().encodedSizeWithTag(4, promptButton.view_cdf_events) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PromptButton promptButton = (PromptButton) obj;
        promptButton.getClass();
        LocalizedString localizedString = promptButton.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = promptButton.prompt;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        List<CdfEvent> list = promptButton.view_cdf_events;
        ProtoAdapter protoAdapter = CdfEvent.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(promptButton.tap_cdf_events, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        String str = promptButton.id;
        byteString.getClass();
        return new PromptButton(str, localizedString2, localizedString4, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PromptButton promptButton = (PromptButton) obj;
        promptButton.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, promptButton.id);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, promptButton.text);
        protoAdapter.encodeWithTag(protoWriter, 3, promptButton.prompt);
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, promptButton.view_cdf_events);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, promptButton.tap_cdf_events);
        protoWriter.writeBytes(promptButton.unknownFields());
    }
}
