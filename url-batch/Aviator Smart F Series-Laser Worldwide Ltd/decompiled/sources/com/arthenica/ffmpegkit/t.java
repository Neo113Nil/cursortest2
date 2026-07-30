package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class t {
    public static int CANCEL = 255;
    public static int SUCCESS;
    private final int value;

    public t(int i8) {
        this.value = i8;
    }

    public static boolean isCancel(t tVar) {
        return tVar != null && tVar.getValue() == CANCEL;
    }

    public static boolean isSuccess(t tVar) {
        return tVar != null && tVar.getValue() == SUCCESS;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isValueCancel() {
        return this.value == CANCEL;
    }

    public boolean isValueError() {
        int i8 = this.value;
        return (i8 == SUCCESS || i8 == CANCEL) ? false : true;
    }

    public boolean isValueSuccess() {
        return this.value == SUCCESS;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
