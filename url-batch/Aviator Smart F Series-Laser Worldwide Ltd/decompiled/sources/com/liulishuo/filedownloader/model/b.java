package com.liulishuo.filedownloader.model;

/* loaded from: classes4.dex */
public class b {
    public static final byte INVALID_STATUS = 0;
    public static final byte blockComplete = 4;
    public static final byte completed = -3;
    public static final byte connected = 2;
    public static final byte error = -1;
    public static final byte paused = -2;
    public static final byte pending = 1;
    public static final byte progress = 3;
    public static final byte retry = 5;
    public static final byte started = 6;
    public static final byte toFileDownloadService = 11;
    public static final byte toLaunchPool = 10;
    public static final byte warn = -4;

    public static boolean isIng(int i8) {
        return i8 > 0;
    }

    public static boolean isKeepAhead(int i8, int i9) {
        if ((i8 != 3 && i8 != 5 && i8 == i9) || isOver(i8)) {
            return false;
        }
        if (i8 >= 1 && i8 <= 6 && i9 >= 10 && i9 <= 11) {
            return false;
        }
        if (i8 == 1) {
            return i9 != 0;
        }
        if (i8 == 2) {
            return (i9 == 0 || i9 == 1 || i9 == 6) ? false : true;
        }
        if (i8 == 3) {
            return (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 6) ? false : true;
        }
        if (i8 == 5) {
            return (i9 == 1 || i9 == 6) ? false : true;
        }
        if (i8 != 6) {
            return true;
        }
        return (i9 == 0 || i9 == 1) ? false : true;
    }

    public static boolean isKeepFlow(int i8, int i9) {
        if ((i8 != 3 && i8 != 5 && i8 == i9) || isOver(i8)) {
            return false;
        }
        if (i9 == -2 || i9 == -1) {
            return true;
        }
        if (i8 == 0) {
            return i9 == 10;
        }
        if (i8 == 1) {
            return i9 == 6;
        }
        if (i8 == 2 || i8 == 3) {
            return i9 == -3 || i9 == 3 || i9 == 5;
        }
        if (i8 == 5 || i8 == 6) {
            return i9 == 2 || i9 == 5;
        }
        if (i8 == 10) {
            return i9 == 11;
        }
        if (i8 != 11) {
            return false;
        }
        return i9 == -4 || i9 == -3 || i9 == 1;
    }

    public static boolean isMoreLikelyCompleted(com.liulishuo.filedownloader.a aVar) {
        return aVar.getStatus() == 0 || aVar.getStatus() == 3;
    }

    public static boolean isOver(int i8) {
        return i8 < 0;
    }
}
