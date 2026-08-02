package com.squareup.protos.cash.fiatly.blocker.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLink;
import com.squareup.protos.cash.fiatly.blocker.v1.InstrumentSelectionItem;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0012\u0013\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Builder;", "", "enabled", "Ljava/lang/Boolean;", "", "title", "Ljava/lang/String;", "description", "additional_info", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image;", "image", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "instrument_link", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "Companion", "Builder", "Image", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstrumentSelectionItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentSelectionItem> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final boolean DEFAULT_ENABLED = true;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String additional_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean enabled;

    @WireSealedOneof(schemaIndex = 4)
    public final Image image;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.InstrumentLink#ADAPTER", schemaIndex = 5, tag = 6)
    public final InstrumentLink instrument_link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem;", "<init>", "()V", "enabled", "", "Ljava/lang/Boolean;", "title", "", "description", "additional_info", "image", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image;", "instrument_link", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentLink;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String additional_info;
        public String description;
        public Boolean enabled;
        public Image image;
        public InstrumentLink instrument_link;
        public String title;

        public final Builder additional_info(String additional_info) {
            this.additional_info = additional_info;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public InstrumentSelectionItem build() {
            return new InstrumentSelectionItem(this.enabled, this.title, this.description, this.additional_info, this.image, this.instrument_link, buildUnknownFields());
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder image(Image image) {
            this.image = image;
            return this;
        }

        public final Builder instrument_link(InstrumentLink instrument_link) {
            this.instrument_link = instrument_link;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentSelectionItem.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.fiatly.blocker.v1.InstrumentSelectionItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentSelectionItem decode(ProtoReader reader) {
                InstrumentSelectionItem.Image iconUrl;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                InstrumentSelectionItem.Image image = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InstrumentSelectionItem((Boolean) obj, (String) obj2, (String) obj3, (String) obj4, image, (InstrumentLink) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 5:
                            try {
                                iconUrl = new InstrumentSelectionItem.Image.Icon((Icon) Icon.ADAPTER.decode(reader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(InstrumentLink.ADAPTER, reader, obj5);
                            continue;
                        case 7:
                            iconUrl = new InstrumentSelectionItem.Image.IconUrl((String) ProtoAdapter.STRING.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            continue;
                    }
                    image = iconUrl;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentSelectionItem value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InstrumentSelectionItem.Image image = value.image;
                if (image instanceof InstrumentSelectionItem.Image.Icon) {
                    Icon.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionItem.Image.Icon) image).getValue());
                } else if (image instanceof InstrumentSelectionItem.Image.IconUrl) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, ((InstrumentSelectionItem.Image.IconUrl) image).getValue());
                } else if (image != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                InstrumentLink.ADAPTER.encodeWithTag(writer, 6, value.instrument_link);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.additional_info);
                protoAdapter2.encodeWithTag(writer, 3, value.description);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.enabled);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentSelectionItem value) {
                int encodedSizeWithTag;
                value.getClass();
                int encodedSizeWithTag2 = ProtoAdapter.BOOL.encodedSizeWithTag(1, value.enabled) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(4, value.additional_info) + protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag2;
                InstrumentSelectionItem.Image image = value.image;
                if (image instanceof InstrumentSelectionItem.Image.Icon) {
                    encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(5, ((InstrumentSelectionItem.Image.Icon) image).getValue());
                } else {
                    if (!(image instanceof InstrumentSelectionItem.Image.IconUrl)) {
                        if (image != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return InstrumentLink.ADAPTER.encodedSizeWithTag(6, value.instrument_link) + encodedSizeWithTag3;
                    }
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(7, ((InstrumentSelectionItem.Image.IconUrl) image).getValue());
                }
                encodedSizeWithTag3 += encodedSizeWithTag;
                return InstrumentLink.ADAPTER.encodedSizeWithTag(6, value.instrument_link) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentSelectionItem redact(InstrumentSelectionItem value) {
                value.getClass();
                InstrumentLink instrumentLink = value.instrument_link;
                InstrumentLink instrumentLink2 = instrumentLink != null ? (InstrumentLink) InstrumentLink.ADAPTER.redact(instrumentLink) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.enabled;
                String str = value.title;
                String str2 = value.description;
                String str3 = value.additional_info;
                InstrumentSelectionItem.Image image = value.image;
                byteString.getClass();
                return new InstrumentSelectionItem(bool, str, str2, str3, image, instrumentLink2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentSelectionItem value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.enabled);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.description);
                protoAdapter2.encodeWithTag(writer, 4, value.additional_info);
                InstrumentLink.ADAPTER.encodeWithTag(writer, 6, value.instrument_link);
                InstrumentSelectionItem.Image image = value.image;
                if (image instanceof InstrumentSelectionItem.Image.Icon) {
                    Icon.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionItem.Image.Icon) image).getValue());
                } else if (image instanceof InstrumentSelectionItem.Image.IconUrl) {
                    protoAdapter2.encodeWithTag(writer, 7, ((InstrumentSelectionItem.Image.IconUrl) image).getValue());
                } else if (image != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionItem(Boolean bool, String str, String str2, String str3, Image image, InstrumentLink instrumentLink, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.title = str;
        this.description = str2;
        this.additional_info = str3;
        this.image = image;
        this.instrument_link = instrumentLink;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionItem)) {
            return false;
        }
        InstrumentSelectionItem instrumentSelectionItem = (InstrumentSelectionItem) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentSelectionItem.unknownFields()) && Intrinsics.areEqual(this.enabled, instrumentSelectionItem.enabled) && Intrinsics.areEqual(this.title, instrumentSelectionItem.title) && Intrinsics.areEqual(this.description, instrumentSelectionItem.description) && Intrinsics.areEqual(this.additional_info, instrumentSelectionItem.additional_info) && Intrinsics.areEqual(this.image, instrumentSelectionItem.image) && Intrinsics.areEqual(this.instrument_link, instrumentSelectionItem.instrument_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.additional_info;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
        InstrumentLink instrumentLink = this.instrument_link;
        int hashCode7 = hashCode6 + (instrumentLink != null ? instrumentLink.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.title = this.title;
        builder.description = this.description;
        builder.additional_info = this.additional_info;
        builder.image = this.image;
        builder.instrument_link = this.instrument_link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        String str3 = this.additional_info;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "additional_info=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        InstrumentLink instrumentLink = this.instrument_link;
        if (instrumentLink != null) {
            arrayList.add("instrument_link=" + instrumentLink);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentSelectionItem{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Builder;", "", "body", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem;", "", "DEFAULT_ENABLED", "Z", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InstrumentSelectionItem build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image;", "", "<init>", "()V", "Icon", "IconUrl", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image$Icon;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image$IconUrl;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Image {

        @WireOneofField(adapter = "com.squareup.protos.cash.fiatly.blocker.v1.Icon#ADAPTER", declaredName = "icon", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image$Icon;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image;", "value", "Lcom/squareup/protos/cash/fiatly/blocker/v1/Icon;", "<init>", "(Lcom/squareup/protos/cash/fiatly/blocker/v1/Icon;)V", "getValue", "()Lcom/squareup/protos/cash/fiatly/blocker/v1/Icon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Icon extends Image {
            private final com.squareup.protos.cash.fiatly.blocker.v1.Icon value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(com.squareup.protos.cash.fiatly.blocker.v1.Icon icon) {
                super(null);
                icon.getClass();
                this.value = icon;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, com.squareup.protos.cash.fiatly.blocker.v1.Icon icon2, int i, Object obj) {
                if ((i & 1) != 0) {
                    icon2 = icon.value;
                }
                return icon.copy(icon2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.protos.cash.fiatly.blocker.v1.Icon getValue() {
                return this.value;
            }

            public final Icon copy(com.squareup.protos.cash.fiatly.blocker.v1.Icon value) {
                value.getClass();
                return new Icon(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && this.value == ((Icon) other).value;
            }

            public final com.squareup.protos.cash.fiatly.blocker.v1.Icon getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Icon(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "icon_url", tag = 7)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image$IconUrl;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem$Image;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class IconUrl extends Image {
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconUrl(String str) {
                super(null);
                str.getClass();
                this.value = str;
            }

            public static /* synthetic */ IconUrl copy$default(IconUrl iconUrl, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iconUrl.value;
                }
                return iconUrl.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final IconUrl copy(String value) {
                value.getClass();
                return new IconUrl(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconUrl) && Intrinsics.areEqual(this.value, ((IconUrl) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IconUrl(value=", this.value, ")");
            }
        }

        public /* synthetic */ Image(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Image() {
        }
    }
}
