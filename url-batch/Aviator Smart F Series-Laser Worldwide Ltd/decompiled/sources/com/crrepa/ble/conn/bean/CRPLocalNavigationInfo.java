package com.crrepa.ble.conn.bean;

import android.text.TextUtils;
import java.io.File;

/* loaded from: classes3.dex */
public class CRPLocalNavigationInfo {
    private String destPath;
    private File iconFile;
    private NavigationBean navigationBean;

    public static class NavigationBean {
        private String dirCode;
        private int dirRemainDist;
        private String iconPath;
        private int progress;
        private int remainDist;
        private int remainTime;
        private String roadDesc;

        public String getDirCode() {
            return this.dirCode;
        }

        public int getDirRemainDist() {
            return this.dirRemainDist;
        }

        public String getIconPath() {
            return this.iconPath;
        }

        public int getProgress() {
            return this.progress;
        }

        public int getRemainDist() {
            return this.remainDist;
        }

        public int getRemainTime() {
            return this.remainTime;
        }

        public String getRoadDesc() {
            return this.roadDesc;
        }

        public void setDirCode(String str) {
            this.dirCode = str;
        }

        public void setDirRemainDist(int i8) {
            this.dirRemainDist = i8;
        }

        public void setIconPath(String str) {
            this.iconPath = str;
        }

        public void setProgress(int i8) {
            this.progress = i8;
        }

        public void setRemainDist(int i8) {
            this.remainDist = i8;
        }

        public void setRemainTime(int i8) {
            this.remainTime = i8;
        }

        public void setRoadDesc(String str) {
            this.roadDesc = str;
        }
    }

    public CRPLocalNavigationInfo(File file, String str, NavigationBean navigationBean) {
        this.iconFile = file;
        this.destPath = str;
        this.navigationBean = navigationBean;
    }

    public String getDestPath() {
        return this.destPath;
    }

    public File getIconFile() {
        return this.iconFile;
    }

    public NavigationBean getNavigationBean() {
        return this.navigationBean;
    }

    public boolean isEmpty() {
        return this.iconFile == null || TextUtils.isEmpty(this.destPath) || this.navigationBean == null;
    }

    public void setDestPath(String str) {
        this.destPath = str;
    }

    public void setIconFile(File file) {
        this.iconFile = file;
    }

    public void setNavigationBean(NavigationBean navigationBean) {
        this.navigationBean = navigationBean;
    }

    public String toString() {
        return "CRPLocalNavigationInfo{iconFile=" + this.iconFile.getName() + ", destPath='" + this.destPath + "', navigationBean=" + this.navigationBean + '}';
    }
}
