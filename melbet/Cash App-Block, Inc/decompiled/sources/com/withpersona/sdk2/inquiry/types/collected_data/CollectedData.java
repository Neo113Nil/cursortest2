package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class CollectedData implements Closeable, Parcelable {
    public static final Parcelable.Creator<CollectedData> CREATOR = new Element.AnonymousClass1(4);
    public final ArrayList stepData;

    public CollectedData(ArrayList arrayList) {
        this.stepData = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.stepData.iterator();
        while (it.hasNext()) {
            ((StepData) it.next()).close();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectedData) && this.stepData.equals(((CollectedData) obj).stepData);
    }

    public final int hashCode() {
        return this.stepData.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("CollectedData(stepData=", ")", this.stepData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.stepData, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
