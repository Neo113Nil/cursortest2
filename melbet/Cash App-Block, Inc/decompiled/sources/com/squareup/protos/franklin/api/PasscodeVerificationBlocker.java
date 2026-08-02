package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.instrument.InstrumentType;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker$Builder;", "Lcom/squareup/protos/common/instrument/InstrumentType;", "brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "", "pan_suffix", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/Instrument;", "instrument", "Lcom/squareup/protos/franklin/api/Instrument;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PasscodeVerificationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasscodeVerificationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.instrument.InstrumentType#ADAPTER", schemaIndex = 0, tag = 1)
    public final InstrumentType brand;

    @WireField(adapter = "com.squareup.protos.franklin.api.Instrument#ADAPTER", schemaIndex = 2, tag = 3)
    public final Instrument instrument;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String pan_suffix;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker;", "<init>", "()V", "brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "pan_suffix", "", "instrument", "Lcom/squareup/protos/franklin/api/Instrument;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public InstrumentType brand;
        public Instrument instrument;
        public String pan_suffix;

        public final Builder brand(InstrumentType brand) {
            this.brand = brand;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PasscodeVerificationBlocker build() {
            return new PasscodeVerificationBlocker(this.brand, this.pan_suffix, this.instrument, buildUnknownFields());
        }

        public final Builder instrument(Instrument instrument) {
            this.instrument = instrument;
            return this;
        }

        public final Builder pan_suffix(String pan_suffix) {
            this.pan_suffix = pan_suffix;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasscodeVerificationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PasscodeVerificationBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PasscodeVerificationBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PasscodeVerificationBlocker((InstrumentType) obj, (String) obj2, (Instrument) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = InstrumentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasscodeVerificationBlocker value) {
                writer.getClass();
                value.getClass();
                InstrumentType.ADAPTER.encodeWithTag(writer, 1, value.brand);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.pan_suffix);
                Instrument.ADAPTER.encodeWithTag(writer, 3, value.instrument);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasscodeVerificationBlocker value) {
                value.getClass();
                return Instrument.ADAPTER.encodedSizeWithTag(3, value.instrument) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.pan_suffix) + InstrumentType.ADAPTER.encodedSizeWithTag(1, value.brand) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasscodeVerificationBlocker redact(PasscodeVerificationBlocker value) {
                value.getClass();
                Instrument instrument = value.instrument;
                Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
                ByteString byteString = ByteString.EMPTY;
                InstrumentType instrumentType = value.brand;
                String str = value.pan_suffix;
                byteString.getClass();
                return new PasscodeVerificationBlocker(instrumentType, str, instrument2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasscodeVerificationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Instrument.ADAPTER.encodeWithTag(writer, 3, value.instrument);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.pan_suffix);
                InstrumentType.ADAPTER.encodeWithTag(writer, 1, value.brand);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeVerificationBlocker(InstrumentType instrumentType, String str, Instrument instrument, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand = instrumentType;
        this.pan_suffix = str;
        this.instrument = instrument;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasscodeVerificationBlocker)) {
            return false;
        }
        PasscodeVerificationBlocker passcodeVerificationBlocker = (PasscodeVerificationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), passcodeVerificationBlocker.unknownFields()) && this.brand == passcodeVerificationBlocker.brand && Intrinsics.areEqual(this.pan_suffix, passcodeVerificationBlocker.pan_suffix) && Intrinsics.areEqual(this.instrument, passcodeVerificationBlocker.instrument);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentType instrumentType = this.brand;
        int hashCode2 = (hashCode + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str = this.pan_suffix;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Instrument instrument = this.instrument;
        int hashCode4 = hashCode3 + (instrument != null ? instrument.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.brand = this.brand;
        builder.pan_suffix = this.pan_suffix;
        builder.instrument = this.instrument;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstrumentType instrumentType = this.brand;
        if (instrumentType != null) {
            arrayList.add("brand=" + instrumentType);
        }
        String str = this.pan_suffix;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pan_suffix=", arrayList);
        }
        Instrument instrument = this.instrument;
        if (instrument != null) {
            arrayList.add("instrument=" + instrument);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasscodeVerificationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PasscodeVerificationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PasscodeVerificationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
