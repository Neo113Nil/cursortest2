package com.realsil.sdk.dfu.model;

import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.image.wrapper.BinImageWrapper;
import com.realsil.sdk.dfu.image.wrapper.SocImageWrapper;

/* loaded from: classes4.dex */
public final class DeviceInfoWrapper {

    /* renamed from: a, reason: collision with root package name */
    public DeviceInfo f16162a;

    public DeviceInfoWrapper(DeviceInfo deviceInfo) {
        this.f16162a = deviceInfo;
    }

    public final int a(int i8, int i9) {
        return i8;
    }

    public final int b(int i8, int i9) {
        return (i9 >> (i8 * 2)) & 3;
    }

    public String formatAppImageVersionOld() {
        return new BinImageWrapper.Builder().setOtaVersion(this.f16162a.specVersion).icType(this.f16162a.icType).binId(ViewUtils.EDGE_TO_EDGE_FLAGS).imageVersion(this.f16162a.getAppVersion(), 2).build().getFormattedVersion();
    }

    public String formatPatchExtImageVersionOld() {
        return new BinImageWrapper.Builder().setOtaVersion(this.f16162a.specVersion).icType(this.f16162a.icType).binId(-1).imageVersion(this.f16162a.getAppVersion(), 2).build().getFormattedVersion();
    }

    public String formatPatchImageVersionOld() {
        return new BinImageWrapper.Builder().setOtaVersion(this.f16162a.specVersion).icType(this.f16162a.icType).binId(512).imageVersion(this.f16162a.getAppVersion(), 2).build().getFormattedVersion();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10136);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r1 = a(10, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getAncImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10136);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(10, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10134);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r1 = a(9, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getAppConfigImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10134);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(9, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    public SocImageWrapper getAppImageWrapper() {
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a).setImageId(10131).setImageVersion(this.f16162a.getAppVersion());
        return builder.build();
    }

