package cn.hutool.core.io.file;

/* loaded from: classes.dex */
public enum LineSeparator {
    MAC("\r"),
    LINUX("\n"),
    WINDOWS("\r\n");

    private final String value;

    LineSeparator(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
