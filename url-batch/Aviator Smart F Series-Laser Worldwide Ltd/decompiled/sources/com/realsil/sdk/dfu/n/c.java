package com.realsil.sdk.dfu.n;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class c extends com.realsil.sdk.dfu.k.a {
    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        List<SubFileInfo> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z7 = false;
        a8.bankIndicator = 0;
        if (aVar == null) {
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i8, loadParams, false);
            if (openFileInputStreamCompat != null) {
                arrayList3.add(openFileInputStreamCompat);
                a8.icType = openFileInputStreamCompat.getIcType();
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i8)) {
                    if (!D || 1 == com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                        arrayList4.add(openFileInputStreamCompat);
                    } else {
                        z7 = true;
                    }
                }
            } else {
                a8.onError(4097);
            }
            a8.lowVersionExist = z7;
            a8.subBinInputStreams = arrayList3;
            a8.supportBinInputStreams = arrayList4;
            a8.supportSubFileInfos = arrayList2;
            a8.activeSubFiles = arrayList;
            if (D) {
                a8.onError(4104);
            }
        } else if (!u7 || a8.checkIcType(i8)) {
            arrayList = aVar.b(loadParams);
            for (SubFileInfo subFileInfo : arrayList) {
                int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                BaseBinInputStream binInputStreamCompat = subFileInfo.getBinInputStreamCompat(loadParams);
                if (binInputStreamCompat == null) {
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, "invalid stream: " + subFileInfo.toString());
                } else {
                    arrayList3.add(binInputStreamCompat);
                    if (!D || 1 == com.realsil.sdk.dfu.k.a.checkPackImageVersion(wrapperBitNumber, binInputStreamCompat, f8)) {
                        arrayList4.add(binInputStreamCompat);
                        arrayList2.add(subFileInfo);
                    } else {
                        z7 = true;
                    }
                }
            }
            aVar.a();
            a8.lowVersionExist = z7;
            a8.subBinInputStreams = arrayList3;
            a8.supportBinInputStreams = arrayList4;
            a8.supportSubFileInfos = arrayList2;
            a8.activeSubFiles = arrayList;
            if (D && z7 && arrayList4.size() < 1) {
                a8.onError(4104);
            }
        }
        return a8;
    }
}
