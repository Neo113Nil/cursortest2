package com.realsil.sdk.dfu.x;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class h extends com.realsil.sdk.dfu.k.a {
    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8;
        boolean z7;
        boolean z8;
        SubFileInfo c8;
        int i9 = loadParams.i();
        loadParams.c();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        boolean y7 = loadParams.y();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z9 = false;
        if (aVar == null) {
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i9, loadParams, true, false);
            if (openFileInputStreamCompat != null) {
                arrayList2.add(openFileInputStreamCompat);
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i9)) {
                    if (D && 1 != com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                        z9 = true;
                    } else if (!y7 || !com.realsil.sdk.dfu.c.f.a(a8.icType) || 1 == com.realsil.sdk.dfu.k.a.a(openFileInputStreamCompat, f8)) {
                        arrayList3.add(openFileInputStreamCompat);
                    }
                }
                return a8;
            }
            a8.onError(4097);
            a8.lowVersionExist = z9;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D) {
                i8 = 4104;
                a8.onError(i8);
                return a8;
            }
            return a8;
        }
        if (!u7 || a8.checkIcType(i9)) {
            if (y7 && com.realsil.sdk.dfu.c.f.a(a8.icType) && (c8 = aVar.c(com.realsil.sdk.dfu.k.a.wrapperBitNumber(2, f8.imageVersionIndicator, f8.updateBankIndicator))) != null) {
                BaseBinInputStream binInputStreamCompat = c8.getBinInputStreamCompat(loadParams);
                z7 = binInputStreamCompat == null || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, c8.imageId, f8);
                z8 = true;
            } else {
                z7 = true;
                z8 = false;
            }
            if (z7) {
                for (SubFileInfo subFileInfo : aVar.b(loadParams)) {
                    int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                    BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                    if (binInputStreamCompat2 != null) {
                        arrayList2.add(binInputStreamCompat2);
                        if (!D || 1 == com.realsil.sdk.dfu.k.a.checkPackImageVersion(wrapperBitNumber, binInputStreamCompat2, f8)) {
                            if (y7 && com.realsil.sdk.dfu.c.f.a(a8.icType)) {
                                if (z8) {
                                    ZLogger.d("preVerify OTA_HEADER_FILE ok, no need to check section size");
                                } else if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, subFileInfo.imageId, f8)) {
                                    i8 = 4109;
                                    break;
                                }
                            }
                            arrayList3.add(binInputStreamCompat2);
                            arrayList.add(subFileInfo);
                        } else {
                            z9 = true;
                        }
                    }
                }
            } else {
                ZLogger.w("pre verify failed");
            }
            aVar.a();
            a8.lowVersionExist = z9;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D && z9 && arrayList3.size() < 1) {
                i8 = 4104;
                a8.onError(i8);
                return a8;
            }
        }
        return a8;
    }
}
