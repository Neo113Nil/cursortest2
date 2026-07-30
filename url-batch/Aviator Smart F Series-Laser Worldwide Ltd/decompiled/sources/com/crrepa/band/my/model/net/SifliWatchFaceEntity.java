package com.crrepa.band.my.model.net;

/* loaded from: classes2.dex */
public class SifliWatchFaceEntity {
    private int code;
    private DataBean data;
    private String message;

    public static class DataBean {
        private String file;
        private int id;
        private String name;
        private String preview;
        private int size;

        public static class TagsBean {
            private int id;
            private String tag_name;

            public int getId() {
                return this.id;
            }

            public String getTag_name() {
                return this.tag_name;
            }

            public void setId(int i8) {
                this.id = i8;
            }

            public void setTag_name(String str) {
                this.tag_name = str;
            }
        }

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

        public int getSize() {
            return this.size;
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

        public void setSize(int i8) {
            this.size = i8;
        }
    }

    public int getCode() {
        return this.code;
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
