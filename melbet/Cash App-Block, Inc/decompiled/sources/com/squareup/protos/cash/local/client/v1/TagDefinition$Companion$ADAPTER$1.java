package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.squareup.protos.cash.local.client.v1.TagDefinition;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TagDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzjf zzjfVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TagDefinition((String) obj, zzjfVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                zzjfVar = new TagDefinition$FilterType$Membership((TagDefinition.Membership) TagDefinition.Membership.ADAPTER.decode(protoReader));
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjfVar = new TagDefinition$FilterType$OpenNow((TagDefinition.OpenNow) TagDefinition.OpenNow.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TagDefinition tagDefinition = (TagDefinition) obj;
        reverseProtoWriter.getClass();
        tagDefinition.getClass();
        reverseProtoWriter.writeBytes(tagDefinition.unknownFields());
        zzjf zzjfVar = tagDefinition.filter_type;
        if (zzjfVar instanceof TagDefinition$FilterType$Membership) {
            TagDefinition.Membership.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((TagDefinition$FilterType$Membership) zzjfVar).value);
        } else if (zzjfVar instanceof TagDefinition$FilterType$OpenNow) {
            TagDefinition.OpenNow.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((TagDefinition$FilterType$OpenNow) zzjfVar).value);
        } else if (zzjfVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, tagDefinition.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TagDefinition tagDefinition = (TagDefinition) obj;
        tagDefinition.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, tagDefinition.label) + tagDefinition.unknownFields().getSize$okio();
        zzjf zzjfVar = tagDefinition.filter_type;
        if (zzjfVar instanceof TagDefinition$FilterType$Membership) {
            return TagDefinition.Membership.ADAPTER.encodedSizeWithTag(5, ((TagDefinition$FilterType$Membership) zzjfVar).value) + encodedSizeWithTag;
        }
        if (zzjfVar instanceof TagDefinition$FilterType$OpenNow) {
            return TagDefinition.OpenNow.ADAPTER.encodedSizeWithTag(6, ((TagDefinition$FilterType$OpenNow) zzjfVar).value) + encodedSizeWithTag;
        }
        if (zzjfVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TagDefinition tagDefinition = (TagDefinition) obj;
        tagDefinition.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = tagDefinition.label;
        zzjf zzjfVar = tagDefinition.filter_type;
        byteString.getClass();
        return new TagDefinition(str, zzjfVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TagDefinition tagDefinition = (TagDefinition) obj;
        tagDefinition.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, tagDefinition.label);
        zzjf zzjfVar = tagDefinition.filter_type;
        if (zzjfVar instanceof TagDefinition$FilterType$Membership) {
            TagDefinition.Membership.ADAPTER.encodeWithTag(protoWriter, 5, ((TagDefinition$FilterType$Membership) zzjfVar).value);
        } else if (zzjfVar instanceof TagDefinition$FilterType$OpenNow) {
            TagDefinition.OpenNow.ADAPTER.encodeWithTag(protoWriter, 6, ((TagDefinition$FilterType$OpenNow) zzjfVar).value);
        } else if (zzjfVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(tagDefinition.unknownFields());
    }
}
