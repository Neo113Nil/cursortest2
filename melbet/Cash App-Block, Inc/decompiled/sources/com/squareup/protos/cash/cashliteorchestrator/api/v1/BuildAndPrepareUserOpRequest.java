package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Builder;", "", "sender", "Ljava/lang/String;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "intent", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "Companion", "Builder", "Intent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildAndPrepareUserOpRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BuildAndPrepareUserOpRequest> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Intent intent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String sender;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "<init>", "()V", "sender", "", "intent", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public Intent intent;
        public String sender;

        @Override // com.squareup.wire.Message.Builder
        public BuildAndPrepareUserOpRequest build() {
            return new BuildAndPrepareUserOpRequest(this.sender, this.intent, buildUnknownFields());
        }

        public final Builder intent(Intent intent) {
            this.intent = intent;
            return this;
        }

        public final Builder sender(String sender) {
            this.sender = sender;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BuildAndPrepareUserOpRequest.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BuildAndPrepareUserOpRequest decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                BuildAndPrepareUserOpRequest.Intent intent = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BuildAndPrepareUserOpRequest((String) obj, intent, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            intent = new BuildAndPrepareUserOpRequest.Intent.SendStablecoin((SendStablecoinIntent) SendStablecoinIntent.ADAPTER.decode(reader));
                            break;
                        case 3:
                            intent = new BuildAndPrepareUserOpRequest.Intent.ApproveCard((ApproveCardIntent) ApproveCardIntent.ADAPTER.decode(reader));
                            break;
                        case 4:
                            intent = new BuildAndPrepareUserOpRequest.Intent.RevokeCard((RevokeCardIntent) RevokeCardIntent.ADAPTER.decode(reader));
                            break;
                        case 5:
                            intent = new BuildAndPrepareUserOpRequest.Intent.SendSparkPayment((SendSparkPaymentIntent) SendSparkPaymentIntent.ADAPTER.decode(reader));
                            break;
                        case 6:
                            intent = new BuildAndPrepareUserOpRequest.Intent.Swap((SwapIntent) SwapIntent.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BuildAndPrepareUserOpRequest value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sender);
                BuildAndPrepareUserOpRequest.Intent intent = value.intent;
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.SendStablecoin) {
                    SendStablecoinIntent.ADAPTER.encodeWithTag(writer, 2, ((BuildAndPrepareUserOpRequest.Intent.SendStablecoin) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.ApproveCard) {
                    ApproveCardIntent.ADAPTER.encodeWithTag(writer, 3, ((BuildAndPrepareUserOpRequest.Intent.ApproveCard) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.RevokeCard) {
                    RevokeCardIntent.ADAPTER.encodeWithTag(writer, 4, ((BuildAndPrepareUserOpRequest.Intent.RevokeCard) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.SendSparkPayment) {
                    SendSparkPaymentIntent.ADAPTER.encodeWithTag(writer, 5, ((BuildAndPrepareUserOpRequest.Intent.SendSparkPayment) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.Swap) {
                    SwapIntent.ADAPTER.encodeWithTag(writer, 6, ((BuildAndPrepareUserOpRequest.Intent.Swap) intent).getValue());
                } else if (intent != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BuildAndPrepareUserOpRequest value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.sender) + value.unknownFields().getSize$okio();
                BuildAndPrepareUserOpRequest.Intent intent = value.intent;
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.SendStablecoin) {
                    return SendStablecoinIntent.ADAPTER.encodedSizeWithTag(2, ((BuildAndPrepareUserOpRequest.Intent.SendStablecoin) intent).getValue()) + encodedSizeWithTag;
                }
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.ApproveCard) {
                    return ApproveCardIntent.ADAPTER.encodedSizeWithTag(3, ((BuildAndPrepareUserOpRequest.Intent.ApproveCard) intent).getValue()) + encodedSizeWithTag;
                }
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.RevokeCard) {
                    return RevokeCardIntent.ADAPTER.encodedSizeWithTag(4, ((BuildAndPrepareUserOpRequest.Intent.RevokeCard) intent).getValue()) + encodedSizeWithTag;
                }
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.SendSparkPayment) {
                    return SendSparkPaymentIntent.ADAPTER.encodedSizeWithTag(5, ((BuildAndPrepareUserOpRequest.Intent.SendSparkPayment) intent).getValue()) + encodedSizeWithTag;
                }
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.Swap) {
                    return SwapIntent.ADAPTER.encodedSizeWithTag(6, ((BuildAndPrepareUserOpRequest.Intent.Swap) intent).getValue()) + encodedSizeWithTag;
                }
                if (intent == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BuildAndPrepareUserOpRequest redact(BuildAndPrepareUserOpRequest value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.sender;
                BuildAndPrepareUserOpRequest.Intent intent = value.intent;
                value.getClass();
                byteString.getClass();
                return new BuildAndPrepareUserOpRequest(str, intent, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BuildAndPrepareUserOpRequest value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BuildAndPrepareUserOpRequest.Intent intent = value.intent;
                if (intent instanceof BuildAndPrepareUserOpRequest.Intent.SendStablecoin) {
                    SendStablecoinIntent.ADAPTER.encodeWithTag(writer, 2, ((BuildAndPrepareUserOpRequest.Intent.SendStablecoin) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.ApproveCard) {
                    ApproveCardIntent.ADAPTER.encodeWithTag(writer, 3, ((BuildAndPrepareUserOpRequest.Intent.ApproveCard) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.RevokeCard) {
                    RevokeCardIntent.ADAPTER.encodeWithTag(writer, 4, ((BuildAndPrepareUserOpRequest.Intent.RevokeCard) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.SendSparkPayment) {
                    SendSparkPaymentIntent.ADAPTER.encodeWithTag(writer, 5, ((BuildAndPrepareUserOpRequest.Intent.SendSparkPayment) intent).getValue());
                } else if (intent instanceof BuildAndPrepareUserOpRequest.Intent.Swap) {
                    SwapIntent.ADAPTER.encodeWithTag(writer, 6, ((BuildAndPrepareUserOpRequest.Intent.Swap) intent).getValue());
                } else if (intent != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sender);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildAndPrepareUserOpRequest(String str, Intent intent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sender = str;
        this.intent = intent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuildAndPrepareUserOpRequest)) {
            return false;
        }
        BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest = (BuildAndPrepareUserOpRequest) obj;
        return Intrinsics.areEqual(unknownFields(), buildAndPrepareUserOpRequest.unknownFields()) && Intrinsics.areEqual(this.sender, buildAndPrepareUserOpRequest.sender) && Intrinsics.areEqual(this.intent, buildAndPrepareUserOpRequest.intent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sender;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Intent intent = this.intent;
        int hashCode3 = hashCode2 + (intent != null ? intent.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sender = this.sender;
        builder.intent = this.intent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sender;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sender=", arrayList);
        }
        Intent intent = this.intent;
        if (intent != null) {
            arrayList.add("intent=" + intent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BuildAndPrepareUserOpRequest{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BuildAndPrepareUserOpRequest build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "", "<init>", "()V", "SendStablecoin", "ApproveCard", "RevokeCard", "SendSparkPayment", "Swap", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$ApproveCard;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$RevokeCard;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$SendSparkPayment;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$SendStablecoin;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$Swap;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Intent {

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.ApproveCardIntent#ADAPTER", declaredName = "approve_card", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$ApproveCard;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/ApproveCardIntent;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/ApproveCardIntent;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/ApproveCardIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApproveCard extends Intent {
            private final ApproveCardIntent value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApproveCard(ApproveCardIntent approveCardIntent) {
                super(null);
                approveCardIntent.getClass();
                this.value = approveCardIntent;
            }

            public static /* synthetic */ ApproveCard copy$default(ApproveCard approveCard, ApproveCardIntent approveCardIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    approveCardIntent = approveCard.value;
                }
                return approveCard.copy(approveCardIntent);
            }

            /* renamed from: component1, reason: from getter */
            public final ApproveCardIntent getValue() {
                return this.value;
            }

            public final ApproveCard copy(ApproveCardIntent value) {
                value.getClass();
                return new ApproveCard(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApproveCard) && Intrinsics.areEqual(this.value, ((ApproveCard) other).value);
            }

            public final ApproveCardIntent getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ApproveCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.RevokeCardIntent#ADAPTER", declaredName = "revoke_card", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$RevokeCard;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/RevokeCardIntent;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/RevokeCardIntent;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/RevokeCardIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RevokeCard extends Intent {
            private final RevokeCardIntent value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RevokeCard(RevokeCardIntent revokeCardIntent) {
                super(null);
                revokeCardIntent.getClass();
                this.value = revokeCardIntent;
            }

            public static /* synthetic */ RevokeCard copy$default(RevokeCard revokeCard, RevokeCardIntent revokeCardIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    revokeCardIntent = revokeCard.value;
                }
                return revokeCard.copy(revokeCardIntent);
            }

            /* renamed from: component1, reason: from getter */
            public final RevokeCardIntent getValue() {
                return this.value;
            }

            public final RevokeCard copy(RevokeCardIntent value) {
                value.getClass();
                return new RevokeCard(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RevokeCard) && Intrinsics.areEqual(this.value, ((RevokeCard) other).value);
            }

            public final RevokeCardIntent getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RevokeCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SendSparkPaymentIntent#ADAPTER", declaredName = "send_spark_payment", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$SendSparkPayment;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SendSparkPayment extends Intent {
            private final SendSparkPaymentIntent value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendSparkPayment(SendSparkPaymentIntent sendSparkPaymentIntent) {
                super(null);
                sendSparkPaymentIntent.getClass();
                this.value = sendSparkPaymentIntent;
            }

            public static /* synthetic */ SendSparkPayment copy$default(SendSparkPayment sendSparkPayment, SendSparkPaymentIntent sendSparkPaymentIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    sendSparkPaymentIntent = sendSparkPayment.value;
                }
                return sendSparkPayment.copy(sendSparkPaymentIntent);
            }

            /* renamed from: component1, reason: from getter */
            public final SendSparkPaymentIntent getValue() {
                return this.value;
            }

            public final SendSparkPayment copy(SendSparkPaymentIntent value) {
                value.getClass();
                return new SendSparkPayment(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendSparkPayment) && Intrinsics.areEqual(this.value, ((SendSparkPayment) other).value);
            }

            public final SendSparkPaymentIntent getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SendSparkPayment(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SendStablecoinIntent#ADAPTER", declaredName = "send_stablecoin", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$SendStablecoin;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendStablecoinIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SendStablecoin extends Intent {
            private final SendStablecoinIntent value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendStablecoin(SendStablecoinIntent sendStablecoinIntent) {
                super(null);
                sendStablecoinIntent.getClass();
                this.value = sendStablecoinIntent;
            }

            public static /* synthetic */ SendStablecoin copy$default(SendStablecoin sendStablecoin, SendStablecoinIntent sendStablecoinIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    sendStablecoinIntent = sendStablecoin.value;
                }
                return sendStablecoin.copy(sendStablecoinIntent);
            }

            /* renamed from: component1, reason: from getter */
            public final SendStablecoinIntent getValue() {
                return this.value;
            }

            public final SendStablecoin copy(SendStablecoinIntent value) {
                value.getClass();
                return new SendStablecoin(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendStablecoin) && Intrinsics.areEqual(this.value, ((SendStablecoin) other).value);
            }

            public final SendStablecoinIntent getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SendStablecoin(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapIntent#ADAPTER", declaredName = "swap", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent$Swap;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest$Intent;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapIntent;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapIntent;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Swap extends Intent {
            private final SwapIntent value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Swap(SwapIntent swapIntent) {
                super(null);
                swapIntent.getClass();
                this.value = swapIntent;
            }

            public static /* synthetic */ Swap copy$default(Swap swap, SwapIntent swapIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    swapIntent = swap.value;
                }
                return swap.copy(swapIntent);
            }

            /* renamed from: component1, reason: from getter */
            public final SwapIntent getValue() {
                return this.value;
            }

            public final Swap copy(SwapIntent value) {
                value.getClass();
                return new Swap(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Swap) && Intrinsics.areEqual(this.value, ((Swap) other).value);
            }

            public final SwapIntent getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Swap(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Intent() {
        }
    }
}
