package com.crrepa.ble.trans.watchface.entity;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NewSifliWatchFaceListEntity {
    private Integer code;
    private List<FacesBean> faces;
    private String message;
    private String page;
    private String per_page;
    private Integer total;

    public static class FacesBean {
        private String file;
        private Integer id;
        private String name;
        private String preview;
        private String remark_cn;
        private String remark_en;
        private Integer size;
        private Integer tpl;
        private List<Integer> tpls;

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

        public String getRemark_cn() {
            return this.remark_cn;
        }

        public String getRemark_en() {
            return this.remark_en;
        }

        public Integer getSize() {
            return this.size;
        }

        public Integer getTpl() {
            return this.tpl;
        }

        public List<Integer> getTpls() {
            return this.tpls;
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

        public void setRemark_cn(String str) {
            this.remark_cn = str;
        }

        public void setRemark_en(String str) {
            this.remark_en = str;
        }

        public void setSize(Integer num) {
            this.size = num;
        }

        public void setTpl(Integer num) {
            this.tpl = num;
        }

        public void setTpls(List<Integer> list) {
            this.tpls = list;
        }
    }

    public Integer getCode() {
        return this.code;
    }

    public List<FacesBean> getFaces() {
        return this.faces;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPage() {
        return this.page;
    }

    public String getPer_page() {
        return this.per_page;
    }

    public Integer getTotal() {
        return this.total;
    }

    public CRPWatchFaceStoreInfo getWatchFaceList() {
        List<FacesBean> faces;
        if (getCode().intValue() != 0 || (faces = getFaces()) == null || faces.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FacesBean facesBean : faces) {
            arrayList.add(new CRPWatchFaceStoreInfo.WatchFaceBean(facesBean.getId().intValue(), facesBean.getPreview(), facesBean.getFile()));
        }
        return new CRPWatchFaceStoreInfo(getTotal().intValue(), arrayList);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setFaces(List<FacesBean> list) {
        this.faces = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPage(String str) {
        this.page = str;
    }

    public void setPer_page(String str) {
        this.per_page = str;
    }

    public void setTotal(Integer num) {
        this.total = num;
    }
}
