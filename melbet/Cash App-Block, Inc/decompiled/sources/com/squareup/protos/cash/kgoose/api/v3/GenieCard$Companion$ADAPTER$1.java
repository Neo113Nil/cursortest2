package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.GenieCard;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;
import xyz.block.protos.genie.ViewPlan;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GenieCard$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GenieCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenieCard((ViewPlan) obj, (LocalizedString) obj2, (String) obj3, (String) obj4, (GenieCard.SceneInputs) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ViewPlan.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(GenieCard.SceneInputs.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenieCard genieCard = (GenieCard) obj;
        reverseProtoWriter.getClass();
        genieCard.getClass();
        reverseProtoWriter.writeBytes(genieCard.unknownFields());
        GenieCard.SceneInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 5, genieCard.scene_inputs);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, genieCard.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, genieCard.scene_slug);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, genieCard.fallback_text);
        ViewPlan.ADAPTER.encodeWithTag(reverseProtoWriter, 1, genieCard.view_plan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenieCard genieCard = (GenieCard) obj;
        genieCard.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(2, genieCard.fallback_text) + ViewPlan.ADAPTER.encodedSizeWithTag(1, genieCard.view_plan) + genieCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return GenieCard.SceneInputs.ADAPTER.encodedSizeWithTag(5, genieCard.scene_inputs) + protoAdapter.encodedSizeWithTag(4, genieCard.description) + protoAdapter.encodedSizeWithTag(3, genieCard.scene_slug) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenieCard genieCard = (GenieCard) obj;
        genieCard.getClass();
        ViewPlan viewPlan = genieCard.view_plan;
        ViewPlan viewPlan2 = viewPlan != null ? (ViewPlan) ViewPlan.ADAPTER.redact(viewPlan) : null;
        LocalizedString localizedString = genieCard.fallback_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        GenieCard.SceneInputs sceneInputs = genieCard.scene_inputs;
        GenieCard.SceneInputs sceneInputs2 = sceneInputs != null ? (GenieCard.SceneInputs) GenieCard.SceneInputs.ADAPTER.redact(sceneInputs) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = genieCard.scene_slug;
        String str2 = genieCard.description;
        byteString.getClass();
        return new GenieCard(viewPlan2, localizedString2, str, str2, sceneInputs2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenieCard genieCard = (GenieCard) obj;
        genieCard.getClass();
        ViewPlan.ADAPTER.encodeWithTag(protoWriter, 1, genieCard.view_plan);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, genieCard.fallback_text);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, genieCard.scene_slug);
        protoAdapter.encodeWithTag(protoWriter, 4, genieCard.description);
        GenieCard.SceneInputs.ADAPTER.encodeWithTag(protoWriter, 5, genieCard.scene_inputs);
        protoWriter.writeBytes(genieCard.unknownFields());
    }
}
