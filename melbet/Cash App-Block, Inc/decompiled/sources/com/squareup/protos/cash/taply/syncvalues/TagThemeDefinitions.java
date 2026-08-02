package com.squareup.protos.cash.taply.syncvalues;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.appthemes.AppThemeDefinitions;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
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
public final class TagThemeDefinitions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TagThemeDefinitions> CREATOR;
    public final Map tag_theme_definitions;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TagThemeDefinitions.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions$Companion$ADAPTER$1
            public final Lazy tag_theme_definitionsAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.tag_theme_definitionsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(26));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new TagThemeDefinitions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.putAll((Map) ((ProtoAdapter) this.tag_theme_definitionsAdapter$delegate.getValue()).decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) obj;
                reverseProtoWriter.getClass();
                tagThemeDefinitions.getClass();
                reverseProtoWriter.writeBytes(tagThemeDefinitions.unknownFields());
                ((ProtoAdapter) this.tag_theme_definitionsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 1, tagThemeDefinitions.tag_theme_definitions);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) obj;
                tagThemeDefinitions.getClass();
                return ((ProtoAdapter) this.tag_theme_definitionsAdapter$delegate.getValue()).encodedSizeWithTag(1, tagThemeDefinitions.tag_theme_definitions) + tagThemeDefinitions.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) obj;
                tagThemeDefinitions.getClass();
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(tagThemeDefinitions.tag_theme_definitions, TagThemeDefinition.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new TagThemeDefinitions(m1170redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) obj;
                tagThemeDefinitions.getClass();
                ((ProtoAdapter) this.tag_theme_definitionsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 1, tagThemeDefinitions.tag_theme_definitions);
                protoWriter.writeBytes(tagThemeDefinitions.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagThemeDefinitions(Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.tag_theme_definitions = TransactorKt.immutableCopyOf("tag_theme_definitions", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagThemeDefinitions)) {
            return false;
        }
        TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) obj;
        return Intrinsics.areEqual(unknownFields(), tagThemeDefinitions.unknownFields()) && Intrinsics.areEqual(this.tag_theme_definitions, tagThemeDefinitions.tag_theme_definitions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.tag_theme_definitions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppThemeDefinitions.Builder builder = new AppThemeDefinitions.Builder(1);
        EmptyMap.INSTANCE.getClass();
        builder.app_themes = this.tag_theme_definitions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map map = this.tag_theme_definitions;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tag_theme_definitions=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TagThemeDefinitions{", "}", 0, null, null, 56);
    }
}
