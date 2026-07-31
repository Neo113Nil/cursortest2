package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class wf {
    public static final a p = new a(null);
    public static final b q = b.e;
    public final String a;
    public final String b;
    public final Map c;
    public final long d;
    public final n5 e;
    public final List f;
    public final nj g;
    public final c9 h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final b m;
    public final Integer n;
    public final Integer o;

    public wf(String adm, String markupType, Map ext, long j, n5 n5Var, List eventTrackers, nj njVar, c9 c9Var, int i, boolean z, boolean z2, boolean z3, b fitType, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(ext, "ext");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        Intrinsics.checkNotNullParameter(fitType, "fitType");
        this.a = adm;
        this.b = markupType;
        this.c = ext;
        this.d = j;
        this.e = n5Var;
        this.f = eventTrackers;
        this.g = njVar;
        this.h = c9Var;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = fitType;
        this.n = num;
        this.o = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return Intrinsics.areEqual(this.a, wfVar.a) && Intrinsics.areEqual(this.b, wfVar.b) && Intrinsics.areEqual(this.c, wfVar.c) && this.d == wfVar.d && Intrinsics.areEqual(this.e, wfVar.e) && Intrinsics.areEqual(this.f, wfVar.f) && Intrinsics.areEqual(this.g, wfVar.g) && Intrinsics.areEqual(this.h, wfVar.h) && this.i == wfVar.i && this.j == wfVar.j && this.k == wfVar.k && this.l == wfVar.l && this.m == wfVar.m && Intrinsics.areEqual(this.n, wfVar.n) && Intrinsics.areEqual(this.o, wfVar.o);
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Long.hashCode(this.d)) * 31;
        n5 n5Var = this.e;
        int hashCode2 = (((hashCode + (n5Var == null ? 0 : n5Var.hashCode())) * 31) + this.f.hashCode()) * 31;
        nj njVar = this.g;
        int hashCode3 = (hashCode2 + (njVar == null ? 0 : njVar.hashCode())) * 31;
        c9 c9Var = this.h;
        int hashCode4 = (((((((((((hashCode3 + (c9Var == null ? 0 : c9Var.hashCode())) * 31) + Integer.hashCode(this.i)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.k)) * 31) + Boolean.hashCode(this.l)) * 31) + this.m.hashCode()) * 31;
        Integer num = this.n;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "RenderableConfig(adm=" + this.a + ", markupType=" + this.b + ", ext=" + this.c + ", autoAdvanceTime=" + this.d + ", countdown=" + this.e + ", eventTrackers=" + this.f + ", vast=" + this.g + ", html=" + this.h + ", ignoreSafeAreaFlags=" + this.i + ", dedupeClicks=" + this.j + ", resetUserClickDetectorAfterClick=" + this.k + ", optional=" + this.l + ", fitType=" + this.m + ", height=" + this.n + ", width=" + this.o + ")";
    }

    public final String b() {
        return this.a;
    }

    public final String l() {
        return this.b;
    }

    public final Map g() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final n5 d() {
        return this.e;
    }

    public final List f() {
        return this.f;
    }

    public final nj o() {
        return this.g;
    }

    public final c9 j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean n() {
        return this.k;
    }

    public final boolean m() {
        return this.l;
    }

    public final b h() {
        return this.m;
    }

    public final Integer i() {
        return this.n;
    }

    public final Integer p() {
        return this.o;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final a c;
        public static final b d = new b("ASPECT", 0, "aspect");
        public static final b e = new b("FILL", 1, "fill");
        public static final b f = new b("FIXED", 2, "fixed");
        public static final /* synthetic */ b[] g;
        public static final /* synthetic */ EnumEntries h;
        public final String b;

        static {
            b[] a2 = a();
            g = a2;
            h = EnumEntriesKt.enumEntries(a2);
            c = new a(null);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{d, e, f};
        }

        public static EnumEntries b() {
            return h;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }

        public b(String str, int i, String str2) {
            this.b = str2;
        }

        public final String c() {
            return this.b;
        }

        public static final class a {
            public final b a(String str) {
                Object obj;
                Iterator<E> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((b) obj).c(), str)) {
                        break;
                    }
                }
                b bVar = (b) obj;
                return bVar == null ? b.e : bVar;
            }

            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static final class a {
        public final wf a(JSONObject jsonObject) {
            Iterator<String> keys;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject jSONObject = jsonObject.getJSONObject("config");
            List a = t7.a(jSONObject.optJSONArray("event_trackers"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject optJSONObject = jsonObject.optJSONObject("ext");
            if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkNotNull(next);
                    Object obj = optJSONObject.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    linkedHashMap.put(next, obj);
                }
            }
            String string = jsonObject.getString("adm");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("markup_type");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            long optLong = jSONObject.optLong("auto_advance_time", -1L);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("countdown");
            n5 a2 = optJSONObject2 != null ? n5.c.a(optJSONObject2) : null;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("vast");
            nj a3 = optJSONObject3 != null ? nj.g.a(optJSONObject3) : null;
            JSONObject optJSONObject4 = jSONObject.optJSONObject("html");
            return new wf(string, string2, linkedHashMap, optLong, a2, a, a3, optJSONObject4 != null ? c9.g.a(optJSONObject4) : null, jSONObject.optInt("ignore_safe_area", 0), jSONObject.optBoolean("dedupe_clicks", true), jSONObject.optBoolean("reset_user_click_detector_after_click", false), jSONObject.optBoolean("optional", false), jSONObject.has("fit_type") ? b.c.a(jSONObject.getString("fit_type")) : wf.q, (!jSONObject.has("height") || jSONObject.isNull("height")) ? null : Integer.valueOf(jSONObject.getInt("height")), (!jSONObject.has("width") || jSONObject.isNull("width")) ? null : Integer.valueOf(jSONObject.getInt("width")));
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ wf(String str, String str2, Map map, long j, n5 n5Var, List list, nj njVar, c9 c9Var, int i, boolean z, boolean z2, boolean z3, b bVar, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? null : n5Var, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : njVar, (i2 & 128) != 0 ? null : c9Var, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? b.e : bVar, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : num2);
    }
}
