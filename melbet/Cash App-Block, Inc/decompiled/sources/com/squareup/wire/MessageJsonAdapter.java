package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class MessageJsonAdapter extends JsonAdapter {
    public final ArrayList jsonAdapters;
    public final ArrayList jsonAlternateNames;
    public final ArrayList jsonNames;
    public final RuntimeMessageAdapter messageAdapter;
    public final JsonReader.Options options;

    public MessageJsonAdapter(RuntimeMessageAdapter runtimeMessageAdapter, ArrayList arrayList, JsonAdapter jsonAdapter) {
        this.messageAdapter = runtimeMessageAdapter;
        this.jsonAdapters = arrayList;
        ArrayList arrayList2 = runtimeMessageAdapter.jsonNames;
        this.jsonNames = arrayList2;
        this.jsonAlternateNames = runtimeMessageAdapter.jsonAlternateNames;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.jsonNames.get(i);
            arrayList3.add(str);
            String str2 = (String) this.jsonAlternateNames.get(i);
            if (str2 == null) {
                str2 = str + (char) 0;
            }
            arrayList3.add(str2);
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        this.options = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        RuntimeMessageAdapter runtimeMessageAdapter = this.messageAdapter;
        Message.Builder builder = (Message.Builder) ((ListsKt$$ExternalSyntheticLambda0) runtimeMessageAdapter.binding.syntaxHighlight).invoke();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                int i = selectName / 2;
                Object fromJson = ((JsonAdapter) this.jsonAdapters.get(i)).fromJson(jsonReader);
                if (fromJson != null) {
                    runtimeMessageAdapter.fieldBindingsArray[i].set$1(builder, fromJson);
                }
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Message message = (Message) obj;
        jsonWriter.getClass();
        jsonWriter.beginObject();
        RuntimeMessageAdapter runtimeMessageAdapter = this.messageAdapter;
        ArrayList arrayList = runtimeMessageAdapter.jsonNames;
        FieldOrOneOfBinding[] fieldOrOneOfBindingArr = runtimeMessageAdapter.fieldBindingsArray;
        int length = fieldOrOneOfBindingArr.length;
        for (int i = 0; i < length; i++) {
            FieldOrOneOfBinding fieldOrOneOfBinding = fieldOrOneOfBindingArr[i];
            message.getClass();
            Object obj2 = fieldOrOneOfBinding.get(message);
            Syntax syntax = runtimeMessageAdapter.getSyntax();
            syntax.getClass();
            if (obj2 != null && (fieldOrOneOfBinding.getWriteIdentityValues() || ((fieldOrOneOfBinding.getLabel() != WireField.Label.OMIT_IDENTITY && ((!fieldOrOneOfBinding.getLabel().isRepeated() || syntax != Syntax.PROTO_3) && (!fieldOrOneOfBinding.isMap() || syntax != Syntax.PROTO_3))) || !obj2.equals(fieldOrOneOfBinding.getAdapter().getIdentity())))) {
                fieldOrOneOfBinding.getRedacted();
                String str = (String) arrayList.get(i);
                JsonAdapter jsonAdapter = (JsonAdapter) this.jsonAdapters.get(i);
                str.getClass();
                jsonAdapter.getClass();
                jsonWriter.name(str);
                jsonAdapter.toJson(jsonWriter, obj2);
            }
        }
        jsonWriter.endObject();
    }
}
