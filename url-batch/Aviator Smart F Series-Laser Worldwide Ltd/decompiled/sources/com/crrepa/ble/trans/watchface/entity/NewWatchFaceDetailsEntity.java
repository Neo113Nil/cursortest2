package com.crrepa.ble.trans.watchface.entity;

import com.crrepa.ble.conn.bean.CRPWatchFaceDetailsInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NewWatchFaceDetailsEntity {
    private Integer code;
    private DataBean data;
    private String message;

    public static class DataBean {
        private Integer download;
        private List<FaceListBean> face_list;
        private String file;
        private Integer id;
        private String name;
        private String preview;
        private String remark_cn;
        private String remark_en;
        private Integer size;

        public static class FaceListBean {
            private Integer id;
            private String name;
            private String preview;
            private Integer size;

            public Integer getId() {
                return this.id;
            }

            public String getName() {
                return this.name;
            }

            public String getPreview() {
                return this.preview;
            }

            public Integer getSize() {
                return this.size;
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

            public void setSize(Integer num) {
                this.size = num;
            }
        }

        public Integer getDownload() {
            return this.download;
        }

        public List<FaceListBean> getFace_list() {
            return this.face_list;
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

        public String getRemark_cn() {
            return this.remark_cn;
        }

        public String getRemark_en() {
            return this.remark_en;
        }

        public Integer getSize() {
            return this.size;
        }

        public void setDownload(Integer num) {
            this.download = num;
        }

        public void setFace_list(List<FaceListBean> list) {
            this.face_list = list;
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

    public CRPWatchFaceDetailsInfo getWatchFaceDetailsInfo() {
        DataBean data;
        if (getCode().intValue() != 0 || (data = getData()) == null) {
            return null;
        }
        CRPWatchFaceDetailsInfo cRPWatchFaceDetailsInfo = new CRPWatchFaceDetailsInfo();
        cRPWatchFaceDetailsInfo.setId(data.getId().intValue());
        cRPWatchFaceDetailsInfo.setDownload(data.getDownload().intValue());
        cRPWatchFaceDetailsInfo.setFile(data.getFile());
        cRPWatchFaceDetailsInfo.setName(data.getName());
        cRPWatchFaceDetailsInfo.setPreview(data.getPreview());
        cRPWatchFaceDetailsInfo.setSize(data.getSize().intValue());
        cRPWatchFaceDetailsInfo.setRemark(data.getRemark_en());
        List<DataBean.FaceListBean> face_list = data.getFace_list();
        ArrayList arrayList = new ArrayList();
        if (face_list != null && !face_list.isEmpty()) {
            for (DataBean.FaceListBean faceListBean : face_list) {
                CRPWatchFaceDetailsInfo.WatchFaceBean watchFaceBean = new CRPWatchFaceDetailsInfo.WatchFaceBean();
                watchFaceBean.setId(faceListBean.getId().intValue());
                watchFaceBean.setName(faceListBean.getName());
                watchFaceBean.setPreview(faceListBean.getPreview());
                watchFaceBean.setSize(faceListBean.getSize().intValue());
                arrayList.add(watchFaceBean);
            }
        }
        cRPWatchFaceDetailsInfo.setRecommendWatchFaceList(arrayList);
        return cRPWatchFaceDetailsInfo;
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
}
