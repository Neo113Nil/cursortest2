package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class SupportWatchFaceListEntity {
    private int code;
    private String current_page;
    private List<FacesBean> faces;
    private String message;
    private String per_page;
    private int total;

    public static class FacesBean {
        private String file;
        private int id;
        private String preview;

        public String getFile() {
            return this.file;
        }

        public int getId() {
            return this.id;
        }

        public String getPreview() {
            return this.preview;
        }

        public void setFile(String str) {
            this.file = str;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setPreview(String str) {
            this.preview = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getCurrent_page() {
        return this.current_page;
    }

    public List<FacesBean> getFaces() {
        return this.faces;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPer_page() {
        return this.per_page;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setCurrent_page(String str) {
        this.current_page = str;
    }

    public void setFaces(List<FacesBean> list) {
        this.faces = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPer_page(String str) {
        this.per_page = str;
    }

    public void setTotal(int i8) {
        this.total = i8;
    }
}
