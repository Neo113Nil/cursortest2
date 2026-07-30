package com.moyoung.lib.ai.asrstream;

import com.moyoung.lib.ai.a;

/* loaded from: classes4.dex */
public class b extends com.moyoung.lib.ai.a {
    private final int audioFs;
    private final int chunkInterval;
    private final int[] chunkSize;
    private final String clientInfo;
    private final String hotwords;
    private final boolean isSpeaking;
    private final boolean itn;
    private final String mode;
    private final String wavName;

    public static class a extends a.AbstractC0303a {
        private String mode = "2pass";
        private int[] chunkSize = {5, 10, 5};
        private int chunkInterval = 10;
        private String wavName = "microphone";
        private boolean isSpeaking = true;
        private String hotwords = "";
        private boolean itn = true;
        private int audioFs = 16000;
        private String clientInfo = "MO YOUNG Android Client v1.0.0";

        public a setAudioFs(int i8) {
            this.audioFs = i8;
            return this;
        }

        public a setChunkInterval(int i8) {
            this.chunkInterval = i8;
            return this;
        }

        public a setChunkSize(int[] iArr) {
            this.chunkSize = iArr;
            return this;
        }

        public a setClientInfo(String str) {
            this.clientInfo = str;
            return this;
        }

        public a setHotwords(String str) {
            this.hotwords = str;
            return this;
        }

        public a setItn(boolean z7) {
            this.itn = z7;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public a setLanguage(String str) {
            this.language = str;
            return this;
        }

        public a setMode(String str) {
            this.mode = str;
            return this;
        }

        public a setSpeaking(boolean z7) {
            this.isSpeaking = z7;
            return this;
        }

        public a setWavName(String str) {
            this.wavName = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public b build() {
            return new b(getLanguage(), this.mode, this.chunkSize, this.chunkInterval, this.wavName, this.isSpeaking, this.hotwords, this.itn, this.audioFs, this.clientInfo);
        }
    }

    public b(String str, String str2, int[] iArr, int i8, String str3, boolean z7, String str4, boolean z8, int i9, String str5) {
        super(str);
        this.mode = str2;
        this.chunkSize = iArr;
        this.chunkInterval = i8;
        this.wavName = str3;
        this.isSpeaking = z7;
        this.hotwords = str4;
        this.itn = z8;
        this.audioFs = i9;
        this.clientInfo = str5;
    }

    public int getAudioFs() {
        return this.audioFs;
    }

    public int getChunkInterval() {
        return this.chunkInterval;
    }

    public int[] getChunkSize() {
        return this.chunkSize;
    }

    public String getClientInfo() {
        return this.clientInfo;
    }

    public String getHotwords() {
        return this.hotwords;
    }

    public String getMode() {
        return this.mode;
    }

    public String getWavName() {
        return this.wavName;
    }

    public boolean isItn() {
        return this.itn;
    }

    public boolean isSpeaking() {
        return this.isSpeaking;
    }
}
