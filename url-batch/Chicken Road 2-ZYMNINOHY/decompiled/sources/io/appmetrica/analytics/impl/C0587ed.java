package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import t3.C1442b;
import t3.C1443c;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587ed implements Tj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1009ul f11787a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11788b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f11789c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11790d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11791e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11792f;

    public C0587ed(InterfaceC1009ul interfaceC1009ul, String str, SystemTimeProvider systemTimeProvider, List<C0510bd> list) {
        this.f11787a = interfaceC1009ul;
        this.f11788b = str;
        this.f11789c = systemTimeProvider;
        this.f11790d = list;
        this.f11791e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f11792f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Sj a() {
        List N4;
        C0975td c0975td;
        C0510bd c0510bd;
        if (!this.f11790d.isEmpty()) {
            List list = this.f11790d;
            C0562dd c0562dd = new C0562dd();
            kotlin.jvm.internal.i.e(list, "<this>");
            if (list.size() <= 1) {
                N4 = d3.i.n0(list);
            } else {
                Object[] array = list.toArray(new Object[0]);
                kotlin.jvm.internal.i.e(array, "<this>");
                if (array.length > 1) {
                    Arrays.sort(array, c0562dd);
                }
                N4 = d3.g.N(array);
            }
            String c4 = ((AbstractC1105yd) this.f11787a).c(this.f11791e, (String) null);
            if (c4 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c4);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    C1443c H4 = O3.d.H(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(d3.k.Y(H4));
                    Iterator it = H4.iterator();
                    while (((C1442b) it).f15429c) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(((C1442b) it).nextInt());
                        try {
                            c0510bd = new C0510bd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                        } catch (Throwable unused) {
                            c0510bd = new C0510bd("", false);
                        }
                        arrayList.add(c0510bd);
                    }
                    c0975td = new C0975td(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    c0975td = new C0975td(d3.q.f8333a, 0L);
                }
            } else {
                c0975td = null;
            }
            long currentTimeMillis = this.f11789c.currentTimeMillis();
            if (c0975td == null || currentTimeMillis - c0975td.f12780b > this.f11792f || !N4.equals(c0975td.f12779a)) {
                C0975td c0975td2 = new C0975td(N4, currentTimeMillis);
                InterfaceC1009ul interfaceC1009ul = this.f11787a;
                AbstractC1105yd abstractC1105yd = (AbstractC1105yd) interfaceC1009ul;
                return new Sj(AbstractC0005f.q(new StringBuilder(), this.f11788b, "_status"), c0975td2.a());
            }
        }
        return null;
    }

    public /* synthetic */ C0587ed(InterfaceC1009ul interfaceC1009ul, String str, SystemTimeProvider systemTimeProvider, List list, int i4, kotlin.jvm.internal.e eVar) {
        this(interfaceC1009ul, str, (i4 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
