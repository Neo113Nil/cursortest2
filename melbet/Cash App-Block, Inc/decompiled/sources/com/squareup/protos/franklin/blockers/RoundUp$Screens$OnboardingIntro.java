package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.blockers.RoundUp$Screens$OnboardingIntro;
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

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0016\u0015\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"com/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Builder;", "", "title", "Ljava/lang/String;", "description", "continue_button_label", "Lcom/squareup/protos/cash/ui/Image;", "illustration", "Lcom/squareup/protos/cash/ui/Image;", "", "illustration_width", "Ljava/lang/Integer;", "illustration_height", "equity_fineprint_markdown", "", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction;", "instructions", "Ljava/util/List;", "Companion", "Builder", "Instruction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoundUp$Screens$OnboardingIntro extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RoundUp$Screens$OnboardingIntro> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String continue_button_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String equity_fineprint_markdown;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 4, tag = 5)
    public final Image illustration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 6, tag = 7)
    public final Integer illustration_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 5, tag = 6)
    public final Integer illustration_width;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.RoundUp$Screens$OnboardingIntro$Instruction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Instruction> instructions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "<init>", "()V", "title", "", "description", "instructions", "", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction;", "continue_button_label", "illustration", "Lcom/squareup/protos/cash/ui/Image;", "illustration_width", "", "Ljava/lang/Integer;", "illustration_height", "equity_fineprint_markdown", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String continue_button_label;
        public String description;
        public String equity_fineprint_markdown;
        public Image illustration;
        public Integer illustration_height;
        public Integer illustration_width;
        public List<Instruction> instructions = EmptyList.INSTANCE;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public RoundUp$Screens$OnboardingIntro build() {
            return new RoundUp$Screens$OnboardingIntro(this.title, this.description, this.instructions, this.continue_button_label, this.illustration, this.illustration_width, this.illustration_height, this.equity_fineprint_markdown, buildUnknownFields());
        }

        public final Builder continue_button_label(String continue_button_label) {
            this.continue_button_label = continue_button_label;
            return this;
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder equity_fineprint_markdown(String equity_fineprint_markdown) {
            this.equity_fineprint_markdown = equity_fineprint_markdown;
            return this;
        }

        public final Builder illustration(Image illustration) {
            this.illustration = illustration;
            return this;
        }

        public final Builder illustration_height(Integer illustration_height) {
            this.illustration_height = illustration_height;
            return this;
        }

        public final Builder illustration_width(Integer illustration_width) {
            this.illustration_width = illustration_width;
            return this;
        }

        public final Builder instructions(List<Instruction> instructions) {
            instructions.getClass();
            TransactorKt.checkElementsNotNull(instructions);
            this.instructions = instructions;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RoundUp$Screens$OnboardingIntro.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.RoundUp$Screens$OnboardingIntro$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RoundUp$Screens$OnboardingIntro decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RoundUp$Screens$OnboardingIntro((String) obj, (String) obj2, m, (String) obj3, (Image) obj4, (Integer) obj5, (Integer) obj6, (String) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            m.add(RoundUp$Screens$OnboardingIntro.Instruction.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.UINT32.decode(reader);
                            break;
                        case 7:
                            obj6 = ProtoAdapter.UINT32.decode(reader);
                            break;
                        case 8:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RoundUp$Screens$OnboardingIntro value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.description);
                RoundUp$Screens$OnboardingIntro.Instruction.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.instructions);
                protoAdapter2.encodeWithTag(writer, 4, value.continue_button_label);
                Image.ADAPTER.encodeWithTag(writer, 5, value.illustration);
                ProtoAdapter protoAdapter3 = ProtoAdapter.UINT32;
                protoAdapter3.encodeWithTag(writer, 6, value.illustration_width);
                protoAdapter3.encodeWithTag(writer, 7, value.illustration_height);
                protoAdapter2.encodeWithTag(writer, 8, value.equity_fineprint_markdown);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RoundUp$Screens$OnboardingIntro value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(5, value.illustration) + protoAdapter2.encodedSizeWithTag(4, value.continue_button_label) + RoundUp$Screens$OnboardingIntro.Instruction.ADAPTER.asRepeated().encodedSizeWithTag(3, value.instructions) + protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.UINT32;
                return protoAdapter2.encodedSizeWithTag(8, value.equity_fineprint_markdown) + protoAdapter3.encodedSizeWithTag(7, value.illustration_height) + protoAdapter3.encodedSizeWithTag(6, value.illustration_width) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RoundUp$Screens$OnboardingIntro redact(RoundUp$Screens$OnboardingIntro value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.instructions, RoundUp$Screens$OnboardingIntro.Instruction.ADAPTER);
                Image image = value.illustration;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.description;
                String str3 = value.continue_button_label;
                Integer num = value.illustration_width;
                Integer num2 = value.illustration_height;
                String str4 = value.equity_fineprint_markdown;
                byteString.getClass();
                return new RoundUp$Screens$OnboardingIntro(str, str2, m1169redactElements, str3, image2, num, num2, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RoundUp$Screens$OnboardingIntro value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.equity_fineprint_markdown);
                ProtoAdapter protoAdapter3 = ProtoAdapter.UINT32;
                protoAdapter3.encodeWithTag(writer, 7, value.illustration_height);
                protoAdapter3.encodeWithTag(writer, 6, value.illustration_width);
                Image.ADAPTER.encodeWithTag(writer, 5, value.illustration);
                protoAdapter2.encodeWithTag(writer, 4, value.continue_button_label);
                RoundUp$Screens$OnboardingIntro.Instruction.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.instructions);
                protoAdapter2.encodeWithTag(writer, 2, value.description);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundUp$Screens$OnboardingIntro(String str, String str2, List list, String str3, Image image, Integer num, Integer num2, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.description = str2;
        this.continue_button_label = str3;
        this.illustration = image;
        this.illustration_width = num;
        this.illustration_height = num2;
        this.equity_fineprint_markdown = str4;
        this.instructions = TransactorKt.immutableCopyOf("instructions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoundUp$Screens$OnboardingIntro)) {
            return false;
        }
        RoundUp$Screens$OnboardingIntro roundUp$Screens$OnboardingIntro = (RoundUp$Screens$OnboardingIntro) obj;
        return Intrinsics.areEqual(unknownFields(), roundUp$Screens$OnboardingIntro.unknownFields()) && Intrinsics.areEqual(this.title, roundUp$Screens$OnboardingIntro.title) && Intrinsics.areEqual(this.description, roundUp$Screens$OnboardingIntro.description) && Intrinsics.areEqual(this.instructions, roundUp$Screens$OnboardingIntro.instructions) && Intrinsics.areEqual(this.continue_button_label, roundUp$Screens$OnboardingIntro.continue_button_label) && Intrinsics.areEqual(this.illustration, roundUp$Screens$OnboardingIntro.illustration) && Intrinsics.areEqual(this.illustration_width, roundUp$Screens$OnboardingIntro.illustration_width) && Intrinsics.areEqual(this.illustration_height, roundUp$Screens$OnboardingIntro.illustration_height) && Intrinsics.areEqual(this.equity_fineprint_markdown, roundUp$Screens$OnboardingIntro.equity_fineprint_markdown);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.instructions);
        String str3 = this.continue_button_label;
        int hashCode3 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        Image image = this.illustration;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        Integer num = this.illustration_width;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.illustration_height;
        int hashCode6 = (hashCode5 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str4 = this.equity_fineprint_markdown;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.description = this.description;
        builder.instructions = this.instructions;
        builder.continue_button_label = this.continue_button_label;
        builder.illustration = this.illustration;
        builder.illustration_width = this.illustration_width;
        builder.illustration_height = this.illustration_height;
        builder.equity_fineprint_markdown = this.equity_fineprint_markdown;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        if (!this.instructions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instructions=", arrayList, this.instructions);
        }
        String str3 = this.continue_button_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "continue_button_label=", arrayList);
        }
        Image image = this.illustration;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("illustration=", image, arrayList);
        }
        Integer num = this.illustration_width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("illustration_width=", num, arrayList);
        }
        Integer num2 = this.illustration_height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("illustration_height=", num2, arrayList);
        }
        String str4 = this.equity_fineprint_markdown;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "equity_fineprint_markdown=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingIntro{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction$Builder;", "title", "", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Instruction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Instruction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction;", "<init>", "()V", "title", "", "description", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String description;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public Instruction build() {
                return new Instruction(this.title, this.description, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Instruction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.RoundUp$Screens$OnboardingIntro$Instruction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RoundUp$Screens$OnboardingIntro.Instruction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RoundUp$Screens$OnboardingIntro.Instruction((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, RoundUp$Screens$OnboardingIntro.Instruction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RoundUp$Screens$OnboardingIntro.Instruction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RoundUp$Screens$OnboardingIntro.Instruction redact(RoundUp$Screens$OnboardingIntro.Instruction value) {
                    value.getClass();
                    return RoundUp$Screens$OnboardingIntro.Instruction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RoundUp$Screens$OnboardingIntro.Instruction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Instruction(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Instruction copy$default(Instruction instruction, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instruction.title;
            }
            if ((i & 2) != 0) {
                str2 = instruction.description;
            }
            if ((i & 4) != 0) {
                byteString = instruction.unknownFields();
            }
            return instruction.copy(str, str2, byteString);
        }

        public final Instruction copy(String title, String description, ByteString unknownFields) {
            unknownFields.getClass();
            return new Instruction(title, description, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Instruction)) {
                return false;
            }
            Instruction instruction = (Instruction) other;
            return Intrinsics.areEqual(unknownFields(), instruction.unknownFields()) && Intrinsics.areEqual(this.title, instruction.title) && Intrinsics.areEqual(this.description, instruction.description);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.description = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Instruction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Instruction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Instruction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Instruction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Instruction(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.description = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$OnboardingIntro;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RoundUp$Screens$OnboardingIntro build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
