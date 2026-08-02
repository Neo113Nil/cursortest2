package com.squareup.protos.franklin.common;

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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/SignalsContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/SignalsContext$Builder;", "", "phoneCallActive", "Ljava/lang/Boolean;", "screenCaptured", "", "Lcom/squareup/protos/franklin/common/TouchSignalEvent;", "touch_events", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignalsContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SignalsContext> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean phoneCallActive;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean screenCaptured;

    @WireField(adapter = "com.squareup.protos.franklin.common.TouchSignalEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<TouchSignalEvent> touch_events;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/common/SignalsContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/SignalsContext;", "<init>", "()V", "touch_events", "", "Lcom/squareup/protos/franklin/common/TouchSignalEvent;", "phoneCallActive", "", "Ljava/lang/Boolean;", "screenCaptured", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/SignalsContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public Boolean phoneCallActive;
        public Boolean screenCaptured;
        public List<TouchSignalEvent> touch_events = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public SignalsContext build() {
            return new SignalsContext(this.phoneCallActive, this.screenCaptured, this.touch_events, buildUnknownFields());
        }

        public final Builder phoneCallActive(Boolean phoneCallActive) {
            this.phoneCallActive = phoneCallActive;
            return this;
        }

        public final Builder screenCaptured(Boolean screenCaptured) {
            this.screenCaptured = screenCaptured;
            return this;
        }

        public final Builder touch_events(List<TouchSignalEvent> touch_events) {
            touch_events.getClass();
            TransactorKt.checkElementsNotNull(touch_events);
            this.touch_events = touch_events;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SignalsContext.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.SignalsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SignalsContext decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SignalsContext((Boolean) obj, (Boolean) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(TouchSignalEvent.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SignalsContext value) {
                writer.getClass();
                value.getClass();
                TouchSignalEvent.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.touch_events);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 2, value.phoneCallActive);
                protoAdapter2.encodeWithTag(writer, 3, value.screenCaptured);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SignalsContext value) {
                value.getClass();
                int encodedSizeWithTag = TouchSignalEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, value.touch_events) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(3, value.screenCaptured) + protoAdapter2.encodedSizeWithTag(2, value.phoneCallActive) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SignalsContext redact(SignalsContext value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.touch_events, TouchSignalEvent.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.phoneCallActive;
                Boolean bool2 = value.screenCaptured;
                byteString.getClass();
                return new SignalsContext(bool, bool2, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SignalsContext value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 3, value.screenCaptured);
                protoAdapter2.encodeWithTag(writer, 2, value.phoneCallActive);
                TouchSignalEvent.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.touch_events);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalsContext(Boolean bool, Boolean bool2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.phoneCallActive = bool;
        this.screenCaptured = bool2;
        this.touch_events = TransactorKt.immutableCopyOf("touch_events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignalsContext)) {
            return false;
        }
        SignalsContext signalsContext = (SignalsContext) obj;
        return Intrinsics.areEqual(unknownFields(), signalsContext.unknownFields()) && Intrinsics.areEqual(this.touch_events, signalsContext.touch_events) && Intrinsics.areEqual(this.phoneCallActive, signalsContext.phoneCallActive) && Intrinsics.areEqual(this.screenCaptured, signalsContext.screenCaptured);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.touch_events);
        Boolean bool = this.phoneCallActive;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.screenCaptured;
        int hashCode2 = hashCode + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.touch_events = this.touch_events;
        builder.phoneCallActive = this.phoneCallActive;
        builder.screenCaptured = this.screenCaptured;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.touch_events.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("touch_events=", arrayList, this.touch_events);
        }
        Boolean bool = this.phoneCallActive;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("phoneCallActive=", bool, arrayList);
        }
        Boolean bool2 = this.screenCaptured;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("screenCaptured=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignalsContext{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/SignalsContext$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/SignalsContext$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/SignalsContext;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/SignalsContext;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SignalsContext build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public SignalsContext(ArrayList arrayList, Boolean bool, Boolean bool2, int i) {
        this((i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 1) != 0 ? EmptyList.INSTANCE : arrayList, ByteString.EMPTY);
    }
}
