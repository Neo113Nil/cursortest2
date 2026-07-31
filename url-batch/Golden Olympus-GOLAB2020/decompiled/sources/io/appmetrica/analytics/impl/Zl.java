package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Zl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f38644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38645b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f38646c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38647d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f38648e;

    public Zl(@NonNull C2562d4 c2562d4) {
        this(c2562d4.a().c(), c2562d4.a().d(), c2562d4.a().a(), c2562d4.a().h(), c2562d4.a().b());
    }

    public final boolean a(@NonNull Zl zl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Zl mergeFrom(@NonNull Zl zl) {
        return new Zl((String) WrapUtils.getOrDefaultNullable(this.f38644a, zl.f38644a), (String) WrapUtils.getOrDefaultNullable(this.f38645b, zl.f38645b), (Map) WrapUtils.getOrDefaultNullable(this.f38646c, zl.f38646c), this.f38647d || zl.f38647d, zl.f38647d ? zl.f38648e : this.f38648e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f38644a + "', installReferrerSource='" + this.f38645b + "', clientClids=" + this.f38646c + ", hasNewCustomHosts=" + this.f38647d + ", newCustomHosts=" + this.f38648e + '}';
    }

    public Zl(String str, String str2, Map<String, String> map, boolean z4, List<String> list) {
        this.f38644a = str;
        this.f38645b = str2;
        this.f38646c = map;
        this.f38647d = z4;
        this.f38648e = list;
    }

    public Zl() {
        this(null, null, null, false, null);
    }
}
