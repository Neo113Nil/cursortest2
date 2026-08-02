package squareup.cash.paychecks;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDestination;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/AllocationDestination$Builder;", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "destination", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "Companion", "Builder", "Destination", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AllocationDestination extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AllocationDestination> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Destination destination;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/AllocationDestination;", "<init>", "()V", "destination", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Destination destination;

        @Override // com.squareup.wire.Message.Builder
        public AllocationDestination build() {
            return new AllocationDestination(this.destination, buildUnknownFields());
        }

        public final Builder destination(Destination destination) {
            this.destination = destination;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AllocationDestination.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.AllocationDestination$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AllocationDestination decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                AllocationDestination.Destination destination = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AllocationDestination(destination, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        destination = new AllocationDestination.Destination.CashBalance((CashBalanceDestination) CashBalanceDestination.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        destination = new AllocationDestination.Destination.Savings((SavingsDestination) SavingsDestination.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        destination = new AllocationDestination.Destination.Bitcoin((BitcoinDestination) BitcoinDestination.ADAPTER.decode(reader));
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        destination = new AllocationDestination.Destination.Investing((InvestingDestination) InvestingDestination.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AllocationDestination value) {
                writer.getClass();
                value.getClass();
                AllocationDestination.Destination destination = value.destination;
                if (destination instanceof AllocationDestination.Destination.CashBalance) {
                    CashBalanceDestination.ADAPTER.encodeWithTag(writer, 1, ((AllocationDestination.Destination.CashBalance) destination).getValue());
                } else if (destination instanceof AllocationDestination.Destination.Savings) {
                    SavingsDestination.ADAPTER.encodeWithTag(writer, 2, ((AllocationDestination.Destination.Savings) destination).getValue());
                } else if (destination instanceof AllocationDestination.Destination.Bitcoin) {
                    BitcoinDestination.ADAPTER.encodeWithTag(writer, 3, ((AllocationDestination.Destination.Bitcoin) destination).getValue());
                } else if (destination instanceof AllocationDestination.Destination.Investing) {
                    InvestingDestination.ADAPTER.encodeWithTag(writer, 4, ((AllocationDestination.Destination.Investing) destination).getValue());
                } else if (destination != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AllocationDestination value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                AllocationDestination.Destination destination = value.destination;
                if (destination instanceof AllocationDestination.Destination.CashBalance) {
                    encodedSizeWithTag = CashBalanceDestination.ADAPTER.encodedSizeWithTag(1, ((AllocationDestination.Destination.CashBalance) destination).getValue());
                } else if (destination instanceof AllocationDestination.Destination.Savings) {
                    encodedSizeWithTag = SavingsDestination.ADAPTER.encodedSizeWithTag(2, ((AllocationDestination.Destination.Savings) destination).getValue());
                } else if (destination instanceof AllocationDestination.Destination.Bitcoin) {
                    encodedSizeWithTag = BitcoinDestination.ADAPTER.encodedSizeWithTag(3, ((AllocationDestination.Destination.Bitcoin) destination).getValue());
                } else {
                    if (!(destination instanceof AllocationDestination.Destination.Investing)) {
                        if (destination == null) {
                            return size$okio;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag = InvestingDestination.ADAPTER.encodedSizeWithTag(4, ((AllocationDestination.Destination.Investing) destination).getValue());
                }
                return encodedSizeWithTag + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AllocationDestination redact(AllocationDestination value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                AllocationDestination.Destination destination = value.destination;
                value.getClass();
                byteString.getClass();
                return new AllocationDestination(destination, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AllocationDestination value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AllocationDestination.Destination destination = value.destination;
                if (destination instanceof AllocationDestination.Destination.CashBalance) {
                    CashBalanceDestination.ADAPTER.encodeWithTag(writer, 1, ((AllocationDestination.Destination.CashBalance) destination).getValue());
                    return;
                }
                if (destination instanceof AllocationDestination.Destination.Savings) {
                    SavingsDestination.ADAPTER.encodeWithTag(writer, 2, ((AllocationDestination.Destination.Savings) destination).getValue());
                    return;
                }
                if (destination instanceof AllocationDestination.Destination.Bitcoin) {
                    BitcoinDestination.ADAPTER.encodeWithTag(writer, 3, ((AllocationDestination.Destination.Bitcoin) destination).getValue());
                } else if (destination instanceof AllocationDestination.Destination.Investing) {
                    InvestingDestination.ADAPTER.encodeWithTag(writer, 4, ((AllocationDestination.Destination.Investing) destination).getValue());
                } else {
                    if (destination == null) {
                        return;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllocationDestination(Destination destination, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.destination = destination;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllocationDestination)) {
            return false;
        }
        AllocationDestination allocationDestination = (AllocationDestination) obj;
        return Intrinsics.areEqual(unknownFields(), allocationDestination.unknownFields()) && Intrinsics.areEqual(this.destination, allocationDestination.destination);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Destination destination = this.destination;
        int hashCode2 = hashCode + (destination != null ? destination.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.destination = this.destination;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Destination destination = this.destination;
        if (destination != null) {
            arrayList.add("destination=" + destination);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AllocationDestination{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/AllocationDestination$Builder;", "", "body", "Lsquareup/cash/paychecks/AllocationDestination;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/AllocationDestination;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AllocationDestination build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Destination;", "", "<init>", "()V", "CashBalance", "Savings", "Bitcoin", "Investing", "Lsquareup/cash/paychecks/AllocationDestination$Destination$Bitcoin;", "Lsquareup/cash/paychecks/AllocationDestination$Destination$CashBalance;", "Lsquareup/cash/paychecks/AllocationDestination$Destination$Investing;", "Lsquareup/cash/paychecks/AllocationDestination$Destination$Savings;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Destination {

        @WireOneofField(adapter = "squareup.cash.paychecks.BitcoinDestination#ADAPTER", declaredName = "bitcoin", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Destination$Bitcoin;", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "value", "Lsquareup/cash/paychecks/BitcoinDestination;", "<init>", "(Lsquareup/cash/paychecks/BitcoinDestination;)V", "getValue", "()Lsquareup/cash/paychecks/BitcoinDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Bitcoin extends Destination {
            private final BitcoinDestination value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Bitcoin(BitcoinDestination bitcoinDestination) {
                super(null);
                bitcoinDestination.getClass();
                this.value = bitcoinDestination;
            }

            public static /* synthetic */ Bitcoin copy$default(Bitcoin bitcoin, BitcoinDestination bitcoinDestination, int i, Object obj) {
                if ((i & 1) != 0) {
                    bitcoinDestination = bitcoin.value;
                }
                return bitcoin.copy(bitcoinDestination);
            }

            /* renamed from: component1, reason: from getter */
            public final BitcoinDestination getValue() {
                return this.value;
            }

            public final Bitcoin copy(BitcoinDestination value) {
                value.getClass();
                return new Bitcoin(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Bitcoin) && Intrinsics.areEqual(this.value, ((Bitcoin) other).value);
            }

            public final BitcoinDestination getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Bitcoin(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "squareup.cash.paychecks.CashBalanceDestination#ADAPTER", declaredName = "cashBalance", tag = 1)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Destination$CashBalance;", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "value", "Lsquareup/cash/paychecks/CashBalanceDestination;", "<init>", "(Lsquareup/cash/paychecks/CashBalanceDestination;)V", "getValue", "()Lsquareup/cash/paychecks/CashBalanceDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CashBalance extends Destination {
            private final CashBalanceDestination value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashBalance(CashBalanceDestination cashBalanceDestination) {
                super(null);
                cashBalanceDestination.getClass();
                this.value = cashBalanceDestination;
            }

            public static /* synthetic */ CashBalance copy$default(CashBalance cashBalance, CashBalanceDestination cashBalanceDestination, int i, Object obj) {
                if ((i & 1) != 0) {
                    cashBalanceDestination = cashBalance.value;
                }
                return cashBalance.copy(cashBalanceDestination);
            }

            /* renamed from: component1, reason: from getter */
            public final CashBalanceDestination getValue() {
                return this.value;
            }

            public final CashBalance copy(CashBalanceDestination value) {
                value.getClass();
                return new CashBalance(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CashBalance) && Intrinsics.areEqual(this.value, ((CashBalance) other).value);
            }

            public final CashBalanceDestination getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CashBalance(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "squareup.cash.paychecks.InvestingDestination#ADAPTER", declaredName = "investing", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Destination$Investing;", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "value", "Lsquareup/cash/paychecks/InvestingDestination;", "<init>", "(Lsquareup/cash/paychecks/InvestingDestination;)V", "getValue", "()Lsquareup/cash/paychecks/InvestingDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Investing extends Destination {
            private final InvestingDestination value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Investing(InvestingDestination investingDestination) {
                super(null);
                investingDestination.getClass();
                this.value = investingDestination;
            }

            public static /* synthetic */ Investing copy$default(Investing investing, InvestingDestination investingDestination, int i, Object obj) {
                if ((i & 1) != 0) {
                    investingDestination = investing.value;
                }
                return investing.copy(investingDestination);
            }

            /* renamed from: component1, reason: from getter */
            public final InvestingDestination getValue() {
                return this.value;
            }

            public final Investing copy(InvestingDestination value) {
                value.getClass();
                return new Investing(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Investing) && Intrinsics.areEqual(this.value, ((Investing) other).value);
            }

            public final InvestingDestination getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Investing(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "squareup.cash.paychecks.SavingsDestination#ADAPTER", declaredName = "savings", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/paychecks/AllocationDestination$Destination$Savings;", "Lsquareup/cash/paychecks/AllocationDestination$Destination;", "value", "Lsquareup/cash/paychecks/SavingsDestination;", "<init>", "(Lsquareup/cash/paychecks/SavingsDestination;)V", "getValue", "()Lsquareup/cash/paychecks/SavingsDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Savings extends Destination {
            private final SavingsDestination value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Savings(SavingsDestination savingsDestination) {
                super(null);
                savingsDestination.getClass();
                this.value = savingsDestination;
            }

            public static /* synthetic */ Savings copy$default(Savings savings, SavingsDestination savingsDestination, int i, Object obj) {
                if ((i & 1) != 0) {
                    savingsDestination = savings.value;
                }
                return savings.copy(savingsDestination);
            }

            /* renamed from: component1, reason: from getter */
            public final SavingsDestination getValue() {
                return this.value;
            }

            public final Savings copy(SavingsDestination value) {
                value.getClass();
                return new Savings(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Savings) && Intrinsics.areEqual(this.value, ((Savings) other).value);
            }

            public final SavingsDestination getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Savings(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Destination(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Destination() {
        }
    }

    public /* synthetic */ AllocationDestination(Destination destination) {
        this(destination, ByteString.EMPTY);
    }
}
