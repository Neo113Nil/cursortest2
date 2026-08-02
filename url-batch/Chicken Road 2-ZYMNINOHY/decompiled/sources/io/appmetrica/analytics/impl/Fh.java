package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Fh extends H3 {

    /* renamed from: c, reason: collision with root package name */
    protected D8 f10281c;

    /* renamed from: d, reason: collision with root package name */
    protected C1003uf f10282d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10283e;

    /* renamed from: f, reason: collision with root package name */
    public String f10284f;

    public Fh(Bf bf, CounterConfiguration counterConfiguration, D8 d8) {
        this(bf, counterConfiguration, d8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f10356b.toBundle(bundle);
        Bf bf = this.f10355a;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        return bundle;
    }

    public final synchronized String d() {
        D8 d8;
        d8 = this.f10281c;
        return d8.f10190a.isEmpty() ? null : new JSONObject(d8.f10190a).toString();
    }

    public final synchronized String e() {
        return this.f10284f;
    }

    public boolean f() {
        return this.f10283e;
    }

    public Fh(Bf bf, CounterConfiguration counterConfiguration, D8 d8, String str) {
        super(bf, counterConfiguration);
        this.f10283e = true;
        this.f10284f = str;
        this.f10281c = d8;
    }
}
