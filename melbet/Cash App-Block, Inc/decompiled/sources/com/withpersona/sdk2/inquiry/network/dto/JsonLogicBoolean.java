package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ParsedRules;
import defpackage.CommonJsonLogicEngine;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicEngine;
import defpackage.JsonLogicResult;
import defpackage.JsonLogicResult$Failure$NullResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Landroid/os/Parcelable;", "rule", "", "<init>", "(Ljava/lang/String;)V", "getRule", "()Ljava/lang/String;", "parsedRules", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "getParsedRules$annotations", "()V", "getParsedRules", "()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "parsedRules$delegate", "Lkotlin/Lazy;", "getValue", "", "formValues", "", "", "thisComponentValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Boolean;", "component1", "copy", "describeContents", "", "equals", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class JsonLogicBoolean implements Parcelable {

    /* renamed from: parsedRules$delegate, reason: from kotlin metadata */
    private final Lazy parsedRules;
    private final String rule;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<JsonLogicBoolean> CREATOR = new Creator();

    public JsonLogicBoolean(String str) {
        str.getClass();
        this.rule = str;
        this.parsedRules = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 25));
    }

    public static /* synthetic */ JsonLogicBoolean copy$default(JsonLogicBoolean jsonLogicBoolean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonLogicBoolean.rule;
        }
        return jsonLogicBoolean.copy(str);
    }

    private final ParsedRules getParsedRules() {
        return (ParsedRules) this.parsedRules.getValue();
    }

    @Json(ignore = true)
    private static /* synthetic */ void getParsedRules$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedRules parsedRules_delegate$lambda$1(JsonLogicBoolean jsonLogicBoolean) {
        Object fromJson = new Moshi(new Moshi.Builder()).adapter(Object.class, Util.NO_ANNOTATIONS).nullSafe().lenient().fromJson(jsonLogicBoolean.rule);
        if (!(fromJson instanceof Map)) {
            if (fromJson instanceof Boolean) {
                return new ParsedRules.PrimitiveRule(fromJson);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) fromJson).entrySet()) {
            Object key = entry.getKey();
            Pair pair = key instanceof String ? new Pair(key, entry.getValue()) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new ParsedRules.ComplexRules(MapsKt__MapsKt.toMap(arrayList));
    }

    /* renamed from: component1, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    public final JsonLogicBoolean copy(String rule) {
        rule.getClass();
        return new JsonLogicBoolean(rule);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonLogicBoolean) && Intrinsics.areEqual(this.rule, ((JsonLogicBoolean) other).rule);
    }

    public final String getRule() {
        return this.rule;
    }

    public final Boolean getValue(Map<String, ? extends Object> formValues, Object thisComponentValue) {
        JsonLogicEngine jsonLogicEngine;
        Object failure;
        Object obj;
        JsonLogicResult$Failure$NullResult jsonLogicResult$Failure$NullResult = JsonLogicResult$Failure$NullResult.INSTANCE$1;
        JsonLogicResult$Failure$NullResult jsonLogicResult$Failure$NullResult2 = JsonLogicResult$Failure$NullResult.INSTANCE$2;
        JsonLogicResult$Failure$NullResult jsonLogicResult$Failure$NullResult3 = JsonLogicResult$Failure$NullResult.INSTANCE;
        formValues.getClass();
        ParsedRules parsedRules = getParsedRules();
        if (parsedRules != null) {
            if (parsedRules instanceof ParsedRules.ComplexRules) {
                jsonLogicEngine = JsonLogicBooleanKt.getJsonLogicEngine();
                Map<String, Object> expression = ((ParsedRules.ComplexRules) parsedRules).getExpression();
                Map mapOf = MapsKt__MapsKt.mapOf(new Pair("form", formValues), new Pair("value", thisComponentValue));
                CommonJsonLogicEngine commonJsonLogicEngine = (CommonJsonLogicEngine) jsonLogicEngine;
                commonJsonLogicEngine.getClass();
                expression.getClass();
                if ((!expression.isEmpty() ? expression : null) != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = commonJsonLogicEngine.evaluator.executeExpression(expression, mapOf);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    if (Result.m4120exceptionOrNullimpl(failure) != null) {
                        obj = jsonLogicResult$Failure$NullResult2;
                    } else if (failure != null) {
                        if (failure instanceof Double) {
                            Number number = (Number) failure;
                            double doubleValue = number.doubleValue() % 1.0d;
                            if (doubleValue != 0.0d && Math.signum(doubleValue) != Math.signum(1.0d)) {
                                doubleValue += 1.0d;
                            }
                            if (doubleValue == 0.0d) {
                                failure = Long.valueOf((long) number.doubleValue());
                            }
                        }
                        obj = new JsonLogicResult.Success(failure);
                    } else {
                        obj = jsonLogicResult$Failure$NullResult3;
                    }
                } else {
                    obj = jsonLogicResult$Failure$NullResult;
                }
                if (obj instanceof JsonLogicResult.Success) {
                    Object obj2 = ((JsonLogicResult.Success) obj).value;
                    if (obj2 instanceof Boolean) {
                        return (Boolean) obj2;
                    }
                    return null;
                }
                if (obj.equals(jsonLogicResult$Failure$NullResult3) || obj.equals(jsonLogicResult$Failure$NullResult) || obj.equals(jsonLogicResult$Failure$NullResult2)) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (!(parsedRules instanceof ParsedRules.PrimitiveRule)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ParsedRules.PrimitiveRule primitiveRule = (ParsedRules.PrimitiveRule) parsedRules;
            if (primitiveRule.getValue() instanceof Boolean) {
                return (Boolean) primitiveRule.getValue();
            }
        }
        return null;
    }

    public int hashCode() {
        return this.rule.hashCode();
    }

    public String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JsonLogicBoolean(rule=", this.rule, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.rule);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends JsonAdapter {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public JsonLogicBoolean fromJson(JsonReader reader) {
            reader.getClass();
            return new JsonLogicBoolean(reader.nextSource().readByteString().utf8());
        }

        private Companion() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, JsonLogicBoolean value) {
            writer.getClass();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JsonLogicBoolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new JsonLogicBoolean(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean[] newArray(int i) {
            return new JsonLogicBoolean[i];
        }
    }
}
