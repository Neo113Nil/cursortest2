package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.squareup.protos.cash.tax.TaxWebBridgeRequest;
import com.squareup.protos.cash.web.bridge.WebBridgeHandoverBlockerResponsePayloadEventRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "request", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "Companion", "Builder", "Request", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxWebBridgeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxWebBridgeRequest> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Request request;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;", "<init>", "()V", "request", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Request request;

        @Override // com.squareup.wire.Message.Builder
        public TaxWebBridgeRequest build() {
            return new TaxWebBridgeRequest(this.request, buildUnknownFields());
        }

        public final Builder request(Request request) {
            this.request = request;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxWebBridgeRequest.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeRequest decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                TaxWebBridgeRequest.Request request = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TaxWebBridgeRequest(request, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            request = new TaxWebBridgeRequest.Request.ExitEventRequest((TaxWebBridgeExitEventRequest) TaxWebBridgeExitEventRequest.ADAPTER.decode(reader));
                            break;
                        case 2:
                            request = new TaxWebBridgeRequest.Request.MenuButtonTapEventRequest((TaxWebBridgeMenuButtonTapEventRequest) TaxWebBridgeMenuButtonTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 3:
                            request = new TaxWebBridgeRequest.Request.MenuItemTapEventRequest((TaxWebBridgeMenuItemTapEventRequest) TaxWebBridgeMenuItemTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 4:
                            request = new TaxWebBridgeRequest.Request.ShowDialogEventRequest((TaxWebBridgeShowDialogEventRequest) TaxWebBridgeShowDialogEventRequest.ADAPTER.decode(reader));
                            break;
                        case 5:
                            request = new TaxWebBridgeRequest.Request.DialogButtonTapEventRequest((TaxWebBridgeDialogButtonTapEventRequest) TaxWebBridgeDialogButtonTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 6:
                            request = new TaxWebBridgeRequest.Request.WebClientReadyEventRequest((TaxWebBridgeWebClientReadyEventRequest) TaxWebBridgeWebClientReadyEventRequest.ADAPTER.decode(reader));
                            break;
                        case 7:
                            request = new TaxWebBridgeRequest.Request.BackButtonTapEventRequest((TaxWebBridgeBackButtonTapEventRequest) TaxWebBridgeBackButtonTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 8:
                            request = new TaxWebBridgeRequest.Request.OpenTaxEventRequest((TaxWebBridgeOpenTaxEventRequest) TaxWebBridgeOpenTaxEventRequest.ADAPTER.decode(reader));
                            break;
                        case 9:
                            request = new TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest((TaxWebBridgeConfigureToolbarEventRequest) TaxWebBridgeConfigureToolbarEventRequest.ADAPTER.decode(reader));
                            break;
                        case 10:
                            request = new TaxWebBridgeRequest.Request.CloseButtonTapEventRequest((TaxWebBridgeCloseButtonTapEventRequest) TaxWebBridgeCloseButtonTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 11:
                            request = new TaxWebBridgeRequest.Request.HelpButtonTapEventRequest((TaxWebBridgeHelpButtonTapEventRequest) TaxWebBridgeHelpButtonTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 12:
                            request = new TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest((TaxWebBridgeNativeDeepLinkEventRequest) TaxWebBridgeNativeDeepLinkEventRequest.ADAPTER.decode(reader));
                            break;
                        case 13:
                            request = new TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest((TaxWebBridgeDesktopButtonTapEventRequest) TaxWebBridgeDesktopButtonTapEventRequest.ADAPTER.decode(reader));
                            break;
                        case 14:
                            request = new TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest((WebBridgeHandoverBlockerResponsePayloadEventRequest) WebBridgeHandoverBlockerResponsePayloadEventRequest.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxWebBridgeRequest value) {
                writer.getClass();
                value.getClass();
                TaxWebBridgeRequest.Request request = value.request;
                if (request instanceof TaxWebBridgeRequest.Request.ExitEventRequest) {
                    TaxWebBridgeExitEventRequest.ADAPTER.encodeWithTag(writer, 1, ((TaxWebBridgeRequest.Request.ExitEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.MenuButtonTapEventRequest) {
                    TaxWebBridgeMenuButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 2, ((TaxWebBridgeRequest.Request.MenuButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.MenuItemTapEventRequest) {
                    TaxWebBridgeMenuItemTapEventRequest.ADAPTER.encodeWithTag(writer, 3, ((TaxWebBridgeRequest.Request.MenuItemTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.ShowDialogEventRequest) {
                    TaxWebBridgeShowDialogEventRequest.ADAPTER.encodeWithTag(writer, 4, ((TaxWebBridgeRequest.Request.ShowDialogEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.DialogButtonTapEventRequest) {
                    TaxWebBridgeDialogButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 5, ((TaxWebBridgeRequest.Request.DialogButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.WebClientReadyEventRequest) {
                    TaxWebBridgeWebClientReadyEventRequest.ADAPTER.encodeWithTag(writer, 6, ((TaxWebBridgeRequest.Request.WebClientReadyEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.BackButtonTapEventRequest) {
                    TaxWebBridgeBackButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 7, ((TaxWebBridgeRequest.Request.BackButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.OpenTaxEventRequest) {
                    TaxWebBridgeOpenTaxEventRequest.ADAPTER.encodeWithTag(writer, 8, ((TaxWebBridgeRequest.Request.OpenTaxEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) {
                    TaxWebBridgeConfigureToolbarEventRequest.ADAPTER.encodeWithTag(writer, 9, ((TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.CloseButtonTapEventRequest) {
                    TaxWebBridgeCloseButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 10, ((TaxWebBridgeRequest.Request.CloseButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.HelpButtonTapEventRequest) {
                    TaxWebBridgeHelpButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 11, ((TaxWebBridgeRequest.Request.HelpButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) {
                    TaxWebBridgeNativeDeepLinkEventRequest.ADAPTER.encodeWithTag(writer, 12, ((TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest) {
                    TaxWebBridgeDesktopButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 13, ((TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest) {
                    WebBridgeHandoverBlockerResponsePayloadEventRequest.ADAPTER.encodeWithTag(writer, 14, ((TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest) request).getValue());
                } else if (request != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxWebBridgeRequest value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                TaxWebBridgeRequest.Request request = value.request;
                if (request instanceof TaxWebBridgeRequest.Request.ExitEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeExitEventRequest.ADAPTER.encodedSizeWithTag(1, ((TaxWebBridgeRequest.Request.ExitEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.MenuButtonTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeMenuButtonTapEventRequest.ADAPTER.encodedSizeWithTag(2, ((TaxWebBridgeRequest.Request.MenuButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.MenuItemTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeMenuItemTapEventRequest.ADAPTER.encodedSizeWithTag(3, ((TaxWebBridgeRequest.Request.MenuItemTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.ShowDialogEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeShowDialogEventRequest.ADAPTER.encodedSizeWithTag(4, ((TaxWebBridgeRequest.Request.ShowDialogEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.DialogButtonTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeDialogButtonTapEventRequest.ADAPTER.encodedSizeWithTag(5, ((TaxWebBridgeRequest.Request.DialogButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.WebClientReadyEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeWebClientReadyEventRequest.ADAPTER.encodedSizeWithTag(6, ((TaxWebBridgeRequest.Request.WebClientReadyEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.BackButtonTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeBackButtonTapEventRequest.ADAPTER.encodedSizeWithTag(7, ((TaxWebBridgeRequest.Request.BackButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.OpenTaxEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeOpenTaxEventRequest.ADAPTER.encodedSizeWithTag(8, ((TaxWebBridgeRequest.Request.OpenTaxEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeConfigureToolbarEventRequest.ADAPTER.encodedSizeWithTag(9, ((TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.CloseButtonTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeCloseButtonTapEventRequest.ADAPTER.encodedSizeWithTag(10, ((TaxWebBridgeRequest.Request.CloseButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.HelpButtonTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeHelpButtonTapEventRequest.ADAPTER.encodedSizeWithTag(11, ((TaxWebBridgeRequest.Request.HelpButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeNativeDeepLinkEventRequest.ADAPTER.encodedSizeWithTag(12, ((TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest) {
                    encodedSizeWithTag = TaxWebBridgeDesktopButtonTapEventRequest.ADAPTER.encodedSizeWithTag(13, ((TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest) request).getValue());
                } else {
                    if (!(request instanceof TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest)) {
                        if (request == null) {
                            return size$okio;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag = WebBridgeHandoverBlockerResponsePayloadEventRequest.ADAPTER.encodedSizeWithTag(14, ((TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest) request).getValue());
                }
                return encodedSizeWithTag + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeRequest redact(TaxWebBridgeRequest value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                TaxWebBridgeRequest.Request request = value.request;
                value.getClass();
                byteString.getClass();
                return new TaxWebBridgeRequest(request, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxWebBridgeRequest value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TaxWebBridgeRequest.Request request = value.request;
                if (request instanceof TaxWebBridgeRequest.Request.ExitEventRequest) {
                    TaxWebBridgeExitEventRequest.ADAPTER.encodeWithTag(writer, 1, ((TaxWebBridgeRequest.Request.ExitEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.MenuButtonTapEventRequest) {
                    TaxWebBridgeMenuButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 2, ((TaxWebBridgeRequest.Request.MenuButtonTapEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.MenuItemTapEventRequest) {
                    TaxWebBridgeMenuItemTapEventRequest.ADAPTER.encodeWithTag(writer, 3, ((TaxWebBridgeRequest.Request.MenuItemTapEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.ShowDialogEventRequest) {
                    TaxWebBridgeShowDialogEventRequest.ADAPTER.encodeWithTag(writer, 4, ((TaxWebBridgeRequest.Request.ShowDialogEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.DialogButtonTapEventRequest) {
                    TaxWebBridgeDialogButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 5, ((TaxWebBridgeRequest.Request.DialogButtonTapEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.WebClientReadyEventRequest) {
                    TaxWebBridgeWebClientReadyEventRequest.ADAPTER.encodeWithTag(writer, 6, ((TaxWebBridgeRequest.Request.WebClientReadyEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.BackButtonTapEventRequest) {
                    TaxWebBridgeBackButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 7, ((TaxWebBridgeRequest.Request.BackButtonTapEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.OpenTaxEventRequest) {
                    TaxWebBridgeOpenTaxEventRequest.ADAPTER.encodeWithTag(writer, 8, ((TaxWebBridgeRequest.Request.OpenTaxEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) {
                    TaxWebBridgeConfigureToolbarEventRequest.ADAPTER.encodeWithTag(writer, 9, ((TaxWebBridgeRequest.Request.ConfigureToolbarEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.CloseButtonTapEventRequest) {
                    TaxWebBridgeCloseButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 10, ((TaxWebBridgeRequest.Request.CloseButtonTapEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.HelpButtonTapEventRequest) {
                    TaxWebBridgeHelpButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 11, ((TaxWebBridgeRequest.Request.HelpButtonTapEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) {
                    TaxWebBridgeNativeDeepLinkEventRequest.ADAPTER.encodeWithTag(writer, 12, ((TaxWebBridgeRequest.Request.NativeDeepLinkEventRequest) request).getValue());
                    return;
                }
                if (request instanceof TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest) {
                    TaxWebBridgeDesktopButtonTapEventRequest.ADAPTER.encodeWithTag(writer, 13, ((TaxWebBridgeRequest.Request.DesktopButtonTapEventRequest) request).getValue());
                } else if (request instanceof TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest) {
                    WebBridgeHandoverBlockerResponsePayloadEventRequest.ADAPTER.encodeWithTag(writer, 14, ((TaxWebBridgeRequest.Request.HandoverBlockerResponsePayloadEventRequest) request).getValue());
                } else {
                    if (request == null) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeRequest(Request request, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request = request;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxWebBridgeRequest)) {
            return false;
        }
        TaxWebBridgeRequest taxWebBridgeRequest = (TaxWebBridgeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), taxWebBridgeRequest.unknownFields()) && Intrinsics.areEqual(this.request, taxWebBridgeRequest.request);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Request request = this.request;
        int hashCode2 = hashCode + (request != null ? request.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request = this.request;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Request request = this.request;
        if (request != null) {
            arrayList.add("request=" + request);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxWebBridgeRequest{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TaxWebBridgeRequest build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "", "<init>", "()V", "ExitEventRequest", "MenuButtonTapEventRequest", "MenuItemTapEventRequest", "ShowDialogEventRequest", "DialogButtonTapEventRequest", "WebClientReadyEventRequest", "BackButtonTapEventRequest", "OpenTaxEventRequest", "ConfigureToolbarEventRequest", "CloseButtonTapEventRequest", "HelpButtonTapEventRequest", "NativeDeepLinkEventRequest", "DesktopButtonTapEventRequest", "HandoverBlockerResponsePayloadEventRequest", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$BackButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$CloseButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$ConfigureToolbarEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$DesktopButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$DialogButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$ExitEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$HandoverBlockerResponsePayloadEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$HelpButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$MenuButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$MenuItemTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$NativeDeepLinkEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$OpenTaxEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$ShowDialogEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$WebClientReadyEventRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Request {

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeBackButtonTapEventRequest#ADAPTER", declaredName = "back_button_tap_event_request", tag = 7)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$BackButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeBackButtonTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeBackButtonTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeBackButtonTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BackButtonTapEventRequest extends Request {
            private final TaxWebBridgeBackButtonTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackButtonTapEventRequest(TaxWebBridgeBackButtonTapEventRequest taxWebBridgeBackButtonTapEventRequest) {
                super(null);
                taxWebBridgeBackButtonTapEventRequest.getClass();
                this.value = taxWebBridgeBackButtonTapEventRequest;
            }

            public static /* synthetic */ BackButtonTapEventRequest copy$default(BackButtonTapEventRequest backButtonTapEventRequest, TaxWebBridgeBackButtonTapEventRequest taxWebBridgeBackButtonTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeBackButtonTapEventRequest = backButtonTapEventRequest.value;
                }
                return backButtonTapEventRequest.copy(taxWebBridgeBackButtonTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeBackButtonTapEventRequest getValue() {
                return this.value;
            }

            public final BackButtonTapEventRequest copy(TaxWebBridgeBackButtonTapEventRequest value) {
                value.getClass();
                return new BackButtonTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BackButtonTapEventRequest) && Intrinsics.areEqual(this.value, ((BackButtonTapEventRequest) other).value);
            }

            public final TaxWebBridgeBackButtonTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BackButtonTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeCloseButtonTapEventRequest#ADAPTER", declaredName = "close_button_tap_event_request", tag = 10)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$CloseButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeCloseButtonTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeCloseButtonTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeCloseButtonTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CloseButtonTapEventRequest extends Request {
            private final TaxWebBridgeCloseButtonTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CloseButtonTapEventRequest(TaxWebBridgeCloseButtonTapEventRequest taxWebBridgeCloseButtonTapEventRequest) {
                super(null);
                taxWebBridgeCloseButtonTapEventRequest.getClass();
                this.value = taxWebBridgeCloseButtonTapEventRequest;
            }

            public static /* synthetic */ CloseButtonTapEventRequest copy$default(CloseButtonTapEventRequest closeButtonTapEventRequest, TaxWebBridgeCloseButtonTapEventRequest taxWebBridgeCloseButtonTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeCloseButtonTapEventRequest = closeButtonTapEventRequest.value;
                }
                return closeButtonTapEventRequest.copy(taxWebBridgeCloseButtonTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeCloseButtonTapEventRequest getValue() {
                return this.value;
            }

            public final CloseButtonTapEventRequest copy(TaxWebBridgeCloseButtonTapEventRequest value) {
                value.getClass();
                return new CloseButtonTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CloseButtonTapEventRequest) && Intrinsics.areEqual(this.value, ((CloseButtonTapEventRequest) other).value);
            }

            public final TaxWebBridgeCloseButtonTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CloseButtonTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest#ADAPTER", declaredName = "configure_toolbar_event_request", tag = 9)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$ConfigureToolbarEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfigureToolbarEventRequest extends Request {
            private final TaxWebBridgeConfigureToolbarEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureToolbarEventRequest(TaxWebBridgeConfigureToolbarEventRequest taxWebBridgeConfigureToolbarEventRequest) {
                super(null);
                taxWebBridgeConfigureToolbarEventRequest.getClass();
                this.value = taxWebBridgeConfigureToolbarEventRequest;
            }

            public static /* synthetic */ ConfigureToolbarEventRequest copy$default(ConfigureToolbarEventRequest configureToolbarEventRequest, TaxWebBridgeConfigureToolbarEventRequest taxWebBridgeConfigureToolbarEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeConfigureToolbarEventRequest = configureToolbarEventRequest.value;
                }
                return configureToolbarEventRequest.copy(taxWebBridgeConfigureToolbarEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeConfigureToolbarEventRequest getValue() {
                return this.value;
            }

            public final ConfigureToolbarEventRequest copy(TaxWebBridgeConfigureToolbarEventRequest value) {
                value.getClass();
                return new ConfigureToolbarEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfigureToolbarEventRequest) && Intrinsics.areEqual(this.value, ((ConfigureToolbarEventRequest) other).value);
            }

            public final TaxWebBridgeConfigureToolbarEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ConfigureToolbarEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeDesktopButtonTapEventRequest#ADAPTER", declaredName = "desktop_button_tap_event_request", tag = 13)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$DesktopButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeDesktopButtonTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeDesktopButtonTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeDesktopButtonTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DesktopButtonTapEventRequest extends Request {
            private final TaxWebBridgeDesktopButtonTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DesktopButtonTapEventRequest(TaxWebBridgeDesktopButtonTapEventRequest taxWebBridgeDesktopButtonTapEventRequest) {
                super(null);
                taxWebBridgeDesktopButtonTapEventRequest.getClass();
                this.value = taxWebBridgeDesktopButtonTapEventRequest;
            }

            public static /* synthetic */ DesktopButtonTapEventRequest copy$default(DesktopButtonTapEventRequest desktopButtonTapEventRequest, TaxWebBridgeDesktopButtonTapEventRequest taxWebBridgeDesktopButtonTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeDesktopButtonTapEventRequest = desktopButtonTapEventRequest.value;
                }
                return desktopButtonTapEventRequest.copy(taxWebBridgeDesktopButtonTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeDesktopButtonTapEventRequest getValue() {
                return this.value;
            }

            public final DesktopButtonTapEventRequest copy(TaxWebBridgeDesktopButtonTapEventRequest value) {
                value.getClass();
                return new DesktopButtonTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DesktopButtonTapEventRequest) && Intrinsics.areEqual(this.value, ((DesktopButtonTapEventRequest) other).value);
            }

            public final TaxWebBridgeDesktopButtonTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DesktopButtonTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeDialogButtonTapEventRequest#ADAPTER", declaredName = "dialog_button_tap_event_request", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$DialogButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeDialogButtonTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeDialogButtonTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeDialogButtonTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DialogButtonTapEventRequest extends Request {
            private final TaxWebBridgeDialogButtonTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DialogButtonTapEventRequest(TaxWebBridgeDialogButtonTapEventRequest taxWebBridgeDialogButtonTapEventRequest) {
                super(null);
                taxWebBridgeDialogButtonTapEventRequest.getClass();
                this.value = taxWebBridgeDialogButtonTapEventRequest;
            }

            public static /* synthetic */ DialogButtonTapEventRequest copy$default(DialogButtonTapEventRequest dialogButtonTapEventRequest, TaxWebBridgeDialogButtonTapEventRequest taxWebBridgeDialogButtonTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeDialogButtonTapEventRequest = dialogButtonTapEventRequest.value;
                }
                return dialogButtonTapEventRequest.copy(taxWebBridgeDialogButtonTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeDialogButtonTapEventRequest getValue() {
                return this.value;
            }

            public final DialogButtonTapEventRequest copy(TaxWebBridgeDialogButtonTapEventRequest value) {
                value.getClass();
                return new DialogButtonTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DialogButtonTapEventRequest) && Intrinsics.areEqual(this.value, ((DialogButtonTapEventRequest) other).value);
            }

            public final TaxWebBridgeDialogButtonTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DialogButtonTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeExitEventRequest#ADAPTER", declaredName = "exit_event_request", tag = 1)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$ExitEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeExitEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeExitEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeExitEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ExitEventRequest extends Request {
            private final TaxWebBridgeExitEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExitEventRequest(TaxWebBridgeExitEventRequest taxWebBridgeExitEventRequest) {
                super(null);
                taxWebBridgeExitEventRequest.getClass();
                this.value = taxWebBridgeExitEventRequest;
            }

            public static /* synthetic */ ExitEventRequest copy$default(ExitEventRequest exitEventRequest, TaxWebBridgeExitEventRequest taxWebBridgeExitEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeExitEventRequest = exitEventRequest.value;
                }
                return exitEventRequest.copy(taxWebBridgeExitEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeExitEventRequest getValue() {
                return this.value;
            }

            public final ExitEventRequest copy(TaxWebBridgeExitEventRequest value) {
                value.getClass();
                return new ExitEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExitEventRequest) && Intrinsics.areEqual(this.value, ((ExitEventRequest) other).value);
            }

            public final TaxWebBridgeExitEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ExitEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.web.bridge.WebBridgeHandoverBlockerResponsePayloadEventRequest#ADAPTER", declaredName = "handover_blocker_response_payload_event_request", tag = 14)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$HandoverBlockerResponsePayloadEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/web/bridge/WebBridgeHandoverBlockerResponsePayloadEventRequest;", "<init>", "(Lcom/squareup/protos/cash/web/bridge/WebBridgeHandoverBlockerResponsePayloadEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/web/bridge/WebBridgeHandoverBlockerResponsePayloadEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandoverBlockerResponsePayloadEventRequest extends Request {
            private final WebBridgeHandoverBlockerResponsePayloadEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandoverBlockerResponsePayloadEventRequest(WebBridgeHandoverBlockerResponsePayloadEventRequest webBridgeHandoverBlockerResponsePayloadEventRequest) {
                super(null);
                webBridgeHandoverBlockerResponsePayloadEventRequest.getClass();
                this.value = webBridgeHandoverBlockerResponsePayloadEventRequest;
            }

            public static /* synthetic */ HandoverBlockerResponsePayloadEventRequest copy$default(HandoverBlockerResponsePayloadEventRequest handoverBlockerResponsePayloadEventRequest, WebBridgeHandoverBlockerResponsePayloadEventRequest webBridgeHandoverBlockerResponsePayloadEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    webBridgeHandoverBlockerResponsePayloadEventRequest = handoverBlockerResponsePayloadEventRequest.value;
                }
                return handoverBlockerResponsePayloadEventRequest.copy(webBridgeHandoverBlockerResponsePayloadEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final WebBridgeHandoverBlockerResponsePayloadEventRequest getValue() {
                return this.value;
            }

            public final HandoverBlockerResponsePayloadEventRequest copy(WebBridgeHandoverBlockerResponsePayloadEventRequest value) {
                value.getClass();
                return new HandoverBlockerResponsePayloadEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandoverBlockerResponsePayloadEventRequest) && Intrinsics.areEqual(this.value, ((HandoverBlockerResponsePayloadEventRequest) other).value);
            }

            public final WebBridgeHandoverBlockerResponsePayloadEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "HandoverBlockerResponsePayloadEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeHelpButtonTapEventRequest#ADAPTER", declaredName = "help_button_tap_event_request", tag = 11)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$HelpButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeHelpButtonTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeHelpButtonTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeHelpButtonTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HelpButtonTapEventRequest extends Request {
            private final TaxWebBridgeHelpButtonTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HelpButtonTapEventRequest(TaxWebBridgeHelpButtonTapEventRequest taxWebBridgeHelpButtonTapEventRequest) {
                super(null);
                taxWebBridgeHelpButtonTapEventRequest.getClass();
                this.value = taxWebBridgeHelpButtonTapEventRequest;
            }

            public static /* synthetic */ HelpButtonTapEventRequest copy$default(HelpButtonTapEventRequest helpButtonTapEventRequest, TaxWebBridgeHelpButtonTapEventRequest taxWebBridgeHelpButtonTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeHelpButtonTapEventRequest = helpButtonTapEventRequest.value;
                }
                return helpButtonTapEventRequest.copy(taxWebBridgeHelpButtonTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeHelpButtonTapEventRequest getValue() {
                return this.value;
            }

            public final HelpButtonTapEventRequest copy(TaxWebBridgeHelpButtonTapEventRequest value) {
                value.getClass();
                return new HelpButtonTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HelpButtonTapEventRequest) && Intrinsics.areEqual(this.value, ((HelpButtonTapEventRequest) other).value);
            }

            public final TaxWebBridgeHelpButtonTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "HelpButtonTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeMenuButtonTapEventRequest#ADAPTER", declaredName = "menu_button_tap_event_request", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$MenuButtonTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuButtonTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuButtonTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuButtonTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MenuButtonTapEventRequest extends Request {
            private final TaxWebBridgeMenuButtonTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MenuButtonTapEventRequest(TaxWebBridgeMenuButtonTapEventRequest taxWebBridgeMenuButtonTapEventRequest) {
                super(null);
                taxWebBridgeMenuButtonTapEventRequest.getClass();
                this.value = taxWebBridgeMenuButtonTapEventRequest;
            }

            public static /* synthetic */ MenuButtonTapEventRequest copy$default(MenuButtonTapEventRequest menuButtonTapEventRequest, TaxWebBridgeMenuButtonTapEventRequest taxWebBridgeMenuButtonTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeMenuButtonTapEventRequest = menuButtonTapEventRequest.value;
                }
                return menuButtonTapEventRequest.copy(taxWebBridgeMenuButtonTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeMenuButtonTapEventRequest getValue() {
                return this.value;
            }

            public final MenuButtonTapEventRequest copy(TaxWebBridgeMenuButtonTapEventRequest value) {
                value.getClass();
                return new MenuButtonTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MenuButtonTapEventRequest) && Intrinsics.areEqual(this.value, ((MenuButtonTapEventRequest) other).value);
            }

            public final TaxWebBridgeMenuButtonTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MenuButtonTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeMenuItemTapEventRequest#ADAPTER", declaredName = "menu_item_tap_event_request", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$MenuItemTapEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuItemTapEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuItemTapEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuItemTapEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MenuItemTapEventRequest extends Request {
            private final TaxWebBridgeMenuItemTapEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MenuItemTapEventRequest(TaxWebBridgeMenuItemTapEventRequest taxWebBridgeMenuItemTapEventRequest) {
                super(null);
                taxWebBridgeMenuItemTapEventRequest.getClass();
                this.value = taxWebBridgeMenuItemTapEventRequest;
            }

            public static /* synthetic */ MenuItemTapEventRequest copy$default(MenuItemTapEventRequest menuItemTapEventRequest, TaxWebBridgeMenuItemTapEventRequest taxWebBridgeMenuItemTapEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeMenuItemTapEventRequest = menuItemTapEventRequest.value;
                }
                return menuItemTapEventRequest.copy(taxWebBridgeMenuItemTapEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeMenuItemTapEventRequest getValue() {
                return this.value;
            }

            public final MenuItemTapEventRequest copy(TaxWebBridgeMenuItemTapEventRequest value) {
                value.getClass();
                return new MenuItemTapEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MenuItemTapEventRequest) && Intrinsics.areEqual(this.value, ((MenuItemTapEventRequest) other).value);
            }

            public final TaxWebBridgeMenuItemTapEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MenuItemTapEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventRequest#ADAPTER", declaredName = "native_deep_link_event_request", tag = 12)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$NativeDeepLinkEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NativeDeepLinkEventRequest extends Request {
            private final TaxWebBridgeNativeDeepLinkEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NativeDeepLinkEventRequest(TaxWebBridgeNativeDeepLinkEventRequest taxWebBridgeNativeDeepLinkEventRequest) {
                super(null);
                taxWebBridgeNativeDeepLinkEventRequest.getClass();
                this.value = taxWebBridgeNativeDeepLinkEventRequest;
            }

            public static /* synthetic */ NativeDeepLinkEventRequest copy$default(NativeDeepLinkEventRequest nativeDeepLinkEventRequest, TaxWebBridgeNativeDeepLinkEventRequest taxWebBridgeNativeDeepLinkEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeNativeDeepLinkEventRequest = nativeDeepLinkEventRequest.value;
                }
                return nativeDeepLinkEventRequest.copy(taxWebBridgeNativeDeepLinkEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeNativeDeepLinkEventRequest getValue() {
                return this.value;
            }

            public final NativeDeepLinkEventRequest copy(TaxWebBridgeNativeDeepLinkEventRequest value) {
                value.getClass();
                return new NativeDeepLinkEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NativeDeepLinkEventRequest) && Intrinsics.areEqual(this.value, ((NativeDeepLinkEventRequest) other).value);
            }

            public final TaxWebBridgeNativeDeepLinkEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NativeDeepLinkEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeOpenTaxEventRequest#ADAPTER", declaredName = "open_tax_event_request", tag = 8)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$OpenTaxEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeOpenTaxEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeOpenTaxEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeOpenTaxEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OpenTaxEventRequest extends Request {
            private final TaxWebBridgeOpenTaxEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenTaxEventRequest(TaxWebBridgeOpenTaxEventRequest taxWebBridgeOpenTaxEventRequest) {
                super(null);
                taxWebBridgeOpenTaxEventRequest.getClass();
                this.value = taxWebBridgeOpenTaxEventRequest;
            }

            public static /* synthetic */ OpenTaxEventRequest copy$default(OpenTaxEventRequest openTaxEventRequest, TaxWebBridgeOpenTaxEventRequest taxWebBridgeOpenTaxEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeOpenTaxEventRequest = openTaxEventRequest.value;
                }
                return openTaxEventRequest.copy(taxWebBridgeOpenTaxEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeOpenTaxEventRequest getValue() {
                return this.value;
            }

            public final OpenTaxEventRequest copy(TaxWebBridgeOpenTaxEventRequest value) {
                value.getClass();
                return new OpenTaxEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenTaxEventRequest) && Intrinsics.areEqual(this.value, ((OpenTaxEventRequest) other).value);
            }

            public final TaxWebBridgeOpenTaxEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpenTaxEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeShowDialogEventRequest#ADAPTER", declaredName = "show_dialog_event_request", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$ShowDialogEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeShowDialogEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeShowDialogEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeShowDialogEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowDialogEventRequest extends Request {
            private final TaxWebBridgeShowDialogEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowDialogEventRequest(TaxWebBridgeShowDialogEventRequest taxWebBridgeShowDialogEventRequest) {
                super(null);
                taxWebBridgeShowDialogEventRequest.getClass();
                this.value = taxWebBridgeShowDialogEventRequest;
            }

            public static /* synthetic */ ShowDialogEventRequest copy$default(ShowDialogEventRequest showDialogEventRequest, TaxWebBridgeShowDialogEventRequest taxWebBridgeShowDialogEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeShowDialogEventRequest = showDialogEventRequest.value;
                }
                return showDialogEventRequest.copy(taxWebBridgeShowDialogEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeShowDialogEventRequest getValue() {
                return this.value;
            }

            public final ShowDialogEventRequest copy(TaxWebBridgeShowDialogEventRequest value) {
                value.getClass();
                return new ShowDialogEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowDialogEventRequest) && Intrinsics.areEqual(this.value, ((ShowDialogEventRequest) other).value);
            }

            public final TaxWebBridgeShowDialogEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowDialogEventRequest(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeWebClientReadyEventRequest#ADAPTER", declaredName = "web_client_ready_event_request", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request$WebClientReadyEventRequest;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest$Request;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeWebClientReadyEventRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeWebClientReadyEventRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeWebClientReadyEventRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class WebClientReadyEventRequest extends Request {
            private final TaxWebBridgeWebClientReadyEventRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebClientReadyEventRequest(TaxWebBridgeWebClientReadyEventRequest taxWebBridgeWebClientReadyEventRequest) {
                super(null);
                taxWebBridgeWebClientReadyEventRequest.getClass();
                this.value = taxWebBridgeWebClientReadyEventRequest;
            }

            public static /* synthetic */ WebClientReadyEventRequest copy$default(WebClientReadyEventRequest webClientReadyEventRequest, TaxWebBridgeWebClientReadyEventRequest taxWebBridgeWebClientReadyEventRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeWebClientReadyEventRequest = webClientReadyEventRequest.value;
                }
                return webClientReadyEventRequest.copy(taxWebBridgeWebClientReadyEventRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeWebClientReadyEventRequest getValue() {
                return this.value;
            }

            public final WebClientReadyEventRequest copy(TaxWebBridgeWebClientReadyEventRequest value) {
                value.getClass();
                return new WebClientReadyEventRequest(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WebClientReadyEventRequest) && Intrinsics.areEqual(this.value, ((WebClientReadyEventRequest) other).value);
            }

            public final TaxWebBridgeWebClientReadyEventRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "WebClientReadyEventRequest(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Request(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Request() {
        }
    }
}
