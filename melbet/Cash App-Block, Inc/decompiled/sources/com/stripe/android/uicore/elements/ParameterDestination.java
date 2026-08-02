package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;

/* loaded from: classes8.dex */
public interface ParameterDestination extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Api implements ParameterDestination {
        public static final /* synthetic */ Api[] $VALUES;
        public static final Parcelable.Creator<Api> CREATOR;
        public static final Api Options;
        public static final Api Params;

        static {
            Api api = new Api("Params", 0);
            Params = api;
            Api api2 = new Api("Options", 1);
            Options = api2;
            $VALUES = new Api[]{api, api2};
            CREATOR = new IdentifierSpec.Creator(1);
        }

        public static Api valueOf(String str) {
            return (Api) Enum.valueOf(Api.class, str);
        }

        public static Api[] values() {
            return (Api[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Local implements ParameterDestination {
        public static final /* synthetic */ Local[] $VALUES;
        public static final Parcelable.Creator<Local> CREATOR;
        public static final Local Extras;

        static {
            Local local = new Local("Extras", 0);
            Extras = local;
            $VALUES = new Local[]{local};
            CREATOR = new IdentifierSpec.Creator(2);
        }

        public static Local valueOf(String str) {
            return (Local) Enum.valueOf(Local.class, str);
        }

        public static Local[] values() {
            return (Local[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }
}
