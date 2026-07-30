package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import com.baidu.ar.auth.IAuthCallback;
import com.baidu.ar.auth.IDuMixAuthCallback;
import com.baidu.ar.callback.ICallbackWith;
import java.util.List;

/* loaded from: classes.dex */
public interface q5 {
    Bitmap a(Context context);

    List<Integer> a(Context context, byte[] bArr, IDuMixAuthCallback iDuMixAuthCallback);

    List<Integer> a(Context context, byte[] bArr, ICallbackWith<List<Integer>> iCallbackWith, ICallbackWith<Integer> iCallbackWith2);

    void a(Context context, IAuthCallback iAuthCallback);

    void a(byte[] bArr, String str, String str2, String str3);

    boolean a();

    boolean a(int i8);

    boolean a(Context context, byte[] bArr);

    void b(Context context);

    boolean b(int i8);

    void c(int i8);

    void c(Context context);

    void release();
}
