package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppIntroData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AppIntroData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppIntroData> CREATOR;
    public final String action_button_title;
    public final Region guessed_region;
    public final List screen_content;

    /* loaded from: classes8.dex */
    public enum Panel implements WireEnum {
        PANEL1(1),
        PANEL2(2),
        PANEL3(3),
        PANEL4(4);

        public final int value;
        public static final TransactionType.Companion Companion = new TransactionType.Companion();
        public static final AppIntroData$Panel$Companion$ADAPTER$1 ADAPTER = new AppIntroData$Panel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Panel.class), Syntax.PROTO_2, null);

        Panel(int i) {
            this.value = i;
        }

        public static final Panel fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PANEL1;
            }
            if (i == 2) {
                return PANEL2;
            }
            if (i == 3) {
                return PANEL3;
            }
            if (i != 4) {
                return null;
            }
            return PANEL4;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public final class ScreenContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ScreenContent> CREATOR;
        public final String content_id;
        public final String content_image_url;
        public final Panel panel;
        public final String title_text;

        static {
            AppIntroData$ScreenContent$Companion$ADAPTER$1 appIntroData$ScreenContent$Companion$ADAPTER$1 = new AppIntroData$ScreenContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScreenContent.class), "type.googleapis.com/squareup.franklin.app.AppIntroData.ScreenContent", Syntax.PROTO_2, null, "squareup/franklin/app/initiateSession.proto");
            ADAPTER = appIntroData$ScreenContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appIntroData$ScreenContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenContent(String str, Panel panel, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            panel.getClass();
            str2.getClass();
            str3.getClass();
            byteString.getClass();
            this.content_id = str;
            this.panel = panel;
            this.content_image_url = str2;
            this.title_text = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScreenContent)) {
                return false;
            }
            ScreenContent screenContent = (ScreenContent) obj;
            return Intrinsics.areEqual(unknownFields(), screenContent.unknownFields()) && Intrinsics.areEqual(this.content_id, screenContent.content_id) && this.panel == screenContent.panel && Intrinsics.areEqual(this.content_image_url, screenContent.content_image_url) && Intrinsics.areEqual(this.title_text, screenContent.title_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.title_text.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.panel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.content_id)) * 37, 37, this.content_image_url);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ColoredButton.Builder builder = new ColoredButton.Builder(12);
            builder.button_color = this.content_id;
            builder.text_color = this.panel;
            builder.text = this.content_image_url;
            builder.action = this.title_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.content_id, "content_id=", arrayList);
            arrayList.add("panel=" + this.panel);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.content_image_url, "content_image_url=", arrayList);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.title_text, "title_text=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenContent{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppIntroData.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.AppIntroData$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        break;
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        m.add(AppIntroData.ScreenContent.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = Region.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new AppIntroData(str, m, (Region) obj2, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "action_button_title");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AppIntroData appIntroData = (AppIntroData) obj;
                reverseProtoWriter.getClass();
                appIntroData.getClass();
                reverseProtoWriter.writeBytes(appIntroData.unknownFields());
                Region.ADAPTER.encodeWithTag(reverseProtoWriter, 3, appIntroData.guessed_region);
                AppIntroData.ScreenContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, appIntroData.screen_content);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, appIntroData.action_button_title);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AppIntroData appIntroData = (AppIntroData) obj;
                appIntroData.getClass();
                return Region.ADAPTER.encodedSizeWithTag(3, appIntroData.guessed_region) + AppIntroData.ScreenContent.ADAPTER.asRepeated().encodedSizeWithTag(2, appIntroData.screen_content) + ProtoAdapter.STRING.encodedSizeWithTag(1, appIntroData.action_button_title) + appIntroData.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AppIntroData appIntroData = (AppIntroData) obj;
                appIntroData.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(appIntroData.screen_content, AppIntroData.ScreenContent.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = appIntroData.action_button_title;
                Region region = appIntroData.guessed_region;
                str.getClass();
                byteString.getClass();
                return new AppIntroData(str, m1169redactElements, region, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AppIntroData appIntroData = (AppIntroData) obj;
                appIntroData.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appIntroData.action_button_title);
                AppIntroData.ScreenContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, appIntroData.screen_content);
                Region.ADAPTER.encodeWithTag(protoWriter, 3, appIntroData.guessed_region);
                protoWriter.writeBytes(appIntroData.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntroData(String str, List list, Region region, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        byteString.getClass();
        this.action_button_title = str;
        this.guessed_region = region;
        this.screen_content = TransactorKt.immutableCopyOf("screen_content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppIntroData)) {
            return false;
        }
        AppIntroData appIntroData = (AppIntroData) obj;
        return Intrinsics.areEqual(unknownFields(), appIntroData.unknownFields()) && Intrinsics.areEqual(this.action_button_title, appIntroData.action_button_title) && Intrinsics.areEqual(this.screen_content, appIntroData.screen_content) && this.guessed_region == appIntroData.guessed_region;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.action_button_title), 37, this.screen_content);
        Region region = this.guessed_region;
        int hashCode = m + (region != null ? region.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder();
        builder.canonical_text = this.action_button_title;
        builder.f1364type = this.screen_content;
        builder.formatted = this.guessed_region;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.action_button_title, "action_button_title=", arrayList);
        List list = this.screen_content;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("screen_content=", arrayList, list);
        }
        Region region = this.guessed_region;
        if (region != null) {
            arrayList.add("guessed_region=" + region);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppIntroData{", "}", 0, null, null, 56);
    }
}
