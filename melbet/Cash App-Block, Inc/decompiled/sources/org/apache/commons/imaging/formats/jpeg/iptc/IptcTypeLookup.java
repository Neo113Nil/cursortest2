package org.apache.commons.imaging.formats.jpeg.iptc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class IptcTypeLookup {
    private static final Map<Integer, IptcType> IPTC_TYPE_MAP = new HashMap();

    static {
        for (IptcTypes iptcTypes : IptcTypes.values()) {
            IPTC_TYPE_MAP.put(Integer.valueOf(iptcTypes.getType()), iptcTypes);
        }
    }

    private IptcTypeLookup() {
    }

    public static IptcType getIptcType(int i) {
        Map<Integer, IptcType> map = IPTC_TYPE_MAP;
        return !map.containsKey(Integer.valueOf(i)) ? IptcTypes.getUnknown(i) : map.get(Integer.valueOf(i));
    }
}
