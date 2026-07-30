package com.realsil.sdk.dfu.model;

import android.util.SparseIntArray;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.image.pack.a;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.image.wrapper.BinImageWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BinInfo {
    public String fileName;
    public long fileSize;
    public SparseIntArray forceCopyImages;
    public int icType;
    public boolean isPackFile;
    public boolean lowVersionExist;
    public a packManager;
    public String path;
    public long version;
    public int fileType = 1;
    public int status = 4096;
    public boolean updateEnabled = true;
    public int bankIndicator = 0;
    public int updateBank = 15;
    public List<SubFileInfo> subFileInfos = new ArrayList();
    public List<BaseBinInputStream> subBinInputStreams = new ArrayList();
    public List<SubFileInfo> subFileInfos1 = new ArrayList();
    public List<SubFileInfo> activeSubFiles = new ArrayList();
    public List<SubFileInfo> supportSubFileInfos = new ArrayList();
    public List<BaseBinInputStream> supportBinInputStreams = new ArrayList();

    public boolean checkIcType(int i8) {
        int i9;
        boolean z7 = i8 > 3 ? i8 == 4 || i8 == 8 || i8 == 6 ? (i9 = this.icType) == 4 || i9 == 8 || i9 == 6 : i8 == this.icType : this.icType <= 3;
        if (!z7) {
            ZLogger.w(String.format("ic conflict: 0x%02X, 0x%02X", Integer.valueOf(i8), Integer.valueOf(this.icType)));
            onError(4101);
        }
        return z7;
    }

    @Deprecated
    public long getAppImageVersion(int i8) {
        return getAppImageWrapper(i8).getImageVersion();
    }

    public BinImageWrapper getAppImageWrapper(int i8) {
        BaseBinInputStream binInputStream;
        BinImageWrapper.Builder builder = new BinImageWrapper.Builder();
        if (this.isPackFile) {
            SubFileInfo subFileInfoByBitNumber = this.icType <= 3 ? (i8 == 0 || i8 == 15) ? getSubFileInfoByBitNumber(i8, 1) : getSubFileInfoByBitNumber(i8, 2) : getSubFileInfoByBitNumber(i8, 5);
            if (subFileInfoByBitNumber != null && (binInputStream = subFileInfoByBitNumber.getBinInputStream(this.icType, 0)) != null) {
                builder.setOtaVersion(binInputStream.otaVersion);
                builder.bitNumber(subFileInfoByBitNumber.wrapperBitNumber());
                builder.icType(this.icType);
                builder.binId(binInputStream.getBinId());
                builder.imageVersion(subFileInfoByBitNumber.imageVersion, 1);
                builder.imageFeature(binInputStream.getImageFeature());
            }
        } else {
            BaseBinInputStream singleBinInputStream = getSingleBinInputStream();
            if (singleBinInputStream != null) {
                builder.setOtaVersion(singleBinInputStream.otaVersion);
                builder.icType(this.icType);
                builder.imageVersion(singleBinInputStream.getImageVersion());
                builder.binId(singleBinInputStream.getBinId());
                builder.imageFeature(singleBinInputStream.getImageFeature());
                int i9 = this.icType;
                if (i9 <= 3) {
                    if (i8 == 0 || i8 == 15) {
                        builder.bitNumber(1);
                    } else {
                        builder.bitNumber(2);
                    }
                } else if (i9 == 5 || i9 == 9 || i9 == 12) {
                    builder.bitNumber(5);
                }
                builder.imageVersion(singleBinInputStream.getImageVersion(), 1);
            }
        }
        return builder.build();
    }

    public long getAppUiParameterVersion(int i8) {
        if (this.isPackFile) {
            SubFileInfo subFileInfoByBitNumber = getSubFileInfoByBitNumber(i8, 9);
            if (subFileInfoByBitNumber != null) {
                return subFileInfoByBitNumber.imageVersion;
            }
            return 0L;
        }
        BaseBinInputStream singleBinInputStream = getSingleBinInputStream();
        if (singleBinInputStream != null) {
            return singleBinInputStream.getImageVersion();
        }
        return 0L;
    }

    public BaseBinInputStream getBinInputStreamByBinId(int i8) {
        List<BaseBinInputStream> list = this.subBinInputStreams;
        if (list != null && list.size() > 0) {
            for (BaseBinInputStream baseBinInputStream : this.subBinInputStreams) {
                if (baseBinInputStream.getBinId() == i8) {
                    return baseBinInputStream;
                }
            }
        }
        return null;
    }

    public BaseBinInputStream getBinInputStreamByImageId(int i8) {
        List<BaseBinInputStream> list = this.subBinInputStreams;
        if (list != null && list.size() > 0) {
            for (BaseBinInputStream baseBinInputStream : this.subBinInputStreams) {
                if (baseBinInputStream.getImageId() == i8) {
                    return baseBinInputStream;
                }
            }
        }
        return null;
    }

    public BaseBinInputStream getOtaHeaderImage(int i8) {
        SubFileInfo subFileInfoByBitNumber;
        if (!this.isPackFile) {
            return getSingleBinInputStream();
        }
        if (this.icType > 3 && (subFileInfoByBitNumber = getSubFileInfoByBitNumber(i8, 2)) != null) {
            return subFileInfoByBitNumber.getBinInputStream(this.icType, 0);
        }
        return null;
    }

    public long getOtaHeaderImageVersion(int i8) {
        BaseBinInputStream otaHeaderImage = getOtaHeaderImage(i8);
        if (otaHeaderImage == null) {
            return 0L;
        }
        long imageVersion = otaHeaderImage.getImageVersion();
        try {
            otaHeaderImage.close();
        } catch (IOException e8) {
            ZLogger.w(e8.toString());
        }
        return imageVersion;
    }

    public BinImageWrapper getOtaHeaderImageWrapper(int i8) {
        BaseBinInputStream binInputStream;
        BinImageWrapper.Builder builder = new BinImageWrapper.Builder();
        if (!this.isPackFile) {
            BaseBinInputStream singleBinInputStream = getSingleBinInputStream();
            if (singleBinInputStream != null) {
                builder.setOtaVersion(singleBinInputStream.otaVersion);
                builder.icType(this.icType);
                builder.imageVersion(singleBinInputStream.getImageVersion());
                builder.binId(singleBinInputStream.getBinId());
                builder.imageFeature(singleBinInputStream.getImageFeature());
                if (this.icType > 3) {
                    builder.bitNumber(2);
                    builder.imageVersion(singleBinInputStream.getImageVersion(), 1);
                }
            }
        } else {
            if (this.icType <= 3) {
                return null;
            }
            SubFileInfo subFileInfoByBitNumber = getSubFileInfoByBitNumber(i8, 2);
            if (subFileInfoByBitNumber != null && (binInputStream = subFileInfoByBitNumber.getBinInputStream(this.icType, 0)) != null) {
                builder.setOtaVersion(binInputStream.otaVersion);
                builder.bitNumber(subFileInfoByBitNumber.wrapperBitNumber());
                builder.icType(this.icType);
                builder.binId(binInputStream.getBinId());
                builder.imageVersion(subFileInfoByBitNumber.imageVersion, 1);
                builder.imageFeature(binInputStream.getImageFeature());
            }
        }
        return builder.build();
    }

    @Deprecated
    public long getPatchImageVersion(int i8) {
        return getPatchImageWrapper(i8).getImageVersion();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r4 != 12) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinImageWrapper getPatchImageWrapper(int i8) {
        int i9;
        BaseBinInputStream binInputStream;
        BinImageWrapper.Builder builder = new BinImageWrapper.Builder();
        if (this.isPackFile) {
            SubFileInfo subFileInfoByBitNumber = this.icType <= 3 ? getSubFileInfoByBitNumber(i8, 0) : getSubFileInfoByBitNumber(i8, 4);
            if (subFileInfoByBitNumber != null && (binInputStream = subFileInfoByBitNumber.getBinInputStream(this.icType, 0)) != null) {
                builder.setOtaVersion(binInputStream.otaVersion);
                builder.bitNumber(subFileInfoByBitNumber.wrapperBitNumber());
                builder.icType(this.icType);
                builder.binId(binInputStream.getBinId());
                builder.imageVersion(subFileInfoByBitNumber.imageVersion, 1);
                builder.imageFeature(binInputStream.getImageFeature());
            }
        } else {
            BaseBinInputStream singleBinInputStream = getSingleBinInputStream();
            if (singleBinInputStream != null) {
                builder.setOtaVersion(singleBinInputStream.otaVersion);
                builder.icType(this.icType);
                builder.imageVersion(singleBinInputStream.getImageVersion());
                builder.binId(singleBinInputStream.getBinId());
                builder.imageFeature(singleBinInputStream.getImageFeature());
                int i10 = this.icType;
                if (i10 > 3) {
                    i9 = 5;
                    if (i10 != 5) {
                        if (i10 != 9) {
                        }
                    }
                } else if (i8 == 0 || i8 == 15) {
                    builder.bitNumber(1);
                    builder.imageVersion(singleBinInputStream.getImageVersion(), 1);
                } else {
                    i9 = 2;
                }
                builder.bitNumber(i9);
                builder.imageVersion(singleBinInputStream.getImageVersion(), 1);
            }
        }
        return builder.build();
    }

    public BaseBinInputStream getSingleBinInputStream() {
        List<BaseBinInputStream> list = this.subBinInputStreams;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.subBinInputStreams.get(0);
    }

    public SubFileInfo getSubFileInfoByBitNumber(int i8, int i9) {
        List<SubFileInfo> list = this.subFileInfos;
        if (list != null && list.size() > 0) {
            if (i8 == 0 || i8 == 15) {
                for (SubFileInfo subFileInfo : this.subFileInfos) {
                    if (subFileInfo.bitNumber == i9) {
                        return subFileInfo;
                    }
                }
            } else {
                for (SubFileInfo subFileInfo2 : this.subFileInfos1) {
                    if (subFileInfo2.wrapperBitNumber() == i9) {
                        return subFileInfo2;
                    }
                }
            }
        }
        return null;
    }

    public List<SubFileInfo> getSubFileInfos(int i8) {
        return i8 == 1 ? this.subFileInfos1 : this.subFileInfos;
    }

    public List<SubFileInfo> getSupportedFileInfos(int i8) {
        ArrayList arrayList = new ArrayList();
        List<SubFileInfo> list = this.supportSubFileInfos;
        if (list != null && !list.isEmpty()) {
            for (SubFileInfo subFileInfo : this.supportSubFileInfos) {
                if (subFileInfo.getBankNumber() == i8) {
                    arrayList.add(subFileInfo);
                }
            }
        }
        return arrayList;
    }

    public boolean isCompressed() {
        a aVar = this.packManager;
        if (aVar == null) {
            return false;
        }
        return aVar.f();
    }

    public void onError(int i8) {
        this.updateEnabled = false;
        this.status = i8;
    }

    public String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append("BinInfo{\n");
        sb.append(String.format("path=%s\n", this.path));
        Locale locale = Locale.US;
        sb.append(String.format(locale, "fileName=%s, fileSize=%d\n", this.fileName, Long.valueOf(this.fileSize)));
        sb.append(String.format(locale, "fileType=0x%02X, isPackFile=%b, bankIndicator=0x%02X, updateBank=0x%02X\n", Integer.valueOf(this.fileType), Boolean.valueOf(this.isPackFile), Integer.valueOf(this.bankIndicator), Integer.valueOf(this.updateBank)));
        sb.append(String.format(locale, "icType=0x%02X, updateEnabled=%b, status=%d\n", Integer.valueOf(this.icType), Boolean.valueOf(this.updateEnabled), Integer.valueOf(this.status)));
        if (this.isPackFile) {
            List<SubFileInfo> list = this.subFileInfos;
            sb.append(String.format(locale, "subFileInfos.size=%d\n", Integer.valueOf(list != null ? list.size() : 0)));
            List<SubFileInfo> list2 = this.subFileInfos1;
            sb.append(String.format(locale, "subFileInfos1.size=%d\n", Integer.valueOf(list2 != null ? list2.size() : 0)));
            List<SubFileInfo> list3 = this.supportSubFileInfos;
            format = String.format(locale, "supportSubFileInfos.size=%d\n", Integer.valueOf(list3 != null ? list3.size() : 0));
        } else {
            List<BaseBinInputStream> list4 = this.subBinInputStreams;
            sb.append(String.format(locale, "subBinInputStreams.size=%d\n", Integer.valueOf(list4 != null ? list4.size() : 0)));
            List<BaseBinInputStream> list5 = this.supportBinInputStreams;
            sb.append(String.format(locale, "supportBinInputStreams.size=%d\n", Integer.valueOf(list5 != null ? list5.size() : 0)));
            format = String.format(locale, "version=%d\n", Long.valueOf(this.version));
        }
        sb.append(format);
        sb.append("}");
        return sb.toString();
    }

    public void validateVersionFlag(int i8, int i9) {
        int i10;
        ZLogger.v(String.format(Locale.US, "nonConfigVersionFlag=%d, configVersionFlag=%d", Integer.valueOf(i8), Integer.valueOf(i9)));
        if (i8 < 0) {
            ZLogger.w("all code image version must >= active image version");
            i10 = 4114;
        } else {
            if (i8 != 0 || i9 > 0) {
                return;
            }
            ZLogger.d("there must be at least one data image version> active image version");
            i10 = 4113;
        }
        onError(i10);
    }

    public void validateVersionFlagVp(int i8, int i9, boolean z7) {
        int i10;
        ZLogger.v(String.format(Locale.US, "nonConfigVersionFlag=%d, configVersionFlag=%d", Integer.valueOf(i8), Integer.valueOf(i9)));
        if (i8 < 0) {
            ZLogger.w("all code image version must >= active image version");
            i10 = 4114;
        } else {
            if (i8 != 0) {
                return;
            }
            i10 = 4113;
            if (i9 >= 0 && (i9 != 0 || z7)) {
                return;
            } else {
                ZLogger.d("there must be at least one data image version> active image version");
            }
        }
        onError(i10);
    }
}
