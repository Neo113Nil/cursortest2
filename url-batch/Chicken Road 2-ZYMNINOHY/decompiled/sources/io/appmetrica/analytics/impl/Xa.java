package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Xa implements Parcelable {
    public static final Parcelable.Creator<Xa> CREATOR = new Wa();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f11258a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11259b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11260c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11261d;

    public Xa(B6 b6, List list, Map map, boolean z) {
        this.f11259b = list;
        this.f11258a = b6;
        this.f11260c = map == null ? new HashMap() : new HashMap(map);
        this.f11261d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f11258a);
        if (this.f11259b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f11259b));
        }
        HashMap hashMap = this.f11260c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Fm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f11261d);
        parcel.writeBundle(bundle);
    }

    public Xa(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(B6.class.getClassLoader());
        if (readBundle != null) {
            this.f11258a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f11259b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f11260c = Fm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f11261d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f11260c = new HashMap();
    }
}
