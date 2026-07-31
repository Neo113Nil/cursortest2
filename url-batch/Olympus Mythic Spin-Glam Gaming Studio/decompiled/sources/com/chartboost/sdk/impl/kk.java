package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: classes10.dex */
public abstract class kk {
    public static final of b(hk hkVar, th thVar, u8 u8Var) {
        File a;
        RandomAccessFile randomAccessFile;
        if (u8Var != null) {
            try {
                a = u8Var.a(u8Var.b(), hkVar.d());
            } catch (Exception e) {
                xb.b(e.toString(), (Throwable) null, 2, (Object) null);
            }
        } else {
            a = null;
        }
        if (a != null && a.exists()) {
            randomAccessFile = thVar.a(a);
        } else {
            File a2 = thVar.a(hkVar.b(), hkVar.d());
            if (a2 != null) {
                randomAccessFile = thVar.a(a2);
            }
            randomAccessFile = null;
        }
        if (randomAccessFile != null) {
            return new of(randomAccessFile);
        }
        return null;
    }
}
