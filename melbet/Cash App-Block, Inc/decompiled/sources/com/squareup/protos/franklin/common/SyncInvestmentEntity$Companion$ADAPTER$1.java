package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        InvestmentEntityType investmentEntityType;
        String str;
        Long l;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        Object obj = null;
        Object obj2 = null;
        InvestmentEntityType investmentEntityType2 = null;
        String str3 = null;
        Long l2 = null;
        InvestmentEntityStatus investmentEntityStatus = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Object obj3 = null;
        String str6 = null;
        SyncInvestmentEntity.ReleaseStage releaseStage = null;
        String str7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentEntity(str2, str6, str7, investmentEntityType2, str3, l2, investmentEntityStatus, str4, str5, m, bool, (Color) obj3, (Image) obj, (Color) obj2, releaseStage, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 3:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 4:
                    investmentEntityType = investmentEntityType2;
                    str = str3;
                    l = l2;
                    try {
                        investmentEntityType2 = InvestmentEntityType.ADAPTER.decode(protoReader);
                        str3 = str;
                        l2 = l;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 6:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 7:
                    investmentEntityType = investmentEntityType2;
                    str = str3;
                    l = l2;
                    try {
                        investmentEntityStatus = InvestmentEntityStatus.ADAPTER.decode(protoReader);
                        investmentEntityType2 = investmentEntityType;
                        str3 = str;
                        l2 = l;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 9:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 10:
                    investmentEntityType = investmentEntityType2;
                    str = str3;
                    l = l2;
                    m.add(SyncInvestmentEntity.DetailRow.ADAPTER.decode(protoReader));
                    decode = str2;
                    investmentEntityType2 = investmentEntityType;
                    str3 = str;
                    l2 = l;
                    break;
                case 11:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 12:
                    obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
                    decode = str2;
                    break;
                case 13:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    decode = str2;
                    break;
                case 14:
                    obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
                    decode = str2;
                    break;
                case 15:
                    try {
                        releaseStage = SyncInvestmentEntity.ReleaseStage.ADAPTER.decode(protoReader);
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        investmentEntityType = investmentEntityType2;
                        str = str3;
                        l = l2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    investmentEntityType = investmentEntityType2;
                    str = str3;
                    l = l2;
                    decode = str2;
                    investmentEntityType2 = investmentEntityType;
                    str3 = str;
                    l2 = l;
                    break;
            }
            str2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentEntity syncInvestmentEntity = (SyncInvestmentEntity) obj;
        reverseProtoWriter.getClass();
        syncInvestmentEntity.getClass();
        reverseProtoWriter.writeBytes(syncInvestmentEntity.unknownFields());
        SyncInvestmentEntity.ReleaseStage.ADAPTER.encodeWithTag(reverseProtoWriter, 15, syncInvestmentEntity.release_stage);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, syncInvestmentEntity.themed_color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 13, syncInvestmentEntity.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, syncInvestmentEntity.entity_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, syncInvestmentEntity.delisted);
        SyncInvestmentEntity.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, syncInvestmentEntity.about_detail_rows);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, syncInvestmentEntity.about_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, syncInvestmentEntity.color);
        InvestmentEntityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 7, syncInvestmentEntity.status);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, syncInvestmentEntity.outstanding_shares);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, syncInvestmentEntity.icon_url);
        InvestmentEntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, syncInvestmentEntity.f1391type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, syncInvestmentEntity.display_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, syncInvestmentEntity.symbol);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, syncInvestmentEntity.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentEntity syncInvestmentEntity = (SyncInvestmentEntity) obj;
        syncInvestmentEntity.getClass();
        int size$okio = syncInvestmentEntity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(11, syncInvestmentEntity.delisted) + SyncInvestmentEntity.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(10, syncInvestmentEntity.about_detail_rows) + protoAdapter.encodedSizeWithTag(9, syncInvestmentEntity.about_text) + protoAdapter.encodedSizeWithTag(8, syncInvestmentEntity.color) + InvestmentEntityStatus.ADAPTER.encodedSizeWithTag(7, syncInvestmentEntity.status) + ProtoAdapter.INT64.encodedSizeWithTag(6, syncInvestmentEntity.outstanding_shares) + protoAdapter.encodedSizeWithTag(5, syncInvestmentEntity.icon_url) + InvestmentEntityType.ADAPTER.encodedSizeWithTag(4, syncInvestmentEntity.f1391type) + protoAdapter.encodedSizeWithTag(3, syncInvestmentEntity.display_name) + protoAdapter.encodedSizeWithTag(2, syncInvestmentEntity.symbol) + protoAdapter.encodedSizeWithTag(1, syncInvestmentEntity.token) + size$okio;
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        return SyncInvestmentEntity.ReleaseStage.ADAPTER.encodedSizeWithTag(15, syncInvestmentEntity.release_stage) + protoAdapter2.encodedSizeWithTag(14, syncInvestmentEntity.themed_color) + Image.ADAPTER.encodedSizeWithTag(13, syncInvestmentEntity.icon) + protoAdapter2.encodedSizeWithTag(12, syncInvestmentEntity.entity_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentEntity syncInvestmentEntity = (SyncInvestmentEntity) obj;
        syncInvestmentEntity.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(syncInvestmentEntity.about_detail_rows, SyncInvestmentEntity.DetailRow.ADAPTER);
        Color color = syncInvestmentEntity.entity_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Image image = syncInvestmentEntity.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color3 = syncInvestmentEntity.themed_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = syncInvestmentEntity.token;
        String str2 = syncInvestmentEntity.symbol;
        String str3 = syncInvestmentEntity.display_name;
        InvestmentEntityType investmentEntityType = syncInvestmentEntity.f1391type;
        String str4 = syncInvestmentEntity.icon_url;
        Long l = syncInvestmentEntity.outstanding_shares;
        InvestmentEntityStatus investmentEntityStatus = syncInvestmentEntity.status;
        String str5 = syncInvestmentEntity.color;
        String str6 = syncInvestmentEntity.about_text;
        Boolean bool = syncInvestmentEntity.delisted;
        SyncInvestmentEntity.ReleaseStage releaseStage = syncInvestmentEntity.release_stage;
        byteString.getClass();
        return new SyncInvestmentEntity(str, str2, str3, investmentEntityType, str4, l, investmentEntityStatus, str5, str6, m1169redactElements, bool, color2, image2, color4, releaseStage, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentEntity syncInvestmentEntity = (SyncInvestmentEntity) obj;
        syncInvestmentEntity.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncInvestmentEntity.token);
        protoAdapter.encodeWithTag(protoWriter, 2, syncInvestmentEntity.symbol);
        protoAdapter.encodeWithTag(protoWriter, 3, syncInvestmentEntity.display_name);
        InvestmentEntityType.ADAPTER.encodeWithTag(protoWriter, 4, syncInvestmentEntity.f1391type);
        protoAdapter.encodeWithTag(protoWriter, 5, syncInvestmentEntity.icon_url);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, syncInvestmentEntity.outstanding_shares);
        InvestmentEntityStatus.ADAPTER.encodeWithTag(protoWriter, 7, syncInvestmentEntity.status);
        protoAdapter.encodeWithTag(protoWriter, 8, syncInvestmentEntity.color);
        protoAdapter.encodeWithTag(protoWriter, 9, syncInvestmentEntity.about_text);
        SyncInvestmentEntity.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, syncInvestmentEntity.about_detail_rows);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, syncInvestmentEntity.delisted);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 12, syncInvestmentEntity.entity_color);
        Image.ADAPTER.encodeWithTag(protoWriter, 13, syncInvestmentEntity.icon);
        protoAdapter2.encodeWithTag(protoWriter, 14, syncInvestmentEntity.themed_color);
        SyncInvestmentEntity.ReleaseStage.ADAPTER.encodeWithTag(protoWriter, 15, syncInvestmentEntity.release_stage);
        protoWriter.writeBytes(syncInvestmentEntity.unknownFields());
    }
}
