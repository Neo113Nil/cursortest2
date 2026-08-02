package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Sn {

    /* renamed from: a, reason: collision with root package name */
    public final In f6664a;

    /* renamed from: b, reason: collision with root package name */
    public final V f6665b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6666c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6667d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6668e;
    public final Map f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6669g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f6670h;

    public Sn(In in, V v, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f6664a = in;
        this.f6665b = v;
        this.f6666c = arrayList;
        this.f6667d = str;
        this.f6668e = str2;
        this.f = map;
        this.f6669g = str3;
        this.f6670h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        In in = this.f6664a;
        if (in != null) {
            for (Hl hl : in.f6178c) {
                sb.append("at " + hl.f6095a + "." + hl.f6099e + "(" + hl.f6096b + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f6097c + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f6098d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f6664a + IOUtils.LINE_SEPARATOR_UNIX + sb.toString() + '}';
    }
}
