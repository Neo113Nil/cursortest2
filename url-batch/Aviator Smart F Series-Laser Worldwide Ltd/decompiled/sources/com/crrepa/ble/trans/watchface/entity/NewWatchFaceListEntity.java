package com.crrepa.ble.trans.watchface.entity;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NewWatchFaceListEntity {
    private Integer code;
    private DataBean data;
    private String message;
    private Integer total;

    public static class DataBean {
        private Integer count;
        private List<FacesBean> faces;

        public static class FacesBean {
            private Integer download;
            private String file;
            private Integer id;
            private String name;
            private String preview;
            private String remark_en;
            private String remark_zh;
            private Object tpl;

            public Integer getDownload() {
                return this.download;
            }

            public String getFile() {
                return this.file;
            }

            public Integer getId() {
                return this.id;
            }

            public String getName() {
                return this.name;
            }

            public String getPreview() {
                return this.preview;
            }

            public String getRemark_en() {
                return this.remark_en;
            }

            public String getRemark_zh() {
                return this.remark_zh;
            }

            public Object getTpl() {
                return this.tpl;
            }

            public void setDownload(Integer num) {
                this.download = num;
            }

            public void setFile(String str) {
                this.file = str;
            }

            public void setId(Integer num) {
                this.id = num;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setPreview(String str) {
                this.preview = str;
            }

            public void setRemark_en(String str) {
                this.remark_en = str;
            }

            public void setRemark_zh(String str) {
                this.remark_zh = str;
            }

            public void setTpl(Object obj) {
                this.tpl = obj;
            }
        }

        public Integer getCount() {
            return this.count;
        }

        public List<FacesBean> getFaces() {
            return this.faces;
        }

        public void setCount(Integer num) {
            this.count = num;
        }

        public void setFaces(List<FacesBean> list) {
            this.faces = list;
        }
    }

    public Integer getCode() {
        return this.code;
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getTotal() {
        return this.total;
    }

    public CRPWatchFaceStoreInfo getWatchFaceList() {
        DataBean data;
        if (getCode().intValue() != 0 || (data = getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<DataBean.FacesBean> faces = data.getFaces();
        if (faces != null && !faces.isEmpty()) {
            for (DataBean.FacesBean facesBean : faces) {
                arrayList.add(new CRPWatchFaceStoreInfo.WatchFaceBean(facesBean.getId().intValue(), facesBean.getPreview(), facesBean.getFile()));
            }
        }
        return new CRPWatchFaceStoreInfo(data.getCount().intValue(), arrayList);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTotal(Integer num) {
        this.total = num;
    }
}
