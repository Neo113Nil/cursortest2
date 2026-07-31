package com.chartboost.sdk.impl;

import java.util.Map;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class qi {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Map e;
    public final UUID f;

    public qi(String str, String str2, int i, String str3, Map extras, UUID uuid) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = extras;
        this.f = uuid;
    }

    public final qi a(String str, String str2, int i, String str3, Map extras, UUID uuid) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new qi(str, str2, i, str3, extras, uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        return Intrinsics.areEqual(this.a, qiVar.a) && Intrinsics.areEqual(this.b, qiVar.b) && this.c == qiVar.c && Intrinsics.areEqual(this.d, qiVar.d) && Intrinsics.areEqual(this.e, qiVar.e) && Intrinsics.areEqual(this.f, qiVar.f);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.c)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "TrackingEvent(event=" + this.a + ", url=" + this.b + ", level=" + this.c + ", offset=" + this.d + ", extras=" + this.e + ", uuid=" + this.f + ")";
    }

    public static /* synthetic */ qi a(qi qiVar, String str, String str2, int i, String str3, Map map, UUID uuid, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = qiVar.a;
        }
        if ((i2 & 2) != 0) {
            str2 = qiVar.b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = qiVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = qiVar.d;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            map = qiVar.e;
        }
        Map map2 = map;
        if ((i2 & 32) != 0) {
            uuid = qiVar.f;
        }
        return qiVar.a(str, str4, i3, str5, map2, uuid);
    }

    public final String e() {
        return this.b;
    }

    public final String a() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Map b() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ qi(String str, String str2, int i, String str3, Map map, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, r4, r5, uuid);
        String str4 = (i2 & 8) != 0 ? null : str3;
        Map emptyMap = (i2 & 16) != 0 ? MapsKt.emptyMap() : map;
        if ((i2 & 32) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
    }
}
