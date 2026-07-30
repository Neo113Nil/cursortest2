package com.realsil.sdk.dfu.k;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class f extends a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        ?? b8;
        Iterator it;
        String str;
        int i8 = loadParams.i();
        loadParams.c();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        BinInfo a8 = a.a(loadParams);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        int i9 = 1;
        boolean z7 = false;
        a8.bankIndicator = 0;
        if (aVar == null) {
            BaseBinInputStream openFileInputStreamCompat = a.openFileInputStreamCompat(i8, loadParams, false);
            if (openFileInputStreamCompat != null) {
                arrayList3.add(openFileInputStreamCompat);
                a8.icType = openFileInputStreamCompat.getIcType();
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i8)) {
                    if (!D || 1 == a.checkSingleImageVersion(openFileInputStreamCompat, f8)) {
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
            int i10 = 16;
            if (loadParams.k() == 0) {
                Iterator it2 = aVar.b(loadParams).iterator();
                while (it2.hasNext()) {
                    SubFileInfo subFileInfo = (SubFileInfo) it2.next();
                    int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                    a8.bankIndicator = subFileInfo.bitNumber < i10 ? a8.bankIndicator | i9 : a8.bankIndicator | 2;
                    BaseBinInputStream binInputStreamCompat = subFileInfo.getBinInputStreamCompat(loadParams);
                    if (binInputStreamCompat != null) {
                        arrayList3.add(binInputStreamCompat);
                        if (a8.icType <= 3) {
                            if (!loadParams.s()) {
                                it = it2;
                                if (wrapperBitNumber == 2) {
                                    str = "ignore app ban1 image, non-dualbank only alllow update app bank0 image";
                                    ZLogger.d(str);
                                    it2 = it;
                                    i10 = 16;
                                    i9 = 1;
                                }
                                if (!D) {
                                    it2 = it;
                                    i10 = 16;
                                    i9 = 1;
                                    z7 = true;
                                }
                                arrayList4.add(binInputStreamCompat);
                                arrayList2.add(subFileInfo);
                                it2 = it;
                                i10 = 16;
                                i9 = 1;
                            } else if (wrapperBitNumber == 1) {
                                if (f8 != null && f8.appFreeBank != 0) {
                                    ZLogger.d("ignore subfile, appFreeBank=" + f8.appFreeBank);
                                }
                            } else if (wrapperBitNumber == 2 && f8 != null) {
                                it = it2;
                                if (f8.appFreeBank != 1) {
                                    str = "ignore subfile, appFreeBank=" + f8.appFreeBank;
                                    ZLogger.d(str);
                                    it2 = it;
                                    i10 = 16;
                                    i9 = 1;
                                }
                                if (!D && 1 != a.checkPackImageVersion(wrapperBitNumber, binInputStreamCompat, f8)) {
                                    it2 = it;
                                    i10 = 16;
                                    i9 = 1;
                                    z7 = true;
                                }
                                arrayList4.add(binInputStreamCompat);
                                arrayList2.add(subFileInfo);
                                it2 = it;
                                i10 = 16;
                                i9 = 1;
                            }
                        }
                        it = it2;
                        if (!D) {
                        }
                        arrayList4.add(binInputStreamCompat);
                        arrayList2.add(subFileInfo);
                        it2 = it;
                        i10 = 16;
                        i9 = 1;
                    }
                    it = it2;
                    it2 = it;
                    i10 = 16;
                    i9 = 1;
                }
            } else {
                if (loadParams.k() == 1) {
                    b8 = aVar.b(loadParams);
                    for (SubFileInfo subFileInfo2 : b8) {
                        int wrapperBitNumber2 = subFileInfo2.wrapperBitNumber();
                        BaseBinInputStream binInputStreamCompat2 = subFileInfo2.getBinInputStreamCompat(loadParams);
                        if (binInputStreamCompat2 != null) {
                            arrayList3.add(binInputStreamCompat2);
                            if (!D || 1 == a.checkPackImageVersion(wrapperBitNumber2, binInputStreamCompat2, f8)) {
                                arrayList4.add(binInputStreamCompat2);
                                arrayList2.add(subFileInfo2);
                            } else {
                                z7 = true;
                            }
                        }
                    }
                } else if (loadParams.k() == 2) {
                    b8 = aVar.b(loadParams);
                    for (SubFileInfo subFileInfo3 : b8) {
                        int wrapperBitNumber3 = subFileInfo3.wrapperBitNumber();
                        if (subFileInfo3.bitNumber < 16) {
                            a8.bankIndicator |= 1;
                        } else {
                            a8.bankIndicator |= 2;
                        }
                        BaseBinInputStream binInputStreamCompat3 = subFileInfo3.getBinInputStreamCompat(loadParams);
                        if (binInputStreamCompat3 != null) {
                            arrayList3.add(binInputStreamCompat3);
                            if (!D || 1 == a.checkPackImageVersion(wrapperBitNumber3, binInputStreamCompat3, f8)) {
                                arrayList4.add(binInputStreamCompat3);
                                arrayList2.add(subFileInfo3);
                            } else {
                                z7 = true;
                            }
                        }
                    }
                }
                arrayList = b8;
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
