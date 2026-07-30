package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPFirmwareVersionInfo {
    private String changeNotes;
    private String changeNotesEn;
    private int mcu;
    private boolean tpUpgrade;
    private int type;
    private String version;

    public CRPFirmwareVersionInfo(String str, String str2, String str3, int i8, int i9, boolean z7) {
        this.version = str;
        this.changeNotes = str2;
        this.changeNotesEn = str3;
        this.type = i8;
        this.mcu = i9;
        this.tpUpgrade = z7;
    }

    public String getChangeNotes() {
        return this.changeNotes;
    }

    public String getChangeNotesEn() {
        return this.changeNotesEn;
    }

    public int getMcu() {
        return this.mcu;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isTpUpgrade() {
        return this.tpUpgrade;
    }

    public String toString() {
        return "CRPFirmwareVersionInfo{version='" + this.version + "', changeNotes='" + this.changeNotes + "', changeNotesEn='" + this.changeNotesEn + "', type=" + this.type + ", mcu=" + this.mcu + ", tpUpgrade=" + this.tpUpgrade + '}';
    }
}
