package com.crrepa.ble.sifli.dfu;

/* loaded from: classes3.dex */
public class OTAFile {
    private byte[] fileData;
    private String fileExtension;
    private int fileIndex;
    private String fileName;
    private int fileOrder;
    private String filePath;
    private int imageID;
    private String listName;

    public OTAFile(String str, byte[] bArr, String str2) {
        this.filePath = str;
        this.fileData = bArr;
        this.fileName = str2;
        this.imageID = -2;
        int indexOf = str2.indexOf(".");
        if (indexOf == -1) {
            this.fileExtension = "any";
            this.listName = str2;
            return;
        }
        String substring = str2.substring(indexOf + 1);
        this.fileExtension = substring;
        substring.toLowerCase();
        this.listName = str2.substring(0, indexOf - 4);
        this.listName += "." + this.fileExtension;
    }

    public byte[] getFileData() {
        return this.fileData;
    }

    public String getFileExtension() {
        return this.fileExtension;
    }

    public int getFileIndex() {
        return this.fileIndex;
    }

    public int getFileLength() {
        return this.fileData.length;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getImageID() {
        return this.imageID;
    }

    public String getListName() {
        return this.listName;
    }

    public void setFileIndex(int i8) {
        this.fileIndex = i8;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setImageID(int i8) {
        this.imageID = i8;
    }

    public OTAFile(byte[] bArr, int i8) {
        this.fileData = bArr;
        this.imageID = i8;
    }

    public OTAFile(byte[] bArr, String str) {
        this.fileData = bArr;
        this.fileName = str;
    }
}
