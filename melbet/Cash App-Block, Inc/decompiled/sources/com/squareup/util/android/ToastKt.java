package com.squareup.util.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.biometric.BiometricFragment;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public abstract class ToastKt {
    public static final Lazy mainHandler$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(10));

    public static final void toast(Context context, int i, String str) {
        context.getClass();
        str.getClass();
        if (Looper.myLooper() != null) {
            Toast.makeText(context, str, i).show();
        } else {
            ((Handler) mainHandler$delegate.getValue()).post(new BiometricFragment.AnonymousClass10(context, str, i, 5));
        }
    }

    public static final void toast(final Context context, final int i, final int i2) {
        context.getClass();
        if (Looper.myLooper() != null) {
            Toast.makeText(context, i, i2).show();
        } else {
            ((Handler) mainHandler$delegate.getValue()).post(new Runnable() { // from class: com.squareup.util.android.ToastKt$toast$$inlined$runOnLooperThread$2
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(context, i, i2).show();
                }
            });
        }
    }
}
