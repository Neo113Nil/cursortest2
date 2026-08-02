package com.squareup.protos.employeejobs;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.scheduling.ColorScheme;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Job$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
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
            if (nextTag == -1) {
                return new Job((String) obj4, (String) obj5, (String) obj6, (Wage) obj7, (Long) obj8, (Long) obj9, (Long) obj10, (Boolean) obj11, (ColorScheme) obj12, (Long) obj13, (Long) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(Wage.ADAPTER, protoReader, obj7);
                    continue;
                case 5:
                    obj8 = ProtoAdapter.UINT64.decode(protoReader);
                    continue;
                case 6:
                    obj9 = ProtoAdapter.UINT64.decode(protoReader);
                    continue;
                case 7:
                    obj10 = ProtoAdapter.UINT64.decode(protoReader);
                    continue;
                case 8:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 9:
                    try {
                        obj12 = ColorScheme.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    obj13 = ProtoAdapter.UINT64.decode(protoReader);
                    continue;
                case 11:
                    obj14 = ProtoAdapter.UINT64.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    break;
            }
            obj4 = obj;
            obj5 = obj2;
            obj6 = obj3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Job job = (Job) obj;
        reverseProtoWriter.getClass();
        job.getClass();
        reverseProtoWriter.writeBytes(job.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, job.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, job.team_member_count);
        ColorScheme.ADAPTER.encodeWithTag(reverseProtoWriter, 9, job.default_color_scheme);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, job.tip_eligible);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, job.deleted_at_timestamp_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, job.updated_at_timestamp_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, job.created_at_timestamp_ms);
        Wage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, job.default_wage);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, job.title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, job.merchant_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, job.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Job job = (Job) obj;
        job.getClass();
        int size$okio = job.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Wage.ADAPTER.encodedSizeWithTag(4, job.default_wage) + protoAdapter.encodedSizeWithTag(3, job.title) + protoAdapter.encodedSizeWithTag(2, job.merchant_token) + protoAdapter.encodedSizeWithTag(1, job.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        return protoAdapter2.encodedSizeWithTag(11, job.version) + protoAdapter2.encodedSizeWithTag(10, job.team_member_count) + ColorScheme.ADAPTER.encodedSizeWithTag(9, job.default_color_scheme) + ProtoAdapter.BOOL.encodedSizeWithTag(8, job.tip_eligible) + protoAdapter2.encodedSizeWithTag(7, job.deleted_at_timestamp_ms) + protoAdapter2.encodedSizeWithTag(6, job.updated_at_timestamp_ms) + protoAdapter2.encodedSizeWithTag(5, job.created_at_timestamp_ms) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Job job = (Job) obj;
        job.getClass();
        Wage wage = job.default_wage;
        Wage wage2 = wage != null ? (Wage) Wage.ADAPTER.redact(wage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = job.token;
        String str2 = job.merchant_token;
        Long l = job.created_at_timestamp_ms;
        Long l2 = job.updated_at_timestamp_ms;
        Long l3 = job.deleted_at_timestamp_ms;
        Boolean bool = job.tip_eligible;
        ColorScheme colorScheme = job.default_color_scheme;
        Long l4 = job.team_member_count;
        Long l5 = job.version;
        byteString.getClass();
        return new Job(str, str2, null, wage2, l, l2, l3, bool, colorScheme, l4, l5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Job job = (Job) obj;
        job.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, job.token);
        protoAdapter.encodeWithTag(protoWriter, 2, job.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 3, job.title);
        Wage.ADAPTER.encodeWithTag(protoWriter, 4, job.default_wage);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(protoWriter, 5, job.created_at_timestamp_ms);
        protoAdapter2.encodeWithTag(protoWriter, 6, job.updated_at_timestamp_ms);
        protoAdapter2.encodeWithTag(protoWriter, 7, job.deleted_at_timestamp_ms);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, job.tip_eligible);
        ColorScheme.ADAPTER.encodeWithTag(protoWriter, 9, job.default_color_scheme);
        protoAdapter2.encodeWithTag(protoWriter, 10, job.team_member_count);
        protoAdapter2.encodeWithTag(protoWriter, 11, job.version);
        protoWriter.writeBytes(job.unknownFields());
    }
}
