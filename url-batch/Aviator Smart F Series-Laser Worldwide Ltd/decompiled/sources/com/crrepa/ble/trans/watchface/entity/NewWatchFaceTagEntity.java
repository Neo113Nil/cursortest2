package com.crrepa.ble.trans.watchface.entity;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreTagInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NewWatchFaceTagEntity {
    private Integer code;
    private List<DataBean> data;
    private String message;

    public static class DataBean {
        private List<FacesBean> faces;
        private Integer id;
        private String tag_name;

        public static class FacesBean {
            private Integer download;
            private Integer id;
            private String name;
            private String preview;
            private Integer size;

            public Integer getDownload() {
                return this.download;
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

            public Integer getSize() {
                return this.size;
            }

            public void setDownload(Integer num) {
                this.download = num;
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

        public List<FacesBean> getFaces() {
            return this.faces;
        }

        public Integer getId() {
            return this.id;
        }

        public String getTag_name() {
            return this.tag_name;
        }

        public void setFaces(List<FacesBean> list) {
            this.faces = list;
        }

        public void setId(Integer num) {
            this.id = num;
        }

        public void setTag_name(String str) {
            this.tag_name = str;
        }
    }

    public Integer getCode() {
        return this.code;
    }

    public List<DataBean> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public List<CRPWatchFaceStoreTagInfo> getTagList() {
        ArrayList arrayList = null;
        if (getCode().intValue() != 0) {
            return null;
        }
        List<DataBean> data = getData();
        if (data != null && !data.isEmpty()) {
            arrayList = new ArrayList();
            for (DataBean dataBean : data) {
                ArrayList arrayList2 = new ArrayList();
                List<DataBean.FacesBean> faces = dataBean.getFaces();
                if (faces != null && !faces.isEmpty()) {
                    for (DataBean.FacesBean facesBean : faces) {
                        CRPWatchFaceStoreTagInfo.WatchFaceBean watchFaceBean = new CRPWatchFaceStoreTagInfo.WatchFaceBean();
                        watchFaceBean.setId(facesBean.getId());
                        watchFaceBean.setDownload(facesBean.getDownload());
                        watchFaceBean.setName(facesBean.getName());
                        watchFaceBean.setPreview(facesBean.getPreview());
                        watchFaceBean.setSize(facesBean.getSize());
                        arrayList2.add(watchFaceBean);
                    }
                }
                arrayList.add(new CRPWatchFaceStoreTagInfo(dataBean.getId().intValue(), dataBean.getTag_name(), arrayList2));
            }
        }
        return arrayList;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(List<DataBean> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
