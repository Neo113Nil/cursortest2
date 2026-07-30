package com.moyoung.lib.ai.img;

import com.moyoung.lib.ai.a;

/* loaded from: classes4.dex */
public class f extends com.moyoung.lib.ai.a {
    private final String imgFileDir;
    private final String prompt;
    private final String size;
    private final String style;

    public static class a extends a.AbstractC0303a {
        private String imgFileDir;
        private String prompt;
        private String style = "";
        private String size = "768*768";

        public a setImgFileDir(String str) {
            this.imgFileDir = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public a setLanguage(String str) {
            this.language = str;
            return this;
        }

        public a setPrompt(String str) {
            this.prompt = str;
            return this;
        }

        public a setSize(String str) {
            this.size = str;
            return this;
        }

        public a setStyle(String str) {
            this.style = str;
            return this;
        }

        @Override // com.moyoung.lib.ai.a.AbstractC0303a
        public f build() {
            return new f(getLanguage(), this.prompt, this.imgFileDir, this.style, this.size);
        }
    }

    public f(String str, String str2, String str3, String str4, String str5) {
        super(str);
        this.prompt = str2;
        this.imgFileDir = str3;
        this.style = str4;
        this.size = str5;
    }

    public String getImgFileDir() {
        return this.imgFileDir;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public String getSize() {
        return this.size;
    }

    public String getStyle() {
        return this.style;
    }
}
