package com.anythink.basead.exoplayer.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[0];
        }

        private static a[] a() {
            return new a[0];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0024a[] f7428a;

    /* renamed from: com.anythink.basead.exoplayer.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0024a extends Parcelable {
    }

    public a(InterfaceC0024a... interfaceC0024aArr) {
        this.f7428a = interfaceC0024aArr;
    }

    public final int a() {
        return this.f7428a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7428a, ((a) obj).f7428a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7428a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7428a.length);
        for (InterfaceC0024a interfaceC0024a : this.f7428a) {
            parcel.writeParcelable(interfaceC0024a, 0);
        }
    }

    public final InterfaceC0024a a(int i) {
        return this.f7428a[i];
    }

    public a(List<? extends InterfaceC0024a> list) {
        InterfaceC0024a[] interfaceC0024aArr = new InterfaceC0024a[list.size()];
        this.f7428a = interfaceC0024aArr;
        list.toArray(interfaceC0024aArr);
    }

    public a(Parcel parcel) {
        this.f7428a = new InterfaceC0024a[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0024a[] interfaceC0024aArr = this.f7428a;
            if (i >= interfaceC0024aArr.length) {
                return;
            }
            interfaceC0024aArr[i] = (InterfaceC0024a) parcel.readParcelable(InterfaceC0024a.class.getClassLoader());
            i++;
        }
    }
}
