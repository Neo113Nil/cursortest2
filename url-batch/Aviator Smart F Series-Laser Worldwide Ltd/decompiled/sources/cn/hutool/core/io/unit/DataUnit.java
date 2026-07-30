package cn.hutool.core.io.unit;

import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public enum DataUnit {
    BYTES("B", a.ofBytes(1)),
    KILOBYTES("KB", a.ofKilobytes(1)),
    MEGABYTES("MB", a.ofMegabytes(1)),
    GIGABYTES("GB", a.ofGigabytes(1)),
    TERABYTES("TB", a.ofTerabytes(1));

    public static final String[] UNIT_NAMES = {"B", "KB", "MB", "GB", "TB", "PB", "EB"};
    private final a size;
    private final String suffix;

    DataUnit(String str, a aVar) {
        this.suffix = str;
        this.size = aVar;
    }

    public static DataUnit fromSuffix(String str) {
        for (DataUnit dataUnit : values()) {
            if (l.startWithIgnoreCase(dataUnit.suffix, str)) {
                return dataUnit;
            }
        }
        throw new IllegalArgumentException("Unknown data unit suffix '" + str + "'");
    }

    a size() {
        return this.size;
    }
}
