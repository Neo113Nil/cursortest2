package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.Reaction;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions$Builder;", "", "show_extended_picker", "Ljava/lang/Boolean;", "", "Lcom/squareup/protos/franklin/common/Reaction;", "available_reactions", "Ljava/util/List;", "existing_reactions", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentHistoryReactions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentHistoryReactions> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.Reaction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Reaction> available_reactions;

    @WireField(adapter = "com.squareup.protos.franklin.common.Reaction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Reaction> existing_reactions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean show_extended_picker;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "<init>", "()V", "available_reactions", "", "Lcom/squareup/protos/franklin/common/Reaction;", "show_extended_picker", "", "Ljava/lang/Boolean;", "existing_reactions", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Reaction> available_reactions;
        public List<Reaction> existing_reactions;
        public Boolean show_extended_picker;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.available_reactions = emptyList;
            this.existing_reactions = emptyList;
        }

        public final Builder available_reactions(List<Reaction> available_reactions) {
            available_reactions.getClass();
            TransactorKt.checkElementsNotNull(available_reactions);
            this.available_reactions = available_reactions;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaymentHistoryReactions build() {
            return new PaymentHistoryReactions(this.show_extended_picker, this.available_reactions, this.existing_reactions, buildUnknownFields());
        }

        public final Builder existing_reactions(List<Reaction> existing_reactions) {
            existing_reactions.getClass();
            TransactorKt.checkElementsNotNull(existing_reactions);
            this.existing_reactions = existing_reactions;
            return this;
        }

        public final Builder show_extended_picker(Boolean show_extended_picker) {
            this.show_extended_picker = show_extended_picker;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentHistoryReactions.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryReactions$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryReactions decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentHistoryReactions((Boolean) obj, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(Reaction.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(Reaction.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentHistoryReactions value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = Reaction.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.available_reactions);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.show_extended_picker);
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, value.existing_reactions);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentHistoryReactions value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Reaction.ADAPTER;
                return protoAdapter2.asRepeated().encodedSizeWithTag(3, value.existing_reactions) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.show_extended_picker) + protoAdapter2.asRepeated().encodedSizeWithTag(1, value.available_reactions) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryReactions redact(PaymentHistoryReactions value) {
                value.getClass();
                List<Reaction> list = value.available_reactions;
                ProtoAdapter protoAdapter2 = Reaction.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.existing_reactions, protoAdapter2);
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.show_extended_picker;
                byteString.getClass();
                return new PaymentHistoryReactions(bool, m1169redactElements, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentHistoryReactions value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = Reaction.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, value.existing_reactions);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.show_extended_picker);
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.available_reactions);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryReactions(Boolean bool, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.show_extended_picker = bool;
        this.available_reactions = TransactorKt.immutableCopyOf("available_reactions", list);
        this.existing_reactions = TransactorKt.immutableCopyOf("existing_reactions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryReactions)) {
            return false;
        }
        PaymentHistoryReactions paymentHistoryReactions = (PaymentHistoryReactions) obj;
        return Intrinsics.areEqual(unknownFields(), paymentHistoryReactions.unknownFields()) && Intrinsics.areEqual(this.available_reactions, paymentHistoryReactions.available_reactions) && Intrinsics.areEqual(this.show_extended_picker, paymentHistoryReactions.show_extended_picker) && Intrinsics.areEqual(this.existing_reactions, paymentHistoryReactions.existing_reactions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.available_reactions);
        Boolean bool = this.show_extended_picker;
        int hashCode = this.existing_reactions.hashCode() + ((m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.available_reactions = this.available_reactions;
        builder.show_extended_picker = this.show_extended_picker;
        builder.existing_reactions = this.existing_reactions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.available_reactions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_reactions=", arrayList, this.available_reactions);
        }
        Boolean bool = this.show_extended_picker;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_extended_picker=", bool, arrayList);
        }
        if (!this.existing_reactions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("existing_reactions=", arrayList, this.existing_reactions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentHistoryReactions{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryReactions;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentHistoryReactions build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
