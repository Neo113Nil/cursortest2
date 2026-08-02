package com.squareup.protos.cash.investautomator.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Automation$AutomationTarget$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Automation.AutomationTarget((Automation.AutomationTarget.Type) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (Color) obj9, (Color) obj10, (String) obj11, (String) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj3 = Automation.AutomationTarget.Type.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    obj9 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj9);
                    continue;
                case 8:
                    obj10 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj10);
                    continue;
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj4 = obj2;
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Automation.AutomationTarget automationTarget = (Automation.AutomationTarget) obj;
        reverseProtoWriter.getClass();
        automationTarget.getClass();
        reverseProtoWriter.writeBytes(automationTarget.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, automationTarget.icon_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, automationTarget.icon_unicode);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, automationTarget.background_color);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, automationTarget.border_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, automationTarget.alt_display_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, automationTarget.alt_display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, automationTarget.display_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, automationTarget.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, automationTarget.identifier);
        Automation.AutomationTarget.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, automationTarget.f1279type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Automation.AutomationTarget automationTarget = (Automation.AutomationTarget) obj;
        automationTarget.getClass();
        int encodedSizeWithTag = Automation.AutomationTarget.Type.ADAPTER.encodedSizeWithTag(1, automationTarget.f1279type) + automationTarget.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, automationTarget.alt_display_icon_url) + protoAdapter.encodedSizeWithTag(5, automationTarget.alt_display_name) + protoAdapter.encodedSizeWithTag(4, automationTarget.display_icon_url) + protoAdapter.encodedSizeWithTag(3, automationTarget.display_name) + protoAdapter.encodedSizeWithTag(2, automationTarget.identifier) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(10, automationTarget.icon_id) + protoAdapter.encodedSizeWithTag(9, automationTarget.icon_unicode) + protoAdapter2.encodedSizeWithTag(8, automationTarget.background_color) + protoAdapter2.encodedSizeWithTag(7, automationTarget.border_color) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Automation.AutomationTarget automationTarget = (Automation.AutomationTarget) obj;
        automationTarget.getClass();
        Color color = automationTarget.border_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = automationTarget.background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        Automation.AutomationTarget.Type type2 = automationTarget.f1279type;
        String str = automationTarget.identifier;
        String str2 = automationTarget.display_name;
        String str3 = automationTarget.display_icon_url;
        String str4 = automationTarget.alt_display_name;
        String str5 = automationTarget.alt_display_icon_url;
        String str6 = automationTarget.icon_unicode;
        String str7 = automationTarget.icon_id;
        byteString.getClass();
        return new Automation.AutomationTarget(type2, str, str2, str3, str4, str5, color2, color4, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Automation.AutomationTarget automationTarget = (Automation.AutomationTarget) obj;
        automationTarget.getClass();
        Automation.AutomationTarget.Type.ADAPTER.encodeWithTag(protoWriter, 1, automationTarget.f1279type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, automationTarget.identifier);
        protoAdapter.encodeWithTag(protoWriter, 3, automationTarget.display_name);
        protoAdapter.encodeWithTag(protoWriter, 4, automationTarget.display_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, automationTarget.alt_display_name);
        protoAdapter.encodeWithTag(protoWriter, 6, automationTarget.alt_display_icon_url);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, automationTarget.border_color);
        protoAdapter2.encodeWithTag(protoWriter, 8, automationTarget.background_color);
        protoAdapter.encodeWithTag(protoWriter, 9, automationTarget.icon_unicode);
        protoAdapter.encodeWithTag(protoWriter, 10, automationTarget.icon_id);
        protoWriter.writeBytes(automationTarget.unknownFields());
    }
}
