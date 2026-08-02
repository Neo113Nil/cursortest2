package com.stripe.android.core.strings;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.stripe.android.core.model.Country;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class IdentifierResolvableString implements ResolvableString {
    public static final Parcelable.Creator<IdentifierResolvableString> CREATOR = new Country.Creator(5);
    public final List args;
    public final int id;
    public final List transformations;

    public IdentifierResolvableString(int i, List list, List list2) {
        list2.getClass();
        this.id = i;
        this.transformations = list;
        this.args = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifierResolvableString)) {
            return false;
        }
        IdentifierResolvableString identifierResolvableString = (IdentifierResolvableString) obj;
        return this.id == identifierResolvableString.id && this.transformations.equals(identifierResolvableString.transformations) && Intrinsics.areEqual(this.args, identifierResolvableString.args);
    }

    public final int hashCode() {
        return this.args.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.id) * 31, 31, this.transformations);
    }

    @Override // com.stripe.android.core.strings.ResolvableString
    public final String resolve(Context context) {
        context.getClass();
        List list = this.transformations;
        Object[] resolveArgs = OtelConventions.resolveArgs(context, this.args);
        String string2 = context.getString(this.id, Arrays.copyOf(resolveArgs, resolveArgs.length));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        return string2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentifierResolvableString(id=");
        sb.append(this.id);
        sb.append(", transformations=");
        sb.append(this.transformations);
        sb.append(", args=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.args, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.id);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.transformations, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.args, parcel);
        while (m2.hasNext()) {
            parcel.writeValue(m2.next());
        }
    }
}
