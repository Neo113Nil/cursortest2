package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
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
import java.util.List;
import kotlin.Deprecated;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.ui.arcade.elements.ListUnordered;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0018\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "instructions", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "scanning", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", "success", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", "getSuccess$annotations", "()V", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", BreadcrumbHelper.Category.ERROR, "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "activate", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "pre_scan", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "Companion", "Builder", "InstructionsUiConfig", "ActivateUiConfig", "PreScanUiConfig", "ScanningUiConfig", "SuccessUiConfig", "ErrorUiConfig", "ErrorUiConfigs", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FidesmoProvisioningBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FidesmoProvisioningBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ActivateUiConfig#ADAPTER", schemaIndex = 4, tag = 5)
    public final ActivateUiConfig activate;

    @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 3, tag = 4)
    public final ErrorUiConfig error;

    @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$InstructionsUiConfig#ADAPTER", schemaIndex = 0, tag = 1)
    public final InstructionsUiConfig instructions;

    @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$PreScanUiConfig#ADAPTER", schemaIndex = 5, tag = 6)
    public final PreScanUiConfig pre_scan;

    @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ScanningUiConfig#ADAPTER", schemaIndex = 1, tag = 2)
    public final ScanningUiConfig scanning;

    @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$SuccessUiConfig#ADAPTER", schemaIndex = 2, tag = 3)
    public final SuccessUiConfig success;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Builder;", "elements", "", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Element", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ActivateUiConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivateUiConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ActivateUiConfig$Element#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Element> elements;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "<init>", "()V", "elements", "", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Element> elements = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public ActivateUiConfig build() {
                return new ActivateUiConfig(this.elements, buildUnknownFields());
            }

            public final Builder elements(List<Element> elements) {
                elements.getClass();
                TransactorKt.checkElementsNotNull(elements);
                this.elements = elements;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActivateUiConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ActivateUiConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ActivateUiConfig decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FidesmoProvisioningBlocker.ActivateUiConfig(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(FidesmoProvisioningBlocker.ActivateUiConfig.Element.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ActivateUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    FidesmoProvisioningBlocker.ActivateUiConfig.Element.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.elements);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.ActivateUiConfig value) {
                    value.getClass();
                    return FidesmoProvisioningBlocker.ActivateUiConfig.Element.ADAPTER.asRepeated().encodedSizeWithTag(1, value.elements) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ActivateUiConfig redact(FidesmoProvisioningBlocker.ActivateUiConfig value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.elements, FidesmoProvisioningBlocker.ActivateUiConfig.Element.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ActivateUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FidesmoProvisioningBlocker.ActivateUiConfig.Element.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.elements);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivateUiConfig(List<Element> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivateUiConfig copy$default(ActivateUiConfig activateUiConfig, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = activateUiConfig.elements;
            }
            if ((i & 2) != 0) {
                byteString = activateUiConfig.unknownFields();
            }
            return activateUiConfig.copy(list, byteString);
        }

        public final ActivateUiConfig copy(List<Element> elements, ByteString unknownFields) {
            elements.getClass();
            unknownFields.getClass();
            return new ActivateUiConfig(elements, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ActivateUiConfig)) {
                return false;
            }
            ActivateUiConfig activateUiConfig = (ActivateUiConfig) other;
            return Intrinsics.areEqual(unknownFields(), activateUiConfig.unknownFields()) && Intrinsics.areEqual(this.elements, activateUiConfig.elements);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.elements.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.elements = this.elements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.elements.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActivateUiConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Builder;", "hero_text", "", "media", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Media", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Element extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Element> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String hero_text;

            @WireSealedOneof(schemaIndex = 1)
            public final Media media;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element;", "<init>", "()V", "hero_text", "", "media", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String hero_text;
                public Media media;

                @Override // com.squareup.wire.Message.Builder
                public Element build() {
                    return new Element(this.hero_text, this.media, buildUnknownFields());
                }

                public final Builder hero_text(String hero_text) {
                    this.hero_text = hero_text;
                    return this;
                }

                public final Builder media(Media media) {
                    this.media = media;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Element.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ActivateUiConfig$Element$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.ActivateUiConfig.Element decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl videoUrl = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new FidesmoProvisioningBlocker.ActivateUiConfig.Element((String) obj, videoUrl, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                videoUrl = new FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl((String) ProtoAdapter.STRING.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ActivateUiConfig.Element value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media media = value.media;
                        if (media instanceof FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, ((FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl) media).getValue());
                        } else if (media != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.hero_text);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FidesmoProvisioningBlocker.ActivateUiConfig.Element value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.hero_text) + size$okio;
                        FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media media = value.media;
                        if (media instanceof FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl) {
                            return protoAdapter2.encodedSizeWithTag(2, ((FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl) media).getValue()) + encodedSizeWithTag;
                        }
                        if (media == null) {
                            return encodedSizeWithTag;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.ActivateUiConfig.Element redact(FidesmoProvisioningBlocker.ActivateUiConfig.Element value) {
                        value.getClass();
                        return FidesmoProvisioningBlocker.ActivateUiConfig.Element.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ActivateUiConfig.Element value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.hero_text);
                        FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media media = value.media;
                        if (media instanceof FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl) {
                            protoAdapter2.encodeWithTag(writer, 2, ((FidesmoProvisioningBlocker.ActivateUiConfig.Element.Media.VideoUrl) media).getValue());
                        } else if (media != null) {
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

            public /* synthetic */ Element(String str, Media media, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : media, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Element copy$default(Element element, String str, Media media, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = element.hero_text;
                }
                if ((i & 2) != 0) {
                    media = element.media;
                }
                if ((i & 4) != 0) {
                    byteString = element.unknownFields();
                }
                return element.copy(str, media, byteString);
            }

            public final Element copy(String hero_text, Media media, ByteString unknownFields) {
                unknownFields.getClass();
                return new Element(hero_text, media, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Element)) {
                    return false;
                }
                Element element = (Element) other;
                return Intrinsics.areEqual(unknownFields(), element.unknownFields()) && Intrinsics.areEqual(this.hero_text, element.hero_text) && Intrinsics.areEqual(this.media, element.media);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.hero_text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Media media = this.media;
                int hashCode3 = hashCode2 + (media != null ? media.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.hero_text = this.hero_text;
                builder.media = this.media;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.hero_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "hero_text=", arrayList);
                }
                Media media = this.media;
                if (media != null) {
                    arrayList.add("media=" + media);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Element{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Element build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media;", "", "<init>", "()V", "VideoUrl", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media$VideoUrl;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class Media {

                @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "video_url", tag = 2)
                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media$VideoUrl;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Element$Media;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class VideoUrl extends Media {
                    private final String value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public VideoUrl(String str) {
                        super(null);
                        str.getClass();
                        this.value = str;
                    }

                    public static /* synthetic */ VideoUrl copy$default(VideoUrl videoUrl, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = videoUrl.value;
                        }
                        return videoUrl.copy(str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getValue() {
                        return this.value;
                    }

                    public final VideoUrl copy(String value) {
                        value.getClass();
                        return new VideoUrl(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof VideoUrl) && Intrinsics.areEqual(this.value, ((VideoUrl) other).value);
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VideoUrl(value=", this.value, ")");
                    }
                }

                public /* synthetic */ Media(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Media() {
                }
            }

            public Element() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Element(String str, Media media, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.hero_text = str;
                this.media = media;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ActivateUiConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ActivateUiConfig(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public ActivateUiConfig() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker;", "<init>", "()V", "instructions", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "scanning", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "success", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", BreadcrumbHelper.Category.ERROR, "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "activate", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ActivateUiConfig;", "pre_scan", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public ActivateUiConfig activate;
        public ErrorUiConfig error;
        public InstructionsUiConfig instructions;
        public PreScanUiConfig pre_scan;
        public ScanningUiConfig scanning;
        public SuccessUiConfig success;

        public final Builder activate(ActivateUiConfig activate) {
            this.activate = activate;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public FidesmoProvisioningBlocker build() {
            return new FidesmoProvisioningBlocker(this.instructions, this.scanning, this.success, this.error, this.activate, this.pre_scan, buildUnknownFields());
        }

        public final Builder error(ErrorUiConfig error) {
            this.error = error;
            return this;
        }

        public final Builder instructions(InstructionsUiConfig instructions) {
            this.instructions = instructions;
            return this;
        }

        public final Builder pre_scan(PreScanUiConfig pre_scan) {
            this.pre_scan = pre_scan;
            return this;
        }

        public final Builder scanning(ScanningUiConfig scanning) {
            this.scanning = scanning;
            return this;
        }

        @Deprecated
        public final Builder success(SuccessUiConfig success) {
            this.success = success;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001e\u001f !Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0082\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u0096\u0080\u0004J\b\u0010\u001c\u001a\u00020\u0004H\u0016Jh\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Builder;", "title", "", "items", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "button_text", "button_pre_scroll_text", "media", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media;", "disclosure_text", "info_cards", "", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lsquareup/cash/ui/arcade/elements/ListUnordered;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getItems$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Media", "Companion", "InfoCard", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InstructionsUiConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstructionsUiConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String button_pre_scroll_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String disclosure_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
        public final List<InfoCard> info_cards;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.ListUnordered#ADAPTER", schemaIndex = 1, tag = 2)
        public final ListUnordered items;

        @WireSealedOneof(schemaIndex = 4)
        public final Media media;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "<init>", "()V", "title", "", "items", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "button_text", "button_pre_scroll_text", "media", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media;", "disclosure_text", "info_cards", "", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String button_pre_scroll_text;
            public String button_text;
            public String disclosure_text;
            public List<InfoCard> info_cards = EmptyList.INSTANCE;
            public ListUnordered items;
            public Media media;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public InstructionsUiConfig build() {
                return new InstructionsUiConfig(this.title, this.items, this.button_text, this.button_pre_scroll_text, this.media, this.disclosure_text, this.info_cards, buildUnknownFields());
            }

            public final Builder button_pre_scroll_text(String button_pre_scroll_text) {
                this.button_pre_scroll_text = button_pre_scroll_text;
                return this;
            }

            public final Builder button_text(String button_text) {
                this.button_text = button_text;
                return this;
            }

            public final Builder disclosure_text(String disclosure_text) {
                this.disclosure_text = disclosure_text;
                return this;
            }

            public final Builder info_cards(List<InfoCard> info_cards) {
                info_cards.getClass();
                TransactorKt.checkElementsNotNull(info_cards);
                this.info_cards = info_cards;
                return this;
            }

            @Deprecated
            public final Builder items(ListUnordered items) {
                this.items = items;
                return this;
            }

            public final Builder media(Media media) {
                this.media = media;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstructionsUiConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$InstructionsUiConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.InstructionsUiConfig decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    FidesmoProvisioningBlocker.InstructionsUiConfig.Media media = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FidesmoProvisioningBlocker.InstructionsUiConfig((String) obj, (ListUnordered) obj2, (String) obj3, (String) obj4, media, (String) obj5, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(ListUnordered.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                media = new FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl((String) ProtoAdapter.STRING.decode(reader));
                                break;
                            case 6:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                m.add(FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.ADAPTER.decode(reader));
                                break;
                            case 8:
                                media = new FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl((String) ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.InstructionsUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FidesmoProvisioningBlocker.InstructionsUiConfig.Media media = value.media;
                    if (media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, ((FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl) media).getValue());
                    } else if (media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, ((FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) media).getValue());
                    } else if (media != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.info_cards);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.disclosure_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.button_pre_scroll_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.button_text);
                    ListUnordered.ADAPTER.encodeWithTag(writer, 2, value.items);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.InstructionsUiConfig value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, value.button_pre_scroll_text) + protoAdapter2.encodedSizeWithTag(3, value.button_text) + ListUnordered.ADAPTER.encodedSizeWithTag(2, value.items) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    FidesmoProvisioningBlocker.InstructionsUiConfig.Media media = value.media;
                    if (media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl) {
                        encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, ((FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl) media).getValue());
                    } else {
                        if (!(media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl)) {
                            if (media != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            return FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.ADAPTER.asRepeated().encodedSizeWithTag(7, value.info_cards) + protoAdapter2.encodedSizeWithTag(6, value.disclosure_text) + encodedSizeWithTag2;
                        }
                        encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(8, ((FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) media).getValue());
                    }
                    encodedSizeWithTag2 += encodedSizeWithTag;
                    return FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.ADAPTER.asRepeated().encodedSizeWithTag(7, value.info_cards) + protoAdapter2.encodedSizeWithTag(6, value.disclosure_text) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.InstructionsUiConfig redact(FidesmoProvisioningBlocker.InstructionsUiConfig value) {
                    value.getClass();
                    ListUnordered listUnordered = value.items;
                    return FidesmoProvisioningBlocker.InstructionsUiConfig.copy$default(value, null, listUnordered != null ? (ListUnordered) ListUnordered.ADAPTER.redact(listUnordered) : null, null, null, null, null, TransactorKt.m1169redactElements(value.info_cards, FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.ADAPTER), ByteString.EMPTY, 61, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.InstructionsUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    ListUnordered.ADAPTER.encodeWithTag(writer, 2, value.items);
                    protoAdapter2.encodeWithTag(writer, 3, value.button_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.button_pre_scroll_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.disclosure_text);
                    FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.info_cards);
                    FidesmoProvisioningBlocker.InstructionsUiConfig.Media media = value.media;
                    if (media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl) {
                        protoAdapter2.encodeWithTag(writer, 5, ((FidesmoProvisioningBlocker.InstructionsUiConfig.Media.VideoUrl) media).getValue());
                    } else if (media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) {
                        protoAdapter2.encodeWithTag(writer, 8, ((FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) media).getValue());
                    } else if (media != null) {
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

        public InstructionsUiConfig(String str, ListUnordered listUnordered, String str2, String str3, Media media, String str4, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : listUnordered, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : media, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? EmptyList.INSTANCE : list, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InstructionsUiConfig copy$default(InstructionsUiConfig instructionsUiConfig, String str, ListUnordered listUnordered, String str2, String str3, Media media, String str4, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instructionsUiConfig.title;
            }
            if ((i & 2) != 0) {
                listUnordered = instructionsUiConfig.items;
            }
            if ((i & 4) != 0) {
                str2 = instructionsUiConfig.button_text;
            }
            if ((i & 8) != 0) {
                str3 = instructionsUiConfig.button_pre_scroll_text;
            }
            if ((i & 16) != 0) {
                media = instructionsUiConfig.media;
            }
            if ((i & 32) != 0) {
                str4 = instructionsUiConfig.disclosure_text;
            }
            if ((i & 64) != 0) {
                list = instructionsUiConfig.info_cards;
            }
            if ((i & 128) != 0) {
                byteString = instructionsUiConfig.unknownFields();
            }
            List list2 = list;
            ByteString byteString2 = byteString;
            Media media2 = media;
            String str5 = str4;
            return instructionsUiConfig.copy(str, listUnordered, str2, str3, media2, str5, list2, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getItems$annotations() {
        }

        public final InstructionsUiConfig copy(String title, ListUnordered items, String button_text, String button_pre_scroll_text, Media media, String disclosure_text, List<InfoCard> info_cards, ByteString unknownFields) {
            info_cards.getClass();
            unknownFields.getClass();
            return new InstructionsUiConfig(title, items, button_text, button_pre_scroll_text, media, disclosure_text, info_cards, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InstructionsUiConfig)) {
                return false;
            }
            InstructionsUiConfig instructionsUiConfig = (InstructionsUiConfig) other;
            return Intrinsics.areEqual(unknownFields(), instructionsUiConfig.unknownFields()) && Intrinsics.areEqual(this.title, instructionsUiConfig.title) && Intrinsics.areEqual(this.items, instructionsUiConfig.items) && Intrinsics.areEqual(this.button_text, instructionsUiConfig.button_text) && Intrinsics.areEqual(this.button_pre_scroll_text, instructionsUiConfig.button_pre_scroll_text) && Intrinsics.areEqual(this.media, instructionsUiConfig.media) && Intrinsics.areEqual(this.disclosure_text, instructionsUiConfig.disclosure_text) && Intrinsics.areEqual(this.info_cards, instructionsUiConfig.info_cards);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ListUnordered listUnordered = this.items;
            int hashCode3 = (hashCode2 + (listUnordered != null ? listUnordered.hashCode() : 0)) * 37;
            String str2 = this.button_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.button_pre_scroll_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Media media = this.media;
            int hashCode6 = (hashCode5 + (media != null ? media.hashCode() : 0)) * 37;
            String str4 = this.disclosure_text;
            int hashCode7 = this.info_cards.hashCode() + ((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.items = this.items;
            builder.button_text = this.button_text;
            builder.button_pre_scroll_text = this.button_pre_scroll_text;
            builder.media = this.media;
            builder.disclosure_text = this.disclosure_text;
            builder.info_cards = this.info_cards;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            ListUnordered listUnordered = this.items;
            if (listUnordered != null) {
                arrayList.add("items=" + listUnordered);
            }
            String str2 = this.button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "button_text=", arrayList);
            }
            String str3 = this.button_pre_scroll_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_pre_scroll_text=", arrayList);
            }
            Media media = this.media;
            if (media != null) {
                arrayList.add("media=" + media);
            }
            String str4 = this.disclosure_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "disclosure_text=", arrayList);
            }
            if (!this.info_cards.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("info_cards=", arrayList, this.info_cards);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstructionsUiConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard$Builder;", "image_url", "", "title", "body", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class InfoCard extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<InfoCard> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String body;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String image_url;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard;", "<init>", "()V", "image_url", "", "title", "body", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String body;
                public String image_url;
                public String title;

                public final Builder body(String body) {
                    this.body = body;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public InfoCard build() {
                    return new InfoCard(this.image_url, this.title, this.body, buildUnknownFields());
                }

                public final Builder image_url(String image_url) {
                    this.image_url = image_url;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InfoCard.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.image_url);
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        protoAdapter2.encodeWithTag(writer, 3, value.body);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(3, value.body) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.image_url) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard redact(FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard value) {
                        value.getClass();
                        return FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.body);
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        protoAdapter2.encodeWithTag(writer, 1, value.image_url);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ InfoCard(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ InfoCard copy$default(InfoCard infoCard, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = infoCard.image_url;
                }
                if ((i & 2) != 0) {
                    str2 = infoCard.title;
                }
                if ((i & 4) != 0) {
                    str3 = infoCard.body;
                }
                if ((i & 8) != 0) {
                    byteString = infoCard.unknownFields();
                }
                return infoCard.copy(str, str2, str3, byteString);
            }

            public final InfoCard copy(String image_url, String title, String body, ByteString unknownFields) {
                unknownFields.getClass();
                return new InfoCard(image_url, title, body, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof InfoCard)) {
                    return false;
                }
                InfoCard infoCard = (InfoCard) other;
                return Intrinsics.areEqual(unknownFields(), infoCard.unknownFields()) && Intrinsics.areEqual(this.image_url, infoCard.image_url) && Intrinsics.areEqual(this.title, infoCard.title) && Intrinsics.areEqual(this.body, infoCard.body);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.image_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.title;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.body;
                int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.image_url = this.image_url;
                builder.title = this.title;
                builder.body = this.body;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.image_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
                }
                String str2 = this.title;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
                }
                String str3 = this.body;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "InfoCard{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$InfoCard;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ InfoCard build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public InfoCard() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoCard(String str, String str2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.image_url = str;
                this.title = str2;
                this.body = str3;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InstructionsUiConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media;", "", "<init>", "()V", "VideoUrl", "ImageUrl", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media$ImageUrl;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media$VideoUrl;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Media {

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "image_url", tag = 8)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media$ImageUrl;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ImageUrl extends Media {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ImageUrl(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ ImageUrl copy$default(ImageUrl imageUrl, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = imageUrl.value;
                    }
                    return imageUrl.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final ImageUrl copy(String value) {
                    value.getClass();
                    return new ImageUrl(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ImageUrl) && Intrinsics.areEqual(this.value, ((ImageUrl) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ImageUrl(value=", this.value, ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "video_url", tag = 5)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media$VideoUrl;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$InstructionsUiConfig$Media;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class VideoUrl extends Media {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public VideoUrl(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ VideoUrl copy$default(VideoUrl videoUrl, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = videoUrl.value;
                    }
                    return videoUrl.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final VideoUrl copy(String value) {
                    value.getClass();
                    return new VideoUrl(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof VideoUrl) && Intrinsics.areEqual(this.value, ((VideoUrl) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VideoUrl(value=", this.value, ")");
                }
            }

            public /* synthetic */ Media(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Media() {
            }
        }

        public InstructionsUiConfig() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstructionsUiConfig(String str, ListUnordered listUnordered, String str2, String str3, Media media, String str4, List<InfoCard> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.items = listUnordered;
            this.button_text = str2;
            this.button_pre_scroll_text = str3;
            this.media = media;
            this.disclosure_text = str4;
            this.info_cards = TransactorKt.immutableCopyOf("info_cards", list);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\bH\u0016J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u001bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "physical_width_millimeters", "", "tag_theme_token", "", "ios_pre_scan_caption", "help_video", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;", "start_activation_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "Builder", "Companion", "HelpVideo", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PreScanUiConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PreScanUiConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo#ADAPTER", schemaIndex = 4, tag = 5)
        public final HelpVideo help_video;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String ios_pre_scan_caption;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float physical_width_millimeters;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String start_activation_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String tag_theme_token;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "physical_width_millimeters", "", "Ljava/lang/Float;", "tag_theme_token", "", "ios_pre_scan_caption", "help_video", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;", "start_activation_button_text", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public HelpVideo help_video;
            public Image image;
            public String ios_pre_scan_caption;
            public Float physical_width_millimeters;
            public String start_activation_button_text;
            public String tag_theme_token;

            @Override // com.squareup.wire.Message.Builder
            public PreScanUiConfig build() {
                return new PreScanUiConfig(this.image, this.physical_width_millimeters, this.tag_theme_token, this.ios_pre_scan_caption, this.help_video, this.start_activation_button_text, buildUnknownFields());
            }

            public final Builder help_video(HelpVideo help_video) {
                this.help_video = help_video;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder ios_pre_scan_caption(String ios_pre_scan_caption) {
                this.ios_pre_scan_caption = ios_pre_scan_caption;
                return this;
            }

            public final Builder physical_width_millimeters(Float physical_width_millimeters) {
                this.physical_width_millimeters = physical_width_millimeters;
                return this;
            }

            public final Builder start_activation_button_text(String start_activation_button_text) {
                this.start_activation_button_text = start_activation_button_text;
                return this;
            }

            public final Builder tag_theme_token(String tag_theme_token) {
                this.tag_theme_token = tag_theme_token;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PreScanUiConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$PreScanUiConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.PreScanUiConfig decode(ProtoReader reader) {
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
                            return new FidesmoProvisioningBlocker.PreScanUiConfig((Image) obj, (Float) obj2, (String) obj3, (String) obj4, (FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo.ADAPTER, reader, obj5);
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
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.PreScanUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.physical_width_millimeters);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.tag_theme_token);
                    protoAdapter2.encodeWithTag(writer, 4, value.ios_pre_scan_caption);
                    FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo.ADAPTER.encodeWithTag(writer, 5, value.help_video);
                    protoAdapter2.encodeWithTag(writer, 6, value.start_activation_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.PreScanUiConfig value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.physical_width_millimeters) + Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(6, value.start_activation_button_text) + FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo.ADAPTER.encodedSizeWithTag(5, value.help_video) + protoAdapter2.encodedSizeWithTag(4, value.ios_pre_scan_caption) + protoAdapter2.encodedSizeWithTag(3, value.tag_theme_token) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.PreScanUiConfig redact(FidesmoProvisioningBlocker.PreScanUiConfig value) {
                    value.getClass();
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo helpVideo = value.help_video;
                    return FidesmoProvisioningBlocker.PreScanUiConfig.copy$default(value, image2, null, null, null, helpVideo != null ? (FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo) FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo.ADAPTER.redact(helpVideo) : null, null, ByteString.EMPTY, 46, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.PreScanUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.start_activation_button_text);
                    FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo.ADAPTER.encodeWithTag(writer, 5, value.help_video);
                    protoAdapter2.encodeWithTag(writer, 4, value.ios_pre_scan_caption);
                    protoAdapter2.encodeWithTag(writer, 3, value.tag_theme_token);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.physical_width_millimeters);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PreScanUiConfig(Image image, Float f, String str, String str2, HelpVideo helpVideo, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : helpVideo, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PreScanUiConfig copy$default(PreScanUiConfig preScanUiConfig, Image image, Float f, String str, String str2, HelpVideo helpVideo, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = preScanUiConfig.image;
            }
            if ((i & 2) != 0) {
                f = preScanUiConfig.physical_width_millimeters;
            }
            if ((i & 4) != 0) {
                str = preScanUiConfig.tag_theme_token;
            }
            if ((i & 8) != 0) {
                str2 = preScanUiConfig.ios_pre_scan_caption;
            }
            if ((i & 16) != 0) {
                helpVideo = preScanUiConfig.help_video;
            }
            if ((i & 32) != 0) {
                str3 = preScanUiConfig.start_activation_button_text;
            }
            if ((i & 64) != 0) {
                byteString = preScanUiConfig.unknownFields();
            }
            String str4 = str3;
            ByteString byteString2 = byteString;
            HelpVideo helpVideo2 = helpVideo;
            String str5 = str;
            return preScanUiConfig.copy(image, f, str5, str2, helpVideo2, str4, byteString2);
        }

        public final PreScanUiConfig copy(Image image, Float physical_width_millimeters, String tag_theme_token, String ios_pre_scan_caption, HelpVideo help_video, String start_activation_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new PreScanUiConfig(image, physical_width_millimeters, tag_theme_token, ios_pre_scan_caption, help_video, start_activation_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PreScanUiConfig)) {
                return false;
            }
            PreScanUiConfig preScanUiConfig = (PreScanUiConfig) other;
            return Intrinsics.areEqual(unknownFields(), preScanUiConfig.unknownFields()) && Intrinsics.areEqual(this.image, preScanUiConfig.image) && Intrinsics.areEqual(this.physical_width_millimeters, preScanUiConfig.physical_width_millimeters) && Intrinsics.areEqual(this.tag_theme_token, preScanUiConfig.tag_theme_token) && Intrinsics.areEqual(this.ios_pre_scan_caption, preScanUiConfig.ios_pre_scan_caption) && Intrinsics.areEqual(this.help_video, preScanUiConfig.help_video) && Intrinsics.areEqual(this.start_activation_button_text, preScanUiConfig.start_activation_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Float f = this.physical_width_millimeters;
            int hashCode3 = (hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            String str = this.tag_theme_token;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.ios_pre_scan_caption;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            HelpVideo helpVideo = this.help_video;
            int hashCode6 = (hashCode5 + (helpVideo != null ? helpVideo.hashCode() : 0)) * 37;
            String str3 = this.start_activation_button_text;
            int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.physical_width_millimeters = this.physical_width_millimeters;
            builder.tag_theme_token = this.tag_theme_token;
            builder.ios_pre_scan_caption = this.ios_pre_scan_caption;
            builder.help_video = this.help_video;
            builder.start_activation_button_text = this.start_activation_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Float f = this.physical_width_millimeters;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("physical_width_millimeters=", f, arrayList);
            }
            String str = this.tag_theme_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tag_theme_token=", arrayList);
            }
            String str2 = this.ios_pre_scan_caption;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ios_pre_scan_caption=", arrayList);
            }
            HelpVideo helpVideo = this.help_video;
            if (helpVideo != null) {
                arrayList.add("help_video=" + helpVideo);
            }
            String str3 = this.start_activation_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "start_activation_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PreScanUiConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo$Builder;", "ios_url", "", "android_url", "button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HelpVideo extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<HelpVideo> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String android_url;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String button_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String ios_url;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;", "<init>", "()V", "ios_url", "", "android_url", "button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String android_url;
                public String button_text;
                public String ios_url;

                public final Builder android_url(String android_url) {
                    this.android_url = android_url;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public HelpVideo build() {
                    return new HelpVideo(this.ios_url, this.android_url, this.button_text, buildUnknownFields());
                }

                public final Builder button_text(String button_text) {
                    this.button_text = button_text;
                    return this;
                }

                public final Builder ios_url(String ios_url) {
                    this.ios_url = ios_url;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HelpVideo.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.ios_url);
                        protoAdapter2.encodeWithTag(writer, 2, value.android_url);
                        protoAdapter2.encodeWithTag(writer, 3, value.button_text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(3, value.button_text) + protoAdapter2.encodedSizeWithTag(2, value.android_url) + protoAdapter2.encodedSizeWithTag(1, value.ios_url) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo redact(FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo value) {
                        value.getClass();
                        return FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.button_text);
                        protoAdapter2.encodeWithTag(writer, 2, value.android_url);
                        protoAdapter2.encodeWithTag(writer, 1, value.ios_url);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ HelpVideo(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ HelpVideo copy$default(HelpVideo helpVideo, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = helpVideo.ios_url;
                }
                if ((i & 2) != 0) {
                    str2 = helpVideo.android_url;
                }
                if ((i & 4) != 0) {
                    str3 = helpVideo.button_text;
                }
                if ((i & 8) != 0) {
                    byteString = helpVideo.unknownFields();
                }
                return helpVideo.copy(str, str2, str3, byteString);
            }

            public final HelpVideo copy(String ios_url, String android_url, String button_text, ByteString unknownFields) {
                unknownFields.getClass();
                return new HelpVideo(ios_url, android_url, button_text, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof HelpVideo)) {
                    return false;
                }
                HelpVideo helpVideo = (HelpVideo) other;
                return Intrinsics.areEqual(unknownFields(), helpVideo.unknownFields()) && Intrinsics.areEqual(this.ios_url, helpVideo.ios_url) && Intrinsics.areEqual(this.android_url, helpVideo.android_url) && Intrinsics.areEqual(this.button_text, helpVideo.button_text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.ios_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.android_url;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.button_text;
                int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.ios_url = this.ios_url;
                builder.android_url = this.android_url;
                builder.button_text = this.button_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.ios_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "ios_url=", arrayList);
                }
                String str2 = this.android_url;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "android_url=", arrayList);
                }
                String str3 = this.button_text;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "HelpVideo{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$HelpVideo;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ HelpVideo build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public HelpVideo() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HelpVideo(String str, String str2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.ios_url = str;
                this.android_url = str2;
                this.button_text = str3;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$PreScanUiConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PreScanUiConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PreScanUiConfig() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreScanUiConfig(Image image, Float f, String str, String str2, HelpVideo helpVideo, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.physical_width_millimeters = f;
            this.tag_theme_token = str;
            this.ios_pre_scan_caption = str2;
            this.help_video = helpVideo;
            this.start_activation_button_text = str3;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FidesmoProvisioningBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FidesmoProvisioningBlocker decode(ProtoReader reader) {
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
                        return new FidesmoProvisioningBlocker((FidesmoProvisioningBlocker.InstructionsUiConfig) obj, (FidesmoProvisioningBlocker.ScanningUiConfig) obj2, (FidesmoProvisioningBlocker.SuccessUiConfig) obj3, (FidesmoProvisioningBlocker.ErrorUiConfig) obj4, (FidesmoProvisioningBlocker.ActivateUiConfig) obj5, (FidesmoProvisioningBlocker.PreScanUiConfig) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.InstructionsUiConfig.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ScanningUiConfig.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.SuccessUiConfig.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ActivateUiConfig.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER, reader, obj6);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FidesmoProvisioningBlocker value) {
                writer.getClass();
                value.getClass();
                FidesmoProvisioningBlocker.InstructionsUiConfig.ADAPTER.encodeWithTag(writer, 1, value.instructions);
                FidesmoProvisioningBlocker.ScanningUiConfig.ADAPTER.encodeWithTag(writer, 2, value.scanning);
                FidesmoProvisioningBlocker.SuccessUiConfig.ADAPTER.encodeWithTag(writer, 3, value.success);
                FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.encodeWithTag(writer, 4, value.error);
                FidesmoProvisioningBlocker.ActivateUiConfig.ADAPTER.encodeWithTag(writer, 5, value.activate);
                FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.encodeWithTag(writer, 6, value.pre_scan);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FidesmoProvisioningBlocker value) {
                value.getClass();
                return FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.encodedSizeWithTag(6, value.pre_scan) + FidesmoProvisioningBlocker.ActivateUiConfig.ADAPTER.encodedSizeWithTag(5, value.activate) + FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.encodedSizeWithTag(4, value.error) + FidesmoProvisioningBlocker.SuccessUiConfig.ADAPTER.encodedSizeWithTag(3, value.success) + FidesmoProvisioningBlocker.ScanningUiConfig.ADAPTER.encodedSizeWithTag(2, value.scanning) + FidesmoProvisioningBlocker.InstructionsUiConfig.ADAPTER.encodedSizeWithTag(1, value.instructions) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FidesmoProvisioningBlocker redact(FidesmoProvisioningBlocker value) {
                value.getClass();
                FidesmoProvisioningBlocker.InstructionsUiConfig instructionsUiConfig = value.instructions;
                FidesmoProvisioningBlocker.InstructionsUiConfig instructionsUiConfig2 = instructionsUiConfig != null ? (FidesmoProvisioningBlocker.InstructionsUiConfig) FidesmoProvisioningBlocker.InstructionsUiConfig.ADAPTER.redact(instructionsUiConfig) : null;
                FidesmoProvisioningBlocker.ScanningUiConfig scanningUiConfig = value.scanning;
                FidesmoProvisioningBlocker.ScanningUiConfig scanningUiConfig2 = scanningUiConfig != null ? (FidesmoProvisioningBlocker.ScanningUiConfig) FidesmoProvisioningBlocker.ScanningUiConfig.ADAPTER.redact(scanningUiConfig) : null;
                FidesmoProvisioningBlocker.SuccessUiConfig successUiConfig = value.success;
                FidesmoProvisioningBlocker.SuccessUiConfig successUiConfig2 = successUiConfig != null ? (FidesmoProvisioningBlocker.SuccessUiConfig) FidesmoProvisioningBlocker.SuccessUiConfig.ADAPTER.redact(successUiConfig) : null;
                FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = value.error;
                FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig2 = errorUiConfig != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig) : null;
                FidesmoProvisioningBlocker.ActivateUiConfig activateUiConfig = value.activate;
                FidesmoProvisioningBlocker.ActivateUiConfig activateUiConfig2 = activateUiConfig != null ? (FidesmoProvisioningBlocker.ActivateUiConfig) FidesmoProvisioningBlocker.ActivateUiConfig.ADAPTER.redact(activateUiConfig) : null;
                FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = value.pre_scan;
                FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig2 = preScanUiConfig != null ? (FidesmoProvisioningBlocker.PreScanUiConfig) FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.redact(preScanUiConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new FidesmoProvisioningBlocker(instructionsUiConfig2, scanningUiConfig2, successUiConfig2, errorUiConfig2, activateUiConfig2, preScanUiConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.encodeWithTag(writer, 6, value.pre_scan);
                FidesmoProvisioningBlocker.ActivateUiConfig.ADAPTER.encodeWithTag(writer, 5, value.activate);
                FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.encodeWithTag(writer, 4, value.error);
                FidesmoProvisioningBlocker.SuccessUiConfig.ADAPTER.encodeWithTag(writer, 3, value.success);
                FidesmoProvisioningBlocker.ScanningUiConfig.ADAPTER.encodeWithTag(writer, 2, value.scanning);
                FidesmoProvisioningBlocker.InstructionsUiConfig.ADAPTER.encodeWithTag(writer, 1, value.instructions);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningBlocker(InstructionsUiConfig instructionsUiConfig, ScanningUiConfig scanningUiConfig, SuccessUiConfig successUiConfig, ErrorUiConfig errorUiConfig, ActivateUiConfig activateUiConfig, PreScanUiConfig preScanUiConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instructions = instructionsUiConfig;
        this.scanning = scanningUiConfig;
        this.success = successUiConfig;
        this.error = errorUiConfig;
        this.activate = activateUiConfig;
        this.pre_scan = preScanUiConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FidesmoProvisioningBlocker)) {
            return false;
        }
        FidesmoProvisioningBlocker fidesmoProvisioningBlocker = (FidesmoProvisioningBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), fidesmoProvisioningBlocker.unknownFields()) && Intrinsics.areEqual(this.instructions, fidesmoProvisioningBlocker.instructions) && Intrinsics.areEqual(this.scanning, fidesmoProvisioningBlocker.scanning) && Intrinsics.areEqual(this.success, fidesmoProvisioningBlocker.success) && Intrinsics.areEqual(this.error, fidesmoProvisioningBlocker.error) && Intrinsics.areEqual(this.activate, fidesmoProvisioningBlocker.activate) && Intrinsics.areEqual(this.pre_scan, fidesmoProvisioningBlocker.pre_scan);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstructionsUiConfig instructionsUiConfig = this.instructions;
        int hashCode2 = (hashCode + (instructionsUiConfig != null ? instructionsUiConfig.hashCode() : 0)) * 37;
        ScanningUiConfig scanningUiConfig = this.scanning;
        int hashCode3 = (hashCode2 + (scanningUiConfig != null ? scanningUiConfig.hashCode() : 0)) * 37;
        SuccessUiConfig successUiConfig = this.success;
        int hashCode4 = (hashCode3 + (successUiConfig != null ? successUiConfig.hashCode() : 0)) * 37;
        ErrorUiConfig errorUiConfig = this.error;
        int hashCode5 = (hashCode4 + (errorUiConfig != null ? errorUiConfig.hashCode() : 0)) * 37;
        ActivateUiConfig activateUiConfig = this.activate;
        int hashCode6 = (hashCode5 + (activateUiConfig != null ? activateUiConfig.hashCode() : 0)) * 37;
        PreScanUiConfig preScanUiConfig = this.pre_scan;
        int hashCode7 = hashCode6 + (preScanUiConfig != null ? preScanUiConfig.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.instructions = this.instructions;
        builder.scanning = this.scanning;
        builder.success = this.success;
        builder.error = this.error;
        builder.activate = this.activate;
        builder.pre_scan = this.pre_scan;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstructionsUiConfig instructionsUiConfig = this.instructions;
        if (instructionsUiConfig != null) {
            arrayList.add("instructions=" + instructionsUiConfig);
        }
        ScanningUiConfig scanningUiConfig = this.scanning;
        if (scanningUiConfig != null) {
            arrayList.add("scanning=" + scanningUiConfig);
        }
        SuccessUiConfig successUiConfig = this.success;
        if (successUiConfig != null) {
            arrayList.add("success=" + successUiConfig);
        }
        ErrorUiConfig errorUiConfig = this.error;
        if (errorUiConfig != null) {
            arrayList.add("error=" + errorUiConfig);
        }
        ActivateUiConfig activateUiConfig = this.activate;
        if (activateUiConfig != null) {
            arrayList.add("activate=" + activateUiConfig);
        }
        PreScanUiConfig preScanUiConfig = this.pre_scan;
        if (preScanUiConfig != null) {
            arrayList.add("pre_scan=" + preScanUiConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FidesmoProvisioningBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0014\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0082\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u0096\u0080\u0004J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0081\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010!R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0016R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Builder;", "title", "", "body_text", "items", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "dismiss_button_text", "retry_button_text", "error_icon", "Lcom/squareup/protos/cash/ui/Icon;", "show_close_button", "", "primary_button", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;", "secondary_button", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lsquareup/cash/ui/arcade/elements/ListUnordered;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;Lokio/ByteString;)V", "getDismiss_button_text$annotations", "()V", "getRetry_button_text$annotations", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lsquareup/cash/ui/arcade/elements/ListUnordered;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "Builder", "Companion", "Button", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ErrorUiConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ErrorUiConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String body_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String dismiss_button_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 5, tag = 6)
        public final Icon error_icon;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.ListUnordered#ADAPTER", schemaIndex = 2, tag = 3)
        public final ListUnordered items;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button#ADAPTER", schemaIndex = 7, tag = 8)
        public final Button primary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String retry_button_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button#ADAPTER", schemaIndex = 8, tag = 9)
        public final Button secondary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
        public final Boolean show_close_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "<init>", "()V", "title", "", "body_text", "items", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "dismiss_button_text", "retry_button_text", "error_icon", "Lcom/squareup/protos/cash/ui/Icon;", "show_close_button", "", "Ljava/lang/Boolean;", "primary_button", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;", "secondary_button", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String body_text;
            public String dismiss_button_text;
            public Icon error_icon;
            public ListUnordered items;
            public Button primary_button;
            public String retry_button_text;
            public Button secondary_button;
            public Boolean show_close_button;
            public String title;

            public final Builder body_text(String body_text) {
                this.body_text = body_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ErrorUiConfig build() {
                return new ErrorUiConfig(this.title, this.body_text, this.items, this.dismiss_button_text, this.retry_button_text, this.error_icon, this.show_close_button, this.primary_button, this.secondary_button, buildUnknownFields());
            }

            @Deprecated
            public final Builder dismiss_button_text(String dismiss_button_text) {
                this.dismiss_button_text = dismiss_button_text;
                return this;
            }

            public final Builder error_icon(Icon error_icon) {
                this.error_icon = error_icon;
                return this;
            }

            public final Builder items(ListUnordered items) {
                this.items = items;
                return this;
            }

            public final Builder primary_button(Button primary_button) {
                this.primary_button = primary_button;
                return this;
            }

            @Deprecated
            public final Builder retry_button_text(String retry_button_text) {
                this.retry_button_text = retry_button_text;
                return this;
            }

            public final Builder secondary_button(Button secondary_button) {
                this.secondary_button = secondary_button;
                return this;
            }

            public final Builder show_close_button(Boolean show_close_button) {
                this.show_close_button = show_close_button;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Builder;", "text", "", "action", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Action", "Companion", "Dismiss", "Retry", "OpenUrl", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireSealedOneof(schemaIndex = 1)
            public final Action action;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String text;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;", "<init>", "()V", "text", "", "action", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Action action;
                public String text;

                public final Builder action(Action action) {
                    this.action = action;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public Button build() {
                    return new Button(this.text, this.action, buildUnknownFields());
                }

                public final Builder text(String text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.ErrorUiConfig.Button decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action action = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new FidesmoProvisioningBlocker.ErrorUiConfig.Button((String) obj, action, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                action = new FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss) FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss.ADAPTER.decode(reader));
                            } else if (nextTag == 3) {
                                action = new FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry) FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry.ADAPTER.decode(reader));
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                action = new FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl((FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl) FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                        FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action action = value.action;
                        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) {
                            FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss.ADAPTER.encodeWithTag(writer, 2, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) action).getValue());
                        } else if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) {
                            FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry.ADAPTER.encodeWithTag(writer, 3, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) action).getValue());
                        } else if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) {
                            FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl.ADAPTER.encodeWithTag(writer, 4, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) action).getValue());
                        } else if (action != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FidesmoProvisioningBlocker.ErrorUiConfig.Button value) {
                        value.getClass();
                        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                        FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action action = value.action;
                        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) {
                            return FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss.ADAPTER.encodedSizeWithTag(2, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) action).getValue()) + encodedSizeWithTag;
                        }
                        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) {
                            return FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry.ADAPTER.encodedSizeWithTag(3, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) action).getValue()) + encodedSizeWithTag;
                        }
                        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) {
                            return FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl.ADAPTER.encodedSizeWithTag(4, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) action).getValue()) + encodedSizeWithTag;
                        }
                        if (action == null) {
                            return encodedSizeWithTag;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FidesmoProvisioningBlocker.ErrorUiConfig.Button redact(FidesmoProvisioningBlocker.ErrorUiConfig.Button value) {
                        value.getClass();
                        return FidesmoProvisioningBlocker.ErrorUiConfig.Button.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action action = value.action;
                        if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) {
                            FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss.ADAPTER.encodeWithTag(writer, 2, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Dismiss) action).getValue());
                        } else if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) {
                            FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry.ADAPTER.encodeWithTag(writer, 3, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.Retry) action).getValue());
                        } else if (action instanceof FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) {
                            FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl.ADAPTER.encodeWithTag(writer, 4, ((FidesmoProvisioningBlocker.ErrorUiConfig.Button.Action.OpenUrl) action).getValue());
                        } else if (action != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Button(String str, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : action, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Button copy$default(Button button, String str, Action action, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.text;
                }
                if ((i & 2) != 0) {
                    action = button.action;
                }
                if ((i & 4) != 0) {
                    byteString = button.unknownFields();
                }
                return button.copy(str, action, byteString);
            }

            public final Button copy(String text, Action action, ByteString unknownFields) {
                unknownFields.getClass();
                return new Button(text, action, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.action, button.action);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Action action = this.action;
                int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.action = this.action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                Action action = this.action;
                if (action != null) {
                    arrayList.add("action=" + action);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Dismiss extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Dismiss> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    @Override // com.squareup.wire.Message.Builder
                    public Dismiss build() {
                        return new Dismiss(buildUnknownFields());
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Dismiss.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss(reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                reader.readUnknownField(nextTag);
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss value) {
                            value.getClass();
                            return value.unknownFields().getSize$okio();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss redact(FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss value) {
                            value.getClass();
                            return value.copy(ByteString.EMPTY);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button.Dismiss value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ Dismiss(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        byteString = dismiss.unknownFields();
                    }
                    return dismiss.copy(byteString);
                }

                public final Dismiss copy(ByteString unknownFields) {
                    unknownFields.getClass();
                    return new Dismiss(unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof Dismiss) && Intrinsics.areEqual(unknownFields(), ((Dismiss) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    return "Dismiss{}";
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ Dismiss build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Dismiss() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Dismiss(ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl$Builder;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class OpenUrl extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<OpenUrl> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String url;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;", "<init>", "()V", "url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String url;

                    @Override // com.squareup.wire.Message.Builder
                    public OpenUrl build() {
                        return new OpenUrl(this.url, buildUnknownFields());
                    }

                    public final Builder url(String url) {
                        this.url = url;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenUrl.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                if (nextTag == 1) {
                                    obj = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(nextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl value) {
                            value.getClass();
                            return ProtoAdapter.STRING.encodedSizeWithTag(1, value.url) + value.unknownFields().getSize$okio();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl redact(FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl value) {
                            value.getClass();
                            return FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl.copy$default(value, null, ByteString.EMPTY, 1, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button.OpenUrl value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ OpenUrl(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = openUrl.url;
                    }
                    if ((i & 2) != 0) {
                        byteString = openUrl.unknownFields();
                    }
                    return openUrl.copy(str, byteString);
                }

                public final OpenUrl copy(String url, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new OpenUrl(url, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof OpenUrl)) {
                        return false;
                    }
                    OpenUrl openUrl = (OpenUrl) other;
                    return Intrinsics.areEqual(unknownFields(), openUrl.unknownFields()) && Intrinsics.areEqual(this.url, openUrl.url);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.url;
                    int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.url = this.url;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.url;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "OpenUrl{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ OpenUrl build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public OpenUrl() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OpenUrl(String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.url = str;
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Retry extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Retry> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    @Override // com.squareup.wire.Message.Builder
                    public Retry build() {
                        return new Retry(buildUnknownFields());
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Retry.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry(reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                reader.readUnknownField(nextTag);
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry value) {
                            value.getClass();
                            return value.unknownFields().getSize$okio();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry redact(FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry value) {
                            value.getClass();
                            return value.copy(ByteString.EMPTY);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig.Button.Retry value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ Retry(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ Retry copy$default(Retry retry, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        byteString = retry.unknownFields();
                    }
                    return retry.copy(byteString);
                }

                public final Retry copy(ByteString unknownFields) {
                    unknownFields.getClass();
                    return new Retry(unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof Retry) && Intrinsics.areEqual(unknownFields(), ((Retry) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    return "Retry{}";
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ Retry build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Retry() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Retry(ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;", "", "<init>", "()V", "Dismiss", "Retry", "OpenUrl", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action$Dismiss;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action$OpenUrl;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action$Retry;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class Action {

                @WireOneofField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss#ADAPTER", declaredName = "dismiss", tag = 2)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action$Dismiss;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;", "value", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;", "<init>", "(Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;)V", "getValue", "()Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Dismiss;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class Dismiss extends Action {
                    private final Dismiss value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Dismiss(Dismiss dismiss) {
                        super(null);
                        dismiss.getClass();
                        this.value = dismiss;
                    }

                    public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, Dismiss dismiss2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            dismiss2 = dismiss.value;
                        }
                        return dismiss.copy(dismiss2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final Dismiss getValue() {
                        return this.value;
                    }

                    public final Dismiss copy(Dismiss value) {
                        value.getClass();
                        return new Dismiss(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Dismiss) && Intrinsics.areEqual(this.value, ((Dismiss) other).value);
                    }

                    public final Dismiss getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Dismiss(value=" + this.value + ")";
                    }
                }

                @WireOneofField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl#ADAPTER", declaredName = "open_url", tag = 4)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action$OpenUrl;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;", "value", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;", "<init>", "(Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;)V", "getValue", "()Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$OpenUrl;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class OpenUrl extends Action {
                    private final OpenUrl value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public OpenUrl(OpenUrl openUrl) {
                        super(null);
                        openUrl.getClass();
                        this.value = openUrl;
                    }

                    public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, OpenUrl openUrl2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            openUrl2 = openUrl.value;
                        }
                        return openUrl.copy(openUrl2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final OpenUrl getValue() {
                        return this.value;
                    }

                    public final OpenUrl copy(OpenUrl value) {
                        value.getClass();
                        return new OpenUrl(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof OpenUrl) && Intrinsics.areEqual(this.value, ((OpenUrl) other).value);
                    }

                    public final OpenUrl getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "OpenUrl(value=" + this.value + ")";
                    }
                }

                @WireOneofField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry#ADAPTER", declaredName = "retry", tag = 3)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action$Retry;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Action;", "value", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;", "<init>", "(Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;)V", "getValue", "()Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Retry;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class Retry extends Action {
                    private final Retry value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Retry(Retry retry) {
                        super(null);
                        retry.getClass();
                        this.value = retry;
                    }

                    public static /* synthetic */ Retry copy$default(Retry retry, Retry retry2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            retry2 = retry.value;
                        }
                        return retry.copy(retry2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final Retry getValue() {
                        return this.value;
                    }

                    public final Retry copy(Retry value) {
                        value.getClass();
                        return new Retry(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Retry) && Intrinsics.areEqual(this.value, ((Retry) other).value);
                    }

                    public final Retry getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Retry(value=" + this.value + ")";
                    }
                }

                public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Action() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Button build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Button() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, Action action, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.action = action;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ErrorUiConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ErrorUiConfig decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FidesmoProvisioningBlocker.ErrorUiConfig((String) obj, (String) obj2, (ListUnordered) obj3, (String) obj4, (String) obj5, (Icon) obj6, (Boolean) obj7, (FidesmoProvisioningBlocker.ErrorUiConfig.Button) obj8, (FidesmoProvisioningBlocker.ErrorUiConfig.Button) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(ListUnordered.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj6);
                                break;
                            case 7:
                                obj7 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 8:
                                obj8 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER, reader, obj8);
                                break;
                            case 9:
                                obj9 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER, reader, obj9);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body_text);
                    ListUnordered.ADAPTER.encodeWithTag(writer, 3, value.items);
                    protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.retry_button_text);
                    Icon.ADAPTER.encodeWithTag(writer, 6, value.error_icon);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.show_close_button);
                    ProtoAdapter protoAdapter3 = FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 8, value.primary_button);
                    protoAdapter3.encodeWithTag(writer, 9, value.secondary_button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.ErrorUiConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(7, value.show_close_button) + Icon.ADAPTER.encodedSizeWithTag(6, value.error_icon) + protoAdapter2.encodedSizeWithTag(5, value.retry_button_text) + protoAdapter2.encodedSizeWithTag(4, value.dismiss_button_text) + ListUnordered.ADAPTER.encodedSizeWithTag(3, value.items) + protoAdapter2.encodedSizeWithTag(2, value.body_text) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER;
                    return protoAdapter3.encodedSizeWithTag(9, value.secondary_button) + protoAdapter3.encodedSizeWithTag(8, value.primary_button) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ErrorUiConfig redact(FidesmoProvisioningBlocker.ErrorUiConfig value) {
                    value.getClass();
                    ListUnordered listUnordered = value.items;
                    ListUnordered listUnordered2 = listUnordered != null ? (ListUnordered) ListUnordered.ADAPTER.redact(listUnordered) : null;
                    Icon icon = value.error_icon;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig.Button button = value.primary_button;
                    FidesmoProvisioningBlocker.ErrorUiConfig.Button button2 = button != null ? (FidesmoProvisioningBlocker.ErrorUiConfig.Button) FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER.redact(button) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig.Button button3 = value.secondary_button;
                    return FidesmoProvisioningBlocker.ErrorUiConfig.copy$default(value, null, null, listUnordered2, null, null, icon2, null, button2, button3 != null ? (FidesmoProvisioningBlocker.ErrorUiConfig.Button) FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER.redact(button3) : null, ByteString.EMPTY, 91, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = FidesmoProvisioningBlocker.ErrorUiConfig.Button.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 9, value.secondary_button);
                    protoAdapter2.encodeWithTag(writer, 8, value.primary_button);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.show_close_button);
                    Icon.ADAPTER.encodeWithTag(writer, 6, value.error_icon);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 5, value.retry_button_text);
                    protoAdapter3.encodeWithTag(writer, 4, value.dismiss_button_text);
                    ListUnordered.ADAPTER.encodeWithTag(writer, 3, value.items);
                    protoAdapter3.encodeWithTag(writer, 2, value.body_text);
                    protoAdapter3.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ErrorUiConfig(String str, String str2, ListUnordered listUnordered, String str3, String str4, Icon icon, Boolean bool, Button button, Button button2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : listUnordered, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : icon, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : button, (i & 256) != 0 ? null : button2, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ErrorUiConfig copy$default(ErrorUiConfig errorUiConfig, String str, String str2, ListUnordered listUnordered, String str3, String str4, Icon icon, Boolean bool, Button button, Button button2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorUiConfig.title;
            }
            if ((i & 2) != 0) {
                str2 = errorUiConfig.body_text;
            }
            if ((i & 4) != 0) {
                listUnordered = errorUiConfig.items;
            }
            if ((i & 8) != 0) {
                str3 = errorUiConfig.dismiss_button_text;
            }
            if ((i & 16) != 0) {
                str4 = errorUiConfig.retry_button_text;
            }
            if ((i & 32) != 0) {
                icon = errorUiConfig.error_icon;
            }
            if ((i & 64) != 0) {
                bool = errorUiConfig.show_close_button;
            }
            if ((i & 128) != 0) {
                button = errorUiConfig.primary_button;
            }
            if ((i & 256) != 0) {
                button2 = errorUiConfig.secondary_button;
            }
            if ((i & 512) != 0) {
                byteString = errorUiConfig.unknownFields();
            }
            Button button3 = button2;
            ByteString byteString2 = byteString;
            Boolean bool2 = bool;
            Button button4 = button;
            String str5 = str4;
            Icon icon2 = icon;
            return errorUiConfig.copy(str, str2, listUnordered, str3, str5, icon2, bool2, button4, button3, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getDismiss_button_text$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getRetry_button_text$annotations() {
        }

        public final ErrorUiConfig copy(String title, String body_text, ListUnordered items, String dismiss_button_text, String retry_button_text, Icon error_icon, Boolean show_close_button, Button primary_button, Button secondary_button, ByteString unknownFields) {
            unknownFields.getClass();
            return new ErrorUiConfig(title, body_text, items, dismiss_button_text, retry_button_text, error_icon, show_close_button, primary_button, secondary_button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ErrorUiConfig)) {
                return false;
            }
            ErrorUiConfig errorUiConfig = (ErrorUiConfig) other;
            return Intrinsics.areEqual(unknownFields(), errorUiConfig.unknownFields()) && Intrinsics.areEqual(this.title, errorUiConfig.title) && Intrinsics.areEqual(this.body_text, errorUiConfig.body_text) && Intrinsics.areEqual(this.items, errorUiConfig.items) && Intrinsics.areEqual(this.dismiss_button_text, errorUiConfig.dismiss_button_text) && Intrinsics.areEqual(this.retry_button_text, errorUiConfig.retry_button_text) && Intrinsics.areEqual(this.error_icon, errorUiConfig.error_icon) && Intrinsics.areEqual(this.show_close_button, errorUiConfig.show_close_button) && Intrinsics.areEqual(this.primary_button, errorUiConfig.primary_button) && Intrinsics.areEqual(this.secondary_button, errorUiConfig.secondary_button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ListUnordered listUnordered = this.items;
            int hashCode4 = (hashCode3 + (listUnordered != null ? listUnordered.hashCode() : 0)) * 37;
            String str3 = this.dismiss_button_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.retry_button_text;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Icon icon = this.error_icon;
            int hashCode7 = (hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
            Boolean bool = this.show_close_button;
            int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Button button = this.primary_button;
            int hashCode9 = (hashCode8 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode10 = hashCode9 + (button2 != null ? button2.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body_text = this.body_text;
            builder.items = this.items;
            builder.dismiss_button_text = this.dismiss_button_text;
            builder.retry_button_text = this.retry_button_text;
            builder.error_icon = this.error_icon;
            builder.show_close_button = this.show_close_button;
            builder.primary_button = this.primary_button;
            builder.secondary_button = this.secondary_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body_text=", arrayList);
            }
            ListUnordered listUnordered = this.items;
            if (listUnordered != null) {
                arrayList.add("items=" + listUnordered);
            }
            String str3 = this.dismiss_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dismiss_button_text=", arrayList);
            }
            String str4 = this.retry_button_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "retry_button_text=", arrayList);
            }
            Icon icon = this.error_icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("error_icon=", icon, arrayList);
            }
            Boolean bool = this.show_close_button;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("show_close_button=", bool, arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorUiConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ErrorUiConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ErrorUiConfig() {
            this(null, null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorUiConfig(String str, String str2, ListUnordered listUnordered, String str3, String str4, Icon icon, Boolean bool, Button button, Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body_text = str2;
            this.items = listUnordered;
            this.dismiss_button_text = str3;
            this.retry_button_text = str4;
            this.error_icon = icon;
            this.show_close_button = bool;
            this.primary_button = button;
            this.secondary_button = button2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016JX\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs$Builder;", "account_mismatch", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "detection", "timeout", "connection", "canceled", "generic", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ErrorUiConfigs extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ErrorUiConfigs> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 0, tag = 1)
        public final ErrorUiConfig account_mismatch;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 4, tag = 5)
        public final ErrorUiConfig canceled;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 3, tag = 4)
        public final ErrorUiConfig connection;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 1, tag = 2)
        public final ErrorUiConfig detection;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 5, tag = 6)
        public final ErrorUiConfig generic;

        @WireField(adapter = "com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfig#ADAPTER", schemaIndex = 2, tag = 3)
        public final ErrorUiConfig timeout;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs;", "<init>", "()V", "account_mismatch", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfig;", "detection", "timeout", "connection", "canceled", "generic", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ErrorUiConfig account_mismatch;
            public ErrorUiConfig canceled;
            public ErrorUiConfig connection;
            public ErrorUiConfig detection;
            public ErrorUiConfig generic;
            public ErrorUiConfig timeout;

            public final Builder account_mismatch(ErrorUiConfig account_mismatch) {
                this.account_mismatch = account_mismatch;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ErrorUiConfigs build() {
                return new ErrorUiConfigs(this.account_mismatch, this.detection, this.timeout, this.connection, this.canceled, this.generic, buildUnknownFields());
            }

            public final Builder canceled(ErrorUiConfig canceled) {
                this.canceled = canceled;
                return this;
            }

            public final Builder connection(ErrorUiConfig connection) {
                this.connection = connection;
                return this;
            }

            public final Builder detection(ErrorUiConfig detection) {
                this.detection = detection;
                return this;
            }

            public final Builder generic(ErrorUiConfig generic) {
                this.generic = generic;
                return this;
            }

            public final Builder timeout(ErrorUiConfig timeout) {
                this.timeout = timeout;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ErrorUiConfigs.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ErrorUiConfigs$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ErrorUiConfigs decode(ProtoReader reader) {
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
                            return new FidesmoProvisioningBlocker.ErrorUiConfigs((FidesmoProvisioningBlocker.ErrorUiConfig) obj, (FidesmoProvisioningBlocker.ErrorUiConfig) obj2, (FidesmoProvisioningBlocker.ErrorUiConfig) obj3, (FidesmoProvisioningBlocker.ErrorUiConfig) obj4, (FidesmoProvisioningBlocker.ErrorUiConfig) obj5, (FidesmoProvisioningBlocker.ErrorUiConfig) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj4 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj4);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, reader, obj6);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfigs value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.account_mismatch);
                    protoAdapter2.encodeWithTag(writer, 2, value.detection);
                    protoAdapter2.encodeWithTag(writer, 3, value.timeout);
                    protoAdapter2.encodeWithTag(writer, 4, value.connection);
                    protoAdapter2.encodeWithTag(writer, 5, value.canceled);
                    protoAdapter2.encodeWithTag(writer, 6, value.generic);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.ErrorUiConfigs value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(6, value.generic) + protoAdapter2.encodedSizeWithTag(5, value.canceled) + protoAdapter2.encodedSizeWithTag(4, value.connection) + protoAdapter2.encodedSizeWithTag(3, value.timeout) + protoAdapter2.encodedSizeWithTag(2, value.detection) + protoAdapter2.encodedSizeWithTag(1, value.account_mismatch) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ErrorUiConfigs redact(FidesmoProvisioningBlocker.ErrorUiConfigs value) {
                    value.getClass();
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = value.account_mismatch;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig2 = errorUiConfig != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig3 = value.detection;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig4 = errorUiConfig3 != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig3) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig5 = value.timeout;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig6 = errorUiConfig5 != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig5) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig7 = value.connection;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig8 = errorUiConfig7 != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig7) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig9 = value.canceled;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig10 = errorUiConfig9 != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig9) : null;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig11 = value.generic;
                    return value.copy(errorUiConfig2, errorUiConfig4, errorUiConfig6, errorUiConfig8, errorUiConfig10, errorUiConfig11 != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig11) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ErrorUiConfigs value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 6, value.generic);
                    protoAdapter2.encodeWithTag(writer, 5, value.canceled);
                    protoAdapter2.encodeWithTag(writer, 4, value.connection);
                    protoAdapter2.encodeWithTag(writer, 3, value.timeout);
                    protoAdapter2.encodeWithTag(writer, 2, value.detection);
                    protoAdapter2.encodeWithTag(writer, 1, value.account_mismatch);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ErrorUiConfigs(ErrorUiConfig errorUiConfig, ErrorUiConfig errorUiConfig2, ErrorUiConfig errorUiConfig3, ErrorUiConfig errorUiConfig4, ErrorUiConfig errorUiConfig5, ErrorUiConfig errorUiConfig6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : errorUiConfig, (i & 2) != 0 ? null : errorUiConfig2, (i & 4) != 0 ? null : errorUiConfig3, (i & 8) != 0 ? null : errorUiConfig4, (i & 16) != 0 ? null : errorUiConfig5, (i & 32) != 0 ? null : errorUiConfig6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ErrorUiConfigs copy$default(ErrorUiConfigs errorUiConfigs, ErrorUiConfig errorUiConfig, ErrorUiConfig errorUiConfig2, ErrorUiConfig errorUiConfig3, ErrorUiConfig errorUiConfig4, ErrorUiConfig errorUiConfig5, ErrorUiConfig errorUiConfig6, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                errorUiConfig = errorUiConfigs.account_mismatch;
            }
            if ((i & 2) != 0) {
                errorUiConfig2 = errorUiConfigs.detection;
            }
            if ((i & 4) != 0) {
                errorUiConfig3 = errorUiConfigs.timeout;
            }
            if ((i & 8) != 0) {
                errorUiConfig4 = errorUiConfigs.connection;
            }
            if ((i & 16) != 0) {
                errorUiConfig5 = errorUiConfigs.canceled;
            }
            if ((i & 32) != 0) {
                errorUiConfig6 = errorUiConfigs.generic;
            }
            if ((i & 64) != 0) {
                byteString = errorUiConfigs.unknownFields();
            }
            ErrorUiConfig errorUiConfig7 = errorUiConfig6;
            ByteString byteString2 = byteString;
            ErrorUiConfig errorUiConfig8 = errorUiConfig5;
            ErrorUiConfig errorUiConfig9 = errorUiConfig3;
            return errorUiConfigs.copy(errorUiConfig, errorUiConfig2, errorUiConfig9, errorUiConfig4, errorUiConfig8, errorUiConfig7, byteString2);
        }

        public final ErrorUiConfigs copy(ErrorUiConfig account_mismatch, ErrorUiConfig detection, ErrorUiConfig timeout, ErrorUiConfig connection, ErrorUiConfig canceled, ErrorUiConfig generic, ByteString unknownFields) {
            unknownFields.getClass();
            return new ErrorUiConfigs(account_mismatch, detection, timeout, connection, canceled, generic, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ErrorUiConfigs)) {
                return false;
            }
            ErrorUiConfigs errorUiConfigs = (ErrorUiConfigs) other;
            return Intrinsics.areEqual(unknownFields(), errorUiConfigs.unknownFields()) && Intrinsics.areEqual(this.account_mismatch, errorUiConfigs.account_mismatch) && Intrinsics.areEqual(this.detection, errorUiConfigs.detection) && Intrinsics.areEqual(this.timeout, errorUiConfigs.timeout) && Intrinsics.areEqual(this.connection, errorUiConfigs.connection) && Intrinsics.areEqual(this.canceled, errorUiConfigs.canceled) && Intrinsics.areEqual(this.generic, errorUiConfigs.generic);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ErrorUiConfig errorUiConfig = this.account_mismatch;
            int hashCode2 = (hashCode + (errorUiConfig != null ? errorUiConfig.hashCode() : 0)) * 37;
            ErrorUiConfig errorUiConfig2 = this.detection;
            int hashCode3 = (hashCode2 + (errorUiConfig2 != null ? errorUiConfig2.hashCode() : 0)) * 37;
            ErrorUiConfig errorUiConfig3 = this.timeout;
            int hashCode4 = (hashCode3 + (errorUiConfig3 != null ? errorUiConfig3.hashCode() : 0)) * 37;
            ErrorUiConfig errorUiConfig4 = this.connection;
            int hashCode5 = (hashCode4 + (errorUiConfig4 != null ? errorUiConfig4.hashCode() : 0)) * 37;
            ErrorUiConfig errorUiConfig5 = this.canceled;
            int hashCode6 = (hashCode5 + (errorUiConfig5 != null ? errorUiConfig5.hashCode() : 0)) * 37;
            ErrorUiConfig errorUiConfig6 = this.generic;
            int hashCode7 = hashCode6 + (errorUiConfig6 != null ? errorUiConfig6.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.account_mismatch = this.account_mismatch;
            builder.detection = this.detection;
            builder.timeout = this.timeout;
            builder.connection = this.connection;
            builder.canceled = this.canceled;
            builder.generic = this.generic;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ErrorUiConfig errorUiConfig = this.account_mismatch;
            if (errorUiConfig != null) {
                arrayList.add("account_mismatch=" + errorUiConfig);
            }
            ErrorUiConfig errorUiConfig2 = this.detection;
            if (errorUiConfig2 != null) {
                arrayList.add("detection=" + errorUiConfig2);
            }
            ErrorUiConfig errorUiConfig3 = this.timeout;
            if (errorUiConfig3 != null) {
                arrayList.add("timeout=" + errorUiConfig3);
            }
            ErrorUiConfig errorUiConfig4 = this.connection;
            if (errorUiConfig4 != null) {
                arrayList.add("connection=" + errorUiConfig4);
            }
            ErrorUiConfig errorUiConfig5 = this.canceled;
            if (errorUiConfig5 != null) {
                arrayList.add("canceled=" + errorUiConfig5);
            }
            ErrorUiConfig errorUiConfig6 = this.generic;
            if (errorUiConfig6 != null) {
                arrayList.add("generic=" + errorUiConfig6);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorUiConfigs{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ErrorUiConfigs;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ErrorUiConfigs build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ErrorUiConfigs() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorUiConfigs(ErrorUiConfig errorUiConfig, ErrorUiConfig errorUiConfig2, ErrorUiConfig errorUiConfig3, ErrorUiConfig errorUiConfig4, ErrorUiConfig errorUiConfig5, ErrorUiConfig errorUiConfig6, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.account_mismatch = errorUiConfig;
            this.detection = errorUiConfig2;
            this.timeout = errorUiConfig3;
            this.connection = errorUiConfig4;
            this.canceled = errorUiConfig5;
            this.generic = errorUiConfig6;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016JT\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u000fR\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig$Builder;", "sheet_prompt_text", "", "hero_text", "", "sheet_prompt_subtext", "nfc_discovery_sheet_text", "nfc_provisioning_sheet_texts", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getSheet_prompt_text$annotations", "()V", "getSheet_prompt_subtext$annotations", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ScanningUiConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ScanningUiConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<String> hero_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String nfc_discovery_sheet_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
        public final List<String> nfc_provisioning_sheet_texts;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String sheet_prompt_subtext;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String sheet_prompt_text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "<init>", "()V", "sheet_prompt_text", "", "hero_text", "", "sheet_prompt_subtext", "nfc_discovery_sheet_text", "nfc_provisioning_sheet_texts", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<String> hero_text;
            public String nfc_discovery_sheet_text;
            public List<String> nfc_provisioning_sheet_texts;
            public String sheet_prompt_subtext;
            public String sheet_prompt_text;

            public Builder() {
                EmptyList emptyList = EmptyList.INSTANCE;
                this.hero_text = emptyList;
                this.nfc_provisioning_sheet_texts = emptyList;
            }

            @Override // com.squareup.wire.Message.Builder
            public ScanningUiConfig build() {
                return new ScanningUiConfig(this.sheet_prompt_text, this.hero_text, this.sheet_prompt_subtext, this.nfc_discovery_sheet_text, this.nfc_provisioning_sheet_texts, buildUnknownFields());
            }

            public final Builder hero_text(List<String> hero_text) {
                hero_text.getClass();
                TransactorKt.checkElementsNotNull(hero_text);
                this.hero_text = hero_text;
                return this;
            }

            public final Builder nfc_discovery_sheet_text(String nfc_discovery_sheet_text) {
                this.nfc_discovery_sheet_text = nfc_discovery_sheet_text;
                return this;
            }

            public final Builder nfc_provisioning_sheet_texts(List<String> nfc_provisioning_sheet_texts) {
                nfc_provisioning_sheet_texts.getClass();
                TransactorKt.checkElementsNotNull(nfc_provisioning_sheet_texts);
                this.nfc_provisioning_sheet_texts = nfc_provisioning_sheet_texts;
                return this;
            }

            @Deprecated
            public final Builder sheet_prompt_subtext(String sheet_prompt_subtext) {
                this.sheet_prompt_subtext = sheet_prompt_subtext;
                return this;
            }

            @Deprecated
            public final Builder sheet_prompt_text(String sheet_prompt_text) {
                this.sheet_prompt_text = sheet_prompt_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ScanningUiConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$ScanningUiConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ScanningUiConfig decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FidesmoProvisioningBlocker.ScanningUiConfig((String) obj, m, (String) obj2, (String) obj3, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            m.add(ProtoAdapter.STRING.decode(reader));
                        } else if (nextTag == 3) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.ScanningUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.sheet_prompt_text);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.hero_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.sheet_prompt_subtext);
                    protoAdapter2.encodeWithTag(writer, 4, value.nfc_discovery_sheet_text);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 5, value.nfc_provisioning_sheet_texts);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.ScanningUiConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.asRepeated().encodedSizeWithTag(5, value.nfc_provisioning_sheet_texts) + protoAdapter2.encodedSizeWithTag(4, value.nfc_discovery_sheet_text) + protoAdapter2.encodedSizeWithTag(3, value.sheet_prompt_subtext) + protoAdapter2.asRepeated().encodedSizeWithTag(2, value.hero_text) + protoAdapter2.encodedSizeWithTag(1, value.sheet_prompt_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.ScanningUiConfig redact(FidesmoProvisioningBlocker.ScanningUiConfig value) {
                    value.getClass();
                    return FidesmoProvisioningBlocker.ScanningUiConfig.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.ScanningUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.asRepeated().encodeWithTag(writer, 5, value.nfc_provisioning_sheet_texts);
                    protoAdapter2.encodeWithTag(writer, 4, value.nfc_discovery_sheet_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.sheet_prompt_subtext);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.hero_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.sheet_prompt_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public ScanningUiConfig(String str, List list, String str2, String str3, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? EmptyList.INSTANCE : list2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ScanningUiConfig copy$default(ScanningUiConfig scanningUiConfig, String str, List list, String str2, String str3, List list2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scanningUiConfig.sheet_prompt_text;
            }
            if ((i & 2) != 0) {
                list = scanningUiConfig.hero_text;
            }
            if ((i & 4) != 0) {
                str2 = scanningUiConfig.sheet_prompt_subtext;
            }
            if ((i & 8) != 0) {
                str3 = scanningUiConfig.nfc_discovery_sheet_text;
            }
            if ((i & 16) != 0) {
                list2 = scanningUiConfig.nfc_provisioning_sheet_texts;
            }
            if ((i & 32) != 0) {
                byteString = scanningUiConfig.unknownFields();
            }
            List list3 = list2;
            ByteString byteString2 = byteString;
            return scanningUiConfig.copy(str, list, str2, str3, list3, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getSheet_prompt_subtext$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getSheet_prompt_text$annotations() {
        }

        public final ScanningUiConfig copy(String sheet_prompt_text, List<String> hero_text, String sheet_prompt_subtext, String nfc_discovery_sheet_text, List<String> nfc_provisioning_sheet_texts, ByteString unknownFields) {
            hero_text.getClass();
            nfc_provisioning_sheet_texts.getClass();
            unknownFields.getClass();
            return new ScanningUiConfig(sheet_prompt_text, hero_text, sheet_prompt_subtext, nfc_discovery_sheet_text, nfc_provisioning_sheet_texts, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ScanningUiConfig)) {
                return false;
            }
            ScanningUiConfig scanningUiConfig = (ScanningUiConfig) other;
            return Intrinsics.areEqual(unknownFields(), scanningUiConfig.unknownFields()) && Intrinsics.areEqual(this.sheet_prompt_text, scanningUiConfig.sheet_prompt_text) && Intrinsics.areEqual(this.hero_text, scanningUiConfig.hero_text) && Intrinsics.areEqual(this.sheet_prompt_subtext, scanningUiConfig.sheet_prompt_subtext) && Intrinsics.areEqual(this.nfc_discovery_sheet_text, scanningUiConfig.nfc_discovery_sheet_text) && Intrinsics.areEqual(this.nfc_provisioning_sheet_texts, scanningUiConfig.nfc_provisioning_sheet_texts);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.sheet_prompt_text;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.hero_text);
            String str2 = this.sheet_prompt_subtext;
            int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.nfc_discovery_sheet_text;
            int hashCode3 = this.nfc_provisioning_sheet_texts.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.sheet_prompt_text = this.sheet_prompt_text;
            builder.hero_text = this.hero_text;
            builder.sheet_prompt_subtext = this.sheet_prompt_subtext;
            builder.nfc_discovery_sheet_text = this.nfc_discovery_sheet_text;
            builder.nfc_provisioning_sheet_texts = this.nfc_provisioning_sheet_texts;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.sheet_prompt_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sheet_prompt_text=", arrayList);
            }
            if (!this.hero_text.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("hero_text=", arrayList, this.hero_text);
            }
            String str2 = this.sheet_prompt_subtext;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sheet_prompt_subtext=", arrayList);
            }
            String str3 = this.nfc_discovery_sheet_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "nfc_discovery_sheet_text=", arrayList);
            }
            if (!this.nfc_provisioning_sheet_texts.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("nfc_provisioning_sheet_texts=", arrayList, this.nfc_provisioning_sheet_texts);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ScanningUiConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$ScanningUiConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ScanningUiConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanningUiConfig(String str, List<String> list, String str2, String str3, List<String> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.sheet_prompt_text = str;
            this.sheet_prompt_subtext = str2;
            this.nfc_discovery_sheet_text = str3;
            this.hero_text = TransactorKt.immutableCopyOf("hero_text", list);
            this.nfc_provisioning_sheet_texts = TransactorKt.immutableCopyOf("nfc_provisioning_sheet_texts", list2);
        }

        public ScanningUiConfig() {
            this(null, null, null, null, null, null, 63, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig$Builder;", "highlighted_title", "", "standard_title", "tiles", "Lcom/squareup/protos/cash/money/elements/BookletTile;", "button_text", "disclosure_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/money/elements/BookletTile;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Deprecated
    /* loaded from: classes8.dex */
    public static final class SuccessUiConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SuccessUiConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String disclosure_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String highlighted_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String standard_title;

        @WireField(adapter = "com.squareup.protos.cash.money.elements.BookletTile#ADAPTER", schemaIndex = 2, tag = 3)
        public final BookletTile tiles;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", "<init>", "()V", "highlighted_title", "", "standard_title", "tiles", "Lcom/squareup/protos/cash/money/elements/BookletTile;", "button_text", "disclosure_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String button_text;
            public String disclosure_text;
            public String highlighted_title;
            public String standard_title;
            public BookletTile tiles;

            @Override // com.squareup.wire.Message.Builder
            public SuccessUiConfig build() {
                return new SuccessUiConfig(this.highlighted_title, this.standard_title, this.tiles, this.button_text, this.disclosure_text, buildUnknownFields());
            }

            public final Builder button_text(String button_text) {
                this.button_text = button_text;
                return this;
            }

            public final Builder disclosure_text(String disclosure_text) {
                this.disclosure_text = disclosure_text;
                return this;
            }

            public final Builder highlighted_title(String highlighted_title) {
                this.highlighted_title = highlighted_title;
                return this;
            }

            public final Builder standard_title(String standard_title) {
                this.standard_title = standard_title;
                return this;
            }

            public final Builder tiles(BookletTile tiles) {
                this.tiles = tiles;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SuccessUiConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$SuccessUiConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.SuccessUiConfig decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FidesmoProvisioningBlocker.SuccessUiConfig((String) obj, (String) obj2, (BookletTile) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(BookletTile.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FidesmoProvisioningBlocker.SuccessUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.highlighted_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.standard_title);
                    BookletTile.ADAPTER.encodeWithTag(writer, 3, value.tiles);
                    protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.disclosure_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FidesmoProvisioningBlocker.SuccessUiConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(5, value.disclosure_text) + protoAdapter2.encodedSizeWithTag(4, value.button_text) + BookletTile.ADAPTER.encodedSizeWithTag(3, value.tiles) + protoAdapter2.encodedSizeWithTag(2, value.standard_title) + protoAdapter2.encodedSizeWithTag(1, value.highlighted_title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FidesmoProvisioningBlocker.SuccessUiConfig redact(FidesmoProvisioningBlocker.SuccessUiConfig value) {
                    value.getClass();
                    BookletTile bookletTile = value.tiles;
                    return FidesmoProvisioningBlocker.SuccessUiConfig.copy$default(value, null, null, bookletTile != null ? (BookletTile) BookletTile.ADAPTER.redact(bookletTile) : null, null, null, ByteString.EMPTY, 27, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FidesmoProvisioningBlocker.SuccessUiConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.disclosure_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                    BookletTile.ADAPTER.encodeWithTag(writer, 3, value.tiles);
                    protoAdapter2.encodeWithTag(writer, 2, value.standard_title);
                    protoAdapter2.encodeWithTag(writer, 1, value.highlighted_title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SuccessUiConfig(String str, String str2, BookletTile bookletTile, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bookletTile, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SuccessUiConfig copy$default(SuccessUiConfig successUiConfig, String str, String str2, BookletTile bookletTile, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successUiConfig.highlighted_title;
            }
            if ((i & 2) != 0) {
                str2 = successUiConfig.standard_title;
            }
            if ((i & 4) != 0) {
                bookletTile = successUiConfig.tiles;
            }
            if ((i & 8) != 0) {
                str3 = successUiConfig.button_text;
            }
            if ((i & 16) != 0) {
                str4 = successUiConfig.disclosure_text;
            }
            if ((i & 32) != 0) {
                byteString = successUiConfig.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            return successUiConfig.copy(str, str2, bookletTile, str3, str5, byteString2);
        }

        public final SuccessUiConfig copy(String highlighted_title, String standard_title, BookletTile tiles, String button_text, String disclosure_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new SuccessUiConfig(highlighted_title, standard_title, tiles, button_text, disclosure_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SuccessUiConfig)) {
                return false;
            }
            SuccessUiConfig successUiConfig = (SuccessUiConfig) other;
            return Intrinsics.areEqual(unknownFields(), successUiConfig.unknownFields()) && Intrinsics.areEqual(this.highlighted_title, successUiConfig.highlighted_title) && Intrinsics.areEqual(this.standard_title, successUiConfig.standard_title) && Intrinsics.areEqual(this.tiles, successUiConfig.tiles) && Intrinsics.areEqual(this.button_text, successUiConfig.button_text) && Intrinsics.areEqual(this.disclosure_text, successUiConfig.disclosure_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.highlighted_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.standard_title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            BookletTile bookletTile = this.tiles;
            int hashCode4 = (hashCode3 + (bookletTile != null ? bookletTile.hashCode() : 0)) * 37;
            String str3 = this.button_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.disclosure_text;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.highlighted_title = this.highlighted_title;
            builder.standard_title = this.standard_title;
            builder.tiles = this.tiles;
            builder.button_text = this.button_text;
            builder.disclosure_text = this.disclosure_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.highlighted_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "highlighted_title=", arrayList);
            }
            String str2 = this.standard_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "standard_title=", arrayList);
            }
            BookletTile bookletTile = this.tiles;
            if (bookletTile != null) {
                arrayList.add("tiles=" + bookletTile);
            }
            String str3 = this.button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
            }
            String str4 = this.disclosure_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "disclosure_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SuccessUiConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$SuccessUiConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SuccessUiConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SuccessUiConfig() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessUiConfig(String str, String str2, BookletTile bookletTile, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.highlighted_title = str;
            this.standard_title = str2;
            this.tiles = bookletTile;
            this.button_text = str3;
            this.disclosure_text = str4;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FidesmoProvisioningBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FidesmoProvisioningBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
