package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

@JsonClass(generateAdapter = true)
/* loaded from: classes9.dex */
public final class ErrorResponse {
    public static final Companion Companion = new Companion(null);
    private final List<Error> errors;

    public static final class ErrorJsonAdapterFactory implements JsonAdapter.Factory {
        public static final ErrorJsonAdapterFactory INSTANCE = new ErrorJsonAdapterFactory();
        private static final String LABEL_KEY = "code";
        private static final PolymorphicJsonAdapterFactory adapterFactory;

        static {
            List list = Collections.EMPTY_LIST;
            if (list.contains("inactive_template_error")) {
                a$$ExternalSyntheticBUOutline0.m$3("Labels must be unique.");
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.add("inactive_template_error");
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.add(Error.InactiveTemplateError.class);
            adapterFactory = new PolymorphicJsonAdapterFactory(Error.class, LABEL_KEY, arrayList, arrayList2, null).withSubtype(Error.InvalidConfigError.class, "invalid_config").withSubtype(Error.UnauthenticatedError.class, "unauthenticated").withSubtype(Error.InconsistentTransitionError.class, "inconsistent_transition_error").withSubtype(Error.TransitionFromTerminalStateError.class, "transition_from_terminal_state_error").withSubtype(Error.FieldNotFoundError.class, "field_not_found_error").withSubtype(Error.RateLimitExceededError.class, "rate_limit_exceeded").withSubtype(Error.InvalidFieldValueError.class, "invalid_field_value_error").withSubtype(Error.UnknownError.class, "unknown_error").withFallbackJsonAdapter(UnknownErrorAdapter.INSTANCE);
        }

        private ErrorJsonAdapterFactory() {
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter create(Type type2, Set<? extends Annotation> set, Moshi moshi) {
            final JsonAdapter create = adapterFactory.create(type2, set, moshi);
            if (create == null) {
                return null;
            }
            return new JsonAdapter(create) { // from class: com.withpersona.sdk2.inquiry.network.core.ErrorResponse$ErrorJsonAdapterFactory$create$1
                private final JsonAdapter errorAdapter;

                {
                    this.errorAdapter = create;
                }

                public static /* synthetic */ void getErrorAdapter$annotations() {
                }

                @Override // com.squareup.moshi.JsonAdapter
                public ErrorResponse.Error fromJson(JsonReader jsonReader) {
                    return ErrorResponse.ErrorJsonAdapterFactory.INSTANCE.hasLabel(jsonReader.peekJson()) ? (ErrorResponse.Error) this.errorAdapter.fromJson(jsonReader) : ErrorResponse.UnknownErrorAdapter.INSTANCE.fromJson(jsonReader);
                }

                public final JsonAdapter getErrorAdapter() {
                    return this.errorAdapter;
                }

                @Override // com.squareup.moshi.JsonAdapter
                public void toJson(JsonWriter jsonWriter, ErrorResponse.Error error) {
                    this.errorAdapter.toJson(jsonWriter, error);
                }
            }.nullSafe();
        }

        public final boolean hasLabel(JsonReader jsonReader) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (Intrinsics.areEqual(jsonReader.nextName(), LABEL_KEY)) {
                    return true;
                }
                jsonReader.skipValue();
            }
            return false;
        }
    }

