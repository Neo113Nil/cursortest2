package com.squareup.protos.cash.cashidv.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IdvEndResultScreenConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
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
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj15 = obj3;
            if (nextTag == -1) {
                return new IdvEndResultScreenConfig((Boolean) obj2, (String) obj15, (String) obj4, (String) obj5, (String) obj6, (Button) obj7, (Button) obj8, (Button) obj9, (Button) obj10, (Boolean) obj11, (Button) obj12, (Boolean) obj13, (Boolean) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj15;
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj15;
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj7);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj8);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj9);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj10);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 11:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 12:
                    obj12 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj12);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 13:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj15;
                    obj = obj2;
                    break;
                case 14:
                    obj14 = ProtoAdapter.BOOL.decode(protoReader);
                    obj3 = obj15;
                    obj = obj2;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        reverseProtoWriter.getClass();
        idvEndResultScreenConfig.getClass();
        reverseProtoWriter.writeBytes(idvEndResultScreenConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, idvEndResultScreenConfig.show_idv_end_result_screen_on_didv_cancel_failure);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, idvEndResultScreenConfig.suppress_CTA_component);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, idvEndResultScreenConfig.denylist_secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, idvEndResultScreenConfig.suppress_primary_button_on_idv_attempt_exhausted);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, idvEndResultScreenConfig.custom_didv_in_review_primary_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, idvEndResultScreenConfig.custom_didv_failure_primary_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, idvEndResultScreenConfig.didv_in_review_secondary_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, idvEndResultScreenConfig.didv_failure_secondary_button);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, idvEndResultScreenConfig.custom_verified_subtext);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, idvEndResultScreenConfig.custom_didv_in_review_subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, idvEndResultScreenConfig.custom_didv_failure_subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, idvEndResultScreenConfig.custom_didv_verified_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        idvEndResultScreenConfig.getClass();
        int size$okio = idvEndResultScreenConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, idvEndResultScreenConfig.custom_verified_subtext) + protoAdapter2.encodedSizeWithTag(4, idvEndResultScreenConfig.custom_didv_in_review_subtitle) + protoAdapter2.encodedSizeWithTag(3, idvEndResultScreenConfig.custom_didv_failure_subtitle) + protoAdapter2.encodedSizeWithTag(2, idvEndResultScreenConfig.custom_didv_verified_subtitle) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(14, idvEndResultScreenConfig.show_idv_end_result_screen_on_didv_cancel_failure) + protoAdapter.encodedSizeWithTag(13, idvEndResultScreenConfig.suppress_CTA_component) + protoAdapter3.encodedSizeWithTag(12, idvEndResultScreenConfig.denylist_secondary_button) + protoAdapter.encodedSizeWithTag(11, idvEndResultScreenConfig.suppress_primary_button_on_idv_attempt_exhausted) + protoAdapter3.encodedSizeWithTag(10, idvEndResultScreenConfig.custom_didv_in_review_primary_button) + protoAdapter3.encodedSizeWithTag(9, idvEndResultScreenConfig.custom_didv_failure_primary_button) + protoAdapter3.encodedSizeWithTag(8, idvEndResultScreenConfig.didv_in_review_secondary_button) + protoAdapter3.encodedSizeWithTag(7, idvEndResultScreenConfig.didv_failure_secondary_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        idvEndResultScreenConfig.getClass();
        Button button = idvEndResultScreenConfig.didv_failure_secondary_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = idvEndResultScreenConfig.didv_in_review_secondary_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        Button button5 = idvEndResultScreenConfig.custom_didv_failure_primary_button;
        Button button6 = button5 != null ? (Button) Button.ADAPTER.redact(button5) : null;
        Button button7 = idvEndResultScreenConfig.custom_didv_in_review_primary_button;
        Button button8 = button7 != null ? (Button) Button.ADAPTER.redact(button7) : null;
        Button button9 = idvEndResultScreenConfig.denylist_secondary_button;
        Button button10 = button9 != null ? (Button) Button.ADAPTER.redact(button9) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status;
        String str = idvEndResultScreenConfig.custom_didv_verified_subtitle;
        String str2 = idvEndResultScreenConfig.custom_didv_failure_subtitle;
        String str3 = idvEndResultScreenConfig.custom_didv_in_review_subtitle;
        String str4 = idvEndResultScreenConfig.custom_verified_subtext;
        Boolean bool2 = idvEndResultScreenConfig.suppress_primary_button_on_idv_attempt_exhausted;
        Boolean bool3 = idvEndResultScreenConfig.suppress_CTA_component;
        Boolean bool4 = idvEndResultScreenConfig.show_idv_end_result_screen_on_didv_cancel_failure;
        byteString.getClass();
        return new IdvEndResultScreenConfig(bool, str, str2, str3, str4, button2, button4, button6, button8, bool2, button10, bool3, bool4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        idvEndResultScreenConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, idvEndResultScreenConfig.custom_didv_verified_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 3, idvEndResultScreenConfig.custom_didv_failure_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 4, idvEndResultScreenConfig.custom_didv_in_review_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 5, idvEndResultScreenConfig.custom_verified_subtext);
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 7, idvEndResultScreenConfig.didv_failure_secondary_button);
        protoAdapter3.encodeWithTag(protoWriter, 8, idvEndResultScreenConfig.didv_in_review_secondary_button);
        protoAdapter3.encodeWithTag(protoWriter, 9, idvEndResultScreenConfig.custom_didv_failure_primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 10, idvEndResultScreenConfig.custom_didv_in_review_primary_button);
        protoAdapter.encodeWithTag(protoWriter, 11, idvEndResultScreenConfig.suppress_primary_button_on_idv_attempt_exhausted);
        protoAdapter3.encodeWithTag(protoWriter, 12, idvEndResultScreenConfig.denylist_secondary_button);
        protoAdapter.encodeWithTag(protoWriter, 13, idvEndResultScreenConfig.suppress_CTA_component);
        protoAdapter.encodeWithTag(protoWriter, 14, idvEndResultScreenConfig.show_idv_end_result_screen_on_didv_cancel_failure);
        protoWriter.writeBytes(idvEndResultScreenConfig.unknownFields());
    }
}
