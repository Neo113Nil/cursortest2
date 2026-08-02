package com.squareup.protos.cash.notificationsettings.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FailedCategoryPreferenceUpdate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FailedCategoryPreferenceUpdate((String) obj, (CategoryPreferenceUpdate) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CategoryPreferenceUpdate.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FailedCategoryPreferenceUpdate failedCategoryPreferenceUpdate = (FailedCategoryPreferenceUpdate) obj;
        reverseProtoWriter.getClass();
        failedCategoryPreferenceUpdate.getClass();
        reverseProtoWriter.writeBytes(failedCategoryPreferenceUpdate.unknownFields());
        CategoryPreferenceUpdate.ADAPTER.encodeWithTag(reverseProtoWriter, 2, failedCategoryPreferenceUpdate.update);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, failedCategoryPreferenceUpdate.error_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FailedCategoryPreferenceUpdate failedCategoryPreferenceUpdate = (FailedCategoryPreferenceUpdate) obj;
        failedCategoryPreferenceUpdate.getClass();
        return CategoryPreferenceUpdate.ADAPTER.encodedSizeWithTag(2, failedCategoryPreferenceUpdate.update) + ProtoAdapter.STRING.encodedSizeWithTag(1, failedCategoryPreferenceUpdate.error_message) + failedCategoryPreferenceUpdate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FailedCategoryPreferenceUpdate failedCategoryPreferenceUpdate = (FailedCategoryPreferenceUpdate) obj;
        failedCategoryPreferenceUpdate.getClass();
        CategoryPreferenceUpdate categoryPreferenceUpdate = failedCategoryPreferenceUpdate.update;
        CategoryPreferenceUpdate categoryPreferenceUpdate2 = categoryPreferenceUpdate != null ? (CategoryPreferenceUpdate) CategoryPreferenceUpdate.ADAPTER.redact(categoryPreferenceUpdate) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = failedCategoryPreferenceUpdate.error_message;
        byteString.getClass();
        return new FailedCategoryPreferenceUpdate(str, categoryPreferenceUpdate2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FailedCategoryPreferenceUpdate failedCategoryPreferenceUpdate = (FailedCategoryPreferenceUpdate) obj;
        failedCategoryPreferenceUpdate.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, failedCategoryPreferenceUpdate.error_message);
        CategoryPreferenceUpdate.ADAPTER.encodeWithTag(protoWriter, 2, failedCategoryPreferenceUpdate.update);
        protoWriter.writeBytes(failedCategoryPreferenceUpdate.unknownFields());
    }
}
