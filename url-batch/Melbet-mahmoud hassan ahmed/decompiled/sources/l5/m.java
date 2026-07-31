package l5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final m5.a<Object> f18750a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final m5.a<Object> f18751a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, Object> f18752b = new HashMap();

        a(m5.a<Object> aVar) {
            this.f18751a = aVar;
        }

        public void a() {
            z4.b.e("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f18752b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f18752b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f18752b.get("platformBrightness"));
            this.f18751a.c(this.f18752b);
        }

        public a b(boolean z6) {
            this.f18752b.put("brieflyShowPassword", Boolean.valueOf(z6));
            return this;
        }

        public a c(boolean z6) {
            this.f18752b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z6));
            return this;
        }

        public a d(b bVar) {
            this.f18752b.put("platformBrightness", bVar.f18756f);
            return this;
        }

        public a e(float f7) {
            this.f18752b.put("textScaleFactor", Float.valueOf(f7));
            return this;
        }

        public a f(boolean z6) {
            this.f18752b.put("alwaysUse24HourFormat", Boolean.valueOf(z6));
            return this;
        }
    }

    public enum b {
        light("light"),
        dark("dark");


        /* renamed from: f, reason: collision with root package name */
        public String f18756f;

        b(String str) {
            this.f18756f = str;
        }
    }

    public m(a5.a aVar) {
        this.f18750a = new m5.a<>(aVar, "flutter/settings", m5.f.f19245a);
    }

    public a a() {
        return new a(this.f18750a);
    }
}
