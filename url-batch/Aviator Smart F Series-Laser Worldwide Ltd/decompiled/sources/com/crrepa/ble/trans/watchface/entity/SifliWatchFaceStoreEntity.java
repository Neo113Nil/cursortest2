package com.crrepa.ble.trans.watchface.entity;

import java.util.List;

/* loaded from: classes3.dex */
public class SifliWatchFaceStoreEntity {
    private int code;
    private List<FacesBean> faces;
    private String message;
    private int page;
    private int per_page;
    private int total;

    public static class FacesBean {
        private String file;
        private int id;
        private String name;
        private String preview;

        public String getFile() {
            return this.file;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
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

        public void setName(String str) {
            this.name = str;
        }

        public void setPreview(String str) {
            this.preview = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public List<FacesBean> getFaces() {
        return this.faces;
    }

    public String getMessage() {
        return this.message;
    }

    public int getPage() {
        return this.page;
    }

    public int getPer_page() {
        return this.per_page;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setFaces(List<FacesBean> list) {
        this.faces = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPage(int i8) {
        this.page = i8;
    }

    public void setPer_page(int i8) {
        this.per_page = i8;
    }

    public void setTotal(int i8) {
        this.total = i8;
    }
}
