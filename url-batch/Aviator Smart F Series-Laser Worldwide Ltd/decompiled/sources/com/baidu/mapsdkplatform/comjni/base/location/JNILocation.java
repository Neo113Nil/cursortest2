package com.baidu.mapsdkplatform.comjni.base.location;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class JNILocation {
    public native boolean CoordinateEncryptEx(int i8, float f8, float f9, Bundle bundle, String str);

    public native int Create();

    public native int QueryInterface(int i8);

    public native int Release(int i8);
}
