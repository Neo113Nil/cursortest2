package com.baidu.vi;

import android.net.NetworkInfo;

/* loaded from: classes2.dex */
public class VNetworkInfo {
    public int state;
    public int type;
    public String typename;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10715a;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            f10715a = iArr;
            try {
                iArr[NetworkInfo.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10715a[NetworkInfo.State.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10715a[NetworkInfo.State.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10715a[NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10715a[NetworkInfo.State.SUSPENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public VNetworkInfo(NetworkInfo networkInfo) {
        this.typename = networkInfo.getTypeName();
        this.type = networkInfo.getType();
        int i8 = a.f10715a[networkInfo.getState().ordinal()];
        if (i8 == 1) {
            this.state = 2;
        } else if (i8 != 2) {
            this.state = 0;
        } else {
            this.state = 1;
        }
    }
}
