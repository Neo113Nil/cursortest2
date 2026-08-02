package com.squareup.protos.franklin.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"com/squareup/protos/franklin/api/FormBlocker$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/FormBlocker;", "subformsAdapter", "", "", "getSubformsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "subformsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FormBlocker$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: subformsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy subformsAdapter;

    public FormBlocker$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.franklin.api.FormBlocker", syntax, (Object) null, "squareup/franklin/form_blocker.proto");
        this.subformsAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(0));
    }

    private final ProtoAdapter getSubformsAdapter() {
        return (ProtoAdapter) this.subformsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter subformsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        ProtoAdapter protoAdapter2 = FormBlocker.ADAPTER;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public FormBlocker decode(ProtoReader reader) {
        Object obj;
        FormBlocker.Effect effect;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long beginMessage = reader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        FormBlocker.Effect effect2 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new FormBlocker(m, (BlockerAction) obj3, (FormBlocker.Icon) obj4, (BlockerAction) obj5, (String) obj12, linkedHashMap, effect2, (Boolean) obj6, (FormBlocker.Element.ButtonElement.Type) obj7, (FormBlocker.Element.ButtonElement.Style) obj8, (FormBlocker.Element.ButtonElement.Style) obj9, (BlockerAction) obj10, (FormBlocker.InitialEditingMode) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    m.add(FormBlocker.Element.ADAPTER.decode(reader));
                    obj4 = obj;
                    effect2 = effect;
                    obj6 = obj2;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj3);
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj5);
                    break;
                case 4:
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    try {
                        effect2 = new FormBlocker.Effect.OnDisplayEffect((FormBlocker.OnDisplayEffect) FormBlocker.OnDisplayEffect.ADAPTER.decode(reader));
                        obj4 = obj;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 6:
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    try {
                        obj8 = FormBlocker.Element.ButtonElement.Style.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    obj4 = obj;
                    effect2 = effect;
                    obj6 = obj2;
                    break;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj10);
                    break;
                case 8:
                    effect2 = new FormBlocker.Effect.RemoteOnDisplayEffect((FormBlocker.RemoteOnDisplayEffect) FormBlocker.RemoteOnDisplayEffect.ADAPTER.decode(reader));
                    obj4 = obj4;
                    break;
                case 9:
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    try {
                        obj7 = FormBlocker.Element.ButtonElement.Type.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    obj4 = obj;
                    effect2 = effect;
                    obj6 = obj2;
                    break;
                case 10:
                    obj12 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 11:
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    linkedHashMap.putAll((Map) getSubformsAdapter().decode(reader));
                    obj4 = obj;
                    effect2 = effect;
                    obj6 = obj2;
                    break;
                case 12:
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    try {
                        obj9 = FormBlocker.Element.ButtonElement.Style.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                    }
                    obj4 = obj;
                    effect2 = effect;
                    obj6 = obj2;
                    break;
                case 13:
                    try {
                        obj11 = FormBlocker.InitialEditingMode.ADAPTER.decode(reader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        obj = obj4;
                        effect = effect2;
                        obj2 = obj6;
                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 14:
                    obj4 = TransactorKt.decodeMessageOrMerge(FormBlocker.Icon.ADAPTER, reader, obj4);
                    break;
                default:
                    reader.readUnknownField(nextTag);
                    obj = obj4;
                    effect = effect2;
                    obj2 = obj6;
                    obj4 = obj;
                    effect2 = effect;
                    obj6 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, FormBlocker value) {
        writer.getClass();
        value.getClass();
        FormBlocker.Element.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.elements);
        ProtoAdapter protoAdapter = BlockerAction.ADAPTER;
        protoAdapter.encodeWithTag(writer, 2, value.primary_action);
        FormBlocker.Icon.ADAPTER.encodeWithTag(writer, 14, value.primary_action_icon);
        protoAdapter.encodeWithTag(writer, 3, value.secondary_action);
        ProtoAdapter.STRING.encodeWithTag(writer, 10, value.disclaimer_text);
        getSubformsAdapter().encodeWithTag(writer, 11, value.subforms);
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.requires_full_scroll);
        FormBlocker.Element.ButtonElement.Type.ADAPTER.encodeWithTag(writer, 9, value.primary_action_type);
        ProtoAdapter protoAdapter2 = FormBlocker.Element.ButtonElement.Style.ADAPTER;
        protoAdapter2.encodeWithTag(writer, 6, value.secondary_action_style);
        protoAdapter2.encodeWithTag(writer, 12, value.primary_action_style);
        protoAdapter.encodeWithTag(writer, 7, value.help_action);
        FormBlocker.InitialEditingMode.ADAPTER.encodeWithTag(writer, 13, value.initial_editing_mode);
        FormBlocker.Effect effect = value.effect;
        if (effect instanceof FormBlocker.Effect.OnDisplayEffect) {
            FormBlocker.OnDisplayEffect.ADAPTER.encodeWithTag(writer, 4, ((FormBlocker.Effect.OnDisplayEffect) effect).getValue());
        } else if (effect instanceof FormBlocker.Effect.RemoteOnDisplayEffect) {
            FormBlocker.RemoteOnDisplayEffect.ADAPTER.encodeWithTag(writer, 8, ((FormBlocker.Effect.RemoteOnDisplayEffect) effect).getValue());
        } else if (effect != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(FormBlocker value) {
        int encodedSizeWithTag;
        value.getClass();
        int encodedSizeWithTag2 = FormBlocker.Element.ADAPTER.asRepeated().encodedSizeWithTag(1, value.elements) + value.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BlockerAction.ADAPTER;
        int encodedSizeWithTag3 = getSubformsAdapter().encodedSizeWithTag(11, value.subforms) + ProtoAdapter.STRING.encodedSizeWithTag(10, value.disclaimer_text) + protoAdapter.encodedSizeWithTag(3, value.secondary_action) + FormBlocker.Icon.ADAPTER.encodedSizeWithTag(14, value.primary_action_icon) + protoAdapter.encodedSizeWithTag(2, value.primary_action) + encodedSizeWithTag2;
        FormBlocker.Effect effect = value.effect;
        if (effect instanceof FormBlocker.Effect.OnDisplayEffect) {
            encodedSizeWithTag = FormBlocker.OnDisplayEffect.ADAPTER.encodedSizeWithTag(4, ((FormBlocker.Effect.OnDisplayEffect) effect).getValue());
        } else {
            if (!(effect instanceof FormBlocker.Effect.RemoteOnDisplayEffect)) {
                if (effect != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag4 = FormBlocker.Element.ButtonElement.Type.ADAPTER.encodedSizeWithTag(9, value.primary_action_type) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.requires_full_scroll) + encodedSizeWithTag3;
                ProtoAdapter protoAdapter2 = FormBlocker.Element.ButtonElement.Style.ADAPTER;
                return FormBlocker.InitialEditingMode.ADAPTER.encodedSizeWithTag(13, value.initial_editing_mode) + protoAdapter.encodedSizeWithTag(7, value.help_action) + protoAdapter2.encodedSizeWithTag(12, value.primary_action_style) + protoAdapter2.encodedSizeWithTag(6, value.secondary_action_style) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = FormBlocker.RemoteOnDisplayEffect.ADAPTER.encodedSizeWithTag(8, ((FormBlocker.Effect.RemoteOnDisplayEffect) effect).getValue());
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        int encodedSizeWithTag42 = FormBlocker.Element.ButtonElement.Type.ADAPTER.encodedSizeWithTag(9, value.primary_action_type) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.requires_full_scroll) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter22 = FormBlocker.Element.ButtonElement.Style.ADAPTER;
        return FormBlocker.InitialEditingMode.ADAPTER.encodedSizeWithTag(13, value.initial_editing_mode) + protoAdapter.encodedSizeWithTag(7, value.help_action) + protoAdapter22.encodedSizeWithTag(12, value.primary_action_style) + protoAdapter22.encodedSizeWithTag(6, value.secondary_action_style) + encodedSizeWithTag42;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public FormBlocker redact(FormBlocker value) {
        value.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.elements, FormBlocker.Element.ADAPTER);
        BlockerAction blockerAction = value.primary_action;
        BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
        FormBlocker.Icon icon = value.primary_action_icon;
        FormBlocker.Icon icon2 = icon != null ? (FormBlocker.Icon) FormBlocker.Icon.ADAPTER.redact(icon) : null;
        BlockerAction blockerAction3 = value.secondary_action;
        BlockerAction blockerAction4 = blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null;
        LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(value.subforms, FormBlocker.ADAPTER);
        BlockerAction blockerAction5 = value.help_action;
        BlockerAction blockerAction6 = blockerAction5 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = value.disclaimer_text;
        FormBlocker.Effect effect = value.effect;
        Boolean bool = value.requires_full_scroll;
        FormBlocker.Element.ButtonElement.Type type2 = value.primary_action_type;
        FormBlocker.Element.ButtonElement.Style style = value.secondary_action_style;
        FormBlocker.Element.ButtonElement.Style style2 = value.primary_action_style;
        FormBlocker.InitialEditingMode initialEditingMode = value.initial_editing_mode;
        byteString.getClass();
        return new FormBlocker(m1169redactElements, blockerAction2, icon2, blockerAction4, str, m1170redactElements, effect, bool, type2, style, style2, blockerAction6, initialEditingMode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, FormBlocker value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        FormBlocker.Effect effect = value.effect;
        if (effect instanceof FormBlocker.Effect.OnDisplayEffect) {
            FormBlocker.OnDisplayEffect.ADAPTER.encodeWithTag(writer, 4, ((FormBlocker.Effect.OnDisplayEffect) effect).getValue());
        } else if (effect instanceof FormBlocker.Effect.RemoteOnDisplayEffect) {
            FormBlocker.RemoteOnDisplayEffect.ADAPTER.encodeWithTag(writer, 8, ((FormBlocker.Effect.RemoteOnDisplayEffect) effect).getValue());
        } else if (effect != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        FormBlocker.InitialEditingMode.ADAPTER.encodeWithTag(writer, 13, value.initial_editing_mode);
        ProtoAdapter protoAdapter = BlockerAction.ADAPTER;
        protoAdapter.encodeWithTag(writer, 7, value.help_action);
        ProtoAdapter protoAdapter2 = FormBlocker.Element.ButtonElement.Style.ADAPTER;
        protoAdapter2.encodeWithTag(writer, 12, value.primary_action_style);
        protoAdapter2.encodeWithTag(writer, 6, value.secondary_action_style);
        FormBlocker.Element.ButtonElement.Type.ADAPTER.encodeWithTag(writer, 9, value.primary_action_type);
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.requires_full_scroll);
        getSubformsAdapter().encodeWithTag(writer, 11, value.subforms);
        ProtoAdapter.STRING.encodeWithTag(writer, 10, value.disclaimer_text);
        protoAdapter.encodeWithTag(writer, 3, value.secondary_action);
        FormBlocker.Icon.ADAPTER.encodeWithTag(writer, 14, value.primary_action_icon);
        protoAdapter.encodeWithTag(writer, 2, value.primary_action);
        FormBlocker.Element.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.elements);
    }
}
