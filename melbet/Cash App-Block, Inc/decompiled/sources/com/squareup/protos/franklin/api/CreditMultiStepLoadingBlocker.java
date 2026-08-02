package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker;
import com.squareup.protos.franklin.api.FormBlocker;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0012\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$Builder;", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$AvatarElement;", "avatar_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$AvatarElement;", "", "header", "Ljava/lang/String;", "subheader", "button_text", "", "polling_period", "Ljava/lang/Long;", "", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "loading_steps", "Ljava/util/List;", "Companion", "Builder", "LoadingStep", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreditMultiStepLoadingBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditMultiStepLoadingBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$AvatarElement#ADAPTER", schemaIndex = 0, tag = 1)
    public final FormBlocker.Element.AvatarElement avatar_element;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String header;

    @WireField(adapter = "com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker$LoadingStep#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<LoadingStep> loading_steps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 5, tag = 6)
    public final Long polling_period;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String subheader;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker;", "<init>", "()V", "avatar_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$AvatarElement;", "header", "", "subheader", "button_text", "loading_steps", "", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "polling_period", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public FormBlocker.Element.AvatarElement avatar_element;
        public String button_text;
        public String header;
        public List<LoadingStep> loading_steps = EmptyList.INSTANCE;
        public Long polling_period;
        public String subheader;

        public final Builder avatar_element(FormBlocker.Element.AvatarElement avatar_element) {
            this.avatar_element = avatar_element;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CreditMultiStepLoadingBlocker build() {
            return new CreditMultiStepLoadingBlocker(this.avatar_element, this.header, this.subheader, this.button_text, this.loading_steps, this.polling_period, buildUnknownFields());
        }

        public final Builder button_text(String button_text) {
            this.button_text = button_text;
            return this;
        }

        public final Builder header(String header) {
            this.header = header;
            return this;
        }

        public final Builder loading_steps(List<LoadingStep> loading_steps) {
            loading_steps.getClass();
            TransactorKt.checkElementsNotNull(loading_steps);
            this.loading_steps = loading_steps;
            return this;
        }

        public final Builder polling_period(Long polling_period) {
            this.polling_period = polling_period;
            return this;
        }

        public final Builder subheader(String subheader) {
            this.subheader = subheader;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreditMultiStepLoadingBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CreditMultiStepLoadingBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CreditMultiStepLoadingBlocker((FormBlocker.Element.AvatarElement) obj, (String) obj2, (String) obj3, (String) obj4, m, (Long) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.AvatarElement.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            m.add(CreditMultiStepLoadingBlocker.LoadingStep.ADAPTER.decode(reader));
                            break;
                        case 6:
                            obj5 = ProtoAdapter.INT64.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreditMultiStepLoadingBlocker value) {
                writer.getClass();
                value.getClass();
                FormBlocker.Element.AvatarElement.ADAPTER.encodeWithTag(writer, 1, value.avatar_element);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.header);
                protoAdapter2.encodeWithTag(writer, 3, value.subheader);
                protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                CreditMultiStepLoadingBlocker.LoadingStep.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.loading_steps);
                ProtoAdapter.INT64.encodeWithTag(writer, 6, value.polling_period);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreditMultiStepLoadingBlocker value) {
                value.getClass();
                int encodedSizeWithTag = FormBlocker.Element.AvatarElement.ADAPTER.encodedSizeWithTag(1, value.avatar_element) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.INT64.encodedSizeWithTag(6, value.polling_period) + CreditMultiStepLoadingBlocker.LoadingStep.ADAPTER.asRepeated().encodedSizeWithTag(5, value.loading_steps) + protoAdapter2.encodedSizeWithTag(4, value.button_text) + protoAdapter2.encodedSizeWithTag(3, value.subheader) + protoAdapter2.encodedSizeWithTag(2, value.header) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreditMultiStepLoadingBlocker redact(CreditMultiStepLoadingBlocker value) {
                value.getClass();
                FormBlocker.Element.AvatarElement avatarElement = value.avatar_element;
                FormBlocker.Element.AvatarElement avatarElement2 = avatarElement != null ? (FormBlocker.Element.AvatarElement) FormBlocker.Element.AvatarElement.ADAPTER.redact(avatarElement) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.loading_steps, CreditMultiStepLoadingBlocker.LoadingStep.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.header;
                String str2 = value.subheader;
                String str3 = value.button_text;
                Long l = value.polling_period;
                byteString.getClass();
                return new CreditMultiStepLoadingBlocker(avatarElement2, str, str2, str3, m1169redactElements, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreditMultiStepLoadingBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(writer, 6, value.polling_period);
                CreditMultiStepLoadingBlocker.LoadingStep.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.loading_steps);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                protoAdapter2.encodeWithTag(writer, 3, value.subheader);
                protoAdapter2.encodeWithTag(writer, 2, value.header);
                FormBlocker.Element.AvatarElement.ADAPTER.encodeWithTag(writer, 1, value.avatar_element);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditMultiStepLoadingBlocker(FormBlocker.Element.AvatarElement avatarElement, String str, String str2, String str3, List list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.avatar_element = avatarElement;
        this.header = str;
        this.subheader = str2;
        this.button_text = str3;
        this.polling_period = l;
        this.loading_steps = TransactorKt.immutableCopyOf("loading_steps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditMultiStepLoadingBlocker)) {
            return false;
        }
        CreditMultiStepLoadingBlocker creditMultiStepLoadingBlocker = (CreditMultiStepLoadingBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), creditMultiStepLoadingBlocker.unknownFields()) && Intrinsics.areEqual(this.avatar_element, creditMultiStepLoadingBlocker.avatar_element) && Intrinsics.areEqual(this.header, creditMultiStepLoadingBlocker.header) && Intrinsics.areEqual(this.subheader, creditMultiStepLoadingBlocker.subheader) && Intrinsics.areEqual(this.button_text, creditMultiStepLoadingBlocker.button_text) && Intrinsics.areEqual(this.loading_steps, creditMultiStepLoadingBlocker.loading_steps) && Intrinsics.areEqual(this.polling_period, creditMultiStepLoadingBlocker.polling_period);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FormBlocker.Element.AvatarElement avatarElement = this.avatar_element;
        int hashCode2 = (hashCode + (avatarElement != null ? avatarElement.hashCode() : 0)) * 37;
        String str = this.header;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subheader;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.loading_steps);
        Long l = this.polling_period;
        int hashCode5 = m + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.avatar_element = this.avatar_element;
        builder.header = this.header;
        builder.subheader = this.subheader;
        builder.button_text = this.button_text;
        builder.loading_steps = this.loading_steps;
        builder.polling_period = this.polling_period;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FormBlocker.Element.AvatarElement avatarElement = this.avatar_element;
        if (avatarElement != null) {
            arrayList.add("avatar_element=" + avatarElement);
        }
        String str = this.header;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
        }
        String str2 = this.subheader;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subheader=", arrayList);
        }
        String str3 = this.button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
        }
        if (!this.loading_steps.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("loading_steps=", arrayList, this.loading_steps);
        }
        Long l = this.polling_period;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("polling_period=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditMultiStepLoadingBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0015R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep$Builder;", "text", "", "waiting_time", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class LoadingStep extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoadingStep> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
        public final Long waiting_time;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "<init>", "()V", "text", "", "waiting_time", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String text;
            public Long waiting_time;

            @Override // com.squareup.wire.Message.Builder
            public LoadingStep build() {
                return new LoadingStep(this.text, this.waiting_time, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }

            public final Builder waiting_time(Long waiting_time) {
                this.waiting_time = waiting_time;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LoadingStep.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker$LoadingStep$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CreditMultiStepLoadingBlocker.LoadingStep decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CreditMultiStepLoadingBlocker.LoadingStep((String) obj, (Long) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.INT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CreditMultiStepLoadingBlocker.LoadingStep value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, value.waiting_time);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CreditMultiStepLoadingBlocker.LoadingStep value) {
                    value.getClass();
                    return ProtoAdapter.INT64.encodedSizeWithTag(2, value.waiting_time) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CreditMultiStepLoadingBlocker.LoadingStep redact(CreditMultiStepLoadingBlocker.LoadingStep value) {
                    value.getClass();
                    return CreditMultiStepLoadingBlocker.LoadingStep.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CreditMultiStepLoadingBlocker.LoadingStep value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, value.waiting_time);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LoadingStep(String str, Long l, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LoadingStep copy$default(LoadingStep loadingStep, String str, Long l, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadingStep.text;
            }
            if ((i & 2) != 0) {
                l = loadingStep.waiting_time;
            }
            if ((i & 4) != 0) {
                byteString = loadingStep.unknownFields();
            }
            return loadingStep.copy(str, l, byteString);
        }

        public final LoadingStep copy(String text, Long waiting_time, ByteString unknownFields) {
            unknownFields.getClass();
            return new LoadingStep(text, waiting_time, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LoadingStep)) {
                return false;
            }
            LoadingStep loadingStep = (LoadingStep) other;
            return Intrinsics.areEqual(unknownFields(), loadingStep.unknownFields()) && Intrinsics.areEqual(this.text, loadingStep.text) && Intrinsics.areEqual(this.waiting_time, loadingStep.waiting_time);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.waiting_time;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.waiting_time = this.waiting_time;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            Long l = this.waiting_time;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("waiting_time=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoadingStep{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$LoadingStep;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LoadingStep build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LoadingStep() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingStep(String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.waiting_time = l;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CreditMultiStepLoadingBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CreditMultiStepLoadingBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
