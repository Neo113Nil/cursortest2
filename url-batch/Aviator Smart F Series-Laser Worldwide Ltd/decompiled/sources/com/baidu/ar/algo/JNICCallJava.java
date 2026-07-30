package com.baidu.ar.algo;

import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.a6;
import com.baidu.ar.a7;
import com.baidu.ar.o;
import com.baidu.ar.o5;
import com.baidu.ar.sd;

/* loaded from: classes.dex */
public class JNICCallJava {
    private static o5 sIAlgoTransmitProtobufCallBack;
    private static a6 sIGravityOperation;
    private static a7 sITransModelPointCallback;
    private static String sUserID;
    private static sd sVPASParamsTransCallback;

    public static float[] getGPS() {
        return sVPASParamsTransCallback.b() == null ? new float[]{0.0f, 0.0f} : new float[]{(float) sVPASParamsTransCallback.b()[0], (float) sVPASParamsTransCallback.b()[1], 0.0f};
    }

    public static float[] getGravityDirection() {
        a6 a6Var = sIGravityOperation;
        return a6Var != null ? a6Var.a() : new float[]{0.0f, 0.0f, 0.0f};
    }

    public static String getPhoneType() {
        return "Android_" + Build.MODEL;
    }

    public static String getSessionId() {
        return sVPASParamsTransCallback.c() != null ? sVPASParamsTransCallback.c() : "";
    }

    public static String getUserID() {
        return TextUtils.isEmpty(sUserID) ? "" : sUserID;
    }

    public static String getVersion() {
        return o.b();
    }

    public static void removeAllCallback() {
        sITransModelPointCallback = null;
        sIGravityOperation = null;
        sIAlgoTransmitProtobufCallBack = null;
        sUserID = null;
    }

    public static void setAlgoGeneraProtobufCallBack(o5 o5Var) {
        sIAlgoTransmitProtobufCallBack = o5Var;
    }

    public static void setGravityCallBack(a6 a6Var) {
        sIGravityOperation = a6Var;
    }

    public static int setProtobufBufStrs(byte[] bArr) {
        o5 o5Var = sIAlgoTransmitProtobufCallBack;
        if (o5Var == null) {
            return 0;
        }
        o5Var.a(bArr);
        return 0;
    }

    public static void setUserID(String str) {
        sUserID = str;
    }

    public static void setVPASsParamsTransCallback(sd sdVar) {
        sVPASParamsTransCallback = sdVar;
    }

    public static void setsITransModelPointCallback(a7 a7Var) {
        sITransModelPointCallback = a7Var;
    }

    public static int transModelPointsData(float[] fArr) {
        a7 a7Var = sITransModelPointCallback;
        if (a7Var != null) {
            a7Var.a(0, fArr);
        }
        return 0;
    }

    public static void transSessionState(int i8, String str) {
        a7 a7Var = sITransModelPointCallback;
        if (a7Var == null || i8 != 1015) {
            return;
        }
        a7Var.a(2, Integer.valueOf(i8));
    }

    public static void transTrackerState(int i8) {
        a7 a7Var = sITransModelPointCallback;
        if (a7Var != null) {
            a7Var.a(1, Integer.valueOf(i8));
        }
    }
}
