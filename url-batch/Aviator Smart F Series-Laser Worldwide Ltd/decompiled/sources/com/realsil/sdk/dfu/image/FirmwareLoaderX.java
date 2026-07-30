package com.realsil.sdk.dfu.image;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.x.h;
import com.realsil.sdk.dfu.x.i;
import com.realsil.sdk.dfu.x.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FirmwareLoaderX extends com.realsil.sdk.dfu.k.a {
    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        if (loadParams == null) {
            ZLogger.w("loadParams can not be null");
            return null;
        }
        ZLogger.v(loadParams.toString());
        int j8 = loadParams.j();
        int k8 = loadParams.k();
        BinInfo loadImageBinInfo = j8 == 18 ? com.realsil.sdk.dfu.n.c.loadImageBinInfo(loadParams) : j8 == 20 ? com.realsil.sdk.dfu.p.c.loadImageBinInfo(loadParams) : j8 == 22 ? com.realsil.sdk.dfu.v.c.loadImageBinInfo(loadParams) : j8 == 21 ? com.realsil.sdk.dfu.q.c.loadImageBinInfo(loadParams) : j8 == 16 ? k8 >= 5 ? loadParams.s() ? com.realsil.sdk.dfu.s.f.b(loadParams) : com.realsil.sdk.dfu.s.f.loadImageBinInfo(loadParams) : com.realsil.sdk.dfu.s.e.loadImageBinInfo(loadParams) : j8 == 17 ? k8 >= 6 ? loadParams.s() ? loadParams.o() == 19 ? j.e(loadParams) : loadParams.o() == 23 ? j.c(loadParams) : loadParams.o() == 24 ? j.d(loadParams) : j.b(loadParams) : j.loadImageBinInfo(loadParams) : k8 == 5 ? loadParams.s() ? loadParams.o() == 19 ? i.d(loadParams) : i.c(loadParams) : i.b(loadParams) : h.loadImageBinInfo(loadParams) : com.realsil.sdk.dfu.k.f.loadImageBinInfo(loadParams);
        if (loadImageBinInfo != null && loadImageBinInfo.status == 4096) {
            loadImageBinInfo.status = com.realsil.sdk.dfu.c.d.a(loadParams.f(), loadImageBinInfo);
        }
        return loadImageBinInfo;
    }

    public static List<BaseBinInputStream> loadImageFile(LoadParams loadParams) {
        BinInfo loadImageBinInfo = loadImageBinInfo(loadParams);
        if (loadImageBinInfo != null && loadImageBinInfo.status == 4096) {
            return loadImageBinInfo.supportBinInputStreams;
        }
        return new ArrayList();
    }

    @Deprecated
    public long getImageVersion(OtaDeviceInfo otaDeviceInfo, int i8) {
        if (otaDeviceInfo == null) {
            return 0L;
        }
        int protocolType = otaDeviceInfo.getProtocolType();
        if (protocolType == 0) {
            int i9 = otaDeviceInfo.specVersion;
            if (i9 != 0 && i9 == 1) {
                for (ImageVersionInfo imageVersionInfo : otaDeviceInfo.getExistImageVersionInfos()) {
                    if (otaDeviceInfo.icType <= 3) {
                        if (imageVersionInfo.getBitNumber() == i8) {
                            return imageVersionInfo.getVersion();
                        }
                    } else if (imageVersionInfo.getBitNumber() == i8 || imageVersionInfo.getBitNumber() == i8 + 16) {
                        return imageVersionInfo.getVersion();
                    }
                }
            }
        } else if (protocolType == 16 || protocolType == 17) {
            for (ImageVersionInfo imageVersionInfo2 : otaDeviceInfo.getExistImageVersionInfos()) {
                if (otaDeviceInfo.icType <= 3) {
                    if (imageVersionInfo2.getBitNumber() == i8) {
                        return imageVersionInfo2.getVersion();
                    }
                } else if (imageVersionInfo2.getBitNumber() == i8 || imageVersionInfo2.getBitNumber() == i8 + 16) {
                    return imageVersionInfo2.getVersion();
                }
            }
        }
        return 0L;
    }
}
