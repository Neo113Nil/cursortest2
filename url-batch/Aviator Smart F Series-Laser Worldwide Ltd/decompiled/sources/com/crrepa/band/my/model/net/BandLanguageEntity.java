package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class BandLanguageEntity {
    private int code;
    private List<LangsBean> langs;

    public static class LangsBean {
        private int cmd;
        private String code;
        private String text;

        public int getCmd() {
            return this.cmd;
        }

        public String getCode() {
            return this.code;
        }

        public String getText() {
            return this.text;
        }

        public void setCmd(int i8) {
            this.cmd = i8;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public List<LangsBean> getLangs() {
        return this.langs;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setLangs(List<LangsBean> list) {
        this.langs = list;
    }
}
