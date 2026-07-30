package com.moyoung.lib.ai;

/* loaded from: classes4.dex */
public class a {
    private final String language;

    /* renamed from: com.moyoung.lib.ai.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0303a {
        protected String language;

        public a build() {
            return new a(getLanguage());
        }

        public String getLanguage() {
            String str = this.language;
            if (str == null || str.isEmpty()) {
                this.language = c.getCurrentLanguage();
            }
            return this.language;
        }

        public abstract AbstractC0303a setLanguage(String str);
    }

    public a(String str) {
        this.language = str;
    }

    public String getLanguage() {
        String str = this.language;
        return (str == null || str.isEmpty()) ? c.getCurrentLanguage() : this.language;
    }
}
