package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class j3 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap a;
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String parameters = this.a;
        ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                B b = B.b;
                B b2 = B.b;
                String message = "Snapshot buffer close exception: " + e;
                b2.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                b2.a(A.CRITICAL, message);
            }
        }
        it.m = new ByteArrayOutputStream();
        if (it.d.getHeight() > 0 && it.d.getWidth() > 0 && (a = it.a((Rect) null)) != null) {
            it.n = a;
            if (parameters != null) {
                com.onevcat.uniwebview.a aVar = it.v;
                H3 method = H3.SnapshotRenderingStarted;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                aVar.j.a(method, parameters);
            }
        }
        return Unit.INSTANCE;
    }
}
