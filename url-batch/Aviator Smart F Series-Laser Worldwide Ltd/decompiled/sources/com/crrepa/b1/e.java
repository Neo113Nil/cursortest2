package com.crrepa.b1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.crrepa.ble.lzo.MiniLzoHelper;
import com.crrepa.g1.h;
import java.io.File;

/* loaded from: classes2.dex */
public class e extends com.crrepa.l0.b {

    /* renamed from: n, reason: collision with root package name */
    private static final int f10866n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final String f10867o = "wf.bin";

    /* renamed from: p, reason: collision with root package name */
    private static final String f10868p = "wf_lzo.bin";

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        byte[] a8;
        if (bitmapArr == null || bitmapArr.length < 2 || (a8 = a(z7, bitmapArr)) == null) {
            return null;
        }
        File e8 = e();
        String a9 = h.a(a8, new File(e8, f10867o));
        if (TextUtils.isEmpty(a9)) {
            return null;
        }
        String absolutePath = new File(e8, f10868p).getAbsolutePath();
        new MiniLzoHelper().compress(a9, absolutePath);
        return h.a(absolutePath);
    }
}
