package com.realsil.sdk.dfu.c;

import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class d {
    public static int a(OtaDeviceInfo otaDeviceInfo, BinInfo binInfo) {
        int i8;
        if (otaDeviceInfo == null || binInfo == null || !((i8 = otaDeviceInfo.icType) == 5 || i8 == 9 || i8 == 12)) {
            return 4096;
        }
        if (otaDeviceInfo.isBankEnabled()) {
            if (!binInfo.isPackFile) {
                return 4108;
            }
            List<SubFileInfo> subFileInfos = binInfo.getSubFileInfos(otaDeviceInfo.getInactiveBank());
            if (subFileInfos == null || subFileInfos.size() <= 0) {
                return 4110;
            }
            Iterator<SubFileInfo> it = subFileInfos.iterator();
            while (it.hasNext()) {
                if (it.next().binId == 2048) {
                    return 4096;
                }
            }
            return 4111;
        }
        if (!binInfo.isPackFile) {
            return binInfo.getBinInputStreamByBinId(2048) != null ? 4112 : 4096;
        }
        List<SubFileInfo> subFileInfos2 = binInfo.getSubFileInfos(otaDeviceInfo.getInactiveBank());
        if (subFileInfos2 == null || subFileInfos2.size() <= 0) {
            return 4110;
        }
        Iterator<SubFileInfo> it2 = subFileInfos2.iterator();
        while (it2.hasNext()) {
            if (it2.next().binId == 2048) {
                return 4112;
            }
        }
        return 4096;
    }
}
