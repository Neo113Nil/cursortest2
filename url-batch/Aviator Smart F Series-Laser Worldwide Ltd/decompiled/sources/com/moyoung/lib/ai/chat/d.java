package com.moyoung.lib.ai.chat;

import com.moyoung.lib.ai.a;

/* loaded from: classes4.dex */
public class d extends com.moyoung.lib.ai.a {
    private final String audioFilePath;
    private final boolean isFromWatch;
    private final boolean isStream;
    private final int maxMsgCount;
    private final int maxTokens;
    private final String prompt;

    public static class a extends a.AbstractC0303a {
        private String audioFilePath;
        private boolean isFromWatch;
        private boolean isStream;
        private int maxMsgCount;
        private int maxTokens;
        private String prompt;

        public a setAudioFilePath(String str) {
            this.audioFilePath = str;
            return this;
        }

        public a setIsFromWatch(boolean z7) {
            this.isFromWatch = z7;
            return this;
        }

        public a setIsStream(boolean z7) {
            this.isStream = z7;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public a setLanguage(String str) {
            this.language = str;
            return this;
        }

        public a setMaxMsgCount(int i8) {
            this.maxMsgCount = i8;
            return this;
        }

        public a setMaxTokens(int i8) {
            this.maxTokens = i8;
            return this;
        }

        public a setPrompt(String str) {
            this.prompt = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public d build() {
            return new d(getLanguage(), this.prompt, this.isStream, this.isFromWatch, this.maxTokens, this.maxMsgCount, this.audioFilePath);
        }
    }

    public d(String str, String str2, boolean z7, boolean z8, int i8, int i9, String str3) {
        super(str);
        this.prompt = str2;
        this.isStream = z7;
        this.isFromWatch = z8;
        this.maxTokens = i8;
        this.maxMsgCount = i9;
        this.audioFilePath = str3;
    }

    public String getAudioFilePath() {
        return this.audioFilePath;
    }

    public int getMaxMsgCount() {
        return this.maxMsgCount;
    }

    public int getMaxTokens() {
        return this.maxTokens;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public boolean isFromWatch() {
        return this.isFromWatch;
    }

    public boolean isStream() {
        return this.isStream;
    }
}
