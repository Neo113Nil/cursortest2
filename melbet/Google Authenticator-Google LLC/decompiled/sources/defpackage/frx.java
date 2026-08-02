package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dtk(9);
    public final AtomicBoolean a;
    private final ConcurrentHashMap b;

    public frx(Parcel parcel) {
        this.a = new AtomicBoolean(false);
        Bundle bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        this.b = new ConcurrentHashMap();
        for (String str : bundle.keySet()) {
            this.b.put(str, bundle.getString(str));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        parcel.writeParcelable(bundle, 0);
    }

    public frx() {
        this.a = new AtomicBoolean(false);
        this.b = new ConcurrentHashMap();
    }
}
