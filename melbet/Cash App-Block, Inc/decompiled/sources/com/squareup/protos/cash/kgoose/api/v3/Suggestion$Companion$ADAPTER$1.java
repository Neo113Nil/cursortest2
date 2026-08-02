package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.Suggestion;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Suggestion$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Suggestion;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Suggestion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Suggestion.Icon icon = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Suggestion((String) obj, (String) obj2, icon, (String) obj3, (String) obj4, (String) obj5, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    icon = new Suggestion.Icon.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    icon = new Suggestion.Icon.Image((Image) Image.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    m.add(CdfEvent.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    arrayList.add(CdfEvent.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Suggestion suggestion = (Suggestion) obj;
        reverseProtoWriter.getClass();
        suggestion.getClass();
        reverseProtoWriter.writeBytes(suggestion.unknownFields());
        Suggestion.Icon icon = suggestion.icon;
        if (icon instanceof Suggestion.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Suggestion.Icon.Avatar) icon).getValue());
        } else if (icon instanceof Suggestion.Icon.Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((Suggestion.Icon.Image) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = CdfEvent.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 9, suggestion.tap_cdf_events);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 8, suggestion.view_cdf_events);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, suggestion.id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, suggestion.prompt);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, suggestion.campaign_category);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, suggestion.label_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, suggestion.body_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Suggestion suggestion = (Suggestion) obj;
        suggestion.getClass();
        int size$okio = suggestion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, suggestion.label_text) + protoAdapter.encodedSizeWithTag(1, suggestion.body_text) + size$okio;
        Suggestion.Icon icon = suggestion.icon;
        if (icon instanceof Suggestion.Icon.Avatar) {
            encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(3, ((Suggestion.Icon.Avatar) icon).getValue());
        } else {
            if (!(icon instanceof Suggestion.Icon.Image)) {
                if (icon != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(7, suggestion.id) + protoAdapter.encodedSizeWithTag(5, suggestion.prompt) + protoAdapter.encodedSizeWithTag(4, suggestion.campaign_category) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
                return protoAdapter2.asRepeated().encodedSizeWithTag(9, suggestion.tap_cdf_events) + protoAdapter2.asRepeated().encodedSizeWithTag(8, suggestion.view_cdf_events) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(6, ((Suggestion.Icon.Image) icon).getValue());
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        int encodedSizeWithTag32 = protoAdapter.encodedSizeWithTag(7, suggestion.id) + protoAdapter.encodedSizeWithTag(5, suggestion.prompt) + protoAdapter.encodedSizeWithTag(4, suggestion.campaign_category) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = CdfEvent.ADAPTER;
        return protoAdapter22.asRepeated().encodedSizeWithTag(9, suggestion.tap_cdf_events) + protoAdapter22.asRepeated().encodedSizeWithTag(8, suggestion.view_cdf_events) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Suggestion suggestion = (Suggestion) obj;
        suggestion.getClass();
        List<CdfEvent> list = suggestion.view_cdf_events;
        ProtoAdapter protoAdapter = CdfEvent.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(suggestion.tap_cdf_events, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        String str = suggestion.body_text;
        String str2 = suggestion.label_text;
        Suggestion.Icon icon = suggestion.icon;
        String str3 = suggestion.campaign_category;
        String str4 = suggestion.prompt;
        String str5 = suggestion.id;
        byteString.getClass();
        return new Suggestion(str, str2, icon, str3, str4, str5, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Suggestion suggestion = (Suggestion) obj;
        suggestion.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, suggestion.body_text);
        protoAdapter.encodeWithTag(protoWriter, 2, suggestion.label_text);
        protoAdapter.encodeWithTag(protoWriter, 4, suggestion.campaign_category);
        protoAdapter.encodeWithTag(protoWriter, 5, suggestion.prompt);
        protoAdapter.encodeWithTag(protoWriter, 7, suggestion.id);
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 8, suggestion.view_cdf_events);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 9, suggestion.tap_cdf_events);
        Suggestion.Icon icon = suggestion.icon;
        if (icon instanceof Suggestion.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 3, ((Suggestion.Icon.Avatar) icon).getValue());
        } else if (icon instanceof Suggestion.Icon.Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 6, ((Suggestion.Icon.Image) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(suggestion.unknownFields());
    }
}
