package com.squareup.stafftasks.resources;

import android.os.Parcelable;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.Sync_range;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.protos.person.Alias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Task extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Task> CREATOR;
    public final String id;
    public final Metadata metadata;
    public final String name;
    public final TaskStatus status;
    public final TargetEntity target_entity;
    public final String task_template_id;
    public final TaskType task_type;

    public abstract class Metadata {

        public final class ReviewDocumentMetadata extends Metadata {
            public final com.squareup.stafftasks.resources.ReviewDocumentMetadata value;

            public ReviewDocumentMetadata(com.squareup.stafftasks.resources.ReviewDocumentMetadata reviewDocumentMetadata) {
                reviewDocumentMetadata.getClass();
                this.value = reviewDocumentMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReviewDocumentMetadata) && Intrinsics.areEqual(this.value, ((ReviewDocumentMetadata) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ReviewDocumentMetadata(value=" + this.value + ")";
            }
        }

        public final class UploadDocumentMetadata extends Metadata {
            public final com.squareup.stafftasks.resources.UploadDocumentMetadata value;

            public UploadDocumentMetadata(com.squareup.stafftasks.resources.UploadDocumentMetadata uploadDocumentMetadata) {
                uploadDocumentMetadata.getClass();
                this.value = uploadDocumentMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UploadDocumentMetadata) && Intrinsics.areEqual(this.value, ((UploadDocumentMetadata) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "UploadDocumentMetadata(value=" + this.value + ")";
            }
        }

        public static ViewEvent.CustomTimings fromJsonObject(JsonObject jsonObject) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    String key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(key, Long.valueOf(entry.getValue().getAsLong()));
                }
                return new ViewEvent.CustomTimings(linkedHashMap);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type CustomTimings", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type CustomTimings", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type CustomTimings", e3);
                return null;
            }
        }

        public static final SyncRange toSyncRange(Sync_range sync_range) {
            sync_range.getClass();
            return new SyncRange(sync_range.topic, sync_range.bytes);
        }
    }

    static {
        Task$Companion$ADAPTER$1 task$Companion$ADAPTER$1 = new Task$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Task.class), "type.googleapis.com/squareup.stafftasks.Task", Syntax.PROTO_2, null, "squareup/stafftasks/resources/datatypes.proto");
        ADAPTER = task$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(task$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Task(String str, String str2, String str3, TaskType taskType, TaskStatus taskStatus, TargetEntity targetEntity, Metadata metadata, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.name = str2;
        this.task_template_id = str3;
        this.task_type = taskType;
        this.status = taskStatus;
        this.target_entity = targetEntity;
        this.metadata = metadata;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Task)) {
            return false;
        }
        Task task = (Task) obj;
        return Intrinsics.areEqual(unknownFields(), task.unknownFields()) && Intrinsics.areEqual(this.id, task.id) && Intrinsics.areEqual(this.name, task.name) && Intrinsics.areEqual(this.task_template_id, task.task_template_id) && this.task_type == task.task_type && this.status == task.status && Intrinsics.areEqual(this.target_entity, task.target_entity) && Intrinsics.areEqual(this.metadata, task.metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.task_template_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        TaskType taskType = this.task_type;
        int hashCode5 = (hashCode4 + (taskType != null ? taskType.hashCode() : 0)) * 37;
        TaskStatus taskStatus = this.status;
        int hashCode6 = (hashCode5 + (taskStatus != null ? taskStatus.hashCode() : 0)) * 37;
        TargetEntity targetEntity = this.target_entity;
        int hashCode7 = (hashCode6 + (targetEntity != null ? targetEntity.hashCode() : 0)) * 37;
        Metadata metadata = this.metadata;
        int hashCode8 = hashCode7 + (metadata != null ? metadata.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(24, false);
        builder.scope = this.id;
        builder.value = this.name;
        builder.f1407type = this.task_template_id;
        builder.first_verified_at_ms = this.task_type;
        builder.last_verified_at_ms = this.status;
        builder.created_at = this.target_entity;
        builder.updated_at = this.metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        String str2 = this.task_template_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "task_template_id=", arrayList);
        }
        TaskType taskType = this.task_type;
        if (taskType != null) {
            arrayList.add("task_type=" + taskType);
        }
        TaskStatus taskStatus = this.status;
        if (taskStatus != null) {
            arrayList.add("status=" + taskStatus);
        }
        TargetEntity targetEntity = this.target_entity;
        if (targetEntity != null) {
            arrayList.add("target_entity=" + targetEntity);
        }
        Metadata metadata = this.metadata;
        if (metadata != null) {
            arrayList.add("metadata=" + metadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Task{", "}", 0, null, null, 56);
    }
}
