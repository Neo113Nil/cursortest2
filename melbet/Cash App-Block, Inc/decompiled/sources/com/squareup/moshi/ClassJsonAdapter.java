package com.squareup.moshi;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.MapJsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ClassJsonAdapter extends JsonAdapter {
    public static final MapJsonAdapter.AnonymousClass1 FACTORY = new MapJsonAdapter.AnonymousClass1(2);
    public final ClassFactory classFactory;
    public final FieldBinding[] fieldsArray;
    public final JsonReader.Options options;

    /* loaded from: classes8.dex */
    public final class FieldBinding {
        public final JsonAdapter adapter;
        public final Field field;
        public final String name;

        public FieldBinding(String str, Field field, JsonAdapter jsonAdapter) {
            this.name = str;
            this.field = field;
            this.adapter = jsonAdapter;
        }

        public final void read(JsonReader jsonReader, Object obj) {
            this.field.set(obj, this.adapter.fromJson(jsonReader));
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            this.adapter.toJson(jsonWriter, this.field.get(obj));
        }
    }

    public ClassJsonAdapter(ClassFactory classFactory, TreeMap treeMap) {
        this.classFactory = classFactory;
        this.fieldsArray = (FieldBinding[]) treeMap.values().toArray(new FieldBinding[treeMap.size()]);
        this.options = JsonReader.Options.of((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        try {
            Object newInstance = this.classFactory.newInstance();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int selectName = jsonReader.selectName(this.options);
                    if (selectName == -1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        this.fieldsArray[selectName].read(jsonReader, newInstance);
                    }
                }
                jsonReader.endObject();
                return newInstance;
            } catch (IllegalAccessException unused) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
        } catch (IllegalAccessException unused2) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        } catch (InstantiationException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            Util.rethrowCause(e2);
            throw null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        try {
            jsonWriter.beginObject();
            for (FieldBinding fieldBinding : this.fieldsArray) {
                jsonWriter.name(fieldBinding.name);
                fieldBinding.write(jsonWriter, obj);
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException unused) {
            Path$$ExternalSyntheticBUOutline0.m$2();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.classFactory + ")";
    }
}
