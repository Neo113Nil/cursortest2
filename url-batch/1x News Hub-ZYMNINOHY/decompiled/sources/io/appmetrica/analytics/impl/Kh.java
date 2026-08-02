package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Kh extends P3 {

    /* renamed from: c, reason: collision with root package name */
    protected I8 f6234c;

    /* renamed from: d, reason: collision with root package name */
    protected C1009zf f6235d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6236e;
    public String f;

    public Kh(Gf gf, CounterConfiguration counterConfiguration, I8 i8) {
        this(gf, counterConfiguration, i8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f6428b.toBundle(bundle);
        Gf gf = this.f6427a;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        return bundle;
    }

    public final synchronized String d() {
        I8 i8;
        i8 = this.f6234c;
        return i8.f6140a.isEmpty() ? null : new JSONObject(i8.f6140a).toString();
    }

    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.f6236e;
    }

    public Kh(Gf gf, CounterConfiguration counterConfiguration, I8 i8, String str) {
        super(gf, counterConfiguration);
        this.f6236e = true;
        this.f = str;
        this.f6234c = i8;
    }
}
