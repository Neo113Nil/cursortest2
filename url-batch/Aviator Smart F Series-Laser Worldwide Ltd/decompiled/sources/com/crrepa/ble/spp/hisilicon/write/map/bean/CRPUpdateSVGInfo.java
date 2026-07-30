package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPUpdateSVGInfo {
    private int error_code;
    private ResultBean result;

    public static class ResultBean {
        private String coord;
        private String svg;
        private String time;

        public String getCoord() {
            return this.coord;
        }

        public String getSvg() {
            return this.svg;
        }

        public String getTime() {
            return this.time;
        }

        public void setCoord(String str) {
            this.coord = str;
        }

        public void setSvg(String str) {
            this.svg = str;
        }

        public void setTime(String str) {
            this.time = str;
        }
    }

    public int getError_code() {
        return this.error_code;
    }

    public ResultBean getResult() {
        return this.result;
    }

    public void setError_code(int i8) {
        this.error_code = i8;
    }

    public void setResult(ResultBean resultBean) {
        this.result = resultBean;
    }
}
