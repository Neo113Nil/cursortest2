package com.crrepa.ble.trans.watchface.entity;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NewJieliWatchFaceListEntity {
    private Integer code;
    private List<DataBean> data;
    private String message;
    private Integer total;

    public static class DataBean {
        private Integer api_ver;
        private Integer download;
        private Integer func_ver;
        private Integer id;
        private String name;
        private String preview;
        private Integer size;

        public Integer getApi_ver() {
            return this.api_ver;
        }

        public Integer getDownload() {
            return this.download;
        }

        public Integer getFunc_ver() {
            return this.func_ver;
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

        public void setApi_ver(Integer num) {
            this.api_ver = num;
        }

        public void setDownload(Integer num) {
            this.download = num;
        }

        public void setFunc_ver(Integer num) {
            this.func_ver = num;
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

    public Integer getCode() {
        return this.code;
    }

    public List<DataBean> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getTotal() {
        return this.total;
    }

    public CRPWatchFaceStoreInfo getWatchFaceList() {
        List<DataBean> data;
        if (getCode().intValue() != 0 || (data = getData()) == null || data.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DataBean dataBean : data) {
            arrayList.add(new CRPWatchFaceStoreInfo.WatchFaceBean(dataBean.getId().intValue(), dataBean.getPreview(), ""));
        }
        return new CRPWatchFaceStoreInfo(getTotal().intValue(), arrayList);
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

    public void setTotal(Integer num) {
        this.total = num;
    }
}
