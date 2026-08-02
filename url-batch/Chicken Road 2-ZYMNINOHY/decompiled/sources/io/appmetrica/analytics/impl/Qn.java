package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Qn {

    /* renamed from: a, reason: collision with root package name */
    public final Gn f10850a;

    /* renamed from: b, reason: collision with root package name */
    public final V f10851b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10852c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10853d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10854e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f10855f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10856g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f10857h;

    public Qn(Gn gn, V v, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f10850a = gn;
        this.f10851b = v;
        this.f10852c = arrayList;
        this.f10853d = str;
        this.f10854e = str2;
        this.f10855f = map;
        this.f10856g = str3;
        this.f10857h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Gn gn = this.f10850a;
        if (gn != null) {
            for (Dl dl : gn.f10343c) {
                sb.append("at " + dl.f10218a + "." + dl.f10222e + "(" + dl.f10219b + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f10220c + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f10221d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f10850a + IOUtils.LINE_SEPARATOR_UNIX + sb.toString() + '}';
    }
}
