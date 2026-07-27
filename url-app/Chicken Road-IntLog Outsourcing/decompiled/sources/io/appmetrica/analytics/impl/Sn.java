package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Sn {

    /* renamed from: a, reason: collision with root package name */
    public final In f7491a;

    /* renamed from: b, reason: collision with root package name */
    public final V f7492b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7493c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7494d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7495e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f7496f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7497g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f7498h;

    public Sn(In in, V v4, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f7491a = in;
        this.f7492b = v4;
        this.f7493c = arrayList;
        this.f7494d = str;
        this.f7495e = str2;
        this.f7496f = map;
        this.f7497g = str3;
        this.f7498h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        In in = this.f7491a;
        if (in != null) {
            for (Hl hl : in.f6979c) {
                sb.append("at " + hl.f6890a + "." + hl.f6894e + "(" + hl.f6891b + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f6892c + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f6893d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f7491a + "\n" + sb.toString() + '}';
    }
}
