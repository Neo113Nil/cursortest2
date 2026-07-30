package com.realsil.sdk.dfu.x;

import android.util.SparseIntArray;
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
public abstract class j extends com.realsil.sdk.dfu.k.a {

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

    public class c implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(BaseBinInputStream baseBinInputStream, BaseBinInputStream baseBinInputStream2) {
            return baseBinInputStream.versionCheckOrder - baseBinInputStream2.versionCheckOrder;
        }
    }

    public class d implements Comparator {
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
                    if (((loadParams.g() > 9 && subFileInfo.binId == 2817) ? f8.bootBankInfo.getUpdateBankNumber() : loadParams.l()) != 1) {
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

    public static int b(BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        BinIndicator indByBinId;
        if (otaDeviceInfo != null && (indByBinId = BinIndicator.getIndByBinId(otaDeviceInfo.icType, baseBinInputStream.getBinId())) != null && indByBinId.versionCheckSupported) {
            ZLogger.v(indByBinId.toString());
            if (!com.realsil.sdk.dfu.c.f.a(baseBinInputStream, otaDeviceInfo.getActiveImageVersionInfoByImageId(indByBinId.imageId))) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        r9 = r13.getActiveCompareVersionFlag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r10 = r13.getActiveCompareVersionFlag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        if (r7.updateEnabled == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016e, code lost:
    
        r7.onError(4114);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0173, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo c(LoadParams loadParams) {
        BaseBinInputStream baseBinInputStream;
        int i8 = loadParams.i();
        boolean u7 = loadParams.u();
        boolean D = loadParams.D();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        if (!u7 || a8.checkIcType(i8)) {
            if (!aVar.a(2, a8.updateBank)) {
                ZLogger.w("OtaHeader Miss");
                a8.onError(4115);
                return a8;
            }
            int i9 = 0;
            int i10 = 0;
            boolean z7 = false;
            for (SubFileInfo subFileInfo : a(aVar, loadParams)) {
                subFileInfo.wrapperBitNumber();
                BinIndicator indByBinId = BinIndicator.getIndByBinId(a8.icType, subFileInfo.binId);
                int i11 = indByBinId != null ? indByBinId.versionFormat : 1;
                BaseBinInputStream binInputStreamCompat = subFileInfo.getBinInputStreamCompat(loadParams);
                if (binInputStreamCompat == null) {
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, "invalid stream: " + subFileInfo.toString());
                } else {
                    if (subFileInfo.binId == 1024) {
                        z7 = true;
                    }
                    binInputStreamCompat.versionCheckOrder = com.realsil.sdk.dfu.e.a.a(binInputStreamCompat.getImageId());
                    OtaDeviceInfo f8 = loadParams.f();
                    if (f8 != null) {
                        int i12 = i11;
                        binInputStreamCompat.setActiveCompareVersionFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i12));
                        baseBinInputStream = binInputStreamCompat;
                        baseBinInputStream.setInactiveVersionCompFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getInActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i12));
                        if (com.realsil.sdk.dfu.d.a.a(subFileInfo.wrapperBitNumber())) {
                            if (i9 > 0) {
                            }
                        } else if (i10 > 0) {
                        }
                    } else {
                        baseBinInputStream = binInputStreamCompat;
                    }
                    arrayList2.add(baseBinInputStream);
                    arrayList3.add(baseBinInputStream);
                    arrayList.add(subFileInfo);
                }
            }
            aVar.a();
            if (D) {
                if (loadParams.m() != 0) {
                    Collections.sort(arrayList2, new c());
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i13);
                        i13++;
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
                } else {
                    a8.validateVersionFlagVp(i9, i10, z7);
                }
            }
            a8.lowVersionExist = false;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            return a8;
        }
        return a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0230, code lost:
    
        if (r3 == 65535) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
    
        r12 = r10.getActiveCompareVersionFlag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0150, code lost:
    
        r13 = r10.getActiveCompareVersionFlag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01dc, code lost:
    
        if (r7.updateEnabled == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo d(LoadParams loadParams) {
        Iterator it;
        LoadParams loadParams2 = loadParams;
        int i8 = loadParams.i();
        boolean u7 = loadParams.u();
        boolean D = loadParams.D();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z7 = true;
        if (aVar != null) {
            if (!u7 || a8.checkIcType(i8)) {
                if (!aVar.a(2, a8.updateBank)) {
                    ZLogger.w("OtaHeader Miss");
                    a8.onError(4115);
                    return a8;
                }
                Iterator it2 = a(aVar, loadParams2).iterator();
                boolean z8 = false;
                int i9 = 0;
                int i10 = 0;
                boolean z9 = false;
                while (it2.hasNext()) {
                    SubFileInfo subFileInfo = (SubFileInfo) it2.next();
                    BinIndicator indByBinId = BinIndicator.getIndByBinId(a8.icType, subFileInfo.binId);
                    int i11 = indByBinId != null ? indByBinId.versionFormat : 1;
                    BaseBinInputStream binInputStreamCompat = subFileInfo.getBinInputStreamCompat(loadParams2);
                    if (binInputStreamCompat == null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo.toString());
                    } else {
                        if (subFileInfo.binId == 1024) {
                            z9 = true;
                        }
                        binInputStreamCompat.versionCheckOrder = com.realsil.sdk.dfu.e.a.a(binInputStreamCompat.getImageId());
                        OtaDeviceInfo f8 = loadParams.f();
                        if (f8 != null) {
                            int i12 = i11;
                            binInputStreamCompat.setActiveCompareVersionFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i12));
                            binInputStreamCompat.setInactiveVersionCompFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getInActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i12));
                            if (com.realsil.sdk.dfu.d.a.a(subFileInfo.wrapperBitNumber())) {
                                if (i9 > 0) {
                                }
                            } else if (i10 > 0) {
                            }
                        }
                        if (binInputStreamCompat.getImageId() != 10148 || loadParams.o() != 24) {
                            it = it2;
                            arrayList3.add(binInputStreamCompat);
                        } else if (binInputStreamCompat.getCustomizeId() != loadParams.n()) {
                            it = it2;
                            ZLogger.d(String.format(Locale.US, "VP ID conflict:0x%04X->0x%04X", Integer.valueOf(loadParams.n()), Integer.valueOf(binInputStreamCompat.getCustomizeId())));
                            arrayList3.add(binInputStreamCompat);
                            z8 = true;
                        } else {
                            it = it2;
                            ZLogger.d("VP ID not changed, no need to update");
                        }
                        arrayList2.add(binInputStreamCompat);
                        arrayList.add(subFileInfo);
                        loadParams2 = loadParams;
                        it2 = it;
                    }
                }
                aVar.a();
                if (D) {
                    ZLogger.v("vpIdChanged=" + z8);
                    if (loadParams.m() != 0) {
                        Collections.sort(arrayList2, new d());
                        int size = arrayList2.size();
                        int i13 = 0;
                        char c8 = 65535;
                        while (true) {
                            if (i13 < size) {
                                Object obj = arrayList2.get(i13);
                                i13++;
                                BaseBinInputStream baseBinInputStream = (BaseBinInputStream) obj;
                                if (baseBinInputStream.versionCheckOrder != 254) {
                                    if (baseBinInputStream.getActiveCompareVersionFlag() > 0) {
                                        break;
                                    }
                                    if (baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                        ZLogger.d(String.format(Locale.US, "low version image: 0x%04X", Integer.valueOf(baseBinInputStream.getImageId())));
                                        break;
                                    }
                                    c8 = 0;
                                }
                            }
                        }
                        a8.onError(4114);
                        return a8;
                    }
                    a8.validateVersionFlagVp(i9, i10, z9);
                }
            }
            return a8;
        }
        BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i8, loadParams2, true, false);
        if (openFileInputStreamCompat != null) {
            arrayList2.add(openFileInputStreamCompat);
            a8.icType = openFileInputStreamCompat.getIcType();
            a8.version = openFileInputStreamCompat.getImageVersion();
            if (!u7 || a8.checkIcType(i8)) {
                if (!D || 1 == com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, loadParams.f())) {
                    if (loadParams.y() && 1 != b(openFileInputStreamCompat, loadParams.f())) {
                        a8.onError(4109);
                        return a8;
                    }
                    arrayList3.add(openFileInputStreamCompat);
                }
                a8.lowVersionExist = z7;
                a8.subBinInputStreams = arrayList2;
                a8.supportBinInputStreams = arrayList3;
                a8.supportSubFileInfos = arrayList;
                return a8;
            }
            return a8;
        }
        a8.onError(4097);
        z7 = false;
        a8.lowVersionExist = z7;
        a8.subBinInputStreams = arrayList2;
        a8.supportBinInputStreams = arrayList3;
        a8.supportSubFileInfos = arrayList;
        return a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        if (r13.updateEnabled == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo e(LoadParams loadParams) {
        int i8;
        Iterator it;
        SubFileInfo subFileInfo;
        int i9;
        int i10;
        BaseBinInputStream baseBinInputStream;
        LoadParams loadParams2 = loadParams;
        int i11 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z7 = true;
        if (aVar != null) {
            if (!u7 || a8.checkIcType(i11)) {
                Iterator it2 = a(aVar, loadParams2).iterator();
                int i12 = 0;
                int i13 = 0;
                while (it2.hasNext()) {
                    SubFileInfo subFileInfo2 = (SubFileInfo) it2.next();
                    BinIndicator indByBinId = BinIndicator.getIndByBinId(a8.icType, subFileInfo2.binId);
                    if (indByBinId != null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, indByBinId.toString());
                        i8 = indByBinId.versionFormat;
                    } else {
                        i8 = 1;
                    }
                    BaseBinInputStream binInputStreamCompat = subFileInfo2.getBinInputStreamCompat(loadParams2);
                    if (binInputStreamCompat == null) {
                        ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "not find image: " + indByBinId.imageId);
                    } else {
                        if (f8 != null) {
                            subFileInfo = subFileInfo2;
                            i9 = i12;
                            i10 = i13;
                            it = it2;
                            baseBinInputStream = binInputStreamCompat;
                            int i14 = i8;
                            baseBinInputStream.setActiveCompareVersionFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i14));
                            baseBinInputStream.setInactiveVersionCompFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId()), loadParams.s(), a8.icType, baseBinInputStream, i14));
                            if (com.realsil.sdk.dfu.d.a.a(subFileInfo.wrapperBitNumber())) {
                                if (i10 <= 0 ? i10 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                    i10 = baseBinInputStream.getActiveCompareVersionFlag();
                                }
                            } else if (i9 <= 0 ? i9 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                i13 = i10;
                                i12 = baseBinInputStream.getActiveCompareVersionFlag();
                                arrayList2.add(baseBinInputStream);
                                if (subFileInfo.wrapperBitNumber() != 2) {
                                    ZLogger.v("ignore OTA_HEADER_FILE");
                                } else if (subFileInfo.wrapperBitNumber() == 1) {
                                    ZLogger.v("ignore SYSTEM_CONFIG_FILE");
                                } else {
                                    arrayList3.add(baseBinInputStream);
                                    arrayList.add(subFileInfo);
                                }
                                loadParams2 = loadParams;
                                it2 = it;
                            }
                        } else {
                            it = it2;
                            subFileInfo = subFileInfo2;
                            i9 = i12;
                            i10 = i13;
                            baseBinInputStream = binInputStreamCompat;
                        }
                        i13 = i10;
                        i12 = i9;
                        arrayList2.add(baseBinInputStream);
                        if (subFileInfo.wrapperBitNumber() != 2) {
                        }
                        loadParams2 = loadParams;
                        it2 = it;
                    }
                }
                int i15 = i12;
                int i16 = i13;
                aVar.a();
                if (D) {
                    a8.validateVersionFlag(i16, i15);
                }
                z7 = false;
            }
            return a8;
        }
        BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i11, loadParams2, true, false);
        if (openFileInputStreamCompat != null) {
            arrayList2.add(openFileInputStreamCompat);
            a8.icType = openFileInputStreamCompat.getIcType();
            a8.version = openFileInputStreamCompat.getImageVersion();
            if (!u7 || a8.checkIcType(i11)) {
                if (!D || 1 == com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                    arrayList3.add(openFileInputStreamCompat);
                }
            }
            return a8;
        }
        a8.onError(4097);
        z7 = false;
        a8.lowVersionExist = z7;
        a8.subBinInputStreams = arrayList2;
        a8.supportBinInputStreams = arrayList3;
        a8.supportSubFileInfos = arrayList;
        return a8;
    }

    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8;
        int i9 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        boolean y7 = loadParams.y();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z7 = false;
        if (aVar == null) {
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i9, loadParams, true, false);
            if (openFileInputStreamCompat != null) {
                arrayList2.add(openFileInputStreamCompat);
                a8.icType = openFileInputStreamCompat.getIcType();
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i9)) {
                    if (loadParams.s() && !com.realsil.sdk.dfu.d.a.b(openFileInputStreamCompat.getImageId())) {
                        a8.onError(4118);
                        return a8;
                    }
                    if (D && 1 != com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8)) {
                        z7 = true;
                    } else {
                        if (y7 && 1 != b(openFileInputStreamCompat, f8)) {
                            a8.onError(4109);
                            return a8;
                        }
                        arrayList3.add(openFileInputStreamCompat);
                    }
                }
            } else {
                a8.onError(4097);
            }
            a8.lowVersionExist = z7;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D) {
                a8.onError(4104);
            }
        } else if (!u7 || a8.checkIcType(i9)) {
            SubFileInfo d8 = aVar.d();
            if (d8 != null) {
                BaseBinInputStream binInputStreamCompat = d8.getBinInputStreamCompat(loadParams);
                if (y7 && binInputStreamCompat != null) {
                    if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, binInputStreamCompat.getImageId(), f8)) {
                        ZLogger.w("ota header section size check failed: ");
                        a8.onError(4109);
                        return a8;
                    }
                    ZLogger.d("preVerify OTA_HEADER_FILE ok, no need to check section size");
                    y7 = false;
                }
            }
            for (SubFileInfo subFileInfo : a(aVar, loadParams)) {
                BinIndicator indByBinId = BinIndicator.getIndByBinId(a8.icType, subFileInfo.binId);
                if (indByBinId != null) {
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, indByBinId.toString());
                    i8 = indByBinId.versionFormat;
                } else {
                    i8 = 1;
                }
                BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                if (binInputStreamCompat2 == null) {
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "not find image: " + subFileInfo.imageId);
                } else if (D && 1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, f8, i8)) {
                    z7 = true;
                } else if (!y7 || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, binInputStreamCompat2.getImageId(), f8)) {
                    arrayList2.add(binInputStreamCompat2);
                    arrayList3.add(binInputStreamCompat2);
                    arrayList.add(subFileInfo);
                }
            }
            aVar.a();
            a8.lowVersionExist = z7;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            if (D && z7 && arrayList3.size() < 1) {
                a8.onError(4104);
            }
        }
        return a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0173, code lost:
    
        if (r9.updateEnabled == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bd, code lost:
    
        r9.onError(4114);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BinInfo b(LoadParams loadParams) {
        SparseIntArray sparseIntArray;
        int i8;
        int i9;
        boolean z7;
        int i10;
        Iterator it;
        SubFileInfo subFileInfo;
        int i11;
        int i12;
        SparseIntArray sparseIntArray2;
        BaseBinInputStream baseBinInputStream;
        int i13 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean u7 = loadParams.u();
        boolean D = loadParams.D();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        if (aVar == null) {
            sparseIntArray = sparseIntArray3;
            BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(i13, loadParams, true, false);
            if (openFileInputStreamCompat != null) {
                arrayList2.add(openFileInputStreamCompat);
                a8.icType = openFileInputStreamCompat.getIcType();
                a8.version = openFileInputStreamCompat.getImageVersion();
                if (!u7 || a8.checkIcType(i13)) {
                    if (loadParams.s() && !com.realsil.sdk.dfu.d.a.b(openFileInputStreamCompat.getImageId())) {
                        a8.onError(4118);
                        return a8;
                    }
                    if (D) {
                        i9 = 1;
                        i8 = 1 != com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, loadParams.f()) ? 4104 : 4097;
                    } else {
                        i9 = 1;
                    }
                    if (loadParams.y() && i9 != b(openFileInputStreamCompat, loadParams.f())) {
                        a8.onError(4109);
                        return a8;
                    }
                    arrayList3.add(openFileInputStreamCompat);
                    a8.forceCopyImages = sparseIntArray;
                    a8.subBinInputStreams = arrayList2;
                    a8.supportBinInputStreams = arrayList3;
                    a8.supportSubFileInfos = arrayList;
                    return a8;
                }
                return a8;
            }
            a8.onError(i8);
            a8.forceCopyImages = sparseIntArray;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            return a8;
        }
        if (!u7 || a8.checkIcType(i13)) {
            List a9 = a(aVar, loadParams);
            if (aVar.a(2, a8.updateBank)) {
                z7 = D;
            } else {
                ZLogger.w(com.realsil.sdk.dfu.k.a.f15980a, "OtaHeader Miss");
                if (!loadParams.A() || !aVar.d(520)) {
                    a8.onError(4115);
                    return a8;
                }
                z7 = false;
            }
            Iterator it2 = a9.iterator();
            int i14 = 0;
            int i15 = 0;
            while (it2.hasNext()) {
                SubFileInfo subFileInfo2 = (SubFileInfo) it2.next();
                BinIndicator indByBinId = BinIndicator.getIndByBinId(a8.icType, subFileInfo2.binId);
                if (indByBinId != null) {
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, indByBinId.toString());
                    i10 = indByBinId.versionFormat;
                } else {
                    i10 = 1;
                }
                BaseBinInputStream binInputStreamCompat = subFileInfo2.getBinInputStreamCompat(loadParams);
                if (binInputStreamCompat == null) {
                    ZLogger.v(com.realsil.sdk.dfu.k.a.f15981b, "invalid stream: " + subFileInfo2.toString());
                    if (loadParams.q() && com.realsil.sdk.dfu.d.a.c(subFileInfo2.imageId)) {
                        sparseIntArray3.append(subFileInfo2.imageId, subFileInfo2.wrapperBitNumber());
                    }
                } else {
                    binInputStreamCompat.versionCheckOrder = com.realsil.sdk.dfu.e.a.a(binInputStreamCompat.getImageId());
                    if (f8 != null) {
                        subFileInfo = subFileInfo2;
                        i11 = i14;
                        it = it2;
                        i12 = i15;
                        sparseIntArray2 = sparseIntArray3;
                        baseBinInputStream = binInputStreamCompat;
                        int i16 = i10;
                        baseBinInputStream.setActiveCompareVersionFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getActiveImageVersionInfoByImageId(binInputStreamCompat.getImageId()), loadParams.s(), a8.icType, binInputStreamCompat, i16));
                        baseBinInputStream.setInactiveVersionCompFlag(VersionCheckUtils.checkImageVersionInfo(f8, f8.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId()), loadParams.s(), a8.icType, baseBinInputStream, i16));
                        if (com.realsil.sdk.dfu.d.a.a(subFileInfo.wrapperBitNumber())) {
                            if (i12 <= 0 ? i12 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                                i12 = baseBinInputStream.getActiveCompareVersionFlag();
                            }
                        } else if (i11 <= 0 ? i11 == 0 : baseBinInputStream.getActiveCompareVersionFlag() < 0) {
                            i15 = i12;
                            i14 = baseBinInputStream.getActiveCompareVersionFlag();
                            arrayList2.add(baseBinInputStream);
                            arrayList3.add(baseBinInputStream);
                            arrayList.add(subFileInfo);
                            it2 = it;
                            sparseIntArray3 = sparseIntArray2;
                        }
                    } else {
                        it = it2;
                        subFileInfo = subFileInfo2;
                        i11 = i14;
                        i12 = i15;
                        sparseIntArray2 = sparseIntArray3;
                        baseBinInputStream = binInputStreamCompat;
                    }
                    i15 = i12;
                    i14 = i11;
                    arrayList2.add(baseBinInputStream);
                    arrayList3.add(baseBinInputStream);
                    arrayList.add(subFileInfo);
                    it2 = it;
                    sparseIntArray3 = sparseIntArray2;
                }
            }
            int i17 = i14;
            int i18 = i15;
            sparseIntArray = sparseIntArray3;
            aVar.a();
            if (z7) {
                if (loadParams.m() != 0) {
                    Collections.sort(arrayList2, new b());
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i19);
                        i19++;
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
                } else {
                    a8.validateVersionFlag(i18, i17);
                }
            }
            a8.forceCopyImages = sparseIntArray;
            a8.subBinInputStreams = arrayList2;
            a8.supportBinInputStreams = arrayList3;
            a8.supportSubFileInfos = arrayList;
            return a8;
        }
        return a8;
    }
}
