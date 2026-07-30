package com.moyoung.lib.ai.tts;

import com.moyoung.lib.ai.a;

/* loaded from: classes4.dex */
public class d extends com.moyoung.lib.ai.a {
    private final String format;
    private final Float speed;
    private final String voice;

    public static class a extends a.AbstractC0303a {
        private String format;
        private Float speed;
        private String voice;

        public a setFormat(String str) {
            this.format = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public a setLanguage(String str) {
            this.language = str;
            return this;
        }

        public a setSpeed(Float f8) {
            this.speed = f8;
            return this;
        }

        public a setVoice(String str) {
            this.voice = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public d build() {
            return new d(getLanguage(), this.voice, this.format, this.speed);
        }
    }

    public d(String str, String str2, String str3, Float f8) {
        super(str);
        this.voice = str2;
        this.format = str3;
        this.speed = f8;
    }

    public String getFormat() {
        return this.format;
    }

    public Float getSpeed() {
        return this.speed;
    }

    public String getVoice() {
        return this.voice;
    }
}
