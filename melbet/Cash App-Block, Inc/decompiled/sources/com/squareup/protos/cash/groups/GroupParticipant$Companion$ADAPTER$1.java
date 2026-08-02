package com.squareup.protos.cash.groups;

import com.bugsnag.android.IOUtils;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GroupParticipant$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        IOUtils iOUtils = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GroupParticipant(iOUtils, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                iOUtils = new GroupParticipant$Type$Customer((GroupParticipant.Customer) GroupParticipant.Customer.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                iOUtils = new GroupParticipant$Type$Anonymous((GroupParticipant.Anonymous) GroupParticipant.Anonymous.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GroupParticipant groupParticipant = (GroupParticipant) obj;
        reverseProtoWriter.getClass();
        groupParticipant.getClass();
        reverseProtoWriter.writeBytes(groupParticipant.unknownFields());
        IOUtils iOUtils = groupParticipant.f1275type;
        if (iOUtils instanceof GroupParticipant$Type$Customer) {
            GroupParticipant.Customer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GroupParticipant$Type$Customer) iOUtils).value);
        } else if (iOUtils instanceof GroupParticipant$Type$Anonymous) {
            GroupParticipant.Anonymous.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GroupParticipant$Type$Anonymous) iOUtils).value);
        } else {
            if (iOUtils == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GroupParticipant groupParticipant = (GroupParticipant) obj;
        groupParticipant.getClass();
        int size$okio = groupParticipant.unknownFields().getSize$okio();
        IOUtils iOUtils = groupParticipant.f1275type;
        if (iOUtils instanceof GroupParticipant$Type$Customer) {
            encodedSizeWithTag = GroupParticipant.Customer.ADAPTER.encodedSizeWithTag(1, ((GroupParticipant$Type$Customer) iOUtils).value);
        } else {
            if (!(iOUtils instanceof GroupParticipant$Type$Anonymous)) {
                if (iOUtils == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GroupParticipant.Anonymous.ADAPTER.encodedSizeWithTag(2, ((GroupParticipant$Type$Anonymous) iOUtils).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GroupParticipant groupParticipant = (GroupParticipant) obj;
        groupParticipant.getClass();
        ByteString byteString = ByteString.EMPTY;
        IOUtils iOUtils = groupParticipant.f1275type;
        byteString.getClass();
        return new GroupParticipant(iOUtils, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GroupParticipant groupParticipant = (GroupParticipant) obj;
        groupParticipant.getClass();
        IOUtils iOUtils = groupParticipant.f1275type;
        if (iOUtils instanceof GroupParticipant$Type$Customer) {
            GroupParticipant.Customer.ADAPTER.encodeWithTag(protoWriter, 1, ((GroupParticipant$Type$Customer) iOUtils).value);
        } else if (iOUtils instanceof GroupParticipant$Type$Anonymous) {
            GroupParticipant.Anonymous.ADAPTER.encodeWithTag(protoWriter, 2, ((GroupParticipant$Type$Anonymous) iOUtils).value);
        } else if (iOUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(groupParticipant.unknownFields());
    }
}
