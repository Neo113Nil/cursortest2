package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPSifliSupportWatchFaceInfo {
    private List<WatchFace> list;
    private int type;

    public enum InstalledState {
        INSTALLED((byte) 2),
        NOT_INSTALLED((byte) 1);

        private byte value;

        InstalledState(byte b8) {
            this.value = b8;
        }

        public static InstalledState getInstance(byte b8) {
            if (b8 == 1) {
                return NOT_INSTALLED;
            }
            if (b8 != 2) {
                return null;
            }
            return INSTALLED;
        }
    }

    public static class WatchFace {
        private int id;
        private InstalledState state;

        public WatchFace(InstalledState installedState, int i8) {
            this.state = installedState;
            this.id = i8;
        }

        public int getId() {
            return this.id;
        }

        public InstalledState getState() {
            return this.state;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setState(InstalledState installedState) {
            this.state = installedState;
        }

        public String toString() {
            return "WatchFace{state=" + this.state + ", id=" + this.id + '}';
        }
    }

    public CRPSifliSupportWatchFaceInfo(int i8, List<WatchFace> list) {
        this.type = i8;
        this.list = list;
    }

    public List<WatchFace> getList() {
        return this.list;
    }

    public int getType() {
        return this.type;
    }

    public void setList(List<WatchFace> list) {
        this.list = list;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public String toString() {
        return "CRPSifliSupportWatchFaceInfo{type=" + this.type + ", list=" + this.list + '}';
    }
}
