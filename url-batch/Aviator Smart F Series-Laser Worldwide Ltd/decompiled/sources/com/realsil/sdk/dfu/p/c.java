package com.realsil.sdk.dfu.p;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.exception.LoadFileException;
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
public abstract class c extends com.realsil.sdk.dfu.k.a {

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
            int i8 = baseBinInputStream2.tempBufferCheckUpgradeOrder;
            int i9 = baseBinInputStream.tempBufferCheckUpgradeOrder;
            return i8 != i9 ? i8 - i9 : baseBinInputStream.normalUpgradeOrder - baseBinInputStream2.normalUpgradeOrder;
        }
    }

    public static int a(int i8, int i9) {
        if (i9 == 513 || i9 == 517 || i9 == 519 || i9 == 768) {
            return 3;
        }
        switch (i9) {
            case 61441:
            case 61442:
            case 61443:
            case 61444:
            case 61445:
            case 61446:
            case 61447:
            case 61448:
                return 0;
            default:
                return ((i8 == 11 || i8 == 17 || i8 == 19) && i9 == 2561) ? 0 : 1;
        }
    }

    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        SubFileInfo d8;
        int i12 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        boolean y7 = loadParams.y();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<BaseBinInputStream> arrayList3 = new ArrayList<>();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        if (aVar != null) {
            a8.bankIndicator = 0;
            if (!u7 || a8.checkIcType(i12)) {
                if (y7 && com.realsil.sdk.dfu.c.f.a(a8.icType) && (d8 = aVar.d()) != null) {
                    BaseBinInputStream binInputStreamCompat = d8.getBinInputStreamCompat(loadParams);
                    if (binInputStreamCompat == null || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, d8.imageId, f8)) {
                        z8 = true;
                    } else {
                        ZLogger.w("pre verify failed");
                        z8 = false;
                    }
                    z9 = true;
                } else {
                    z8 = true;
                    z9 = false;
                }
                if (z8) {
                    boolean z12 = false;
                    boolean z13 = false;
                    for (SubFileInfo subFileInfo : a(aVar, loadParams)) {
                        BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                        if (binInputStreamCompat2 == null) {
                            ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo.toString());
                        } else {
                            int checkNAndFlashFeature = binInputStreamCompat2.checkNAndFlashFeature(loadParams.w());
                            if (checkNAndFlashFeature != 4096) {
                                a8.onError(checkNAndFlashFeature);
                                return a8;
                            }
                            binInputStreamCompat2.tempBufferCheckUpgradeOrder = a(binInputStreamCompat2.icType, binInputStreamCompat2.getBinId());
                            int binId = binInputStreamCompat2.getBinId();
                            if (binId == 517) {
                                z12 = true;
                            } else if (binId == 519) {
                                z13 = true;
                            }
                            if (D && f8 != null) {
                                if (binInputStreamCompat2.otaVersion >= 3) {
                                    i11 = 518;
                                } else {
                                    BinIndicator d9 = com.realsil.sdk.dfu.image.a.d(subFileInfo.binId);
                                    i11 = d9 != null ? d9.versionFormat : 1;
                                }
                                VersionCheckUtils.checkImageVersionInfo2Compat(f8, binInputStreamCompat2, i11);
                            }
                            if (com.realsil.sdk.dfu.k.a.f15980a) {
                                ZLogger.v(binInputStreamCompat2.toString());
                            }
                            arrayList2.add(binInputStreamCompat2);
                            if (y7 && com.realsil.sdk.dfu.c.f.a(a8.icType)) {
                                if (z9) {
                                    ZLogger.d("preVerify OTA_HEADER_FILE ok, no need to check section size");
                                } else {
                                    i10 = 1;
                                    if (1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, subFileInfo.imageId, f8)) {
                                        i9 = 4109;
                                        break;
                                    }
                                    if (D || binInputStreamCompat2.getActiveCompareVersionFlag() == i10) {
                                        arrayList3.add(binInputStreamCompat2);
                                        arrayList.add(subFileInfo);
                                    }
                                }
                            }
                            i10 = 1;
                            if (D) {
                            }
                            arrayList3.add(binInputStreamCompat2);
                            arrayList.add(subFileInfo);
                        }
                    }
                    z10 = z12;
                    z11 = z13;
                } else {
                    z10 = false;
                    z11 = false;
                }
                if (!loadParams.B()) {
                    Collections.sort(arrayList2, new b());
                    if (D && (z10 | z11)) {
                        arrayList3 = a(arrayList3, z10, z11);
                    }
                }
                aVar.a();
            }
            return a8;
        }
        BaseBinInputStream openFileInputStreamCompat = com.realsil.sdk.dfu.k.a.openFileInputStreamCompat(a8.icType, loadParams, false);
        if (openFileInputStreamCompat != null) {
            arrayList2.add(openFileInputStreamCompat);
            a8.icType = openFileInputStreamCompat.getIcType();
            a8.version = openFileInputStreamCompat.getImageVersion();
            if (!loadParams.b(openFileInputStreamCompat.getBinId())) {
                throw new LoadFileException(String.format(Locale.US, "image 0x%04X not support single", Integer.valueOf(openFileInputStreamCompat.getBinId())), 4117);
            }
            int checkNAndFlashFeature2 = openFileInputStreamCompat.checkNAndFlashFeature(loadParams.w());
            if (checkNAndFlashFeature2 != 4096) {
                a8.onError(checkNAndFlashFeature2);
                return a8;
            }
            if (loadParams.C()) {
                int binId2 = openFileInputStreamCompat.getBinId();
                if (binId2 == 517) {
                    throw new LoadFileException("PRE_SYSTEM not support single", 4117);
                }
                if (binId2 == 519) {
                    throw new LoadFileException("PRE_UPPER_STACK not support single", 4117);
                }
                switch (binId2) {
                    case 61441:
                    case 61442:
                    case 61443:
                    case 61444:
                    case 61445:
                    case 61446:
                    case 61447:
                    case 61448:
                        if (openFileInputStreamCompat.otaVersion == 255) {
                            throw new LoadFileException(String.format("USER_DATA(0x%04X) not support RTK OTA policy", Integer.valueOf(openFileInputStreamCompat.getBinId())), 4117);
                        }
                    default:
                        openFileInputStreamCompat.tempBufferCheckUpgradeOrder = 0;
                        break;
                }
            }
            if (!u7 || a8.checkIcType(i12)) {
                if (D) {
                    i8 = 1;
                    z7 = 1 != com.realsil.sdk.dfu.k.a.checkSingleImageVersion2(openFileInputStreamCompat, f8);
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
        a8.lowVersionExist = z7;
        a8.subBinInputStreams = arrayList2;
        a8.supportBinInputStreams = arrayList3;
        a8.supportSubFileInfos = arrayList;
        if (D && z7 && arrayList3.size() <= 0) {
            i9 = 4104;
            a8.onError(i9);
            return a8;
        }
        return a8;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(com.realsil.sdk.dfu.image.pack.a aVar, LoadParams loadParams) {
        int l8;
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
                    if (loadParams.g() > 1) {
                        l8 = aVar.c() == 15 ? f8.bootBankInfo.getUpdateBankNumber() : f8.bootBankInfo.getUpdateBankNumber();
                        if (l8 == 1) {
                            com.realsil.sdk.dfu.image.pack.a.b(subFileInfo, loadParams);
                            if (aVar.a(subFileInfo)) {
                                com.realsil.sdk.dfu.image.pack.a.b(subFileInfo, loadParams);
                                arrayList.add(subFileInfo);
                            }
                        } else if (aVar.b(subFileInfo)) {
                            com.realsil.sdk.dfu.image.pack.a.b(subFileInfo, loadParams);
                            arrayList.add(subFileInfo);
                        }
                    }
                    l8 = loadParams.l();
                    if (l8 == 1) {
                    }
                }
            }
            if (loadParams.B()) {
                Collections.sort(arrayList, new a());
            }
        }
        return arrayList;
    }

    public static List a(List list, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BaseBinInputStream baseBinInputStream = (BaseBinInputStream) it.next();
                int binId = baseBinInputStream.getBinId();
                if (binId != 513) {
                    if (binId != 517) {
                        if ((binId == 519 || binId == 768) && z8) {
                            arrayList2.add(baseBinInputStream);
                        }
                    } else if (z7) {
                        arrayList.add(baseBinInputStream);
                    }
                    arrayList3.add(baseBinInputStream);
                } else if (z7) {
                    arrayList.add(baseBinInputStream);
                } else if (z8) {
                    arrayList2.add(baseBinInputStream);
                } else {
                    arrayList3.add(baseBinInputStream);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList.size() == 2) {
            arrayList4.addAll(arrayList);
        }
        if (arrayList2.size() == 3) {
            arrayList4.addAll(arrayList2);
        }
        if (arrayList3.size() > 0) {
            arrayList4.addAll(arrayList3);
        }
        return arrayList4;
    }
}
