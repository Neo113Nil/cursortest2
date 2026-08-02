package com.squareup.cash.tabs.viewmodels;

/* loaded from: classes6.dex */
public final class TabToolbarViewModel$TabToolbarTitle$Icon {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IconType {
        public static final /* synthetic */ IconType[] $VALUES;
        public static final IconType QR_SCANNER;

        static {
            IconType iconType = new IconType("QR_SCANNER", 0);
            QR_SCANNER = iconType;
            $VALUES = new IconType[]{iconType};
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabToolbarViewModel$TabToolbarTitle$Icon)) {
            return false;
        }
        IconType iconType = IconType.QR_SCANNER;
        return true;
    }

    public final int hashCode() {
        return IconType.QR_SCANNER.hashCode() * 31;
    }

    public final String toString() {
        return "Icon(iconType=" + IconType.QR_SCANNER + ", badge=null)";
    }
}
