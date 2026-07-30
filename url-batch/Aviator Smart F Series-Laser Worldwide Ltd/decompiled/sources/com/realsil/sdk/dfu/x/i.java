package com.realsil.sdk.dfu.x;

import android.util.SparseIntArray;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.VersionCheckUtils;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class i extends com.realsil.sdk.dfu.k.a {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i8, BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        int i9;
        long j8;
        int i10;
        ImageVersionInfo inActiveImageVersionInfo;
        String str;
        String format;
        BinIndicator d8 = otaDeviceInfo.icType == 10 ? com.realsil.sdk.dfu.image.c.d(i8) : com.realsil.sdk.dfu.image.d.e(i8);
        if (d8 == null) {
            return 1;
        }
        long j9 = baseBinInputStream.imageVersion;
        int i11 = baseBinInputStream.otaVersion;
        ImageVersionInfo activeImageVersionInfo = otaDeviceInfo.getActiveImageVersionInfo(i8);
        if (activeImageVersionInfo != null) {
            if (activeImageVersionInfo.getVersion() != com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
                i10 = -1;
                i9 = i11;
                j8 = j9;
                if (VersionCheckUtils.compareVersion(otaDeviceInfo.icType, baseBinInputStream.getBinId(), baseBinInputStream.getImageId(), j9, i11, otaDeviceInfo.protocolType, activeImageVersionInfo.getVersion(), otaDeviceInfo.specVersion, d8.versionFormat, otaDeviceInfo.isBankEnabled()) == -1) {
                    format = String.format(Locale.US, "active image: bitNumber=%d, file(%08X)<device(%08X)", Integer.valueOf(i8), Long.valueOf(j8), Long.valueOf(activeImageVersionInfo.getVersion()));
                    ZLogger.v(format);
                    return i10;
                }
                ZLogger.v(String.format("version validate ok :0x%04X", Long.valueOf(j8)));
                inActiveImageVersionInfo = otaDeviceInfo.getInActiveImageVersionInfo(i8);
                if (inActiveImageVersionInfo != null) {
                    return 1;
                }
                if (inActiveImageVersionInfo.getVersion() == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
                    str = String.format("invalid inactive version:0x%04X, no need to check", Long.valueOf(j8));
                } else {
                    if (VersionCheckUtils.compareVersion(otaDeviceInfo.icType, baseBinInputStream.getBinId(), baseBinInputStream.getImageId(), j8, i9, otaDeviceInfo.protocolType, inActiveImageVersionInfo.getVersion(), otaDeviceInfo.specVersion, d8.versionFormat, otaDeviceInfo.isBankEnabled()) == i10) {
                        format = String.format(Locale.US, "inactive image: bitNumber=%d, file(%08X)<device(%08X)", Integer.valueOf(i8), Long.valueOf(j8), Long.valueOf(inActiveImageVersionInfo.getVersion()));
                        ZLogger.v(format);
                        return i10;
                    }
                    str = "version validate ok: " + j8;
                }
                ZLogger.v(str);
                return 1;
            }
            ZLogger.v(String.format("invalid active version:0x%04X, no need to check", Long.valueOf(j9)));
        }
        i9 = i11;
        j8 = j9;
        i10 = -1;
        inActiveImageVersionInfo = otaDeviceInfo.getInActiveImageVersionInfo(i8);
        if (inActiveImageVersionInfo != null) {
        }
    }

    public static BinInfo b(LoadParams loadParams) {
        int i8;
        int i9;
        boolean z7;
        boolean z8;
        int i10;
        SubFileInfo d8;
        int i11 = loadParams.i();
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
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i11, loadParams, true, false);
            if (openFileInputStreamCompat != null) {
                arrayList2.add(openFileInputStreamCompat);
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i11)) {
                    if (D) {
                        i8 = 1;
                        if (1 != com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                            z9 = true;
                        }
                    } else {
                        i8 = 1;
                    }
                    if (!y7 || i8 == com.realsil.sdk.dfu.k.a.a(openFileInputStreamCompat, f8)) {
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
                i9 = 4104;
                a8.onError(i9);
                return a8;
            }
            return a8;
        }
        if (!u7 || a8.checkIcType(i11)) {
            if (!y7 || (d8 = aVar.d()) == null) {
                z7 = true;
                z8 = false;
            } else {
                BaseBinInputStream binInputStreamCompat = d8.getBinInputStreamCompat(loadParams);
                z7 = binInputStreamCompat == null || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, d8.imageId, f8);
                z8 = true;
            }
            if (z7) {
                for (SubFileInfo subFileInfo : aVar.b(loadParams)) {
                    int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                    BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                    if (binInputStreamCompat2 == null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo.toString());
                    } else {
                        if (D) {
                            int a9 = a(wrapperBitNumber, binInputStreamCompat2, f8);
                            i10 = 1;
                            if (1 != a9) {
                                z9 = true;
                            }
                        } else {
                            i10 = 1;
                        }
                        if (y7) {
                            if (z8) {
                                ZLogger.d("preVerify OTA_HEADER_FILE ok, no need to check section size");
                            } else if (i10 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, subFileInfo.imageId, f8)) {
                                i9 = 4109;
                                break;
                            }
                        }
                        arrayList3.add(binInputStreamCompat2);
                        arrayList.add(subFileInfo);
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
                i9 = 4104;
                a8.onError(i9);
                return a8;
            }
        }
        return a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        if (r14.updateEnabled == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo c(LoadParams loadParams) {
        Iterator it;
        int i8;
        SubFileInfo subFileInfo;
        boolean z7;
        SparseIntArray sparseIntArray;
        com.realsil.sdk.dfu.image.pack.a aVar;
        int i9;
        int i10;
        BaseBinInputStream baseBinInputStream;
        LoadParams loadParams2 = loadParams;
        int i11 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean u7 = loadParams.u();
        boolean D = loadParams.D();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar2 = a8.packManager;
        if (!u7 || a8.checkIcType(i11)) {
            if (!aVar2.a(2, a8.updateBank)) {
                ZLogger.w("OtaHeader Miss");
                a8.onError(4115);
                return a8;
            }
            Iterator it2 = aVar2.b(loadParams2).iterator();
            int i12 = 0;
            int i13 = 0;
            while (it2.hasNext()) {
                SubFileInfo subFileInfo2 = (SubFileInfo) it2.next();
                int wrapperBitNumber = subFileInfo2.wrapperBitNumber();
                if (a8.icType == 11) {
                    com.realsil.sdk.dfu.image.a.d(subFileInfo2.binId);
                }
                int i14 = a8.icType;
                BinIndicator d8 = (i14 == 17 || i14 == 19) ? com.realsil.sdk.dfu.image.b.d(subFileInfo2.binId) : i14 == 10 ? com.realsil.sdk.dfu.image.c.d(wrapperBitNumber) : com.realsil.sdk.dfu.image.d.e(wrapperBitNumber);
                if (d8 != null) {
                    it = it2;
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, d8.toString());
                    i8 = d8.versionFormat;
                } else {
                    it = it2;
                    i8 = 1;
                }
                BaseBinInputStream binInputStreamCompat = subFileInfo2.getBinInputStreamCompat(loadParams2);
                if (binInputStreamCompat == null) {
                    if (loadParams.q() && com.realsil.sdk.dfu.d.a.c(subFileInfo2.imageId)) {
                        sparseIntArray2.append(subFileInfo2.imageId, wrapperBitNumber);
                    }
                    it2 = it;
                } else {
                    if (f8 != null) {
                        subFileInfo = subFileInfo2;
                        sparseIntArray = sparseIntArray2;
                        i9 = i12;
                        z7 = D;
                        i10 = i13;
                        aVar = aVar2;
                        baseBinInputStream = binInputStreamCompat;
                        int i15 = i8;
                        baseBinInputStream.setActiveCompareVersionFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i15));
                        baseBinInputStream.setInactiveVersionCompFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId()), loadParams.s(), a8.icType, baseBinInputStream, i15));
                        if (com.realsil.sdk.dfu.d.a.a(wrapperBitNumber)) {
                            if (i10 <= 0 ? i10 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                i13 = baseBinInputStream.getActiveCompareVersionFlag();
                                i12 = i9;
                                arrayList2.add(baseBinInputStream);
                                arrayList3.add(baseBinInputStream);
                                arrayList.add(subFileInfo);
                                loadParams2 = loadParams;
                                aVar2 = aVar;
                                it2 = it;
                                sparseIntArray2 = sparseIntArray;
                                D = z7;
                            }
                        } else if (i9 <= 0 ? i9 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                            i12 = baseBinInputStream.getActiveCompareVersionFlag();
                            i13 = i10;
                            arrayList2.add(baseBinInputStream);
                            arrayList3.add(baseBinInputStream);
                            arrayList.add(subFileInfo);
                            loadParams2 = loadParams;
                            aVar2 = aVar;
                            it2 = it;
                            sparseIntArray2 = sparseIntArray;
                            D = z7;
                        }
                    } else {
                        subFileInfo = subFileInfo2;
                        z7 = D;
                        sparseIntArray = sparseIntArray2;
                        aVar = aVar2;
                        i9 = i12;
                        i10 = i13;
                        baseBinInputStream = binInputStreamCompat;
                    }
                    i13 = i10;
                    i12 = i9;
                    arrayList2.add(baseBinInputStream);
                    arrayList3.add(baseBinInputStream);
                    arrayList.add(subFileInfo);
                    loadParams2 = loadParams;
                    aVar2 = aVar;
                    it2 = it;
                    sparseIntArray2 = sparseIntArray;
                    D = z7;
                }
            }
            boolean z8 = D;
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            int i16 = i12;
            int i17 = i13;
            aVar2.a();
            if (z8) {
                a8.validateVersionFlag(i17, i16);
            }
            a8.forceCopyImages = sparseIntArray3;
            a8.lowVersionExist = false;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            return a8;
        }
        return a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b6, code lost:
    
        if (r13.updateEnabled == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo d(LoadParams loadParams) {
        int i8;
        Iterator it;
        int i9;
        SubFileInfo subFileInfo;
        int i10;
        boolean z7;
        com.realsil.sdk.dfu.image.pack.a aVar;
        int i11;
        BaseBinInputStream baseBinInputStream;
        LoadParams loadParams2 = loadParams;
        int i12 = loadParams.i();
        loadParams.c();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar2 = a8.packManager;
        boolean z8 = true;
        if (aVar2 != null) {
            if (!u7 || a8.checkIcType(i12)) {
                Iterator it2 = aVar2.b(loadParams2).iterator();
                int i13 = 0;
                int i14 = 0;
                while (it2.hasNext()) {
                    SubFileInfo subFileInfo2 = (SubFileInfo) it2.next();
                    int wrapperBitNumber = subFileInfo2.wrapperBitNumber();
                    int i15 = a8.icType;
                    BinIndicator d8 = i15 == 11 ? com.realsil.sdk.dfu.image.a.d(subFileInfo2.binId) : (i15 == 17 || i15 == 19) ? com.realsil.sdk.dfu.image.b.d(subFileInfo2.binId) : i15 == 10 ? com.realsil.sdk.dfu.image.c.d(wrapperBitNumber) : com.realsil.sdk.dfu.image.d.e(wrapperBitNumber);
                    if (d8 != null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, d8.toString());
                        i8 = d8.versionFormat;
                    } else {
                        i8 = 1;
                    }
                    BaseBinInputStream binInputStreamCompat = subFileInfo2.getBinInputStreamCompat(loadParams2);
                    if (binInputStreamCompat == null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo2.toString());
                        it = it2;
                        i10 = i13;
                        z7 = D;
                        aVar = aVar2;
                        i11 = i14;
                    } else {
                        if (f8 != null) {
                            i9 = wrapperBitNumber;
                            it = it2;
                            subFileInfo = subFileInfo2;
                            aVar = aVar2;
                            z7 = D;
                            i11 = i14;
                            i10 = i13;
                            baseBinInputStream = binInputStreamCompat;
                            int i16 = i8;
                            baseBinInputStream.setActiveCompareVersionFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i16));
                            baseBinInputStream.setInactiveVersionCompFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId()), loadParams.s(), a8.icType, baseBinInputStream, i16));
                        } else {
                            it = it2;
                            i9 = wrapperBitNumber;
                            subFileInfo = subFileInfo2;
                            i10 = i13;
                            z7 = D;
                            aVar = aVar2;
                            i11 = i14;
                            baseBinInputStream = binInputStreamCompat;
                        }
                        arrayList2.add(baseBinInputStream);
                        if (i9 == 2) {
                            ZLogger.v("ignore OTA_HEADER_FILE");
                        } else if (i9 == 1) {
                            ZLogger.v("ignore SYSTEM_CONFIG_FILE");
                        } else {
                            arrayList3.add(baseBinInputStream);
                            arrayList.add(subFileInfo);
                            if (com.realsil.sdk.dfu.d.a.a(i9)) {
                                if (i11 <= 0 ? i11 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                    i14 = baseBinInputStream.getActiveCompareVersionFlag();
                                    loadParams2 = loadParams;
                                    it2 = it;
                                    aVar2 = aVar;
                                    D = z7;
                                    i13 = i10;
                                }
                            } else if (i10 <= 0 ? i10 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                i13 = baseBinInputStream.getActiveCompareVersionFlag();
                                loadParams2 = loadParams;
                                i14 = i11;
                                it2 = it;
                                aVar2 = aVar;
                                D = z7;
                            }
                        }
                    }
                    loadParams2 = loadParams;
                    i14 = i11;
                    it2 = it;
                    aVar2 = aVar;
                    D = z7;
                    i13 = i10;
                }
                int i17 = i13;
                boolean z9 = D;
                com.realsil.sdk.dfu.image.pack.a aVar3 = aVar2;
                int i18 = i14;
                if (z9) {
                    a8.validateVersionFlag(i18, i17);
                }
                aVar3.a();
                z8 = false;
            }
            return a8;
        }
        BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i12, loadParams2, true, false);
        if (openFileInputStreamCompat != null) {
            arrayList2.add(openFileInputStreamCompat);
            a8.icType = openFileInputStreamCompat.getIcType();
            a8.version = openFileInputStreamCompat.getImageVersion();
            if (!u7 || a8.checkIcType(i12)) {
                if (!D || 1 == com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                    arrayList3.add(openFileInputStreamCompat);
                }
            }
            return a8;
        }
        a8.onError(4097);
        z8 = false;
        a8.lowVersionExist = z8;
        a8.subBinInputStreams = arrayList2;
        a8.supportBinInputStreams = arrayList3;
        a8.supportSubFileInfos = arrayList;
        return a8;
    }
}
