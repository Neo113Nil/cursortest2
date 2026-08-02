package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.paychecks.AllocationDistribution;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0007\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lsquareup/cash/paychecks/AllocationDistribution;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/AllocationDistribution$Builder;", "", "Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "allocations", "Ljava/util/List;", "Companion", "Builder", "DestinationAndShare", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AllocationDistribution extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AllocationDistribution> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.paychecks.AllocationDistribution$DestinationAndShare#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<DestinationAndShare> allocations;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lsquareup/cash/paychecks/AllocationDistribution$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/AllocationDistribution;", "<init>", "()V", "allocations", "", "Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<DestinationAndShare> allocations = EmptyList.INSTANCE;

        public final Builder allocations(List<DestinationAndShare> allocations) {
            allocations.getClass();
            TransactorKt.checkElementsNotNull(allocations);
            this.allocations = allocations;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AllocationDistribution build() {
            return new AllocationDistribution(this.allocations, buildUnknownFields());
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.AllocationDistribution$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AllocationDistribution decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AllocationDistribution(m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(AllocationDistribution.DestinationAndShare.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AllocationDistribution value) {
                writer.getClass();
                value.getClass();
                AllocationDistribution.DestinationAndShare.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.allocations);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AllocationDistribution value) {
                value.getClass();
                return AllocationDistribution.DestinationAndShare.ADAPTER.asRepeated().encodedSizeWithTag(1, value.allocations) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AllocationDistribution redact(AllocationDistribution value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.allocations, AllocationDistribution.DestinationAndShare.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new AllocationDistribution(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AllocationDistribution value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AllocationDistribution.DestinationAndShare.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.allocations);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllocationDistribution(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.allocations = TransactorKt.immutableCopyOf("allocations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllocationDistribution)) {
            return false;
        }
        AllocationDistribution allocationDistribution = (AllocationDistribution) obj;
        return Intrinsics.areEqual(unknownFields(), allocationDistribution.unknownFields()) && Intrinsics.areEqual(this.allocations, allocationDistribution.allocations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.allocations.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.allocations = this.allocations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.allocations.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allocations=", arrayList, this.allocations);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AllocationDistribution{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare$Builder;", "allocation_destination", "Lsquareup/cash/paychecks/AllocationDestination;", "share_in_basis_points", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/paychecks/AllocationDestination;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lsquareup/cash/paychecks/AllocationDestination;Ljava/lang/Long;Lokio/ByteString;)Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DestinationAndShare extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DestinationAndShare> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "squareup.cash.paychecks.AllocationDestination#ADAPTER", schemaIndex = 0, tag = 1)
        public final AllocationDestination allocation_destination;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
        public final Long share_in_basis_points;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "<init>", "()V", "allocation_destination", "Lsquareup/cash/paychecks/AllocationDestination;", "share_in_basis_points", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AllocationDestination allocation_destination;
            public Long share_in_basis_points;

            public final Builder allocation_destination(AllocationDestination allocation_destination) {
                this.allocation_destination = allocation_destination;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public DestinationAndShare build() {
                return new DestinationAndShare(this.allocation_destination, this.share_in_basis_points, buildUnknownFields());
            }

            public final Builder share_in_basis_points(Long share_in_basis_points) {
                this.share_in_basis_points = share_in_basis_points;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DestinationAndShare.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.AllocationDistribution$DestinationAndShare$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AllocationDistribution.DestinationAndShare decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AllocationDistribution.DestinationAndShare((AllocationDestination) obj, (Long) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.INT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AllocationDistribution.DestinationAndShare value) {
                    writer.getClass();
                    value.getClass();
                    AllocationDestination.ADAPTER.encodeWithTag(writer, 1, value.allocation_destination);
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, value.share_in_basis_points);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AllocationDistribution.DestinationAndShare value) {
                    value.getClass();
                    return ProtoAdapter.INT64.encodedSizeWithTag(2, value.share_in_basis_points) + AllocationDestination.ADAPTER.encodedSizeWithTag(1, value.allocation_destination) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AllocationDistribution.DestinationAndShare redact(AllocationDistribution.DestinationAndShare value) {
                    value.getClass();
                    AllocationDestination allocationDestination = value.allocation_destination;
                    return AllocationDistribution.DestinationAndShare.copy$default(value, allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AllocationDistribution.DestinationAndShare value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, value.share_in_basis_points);
                    AllocationDestination.ADAPTER.encodeWithTag(writer, 1, value.allocation_destination);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DestinationAndShare(AllocationDestination allocationDestination, Long l, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : allocationDestination, (i & 2) != 0 ? null : l, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DestinationAndShare copy$default(DestinationAndShare destinationAndShare, AllocationDestination allocationDestination, Long l, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                allocationDestination = destinationAndShare.allocation_destination;
            }
            if ((i & 2) != 0) {
                l = destinationAndShare.share_in_basis_points;
            }
            if ((i & 4) != 0) {
                byteString = destinationAndShare.unknownFields();
            }
            return destinationAndShare.copy(allocationDestination, l, byteString);
        }

        public final DestinationAndShare copy(AllocationDestination allocation_destination, Long share_in_basis_points, ByteString unknownFields) {
            unknownFields.getClass();
            return new DestinationAndShare(allocation_destination, share_in_basis_points, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DestinationAndShare)) {
                return false;
            }
            DestinationAndShare destinationAndShare = (DestinationAndShare) other;
            return Intrinsics.areEqual(unknownFields(), destinationAndShare.unknownFields()) && Intrinsics.areEqual(this.allocation_destination, destinationAndShare.allocation_destination) && Intrinsics.areEqual(this.share_in_basis_points, destinationAndShare.share_in_basis_points);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDestination allocationDestination = this.allocation_destination;
            int hashCode2 = (hashCode + (allocationDestination != null ? allocationDestination.hashCode() : 0)) * 37;
            Long l = this.share_in_basis_points;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.allocation_destination = this.allocation_destination;
            builder.share_in_basis_points = this.share_in_basis_points;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDestination allocationDestination = this.allocation_destination;
            if (allocationDestination != null) {
                arrayList.add("allocation_destination=" + allocationDestination);
            }
            Long l = this.share_in_basis_points;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("share_in_basis_points=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DestinationAndShare{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare$Builder;", "", "body", "Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/AllocationDistribution$DestinationAndShare;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DestinationAndShare build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DestinationAndShare() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DestinationAndShare(AllocationDestination allocationDestination, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.allocation_destination = allocationDestination;
            this.share_in_basis_points = l;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/AllocationDistribution$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/AllocationDistribution$Builder;", "", "body", "Lsquareup/cash/paychecks/AllocationDistribution;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/AllocationDistribution;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AllocationDistribution build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public AllocationDistribution(ArrayList arrayList) {
        this(arrayList, ByteString.EMPTY);
    }
}
