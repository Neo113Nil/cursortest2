package io.flutter.plugins.googlemobileads;

import i3.e;
import java.util.Objects;

/* loaded from: classes.dex */
class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17484a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17485b;

    public e0(String str, String str2) {
        this.f17484a = str;
        this.f17485b = str2;
    }

    public i3.e a() {
        e.a aVar = new e.a();
        String str = this.f17484a;
        if (str != null) {
            aVar.c(str);
        }
        String str2 = this.f17485b;
        if (str2 != null) {
            aVar.b(str2);
        }
        return aVar.a();
    }

    public String b() {
        return this.f17485b;
    }

    public String c() {
        return this.f17484a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Objects.equals(e0Var.f17484a, this.f17484a) && Objects.equals(e0Var.f17485b, this.f17485b);
    }

    public int hashCode() {
        return Objects.hash(this.f17484a, this.f17485b);
    }
}
