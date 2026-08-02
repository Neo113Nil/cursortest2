package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "kind", "Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkVisibility;", "visibility", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkVisibility;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LinkTransferOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkTransferOption> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TransferOptionKind#ADAPTER", schemaIndex = 0, tag = 1)
    public final TransferOptionKind kind;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LinkVisibility#ADAPTER", schemaIndex = 1, tag = 2)
    public final LinkVisibility visibility;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption;", "<init>", "()V", "kind", "Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "visibility", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkVisibility;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TransferOptionKind kind;
        public LinkVisibility visibility;

        @Override // com.squareup.wire.Message.Builder
        public LinkTransferOption build() {
            return new LinkTransferOption(this.kind, this.visibility, buildUnknownFields());
        }

        public final Builder kind(TransferOptionKind kind) {
            this.kind = kind;
            return this;
        }

        public final Builder visibility(LinkVisibility visibility) {
            this.visibility = visibility;
            return this;
        }
    }

    static {
        LinkTransferOption$Companion$ADAPTER$1 linkTransferOption$Companion$ADAPTER$1 = new LinkTransferOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkTransferOption.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.LinkTransferOption", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = linkTransferOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkTransferOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkTransferOption(TransferOptionKind transferOptionKind, LinkVisibility linkVisibility, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.kind = transferOptionKind;
        this.visibility = linkVisibility;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkTransferOption)) {
            return false;
        }
        LinkTransferOption linkTransferOption = (LinkTransferOption) obj;
        return Intrinsics.areEqual(unknownFields(), linkTransferOption.unknownFields()) && this.kind == linkTransferOption.kind && this.visibility == linkTransferOption.visibility;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TransferOptionKind transferOptionKind = this.kind;
        int hashCode2 = (hashCode + (transferOptionKind != null ? transferOptionKind.hashCode() : 0)) * 37;
        LinkVisibility linkVisibility = this.visibility;
        int hashCode3 = hashCode2 + (linkVisibility != null ? linkVisibility.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.kind = this.kind;
        builder.visibility = this.visibility;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TransferOptionKind transferOptionKind = this.kind;
        if (transferOptionKind != null) {
            arrayList.add("kind=" + transferOptionKind);
        }
        LinkVisibility linkVisibility = this.visibility;
        if (linkVisibility != null) {
            arrayList.add("visibility=" + linkVisibility);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkTransferOption{", "}", 0, null, null, 56);
    }
}
