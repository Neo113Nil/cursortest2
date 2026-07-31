package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Sh extends C2562d4 {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected W8 f38256c;

    /* renamed from: d, reason: collision with root package name */
    protected If f38257d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38258e;

    /* renamed from: f, reason: collision with root package name */
    public String f38259f;

    public Sh(@NonNull Pf pf, @NonNull CounterConfiguration counterConfiguration, @NonNull W8 w8) {
        this(pf, counterConfiguration, w8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f38818b.toBundle(bundle);
        Pf pf = this.f38817a;
        synchronized (pf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", pf);
        }
        return bundle;
    }

    public final synchronized String d() {
        W8 w8;
        w8 = this.f38256c;
        return w8.f38459a.isEmpty() ? null : new JSONObject(w8.f38459a).toString();
    }

    public final synchronized String e() {
        return this.f38259f;
    }

    public boolean f() {
        return this.f38258e;
    }

    public Sh(@NonNull Pf pf, @NonNull CounterConfiguration counterConfiguration, @NonNull W8 w8, String str) {
        super(pf, counterConfiguration);
        this.f38258e = true;
        this.f38259f = str;
        this.f38256c = w8;
    }
}
