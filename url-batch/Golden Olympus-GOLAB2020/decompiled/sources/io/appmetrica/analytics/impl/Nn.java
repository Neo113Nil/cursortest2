package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Nn {

    /* renamed from: a, reason: collision with root package name */
    public final Dn f38034a;

    /* renamed from: b, reason: collision with root package name */
    public final U f38035b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38036c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38037d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38038e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f38039f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38040g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f38041h;

    public Nn(Dn dn, U u4, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f38034a = dn;
        this.f38035b = u4;
        this.f38036c = arrayList;
        this.f38037d = str;
        this.f38038e = str2;
        this.f38039f = map;
        this.f38040g = str3;
        this.f38041h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Dn dn = this.f38034a;
        if (dn != null) {
            for (Dl dl : dn.f37386c) {
                sb.append("at " + dl.f37377a + "." + dl.f37381e + "(" + dl.f37378b + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f37379c + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f37380d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f38034a + "\n" + sb.toString() + '}';
    }
}
