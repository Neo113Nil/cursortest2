package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardProgramDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardProgramDetails((String) obj, m, arrayList, (String) obj2, (String) obj3, (UiRewardProgramDetails.BottomUpsell) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(UiRewardProgramDetails.DetailRow.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    arrayList.add(UiRewardProgramDetails.BoostDetail.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(UiRewardProgramDetails.BottomUpsell.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardProgramDetails uiRewardProgramDetails = (UiRewardProgramDetails) obj;
        reverseProtoWriter.getClass();
        uiRewardProgramDetails.getClass();
        reverseProtoWriter.writeBytes(uiRewardProgramDetails.unknownFields());
        UiRewardProgramDetails.BottomUpsell.ADAPTER.encodeWithTag(reverseProtoWriter, 6, uiRewardProgramDetails.bottom_upsell);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, uiRewardProgramDetails.styled_footer_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiRewardProgramDetails.footer_text);
        UiRewardProgramDetails.BoostDetail.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, uiRewardProgramDetails.boost_details);
        UiRewardProgramDetails.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, uiRewardProgramDetails.detail_rows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiRewardProgramDetails.reward_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardProgramDetails uiRewardProgramDetails = (UiRewardProgramDetails) obj;
        uiRewardProgramDetails.getClass();
        int size$okio = uiRewardProgramDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return UiRewardProgramDetails.BottomUpsell.ADAPTER.encodedSizeWithTag(6, uiRewardProgramDetails.bottom_upsell) + protoAdapter.encodedSizeWithTag(5, uiRewardProgramDetails.styled_footer_text) + protoAdapter.encodedSizeWithTag(3, uiRewardProgramDetails.footer_text) + UiRewardProgramDetails.BoostDetail.ADAPTER.asRepeated().encodedSizeWithTag(4, uiRewardProgramDetails.boost_details) + UiRewardProgramDetails.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(2, uiRewardProgramDetails.detail_rows) + protoAdapter.encodedSizeWithTag(1, uiRewardProgramDetails.reward_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardProgramDetails uiRewardProgramDetails = (UiRewardProgramDetails) obj;
        uiRewardProgramDetails.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiRewardProgramDetails.detail_rows, UiRewardProgramDetails.DetailRow.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(uiRewardProgramDetails.boost_details, UiRewardProgramDetails.BoostDetail.ADAPTER);
        UiRewardProgramDetails.BottomUpsell bottomUpsell = uiRewardProgramDetails.bottom_upsell;
        UiRewardProgramDetails.BottomUpsell bottomUpsell2 = bottomUpsell != null ? (UiRewardProgramDetails.BottomUpsell) UiRewardProgramDetails.BottomUpsell.ADAPTER.redact(bottomUpsell) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiRewardProgramDetails.reward_token;
        String str2 = uiRewardProgramDetails.footer_text;
        String str3 = uiRewardProgramDetails.styled_footer_text;
        byteString.getClass();
        return new UiRewardProgramDetails(str, m1169redactElements, m1169redactElements2, str2, str3, bottomUpsell2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardProgramDetails uiRewardProgramDetails = (UiRewardProgramDetails) obj;
        uiRewardProgramDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiRewardProgramDetails.reward_token);
        UiRewardProgramDetails.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, uiRewardProgramDetails.detail_rows);
        UiRewardProgramDetails.BoostDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, uiRewardProgramDetails.boost_details);
        protoAdapter.encodeWithTag(protoWriter, 3, uiRewardProgramDetails.footer_text);
        protoAdapter.encodeWithTag(protoWriter, 5, uiRewardProgramDetails.styled_footer_text);
        UiRewardProgramDetails.BottomUpsell.ADAPTER.encodeWithTag(protoWriter, 6, uiRewardProgramDetails.bottom_upsell);
        protoWriter.writeBytes(uiRewardProgramDetails.unknownFields());
    }
}
