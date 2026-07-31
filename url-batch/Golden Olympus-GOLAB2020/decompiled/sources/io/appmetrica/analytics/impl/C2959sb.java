package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2959sb implements Parcelable {
    public static final Parcelable.Creator<C2959sb> CREATOR = new C2933rb();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f39791a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39792b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f39793c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39794d;

    public C2959sb(W6 w6, List list, Map map, boolean z4) {
        this.f39792b = list;
        this.f39791a = w6;
        this.f39793c = map == null ? new HashMap() : new HashMap(map);
        this.f39794d = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f39791a);
        if (this.f39792b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f39792b));
        }
        HashMap hashMap = this.f39793c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Gm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f39794d);
        parcel.writeBundle(bundle);
    }

    public C2959sb(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(W6.class.getClassLoader());
        if (readBundle != null) {
            this.f39791a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f39792b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f39793c = Gm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f39794d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f39793c = new HashMap();
    }
}
