package com.baidu.mapsdkplatform.comapi.map;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.mapsdkplatform.comjni.tools.JNITools;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class t {
    private ArrayList<LatLng> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (String str2 : str.split("\\|")) {
            String[] split = str2.split(SystemInfoUtil.COMMA);
            String str3 = split[0];
            String str4 = split[1];
            try {
                arrayList.add(new LatLng(Integer.parseInt(str3) / 1000000.0f, Integer.parseInt(str4) / 1000000.0f));
            } catch (NumberFormatException e8) {
                e8.printStackTrace();
                return null;
            }
        }
        return arrayList;
    }

    private String c(String str) {
        String authToken = SyncSysInfo.getAuthToken();
        if (TextUtils.isEmpty(authToken)) {
            return null;
        }
        String aESSaltKey = JNITools.getAESSaltKey(authToken);
        String aESViKey = JNITools.getAESViKey(authToken);
        if (!TextUtils.isEmpty(aESSaltKey) && !TextUtils.isEmpty(aESViKey) && !TextUtils.isEmpty(str)) {
            try {
                return new String(AlgorithmUtil.getDecryptInfo(aESViKey, aESSaltKey, g(str))).trim();
            } catch (Exception unused) {
                Log.e("PrismBuildingInfo", "getBuildingGeom Decrypt failed");
            }
        }
        return null;
    }

    private byte[] f(String str) {
        if (str == null || str.length() < 2) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) (Integer.parseInt(str.substring(i9, i9 + 2), 16) & 255);
        }
        return bArr;
    }

    private byte[] g(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            int i10 = i9 + 1;
            bArr[i8] = (byte) ((Integer.parseInt(str.substring(i9, i10), 16) * 16) + Integer.parseInt(str.substring(i10, i9 + 2), 16));
        }
        return bArr;
    }

    public ArrayList<LatLng> b(String str) {
        String c8 = c(str);
        ArrayList<LatLng> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(c8)) {
            for (String str2 : c8.split("\\|")) {
                String[] split = str2.split(SystemInfoUtil.COMMA);
                if (split.length == 2) {
                    String str3 = split[0];
                    try {
                        arrayList.add(CoordUtil.mc2llDirect(new GeoPoint(Double.parseDouble(split[1]), Double.parseDouble(str3))));
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList<LatLng> d(String str) {
        String c8 = c(str);
        ArrayList<LatLng> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(c8)) {
            for (String str2 : c8.split(";")) {
                String[] split = str2.split(SystemInfoUtil.COMMA);
                if (split.length == 2) {
                    String str3 = split[0];
                    try {
                        arrayList.add(new LatLng(Double.parseDouble(split[1]), Double.parseDouble(str3)));
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList<LatLng> e(String str) {
        ArrayList<LatLng> a8 = a(new String(JNITools.decryptPNKD(f(str)), StandardCharsets.UTF_8));
        if (a8 == null) {
            return null;
        }
        return a(a8);
    }

    private ArrayList<LatLng> a(List<LatLng> list) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        arrayList.add(0, list.get(0));
        int size = list.size();
        for (int i8 = 1; i8 < size; i8++) {
            int i9 = i8 - 1;
            arrayList.add(new LatLng(arrayList.get(i9).latitude + list.get(i8).latitude, arrayList.get(i9).longitude + list.get(i8).longitude));
        }
        return arrayList;
    }
}
