package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yp {
    public yp(String str, WorkerParameters workerParameters) {
        str.getClass();
        workerParameters.getClass();
    }

    public static xc a(View view, xc xcVar) {
        ContentInfo performReceiveContent;
        ContentInfo d = xcVar.a.d();
        d.getClass();
        performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d ? xcVar : new xc(new wz(performReceiveContent));
    }

    public static String[] b(View view) {
        String[] receiveContentMimeTypes;
        receiveContentMimeTypes = view.getReceiveContentMimeTypes();
        return receiveContentMimeTypes;
    }

    public static float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return abf.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return abf.b(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static EdgeEffect e(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? abf.c(context, attributeSet) : new EdgeEffect(context);
    }

    public static /* synthetic */ int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public yp(byte[] bArr) {
    }

    public yp() {
    }
}
