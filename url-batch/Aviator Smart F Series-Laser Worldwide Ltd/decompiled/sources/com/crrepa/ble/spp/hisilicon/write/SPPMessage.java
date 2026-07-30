package com.crrepa.ble.spp.hisilicon.write;

import java.io.File;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class SPPMessage {
    private static final int DEFAULT_PACKAGE_SIZE = 512;
    private byte[] bytes;
    private File file;
    private CRPSPPFileTransListener listener;
    private int packageLength = 512;
    private HisiliconFileType type;
    private String uploadPath;

    /* renamed from: com.crrepa.ble.spp.hisilicon.write.SPPMessage$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType;

        static {
            int[] iArr = new int[HisiliconFileType.values().length];
            $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType = iArr;
            try {
                iArr[HisiliconFileType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[HisiliconFileType.MAP_SVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[HisiliconFileType.RE_GEO_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[HisiliconFileType.POI_SUGGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[HisiliconFileType.POI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[HisiliconFileType.ROUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[HisiliconFileType.REMAIN_ROUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public SPPMessage(File file, HisiliconFileType hisiliconFileType, CRPSPPFileTransListener cRPSPPFileTransListener) {
        this.file = file;
        this.type = hisiliconFileType;
        this.listener = cRPSPPFileTransListener;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public File getFile() {
        return this.file;
    }

    public CRPSPPFileTransListener getListener() {
        return this.listener;
    }

    public int getPackageLength() {
        return this.packageLength;
    }

    public HisiliconFileType getType() {
        return this.type;
    }

    public String getUploadPath() {
        String str;
        switch (AnonymousClass1.$SwitchMap$com$crrepa$ble$spp$hisilicon$write$HisiliconFileType[this.type.ordinal()]) {
            case 1:
                return this.uploadPath;
            case 2:
                str = "/user/res/BaiduMap/default_titles/";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                str = "/user/res/BaiduMap/";
                break;
            default:
                return "";
        }
        return str + this.file.getName();
    }

    public boolean isFile() {
        return this.file != null;
    }

    public void setPackageLength(int i8) {
        this.packageLength = i8;
    }

    public void setUploadPath(String str) {
        this.uploadPath = str;
    }

    public String toString() {
        return "SPPMessage{bytes=" + Arrays.toString(this.bytes) + ", file=" + this.file + ", type=" + this.type + ", listener=" + this.listener + ", packageLength=" + this.packageLength + '}';
    }

    public SPPMessage(byte[] bArr) {
        this.bytes = bArr;
    }

    public SPPMessage(byte[] bArr, HisiliconFileType hisiliconFileType) {
        this.bytes = bArr;
        this.type = hisiliconFileType;
    }
}
