package com.realsil.sdk.dfu.s;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class e extends com.realsil.sdk.dfu.k.a {
    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8;
        int i9;
        boolean z7;
        boolean z8;
        Iterator it;
        boolean z9;
        int i10;
        SubFileInfo d8;
        int i11 = loadParams.i();
        String c8 = loadParams.c();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        boolean y7 = loadParams.y();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        boolean z10 = false;
        ZLogger.v(String.format(Locale.US, "filePath=%s, versionCheckEnabled=%b, sectionSizeCheckEnabled=%b", c8, Boolean.valueOf(D), Boolean.valueOf(y7)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        if (aVar == null) {
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(a8.icType, loadParams, false);
            if (openFileInputStreamCompat != null) {
                arrayList2.add(openFileInputStreamCompat);
                a8.icType = openFileInputStreamCompat.getIcType();
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i11)) {
                    if (loadParams.s() && !com.realsil.sdk.dfu.d.a.b(openFileInputStreamCompat.getImageId())) {
                        i9 = 4118;
                        a8.onError(i9);
                        return a8;
                    }
                    if (D) {
                        i8 = 1;
                        if (1 != com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                            z10 = true;
                        }
                    } else {
                        i8 = 1;
                    }
                    if (!y7 || !com.realsil.sdk.dfu.c.f.a(a8.icType) || i8 == com.realsil.sdk.dfu.k.a.a(openFileInputStreamCompat, f8)) {
                        arrayList3.add(openFileInputStreamCompat);
                    }
                }
                return a8;
            }
            a8.onError(4097);
            a8.lowVersionExist = z10;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D) {
                i9 = 4104;
                a8.onError(i9);
                return a8;
            }
            return a8;
        }
        a8.bankIndicator = 0;
        if (!u7 || a8.checkIcType(i11)) {
            if (y7 && com.realsil.sdk.dfu.c.f.a(a8.icType) && (d8 = aVar.d()) != null) {
                BaseBinInputStream binInputStreamCompat = d8.getBinInputStreamCompat(loadParams);
                z7 = binInputStreamCompat == null || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, d8.imageId, f8);
                z8 = true;
            } else {
                z7 = true;
                z8 = false;
            }
            if (z7) {
                Iterator it2 = aVar.b(loadParams).iterator();
                while (it2.hasNext()) {
                    SubFileInfo subFileInfo = (SubFileInfo) it2.next();
                    int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                    int i12 = a8.icType;
                    BinIndicator d9 = i12 == 11 ? com.realsil.sdk.dfu.image.a.d(subFileInfo.binId) : (i12 == 17 || i12 == 19) ? com.realsil.sdk.dfu.image.b.d(subFileInfo.binId) : i12 == 10 ? com.realsil.sdk.dfu.image.c.d(wrapperBitNumber) : com.realsil.sdk.dfu.image.d.e(wrapperBitNumber);
                    BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                    if (binInputStreamCompat2 == null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo.toString());
                        it = it2;
                        z9 = z10;
                    } else {
                        arrayList2.add(binInputStreamCompat2);
                        if (D) {
                            if (d9 != null) {
                                i10 = d9.versionFormat;
                                it = it2;
                            } else {
                                it = it2;
                                i10 = 1;
                            }
                            z9 = z10;
                            if (loadParams.k() >= 5) {
                                if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, f8, i10)) {
                                    it2 = it;
                                    z10 = true;
                                }
                            } else if (1 != com.realsil.sdk.dfu.k.a.checkPackImageVersion(wrapperBitNumber, binInputStreamCompat2, f8)) {
                                it2 = it;
                                z10 = true;
                            }
                        } else {
                            it = it2;
                            z9 = z10;
                        }
                        if (y7 && com.realsil.sdk.dfu.c.f.a(a8.icType)) {
                            if (!z8) {
                                if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, subFileInfo.imageId, f8)) {
                                    i9 = 4109;
                                    break;
                                }
                            } else {
                                ZLogger.d("preVerify OTA_HEADER_FILE ok, need to check section size");
                            }
                        }
                        arrayList3.add(binInputStreamCompat2);
                        arrayList.add(subFileInfo);
                    }
                    it2 = it;
                    z10 = z9;
                }
            } else {
                ZLogger.w("pre verify failed");
            }
            aVar.a();
            a8.lowVersionExist = z10;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D && z10 && arrayList3.size() < 1) {
                i9 = 4104;
                a8.onError(i9);
                return a8;
            }
        }
        return a8;
    }
}
