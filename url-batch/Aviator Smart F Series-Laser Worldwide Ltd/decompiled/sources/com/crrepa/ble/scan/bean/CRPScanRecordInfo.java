package com.crrepa.ble.scan.bean;

/* loaded from: classes3.dex */
public class CRPScanRecordInfo {
    private int chipId;
    private String firmwareType;
    private BandFunction function;
    private String name;
    private McuPlatform platform;

    public enum BandFunction {
        FUNC_NORMAL(0),
        FUNC_TALK(32768),
        FUNC_GPS(16384),
        FUNC_MUSIC(8192),
        FUNC_LYRIC(4096),
        FUNC_BOND(2048);

        private int value;

        BandFunction(int i8) {
            this.value = i8;
        }

        public static BandFunction getInstance(int i8) {
            return i8 != 4096 ? i8 != 8192 ? i8 != 16384 ? i8 != 32768 ? FUNC_NORMAL : FUNC_TALK : FUNC_GPS : FUNC_MUSIC : FUNC_LYRIC;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum GoodixChip {
        GR_NONE(0),
        GR_5515(1);

        private int value;

        GoodixChip(int i8) {
            this.value = i8;
        }

        public static GoodixChip getInstance(int i8) {
            return i8 != 1 ? GR_NONE : GR_5515;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum HuntersunChip {
        HS_NONE(0),
        HS_6620D_A3(1),
        HS_6620D_A4(2),
        HS_6621(3);

        private int value;

        HuntersunChip(int i8) {
            this.value = i8;
        }

        public static HuntersunChip getInstance(int i8) {
            return i8 != 1 ? i8 != 2 ? i8 != 3 ? HS_NONE : HS_6621 : HS_6620D_A4 : HS_6620D_A3;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum McuPlatform {
        PLATFORM_NONE(0),
        PLATFORM_NORDIC(1),
        PLATFORM_HUNTERSUN(2),
        PLATFORM_REALTEK(3),
        PLATFORM_GOODIX(4),
        PLATFORM_SIFLI(5),
        PLATFORM_JIELI(6),
        PLATFORM_BLUETRUM(7),
        PLATFORM_HISILICON(8);

        private int value;

        McuPlatform(int i8) {
            this.value = i8;
        }

        public static McuPlatform getInstance(int i8) {
            switch (i8) {
                case 1:
                    return PLATFORM_NORDIC;
                case 2:
                    return PLATFORM_HUNTERSUN;
                case 3:
                    return PLATFORM_REALTEK;
                case 4:
                    return PLATFORM_GOODIX;
                case 5:
                    return PLATFORM_SIFLI;
                case 6:
                    return PLATFORM_JIELI;
                case 7:
                    return PLATFORM_BLUETRUM;
                case 8:
                    return PLATFORM_HISILICON;
                default:
                    return PLATFORM_NONE;
            }
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum NordicChip {
        NRF_NONE(0),
        NRF_51822(1),
        NRF_52832(2),
        NRF_52810(3),
        NRF_52840(4);

        private int value;

        NordicChip(int i8) {
            this.value = i8;
        }

        public static NordicChip getInstance(int i8) {
            return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? NRF_NONE : NRF_52840 : NRF_52810 : NRF_52832 : NRF_51822;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum RealtekChip {
        RTL_NONE(0),
        RTL_8762C(1),
        RTL_8762D(2);

        private int value;

        RealtekChip(int i8) {
            this.value = i8;
        }

        public static RealtekChip getInstance(int i8) {
            return i8 != 1 ? i8 != 2 ? RTL_NONE : RTL_8762D : RTL_8762C;
        }

        public int getValue() {
            return this.value;
        }
    }

    public int getChipId() {
        return this.chipId;
    }

    public String getFirmwareType() {
        return this.firmwareType;
    }

    public BandFunction getFunction() {
        return this.function;
    }

    public String getName() {
        return this.name;
    }

    public McuPlatform getPlatform() {
        return this.platform;
    }

    public boolean isBond() {
        return (this.function.getValue() & BandFunction.FUNC_BOND.getValue()) != 0;
    }

    public void setChipId(int i8) {
        this.chipId = i8;
    }

    public void setFirmwareType(String str) {
        this.firmwareType = str;
    }

    public void setFunction(BandFunction bandFunction) {
        this.function = bandFunction;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPlatform(McuPlatform mcuPlatform) {
        this.platform = mcuPlatform;
    }

    public String toString() {
        return "CRPScanRecordInfo{firmwareType='" + this.firmwareType + "', platform=" + this.platform + ", chipId=" + this.chipId + ", function=" + this.function + ", name='" + this.name + "'}";
    }
}
