package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u000f\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Builder;", "Lcom/squareup/protos/cash/ui/Image;", "banner_image", "Lcom/squareup/protos/cash/ui/Image;", "", "title", "Ljava/lang/String;", "body", "primary_button_title", "", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action;", "actions", "Ljava/util/List;", "Companion", "Builder", "Action", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EarnerEnrollmentSuccessBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarnerEnrollmentSuccessBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker$Action#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<Action> actions;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
    public final Image banner_image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String primary_button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker;", "<init>", "()V", "banner_image", "Lcom/squareup/protos/cash/ui/Image;", "title", "", "body", "actions", "", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action;", "primary_button_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<Action> actions = EmptyList.INSTANCE;
        public Image banner_image;
        public String body;
        public String primary_button_title;
        public String title;

        public final Builder actions(List<Action> actions) {
            actions.getClass();
            TransactorKt.checkElementsNotNull(actions);
            this.actions = actions;
            return this;
        }

        public final Builder banner_image(Image banner_image) {
            this.banner_image = banner_image;
            return this;
        }

        public final Builder body(String body) {
            this.body = body;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public EarnerEnrollmentSuccessBlocker build() {
            return new EarnerEnrollmentSuccessBlocker(this.banner_image, this.title, this.body, this.actions, this.primary_button_title, buildUnknownFields());
        }

        public final Builder primary_button_title(String primary_button_title) {
            this.primary_button_title = primary_button_title;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EarnerEnrollmentSuccessBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public EarnerEnrollmentSuccessBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new EarnerEnrollmentSuccessBlocker((Image) obj, (String) obj2, (String) obj3, m, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        m.add(EarnerEnrollmentSuccessBlocker.Action.ADAPTER.decode(reader));
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EarnerEnrollmentSuccessBlocker value) {
                writer.getClass();
                value.getClass();
                Image.ADAPTER.encodeWithTag(writer, 1, value.banner_image);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.body);
                EarnerEnrollmentSuccessBlocker.Action.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.actions);
                protoAdapter2.encodeWithTag(writer, 5, value.primary_button_title);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EarnerEnrollmentSuccessBlocker value) {
                value.getClass();
                int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.banner_image) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, value.primary_button_title) + EarnerEnrollmentSuccessBlocker.Action.ADAPTER.asRepeated().encodedSizeWithTag(4, value.actions) + protoAdapter2.encodedSizeWithTag(3, value.body) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EarnerEnrollmentSuccessBlocker redact(EarnerEnrollmentSuccessBlocker value) {
                value.getClass();
                Image image = value.banner_image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.actions, EarnerEnrollmentSuccessBlocker.Action.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.body;
                String str3 = value.primary_button_title;
                byteString.getClass();
                return new EarnerEnrollmentSuccessBlocker(image2, str, str2, m1169redactElements, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EarnerEnrollmentSuccessBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.primary_button_title);
                EarnerEnrollmentSuccessBlocker.Action.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.actions);
                protoAdapter2.encodeWithTag(writer, 3, value.body);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                Image.ADAPTER.encodeWithTag(writer, 1, value.banner_image);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerEnrollmentSuccessBlocker(Image image, String str, String str2, List list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.banner_image = image;
        this.title = str;
        this.body = str2;
        this.primary_button_title = str3;
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarnerEnrollmentSuccessBlocker)) {
            return false;
        }
        EarnerEnrollmentSuccessBlocker earnerEnrollmentSuccessBlocker = (EarnerEnrollmentSuccessBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), earnerEnrollmentSuccessBlocker.unknownFields()) && Intrinsics.areEqual(this.banner_image, earnerEnrollmentSuccessBlocker.banner_image) && Intrinsics.areEqual(this.title, earnerEnrollmentSuccessBlocker.title) && Intrinsics.areEqual(this.body, earnerEnrollmentSuccessBlocker.body) && Intrinsics.areEqual(this.actions, earnerEnrollmentSuccessBlocker.actions) && Intrinsics.areEqual(this.primary_button_title, earnerEnrollmentSuccessBlocker.primary_button_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.banner_image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.actions);
        String str3 = this.primary_button_title;
        int hashCode4 = m + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.banner_image = this.banner_image;
        builder.title = this.title;
        builder.body = this.body;
        builder.actions = this.actions;
        builder.primary_button_title = this.primary_button_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.banner_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("banner_image=", image, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.body;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
        }
        if (!this.actions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, this.actions);
        }
        String str3 = this.primary_button_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_button_title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerEnrollmentSuccessBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action$Builder;", "text", "", "route_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String route_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action;", "<init>", "()V", "text", "", "route_url", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String route_url;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public Action build() {
                return new Action(this.text, this.route_url, buildUnknownFields());
            }

            public final Builder route_url(String route_url) {
                this.route_url = route_url;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Action.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker$Action$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public EarnerEnrollmentSuccessBlocker.Action decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new EarnerEnrollmentSuccessBlocker.Action((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, EarnerEnrollmentSuccessBlocker.Action value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.text);
                    protoAdapter2.encodeWithTag(writer, 2, value.route_url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(EarnerEnrollmentSuccessBlocker.Action value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.route_url) + protoAdapter2.encodedSizeWithTag(1, value.text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public EarnerEnrollmentSuccessBlocker.Action redact(EarnerEnrollmentSuccessBlocker.Action value) {
                    value.getClass();
                    return EarnerEnrollmentSuccessBlocker.Action.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, EarnerEnrollmentSuccessBlocker.Action value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.route_url);
                    protoAdapter2.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Action(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Action copy$default(Action action, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = action.text;
            }
            if ((i & 2) != 0) {
                str2 = action.route_url;
            }
            if ((i & 4) != 0) {
                byteString = action.unknownFields();
            }
            return action.copy(str, str2, byteString);
        }

        public final Action copy(String text, String route_url, ByteString unknownFields) {
            unknownFields.getClass();
            return new Action(text, route_url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.text, action.text) && Intrinsics.areEqual(this.route_url, action.route_url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.route_url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.route_url = this.route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            String str2 = this.route_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Action;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Action build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Action() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.route_url = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/EarnerEnrollmentSuccessBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ EarnerEnrollmentSuccessBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
