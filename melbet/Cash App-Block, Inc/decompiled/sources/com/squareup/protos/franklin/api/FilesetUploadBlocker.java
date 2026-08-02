package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FilesetUploadBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0017\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/FilesetUploadBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "", "title", "Ljava/lang/String;", "detail_text", "", "file_size_limit_bytes", "Ljava/lang/Long;", "", "file_count_limit", "Ljava/lang/Integer;", "upload_context", "minimum_file_count", "", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "files", "Ljava/util/List;", "Companion", "Builder", "FileSummary", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FilesetUploadBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FilesetUploadBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String detail_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 6, tag = 7)
    public final Integer file_count_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 5, tag = 6)
    public final Long file_size_limit_bytes;

    @WireField(adapter = "com.squareup.protos.franklin.api.FilesetUploadBlocker$FileSummary#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<FileSummary> files;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 8, tag = 9)
    public final Integer minimum_file_count;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 1, tag = 2)
    public final BlockerAction primary_action;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 2, tag = 3)
    public final BlockerAction secondary_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String upload_context;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker;", "<init>", "()V", "files", "", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "title", "", "detail_text", "file_size_limit_bytes", "", "Ljava/lang/Long;", "file_count_limit", "", "Ljava/lang/Integer;", "upload_context", "minimum_file_count", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$Builder;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String detail_text;
        public Integer file_count_limit;
        public Long file_size_limit_bytes;
        public List<FileSummary> files = EmptyList.INSTANCE;
        public Integer minimum_file_count;
        public BlockerAction primary_action;
        public BlockerAction secondary_action;
        public String title;
        public String upload_context;

        @Override // com.squareup.wire.Message.Builder
        public FilesetUploadBlocker build() {
            return new FilesetUploadBlocker(this.files, this.primary_action, this.secondary_action, this.title, this.detail_text, this.file_size_limit_bytes, this.file_count_limit, this.upload_context, this.minimum_file_count, buildUnknownFields());
        }

        public final Builder detail_text(String detail_text) {
            this.detail_text = detail_text;
            return this;
        }

        public final Builder file_count_limit(Integer file_count_limit) {
            this.file_count_limit = file_count_limit;
            return this;
        }

        public final Builder file_size_limit_bytes(Long file_size_limit_bytes) {
            this.file_size_limit_bytes = file_size_limit_bytes;
            return this;
        }

        public final Builder files(List<FileSummary> files) {
            files.getClass();
            TransactorKt.checkElementsNotNull(files);
            this.files = files;
            return this;
        }

        public final Builder minimum_file_count(Integer minimum_file_count) {
            this.minimum_file_count = minimum_file_count;
            return this;
        }

        public final Builder primary_action(BlockerAction primary_action) {
            this.primary_action = primary_action;
            return this;
        }

        public final Builder secondary_action(BlockerAction secondary_action) {
            this.secondary_action = secondary_action;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder upload_context(String upload_context) {
            this.upload_context = upload_context;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FilesetUploadBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FilesetUploadBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FilesetUploadBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new FilesetUploadBlocker(m, (BlockerAction) obj, (BlockerAction) obj2, (String) obj3, (String) obj4, (Long) obj5, (Integer) obj6, (String) obj7, (Integer) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(FilesetUploadBlocker.FileSummary.ADAPTER.decode(reader));
                            break;
                        case 2:
                            obj = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj);
                            break;
                        case 3:
                            obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj2);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.UINT64.decode(reader);
                            break;
                        case 7:
                            obj6 = ProtoAdapter.UINT32.decode(reader);
                            break;
                        case 8:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj8 = ProtoAdapter.UINT32.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FilesetUploadBlocker value) {
                writer.getClass();
                value.getClass();
                FilesetUploadBlocker.FileSummary.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.files);
                ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.primary_action);
                protoAdapter2.encodeWithTag(writer, 3, value.secondary_action);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.title);
                protoAdapter3.encodeWithTag(writer, 5, value.detail_text);
                ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.file_size_limit_bytes);
                ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
                protoAdapter4.encodeWithTag(writer, 7, value.file_count_limit);
                protoAdapter3.encodeWithTag(writer, 8, value.upload_context);
                protoAdapter4.encodeWithTag(writer, 9, value.minimum_file_count);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FilesetUploadBlocker value) {
                value.getClass();
                int encodedSizeWithTag = FilesetUploadBlocker.FileSummary.ADAPTER.asRepeated().encodedSizeWithTag(1, value.files) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, value.secondary_action) + protoAdapter2.encodedSizeWithTag(2, value.primary_action) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = ProtoAdapter.UINT64.encodedSizeWithTag(6, value.file_size_limit_bytes) + protoAdapter3.encodedSizeWithTag(5, value.detail_text) + protoAdapter3.encodedSizeWithTag(4, value.title) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
                return protoAdapter4.encodedSizeWithTag(9, value.minimum_file_count) + protoAdapter3.encodedSizeWithTag(8, value.upload_context) + protoAdapter4.encodedSizeWithTag(7, value.file_count_limit) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FilesetUploadBlocker redact(FilesetUploadBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.files, FilesetUploadBlocker.FileSummary.ADAPTER);
                BlockerAction blockerAction = value.primary_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                BlockerAction blockerAction3 = value.secondary_action;
                BlockerAction blockerAction4 = blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.detail_text;
                Long l = value.file_size_limit_bytes;
                Integer num = value.file_count_limit;
                String str3 = value.upload_context;
                Integer num2 = value.minimum_file_count;
                byteString.getClass();
                return new FilesetUploadBlocker(m1169redactElements, blockerAction2, blockerAction4, str, str2, l, num, str3, num2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FilesetUploadBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
                protoAdapter2.encodeWithTag(writer, 9, value.minimum_file_count);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 8, value.upload_context);
                protoAdapter2.encodeWithTag(writer, 7, value.file_count_limit);
                ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.file_size_limit_bytes);
                protoAdapter3.encodeWithTag(writer, 5, value.detail_text);
                protoAdapter3.encodeWithTag(writer, 4, value.title);
                ProtoAdapter protoAdapter4 = BlockerAction.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 3, value.secondary_action);
                protoAdapter4.encodeWithTag(writer, 2, value.primary_action);
                FilesetUploadBlocker.FileSummary.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.files);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesetUploadBlocker(List list, BlockerAction blockerAction, BlockerAction blockerAction2, String str, String str2, Long l, Integer num, String str3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.primary_action = blockerAction;
        this.secondary_action = blockerAction2;
        this.title = str;
        this.detail_text = str2;
        this.file_size_limit_bytes = l;
        this.file_count_limit = num;
        this.upload_context = str3;
        this.minimum_file_count = num2;
        this.files = TransactorKt.immutableCopyOf("files", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilesetUploadBlocker)) {
            return false;
        }
        FilesetUploadBlocker filesetUploadBlocker = (FilesetUploadBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), filesetUploadBlocker.unknownFields()) && Intrinsics.areEqual(this.files, filesetUploadBlocker.files) && Intrinsics.areEqual(this.primary_action, filesetUploadBlocker.primary_action) && Intrinsics.areEqual(this.secondary_action, filesetUploadBlocker.secondary_action) && Intrinsics.areEqual(this.title, filesetUploadBlocker.title) && Intrinsics.areEqual(this.detail_text, filesetUploadBlocker.detail_text) && Intrinsics.areEqual(this.file_size_limit_bytes, filesetUploadBlocker.file_size_limit_bytes) && Intrinsics.areEqual(this.file_count_limit, filesetUploadBlocker.file_count_limit) && Intrinsics.areEqual(this.upload_context, filesetUploadBlocker.upload_context) && Intrinsics.areEqual(this.minimum_file_count, filesetUploadBlocker.minimum_file_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.files);
        BlockerAction blockerAction = this.primary_action;
        int hashCode = (m + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        BlockerAction blockerAction2 = this.secondary_action;
        int hashCode2 = (hashCode + (blockerAction2 != null ? blockerAction2.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.detail_text;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.file_size_limit_bytes;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Integer num = this.file_count_limit;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str3 = this.upload_context;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num2 = this.minimum_file_count;
        int hashCode8 = hashCode7 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.files = this.files;
        builder.primary_action = this.primary_action;
        builder.secondary_action = this.secondary_action;
        builder.title = this.title;
        builder.detail_text = this.detail_text;
        builder.file_size_limit_bytes = this.file_size_limit_bytes;
        builder.file_count_limit = this.file_count_limit;
        builder.upload_context = this.upload_context;
        builder.minimum_file_count = this.minimum_file_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.files.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("files=", arrayList, this.files);
        }
        BlockerAction blockerAction = this.primary_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_action=", blockerAction, arrayList);
        }
        BlockerAction blockerAction2 = this.secondary_action;
        if (blockerAction2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_action=", blockerAction2, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.detail_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
        }
        Long l = this.file_size_limit_bytes;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("file_size_limit_bytes=", l, arrayList);
        }
        Integer num = this.file_count_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("file_count_limit=", num, arrayList);
        }
        String str3 = this.upload_context;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "upload_context=", arrayList);
        }
        Integer num2 = this.minimum_file_count;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("minimum_file_count=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FilesetUploadBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary$Builder;", "file_token", "", "name", "mime_type", "size_bytes", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FileSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FileSummary> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String file_token;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String mime_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 3, tag = 4)
        public final Long size_bytes;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "<init>", "()V", "file_token", "", "name", "mime_type", "size_bytes", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String file_token;
            public String mime_type;
            public String name;
            public Long size_bytes;

            @Override // com.squareup.wire.Message.Builder
            public FileSummary build() {
                return new FileSummary(this.file_token, this.name, this.mime_type, this.size_bytes, buildUnknownFields());
            }

            public final Builder file_token(String file_token) {
                this.file_token = file_token;
                return this;
            }

            public final Builder mime_type(String mime_type) {
                this.mime_type = mime_type;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }

            public final Builder size_bytes(Long size_bytes) {
                this.size_bytes = size_bytes;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FileSummary.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FilesetUploadBlocker$FileSummary$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FilesetUploadBlocker.FileSummary decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FilesetUploadBlocker.FileSummary((String) obj, (String) obj2, (String) obj3, (Long) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.UINT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FilesetUploadBlocker.FileSummary value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.file_token);
                    protoAdapter2.encodeWithTag(writer, 2, value.name);
                    protoAdapter2.encodeWithTag(writer, 3, value.mime_type);
                    ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.size_bytes);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FilesetUploadBlocker.FileSummary value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return ProtoAdapter.UINT64.encodedSizeWithTag(4, value.size_bytes) + protoAdapter2.encodedSizeWithTag(3, value.mime_type) + protoAdapter2.encodedSizeWithTag(2, value.name) + protoAdapter2.encodedSizeWithTag(1, value.file_token) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FilesetUploadBlocker.FileSummary redact(FilesetUploadBlocker.FileSummary value) {
                    value.getClass();
                    return FilesetUploadBlocker.FileSummary.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FilesetUploadBlocker.FileSummary value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.size_bytes);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.mime_type);
                    protoAdapter2.encodeWithTag(writer, 2, value.name);
                    protoAdapter2.encodeWithTag(writer, 1, value.file_token);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ FileSummary(String str, String str2, String str3, Long l, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ FileSummary copy$default(FileSummary fileSummary, String str, String str2, String str3, Long l, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileSummary.file_token;
            }
            if ((i & 2) != 0) {
                str2 = fileSummary.name;
            }
            if ((i & 4) != 0) {
                str3 = fileSummary.mime_type;
            }
            if ((i & 8) != 0) {
                l = fileSummary.size_bytes;
            }
            if ((i & 16) != 0) {
                byteString = fileSummary.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str3;
            return fileSummary.copy(str, str2, str4, l, byteString2);
        }

        public final FileSummary copy(String file_token, String name, String mime_type, Long size_bytes, ByteString unknownFields) {
            unknownFields.getClass();
            return new FileSummary(file_token, name, mime_type, size_bytes, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FileSummary)) {
                return false;
            }
            FileSummary fileSummary = (FileSummary) other;
            return Intrinsics.areEqual(unknownFields(), fileSummary.unknownFields()) && Intrinsics.areEqual(this.file_token, fileSummary.file_token) && Intrinsics.areEqual(this.name, fileSummary.name) && Intrinsics.areEqual(this.mime_type, fileSummary.mime_type) && Intrinsics.areEqual(this.size_bytes, fileSummary.size_bytes);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.file_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.mime_type;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Long l = this.size_bytes;
            int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.file_token = this.file_token;
            builder.name = this.name;
            builder.mime_type = this.mime_type;
            builder.size_bytes = this.size_bytes;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.file_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_token=", arrayList);
            }
            String str2 = this.name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
            }
            String str3 = this.mime_type;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "mime_type=", arrayList);
            }
            Long l = this.size_bytes;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("size_bytes=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FileSummary{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$FileSummary;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ FileSummary build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public FileSummary() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileSummary(String str, String str2, String str3, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.file_token = str;
            this.name = str2;
            this.mime_type = str3;
            this.size_bytes = l;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FilesetUploadBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FilesetUploadBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FilesetUploadBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
