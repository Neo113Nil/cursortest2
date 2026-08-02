package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463eb implements Parcelable {
    public static final Parcelable.Creator<C0463eb> CREATOR = new C0438db();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f7261a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7262b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7263c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7264d;

    public C0463eb(I6 i6, List list, Map map, boolean z) {
        this.f7262b = list;
        this.f7261a = i6;
        this.f7263c = map == null ? new HashMap() : new HashMap(map);
        this.f7264d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f7261a);
        if (this.f7262b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f7262b));
        }
        HashMap hashMap = this.f7263c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Jm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f7264d);
        parcel.writeBundle(bundle);
    }

    public C0463eb(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle != null) {
            this.f7261a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f7262b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f7263c = Jm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f7264d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f7263c = new HashMap();
    }
}
