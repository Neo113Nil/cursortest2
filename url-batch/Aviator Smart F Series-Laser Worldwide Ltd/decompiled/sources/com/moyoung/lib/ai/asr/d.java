package com.moyoung.lib.ai.asr;

import com.moyoung.lib.ai.a;

/* loaded from: classes4.dex */
public class d extends com.moyoung.lib.ai.a {
    private final String audioFilePath;

    public static class a extends a.AbstractC0303a {
        private String audioFilePath;

        public a setAudioFilePath(String str) {
            this.audioFilePath = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public a setLanguage(String str) {
            this.language = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public d build() {
            return new d(getLanguage(), this.audioFilePath);
        }
    }

    public d(String str, String str2) {
        super(str);
        this.audioFilePath = str2;
    }

    public String getAudioFilePath() {
        return this.audioFilePath;
    }
}
