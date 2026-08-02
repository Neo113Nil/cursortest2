package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import java.io.InputStream;
import kotlin.Result;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class n0 {
    public final byte[] a;

    static {
        Reflection.factory.getOrCreateKotlinClass(n0.class).getSimpleName();
    }

    public n0(Context context) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            InputStream open = context.getAssets().open("30B3C428-8A13-44BA-9D09-036CC8DD3E37.der");
            open.getClass();
            failure = ByteStreamsKt.readBytes(open);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        this.a = (byte[]) (failure instanceof Result.Failure ? null : failure);
    }
}
