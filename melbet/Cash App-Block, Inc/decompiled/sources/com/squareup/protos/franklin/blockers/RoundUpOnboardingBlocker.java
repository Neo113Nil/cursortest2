package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker$Builder;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "onboarding_intro_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$DestinationSelector;", "destination_selector_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$DestinationSelector;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$StockSelector;", "stock_selector_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$StockSelector;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundUpOnboardingBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RoundUpOnboardingBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.RoundUp$Screens$DestinationSelector#ADAPTER", schemaIndex = 1, tag = 2)
    public final RoundUp$Screens$DestinationSelector destination_selector_screen;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.RoundUp$Screens$OnboardingIntro#ADAPTER", schemaIndex = 0, tag = 1)
    public final RoundUp$Screens$OnboardingIntro onboarding_intro_screen;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.RoundUp$Screens$StockSelector#ADAPTER", schemaIndex = 2, tag = 3)
    public final RoundUp$Screens$StockSelector stock_selector_screen;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker;", "<init>", "()V", "onboarding_intro_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "destination_selector_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$DestinationSelector;", "stock_selector_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$StockSelector;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public RoundUp$Screens$DestinationSelector destination_selector_screen;
        public RoundUp$Screens$OnboardingIntro onboarding_intro_screen;
        public RoundUp$Screens$StockSelector stock_selector_screen;

        @Override // com.squareup.wire.Message.Builder
        public RoundUpOnboardingBlocker build() {
            return new RoundUpOnboardingBlocker(this.onboarding_intro_screen, this.destination_selector_screen, this.stock_selector_screen, buildUnknownFields());
        }

        public final Builder destination_selector_screen(RoundUp$Screens$DestinationSelector destination_selector_screen) {
            this.destination_selector_screen = destination_selector_screen;
            return this;
        }

        public final Builder onboarding_intro_screen(RoundUp$Screens$OnboardingIntro onboarding_intro_screen) {
            this.onboarding_intro_screen = onboarding_intro_screen;
            return this;
        }

        public final Builder stock_selector_screen(RoundUp$Screens$StockSelector stock_selector_screen) {
            this.stock_selector_screen = stock_selector_screen;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RoundUpOnboardingBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.RoundUpOnboardingBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RoundUpOnboardingBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RoundUpOnboardingBlocker((RoundUp$Screens$OnboardingIntro) obj, (RoundUp$Screens$DestinationSelector) obj2, (RoundUp$Screens$StockSelector) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RoundUp$Screens$OnboardingIntro.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(RoundUp$Screens$DestinationSelector.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RoundUp$Screens$StockSelector.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RoundUpOnboardingBlocker value) {
                writer.getClass();
                value.getClass();
                RoundUp$Screens$OnboardingIntro.ADAPTER.encodeWithTag(writer, 1, value.onboarding_intro_screen);
                RoundUp$Screens$DestinationSelector.ADAPTER.encodeWithTag(writer, 2, value.destination_selector_screen);
                RoundUp$Screens$StockSelector.ADAPTER.encodeWithTag(writer, 3, value.stock_selector_screen);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RoundUpOnboardingBlocker value) {
                value.getClass();
                return RoundUp$Screens$StockSelector.ADAPTER.encodedSizeWithTag(3, value.stock_selector_screen) + RoundUp$Screens$DestinationSelector.ADAPTER.encodedSizeWithTag(2, value.destination_selector_screen) + RoundUp$Screens$OnboardingIntro.ADAPTER.encodedSizeWithTag(1, value.onboarding_intro_screen) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RoundUpOnboardingBlocker redact(RoundUpOnboardingBlocker value) {
                value.getClass();
                RoundUp$Screens$OnboardingIntro roundUp$Screens$OnboardingIntro = value.onboarding_intro_screen;
                RoundUp$Screens$OnboardingIntro roundUp$Screens$OnboardingIntro2 = roundUp$Screens$OnboardingIntro != null ? (RoundUp$Screens$OnboardingIntro) RoundUp$Screens$OnboardingIntro.ADAPTER.redact(roundUp$Screens$OnboardingIntro) : null;
                RoundUp$Screens$DestinationSelector roundUp$Screens$DestinationSelector = value.destination_selector_screen;
                RoundUp$Screens$DestinationSelector roundUp$Screens$DestinationSelector2 = roundUp$Screens$DestinationSelector != null ? (RoundUp$Screens$DestinationSelector) RoundUp$Screens$DestinationSelector.ADAPTER.redact(roundUp$Screens$DestinationSelector) : null;
                RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = value.stock_selector_screen;
                RoundUp$Screens$StockSelector roundUp$Screens$StockSelector2 = roundUp$Screens$StockSelector != null ? (RoundUp$Screens$StockSelector) RoundUp$Screens$StockSelector.ADAPTER.redact(roundUp$Screens$StockSelector) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RoundUpOnboardingBlocker(roundUp$Screens$OnboardingIntro2, roundUp$Screens$DestinationSelector2, roundUp$Screens$StockSelector2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RoundUpOnboardingBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                RoundUp$Screens$StockSelector.ADAPTER.encodeWithTag(writer, 3, value.stock_selector_screen);
                RoundUp$Screens$DestinationSelector.ADAPTER.encodeWithTag(writer, 2, value.destination_selector_screen);
                RoundUp$Screens$OnboardingIntro.ADAPTER.encodeWithTag(writer, 1, value.onboarding_intro_screen);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundUpOnboardingBlocker(RoundUp$Screens$OnboardingIntro roundUp$Screens$OnboardingIntro, RoundUp$Screens$DestinationSelector roundUp$Screens$DestinationSelector, RoundUp$Screens$StockSelector roundUp$Screens$StockSelector, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.onboarding_intro_screen = roundUp$Screens$OnboardingIntro;
        this.destination_selector_screen = roundUp$Screens$DestinationSelector;
        this.stock_selector_screen = roundUp$Screens$StockSelector;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoundUpOnboardingBlocker)) {
            return false;
        }
        RoundUpOnboardingBlocker roundUpOnboardingBlocker = (RoundUpOnboardingBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), roundUpOnboardingBlocker.unknownFields()) && Intrinsics.areEqual(this.onboarding_intro_screen, roundUpOnboardingBlocker.onboarding_intro_screen) && Intrinsics.areEqual(this.destination_selector_screen, roundUpOnboardingBlocker.destination_selector_screen) && Intrinsics.areEqual(this.stock_selector_screen, roundUpOnboardingBlocker.stock_selector_screen);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RoundUp$Screens$OnboardingIntro roundUp$Screens$OnboardingIntro = this.onboarding_intro_screen;
        int hashCode2 = (hashCode + (roundUp$Screens$OnboardingIntro != null ? roundUp$Screens$OnboardingIntro.hashCode() : 0)) * 37;
        RoundUp$Screens$DestinationSelector roundUp$Screens$DestinationSelector = this.destination_selector_screen;
        int hashCode3 = (hashCode2 + (roundUp$Screens$DestinationSelector != null ? roundUp$Screens$DestinationSelector.hashCode() : 0)) * 37;
        RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = this.stock_selector_screen;
        int hashCode4 = hashCode3 + (roundUp$Screens$StockSelector != null ? roundUp$Screens$StockSelector.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.onboarding_intro_screen = this.onboarding_intro_screen;
        builder.destination_selector_screen = this.destination_selector_screen;
        builder.stock_selector_screen = this.stock_selector_screen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RoundUp$Screens$OnboardingIntro roundUp$Screens$OnboardingIntro = this.onboarding_intro_screen;
        if (roundUp$Screens$OnboardingIntro != null) {
            arrayList.add("onboarding_intro_screen=" + roundUp$Screens$OnboardingIntro);
        }
        RoundUp$Screens$DestinationSelector roundUp$Screens$DestinationSelector = this.destination_selector_screen;
        if (roundUp$Screens$DestinationSelector != null) {
            arrayList.add("destination_selector_screen=" + roundUp$Screens$DestinationSelector);
        }
        RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = this.stock_selector_screen;
        if (roundUp$Screens$StockSelector != null) {
            arrayList.add("stock_selector_screen=" + roundUp$Screens$StockSelector);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RoundUpOnboardingBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/RoundUpOnboardingBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RoundUpOnboardingBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
