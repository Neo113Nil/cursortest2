package com.onevcat.uniwebview;

import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class v4 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this.a;
        ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                o oVar = o.b;
                o oVar2 = o.b;
                String message = "Snapshot buffer close exception: " + e;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                oVar2.a(n.CRITICAL, message);
            }
        }
        it.m = new ByteArrayOutputStream();
        if (it.e.getHeight() > 0 && it.e.getWidth() > 0) {
            it.n = it.a((Rect) null);
            if (str != null) {
                it.c.a(it.b, h5.SnapshotRenderingStarted, str);
            }
        }
        return Unit.INSTANCE;
    }
}
