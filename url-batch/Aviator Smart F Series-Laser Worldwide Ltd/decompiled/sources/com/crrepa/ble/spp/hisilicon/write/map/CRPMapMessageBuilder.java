package com.crrepa.ble.spp.hisilicon.write.map;

import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPLicenseResultInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPLocationInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPNatigationMessageInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPNavigationLocationInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRemainDistanceUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRemainTimeUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRoadGuideTextUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRouteFarAwayInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRouteGuideIconUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPUpdateSVGInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPVoiceResultInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.NavigationMessageType;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import com.crrepa.r.b;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class CRPMapMessageBuilder {

    /* renamed from: com.crrepa.ble.spp.hisilicon.write.map.CRPMapMessageBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType;

        static {
            int[] iArr = new int[NavigationMessageType.values().length];
            $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType = iArr;
            try {
                iArr[NavigationMessageType.NAVIGATION_YAW_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_YAW_ROUTE_CALCULATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_ROUTE_CALCULATION_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_ROUTE_CALCULATION_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_ROUTE_CALCULATION_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_DESTINATION_ARRIVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[NavigationMessageType.NAVIGATION_EXIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static byte[] getMapCmd(byte b8, String str) {
        BleLog.d("CRPMapMessageBuilder type: " + ((int) b8) + ", msg: " + str);
        return b.a(false, (byte) 13, (byte) 3, b8, str.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] sendCyclingRouteCmd() {
        return getMapCmd("/user/res/BaiduMap/route_riding_search.bin", (byte) 53);
    }

    public static byte[] sendLicenseResultCmd(CRPLicenseResultInfo cRPLicenseResultInfo) {
        return getMapCmd((byte) 15, k.a(cRPLicenseResultInfo));
    }

    public static byte[] sendLocationCmd(CRPLocationInfo cRPLocationInfo) {
        return getMapCmd((byte) 17, k.a(cRPLocationInfo));
    }

    public static byte[] sendNavigationInitCmd(boolean z7) {
        return getMapCmd((byte) 19, z7 ? "1" : "0");
    }

    public static byte[] sendNavigationLocationCmd(CRPNavigationLocationInfo cRPNavigationLocationInfo) {
        return getMapCmd((byte) 41, k.a(cRPNavigationLocationInfo));
    }

    public static byte[] sendNavigationMessageCmd(CRPNatigationMessageInfo cRPNatigationMessageInfo) {
        byte b8;
        NavigationMessageType navigationMessageType = NavigationMessageType.getInstance(cRPNatigationMessageInfo.getMsg_type());
        if (navigationMessageType == null) {
            return null;
        }
        switch (AnonymousClass1.$SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[navigationMessageType.ordinal()]) {
            case 3:
                b8 = 21;
                break;
            case 4:
                b8 = 23;
                break;
            case 5:
                b8 = 25;
                break;
            case 6:
                b8 = 27;
                break;
            case 7:
                b8 = 49;
                break;
            case 8:
                b8 = 67;
                break;
            default:
                b8 = -1;
                break;
        }
        return getMapCmd(b8, k.a(cRPNatigationMessageInfo));
    }

    public static byte[] sendPoiCmd() {
        return getMapCmd("/user/res/BaiduMap/poi.bin", (byte) 11);
    }

    public static byte[] sendPoiSuggestionCmd() {
        return getMapCmd("/user/res/BaiduMap/poi_sug_search.bin", (byte) 51);
    }

    public static byte[] sendRemainDistanceUpdateCmd(CRPRemainDistanceUpdateInfo cRPRemainDistanceUpdateInfo) {
        return getMapCmd((byte) 37, k.a(cRPRemainDistanceUpdateInfo));
    }

    public static byte[] sendRemainRouteCmd(boolean z7) {
        byte b8 = z7 ? (byte) 39 : (byte) 47;
        BleLog.d("sendRemainRouteCmd code = " + ((int) b8));
        return getMapCmd("/user/res/BaiduMap/remain_route_update.bin", b8);
    }

    public static byte[] sendRemainTimeUpdateCmd(CRPRemainTimeUpdateInfo cRPRemainTimeUpdateInfo) {
        return getMapCmd((byte) 35, k.a(cRPRemainTimeUpdateInfo));
    }

    public static byte[] sendReverseGeoCodeCmd() {
        return getMapCmd("/user/res/BaiduMap/regeocode_search.bin", (byte) 61);
    }

    public static byte[] sendRoadGuideTextUpdateCmd(CRPRoadGuideTextUpdateInfo cRPRoadGuideTextUpdateInfo) {
        return getMapCmd((byte) 31, k.a(cRPRoadGuideTextUpdateInfo));
    }

    public static byte[] sendRouteFarAwayCmd(CRPRouteFarAwayInfo cRPRouteFarAwayInfo) {
        NavigationMessageType navigationMessageType = NavigationMessageType.getInstance(cRPRouteFarAwayInfo.getMsg_type());
        if (navigationMessageType == null) {
            return null;
        }
        int i8 = AnonymousClass1.$SwitchMap$com$crrepa$ble$spp$hisilicon$write$map$bean$NavigationMessageType[navigationMessageType.ordinal()];
        return getMapCmd(i8 != 1 ? i8 != 2 ? (byte) -1 : (byte) 45 : (byte) 43, k.a(cRPRouteFarAwayInfo));
    }

    public static byte[] sendRouteGuideIconUpdateCmd(CRPRouteGuideIconUpdateInfo cRPRouteGuideIconUpdateInfo) {
        return getMapCmd((byte) 33, k.a(cRPRouteGuideIconUpdateInfo));
    }

    public static byte[] sendTransitRouteCmd() {
        return getMapCmd("/user/res/BaiduMap/route_transit_search.bin", (byte) 57);
    }

    public static byte[] sendUpdateSVGResultCmd(CRPUpdateSVGInfo cRPUpdateSVGInfo) {
        return getMapCmd((byte) 2, k.a(cRPUpdateSVGInfo));
    }

    public static byte[] sendVoiceResultCmd(CRPVoiceResultInfo cRPVoiceResultInfo) {
        return b.a(false, (byte) 13, (byte) 1, (byte) 2, k.a(cRPVoiceResultInfo).getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] sendWalkingRouteCmd() {
        return getMapCmd("/user/res/BaiduMap/route_walking_search.bin", (byte) 55);
    }

    private static byte[] getMapCmd(String str, byte b8) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return b.a(false, (byte) 13, (byte) 3, b8, bArr);
    }
}
