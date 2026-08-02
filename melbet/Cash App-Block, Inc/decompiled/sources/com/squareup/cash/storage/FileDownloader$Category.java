package com.squareup.cash.storage;

/* loaded from: classes6.dex */
public enum FileDownloader$Category {
    /* JADX INFO: Fake field, exist only in values array */
    FULLSCREEN_AD("fullscreenad"),
    CASH_QR("cashqr"),
    SHARE_SHEET("sharesheet"),
    DDA_FORM("ddaform"),
    DOCUMENTS("documents"),
    SCRIPT("script"),
    SHIFTS("shifts");

    public final String folderName;

    FileDownloader$Category(String str) {
        this.folderName = str;
    }

    public final String getFolderName() {
        return this.folderName;
    }
}
