package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        DrawableUtils drawableUtils = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action((Action.Type) obj, drawableUtils, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Action.Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    drawableUtils = new Action$Details$OneTimePayment((Action.OneTimePayment) Action.OneTimePayment.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    drawableUtils = new Action$Details$OnFilePayment((Action.OnFilePayment) Action.OnFilePayment.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    drawableUtils = new Action$Details$UnlinkedRefund((Action.UnlinkedRefund) Action.UnlinkedRefund.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    drawableUtils = new Action$Details$LinkAccount((Action.LinkAccount) Action.LinkAccount.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    drawableUtils = new Action$Details$SessionAuthentication((Action.SessionAuthentication) Action.SessionAuthentication.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    drawableUtils = new Action$Details$RecurringDeposits((Action.RecurringDeposits) Action.RecurringDeposits.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    drawableUtils = new Action$Details$OnFileDeposit((Action.OnFileDeposit) Action.OnFileDeposit.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    drawableUtils = new Action$Details$ShadowAccount((Action.ShadowAccount) Action.ShadowAccount.ADAPTER.decode(protoReader));
                    break;
                case 10:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 11:
                    drawableUtils = new Action$Details$LinkAccountTidal((Action.LinkAccountTidal) Action.LinkAccountTidal.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    drawableUtils = new Action$Details$CustomerProfileSharing((Action.CustomerProfileSharing) Action.CustomerProfileSharing.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    drawableUtils = new Action$Details$Oauth((Action.OAuth) Action.OAuth.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    drawableUtils = new Action$Details$ShadowAccountAppLogin((Action.ShadowAccountAppLogin) Action.ShadowAccountAppLogin.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    drawableUtils = new Action$Details$OnFilePayout((Action.OnFilePayout) Action.OnFilePayout.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    drawableUtils = new Action$Details$Openid((Action.OpenID) Action.OpenID.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    drawableUtils = new Action$Details$CheckingBalance((Action.CheckingBalance) Action.CheckingBalance.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action action = (Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        DrawableUtils drawableUtils = action.details;
        if (drawableUtils instanceof Action$Details$OneTimePayment) {
            Action.OneTimePayment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Action$Details$OneTimePayment) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$OnFilePayment) {
            Action.OnFilePayment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Action$Details$OnFilePayment) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$UnlinkedRefund) {
            Action.UnlinkedRefund.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Action$Details$UnlinkedRefund) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$LinkAccount) {
            Action.LinkAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Action$Details$LinkAccount) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$SessionAuthentication) {
            Action.SessionAuthentication.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((Action$Details$SessionAuthentication) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$RecurringDeposits) {
            Action.RecurringDeposits.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((Action$Details$RecurringDeposits) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$OnFileDeposit) {
            Action.OnFileDeposit.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((Action$Details$OnFileDeposit) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$ShadowAccount) {
            Action.ShadowAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((Action$Details$ShadowAccount) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$LinkAccountTidal) {
            Action.LinkAccountTidal.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((Action$Details$LinkAccountTidal) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$CustomerProfileSharing) {
            Action.CustomerProfileSharing.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((Action$Details$CustomerProfileSharing) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$Oauth) {
            Action.OAuth.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((Action$Details$Oauth) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$ShadowAccountAppLogin) {
            Action.ShadowAccountAppLogin.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((Action$Details$ShadowAccountAppLogin) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$OnFilePayout) {
            Action.OnFilePayout.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((Action$Details$OnFilePayout) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$Openid) {
            Action.OpenID.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((Action$Details$Openid) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$CheckingBalance) {
            Action.CheckingBalance.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((Action$Details$CheckingBalance) drawableUtils).value);
        } else if (drawableUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Action.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, action.f1267type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        int encodedSizeWithTag = Action.Type.ADAPTER.encodedSizeWithTag(1, action.f1267type) + action.unknownFields().getSize$okio();
        DrawableUtils drawableUtils = action.details;
        if (drawableUtils instanceof Action$Details$OneTimePayment) {
            return Action.OneTimePayment.ADAPTER.encodedSizeWithTag(2, ((Action$Details$OneTimePayment) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$OnFilePayment) {
            return Action.OnFilePayment.ADAPTER.encodedSizeWithTag(3, ((Action$Details$OnFilePayment) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$UnlinkedRefund) {
            return Action.UnlinkedRefund.ADAPTER.encodedSizeWithTag(4, ((Action$Details$UnlinkedRefund) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$LinkAccount) {
            return Action.LinkAccount.ADAPTER.encodedSizeWithTag(5, ((Action$Details$LinkAccount) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$SessionAuthentication) {
            return Action.SessionAuthentication.ADAPTER.encodedSizeWithTag(6, ((Action$Details$SessionAuthentication) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$RecurringDeposits) {
            return Action.RecurringDeposits.ADAPTER.encodedSizeWithTag(7, ((Action$Details$RecurringDeposits) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$OnFileDeposit) {
            return Action.OnFileDeposit.ADAPTER.encodedSizeWithTag(8, ((Action$Details$OnFileDeposit) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$ShadowAccount) {
            return Action.ShadowAccount.ADAPTER.encodedSizeWithTag(9, ((Action$Details$ShadowAccount) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$LinkAccountTidal) {
            return Action.LinkAccountTidal.ADAPTER.encodedSizeWithTag(11, ((Action$Details$LinkAccountTidal) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$CustomerProfileSharing) {
            return Action.CustomerProfileSharing.ADAPTER.encodedSizeWithTag(12, ((Action$Details$CustomerProfileSharing) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$Oauth) {
            return Action.OAuth.ADAPTER.encodedSizeWithTag(13, ((Action$Details$Oauth) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$ShadowAccountAppLogin) {
            return Action.ShadowAccountAppLogin.ADAPTER.encodedSizeWithTag(14, ((Action$Details$ShadowAccountAppLogin) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$OnFilePayout) {
            return Action.OnFilePayout.ADAPTER.encodedSizeWithTag(15, ((Action$Details$OnFilePayout) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$Openid) {
            return Action.OpenID.ADAPTER.encodedSizeWithTag(16, ((Action$Details$Openid) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils instanceof Action$Details$CheckingBalance) {
            return Action.CheckingBalance.ADAPTER.encodedSizeWithTag(17, ((Action$Details$CheckingBalance) drawableUtils).value) + encodedSizeWithTag;
        }
        if (drawableUtils == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        Action.Type type2 = action.f1267type;
        DrawableUtils drawableUtils = action.details;
        byteString.getClass();
        return new Action(type2, drawableUtils, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action action = (Action) obj;
        action.getClass();
        Action.Type.ADAPTER.encodeWithTag(protoWriter, 1, action.f1267type);
        DrawableUtils drawableUtils = action.details;
        if (drawableUtils instanceof Action$Details$OneTimePayment) {
            Action.OneTimePayment.ADAPTER.encodeWithTag(protoWriter, 2, ((Action$Details$OneTimePayment) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$OnFilePayment) {
            Action.OnFilePayment.ADAPTER.encodeWithTag(protoWriter, 3, ((Action$Details$OnFilePayment) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$UnlinkedRefund) {
            Action.UnlinkedRefund.ADAPTER.encodeWithTag(protoWriter, 4, ((Action$Details$UnlinkedRefund) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$LinkAccount) {
            Action.LinkAccount.ADAPTER.encodeWithTag(protoWriter, 5, ((Action$Details$LinkAccount) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$SessionAuthentication) {
            Action.SessionAuthentication.ADAPTER.encodeWithTag(protoWriter, 6, ((Action$Details$SessionAuthentication) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$RecurringDeposits) {
            Action.RecurringDeposits.ADAPTER.encodeWithTag(protoWriter, 7, ((Action$Details$RecurringDeposits) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$OnFileDeposit) {
            Action.OnFileDeposit.ADAPTER.encodeWithTag(protoWriter, 8, ((Action$Details$OnFileDeposit) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$ShadowAccount) {
            Action.ShadowAccount.ADAPTER.encodeWithTag(protoWriter, 9, ((Action$Details$ShadowAccount) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$LinkAccountTidal) {
            Action.LinkAccountTidal.ADAPTER.encodeWithTag(protoWriter, 11, ((Action$Details$LinkAccountTidal) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$CustomerProfileSharing) {
            Action.CustomerProfileSharing.ADAPTER.encodeWithTag(protoWriter, 12, ((Action$Details$CustomerProfileSharing) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$Oauth) {
            Action.OAuth.ADAPTER.encodeWithTag(protoWriter, 13, ((Action$Details$Oauth) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$ShadowAccountAppLogin) {
            Action.ShadowAccountAppLogin.ADAPTER.encodeWithTag(protoWriter, 14, ((Action$Details$ShadowAccountAppLogin) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$OnFilePayout) {
            Action.OnFilePayout.ADAPTER.encodeWithTag(protoWriter, 15, ((Action$Details$OnFilePayout) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$Openid) {
            Action.OpenID.ADAPTER.encodeWithTag(protoWriter, 16, ((Action$Details$Openid) drawableUtils).value);
        } else if (drawableUtils instanceof Action$Details$CheckingBalance) {
            Action.CheckingBalance.ADAPTER.encodeWithTag(protoWriter, 17, ((Action$Details$CheckingBalance) drawableUtils).value);
        } else if (drawableUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(action.unknownFields());
    }
}
