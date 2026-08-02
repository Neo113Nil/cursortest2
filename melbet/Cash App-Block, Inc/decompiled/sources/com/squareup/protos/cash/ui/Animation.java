package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Animation;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000f\u000e\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/ui/Animation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/Animation$Builder;", "", "light_url", "Ljava/lang/String;", "dark_url", "", "aspect_ratio", "Ljava/lang/Float;", "", "Lcom/squareup/protos/cash/ui/Animation$DynamicText;", "dynamic_texts", "Ljava/util/List;", "Companion", "Builder", "DynamicText", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Animation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Animation> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
    public final Float aspect_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String dark_url;

    @WireField(adapter = "com.squareup.protos.cash.ui.Animation$DynamicText#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<DynamicText> dynamic_texts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String light_url;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/ui/Animation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/ui/Animation;", "<init>", "()V", "light_url", "", "dark_url", "aspect_ratio", "", "Ljava/lang/Float;", "dynamic_texts", "", "Lcom/squareup/protos/cash/ui/Animation$DynamicText;", "(Ljava/lang/Float;)Lcom/squareup/protos/cash/ui/Animation$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Float aspect_ratio;
        public String dark_url;
        public List<DynamicText> dynamic_texts = EmptyList.INSTANCE;
        public String light_url;

        public final Builder aspect_ratio(Float aspect_ratio) {
            this.aspect_ratio = aspect_ratio;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Animation build() {
            return new Animation(this.light_url, this.dark_url, this.aspect_ratio, this.dynamic_texts, buildUnknownFields());
        }

        public final Builder dark_url(String dark_url) {
            this.dark_url = dark_url;
            return this;
        }

        public final Builder dynamic_texts(List<DynamicText> dynamic_texts) {
            dynamic_texts.getClass();
            TransactorKt.checkElementsNotNull(dynamic_texts);
            this.dynamic_texts = dynamic_texts;
            return this;
        }

        public final Builder light_url(String light_url) {
            this.light_url = light_url;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Animation.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.ui.Animation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Animation decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Animation((String) obj, (String) obj2, (Float) obj3, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.FLOAT.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        m.add(Animation.DynamicText.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Animation value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.light_url);
                protoAdapter2.encodeWithTag(writer, 2, value.dark_url);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.aspect_ratio);
                Animation.DynamicText.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.dynamic_texts);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Animation value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Animation.DynamicText.ADAPTER.asRepeated().encodedSizeWithTag(4, value.dynamic_texts) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.aspect_ratio) + protoAdapter2.encodedSizeWithTag(2, value.dark_url) + protoAdapter2.encodedSizeWithTag(1, value.light_url) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Animation redact(Animation value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.dynamic_texts, Animation.DynamicText.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.light_url;
                String str2 = value.dark_url;
                Float f = value.aspect_ratio;
                byteString.getClass();
                return new Animation(str, str2, f, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Animation value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Animation.DynamicText.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.dynamic_texts);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.aspect_ratio);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.dark_url);
                protoAdapter2.encodeWithTag(writer, 1, value.light_url);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animation(String str, String str2, Float f, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.light_url = str;
        this.dark_url = str2;
        this.aspect_ratio = f;
        this.dynamic_texts = TransactorKt.immutableCopyOf("dynamic_texts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Animation)) {
            return false;
        }
        Animation animation = (Animation) obj;
        return Intrinsics.areEqual(unknownFields(), animation.unknownFields()) && Intrinsics.areEqual(this.light_url, animation.light_url) && Intrinsics.areEqual(this.dark_url, animation.dark_url) && Intrinsics.areEqual(this.aspect_ratio, animation.aspect_ratio) && Intrinsics.areEqual(this.dynamic_texts, animation.dynamic_texts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.light_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.dark_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Float f = this.aspect_ratio;
        int hashCode4 = this.dynamic_texts.hashCode() + ((hashCode3 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.light_url = this.light_url;
        builder.dark_url = this.dark_url;
        builder.aspect_ratio = this.aspect_ratio;
        builder.dynamic_texts = this.dynamic_texts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.light_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_url=", arrayList);
        }
        String str2 = this.dark_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_url=", arrayList);
        }
        Float f = this.aspect_ratio;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("aspect_ratio=", f, arrayList);
        }
        if (!this.dynamic_texts.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("dynamic_texts=", arrayList, this.dynamic_texts);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Animation{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/ui/Animation$DynamicText;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/Animation$DynamicText$Builder;", "key", "", "text", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DynamicText extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DynamicText> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String key;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizableString localizable_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String text;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/ui/Animation$DynamicText$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/ui/Animation$DynamicText;", "<init>", "()V", "key", "", "text", "localizable_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String key;
            public LocalizableString localizable_text;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public DynamicText build() {
                return new DynamicText(this.key, this.text, this.localizable_text, buildUnknownFields());
            }

            public final Builder key(String key) {
                this.key = key;
                return this;
            }

            public final Builder localizable_text(LocalizableString localizable_text) {
                this.localizable_text = localizable_text;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DynamicText.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.ui.Animation$DynamicText$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Animation.DynamicText decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Animation.DynamicText((String) obj, (String) obj2, (LocalizableString) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Animation.DynamicText value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.key);
                    protoAdapter2.encodeWithTag(writer, 2, value.text);
                    LocalizableString.ADAPTER.encodeWithTag(writer, 3, value.localizable_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Animation.DynamicText value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return LocalizableString.ADAPTER.encodedSizeWithTag(3, value.localizable_text) + protoAdapter2.encodedSizeWithTag(2, value.text) + protoAdapter2.encodedSizeWithTag(1, value.key) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Animation.DynamicText redact(Animation.DynamicText value) {
                    value.getClass();
                    LocalizableString localizableString = value.localizable_text;
                    return Animation.DynamicText.copy$default(value, null, null, localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Animation.DynamicText value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalizableString.ADAPTER.encodeWithTag(writer, 3, value.localizable_text);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.text);
                    protoAdapter2.encodeWithTag(writer, 1, value.key);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DynamicText(String str, String str2, LocalizableString localizableString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : localizableString, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DynamicText copy$default(DynamicText dynamicText, String str, String str2, LocalizableString localizableString, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dynamicText.key;
            }
            if ((i & 2) != 0) {
                str2 = dynamicText.text;
            }
            if ((i & 4) != 0) {
                localizableString = dynamicText.localizable_text;
            }
            if ((i & 8) != 0) {
                byteString = dynamicText.unknownFields();
            }
            return dynamicText.copy(str, str2, localizableString, byteString);
        }

        public final DynamicText copy(String key, String text, LocalizableString localizable_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new DynamicText(key, text, localizable_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DynamicText)) {
                return false;
            }
            DynamicText dynamicText = (DynamicText) other;
            return Intrinsics.areEqual(unknownFields(), dynamicText.unknownFields()) && Intrinsics.areEqual(this.key, dynamicText.key) && Intrinsics.areEqual(this.text, dynamicText.text) && Intrinsics.areEqual(this.localizable_text, dynamicText.localizable_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.key;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.key = this.key;
            builder.text = this.text;
            builder.localizable_text = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.key;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key=", arrayList);
            }
            String str2 = this.text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DynamicText{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/ui/Animation$DynamicText$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/ui/Animation$DynamicText$Builder;", "", "body", "Lcom/squareup/protos/cash/ui/Animation$DynamicText;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/ui/Animation$DynamicText;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DynamicText build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DynamicText() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicText(String str, String str2, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.key = str;
            this.text = str2;
            this.localizable_text = localizableString;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/ui/Animation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/ui/Animation$Builder;", "", "body", "Lcom/squareup/protos/cash/ui/Animation;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/ui/Animation;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Animation build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
