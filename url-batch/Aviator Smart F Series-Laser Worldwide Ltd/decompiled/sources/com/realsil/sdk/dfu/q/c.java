package com.realsil.sdk.dfu.q;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.VersionCheckUtils;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BankInfo;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(com.realsil.sdk.dfu.image.pack.a aVar, LoadParams loadParams) {
        int l8;
        BankInfo bankInfo;
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
                    if (loadParams.g() > 0) {
                        int i9 = subFileInfo.binId;
                        if (i9 == 2817) {
                            bankInfo = f8.bootBankInfo;
                        } else if (i9 == 769) {
                            bankInfo = f8.secureBankInfo;
                        }
                        l8 = bankInfo.getUpdateBankNumber();
                        ZLogger.v("BankBlockSize=" + aVar.b());
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
                    ZLogger.v("BankBlockSize=" + aVar.b());
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

    public static BinInfo loadImageBinInfo(LoadParams loadParams) {
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        SubFileInfo d8;
        int i10 = loadParams.i();
        OtaDeviceInfo f8 = loadParams.f();
        boolean D = loadParams.D();
        boolean u7 = loadParams.u();
        BinInfo a8 = com.realsil.sdk.dfu.k.a.a(loadParams);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.realsil.sdk.dfu.image.pack.a aVar = a8.packManager;
        boolean z9 = true;
        if (aVar != null) {
            a8.bankIndicator = 0;
            if (!u7 || a8.checkIcType(i10)) {
                if (!loadParams.y() || (d8 = aVar.d()) == null) {
                    z7 = true;
                    z8 = false;
                } else {
                    BaseBinInputStream binInputStreamCompat = d8.getBinInputStreamCompat(loadParams);
                    if (binInputStreamCompat == null || 1 == com.realsil.sdk.dfu.k.a.a(binInputStreamCompat, d8.imageId, f8)) {
                        z7 = true;
                    } else {
                        ZLogger.w("pre verify failed");
                        z7 = false;
                    }
                    z8 = true;
                }
                if (z7) {
                    for (SubFileInfo subFileInfo : a(aVar, loadParams)) {
                        BaseBinInputStream binInputStreamCompat2 = subFileInfo.getBinInputStreamCompat(loadParams);
                        if (binInputStreamCompat2 != null) {
                            if (loadParams.y() && !z8 && 1 != com.realsil.sdk.dfu.k.a.a(binInputStreamCompat2, subFileInfo.imageId, f8)) {
                                i8 = 4109;
                                break;
                            }
                            if (D && f8 != null) {
                                if (binInputStreamCompat2.otaVersion >= 3) {
                                    i9 = 518;
                                } else {
                                    BinIndicator binIndicator = subFileInfo.getBinIndicator();
                                    i9 = binIndicator != null ? binIndicator.versionFormat : 1;
                                }
                                VersionCheckUtils.checkImageVersionInfo2Compat(f8, binInputStreamCompat2, i9);
                            }
                            if (com.realsil.sdk.dfu.k.a.f15981b) {
                                ZLogger.v(binInputStreamCompat2.toString());
                            }
                            arrayList2.add(binInputStreamCompat2);
                            if (!D || binInputStreamCompat2.getActiveCompareVersionFlag() == 1) {
                                arrayList3.add(binInputStreamCompat2);
                                arrayList.add(subFileInfo);
                            }
                        } else {
                            ZLogger.v(com.realsil.sdk.dfu.k.a.f15980a, "invalid stream: " + subFileInfo.toString());
                        }
                    }
                }
                aVar.a();
                z9 = false;
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
            if (!u7 || a8.checkIcType(i10)) {
                BinIndicator binIndicatorByImageId = BinIndicator.getBinIndicatorByImageId(a8.icType, openFileInputStreamCompat.getImageId(), 0);
                if (!D || 1 == com.realsil.sdk.dfu.k.a.checkSingleImageVersion(binIndicatorByImageId, openFileInputStreamCompat, f8)) {
                    if (!loadParams.y() || 1 == com.realsil.sdk.dfu.k.a.a(openFileInputStreamCompat, f8)) {
                        arrayList3.add(openFileInputStreamCompat);
                    }
                }
            }
            return a8;
        }
        a8.onError(4097);
        z9 = false;
        a8.lowVersionExist = z9;
        a8.subBinInputStreams = arrayList2;
        a8.supportBinInputStreams = arrayList3;
        a8.supportSubFileInfos = arrayList;
        if (D && z9 && arrayList3.size() <= 0) {
            i8 = 4104;
            a8.onError(i8);
            return a8;
        }
        return a8;
    }
}
