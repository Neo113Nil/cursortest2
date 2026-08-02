package com.squareup.protos.cash.appthemes;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AppThemeDefinitions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppThemeDefinitions> CREATOR;
    public final Map app_themes;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Map app_themes;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AppThemeDefinitions(this.app_themes, buildUnknownFields());
                case 1:
                    return new TagThemeDefinitions(this.app_themes, buildUnknownFields());
                default:
                    return new CardThemeDefinitions(this.app_themes, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppThemeDefinitions.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.appthemes.AppThemeDefinitions$Companion$ADAPTER$1
            public final Lazy app_themesAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.app_themesAdapter$delegate = LazyKt.lazy(new AlertBannerKt$$ExternalSyntheticLambda0(29));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AppThemeDefinitions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.putAll((Map) ((ProtoAdapter) this.app_themesAdapter$delegate.getValue()).decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AppThemeDefinitions appThemeDefinitions = (AppThemeDefinitions) obj;
                reverseProtoWriter.getClass();
                appThemeDefinitions.getClass();
                reverseProtoWriter.writeBytes(appThemeDefinitions.unknownFields());
                ((ProtoAdapter) this.app_themesAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 1, appThemeDefinitions.app_themes);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AppThemeDefinitions appThemeDefinitions = (AppThemeDefinitions) obj;
                appThemeDefinitions.getClass();
                return ((ProtoAdapter) this.app_themesAdapter$delegate.getValue()).encodedSizeWithTag(1, appThemeDefinitions.app_themes) + appThemeDefinitions.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AppThemeDefinitions appThemeDefinitions = (AppThemeDefinitions) obj;
                appThemeDefinitions.getClass();
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(appThemeDefinitions.app_themes, AppThemeDefinition.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new AppThemeDefinitions(m1170redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AppThemeDefinitions appThemeDefinitions = (AppThemeDefinitions) obj;
                appThemeDefinitions.getClass();
                ((ProtoAdapter) this.app_themesAdapter$delegate.getValue()).encodeWithTag(protoWriter, 1, appThemeDefinitions.app_themes);
                protoWriter.writeBytes(appThemeDefinitions.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppThemeDefinitions(Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.app_themes = TransactorKt.immutableCopyOf("app_themes", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppThemeDefinitions)) {
            return false;
        }
        AppThemeDefinitions appThemeDefinitions = (AppThemeDefinitions) obj;
        return Intrinsics.areEqual(unknownFields(), appThemeDefinitions.unknownFields()) && Intrinsics.areEqual(this.app_themes, appThemeDefinitions.app_themes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.app_themes.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        EmptyMap.INSTANCE.getClass();
        builder.app_themes = this.app_themes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map map = this.app_themes;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_themes=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppThemeDefinitions{", "}", 0, null, null, 56);
    }
}
