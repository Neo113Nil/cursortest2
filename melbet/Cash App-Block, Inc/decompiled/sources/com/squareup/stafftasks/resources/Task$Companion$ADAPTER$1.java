package com.squareup.stafftasks.resources;

import androidx.room.TransactorKt;
import com.squareup.stafftasks.resources.Task;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Task$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Task.Metadata uploadDocumentMetadata;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Task.Metadata metadata = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Task((String) obj, (String) obj2, (String) obj3, (TaskType) obj4, (TaskStatus) obj5, (TargetEntity) obj6, metadata, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    try {
                        obj4 = TaskType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    try {
                        obj5 = TaskStatus.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(TargetEntity.ADAPTER, protoReader, obj6);
                    continue;
                case 6:
                    uploadDocumentMetadata = new Task.Metadata.UploadDocumentMetadata((UploadDocumentMetadata) UploadDocumentMetadata.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    uploadDocumentMetadata = new Task.Metadata.ReviewDocumentMetadata((ReviewDocumentMetadata) ReviewDocumentMetadata.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            metadata = uploadDocumentMetadata;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Task task = (Task) obj;
        reverseProtoWriter.getClass();
        task.getClass();
        reverseProtoWriter.writeBytes(task.unknownFields());
        Task.Metadata metadata = task.metadata;
        if (metadata instanceof Task.Metadata.UploadDocumentMetadata) {
            UploadDocumentMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((Task.Metadata.UploadDocumentMetadata) metadata).value);
        } else if (metadata instanceof Task.Metadata.ReviewDocumentMetadata) {
            ReviewDocumentMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((Task.Metadata.ReviewDocumentMetadata) metadata).value);
        } else if (metadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TargetEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 5, task.target_entity);
        TaskStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, task.status);
        TaskType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, task.task_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, task.task_template_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, task.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, task.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Task task = (Task) obj;
        task.getClass();
        int size$okio = task.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = TargetEntity.ADAPTER.encodedSizeWithTag(5, task.target_entity) + TaskStatus.ADAPTER.encodedSizeWithTag(4, task.status) + TaskType.ADAPTER.encodedSizeWithTag(3, task.task_type) + protoAdapter.encodedSizeWithTag(2, task.task_template_id) + protoAdapter.encodedSizeWithTag(7, task.name) + protoAdapter.encodedSizeWithTag(1, task.id) + size$okio;
        Task.Metadata metadata = task.metadata;
        if (metadata instanceof Task.Metadata.UploadDocumentMetadata) {
            encodedSizeWithTag = UploadDocumentMetadata.ADAPTER.encodedSizeWithTag(6, ((Task.Metadata.UploadDocumentMetadata) metadata).value);
        } else {
            if (!(metadata instanceof Task.Metadata.ReviewDocumentMetadata)) {
                if (metadata == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ReviewDocumentMetadata.ADAPTER.encodedSizeWithTag(8, ((Task.Metadata.ReviewDocumentMetadata) metadata).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Task task = (Task) obj;
        task.getClass();
        TargetEntity targetEntity = task.target_entity;
        TargetEntity targetEntity2 = targetEntity != null ? (TargetEntity) TargetEntity.ADAPTER.redact(targetEntity) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = task.id;
        String str2 = task.task_template_id;
        TaskType taskType = task.task_type;
        TaskStatus taskStatus = task.status;
        Task.Metadata metadata = task.metadata;
        byteString.getClass();
        return new Task(str, null, str2, taskType, taskStatus, targetEntity2, metadata, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Task task = (Task) obj;
        task.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, task.id);
        protoAdapter.encodeWithTag(protoWriter, 7, task.name);
        protoAdapter.encodeWithTag(protoWriter, 2, task.task_template_id);
        TaskType.ADAPTER.encodeWithTag(protoWriter, 3, task.task_type);
        TaskStatus.ADAPTER.encodeWithTag(protoWriter, 4, task.status);
        TargetEntity.ADAPTER.encodeWithTag(protoWriter, 5, task.target_entity);
        Task.Metadata metadata = task.metadata;
        if (metadata instanceof Task.Metadata.UploadDocumentMetadata) {
            UploadDocumentMetadata.ADAPTER.encodeWithTag(protoWriter, 6, ((Task.Metadata.UploadDocumentMetadata) metadata).value);
        } else if (metadata instanceof Task.Metadata.ReviewDocumentMetadata) {
            ReviewDocumentMetadata.ADAPTER.encodeWithTag(protoWriter, 8, ((Task.Metadata.ReviewDocumentMetadata) metadata).value);
        } else if (metadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(task.unknownFields());
    }
}
