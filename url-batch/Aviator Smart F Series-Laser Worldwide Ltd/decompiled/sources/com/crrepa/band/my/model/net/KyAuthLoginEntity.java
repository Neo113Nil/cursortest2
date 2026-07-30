package com.crrepa.band.my.model.net;

/* loaded from: classes2.dex */
public class KyAuthLoginEntity {
    private int code;
    private DataBean data;
    private String msg;

    public static class DataBean {
        private String publickey;

        public String getPublickey() {
            return this.publickey;
        }

        public void setPublickey(String str) {
            this.publickey = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
