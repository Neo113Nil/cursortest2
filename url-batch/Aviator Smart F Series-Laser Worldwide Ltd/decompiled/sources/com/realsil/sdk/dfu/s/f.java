package com.realsil.sdk.dfu.s;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.VersionCheckUtils;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class f extends com.realsil.sdk.dfu.k.a {

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SubFileInfo subFileInfo, SubFileInfo subFileInfo2) {
            return subFileInfo.getSortNumber() - subFileInfo2.getSortNumber();
        }
    }

    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(BaseBinInputStream baseBinInputStream, BaseBinInputStream baseBinInputStream2) {
            return baseBinInputStream.versionCheckOrder - baseBinInputStream2.versionCheckOrder;
        }
    }

    public static List a(com.realsil.sdk.dfu.image.pack.a aVar, LoadParams loadParams) {
        OtaDeviceInfo f8 = loadParams.f();
        if (f8 == null) {
            return aVar.b(loadParams);
        }
        ArrayList e8 = aVar.e();
        ArrayList arrayList = new ArrayList();
        if (e8 != null && !e8.isEmpty()) {
            int size = e8.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = e8.get(i8);
                i8++;
                SubFileInfo subFileInfo = (SubFileInfo) obj;
                if (com.realsil.sdk.dfu.image.pack.a.a(subFileInfo, loadParams)) {
                    if (((loadParams.g() > 7 && subFileInfo.binId == 2817) ? f8.bootBankInfo.getUpdateBankNumber() : loadParams.l()) != 1) {
                        com.realsil.sdk.dfu.image.pack.a.b(subFileInfo, loadParams);
                        if (aVar.a(subFileInfo)) {
                            com.realsil.sdk.dfu.image.pack.a.b(subFileInfo, loadParams);
                        }
                    } else if (aVar.b(subFileInfo)) {
                        com.realsil.sdk.dfu.image.pack.a.b(subFileInfo, loadParams);
                    } else if (subFileInfo.isNeedCopyToBank(loadParams)) {
                    }
                    arrayList.add(subFileInfo);
                }
            }
            if (loadParams.B()) {
                Collections.sort(arrayList, new a());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c2, code lost:
    
        if (r12.updateEnabled == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo b(LoadParams loadParams) {
        boolean z7;
        BaseBinInputStream baseBinInputStream;
        SubFileInfo subFileInfo;
        int i8;
        int i9;
        int i10 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean u7 = loadParams.u();
        boolean D = loadParams.D();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z8 = true;
        if (aVar != null) {
            if (!u7 || a8.checkIcType(i10)) {
                List<SubFileInfo> a9 = a(aVar, loadParams);
                if (aVar.a(2, a8.updateBank)) {
                    z7 = D;
                } else {
                    ZLogger.w("OtaHeader Miss");
                    if (!loadParams.A() || !aVar.d(520)) {
                        a8.onError(4115);
                        return a8;
                    }
                    z7 = false;
                }
                int i11 = 0;
                int i12 = 0;
                for (SubFileInfo subFileInfo2 : a9) {
                    int wrapperBitNumber = subFileInfo2.wrapperBitNumber();
                    int i13 = a8.icType;
                    BinIndicator d8 = i13 == 11 ? com.realsil.sdk.dfu.image.a.d(subFileInfo2.binId) : (i13 == 17 || i13 == 19) ? com.realsil.sdk.dfu.image.b.d(subFileInfo2.binId) : i13 == 10 ? com.realsil.sdk.dfu.image.c.d(wrapperBitNumber) : com.realsil.sdk.dfu.image.d.e(wrapperBitNumber);
                    if (d8 == null) {
                        ZLogger.v("undefined image, bitNumber=" + wrapperBitNumber);
                    } else {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, d8.toString());
                        BaseBinInputStream binInputStreamCompat = subFileInfo2.getBinInputStreamCompat(loadParams);
                        if (binInputStreamCompat == null) {
                            ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo2.toString());
                        } else {
                            binInputStreamCompat.versionCheckOrder = com.realsil.sdk.dfu.e.a.a(binInputStreamCompat.getImageId());
                            if (f8 != null) {
                                subFileInfo = subFileInfo2;
                                i8 = i11;
                                i9 = i12;
                                int checkImageVersionInfo = VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, d8.versionFormat);
                                baseBinInputStream = binInputStreamCompat;
                                baseBinInputStream.setActiveCompareVersionFlag(checkImageVersionInfo);
                                if (com.realsil.sdk.dfu.d.a.a(subFileInfo.wrapperBitNumber())) {
                                    if (i9 <= 0 ? i9 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                        i12 = baseBinInputStream.getActiveCompareVersionFlag();
                                        i11 = i8;
                                        arrayList2.add(baseBinInputStream);
                                        arrayList3.add(baseBinInputStream);
                                        arrayList.add(subFileInfo);
                                    }
                                } else if (i8 <= 0 ? i8 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                    i11 = baseBinInputStream.getActiveCompareVersionFlag();
                                    i12 = i9;
                                    arrayList2.add(baseBinInputStream);
                                    arrayList3.add(baseBinInputStream);
                                    arrayList.add(subFileInfo);
                                }
                            } else {
                                baseBinInputStream = binInputStreamCompat;
                                subFileInfo = subFileInfo2;
                                i8 = i11;
                                i9 = i12;
                            }
                            i12 = i9;
                            i11 = i8;
                            arrayList2.add(baseBinInputStream);
                            arrayList3.add(baseBinInputStream);
                            arrayList.add(subFileInfo);
                        }
                    }
                }
                int i14 = i11;
                int i15 = i12;
                aVar.a();
                if (z7) {
                    if (loadParams.m() != 0) {
                        Collections.sort(arrayList2, new b());
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                break;
                            }
                            Object obj = arrayList2.get(i16);
                            i16++;
                            BaseBinInputStream baseBinInputStream2 = (BaseBinInputStream) obj;
                            if (baseBinInputStream2.versionCheckOrder != 254) {
                                if (baseBinInputStream2.getActiveCompareVersionFlag() > 0) {
                                    break;
                                }
                                if (baseBinInputStream2.getActiveCompareVersionFlag() < 0) {
                                    ZLogger.d(String.format(Locale.US, "low version image: 0x%04X", Integer.valueOf(baseBinInputStream2.getImageId())));
                                    break;
                                }
                            }
                        }
                        a8.onError(4114);
                        return a8;
                    }
                    a8.validateVersionFlag(i15, i14);
                }
                z8 = false;
            }
            return a8;
        }
        BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i10, loadParams, true, false);
        if (openFileInputStreamCompat != null) {
            arrayList2.add(openFileInputStreamCompat);
            a8.icType = openFileInputStreamCompat.getIcType();
            a8.version = openFileInputStreamCompat.getImageVersion();
            if (!u7 || a8.checkIcType(i10)) {
                if (!D || 1 == com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, loadParams.f())) {
                    if (loadParams.y() && 1 != com.realsil.sdk.dfu.k.a.a(openFileInputStreamCompat, loadParams.f())) {
                        a8.onError(4109);
                        return a8;
                    }
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

    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8;
        boolean z7;
        boolean z8;
        Iterator it;
        boolean z9;
        int i9;
        SubFileInfo d8;
        int i10 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        boolean y7 = loadParams.y();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z10 = false;
        if (aVar != null) {
            a8.bankIndicator = 0;
            if (!u7 || a8.checkIcType(i10)) {
                if (y7 && a(a8.icType) && (d8 = aVar.d()) != null) {
                    BaseBinInputStream binInputStreamCompat = d8.getBinInputStreamCompat(loadParams);
                    z7 = binInputStreamCompat == null || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, d8.imageId, f8);
                    z8 = true;
                } else {
                    z7 = true;
                    z8 = false;
                }
                if (z7) {
                    Iterator it2 = a(aVar, loadParams).iterator();
                    while (it2.hasNext()) {
                        SubFileInfo subFileInfo = (SubFileInfo) it2.next();
                        int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                        int i11 = a8.icType;
                        BinIndicator d9 = i11 == 11 ? com.realsil.sdk.dfu.image.a.d(subFileInfo.binId) : (i11 == 17 || i11 == 19) ? com.realsil.sdk.dfu.image.b.d(subFileInfo.binId) : i11 == 10 ? com.realsil.sdk.dfu.image.c.d(wrapperBitNumber) : com.realsil.sdk.dfu.image.d.e(wrapperBitNumber);
                        BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                        if (binInputStreamCompat2 == null) {
                            ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo.toString());
                            it = it2;
                            z9 = z10;
                        } else {
                            arrayList2.add(binInputStreamCompat2);
                            if (D) {
                                if (d9 != null) {
                                    i9 = d9.versionFormat;
                                    it = it2;
                                } else {
                                    it = it2;
                                    i9 = 1;
                                }
                                z9 = z10;
                                if (loadParams.k() >= 5) {
                                    if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, f8, i9)) {
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
                            if (y7 && a(a8.icType)) {
                                if (z8) {
                                    ZLogger.d("preVerify OTA_HEADER_FILE ok, need to check section size");
                                } else if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, subFileInfo.imageId, f8)) {
                                    a8.onError(4109);
                                    return a8;
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
                    a8.onError(4104);
                }
            }
        } else {
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(a8.icType, loadParams, true, false);
            if (openFileInputStreamCompat != null) {
                arrayList2.add(openFileInputStreamCompat);
                a8.icType = openFileInputStreamCompat.getIcType();
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i10)) {
                    if (loadParams.s() && !com.realsil.sdk.dfu.d.a.b(openFileInputStreamCompat.getImageId())) {
                        a8.onError(4118);
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
                    if (y7 && a(a8.icType) && i8 != com.realsil.sdk.dfu.k.a.a(openFileInputStreamCompat, f8)) {
                        a8.onError(4109);
                        return a8;
                    }
                    arrayList3.add(openFileInputStreamCompat);
                }
            } else {
                a8.onError(4097);
            }
            a8.lowVersionExist = z10;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D) {
                a8.onError(4104);
            }
        }
        return a8;
    }

    public static boolean a(int i8) {
        return i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8;
    }
}
