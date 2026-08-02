package com.squareup.wire;

import app.cash.arcade.values.Color;
import app.cash.mooncake.values.MooncakeColors;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.resources.ResourcesKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.internal.EnumJsonFormatter;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import com.squareup.wire.internal.InstantJsonFormatter;
import com.squareup.wire.internal.JsonIntegration$UnsignedLongAsNumberJsonFormatter;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes6.dex */
public abstract class MoshiJsonIntegration {

    /* loaded from: classes9.dex */
    public final class ListJsonAdapter extends JsonAdapter {
        public final JsonAdapter single;
        public final boolean skipNull;

        public ListJsonAdapter(JsonAdapter jsonAdapter, boolean z) {
            this.single = jsonAdapter;
            this.skipNull = z;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(JsonReader jsonReader) {
            jsonReader.getClass();
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                Object fromJson = this.single.fromJson(jsonReader);
                if (fromJson != null || !this.skipNull) {
                    arrayList.add(fromJson);
                }
            }
            jsonReader.endArray();
            return arrayList;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            List list = (List) obj;
            jsonWriter.getClass();
            jsonWriter.beginArray();
            list.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.single.toJson(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public static ArrayList jsonAdapters(RuntimeMessageAdapter runtimeMessageAdapter, Moshi moshi) {
        Object obj;
        JsonAdapter nullSafe;
        JsonAdapter jsonAdapter;
        boolean z = false;
        FieldOrOneOfBinding[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) runtimeMessageAdapter.fields.values().toArray(new FieldOrOneOfBinding[0]);
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            Syntax syntax = runtimeMessageAdapter.getSyntax();
            InstantJsonFormatter instantJsonFormatter = InstantJsonFormatter.INSTANCE$5;
            InstantJsonFormatter instantJsonFormatter2 = InstantJsonFormatter.INSTANCE$9;
            if (fieldOrOneOfBinding.getSingleAdapter().isStruct$wire_runtime()) {
                jsonAdapter = moshi.adapter(Object.class).serializeNulls().nullSafe();
                jsonAdapter.getClass();
            } else {
                ProtoAdapter singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.BYTES) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.BYTES_VALUE)) {
                    obj = InstantJsonFormatter.INSTANCE$3;
                } else if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.DURATION)) {
                    obj = InstantJsonFormatter.INSTANCE$1;
                } else if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.INSTANT)) {
                    obj = InstantJsonFormatter.INSTANCE;
                } else if (singleAdapter instanceof EnumAdapter) {
                    obj = new EnumJsonFormatter((EnumAdapter) singleAdapter);
                } else if (syntax == Syntax.PROTO_2) {
                    if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.UINT64) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.UINT64_VALUE)) {
                        obj = JsonIntegration$UnsignedLongAsNumberJsonFormatter.INSTANCE;
                    }
                    obj = null;
                } else if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.UINT32) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.FIXED32) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.UINT32_VALUE)) {
                    obj = InstantJsonFormatter.INSTANCE$7;
                } else if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.INT64) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.SFIXED64) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.SINT64) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.INT64_VALUE)) {
                    obj = instantJsonFormatter;
                } else {
                    if (Intrinsics.areEqual(singleAdapter, ProtoAdapter.FIXED64) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.UINT64) || Intrinsics.areEqual(singleAdapter, ProtoAdapter.UINT64_VALUE)) {
                        obj = instantJsonFormatter2;
                    }
                    obj = null;
                }
                int i = 3;
                if (obj != null) {
                    nullSafe = new JsonAdapter.AnonymousClass1(obj, i).nullSafe();
                    nullSafe.getClass();
                } else {
                    KClass type2 = fieldOrOneOfBinding.getSingleAdapter().getType();
                    Class javaObjectType = type2 != null ? PapaEvent.getJavaObjectType(type2) : null;
                    javaObjectType.getClass();
                    nullSafe = moshi.adapter(javaObjectType).nullSafe();
                    nullSafe.getClass();
                }
                if (fieldOrOneOfBinding.getLabel().isRepeated()) {
                    jsonAdapter = new ListJsonAdapter(nullSafe, obj instanceof EnumJsonFormatter).nullSafe();
                    jsonAdapter.getClass();
                } else if (fieldOrOneOfBinding.isMap()) {
                    ProtoAdapter keyAdapter = fieldOrOneOfBinding.getKeyAdapter();
                    if (Intrinsics.areEqual(keyAdapter, ProtoAdapter.STRING)) {
                        instantJsonFormatter = InstantJsonFormatter.INSTANCE$6;
                    } else if (Intrinsics.areEqual(keyAdapter, ProtoAdapter.INT32) || Intrinsics.areEqual(keyAdapter, ProtoAdapter.SINT32) || Intrinsics.areEqual(keyAdapter, ProtoAdapter.SFIXED32)) {
                        instantJsonFormatter = InstantJsonFormatter.INSTANCE$4;
                    } else if (Intrinsics.areEqual(keyAdapter, ProtoAdapter.FIXED32) || Intrinsics.areEqual(keyAdapter, ProtoAdapter.UINT32)) {
                        instantJsonFormatter = InstantJsonFormatter.INSTANCE$8;
                    } else if (!Intrinsics.areEqual(keyAdapter, ProtoAdapter.INT64) && !Intrinsics.areEqual(keyAdapter, ProtoAdapter.SFIXED64) && !Intrinsics.areEqual(keyAdapter, ProtoAdapter.SINT64)) {
                        if (!Intrinsics.areEqual(keyAdapter, ProtoAdapter.FIXED64) && !Intrinsics.areEqual(keyAdapter, ProtoAdapter.UINT64)) {
                            a$$ExternalSyntheticBUOutline0.m(keyAdapter.getType(), "Unexpected map key type: ");
                            return null;
                        }
                        instantJsonFormatter = instantJsonFormatter2;
                    }
                    jsonAdapter = new JsonAdapter.AnonymousClass4(instantJsonFormatter, nullSafe, z, i).nullSafe();
                    jsonAdapter.getClass();
                } else {
                    jsonAdapter = nullSafe;
                }
            }
            arrayList.add(jsonAdapter);
        }
        return arrayList;
    }

    public static final ColorModel.Accented toModel(Color color) {
        color.getClass();
        return new ColorModel.Accented(color);
    }

    public static ColorModel toModel$default(app.cash.arcade.values.Color color) {
        Lazy lazy = ResourcesKt.mooncakeResourceIndex;
        color.getClass();
        lazy.getClass();
        return color.equals(MooncakeColors.primaryButtonBackground) ? ColorModel.PrimaryButtonBackground.INSTANCE : color.equals(MooncakeColors.green) ? ColorModel.CashGreen.INSTANCE : color.equals(MooncakeColors.bitcoin) ? ColorModel.Bitcoin.INSTANCE : color.equals(MooncakeColors.investing) ? ColorModel.Investing.INSTANCE : color.equals(MooncakeColors.error) ? ColorModel.Error.INSTANCE : color.equals(MooncakeColors.background) ? ColorModel.Background.INSTANCE : color.equals(MooncakeColors.secondaryButtonBackground) ? ColorModel.SecondaryButtonBackground.INSTANCE : color.equals(MooncakeColors.secondaryLabel) ? ColorModel.SecondaryLabel.INSTANCE : color.equals(MooncakeColors.icon) ? ColorModel.Icon.INSTANCE : color.equals(MooncakeColors.warning) ? ColorModel.Warning.INSTANCE : color instanceof Color.Token ? new ColorModel.Arcade(((Color.Token) color).id) : new ColorModel.Accented(ColorsKt.toProto(color, lazy));
    }
}
