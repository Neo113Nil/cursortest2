package net.idrnd.face.iad.capture.internal;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class l3 implements Parcelable {
    public static final a CREATOR = new a();
    public final List a;
    public final q0 b;
    public final v c;

    public final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = Build.VERSION.SDK_INT;
            Parcelable[] readParcelableArray = i >= 33 ? (Parcelable[]) parcel.readParcelableArray(q0.class.getClassLoader(), q0.class) : parcel.readParcelableArray(q0.class.getClassLoader());
            readParcelableArray.getClass();
            q0[] q0VarArr = (q0[]) readParcelableArray;
            ClassLoader classLoader = q0.class.getClassLoader();
            Parcelable readParcelable = i >= 33 ? (Parcelable) parcel.readParcelable(classLoader, q0.class) : parcel.readParcelable(classLoader);
            readParcelable.getClass();
            q0 q0Var = (q0) readParcelable;
            ClassLoader classLoader2 = v.class.getClassLoader();
            Parcelable readParcelable2 = i >= 33 ? (Parcelable) parcel.readParcelable(classLoader2, v.class) : parcel.readParcelable(classLoader2);
            List asList = Arrays.asList(q0VarArr);
            asList.getClass();
            return new l3(asList, q0Var, (v) readParcelable2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new l3[i];
        }
    }

    public l3(List list, q0 q0Var, v vVar) {
        list.getClass();
        this.a = list;
        this.b = q0Var;
        this.c = vVar;
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("No one from the existed product supports the payload without the photo.");
            throw null;
        }
    }

    public final int a() {
        List list = this.a;
        Iterator it = list.iterator();
        int i = 0;
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Integer num = ((q0) next).b;
            int intValue = num != null ? num.intValue() : 0;
            do {
                Object next2 = it.next();
                Integer num2 = ((q0) next2).b;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                if (intValue < intValue2) {
                    next = next2;
                    intValue = intValue2;
                }
            } while (it.hasNext());
        }
        q0 q0Var = (q0) next;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(((q0) it2.next()).b, q0Var.b)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return Intrinsics.areEqual(this.a, l3Var.a) && this.b.equals(l3Var.b) && Intrinsics.areEqual(this.c, l3Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        v vVar = this.c;
        return hashCode + (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        return "PayloadParameters(photoParameters=" + this.a + ", controlPhotoParameters=" + this.b + ", cropsParameters=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelableArray((Parcelable[]) this.a.toArray(new q0[0]), 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
    }
}
