package com.squareup.protos.cash.kgoose.api.v3;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem;", "", "", "graphic_paramsAdapter$delegate", "Lkotlin/Lazy;", "getGraphic_paramsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "graphic_paramsAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeedNextBestActionItem$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: graphic_paramsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy graphic_paramsAdapter;

    public SeedNextBestActionItem$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.SeedNextBestActionItem", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/cash/next_best_action_messages.proto");
        this.graphic_paramsAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long beginMessage = protoReader.beginMessage();
        ?? r4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Double d = r4;
            if (nextTag == -1) {
                return new SeedNextBestActionItem(str10, d, str, str2, str3, str4, str5, str6, str7, str8, m, str9, linkedHashMap, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    r4 = ProtoAdapter.DOUBLE.decode(protoReader);
                    continue;
                case 3:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 12:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 13:
                    linkedHashMap.putAll((Map) ((ProtoAdapter) this.graphic_paramsAdapter.getValue()).decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r4 = d;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SeedNextBestActionItem seedNextBestActionItem = (SeedNextBestActionItem) obj;
        reverseProtoWriter.getClass();
        seedNextBestActionItem.getClass();
        reverseProtoWriter.writeBytes(seedNextBestActionItem.unknownFields());
        ((ProtoAdapter) this.graphic_paramsAdapter.getValue()).encodeWithTag(reverseProtoWriter, 13, seedNextBestActionItem.graphic_params);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, seedNextBestActionItem.graphic_type);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 11, seedNextBestActionItem.transaction_types);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, seedNextBestActionItem.widget_primary_insight);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, seedNextBestActionItem.customer_kickoff_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, seedNextBestActionItem.hero_message_detail);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, seedNextBestActionItem.hero_message_cta_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, seedNextBestActionItem.hero_message_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, seedNextBestActionItem.hero_message_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, seedNextBestActionItem.category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, seedNextBestActionItem.reasoning);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, seedNextBestActionItem.importance_score);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, seedNextBestActionItem.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SeedNextBestActionItem seedNextBestActionItem = (SeedNextBestActionItem) obj;
        seedNextBestActionItem.getClass();
        int size$okio = seedNextBestActionItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ((ProtoAdapter) this.graphic_paramsAdapter.getValue()).encodedSizeWithTag(13, seedNextBestActionItem.graphic_params) + protoAdapter.encodedSizeWithTag(12, seedNextBestActionItem.graphic_type) + protoAdapter.asRepeated().encodedSizeWithTag(11, seedNextBestActionItem.transaction_types) + protoAdapter.encodedSizeWithTag(10, seedNextBestActionItem.widget_primary_insight) + protoAdapter.encodedSizeWithTag(9, seedNextBestActionItem.customer_kickoff_message) + protoAdapter.encodedSizeWithTag(8, seedNextBestActionItem.hero_message_detail) + protoAdapter.encodedSizeWithTag(7, seedNextBestActionItem.hero_message_cta_text) + protoAdapter.encodedSizeWithTag(6, seedNextBestActionItem.hero_message_subtitle) + protoAdapter.encodedSizeWithTag(5, seedNextBestActionItem.hero_message_title) + protoAdapter.encodedSizeWithTag(4, seedNextBestActionItem.category) + protoAdapter.encodedSizeWithTag(3, seedNextBestActionItem.reasoning) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, seedNextBestActionItem.importance_score) + protoAdapter.encodedSizeWithTag(1, seedNextBestActionItem.action) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SeedNextBestActionItem seedNextBestActionItem = (SeedNextBestActionItem) obj;
        seedNextBestActionItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = seedNextBestActionItem.action;
        Double d = seedNextBestActionItem.importance_score;
        String str2 = seedNextBestActionItem.reasoning;
        String str3 = seedNextBestActionItem.category;
        String str4 = seedNextBestActionItem.hero_message_title;
        String str5 = seedNextBestActionItem.hero_message_subtitle;
        String str6 = seedNextBestActionItem.hero_message_cta_text;
        String str7 = seedNextBestActionItem.hero_message_detail;
        String str8 = seedNextBestActionItem.customer_kickoff_message;
        String str9 = seedNextBestActionItem.widget_primary_insight;
        List<String> list = seedNextBestActionItem.transaction_types;
        String str10 = seedNextBestActionItem.graphic_type;
        Map<String, String> map = seedNextBestActionItem.graphic_params;
        list.getClass();
        map.getClass();
        byteString.getClass();
        return new SeedNextBestActionItem(str, d, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, map, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SeedNextBestActionItem seedNextBestActionItem = (SeedNextBestActionItem) obj;
        seedNextBestActionItem.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, seedNextBestActionItem.action);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, seedNextBestActionItem.importance_score);
        protoAdapter.encodeWithTag(protoWriter, 3, seedNextBestActionItem.reasoning);
        protoAdapter.encodeWithTag(protoWriter, 4, seedNextBestActionItem.category);
        protoAdapter.encodeWithTag(protoWriter, 5, seedNextBestActionItem.hero_message_title);
        protoAdapter.encodeWithTag(protoWriter, 6, seedNextBestActionItem.hero_message_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 7, seedNextBestActionItem.hero_message_cta_text);
        protoAdapter.encodeWithTag(protoWriter, 8, seedNextBestActionItem.hero_message_detail);
        protoAdapter.encodeWithTag(protoWriter, 9, seedNextBestActionItem.customer_kickoff_message);
        protoAdapter.encodeWithTag(protoWriter, 10, seedNextBestActionItem.widget_primary_insight);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, seedNextBestActionItem.transaction_types);
        protoAdapter.encodeWithTag(protoWriter, 12, seedNextBestActionItem.graphic_type);
        ((ProtoAdapter) this.graphic_paramsAdapter.getValue()).encodeWithTag(protoWriter, 13, seedNextBestActionItem.graphic_params);
        protoWriter.writeBytes(seedNextBestActionItem.unknownFields());
    }
}
