package com.stripe.android.core.strings;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.stripe.android.core.model.Country;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StaticResolvableString implements ResolvableString {
    public static final Parcelable.Creator<StaticResolvableString> CREATOR = new Country.Creator(6);
    public final List args;
    public final String value;

    public StaticResolvableString(String str, List list) {
        str.getClass();
        list.getClass();
        this.value = str;
        this.args = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticResolvableString)) {
            return false;
        }
        StaticResolvableString staticResolvableString = (StaticResolvableString) obj;
        return Intrinsics.areEqual(this.value, staticResolvableString.value) && Intrinsics.areEqual(this.args, staticResolvableString.args);
    }

    public final int hashCode() {
        return this.args.hashCode() + (this.value.hashCode() * 31);
    }

    @Override // com.stripe.android.core.strings.ResolvableString
    public final String resolve(Context context) {
        context.getClass();
        Object[] resolveArgs = OtelConventions.resolveArgs(context, this.args);
        Object[] copyOf = Arrays.copyOf(resolveArgs, resolveArgs.length);
        return String.format(this.value, Arrays.copyOf(copyOf, copyOf.length));
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StaticResolvableString(value=", this.value, ", args=", ")", this.args);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.args, parcel);
        while (m.hasNext()) {
            parcel.writeValue(m.next());
        }
    }
}
