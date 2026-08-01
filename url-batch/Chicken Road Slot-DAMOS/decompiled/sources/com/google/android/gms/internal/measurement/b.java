package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b8.i f2153d = b8.i.m(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2156c;

    public b(String str, long j, HashMap hashMap) {
        this.f2154a = str;
        this.f2155b = j;
        HashMap hashMap2 = new HashMap();
        this.f2156c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f2153d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f2154a, this.f2155b, new HashMap(this.f2156c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2155b == bVar.f2155b && this.f2154a.equals(bVar.f2154a)) {
            return this.f2156c.equals(bVar.f2156c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2154a.hashCode() * 31;
        long j = this.f2155b;
        return this.f2156c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f2154a;
        String obj = this.f2156c.toString();
        int length = String.valueOf(str).length();
        long j = this.f2155b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
