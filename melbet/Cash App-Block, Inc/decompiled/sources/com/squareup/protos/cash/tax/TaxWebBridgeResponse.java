package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.squareup.protos.cash.tax.TaxWebBridgeResponse;
import com.squareup.protos.cash.web.bridge.WebBridgeHandoverBlockerResponsePayloadEventResponse;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\u000b\t\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Status;", "status", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Status;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "response", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "Companion", "Builder", "Response", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxWebBridgeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxWebBridgeResponse> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Response response;

    @WireField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeResponse$Status#ADAPTER", schemaIndex = 0, tag = 1)
    public final Status status;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;", "<init>", "()V", "status", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Status;", "response", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Response response;
        public Status status;

        @Override // com.squareup.wire.Message.Builder
        public TaxWebBridgeResponse build() {
            return new TaxWebBridgeResponse(this.status, this.response, buildUnknownFields());
        }

        public final Builder response(Response response) {
            this.response = response;
            return this;
        }

        public final Builder status(Status status) {
            this.status = status;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxWebBridgeResponse.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeResponse decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                TaxWebBridgeResponse.Response response = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TaxWebBridgeResponse((TaxWebBridgeResponse.Status) obj, response, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                obj = TaxWebBridgeResponse.Status.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            response = new TaxWebBridgeResponse.Response.ExitEventResponse((TaxWebBridgeExitEventResponse) TaxWebBridgeExitEventResponse.ADAPTER.decode(reader));
                            break;
                        case 3:
                            response = new TaxWebBridgeResponse.Response.MenuButtonTapEventResponse((TaxWebBridgeMenuButtonTapEventResponse) TaxWebBridgeMenuButtonTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 4:
                            response = new TaxWebBridgeResponse.Response.MenuItemTapEventResponse((TaxWebBridgeMenuItemTapEventResponse) TaxWebBridgeMenuItemTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 5:
                            response = new TaxWebBridgeResponse.Response.ShowDialogEventResponse((TaxWebBridgeShowDialogEventResponse) TaxWebBridgeShowDialogEventResponse.ADAPTER.decode(reader));
                            break;
                        case 6:
                            response = new TaxWebBridgeResponse.Response.DialogButtonTapEventResponse((TaxWebBridgeDialogButtonTapEventResponse) TaxWebBridgeDialogButtonTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 7:
                            response = new TaxWebBridgeResponse.Response.WebClientReadyEventResponse((TaxWebBridgeWebClientReadyEventResponse) TaxWebBridgeWebClientReadyEventResponse.ADAPTER.decode(reader));
                            break;
                        case 8:
                            response = new TaxWebBridgeResponse.Response.BackButtonTapEventResponse((TaxWebBridgeBackButtonTapEventResponse) TaxWebBridgeBackButtonTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 9:
                            response = new TaxWebBridgeResponse.Response.OpenTaxEventResponse((TaxWebBridgeOpenTaxEventResponse) TaxWebBridgeOpenTaxEventResponse.ADAPTER.decode(reader));
                            break;
                        case 10:
                            response = new TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse((TaxWebBridgeConfigureToolbarEventResponse) TaxWebBridgeConfigureToolbarEventResponse.ADAPTER.decode(reader));
                            break;
                        case 11:
                            response = new TaxWebBridgeResponse.Response.CloseButtonTapEventResponse((TaxWebBridgeCloseButtonTapEventResponse) TaxWebBridgeCloseButtonTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 12:
                            response = new TaxWebBridgeResponse.Response.HelpButtonTapEventResponse((TaxWebBridgeHelpButtonTapEventResponse) TaxWebBridgeHelpButtonTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 13:
                            response = new TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse((TaxWebBridgeNativeDeepLinkEventResponse) TaxWebBridgeNativeDeepLinkEventResponse.ADAPTER.decode(reader));
                            break;
                        case 14:
                            response = new TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse((TaxWebBridgeDesktopButtonTapEventResponse) TaxWebBridgeDesktopButtonTapEventResponse.ADAPTER.decode(reader));
                            break;
                        case 15:
                            response = new TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse((WebBridgeHandoverBlockerResponsePayloadEventResponse) WebBridgeHandoverBlockerResponsePayloadEventResponse.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxWebBridgeResponse value) {
                writer.getClass();
                value.getClass();
                TaxWebBridgeResponse.Status.ADAPTER.encodeWithTag(writer, 1, value.status);
                TaxWebBridgeResponse.Response response = value.response;
                if (response instanceof TaxWebBridgeResponse.Response.ExitEventResponse) {
                    TaxWebBridgeExitEventResponse.ADAPTER.encodeWithTag(writer, 2, ((TaxWebBridgeResponse.Response.ExitEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) {
                    TaxWebBridgeMenuButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 3, ((TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.MenuItemTapEventResponse) {
                    TaxWebBridgeMenuItemTapEventResponse.ADAPTER.encodeWithTag(writer, 4, ((TaxWebBridgeResponse.Response.MenuItemTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.ShowDialogEventResponse) {
                    TaxWebBridgeShowDialogEventResponse.ADAPTER.encodeWithTag(writer, 5, ((TaxWebBridgeResponse.Response.ShowDialogEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.DialogButtonTapEventResponse) {
                    TaxWebBridgeDialogButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 6, ((TaxWebBridgeResponse.Response.DialogButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.WebClientReadyEventResponse) {
                    TaxWebBridgeWebClientReadyEventResponse.ADAPTER.encodeWithTag(writer, 7, ((TaxWebBridgeResponse.Response.WebClientReadyEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.BackButtonTapEventResponse) {
                    TaxWebBridgeBackButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 8, ((TaxWebBridgeResponse.Response.BackButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.OpenTaxEventResponse) {
                    TaxWebBridgeOpenTaxEventResponse.ADAPTER.encodeWithTag(writer, 9, ((TaxWebBridgeResponse.Response.OpenTaxEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse) {
                    TaxWebBridgeConfigureToolbarEventResponse.ADAPTER.encodeWithTag(writer, 10, ((TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.CloseButtonTapEventResponse) {
                    TaxWebBridgeCloseButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 11, ((TaxWebBridgeResponse.Response.CloseButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.HelpButtonTapEventResponse) {
                    TaxWebBridgeHelpButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 12, ((TaxWebBridgeResponse.Response.HelpButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse) {
                    TaxWebBridgeNativeDeepLinkEventResponse.ADAPTER.encodeWithTag(writer, 13, ((TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse) {
                    TaxWebBridgeDesktopButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 14, ((TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse) {
                    WebBridgeHandoverBlockerResponsePayloadEventResponse.ADAPTER.encodeWithTag(writer, 15, ((TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse) response).getValue());
                } else if (response != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxWebBridgeResponse value) {
                value.getClass();
                int encodedSizeWithTag = TaxWebBridgeResponse.Status.ADAPTER.encodedSizeWithTag(1, value.status) + value.unknownFields().getSize$okio();
                TaxWebBridgeResponse.Response response = value.response;
                if (response instanceof TaxWebBridgeResponse.Response.ExitEventResponse) {
                    return TaxWebBridgeExitEventResponse.ADAPTER.encodedSizeWithTag(2, ((TaxWebBridgeResponse.Response.ExitEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) {
                    return TaxWebBridgeMenuButtonTapEventResponse.ADAPTER.encodedSizeWithTag(3, ((TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.MenuItemTapEventResponse) {
                    return TaxWebBridgeMenuItemTapEventResponse.ADAPTER.encodedSizeWithTag(4, ((TaxWebBridgeResponse.Response.MenuItemTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.ShowDialogEventResponse) {
                    return TaxWebBridgeShowDialogEventResponse.ADAPTER.encodedSizeWithTag(5, ((TaxWebBridgeResponse.Response.ShowDialogEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.DialogButtonTapEventResponse) {
                    return TaxWebBridgeDialogButtonTapEventResponse.ADAPTER.encodedSizeWithTag(6, ((TaxWebBridgeResponse.Response.DialogButtonTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.WebClientReadyEventResponse) {
                    return TaxWebBridgeWebClientReadyEventResponse.ADAPTER.encodedSizeWithTag(7, ((TaxWebBridgeResponse.Response.WebClientReadyEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.BackButtonTapEventResponse) {
                    return TaxWebBridgeBackButtonTapEventResponse.ADAPTER.encodedSizeWithTag(8, ((TaxWebBridgeResponse.Response.BackButtonTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.OpenTaxEventResponse) {
                    return TaxWebBridgeOpenTaxEventResponse.ADAPTER.encodedSizeWithTag(9, ((TaxWebBridgeResponse.Response.OpenTaxEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse) {
                    return TaxWebBridgeConfigureToolbarEventResponse.ADAPTER.encodedSizeWithTag(10, ((TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.CloseButtonTapEventResponse) {
                    return TaxWebBridgeCloseButtonTapEventResponse.ADAPTER.encodedSizeWithTag(11, ((TaxWebBridgeResponse.Response.CloseButtonTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.HelpButtonTapEventResponse) {
                    return TaxWebBridgeHelpButtonTapEventResponse.ADAPTER.encodedSizeWithTag(12, ((TaxWebBridgeResponse.Response.HelpButtonTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse) {
                    return TaxWebBridgeNativeDeepLinkEventResponse.ADAPTER.encodedSizeWithTag(13, ((TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse) {
                    return TaxWebBridgeDesktopButtonTapEventResponse.ADAPTER.encodedSizeWithTag(14, ((TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response instanceof TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse) {
                    return WebBridgeHandoverBlockerResponsePayloadEventResponse.ADAPTER.encodedSizeWithTag(15, ((TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse) response).getValue()) + encodedSizeWithTag;
                }
                if (response == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeResponse redact(TaxWebBridgeResponse value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                TaxWebBridgeResponse.Status status = value.status;
                TaxWebBridgeResponse.Response response = value.response;
                value.getClass();
                byteString.getClass();
                return new TaxWebBridgeResponse(status, response, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxWebBridgeResponse value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TaxWebBridgeResponse.Response response = value.response;
                if (response instanceof TaxWebBridgeResponse.Response.ExitEventResponse) {
                    TaxWebBridgeExitEventResponse.ADAPTER.encodeWithTag(writer, 2, ((TaxWebBridgeResponse.Response.ExitEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) {
                    TaxWebBridgeMenuButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 3, ((TaxWebBridgeResponse.Response.MenuButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.MenuItemTapEventResponse) {
                    TaxWebBridgeMenuItemTapEventResponse.ADAPTER.encodeWithTag(writer, 4, ((TaxWebBridgeResponse.Response.MenuItemTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.ShowDialogEventResponse) {
                    TaxWebBridgeShowDialogEventResponse.ADAPTER.encodeWithTag(writer, 5, ((TaxWebBridgeResponse.Response.ShowDialogEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.DialogButtonTapEventResponse) {
                    TaxWebBridgeDialogButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 6, ((TaxWebBridgeResponse.Response.DialogButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.WebClientReadyEventResponse) {
                    TaxWebBridgeWebClientReadyEventResponse.ADAPTER.encodeWithTag(writer, 7, ((TaxWebBridgeResponse.Response.WebClientReadyEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.BackButtonTapEventResponse) {
                    TaxWebBridgeBackButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 8, ((TaxWebBridgeResponse.Response.BackButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.OpenTaxEventResponse) {
                    TaxWebBridgeOpenTaxEventResponse.ADAPTER.encodeWithTag(writer, 9, ((TaxWebBridgeResponse.Response.OpenTaxEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse) {
                    TaxWebBridgeConfigureToolbarEventResponse.ADAPTER.encodeWithTag(writer, 10, ((TaxWebBridgeResponse.Response.ConfigureToolbarEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.CloseButtonTapEventResponse) {
                    TaxWebBridgeCloseButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 11, ((TaxWebBridgeResponse.Response.CloseButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.HelpButtonTapEventResponse) {
                    TaxWebBridgeHelpButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 12, ((TaxWebBridgeResponse.Response.HelpButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse) {
                    TaxWebBridgeNativeDeepLinkEventResponse.ADAPTER.encodeWithTag(writer, 13, ((TaxWebBridgeResponse.Response.NativeDeepLinkEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse) {
                    TaxWebBridgeDesktopButtonTapEventResponse.ADAPTER.encodeWithTag(writer, 14, ((TaxWebBridgeResponse.Response.DesktopButtonTapEventResponse) response).getValue());
                } else if (response instanceof TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse) {
                    WebBridgeHandoverBlockerResponsePayloadEventResponse.ADAPTER.encodeWithTag(writer, 15, ((TaxWebBridgeResponse.Response.HandoverBlockerPayloadEventResponse) response).getValue());
                } else if (response != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                TaxWebBridgeResponse.Status.ADAPTER.encodeWithTag(writer, 1, value.status);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeResponse(Status status, Response response, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.response = response;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxWebBridgeResponse)) {
            return false;
        }
        TaxWebBridgeResponse taxWebBridgeResponse = (TaxWebBridgeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), taxWebBridgeResponse.unknownFields()) && this.status == taxWebBridgeResponse.status && Intrinsics.areEqual(this.response, taxWebBridgeResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Response response = this.response;
        int hashCode3 = hashCode2 + (response != null ? response.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.response = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Response response = this.response;
        if (response != null) {
            arrayList.add("response=" + response);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxWebBridgeResponse{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "INVALID_REQUEST", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Status implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Status SUCCESS = new Status("SUCCESS", 0, 1);
        public static final Status INVALID_REQUEST = new Status("INVALID_REQUEST", 1, 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, INVALID_REQUEST};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Status.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeResponse$Status$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TaxWebBridgeResponse.Status fromValue(int value) {
                    return TaxWebBridgeResponse.Status.INSTANCE.fromValue(value);
                }
            };
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Status fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Status;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromValue(int value) {
                if (value == 1) {
                    return Status.SUCCESS;
                }
                if (value != 2) {
                    return null;
                }
                return Status.INVALID_REQUEST;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TaxWebBridgeResponse build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "", "<init>", "()V", "ExitEventResponse", "MenuButtonTapEventResponse", "MenuItemTapEventResponse", "ShowDialogEventResponse", "DialogButtonTapEventResponse", "WebClientReadyEventResponse", "BackButtonTapEventResponse", "OpenTaxEventResponse", "ConfigureToolbarEventResponse", "CloseButtonTapEventResponse", "HelpButtonTapEventResponse", "NativeDeepLinkEventResponse", "DesktopButtonTapEventResponse", "HandoverBlockerPayloadEventResponse", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$BackButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$CloseButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$ConfigureToolbarEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$DesktopButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$DialogButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$ExitEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$HandoverBlockerPayloadEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$HelpButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$MenuButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$MenuItemTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$NativeDeepLinkEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$OpenTaxEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$ShowDialogEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$WebClientReadyEventResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Response {

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeBackButtonTapEventResponse#ADAPTER", declaredName = "back_button_tap_event_response", tag = 8)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$BackButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeBackButtonTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeBackButtonTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeBackButtonTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BackButtonTapEventResponse extends Response {
            private final TaxWebBridgeBackButtonTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackButtonTapEventResponse(TaxWebBridgeBackButtonTapEventResponse taxWebBridgeBackButtonTapEventResponse) {
                super(null);
                taxWebBridgeBackButtonTapEventResponse.getClass();
                this.value = taxWebBridgeBackButtonTapEventResponse;
            }

            public static /* synthetic */ BackButtonTapEventResponse copy$default(BackButtonTapEventResponse backButtonTapEventResponse, TaxWebBridgeBackButtonTapEventResponse taxWebBridgeBackButtonTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeBackButtonTapEventResponse = backButtonTapEventResponse.value;
                }
                return backButtonTapEventResponse.copy(taxWebBridgeBackButtonTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeBackButtonTapEventResponse getValue() {
                return this.value;
            }

            public final BackButtonTapEventResponse copy(TaxWebBridgeBackButtonTapEventResponse value) {
                value.getClass();
                return new BackButtonTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BackButtonTapEventResponse) && Intrinsics.areEqual(this.value, ((BackButtonTapEventResponse) other).value);
            }

            public final TaxWebBridgeBackButtonTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BackButtonTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeCloseButtonTapEventResponse#ADAPTER", declaredName = "close_button_tap_event_response", tag = 11)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$CloseButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeCloseButtonTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeCloseButtonTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeCloseButtonTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CloseButtonTapEventResponse extends Response {
            private final TaxWebBridgeCloseButtonTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CloseButtonTapEventResponse(TaxWebBridgeCloseButtonTapEventResponse taxWebBridgeCloseButtonTapEventResponse) {
                super(null);
                taxWebBridgeCloseButtonTapEventResponse.getClass();
                this.value = taxWebBridgeCloseButtonTapEventResponse;
            }

            public static /* synthetic */ CloseButtonTapEventResponse copy$default(CloseButtonTapEventResponse closeButtonTapEventResponse, TaxWebBridgeCloseButtonTapEventResponse taxWebBridgeCloseButtonTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeCloseButtonTapEventResponse = closeButtonTapEventResponse.value;
                }
                return closeButtonTapEventResponse.copy(taxWebBridgeCloseButtonTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeCloseButtonTapEventResponse getValue() {
                return this.value;
            }

            public final CloseButtonTapEventResponse copy(TaxWebBridgeCloseButtonTapEventResponse value) {
                value.getClass();
                return new CloseButtonTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CloseButtonTapEventResponse) && Intrinsics.areEqual(this.value, ((CloseButtonTapEventResponse) other).value);
            }

            public final TaxWebBridgeCloseButtonTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CloseButtonTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventResponse#ADAPTER", declaredName = "configure_toolbar_event_response", tag = 10)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$ConfigureToolbarEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfigureToolbarEventResponse extends Response {
            private final TaxWebBridgeConfigureToolbarEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureToolbarEventResponse(TaxWebBridgeConfigureToolbarEventResponse taxWebBridgeConfigureToolbarEventResponse) {
                super(null);
                taxWebBridgeConfigureToolbarEventResponse.getClass();
                this.value = taxWebBridgeConfigureToolbarEventResponse;
            }

            public static /* synthetic */ ConfigureToolbarEventResponse copy$default(ConfigureToolbarEventResponse configureToolbarEventResponse, TaxWebBridgeConfigureToolbarEventResponse taxWebBridgeConfigureToolbarEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeConfigureToolbarEventResponse = configureToolbarEventResponse.value;
                }
                return configureToolbarEventResponse.copy(taxWebBridgeConfigureToolbarEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeConfigureToolbarEventResponse getValue() {
                return this.value;
            }

            public final ConfigureToolbarEventResponse copy(TaxWebBridgeConfigureToolbarEventResponse value) {
                value.getClass();
                return new ConfigureToolbarEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfigureToolbarEventResponse) && Intrinsics.areEqual(this.value, ((ConfigureToolbarEventResponse) other).value);
            }

            public final TaxWebBridgeConfigureToolbarEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ConfigureToolbarEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeDesktopButtonTapEventResponse#ADAPTER", declaredName = "desktop_button_tap_event_response", tag = 14)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$DesktopButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeDesktopButtonTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeDesktopButtonTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeDesktopButtonTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DesktopButtonTapEventResponse extends Response {
            private final TaxWebBridgeDesktopButtonTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DesktopButtonTapEventResponse(TaxWebBridgeDesktopButtonTapEventResponse taxWebBridgeDesktopButtonTapEventResponse) {
                super(null);
                taxWebBridgeDesktopButtonTapEventResponse.getClass();
                this.value = taxWebBridgeDesktopButtonTapEventResponse;
            }

            public static /* synthetic */ DesktopButtonTapEventResponse copy$default(DesktopButtonTapEventResponse desktopButtonTapEventResponse, TaxWebBridgeDesktopButtonTapEventResponse taxWebBridgeDesktopButtonTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeDesktopButtonTapEventResponse = desktopButtonTapEventResponse.value;
                }
                return desktopButtonTapEventResponse.copy(taxWebBridgeDesktopButtonTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeDesktopButtonTapEventResponse getValue() {
                return this.value;
            }

            public final DesktopButtonTapEventResponse copy(TaxWebBridgeDesktopButtonTapEventResponse value) {
                value.getClass();
                return new DesktopButtonTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DesktopButtonTapEventResponse) && Intrinsics.areEqual(this.value, ((DesktopButtonTapEventResponse) other).value);
            }

            public final TaxWebBridgeDesktopButtonTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DesktopButtonTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeDialogButtonTapEventResponse#ADAPTER", declaredName = "dialog_button_tap_event_response", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$DialogButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeDialogButtonTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeDialogButtonTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeDialogButtonTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DialogButtonTapEventResponse extends Response {
            private final TaxWebBridgeDialogButtonTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DialogButtonTapEventResponse(TaxWebBridgeDialogButtonTapEventResponse taxWebBridgeDialogButtonTapEventResponse) {
                super(null);
                taxWebBridgeDialogButtonTapEventResponse.getClass();
                this.value = taxWebBridgeDialogButtonTapEventResponse;
            }

            public static /* synthetic */ DialogButtonTapEventResponse copy$default(DialogButtonTapEventResponse dialogButtonTapEventResponse, TaxWebBridgeDialogButtonTapEventResponse taxWebBridgeDialogButtonTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeDialogButtonTapEventResponse = dialogButtonTapEventResponse.value;
                }
                return dialogButtonTapEventResponse.copy(taxWebBridgeDialogButtonTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeDialogButtonTapEventResponse getValue() {
                return this.value;
            }

            public final DialogButtonTapEventResponse copy(TaxWebBridgeDialogButtonTapEventResponse value) {
                value.getClass();
                return new DialogButtonTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DialogButtonTapEventResponse) && Intrinsics.areEqual(this.value, ((DialogButtonTapEventResponse) other).value);
            }

            public final TaxWebBridgeDialogButtonTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DialogButtonTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeExitEventResponse#ADAPTER", declaredName = "exit_event_response", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$ExitEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeExitEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeExitEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeExitEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ExitEventResponse extends Response {
            private final TaxWebBridgeExitEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExitEventResponse(TaxWebBridgeExitEventResponse taxWebBridgeExitEventResponse) {
                super(null);
                taxWebBridgeExitEventResponse.getClass();
                this.value = taxWebBridgeExitEventResponse;
            }

            public static /* synthetic */ ExitEventResponse copy$default(ExitEventResponse exitEventResponse, TaxWebBridgeExitEventResponse taxWebBridgeExitEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeExitEventResponse = exitEventResponse.value;
                }
                return exitEventResponse.copy(taxWebBridgeExitEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeExitEventResponse getValue() {
                return this.value;
            }

            public final ExitEventResponse copy(TaxWebBridgeExitEventResponse value) {
                value.getClass();
                return new ExitEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExitEventResponse) && Intrinsics.areEqual(this.value, ((ExitEventResponse) other).value);
            }

            public final TaxWebBridgeExitEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ExitEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.web.bridge.WebBridgeHandoverBlockerResponsePayloadEventResponse#ADAPTER", declaredName = "handover_blocker_payload_event_response", tag = 15)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$HandoverBlockerPayloadEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/web/bridge/WebBridgeHandoverBlockerResponsePayloadEventResponse;", "<init>", "(Lcom/squareup/protos/cash/web/bridge/WebBridgeHandoverBlockerResponsePayloadEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/web/bridge/WebBridgeHandoverBlockerResponsePayloadEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandoverBlockerPayloadEventResponse extends Response {
            private final WebBridgeHandoverBlockerResponsePayloadEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandoverBlockerPayloadEventResponse(WebBridgeHandoverBlockerResponsePayloadEventResponse webBridgeHandoverBlockerResponsePayloadEventResponse) {
                super(null);
                webBridgeHandoverBlockerResponsePayloadEventResponse.getClass();
                this.value = webBridgeHandoverBlockerResponsePayloadEventResponse;
            }

            public static /* synthetic */ HandoverBlockerPayloadEventResponse copy$default(HandoverBlockerPayloadEventResponse handoverBlockerPayloadEventResponse, WebBridgeHandoverBlockerResponsePayloadEventResponse webBridgeHandoverBlockerResponsePayloadEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    webBridgeHandoverBlockerResponsePayloadEventResponse = handoverBlockerPayloadEventResponse.value;
                }
                return handoverBlockerPayloadEventResponse.copy(webBridgeHandoverBlockerResponsePayloadEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final WebBridgeHandoverBlockerResponsePayloadEventResponse getValue() {
                return this.value;
            }

            public final HandoverBlockerPayloadEventResponse copy(WebBridgeHandoverBlockerResponsePayloadEventResponse value) {
                value.getClass();
                return new HandoverBlockerPayloadEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandoverBlockerPayloadEventResponse) && Intrinsics.areEqual(this.value, ((HandoverBlockerPayloadEventResponse) other).value);
            }

            public final WebBridgeHandoverBlockerResponsePayloadEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "HandoverBlockerPayloadEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeHelpButtonTapEventResponse#ADAPTER", declaredName = "help_button_tap_event_response", tag = 12)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$HelpButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeHelpButtonTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeHelpButtonTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeHelpButtonTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HelpButtonTapEventResponse extends Response {
            private final TaxWebBridgeHelpButtonTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HelpButtonTapEventResponse(TaxWebBridgeHelpButtonTapEventResponse taxWebBridgeHelpButtonTapEventResponse) {
                super(null);
                taxWebBridgeHelpButtonTapEventResponse.getClass();
                this.value = taxWebBridgeHelpButtonTapEventResponse;
            }

            public static /* synthetic */ HelpButtonTapEventResponse copy$default(HelpButtonTapEventResponse helpButtonTapEventResponse, TaxWebBridgeHelpButtonTapEventResponse taxWebBridgeHelpButtonTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeHelpButtonTapEventResponse = helpButtonTapEventResponse.value;
                }
                return helpButtonTapEventResponse.copy(taxWebBridgeHelpButtonTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeHelpButtonTapEventResponse getValue() {
                return this.value;
            }

            public final HelpButtonTapEventResponse copy(TaxWebBridgeHelpButtonTapEventResponse value) {
                value.getClass();
                return new HelpButtonTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HelpButtonTapEventResponse) && Intrinsics.areEqual(this.value, ((HelpButtonTapEventResponse) other).value);
            }

            public final TaxWebBridgeHelpButtonTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "HelpButtonTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeMenuButtonTapEventResponse#ADAPTER", declaredName = "menu_button_tap_event_response", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$MenuButtonTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuButtonTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuButtonTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuButtonTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MenuButtonTapEventResponse extends Response {
            private final TaxWebBridgeMenuButtonTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MenuButtonTapEventResponse(TaxWebBridgeMenuButtonTapEventResponse taxWebBridgeMenuButtonTapEventResponse) {
                super(null);
                taxWebBridgeMenuButtonTapEventResponse.getClass();
                this.value = taxWebBridgeMenuButtonTapEventResponse;
            }

            public static /* synthetic */ MenuButtonTapEventResponse copy$default(MenuButtonTapEventResponse menuButtonTapEventResponse, TaxWebBridgeMenuButtonTapEventResponse taxWebBridgeMenuButtonTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeMenuButtonTapEventResponse = menuButtonTapEventResponse.value;
                }
                return menuButtonTapEventResponse.copy(taxWebBridgeMenuButtonTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeMenuButtonTapEventResponse getValue() {
                return this.value;
            }

            public final MenuButtonTapEventResponse copy(TaxWebBridgeMenuButtonTapEventResponse value) {
                value.getClass();
                return new MenuButtonTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MenuButtonTapEventResponse) && Intrinsics.areEqual(this.value, ((MenuButtonTapEventResponse) other).value);
            }

            public final TaxWebBridgeMenuButtonTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MenuButtonTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeMenuItemTapEventResponse#ADAPTER", declaredName = "menu_item_tap_event_response", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$MenuItemTapEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuItemTapEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuItemTapEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeMenuItemTapEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MenuItemTapEventResponse extends Response {
            private final TaxWebBridgeMenuItemTapEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MenuItemTapEventResponse(TaxWebBridgeMenuItemTapEventResponse taxWebBridgeMenuItemTapEventResponse) {
                super(null);
                taxWebBridgeMenuItemTapEventResponse.getClass();
                this.value = taxWebBridgeMenuItemTapEventResponse;
            }

            public static /* synthetic */ MenuItemTapEventResponse copy$default(MenuItemTapEventResponse menuItemTapEventResponse, TaxWebBridgeMenuItemTapEventResponse taxWebBridgeMenuItemTapEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeMenuItemTapEventResponse = menuItemTapEventResponse.value;
                }
                return menuItemTapEventResponse.copy(taxWebBridgeMenuItemTapEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeMenuItemTapEventResponse getValue() {
                return this.value;
            }

            public final MenuItemTapEventResponse copy(TaxWebBridgeMenuItemTapEventResponse value) {
                value.getClass();
                return new MenuItemTapEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MenuItemTapEventResponse) && Intrinsics.areEqual(this.value, ((MenuItemTapEventResponse) other).value);
            }

            public final TaxWebBridgeMenuItemTapEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MenuItemTapEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventResponse#ADAPTER", declaredName = "native_deep_link_event_response", tag = 13)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$NativeDeepLinkEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NativeDeepLinkEventResponse extends Response {
            private final TaxWebBridgeNativeDeepLinkEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NativeDeepLinkEventResponse(TaxWebBridgeNativeDeepLinkEventResponse taxWebBridgeNativeDeepLinkEventResponse) {
                super(null);
                taxWebBridgeNativeDeepLinkEventResponse.getClass();
                this.value = taxWebBridgeNativeDeepLinkEventResponse;
            }

            public static /* synthetic */ NativeDeepLinkEventResponse copy$default(NativeDeepLinkEventResponse nativeDeepLinkEventResponse, TaxWebBridgeNativeDeepLinkEventResponse taxWebBridgeNativeDeepLinkEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeNativeDeepLinkEventResponse = nativeDeepLinkEventResponse.value;
                }
                return nativeDeepLinkEventResponse.copy(taxWebBridgeNativeDeepLinkEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeNativeDeepLinkEventResponse getValue() {
                return this.value;
            }

            public final NativeDeepLinkEventResponse copy(TaxWebBridgeNativeDeepLinkEventResponse value) {
                value.getClass();
                return new NativeDeepLinkEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NativeDeepLinkEventResponse) && Intrinsics.areEqual(this.value, ((NativeDeepLinkEventResponse) other).value);
            }

            public final TaxWebBridgeNativeDeepLinkEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NativeDeepLinkEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeOpenTaxEventResponse#ADAPTER", declaredName = "open_tax_event_response", tag = 9)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$OpenTaxEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeOpenTaxEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeOpenTaxEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeOpenTaxEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OpenTaxEventResponse extends Response {
            private final TaxWebBridgeOpenTaxEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenTaxEventResponse(TaxWebBridgeOpenTaxEventResponse taxWebBridgeOpenTaxEventResponse) {
                super(null);
                taxWebBridgeOpenTaxEventResponse.getClass();
                this.value = taxWebBridgeOpenTaxEventResponse;
            }

            public static /* synthetic */ OpenTaxEventResponse copy$default(OpenTaxEventResponse openTaxEventResponse, TaxWebBridgeOpenTaxEventResponse taxWebBridgeOpenTaxEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeOpenTaxEventResponse = openTaxEventResponse.value;
                }
                return openTaxEventResponse.copy(taxWebBridgeOpenTaxEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeOpenTaxEventResponse getValue() {
                return this.value;
            }

            public final OpenTaxEventResponse copy(TaxWebBridgeOpenTaxEventResponse value) {
                value.getClass();
                return new OpenTaxEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenTaxEventResponse) && Intrinsics.areEqual(this.value, ((OpenTaxEventResponse) other).value);
            }

            public final TaxWebBridgeOpenTaxEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpenTaxEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeShowDialogEventResponse#ADAPTER", declaredName = "show_dialog_event_response", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$ShowDialogEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeShowDialogEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeShowDialogEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeShowDialogEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowDialogEventResponse extends Response {
            private final TaxWebBridgeShowDialogEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowDialogEventResponse(TaxWebBridgeShowDialogEventResponse taxWebBridgeShowDialogEventResponse) {
                super(null);
                taxWebBridgeShowDialogEventResponse.getClass();
                this.value = taxWebBridgeShowDialogEventResponse;
            }

            public static /* synthetic */ ShowDialogEventResponse copy$default(ShowDialogEventResponse showDialogEventResponse, TaxWebBridgeShowDialogEventResponse taxWebBridgeShowDialogEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeShowDialogEventResponse = showDialogEventResponse.value;
                }
                return showDialogEventResponse.copy(taxWebBridgeShowDialogEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeShowDialogEventResponse getValue() {
                return this.value;
            }

            public final ShowDialogEventResponse copy(TaxWebBridgeShowDialogEventResponse value) {
                value.getClass();
                return new ShowDialogEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowDialogEventResponse) && Intrinsics.areEqual(this.value, ((ShowDialogEventResponse) other).value);
            }

            public final TaxWebBridgeShowDialogEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowDialogEventResponse(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeWebClientReadyEventResponse#ADAPTER", declaredName = "web_client_ready_event_response", tag = 7)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response$WebClientReadyEventResponse;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse$Response;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeWebClientReadyEventResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeWebClientReadyEventResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeWebClientReadyEventResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class WebClientReadyEventResponse extends Response {
            private final TaxWebBridgeWebClientReadyEventResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebClientReadyEventResponse(TaxWebBridgeWebClientReadyEventResponse taxWebBridgeWebClientReadyEventResponse) {
                super(null);
                taxWebBridgeWebClientReadyEventResponse.getClass();
                this.value = taxWebBridgeWebClientReadyEventResponse;
            }

            public static /* synthetic */ WebClientReadyEventResponse copy$default(WebClientReadyEventResponse webClientReadyEventResponse, TaxWebBridgeWebClientReadyEventResponse taxWebBridgeWebClientReadyEventResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeWebClientReadyEventResponse = webClientReadyEventResponse.value;
                }
                return webClientReadyEventResponse.copy(taxWebBridgeWebClientReadyEventResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeWebClientReadyEventResponse getValue() {
                return this.value;
            }

            public final WebClientReadyEventResponse copy(TaxWebBridgeWebClientReadyEventResponse value) {
                value.getClass();
                return new WebClientReadyEventResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WebClientReadyEventResponse) && Intrinsics.areEqual(this.value, ((WebClientReadyEventResponse) other).value);
            }

            public final TaxWebBridgeWebClientReadyEventResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "WebClientReadyEventResponse(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Response() {
        }
    }
}