    public SocImageWrapper getAppUiParameterVersion() {
        return getAppConfigImageWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10133);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r1 = a(7, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getDspAppImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10133);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(7, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    @Deprecated
    public SocImageWrapper getDspAppVersion() {
        return getDspAppImageWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10135);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r1 = a(8, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getDspConfigImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10135);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(8, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10132);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        r1 = a(6, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getDspPatchImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10132);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(6, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    public SocImageWrapper getDspPatchVersion() {
        return getDspPatchImageWrapper();
    }

    public SocImageWrapper getDspUiParameterVersion() {
        return getDspConfigImageWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10137);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r1 = a(11, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getEx1ImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10137);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(11, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10138);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r1 = a(12, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getEx2ImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10138);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(12, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10139);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.specVersion >= 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.specVersion >= 4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r1 = a(13, r2.imageVersionIndicator);
        r2 = r6.f16162a.getActiveImageVersionInfo(r1);
        r0.setBitNumber(r1);
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getEx3ImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10139);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 != 16) {
            if (i8 != 17) {
                int i9 = deviceInfo.specVersion;
                if (i9 != 0 && i9 == 1) {
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a(13, deviceInfo.imageVersionIndicator));
                } else {
                    imageVersionInfo = null;
                }
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    public SocImageWrapper getImageWrapper(int i8) {
        switch (i8) {
            case 10132:
                return getDspPatchImageWrapper();
            case 10133:
                return getDspAppImageWrapper();
            case 10134:
                return getAppConfigImageWrapper();
            case 10135:
                return getDspConfigImageWrapper();
            case 10136:
                return getAncImageWrapper();
            case 10137:
                return getEx1ImageWrapper();
            case 10138:
                return getEx2ImageWrapper();
            case 10139:
                return getEx3ImageWrapper();
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r2.specVersion >= 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r1 = r2.getActiveImageVersionInfoByImageId(10128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r2.specVersion >= 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (r3 != 12) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        if (r2.specVersion >= 6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0082, code lost:
    
        if (r1 != 12) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getOtaHeaderImageWrapper() {
        ImageVersionInfo activeImageVersionInfoByImageId;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10128);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 == 16) {
            int i9 = deviceInfo.icType;
            if (i9 != 4 && i9 != 6 && i9 != 11 && i9 != 7 && i9 != 8 && i9 != 10) {
                if (i9 == 5 || i9 == 9 || i9 == 12) {
                }
                activeImageVersionInfoByImageId = null;
            }
        } else if (i8 == 17) {
            int i10 = deviceInfo.icType;
            if (i10 != 4 && i10 != 6 && i10 != 11 && i10 != 7 && i10 != 8 && i10 != 10) {
                if (i10 != 5) {
                    if (i10 != 9) {
                    }
                }
            }
            activeImageVersionInfoByImageId = this.f16162a.getActiveImageVersionInfo(a(2, deviceInfo.imageVersionIndicator));
        } else {
            int i11 = deviceInfo.specVersion;
            if (i11 != 0) {
                if (i11 == 1) {
                    int i12 = deviceInfo.icType;
                    if (i12 != 4) {
                        if (i12 != 6) {
                            if (i12 != 11) {
                                if (i12 != 7) {
                                    if (i12 != 8) {
                                        if (i12 != 10) {
                                            if (i12 != 5) {
                                                if (i12 != 9) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    activeImageVersionInfoByImageId = this.f16162a.getActiveImageVersionInfo(a(2, deviceInfo.imageVersionIndicator));
                }
            }
            activeImageVersionInfoByImageId = null;
        }
        if (activeImageVersionInfoByImageId != null) {
            builder.setImageVersion(activeImageVersionInfoByImageId.getVersion());
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r2 != 10) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r3.specVersion >= 6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        if (r2 != 10) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SocImageWrapper getRomPatchImageWrapper() {
        ImageVersionInfo imageVersionInfo;
        int a8;
        SocImageWrapper.Builder builder = new SocImageWrapper.Builder();
        builder.setDeviceInfo(this.f16162a);
        builder.setImageId(10130);
        DeviceInfo deviceInfo = this.f16162a;
        int i8 = deviceInfo.protocolType;
        if (i8 == 16) {
            if (deviceInfo.specVersion < 4) {
                int i9 = deviceInfo.icType;
                if (i9 > 3) {
                    if (i9 != 5) {
                        if (i9 != 9) {
                            if (i9 != 12) {
                                if (i9 != 4) {
                                    if (i9 != 11) {
                                        if (i9 != 6) {
                                            if (i9 != 7) {
                                                if (i9 != 8) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a8 = a(4, deviceInfo.imageVersionIndicator);
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a8);
                }
                a8 = a(0, deviceInfo.imageVersionIndicator);
                imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a8);
            }
            imageVersionInfo = deviceInfo.getActiveImageVersionInfoByImageId(10130);
        } else if (i8 == 17) {
            int i10 = deviceInfo.icType;
            if (i10 > 3) {
                if (i10 != 5 && i10 != 9 && i10 != 12) {
                    if (i10 == 4 || i10 == 6 || i10 == 11 || i10 == 7 || i10 == 8 || i10 == 10) {
                    }
                    imageVersionInfo = null;
                }
                a8 = a(4, deviceInfo.imageVersionIndicator);
                imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a8);
            }
            a8 = a(0, deviceInfo.imageVersionIndicator);
            imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a8);
        } else {
            int i11 = deviceInfo.specVersion;
            if (i11 == 0) {
                imageVersionInfo = new ImageVersionInfo(0, b(0, this.f16162a.imageVersionIndicator), this.f16162a.getOldPatchVersion(), 0);
            } else {
                if (i11 == 1) {
                    int i12 = deviceInfo.icType;
                    if (i12 > 3) {
                        if (i12 != 5) {
                            if (i12 != 9) {
                                if (i12 != 12) {
                                    if (i12 != 4) {
                                        if (i12 != 11) {
                                            if (i12 != 6) {
                                                if (i12 != 7) {
                                                    if (i12 != 8) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        a8 = a(4, deviceInfo.imageVersionIndicator);
                        imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a8);
                    }
                    a8 = a(0, deviceInfo.imageVersionIndicator);
                    imageVersionInfo = this.f16162a.getActiveImageVersionInfo(a8);
                } else if (i11 == 2) {
                    imageVersionInfo = new ImageVersionInfo(0, b(0, this.f16162a.imageVersionIndicator), this.f16162a.getOldPatchVersion(), 0);
                }
                imageVersionInfo = null;
            }
        }
        if (imageVersionInfo != null) {
            builder.setImageVersion(imageVersionInfo.getVersion());
        }
        return builder.build();
    }

    public SocImageWrapper getSocAppImageWrapper() {
        return getAppImageWrapper();
    }

    public boolean isAppDataSupportedOld() {
        return this.f16162a.appDataSupportedOld;
    }

    public boolean isOldImageVersionPolicySupported() {
        return this.f16162a.getProtocolType() == 0 && this.f16162a.specVersion == 0;
    }
}
