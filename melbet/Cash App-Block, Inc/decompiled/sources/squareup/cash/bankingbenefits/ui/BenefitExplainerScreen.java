package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.ListUnordered;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.SectionHeader;
import squareup.cash.ui.arcade.elements.WithinSection;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\b\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u000b"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Builder;", "", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "elements", "Ljava/util/List;", "footer_elements", "Companion", "Builder", "Element", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BenefitExplainerScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BenefitExplainerScreen> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Element> elements;

    @WireField(adapter = "squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<Element> footer_elements;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "<init>", "()V", "elements", "", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "footer_elements", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Element> elements;
        public List<Element> footer_elements;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.elements = emptyList;
            this.footer_elements = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public BenefitExplainerScreen build() {
            return new BenefitExplainerScreen(this.elements, this.footer_elements, buildUnknownFields());
        }

        public final Builder elements(List<Element> elements) {
            elements.getClass();
            TransactorKt.checkElementsNotNull(elements);
            this.elements = elements;
            return this;
        }

        public final Builder footer_elements(List<Element> footer_elements) {
            footer_elements.getClass();
            TransactorKt.checkElementsNotNull(footer_elements);
            this.footer_elements = footer_elements;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BenefitExplainerScreen.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BenefitExplainerScreen decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BenefitExplainerScreen(m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(BenefitExplainerScreen.Element.ADAPTER.decode(reader));
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(BenefitExplainerScreen.Element.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BenefitExplainerScreen value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = BenefitExplainerScreen.Element.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.elements);
                protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.footer_elements);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BenefitExplainerScreen value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = BenefitExplainerScreen.Element.ADAPTER;
                return protoAdapter2.asRepeated().encodedSizeWithTag(2, value.footer_elements) + protoAdapter2.asRepeated().encodedSizeWithTag(1, value.elements) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BenefitExplainerScreen redact(BenefitExplainerScreen value) {
                value.getClass();
                List<BenefitExplainerScreen.Element> list = value.elements;
                ProtoAdapter protoAdapter2 = BenefitExplainerScreen.Element.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.footer_elements, protoAdapter2);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BenefitExplainerScreen(m1169redactElements, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BenefitExplainerScreen value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = BenefitExplainerScreen.Element.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.footer_elements);
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.elements);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitExplainerScreen(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.elements = TransactorKt.immutableCopyOf("elements", list);
        this.footer_elements = TransactorKt.immutableCopyOf("footer_elements", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BenefitExplainerScreen)) {
            return false;
        }
        BenefitExplainerScreen benefitExplainerScreen = (BenefitExplainerScreen) obj;
        return Intrinsics.areEqual(unknownFields(), benefitExplainerScreen.unknownFields()) && Intrinsics.areEqual(this.elements, benefitExplainerScreen.elements) && Intrinsics.areEqual(this.footer_elements, benefitExplainerScreen.footer_elements);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.footer_elements.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.elements);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.elements = this.elements;
        builder.footer_elements = this.footer_elements;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.elements.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
        }
        if (!this.footer_elements.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("footer_elements=", arrayList, this.footer_elements);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitExplainerScreen{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Builder;", "element", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Element", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Element extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Element> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final AbstractC0086Element element;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "<init>", "()V", "element", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AbstractC0086Element element;

            @Override // com.squareup.wire.Message.Builder
            public Element build() {
                return new Element(this.element, buildUnknownFields());
            }

            public final Builder element(AbstractC0086Element element) {
                this.element = element;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Element.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BenefitExplainerScreen.Element decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BenefitExplainerScreen.Element(abstractC0086Element, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.Header((PageHeader) PageHeader.ADAPTER.decode(reader));
                                break;
                            case 2:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered((ListUnordered) ListUnordered.ADAPTER.decode(reader));
                                break;
                            case 3:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader((SectionHeader) SectionHeader.ADAPTER.decode(reader));
                                break;
                            case 4:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton((ActionableButtonDefault) ActionableButtonDefault.ADAPTER.decode(reader));
                                break;
                            case 5:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup((ActionableButtonCtaGroup) ActionableButtonCtaGroup.ADAPTER.decode(reader));
                                break;
                            case 6:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection((BetweenSection) BetweenSection.ADAPTER.decode(reader));
                                break;
                            case 7:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection((WithinSection) WithinSection.ADAPTER.decode(reader));
                                break;
                            case 8:
                                abstractC0086Element = new BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault((CellDefault) CellDefault.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BenefitExplainerScreen.Element value) {
                    writer.getClass();
                    value.getClass();
                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element = value.element;
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.Header) {
                        PageHeader.ADAPTER.encodeWithTag(writer, 1, ((BenefitExplainerScreen.Element.AbstractC0086Element.Header) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) {
                        ListUnordered.ADAPTER.encodeWithTag(writer, 2, ((BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) {
                        SectionHeader.ADAPTER.encodeWithTag(writer, 3, ((BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) {
                        ActionableButtonDefault.ADAPTER.encodeWithTag(writer, 4, ((BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) {
                        ActionableButtonCtaGroup.ADAPTER.encodeWithTag(writer, 5, ((BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) {
                        BetweenSection.ADAPTER.encodeWithTag(writer, 6, ((BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) {
                        WithinSection.ADAPTER.encodeWithTag(writer, 7, ((BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) {
                        CellDefault.ADAPTER.encodeWithTag(writer, 8, ((BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) abstractC0086Element).getValue());
                    } else if (abstractC0086Element != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BenefitExplainerScreen.Element value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element = value.element;
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.Header) {
                        encodedSizeWithTag = PageHeader.ADAPTER.encodedSizeWithTag(1, ((BenefitExplainerScreen.Element.AbstractC0086Element.Header) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) {
                        encodedSizeWithTag = ListUnordered.ADAPTER.encodedSizeWithTag(2, ((BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) {
                        encodedSizeWithTag = SectionHeader.ADAPTER.encodedSizeWithTag(3, ((BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) {
                        encodedSizeWithTag = ActionableButtonDefault.ADAPTER.encodedSizeWithTag(4, ((BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) {
                        encodedSizeWithTag = ActionableButtonCtaGroup.ADAPTER.encodedSizeWithTag(5, ((BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) {
                        encodedSizeWithTag = BetweenSection.ADAPTER.encodedSizeWithTag(6, ((BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) {
                        encodedSizeWithTag = WithinSection.ADAPTER.encodedSizeWithTag(7, ((BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) abstractC0086Element).getValue());
                    } else {
                        if (!(abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault)) {
                            if (abstractC0086Element == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = CellDefault.ADAPTER.encodedSizeWithTag(8, ((BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) abstractC0086Element).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BenefitExplainerScreen.Element redact(BenefitExplainerScreen.Element value) {
                    value.getClass();
                    return BenefitExplainerScreen.Element.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BenefitExplainerScreen.Element value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element = value.element;
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.Header) {
                        PageHeader.ADAPTER.encodeWithTag(writer, 1, ((BenefitExplainerScreen.Element.AbstractC0086Element.Header) abstractC0086Element).getValue());
                        return;
                    }
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) {
                        ListUnordered.ADAPTER.encodeWithTag(writer, 2, ((BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) abstractC0086Element).getValue());
                        return;
                    }
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) {
                        SectionHeader.ADAPTER.encodeWithTag(writer, 3, ((BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) abstractC0086Element).getValue());
                        return;
                    }
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) {
                        ActionableButtonDefault.ADAPTER.encodeWithTag(writer, 4, ((BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) abstractC0086Element).getValue());
                        return;
                    }
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) {
                        ActionableButtonCtaGroup.ADAPTER.encodeWithTag(writer, 5, ((BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) abstractC0086Element).getValue());
                        return;
                    }
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) {
                        BetweenSection.ADAPTER.encodeWithTag(writer, 6, ((BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) abstractC0086Element).getValue());
                        return;
                    }
                    if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) {
                        WithinSection.ADAPTER.encodeWithTag(writer, 7, ((BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) abstractC0086Element).getValue());
                    } else if (abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) {
                        CellDefault.ADAPTER.encodeWithTag(writer, 8, ((BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) abstractC0086Element).getValue());
                    } else {
                        if (abstractC0086Element == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Element(AbstractC0086Element abstractC0086Element, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : abstractC0086Element, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Element copy$default(Element element, AbstractC0086Element abstractC0086Element, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC0086Element = element.element;
            }
            if ((i & 2) != 0) {
                byteString = element.unknownFields();
            }
            return element.copy(abstractC0086Element, byteString);
        }

        public final Element copy(AbstractC0086Element element, ByteString unknownFields) {
            unknownFields.getClass();
            return new Element(element, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Element)) {
                return false;
            }
            Element element = (Element) other;
            return Intrinsics.areEqual(unknownFields(), element.unknownFields()) && Intrinsics.areEqual(this.element, element.element);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AbstractC0086Element abstractC0086Element = this.element;
            int hashCode2 = hashCode + (abstractC0086Element != null ? abstractC0086Element.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            AbstractC0086Element abstractC0086Element = this.element;
            if (abstractC0086Element != null) {
                arrayList.add("element=" + abstractC0086Element);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Element{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Builder;", "", "body", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "", "<init>", "()V", "Header", "ListUnordered", "SectionHeader", "ActionableButton", "ButtonCtaGroup", "BetweenSection", "WithinSection", "CellDefault", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$ActionableButton;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$BetweenSection;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$ButtonCtaGroup;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$CellDefault;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$Header;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$ListUnordered;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$SectionHeader;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$WithinSection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element, reason: collision with other inner class name */
        public static abstract class AbstractC0086Element {

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", declaredName = "actionable_button", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$ActionableButton;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "<init>", "(Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$ActionableButton */
            public static final /* data */ class ActionableButton extends AbstractC0086Element {
                private final ActionableButtonDefault value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ActionableButton(ActionableButtonDefault actionableButtonDefault) {
                    super(null);
                    actionableButtonDefault.getClass();
                    this.value = actionableButtonDefault;
                }

                public static /* synthetic */ ActionableButton copy$default(ActionableButton actionableButton, ActionableButtonDefault actionableButtonDefault, int i, Object obj) {
                    if ((i & 1) != 0) {
                        actionableButtonDefault = actionableButton.value;
                    }
                    return actionableButton.copy(actionableButtonDefault);
                }

                /* renamed from: component1, reason: from getter */
                public final ActionableButtonDefault getValue() {
                    return this.value;
                }

                public final ActionableButton copy(ActionableButtonDefault value) {
                    value.getClass();
                    return new ActionableButton(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ActionableButton) && Intrinsics.areEqual(this.value, ((ActionableButton) other).value);
                }

                public final ActionableButtonDefault getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ActionableButton(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.BetweenSection#ADAPTER", declaredName = "between_section", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$BetweenSection;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/BetweenSection;", "<init>", "(Lsquareup/cash/ui/arcade/elements/BetweenSection;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/BetweenSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$BetweenSection */
            public static final /* data */ class BetweenSection extends AbstractC0086Element {
                private final squareup.cash.ui.arcade.elements.BetweenSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BetweenSection(squareup.cash.ui.arcade.elements.BetweenSection betweenSection) {
                    super(null);
                    betweenSection.getClass();
                    this.value = betweenSection;
                }

                public static /* synthetic */ BetweenSection copy$default(BetweenSection betweenSection, squareup.cash.ui.arcade.elements.BetweenSection betweenSection2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        betweenSection2 = betweenSection.value;
                    }
                    return betweenSection.copy(betweenSection2);
                }

                /* renamed from: component1, reason: from getter */
                public final squareup.cash.ui.arcade.elements.BetweenSection getValue() {
                    return this.value;
                }

                public final BetweenSection copy(squareup.cash.ui.arcade.elements.BetweenSection value) {
                    value.getClass();
                    return new BetweenSection(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BetweenSection) && Intrinsics.areEqual(this.value, ((BetweenSection) other).value);
                }

                public final squareup.cash.ui.arcade.elements.BetweenSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "BetweenSection(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup#ADAPTER", declaredName = "button_cta_group", tag = 5)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$ButtonCtaGroup;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;", "<init>", "(Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$ButtonCtaGroup */
            public static final /* data */ class ButtonCtaGroup extends AbstractC0086Element {
                private final ActionableButtonCtaGroup value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ButtonCtaGroup(ActionableButtonCtaGroup actionableButtonCtaGroup) {
                    super(null);
                    actionableButtonCtaGroup.getClass();
                    this.value = actionableButtonCtaGroup;
                }

                public static /* synthetic */ ButtonCtaGroup copy$default(ButtonCtaGroup buttonCtaGroup, ActionableButtonCtaGroup actionableButtonCtaGroup, int i, Object obj) {
                    if ((i & 1) != 0) {
                        actionableButtonCtaGroup = buttonCtaGroup.value;
                    }
                    return buttonCtaGroup.copy(actionableButtonCtaGroup);
                }

                /* renamed from: component1, reason: from getter */
                public final ActionableButtonCtaGroup getValue() {
                    return this.value;
                }

                public final ButtonCtaGroup copy(ActionableButtonCtaGroup value) {
                    value.getClass();
                    return new ButtonCtaGroup(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ButtonCtaGroup) && Intrinsics.areEqual(this.value, ((ButtonCtaGroup) other).value);
                }

                public final ActionableButtonCtaGroup getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ButtonCtaGroup(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.CellDefault#ADAPTER", declaredName = "cell_default", tag = 8)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$CellDefault;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/CellDefault;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$CellDefault */
            public static final /* data */ class CellDefault extends AbstractC0086Element {
                private final squareup.cash.ui.arcade.elements.CellDefault value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CellDefault(squareup.cash.ui.arcade.elements.CellDefault cellDefault) {
                    super(null);
                    cellDefault.getClass();
                    this.value = cellDefault;
                }

                public static /* synthetic */ CellDefault copy$default(CellDefault cellDefault, squareup.cash.ui.arcade.elements.CellDefault cellDefault2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        cellDefault2 = cellDefault.value;
                    }
                    return cellDefault.copy(cellDefault2);
                }

                /* renamed from: component1, reason: from getter */
                public final squareup.cash.ui.arcade.elements.CellDefault getValue() {
                    return this.value;
                }

                public final CellDefault copy(squareup.cash.ui.arcade.elements.CellDefault value) {
                    value.getClass();
                    return new CellDefault(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CellDefault) && Intrinsics.areEqual(this.value, ((CellDefault) other).value);
                }

                public final squareup.cash.ui.arcade.elements.CellDefault getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "CellDefault(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.PageHeader#ADAPTER", declaredName = "header", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$Header;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/PageHeader;", "<init>", "(Lsquareup/cash/ui/arcade/elements/PageHeader;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/PageHeader;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$Header */
            public static final /* data */ class Header extends AbstractC0086Element {
                private final PageHeader value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Header(PageHeader pageHeader) {
                    super(null);
                    pageHeader.getClass();
                    this.value = pageHeader;
                }

                public static /* synthetic */ Header copy$default(Header header, PageHeader pageHeader, int i, Object obj) {
                    if ((i & 1) != 0) {
                        pageHeader = header.value;
                    }
                    return header.copy(pageHeader);
                }

                /* renamed from: component1, reason: from getter */
                public final PageHeader getValue() {
                    return this.value;
                }

                public final Header copy(PageHeader value) {
                    value.getClass();
                    return new Header(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Header) && Intrinsics.areEqual(this.value, ((Header) other).value);
                }

                public final PageHeader getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Header(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.ListUnordered#ADAPTER", declaredName = "list_unordered", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$ListUnordered;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "<init>", "(Lsquareup/cash/ui/arcade/elements/ListUnordered;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/ListUnordered;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$ListUnordered */
            public static final /* data */ class ListUnordered extends AbstractC0086Element {
                private final squareup.cash.ui.arcade.elements.ListUnordered value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ListUnordered(squareup.cash.ui.arcade.elements.ListUnordered listUnordered) {
                    super(null);
                    listUnordered.getClass();
                    this.value = listUnordered;
                }

                public static /* synthetic */ ListUnordered copy$default(ListUnordered listUnordered, squareup.cash.ui.arcade.elements.ListUnordered listUnordered2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        listUnordered2 = listUnordered.value;
                    }
                    return listUnordered.copy(listUnordered2);
                }

                /* renamed from: component1, reason: from getter */
                public final squareup.cash.ui.arcade.elements.ListUnordered getValue() {
                    return this.value;
                }

                public final ListUnordered copy(squareup.cash.ui.arcade.elements.ListUnordered value) {
                    value.getClass();
                    return new ListUnordered(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ListUnordered) && Intrinsics.areEqual(this.value, ((ListUnordered) other).value);
                }

                public final squareup.cash.ui.arcade.elements.ListUnordered getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ListUnordered(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.SectionHeader#ADAPTER", declaredName = "section_header", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$SectionHeader;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/SectionHeader;", "<init>", "(Lsquareup/cash/ui/arcade/elements/SectionHeader;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/SectionHeader;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$SectionHeader */
            public static final /* data */ class SectionHeader extends AbstractC0086Element {
                private final squareup.cash.ui.arcade.elements.SectionHeader value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SectionHeader(squareup.cash.ui.arcade.elements.SectionHeader sectionHeader) {
                    super(null);
                    sectionHeader.getClass();
                    this.value = sectionHeader;
                }

                public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, squareup.cash.ui.arcade.elements.SectionHeader sectionHeader2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        sectionHeader2 = sectionHeader.value;
                    }
                    return sectionHeader.copy(sectionHeader2);
                }

                /* renamed from: component1, reason: from getter */
                public final squareup.cash.ui.arcade.elements.SectionHeader getValue() {
                    return this.value;
                }

                public final SectionHeader copy(squareup.cash.ui.arcade.elements.SectionHeader value) {
                    value.getClass();
                    return new SectionHeader(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SectionHeader) && Intrinsics.areEqual(this.value, ((SectionHeader) other).value);
                }

                public final squareup.cash.ui.arcade.elements.SectionHeader getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "SectionHeader(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.WithinSection#ADAPTER", declaredName = "within_section", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element$WithinSection;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element$Element;", "value", "Lsquareup/cash/ui/arcade/elements/WithinSection;", "<init>", "(Lsquareup/cash/ui/arcade/elements/WithinSection;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/WithinSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element$Element$WithinSection */
            public static final /* data */ class WithinSection extends AbstractC0086Element {
                private final squareup.cash.ui.arcade.elements.WithinSection value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WithinSection(squareup.cash.ui.arcade.elements.WithinSection withinSection) {
                    super(null);
                    withinSection.getClass();
                    this.value = withinSection;
                }

                public static /* synthetic */ WithinSection copy$default(WithinSection withinSection, squareup.cash.ui.arcade.elements.WithinSection withinSection2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        withinSection2 = withinSection.value;
                    }
                    return withinSection.copy(withinSection2);
                }

                /* renamed from: component1, reason: from getter */
                public final squareup.cash.ui.arcade.elements.WithinSection getValue() {
                    return this.value;
                }

                public final WithinSection copy(squareup.cash.ui.arcade.elements.WithinSection value) {
                    value.getClass();
                    return new WithinSection(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof WithinSection) && Intrinsics.areEqual(this.value, ((WithinSection) other).value);
                }

                public final squareup.cash.ui.arcade.elements.WithinSection getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "WithinSection(value=" + this.value + ")";
                }
            }

            public /* synthetic */ AbstractC0086Element(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0086Element() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Element() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Element(AbstractC0086Element abstractC0086Element, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = abstractC0086Element;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Builder;", "", "body", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BenefitExplainerScreen build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
