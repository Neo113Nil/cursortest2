package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.LayoutElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ArcadeComponent;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/LayoutElement$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LayoutElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LayoutElement.Component component = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LayoutElement(component, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                component = new LayoutElement.Component.Column((LayoutElement.Column) LayoutElement.Column.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                component = new LayoutElement.Component.Row((LayoutElement.Row) LayoutElement.Row.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                component = new LayoutElement.Component.Box((LayoutElement.Box) LayoutElement.Box.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                component = new LayoutElement.Component.ArcadeComponent((ArcadeComponent) ArcadeComponent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LayoutElement layoutElement = (LayoutElement) obj;
        reverseProtoWriter.getClass();
        layoutElement.getClass();
        reverseProtoWriter.writeBytes(layoutElement.unknownFields());
        LayoutElement.Component component = layoutElement.component;
        if (component instanceof LayoutElement.Component.Column) {
            LayoutElement.Column.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((LayoutElement.Component.Column) component).getValue());
            return;
        }
        if (component instanceof LayoutElement.Component.Row) {
            LayoutElement.Row.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((LayoutElement.Component.Row) component).getValue());
            return;
        }
        if (component instanceof LayoutElement.Component.Box) {
            LayoutElement.Box.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LayoutElement.Component.Box) component).getValue());
        } else if (component instanceof LayoutElement.Component.ArcadeComponent) {
            ArcadeComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((LayoutElement.Component.ArcadeComponent) component).getValue());
        } else {
            if (component == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LayoutElement layoutElement = (LayoutElement) obj;
        layoutElement.getClass();
        int size$okio = layoutElement.unknownFields().getSize$okio();
        LayoutElement.Component component = layoutElement.component;
        if (component instanceof LayoutElement.Component.Column) {
            encodedSizeWithTag = LayoutElement.Column.ADAPTER.encodedSizeWithTag(1, ((LayoutElement.Component.Column) component).getValue());
        } else if (component instanceof LayoutElement.Component.Row) {
            encodedSizeWithTag = LayoutElement.Row.ADAPTER.encodedSizeWithTag(2, ((LayoutElement.Component.Row) component).getValue());
        } else if (component instanceof LayoutElement.Component.Box) {
            encodedSizeWithTag = LayoutElement.Box.ADAPTER.encodedSizeWithTag(3, ((LayoutElement.Component.Box) component).getValue());
        } else {
            if (!(component instanceof LayoutElement.Component.ArcadeComponent)) {
                if (component == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ArcadeComponent.ADAPTER.encodedSizeWithTag(4, ((LayoutElement.Component.ArcadeComponent) component).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LayoutElement layoutElement = (LayoutElement) obj;
        layoutElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        LayoutElement.Component component = layoutElement.component;
        byteString.getClass();
        return new LayoutElement(component, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LayoutElement layoutElement = (LayoutElement) obj;
        layoutElement.getClass();
        LayoutElement.Component component = layoutElement.component;
        if (component instanceof LayoutElement.Component.Column) {
            LayoutElement.Column.ADAPTER.encodeWithTag(protoWriter, 1, ((LayoutElement.Component.Column) component).getValue());
        } else if (component instanceof LayoutElement.Component.Row) {
            LayoutElement.Row.ADAPTER.encodeWithTag(protoWriter, 2, ((LayoutElement.Component.Row) component).getValue());
        } else if (component instanceof LayoutElement.Component.Box) {
            LayoutElement.Box.ADAPTER.encodeWithTag(protoWriter, 3, ((LayoutElement.Component.Box) component).getValue());
        } else if (component instanceof LayoutElement.Component.ArcadeComponent) {
            ArcadeComponent.ADAPTER.encodeWithTag(protoWriter, 4, ((LayoutElement.Component.ArcadeComponent) component).getValue());
        } else if (component != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(layoutElement.unknownFields());
    }
}
