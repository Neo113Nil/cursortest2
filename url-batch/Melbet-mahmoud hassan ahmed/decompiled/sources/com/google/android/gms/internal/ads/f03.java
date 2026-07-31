package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class f03 extends g03 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f4932c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f4933d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f4934e;

    /* JADX WARN: Multi-variable type inference failed */
    public f03(yz2 yz2Var, yz2 yz2Var2, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(yz2Var, null);
        this.f4932c = new HashSet<>((Collection) yz2Var2);
        this.f4933d = hashSet;
        this.f4934e = jSONObject;
    }
}
