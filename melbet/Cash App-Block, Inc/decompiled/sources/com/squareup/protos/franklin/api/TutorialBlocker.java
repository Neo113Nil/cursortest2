package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.TutorialBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Builder;", "", "next_page_button_text", "Ljava/lang/String;", "submit_button_text", "client_route_url", "", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page;", "pages", "Ljava/util/List;", "Companion", "Builder", "Page", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TutorialBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TutorialBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String client_route_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String next_page_button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.TutorialBlocker$Page#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Page> pages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String submit_button_text;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TutorialBlocker;", "<init>", "()V", "pages", "", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page;", "next_page_button_text", "", "submit_button_text", "client_route_url", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String client_route_url;
        public String next_page_button_text;
        public List<Page> pages = EmptyList.INSTANCE;
        public String submit_button_text;

        @Override // com.squareup.wire.Message.Builder
        public TutorialBlocker build() {
            return new TutorialBlocker(this.next_page_button_text, this.submit_button_text, this.client_route_url, this.pages, buildUnknownFields());
        }

        public final Builder client_route_url(String client_route_url) {
            this.client_route_url = client_route_url;
            return this;
        }

        public final Builder next_page_button_text(String next_page_button_text) {
            this.next_page_button_text = next_page_button_text;
            return this;
        }

        public final Builder pages(List<Page> pages) {
            pages.getClass();
            TransactorKt.checkElementsNotNull(pages);
            this.pages = pages;
            return this;
        }

        public final Builder submit_button_text(String submit_button_text) {
            this.submit_button_text = submit_button_text;
            return this;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Builder;", "image", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image;", "title", "", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Image", "Companion", "Illustration", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Page extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Page> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String description;

        @WireSealedOneof(schemaIndex = 0)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page;", "<init>", "()V", "image", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image;", "title", "", "description", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String description;
            public Image image;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public Page build() {
                return new Page(this.image, this.title, this.description, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Page.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TutorialBlocker$Page$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TutorialBlocker.Page decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    TutorialBlocker.Page.Image image = null;
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TutorialBlocker.Page(image, (String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                image = new TutorialBlocker.Page.Image.Illustration((TutorialBlocker.Page.Illustration) TutorialBlocker.Page.Illustration.ADAPTER.decode(reader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            image = new TutorialBlocker.Page.Image.RemoteImage((Image) Image.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TutorialBlocker.Page value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    TutorialBlocker.Page.Image image = value.image;
                    if (image instanceof TutorialBlocker.Page.Image.Illustration) {
                        TutorialBlocker.Page.Illustration.ADAPTER.encodeWithTag(writer, 1, ((TutorialBlocker.Page.Image.Illustration) image).getValue());
                    } else if (image instanceof TutorialBlocker.Page.Image.RemoteImage) {
                        Image.ADAPTER.encodeWithTag(writer, 4, ((TutorialBlocker.Page.Image.RemoteImage) image).getValue());
                    } else if (image != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TutorialBlocker.Page value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    TutorialBlocker.Page.Image image = value.image;
                    if (image instanceof TutorialBlocker.Page.Image.Illustration) {
                        encodedSizeWithTag = TutorialBlocker.Page.Illustration.ADAPTER.encodedSizeWithTag(1, ((TutorialBlocker.Page.Image.Illustration) image).getValue());
                    } else {
                        if (!(image instanceof TutorialBlocker.Page.Image.RemoteImage)) {
                            if (image != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(2, value.title) + size$okio;
                        }
                        encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(4, ((TutorialBlocker.Page.Image.RemoteImage) image).getValue());
                    }
                    size$okio += encodedSizeWithTag;
                    ProtoAdapter protoAdapter22 = ProtoAdapter.STRING;
                    return protoAdapter22.encodedSizeWithTag(3, value.description) + protoAdapter22.encodedSizeWithTag(2, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TutorialBlocker.Page redact(TutorialBlocker.Page value) {
                    value.getClass();
                    return TutorialBlocker.Page.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TutorialBlocker.Page value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    TutorialBlocker.Page.Image image = value.image;
                    if (image instanceof TutorialBlocker.Page.Image.Illustration) {
                        TutorialBlocker.Page.Illustration.ADAPTER.encodeWithTag(writer, 1, ((TutorialBlocker.Page.Image.Illustration) image).getValue());
                    } else if (image instanceof TutorialBlocker.Page.Image.RemoteImage) {
                        Image.ADAPTER.encodeWithTag(writer, 4, ((TutorialBlocker.Page.Image.RemoteImage) image).getValue());
                    } else if (image != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Page(Image image, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Page copy$default(Page page, Image image, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = page.image;
            }
            if ((i & 2) != 0) {
                str = page.title;
            }
            if ((i & 4) != 0) {
                str2 = page.description;
            }
            if ((i & 8) != 0) {
                byteString = page.unknownFields();
            }
            return page.copy(image, str, str2, byteString);
        }

        public final Page copy(Image image, String title, String description, ByteString unknownFields) {
            unknownFields.getClass();
            return new Page(image, title, description, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Page)) {
                return false;
            }
            Page page = (Page) other;
            return Intrinsics.areEqual(unknownFields(), page.unknownFields()) && Intrinsics.areEqual(this.image, page.image) && Intrinsics.areEqual(this.title, page.title) && Intrinsics.areEqual(this.description, page.description);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.title = this.title;
            builder.description = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                arrayList.add("image=" + image);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Page{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Illustration;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSTANT_PAY_GET_PART_OF_YOUR_PAY_NOW", "INSTANT_PAY_GET_THE_REST_ON_PAYDAY", "INSTANT_PAY_AND_ITS_FREE", "INSTANT_PAY_YOURE_APPROVED", "BORROW_UP_TO_AMOUNT", "BORROW_PAY_BACK_OVER_TIME", "BORROW_TRY_IT_OUT_FOR_FREE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Illustration implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Illustration[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Illustration INSTANT_PAY_GET_PART_OF_YOUR_PAY_NOW = new Illustration("INSTANT_PAY_GET_PART_OF_YOUR_PAY_NOW", 0, 1);
            public static final Illustration INSTANT_PAY_GET_THE_REST_ON_PAYDAY = new Illustration("INSTANT_PAY_GET_THE_REST_ON_PAYDAY", 1, 2);
            public static final Illustration INSTANT_PAY_AND_ITS_FREE = new Illustration("INSTANT_PAY_AND_ITS_FREE", 2, 3);
            public static final Illustration INSTANT_PAY_YOURE_APPROVED = new Illustration("INSTANT_PAY_YOURE_APPROVED", 3, 4);
            public static final Illustration BORROW_UP_TO_AMOUNT = new Illustration("BORROW_UP_TO_AMOUNT", 4, 5);
            public static final Illustration BORROW_PAY_BACK_OVER_TIME = new Illustration("BORROW_PAY_BACK_OVER_TIME", 5, 6);
            public static final Illustration BORROW_TRY_IT_OUT_FOR_FREE = new Illustration("BORROW_TRY_IT_OUT_FOR_FREE", 6, 7);

            private static final /* synthetic */ Illustration[] $values() {
                return new Illustration[]{INSTANT_PAY_GET_PART_OF_YOUR_PAY_NOW, INSTANT_PAY_GET_THE_REST_ON_PAYDAY, INSTANT_PAY_AND_ITS_FREE, INSTANT_PAY_YOURE_APPROVED, BORROW_UP_TO_AMOUNT, BORROW_PAY_BACK_OVER_TIME, BORROW_TRY_IT_OUT_FOR_FREE};
            }

            static {
                Illustration[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Illustration.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TutorialBlocker$Page$Illustration$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public TutorialBlocker.Page.Illustration fromValue(int value) {
                        return TutorialBlocker.Page.Illustration.INSTANCE.fromValue(value);
                    }
                };
            }

            private Illustration(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Illustration fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Illustration valueOf(String str) {
                return (Illustration) Enum.valueOf(Illustration.class, str);
            }

            public static Illustration[] values() {
                return (Illustration[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Illustration$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Illustration;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Illustration fromValue(int value) {
                    switch (value) {
                        case 1:
                            return Illustration.INSTANT_PAY_GET_PART_OF_YOUR_PAY_NOW;
                        case 2:
                            return Illustration.INSTANT_PAY_GET_THE_REST_ON_PAYDAY;
                        case 3:
                            return Illustration.INSTANT_PAY_AND_ITS_FREE;
                        case 4:
                            return Illustration.INSTANT_PAY_YOURE_APPROVED;
                        case 5:
                            return Illustration.BORROW_UP_TO_AMOUNT;
                        case 6:
                            return Illustration.BORROW_PAY_BACK_OVER_TIME;
                        case 7:
                            return Illustration.BORROW_TRY_IT_OUT_FOR_FREE;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TutorialBlocker$Page;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Page build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image;", "", "<init>", "()V", "Illustration", "RemoteImage", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image$Illustration;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image$RemoteImage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Image {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.TutorialBlocker$Page$Illustration#ADAPTER", declaredName = "illustration", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image$Illustration;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image;", "value", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Illustration;", "<init>", "(Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Illustration;)V", "getValue", "()Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Illustration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Illustration extends Image {
                private final Illustration value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Illustration(Illustration illustration) {
                    super(null);
                    illustration.getClass();
                    this.value = illustration;
                }

                public static /* synthetic */ Illustration copy$default(Illustration illustration, Illustration illustration2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        illustration2 = illustration.value;
                    }
                    return illustration.copy(illustration2);
                }

                /* renamed from: component1, reason: from getter */
                public final Illustration getValue() {
                    return this.value;
                }

                public final Illustration copy(Illustration value) {
                    value.getClass();
                    return new Illustration(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Illustration) && this.value == ((Illustration) other).value;
                }

                public final Illustration getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Illustration(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", declaredName = "remote_image", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image$RemoteImage;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Page$Image;", "value", "Lcom/squareup/protos/cash/ui/Image;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;)V", "getValue", "()Lcom/squareup/protos/cash/ui/Image;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class RemoteImage extends Image {
                private final com.squareup.protos.cash.ui.Image value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RemoteImage(com.squareup.protos.cash.ui.Image image) {
                    super(null);
                    image.getClass();
                    this.value = image;
                }

                public static /* synthetic */ RemoteImage copy$default(RemoteImage remoteImage, com.squareup.protos.cash.ui.Image image, int i, Object obj) {
                    if ((i & 1) != 0) {
                        image = remoteImage.value;
                    }
                    return remoteImage.copy(image);
                }

                /* renamed from: component1, reason: from getter */
                public final com.squareup.protos.cash.ui.Image getValue() {
                    return this.value;
                }

                public final RemoteImage copy(com.squareup.protos.cash.ui.Image value) {
                    value.getClass();
                    return new RemoteImage(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof RemoteImage) && Intrinsics.areEqual(this.value, ((RemoteImage) other).value);
                }

                public final com.squareup.protos.cash.ui.Image getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "RemoteImage(value=", ")");
                }
            }

            public /* synthetic */ Image(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Image() {
            }
        }

        public Page() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Page(Image image, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.title = str;
            this.description = str2;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TutorialBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TutorialBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TutorialBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TutorialBlocker((String) obj, (String) obj2, (String) obj3, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(TutorialBlocker.Page.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TutorialBlocker value) {
                writer.getClass();
                value.getClass();
                TutorialBlocker.Page.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.pages);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.next_page_button_text);
                protoAdapter2.encodeWithTag(writer, 3, value.submit_button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.client_route_url);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TutorialBlocker value) {
                value.getClass();
                int encodedSizeWithTag = TutorialBlocker.Page.ADAPTER.asRepeated().encodedSizeWithTag(1, value.pages) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, value.client_route_url) + protoAdapter2.encodedSizeWithTag(3, value.submit_button_text) + protoAdapter2.encodedSizeWithTag(2, value.next_page_button_text) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TutorialBlocker redact(TutorialBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.pages, TutorialBlocker.Page.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.next_page_button_text;
                String str2 = value.submit_button_text;
                String str3 = value.client_route_url;
                byteString.getClass();
                return new TutorialBlocker(str, str2, str3, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TutorialBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.client_route_url);
                protoAdapter2.encodeWithTag(writer, 3, value.submit_button_text);
                protoAdapter2.encodeWithTag(writer, 2, value.next_page_button_text);
                TutorialBlocker.Page.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.pages);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialBlocker(String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_page_button_text = str;
        this.submit_button_text = str2;
        this.client_route_url = str3;
        this.pages = TransactorKt.immutableCopyOf("pages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TutorialBlocker)) {
            return false;
        }
        TutorialBlocker tutorialBlocker = (TutorialBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), tutorialBlocker.unknownFields()) && Intrinsics.areEqual(this.pages, tutorialBlocker.pages) && Intrinsics.areEqual(this.next_page_button_text, tutorialBlocker.next_page_button_text) && Intrinsics.areEqual(this.submit_button_text, tutorialBlocker.submit_button_text) && Intrinsics.areEqual(this.client_route_url, tutorialBlocker.client_route_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.pages);
        String str = this.next_page_button_text;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.submit_button_text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.client_route_url;
        int hashCode3 = hashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.pages = this.pages;
        builder.next_page_button_text = this.next_page_button_text;
        builder.submit_button_text = this.submit_button_text;
        builder.client_route_url = this.client_route_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.pages.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pages=", arrayList, this.pages);
        }
        String str = this.next_page_button_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_page_button_text=", arrayList);
        }
        String str2 = this.submit_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "submit_button_text=", arrayList);
        }
        String str3 = this.client_route_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_route_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TutorialBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TutorialBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TutorialBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TutorialBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TutorialBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TutorialBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
