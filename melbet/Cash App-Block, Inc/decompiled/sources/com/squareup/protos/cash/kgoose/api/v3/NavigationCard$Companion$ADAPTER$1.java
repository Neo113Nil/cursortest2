package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.NavigationCard;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/NavigationCard$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        NavigationCard.Icon.Avatar avatar = null;
        NavigationCard.TapAction.ClientRoute clientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NavigationCard((LocalizedString) obj, avatar, clientRoute, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                avatar = new NavigationCard.Icon.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                clientRoute = new NavigationCard.TapAction.ClientRoute((NavigationCard.ClientRouteAction) NavigationCard.ClientRouteAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NavigationCard navigationCard = (NavigationCard) obj;
        reverseProtoWriter.getClass();
        navigationCard.getClass();
        reverseProtoWriter.writeBytes(navigationCard.unknownFields());
        NavigationCard.TapAction tapAction = navigationCard.tap_action;
        if (tapAction instanceof NavigationCard.TapAction.ClientRoute) {
            NavigationCard.ClientRouteAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((NavigationCard.TapAction.ClientRoute) tapAction).getValue());
        } else if (tapAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        NavigationCard.Icon icon = navigationCard.icon;
        if (icon instanceof NavigationCard.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((NavigationCard.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, navigationCard.version);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, navigationCard.cta);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NavigationCard navigationCard = (NavigationCard) obj;
        navigationCard.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, navigationCard.cta) + navigationCard.unknownFields().getSize$okio();
        NavigationCard.Icon icon = navigationCard.icon;
        if (icon instanceof NavigationCard.Icon.Avatar) {
            encodedSizeWithTag += UiAvatar.ADAPTER.encodedSizeWithTag(2, ((NavigationCard.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        NavigationCard.TapAction tapAction = navigationCard.tap_action;
        if (tapAction instanceof NavigationCard.TapAction.ClientRoute) {
            encodedSizeWithTag += NavigationCard.ClientRouteAction.ADAPTER.encodedSizeWithTag(4, ((NavigationCard.TapAction.ClientRoute) tapAction).getValue());
        } else if (tapAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return ProtoAdapter.INT32.encodedSizeWithTag(5, navigationCard.version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NavigationCard navigationCard = (NavigationCard) obj;
        navigationCard.getClass();
        LocalizedString localizedString = navigationCard.cta;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        NavigationCard.Icon icon = navigationCard.icon;
        NavigationCard.TapAction tapAction = navigationCard.tap_action;
        Integer num = navigationCard.version;
        byteString.getClass();
        return new NavigationCard(localizedString2, icon, tapAction, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NavigationCard navigationCard = (NavigationCard) obj;
        navigationCard.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, navigationCard.cta);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, navigationCard.version);
        NavigationCard.Icon icon = navigationCard.icon;
        if (icon instanceof NavigationCard.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 2, ((NavigationCard.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        NavigationCard.TapAction tapAction = navigationCard.tap_action;
        if (tapAction instanceof NavigationCard.TapAction.ClientRoute) {
            NavigationCard.ClientRouteAction.ADAPTER.encodeWithTag(protoWriter, 4, ((NavigationCard.TapAction.ClientRoute) tapAction).getValue());
        } else if (tapAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(navigationCard.unknownFields());
    }
}
