package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "", "fields", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "(Ljava/util/Map;)V", "getFields", "()Ljava/util/Map;", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryFieldMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, InquiryField> fields;

    /* JADX WARN: Multi-variable type inference failed */
    public InquiryFieldMap(Map<String, ? extends InquiryField> map) {
        map.getClass();
        this.fields = map;
    }

    public final Map<String, InquiryField> getFields() {
        return this.fields;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends JsonAdapter {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public InquiryFieldMap fromJson(JsonReader reader) {
            reader.getClass();
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, InquiryFieldMap value) {
            writer.getClass();
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.beginObject();
            for (Map.Entry<String, InquiryField> entry : value.getFields().entrySet()) {
                String key = entry.getKey();
                InquiryField value2 = entry.getValue();
                writer.name(key);
                if (value2 instanceof InquiryField.StringField) {
                    writer.value(((InquiryField.StringField) value2).getValue());
                } else if (value2 instanceof InquiryField.IntegerField) {
                    writer.value(((InquiryField.IntegerField) value2).getValue());
                } else if (value2 instanceof InquiryField.BooleanField) {
                    writer.value(((InquiryField.BooleanField) value2).getValue());
                } else if (value2 instanceof InquiryField.DatetimeField) {
                    writer.value(((InquiryField.DatetimeField) value2).getValue());
                } else if (value2 instanceof InquiryField.DateField) {
                    writer.value(((InquiryField.DateField) value2).getValue());
                } else if (value2 instanceof InquiryField.FloatField) {
                    writer.value(((InquiryField.FloatField) value2).getValue());
                } else if (value2 instanceof InquiryField.ChoicesField) {
                    writer.value(((InquiryField.ChoicesField) value2).getValue());
                } else {
                    if (!(value2 instanceof InquiryField.MultiChoicesField)) {
                        if (value2 instanceof InquiryField.Unknown) {
                            a$$ExternalSyntheticBUOutline0.m$1("Attempted to write field with type `Unknown`.");
                            return;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                    }
                    writer.beginArray();
                    String[] value3 = ((InquiryField.MultiChoicesField) value2).getValue();
                    if (value3 != null) {
                        for (String str : value3) {
                            writer.value(str);
                        }
                    }
                    writer.endArray();
                }
            }
            writer.endObject();
        }

        private Companion() {
        }
    }
}
