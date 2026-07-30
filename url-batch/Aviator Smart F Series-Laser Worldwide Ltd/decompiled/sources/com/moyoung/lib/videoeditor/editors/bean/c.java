package com.moyoung.lib.videoeditor.editors.bean;

/* loaded from: classes4.dex */
public class c {
    public String inputFilePath;
    public String outputFilePath;
    int resizeHeight;
    int resizeWidth;
    int startX;
    int startY;

    public c(String str, String str2, int i8, int i9, int i10, int i11) {
        this.inputFilePath = str;
        this.outputFilePath = str2;
        this.resizeWidth = i8;
        this.resizeHeight = i9;
        this.startX = i10;
        this.startY = i11;
    }

    public static String getCropValue(c cVar) {
        return cVar.resizeWidth + ":" + cVar.resizeHeight + ":" + cVar.startX + ":" + cVar.startY;
    }
}
