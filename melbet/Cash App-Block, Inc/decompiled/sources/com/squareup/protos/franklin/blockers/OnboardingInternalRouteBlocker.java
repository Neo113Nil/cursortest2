package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker$Builder;", "", "flow_token", "Ljava/lang/String;", "", "child_flow_type", "Ljava/lang/Integer;", "error_title_text", "error_button_text", "error_body_text", "encoded_flow_params", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardingInternalRouteBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnboardingInternalRouteBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer child_flow_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String encoded_flow_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String error_body_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String error_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String error_title_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String flow_token;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker;", "<init>", "()V", "flow_token", "", "child_flow_type", "", "Ljava/lang/Integer;", "error_title_text", "error_button_text", "error_body_text", "encoded_flow_params", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Integer child_flow_type;
        public String encoded_flow_params;
        public String error_body_text;
        public String error_button_text;
        public String error_title_text;
        public String flow_token;

        @Override // com.squareup.wire.Message.Builder
        public OnboardingInternalRouteBlocker build() {
            return new OnboardingInternalRouteBlocker(this.flow_token, this.child_flow_type, this.error_title_text, this.error_button_text, this.error_body_text, this.encoded_flow_params, buildUnknownFields());
        }

        public final Builder child_flow_type(Integer child_flow_type) {
            this.child_flow_type = child_flow_type;
            return this;
        }

        public final Builder encoded_flow_params(String encoded_flow_params) {
            this.encoded_flow_params = encoded_flow_params;
            return this;
        }

        public final Builder error_body_text(String error_body_text) {
            this.error_body_text = error_body_text;
            return this;
        }

        public final Builder error_button_text(String error_button_text) {
            this.error_button_text = error_button_text;
            return this;
        }

        public final Builder error_title_text(String error_title_text) {
            this.error_title_text = error_title_text;
            return this;
        }

        public final Builder flow_token(String flow_token) {
            this.flow_token = flow_token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OnboardingInternalRouteBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.OnboardingInternalRouteBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingInternalRouteBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new OnboardingInternalRouteBlocker((String) obj, (Integer) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OnboardingInternalRouteBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.flow_token);
                ProtoAdapter.INT32.encodeWithTag(writer, 2, value.child_flow_type);
                protoAdapter2.encodeWithTag(writer, 3, value.error_title_text);
                protoAdapter2.encodeWithTag(writer, 4, value.error_button_text);
                protoAdapter2.encodeWithTag(writer, 5, value.error_body_text);
                protoAdapter2.encodeWithTag(writer, 6, value.encoded_flow_params);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OnboardingInternalRouteBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, value.encoded_flow_params) + protoAdapter2.encodedSizeWithTag(5, value.error_body_text) + protoAdapter2.encodedSizeWithTag(4, value.error_button_text) + protoAdapter2.encodedSizeWithTag(3, value.error_title_text) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.child_flow_type) + protoAdapter2.encodedSizeWithTag(1, value.flow_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingInternalRouteBlocker redact(OnboardingInternalRouteBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.flow_token;
                Integer num = value.child_flow_type;
                String str2 = value.error_title_text;
                String str3 = value.error_button_text;
                String str4 = value.error_body_text;
                String str5 = value.encoded_flow_params;
                value.getClass();
                byteString.getClass();
                return new OnboardingInternalRouteBlocker(str, num, str2, str3, str4, str5, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OnboardingInternalRouteBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.encoded_flow_params);
                protoAdapter2.encodeWithTag(writer, 5, value.error_body_text);
                protoAdapter2.encodeWithTag(writer, 4, value.error_button_text);
                protoAdapter2.encodeWithTag(writer, 3, value.error_title_text);
                ProtoAdapter.INT32.encodeWithTag(writer, 2, value.child_flow_type);
                protoAdapter2.encodeWithTag(writer, 1, value.flow_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInternalRouteBlocker(String str, Integer num, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.flow_token = str;
        this.child_flow_type = num;
        this.error_title_text = str2;
        this.error_button_text = str3;
        this.error_body_text = str4;
        this.encoded_flow_params = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnboardingInternalRouteBlocker)) {
            return false;
        }
        OnboardingInternalRouteBlocker onboardingInternalRouteBlocker = (OnboardingInternalRouteBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), onboardingInternalRouteBlocker.unknownFields()) && Intrinsics.areEqual(this.flow_token, onboardingInternalRouteBlocker.flow_token) && Intrinsics.areEqual(this.child_flow_type, onboardingInternalRouteBlocker.child_flow_type) && Intrinsics.areEqual(this.error_title_text, onboardingInternalRouteBlocker.error_title_text) && Intrinsics.areEqual(this.error_button_text, onboardingInternalRouteBlocker.error_button_text) && Intrinsics.areEqual(this.error_body_text, onboardingInternalRouteBlocker.error_body_text) && Intrinsics.areEqual(this.encoded_flow_params, onboardingInternalRouteBlocker.encoded_flow_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.child_flow_type;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str2 = this.error_title_text;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.error_button_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.error_body_text;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.encoded_flow_params;
        int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.flow_token = this.flow_token;
        builder.child_flow_type = this.child_flow_type;
        builder.error_title_text = this.error_title_text;
        builder.error_button_text = this.error_button_text;
        builder.error_body_text = this.error_body_text;
        builder.encoded_flow_params = this.encoded_flow_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_token=", arrayList);
        }
        Integer num = this.child_flow_type;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("child_flow_type=", num, arrayList);
        }
        String str2 = this.error_title_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "error_title_text=", arrayList);
        }
        String str3 = this.error_button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "error_button_text=", arrayList);
        }
        String str4 = this.error_body_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "error_body_text=", arrayList);
        }
        String str5 = this.encoded_flow_params;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "encoded_flow_params=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingInternalRouteBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/OnboardingInternalRouteBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ OnboardingInternalRouteBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