    public static final class UnknownErrorAdapter extends JsonAdapter {
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Error.UnknownError fromJson(JsonReader jsonReader) {
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Intrinsics.areEqual(nextName, "code")) {
                    str2 = JsonReaderUtilsKt.nextStringOrNull(jsonReader);
                } else if (Intrinsics.areEqual(nextName, "title")) {
                    str = JsonReaderUtilsKt.nextStringOrNull(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return new Error.UnknownError(str, str2);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Error.UnknownError unknownError) {
            jsonWriter.beginObject();
            jsonWriter.name("originalCode");
            jsonWriter.value(unknownError != null ? unknownError.getOriginalCode() : null);
            jsonWriter.name("title");
            jsonWriter.value(unknownError != null ? unknownError.getTitle() : null);
            jsonWriter.endObject();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorResponse(List<? extends Error> list) {
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = errorResponse.errors;
        }
        return errorResponse.copy(list);
    }

    public final List<Error> component1() {
        return this.errors;
    }

    public final ErrorResponse copy(List<? extends Error> list) {
        return new ErrorResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && Intrinsics.areEqual(this.errors, ((ErrorResponse) obj).errors);
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<Error> list = this.errors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final <T extends Error> boolean isAnyError() {
        List<Error> errors = getErrors();
        if (errors != null && !errors.isEmpty()) {
            Iterator<T> it = errors.iterator();
            if (it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
            }
        }
        return false;
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ErrorResponse(errors=", ")", this.errors);
    }

    public static abstract class Error implements Parcelable {
        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getDescription();

        public abstract String getTitle();

        @JsonClass(generateAdapter = true)
        public static final class FieldNotFoundError extends Error {
            public static final Parcelable.Creator<FieldNotFoundError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public FieldNotFoundError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ FieldNotFoundError copy$default(FieldNotFoundError fieldNotFoundError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fieldNotFoundError.title;
                }
                if ((i & 2) != 0) {
                    str2 = fieldNotFoundError.details;
                }
                return fieldNotFoundError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final FieldNotFoundError copy(String str, String str2) {
                return new FieldNotFoundError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FieldNotFoundError)) {
                    return false;
                }
                FieldNotFoundError fieldNotFoundError = (FieldNotFoundError) obj;
                return Intrinsics.areEqual(this.title, fieldNotFoundError.title) && Intrinsics.areEqual(this.details, fieldNotFoundError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("FieldNotFoundError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<FieldNotFoundError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldNotFoundError createFromParcel(Parcel parcel) {
                    return new FieldNotFoundError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldNotFoundError[] newArray(int i) {
                    return new FieldNotFoundError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class InactiveTemplateError extends Error {
            public static final Parcelable.Creator<InactiveTemplateError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public InactiveTemplateError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InactiveTemplateError copy$default(InactiveTemplateError inactiveTemplateError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inactiveTemplateError.title;
                }
                if ((i & 2) != 0) {
                    str2 = inactiveTemplateError.details;
                }
                return inactiveTemplateError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final InactiveTemplateError copy(String str, String str2) {
                return new InactiveTemplateError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InactiveTemplateError)) {
                    return false;
                }
                InactiveTemplateError inactiveTemplateError = (InactiveTemplateError) obj;
                return Intrinsics.areEqual(this.title, inactiveTemplateError.title) && Intrinsics.areEqual(this.details, inactiveTemplateError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("InactiveTemplateError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<InactiveTemplateError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InactiveTemplateError createFromParcel(Parcel parcel) {
                    return new InactiveTemplateError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InactiveTemplateError[] newArray(int i) {
                    return new InactiveTemplateError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class InconsistentTransitionError extends Error {
            public static final Parcelable.Creator<InconsistentTransitionError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public InconsistentTransitionError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InconsistentTransitionError copy$default(InconsistentTransitionError inconsistentTransitionError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inconsistentTransitionError.title;
                }
                if ((i & 2) != 0) {
                    str2 = inconsistentTransitionError.details;
                }
                return inconsistentTransitionError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final InconsistentTransitionError copy(String str, String str2) {
                return new InconsistentTransitionError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InconsistentTransitionError)) {
                    return false;
                }
                InconsistentTransitionError inconsistentTransitionError = (InconsistentTransitionError) obj;
                return Intrinsics.areEqual(this.title, inconsistentTransitionError.title) && Intrinsics.areEqual(this.details, inconsistentTransitionError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("InconsistentTransitionError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<InconsistentTransitionError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InconsistentTransitionError createFromParcel(Parcel parcel) {
                    return new InconsistentTransitionError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InconsistentTransitionError[] newArray(int i) {
                    return new InconsistentTransitionError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class InvalidConfigError extends Error {
            public static final Parcelable.Creator<InvalidConfigError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public InvalidConfigError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InvalidConfigError copy$default(InvalidConfigError invalidConfigError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = invalidConfigError.title;
                }
                if ((i & 2) != 0) {
                    str2 = invalidConfigError.details;
                }
                return invalidConfigError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final InvalidConfigError copy(String str, String str2) {
                return new InvalidConfigError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidConfigError)) {
                    return false;
                }
                InvalidConfigError invalidConfigError = (InvalidConfigError) obj;
                return Intrinsics.areEqual(this.title, invalidConfigError.title) && Intrinsics.areEqual(this.details, invalidConfigError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("InvalidConfigError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<InvalidConfigError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidConfigError createFromParcel(Parcel parcel) {
                    return new InvalidConfigError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidConfigError[] newArray(int i) {
                    return new InvalidConfigError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class InvalidFieldValueError extends Error {
            public static final Parcelable.Creator<InvalidFieldValueError> CREATOR = new Creator();
            private final Map<String, UiComponentError> details;
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public InvalidFieldValueError(String str, Map<String, ? extends UiComponentError> map) {
                super(null);
                this.title = str;
                this.details = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                Set<String> keySet;
                StringBuilder sb = new StringBuilder("Invalid value(s) on field(s) ");
                Map<String, UiComponentError> map = this.details;
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, (map == null || (keySet = map.keySet()) == null) ? null : CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63), ".");
            }

            public final Map<String, UiComponentError> getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                Map<String, UiComponentError> map = this.details;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), i);
                }
            }

            public static final class Creator implements Parcelable.Creator<InvalidFieldValueError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidFieldValueError createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    String readString = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        for (int i = 0; i != readInt; i++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readParcelable(InvalidFieldValueError.class.getClassLoader()));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new InvalidFieldValueError(readString, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidFieldValueError[] newArray(int i) {
                    return new InvalidFieldValueError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class RateLimitExceededError extends Error {
            public static final Parcelable.Creator<RateLimitExceededError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public RateLimitExceededError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ RateLimitExceededError copy$default(RateLimitExceededError rateLimitExceededError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rateLimitExceededError.title;
                }
                if ((i & 2) != 0) {
                    str2 = rateLimitExceededError.details;
                }
                return rateLimitExceededError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final RateLimitExceededError copy(String str, String str2) {
                return new RateLimitExceededError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RateLimitExceededError)) {
                    return false;
                }
                RateLimitExceededError rateLimitExceededError = (RateLimitExceededError) obj;
                return Intrinsics.areEqual(this.title, rateLimitExceededError.title) && Intrinsics.areEqual(this.details, rateLimitExceededError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("RateLimitExceededError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<RateLimitExceededError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RateLimitExceededError createFromParcel(Parcel parcel) {
                    return new RateLimitExceededError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RateLimitExceededError[] newArray(int i) {
                    return new RateLimitExceededError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class TransitionFromTerminalStateError extends Error {
            public static final Parcelable.Creator<TransitionFromTerminalStateError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public TransitionFromTerminalStateError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ TransitionFromTerminalStateError copy$default(TransitionFromTerminalStateError transitionFromTerminalStateError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = transitionFromTerminalStateError.title;
                }
                if ((i & 2) != 0) {
                    str2 = transitionFromTerminalStateError.details;
                }
                return transitionFromTerminalStateError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final TransitionFromTerminalStateError copy(String str, String str2) {
                return new TransitionFromTerminalStateError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransitionFromTerminalStateError)) {
                    return false;
                }
                TransitionFromTerminalStateError transitionFromTerminalStateError = (TransitionFromTerminalStateError) obj;
                return Intrinsics.areEqual(this.title, transitionFromTerminalStateError.title) && Intrinsics.areEqual(this.details, transitionFromTerminalStateError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("TransitionFromTerminalStateError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<TransitionFromTerminalStateError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionFromTerminalStateError createFromParcel(Parcel parcel) {
                    return new TransitionFromTerminalStateError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionFromTerminalStateError[] newArray(int i) {
                    return new TransitionFromTerminalStateError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class UnauthenticatedError extends Error {
            public static final Parcelable.Creator<UnauthenticatedError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public UnauthenticatedError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ UnauthenticatedError copy$default(UnauthenticatedError unauthenticatedError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unauthenticatedError.title;
                }
                if ((i & 2) != 0) {
                    str2 = unauthenticatedError.details;
                }
                return unauthenticatedError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final UnauthenticatedError copy(String str, String str2) {
                return new UnauthenticatedError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnauthenticatedError)) {
                    return false;
                }
                UnauthenticatedError unauthenticatedError = (UnauthenticatedError) obj;
                return Intrinsics.areEqual(this.title, unauthenticatedError.title) && Intrinsics.areEqual(this.details, unauthenticatedError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("UnauthenticatedError(title=", this.title, ", details=", this.details, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }

            public static final class Creator implements Parcelable.Creator<UnauthenticatedError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnauthenticatedError createFromParcel(Parcel parcel) {
                    return new UnauthenticatedError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnauthenticatedError[] newArray(int i) {
                    return new UnauthenticatedError[i];
                }
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class UnknownError extends Error {
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();
            private transient ResponseBody errorBody;
            private final String originalCode;
            private final String title;

            public UnknownError(String str, String str2) {
                super(null);
                this.title = str;
                this.originalCode = str2;
            }

            public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unknownError.title;
                }
                if ((i & 2) != 0) {
                    str2 = unknownError.originalCode;
                }
                return unknownError.copy(str, str2);
            }

            public static /* synthetic */ void getErrorBody$annotations() {
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.originalCode;
            }

            public final UnknownError copy(String str, String str2) {
                return new UnknownError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnknownError)) {
                    return false;
                }
                UnknownError unknownError = (UnknownError) obj;
                return Intrinsics.areEqual(this.title, unknownError.title) && Intrinsics.areEqual(this.originalCode, unknownError.originalCode);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return getTitle();
            }

            public final ResponseBody getErrorBody() {
                return this.errorBody;
            }

            public final String getOriginalCode() {
                return this.originalCode;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.originalCode;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setErrorBody(ResponseBody responseBody) {
                this.errorBody = responseBody;
            }

            public String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("UnknownError(title=", this.title, ", originalCode=", this.originalCode, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.title);
                parcel.writeString(this.originalCode);
            }

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError createFromParcel(Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError[] newArray(int i) {
                    return new UnknownError[i];
                }
            }
        }

        private Error() {
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorResponse create(String str) {
            return new ErrorResponse(CollectionsKt__CollectionsJVMKt.listOf(new Error.UnknownError(str, null)));
        }

        public final JsonAdapter.Factory getAdapter() {
            return ErrorJsonAdapterFactory.INSTANCE;
        }

        private Companion() {
        }
    }
}
