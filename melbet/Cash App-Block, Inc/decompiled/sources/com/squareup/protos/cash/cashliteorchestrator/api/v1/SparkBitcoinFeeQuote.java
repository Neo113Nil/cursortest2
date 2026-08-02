package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinConfirmationSpeed;", "selected_speed", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinConfirmationSpeed;", "", "expires_at", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinSpeedFee;", "speed_fees", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SparkBitcoinFeeQuote extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SparkBitcoinFeeQuote> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String expires_at;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SparkBitcoinConfirmationSpeed#ADAPTER", schemaIndex = 1, tag = 2)
    public final SparkBitcoinConfirmationSpeed selected_speed;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SparkBitcoinSpeedFee#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<SparkBitcoinSpeedFee> speed_fees;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "<init>", "()V", "speed_fees", "", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinSpeedFee;", "selected_speed", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinConfirmationSpeed;", "expires_at", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String expires_at;
        public SparkBitcoinConfirmationSpeed selected_speed;
        public List<SparkBitcoinSpeedFee> speed_fees = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public SparkBitcoinFeeQuote build() {
            return new SparkBitcoinFeeQuote(this.speed_fees, this.selected_speed, this.expires_at, buildUnknownFields());
        }

        public final Builder expires_at(String expires_at) {
            this.expires_at = expires_at;
            return this;
        }

        public final Builder selected_speed(SparkBitcoinConfirmationSpeed selected_speed) {
            this.selected_speed = selected_speed;
            return this;
        }

        public final Builder speed_fees(List<SparkBitcoinSpeedFee> speed_fees) {
            speed_fees.getClass();
            TransactorKt.checkElementsNotNull(speed_fees);
            this.speed_fees = speed_fees;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SparkBitcoinFeeQuote.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SparkBitcoinFeeQuote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SparkBitcoinFeeQuote decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SparkBitcoinFeeQuote(m, (SparkBitcoinConfirmationSpeed) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(SparkBitcoinSpeedFee.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        try {
                            obj = SparkBitcoinConfirmationSpeed.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SparkBitcoinFeeQuote value) {
                writer.getClass();
                value.getClass();
                SparkBitcoinSpeedFee.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.speed_fees);
                SparkBitcoinConfirmationSpeed.ADAPTER.encodeWithTag(writer, 2, value.selected_speed);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.expires_at);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SparkBitcoinFeeQuote value) {
                value.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.expires_at) + SparkBitcoinConfirmationSpeed.ADAPTER.encodedSizeWithTag(2, value.selected_speed) + SparkBitcoinSpeedFee.ADAPTER.asRepeated().encodedSizeWithTag(1, value.speed_fees) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SparkBitcoinFeeQuote redact(SparkBitcoinFeeQuote value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.speed_fees, SparkBitcoinSpeedFee.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed = value.selected_speed;
                String str = value.expires_at;
                byteString.getClass();
                return new SparkBitcoinFeeQuote(m1169redactElements, sparkBitcoinConfirmationSpeed, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SparkBitcoinFeeQuote value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.expires_at);
                SparkBitcoinConfirmationSpeed.ADAPTER.encodeWithTag(writer, 2, value.selected_speed);
                SparkBitcoinSpeedFee.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.speed_fees);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkBitcoinFeeQuote(List list, SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.selected_speed = sparkBitcoinConfirmationSpeed;
        this.expires_at = str;
        this.speed_fees = TransactorKt.immutableCopyOf("speed_fees", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SparkBitcoinFeeQuote)) {
            return false;
        }
        SparkBitcoinFeeQuote sparkBitcoinFeeQuote = (SparkBitcoinFeeQuote) obj;
        return Intrinsics.areEqual(unknownFields(), sparkBitcoinFeeQuote.unknownFields()) && Intrinsics.areEqual(this.speed_fees, sparkBitcoinFeeQuote.speed_fees) && this.selected_speed == sparkBitcoinFeeQuote.selected_speed && Intrinsics.areEqual(this.expires_at, sparkBitcoinFeeQuote.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.speed_fees);
        SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed = this.selected_speed;
        int hashCode = (m + (sparkBitcoinConfirmationSpeed != null ? sparkBitcoinConfirmationSpeed.hashCode() : 0)) * 37;
        String str = this.expires_at;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.speed_fees = this.speed_fees;
        builder.selected_speed = this.selected_speed;
        builder.expires_at = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.speed_fees.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("speed_fees=", arrayList, this.speed_fees);
        }
        SparkBitcoinConfirmationSpeed sparkBitcoinConfirmationSpeed = this.selected_speed;
        if (sparkBitcoinConfirmationSpeed != null) {
            arrayList.add("selected_speed=" + sparkBitcoinConfirmationSpeed);
        }
        String str = this.expires_at;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "expires_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SparkBitcoinFeeQuote{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SparkBitcoinFeeQuote;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SparkBitcoinFeeQuote build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
