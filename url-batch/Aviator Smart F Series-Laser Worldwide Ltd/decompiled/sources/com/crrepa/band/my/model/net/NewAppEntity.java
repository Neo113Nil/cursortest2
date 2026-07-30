package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class NewAppEntity {
    public static final int APP_INSTALL_TYPE = 1;
    public static final int BROWSER_INSTALL_TYPE = 0;
    public static final int FORCE_UPDATE_TYPE = 1;
    public static final int MANUAL_UPDATE_TYPE = 2;
    public static final int RECOMMENDED_UPDATE_TYPE = 0;
    public static final int STORE_INSTALL_TYPE = 2;
    private Integer code;
    private DataBean data;

    public static class DataBean {
        private String android_url;
        private List<String> channel;
        private String detail;
        private Integer intent_type;
        private Integer update_type;
        private Integer version_code;
        private String version_name;

        public String getAndroid_url() {
            return this.android_url;
        }

        public List<String> getChannel() {
            return this.channel;
        }

        public String getDetail() {
            return this.detail;
        }

        public Integer getIntent_type() {
            return this.intent_type;
        }

        public Integer getUpdate_type() {
            return this.update_type;
        }

        public Integer getVersion_code() {
            return this.version_code;
        }

        public String getVersion_name() {
            return this.version_name;
        }

        public void setAndroid_url(String str) {
            this.android_url = str;
        }

        public void setChannel(List<String> list) {
            this.channel = list;
        }

        public void setDetail(String str) {
            this.detail = str;
        }

        public void setIntent_type(Integer num) {
            this.intent_type = num;
        }

        public void setUpdate_type(Integer num) {
            this.update_type = num;
        }

        public void setVersion_code(Integer num) {
            this.version_code = num;
        }

        public void setVersion_name(String str) {
            this.version_name = str;
        }
    }

    public Integer getCode() {
        return this.code;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public String toString() {
        return "NewAppEntity{code=" + this.code + ", data=" + this.data + '}';
    }
}
