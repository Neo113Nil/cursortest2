package x0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import b0.y;
import java.util.Objects;
import n.T;
import u0.B0;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10293a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10294b;

    public C1216d(ContentCaptureSession contentCaptureSession, View view) {
        this.f10293a = contentCaptureSession;
        this.f10294b = view;
    }

    public final AutofillId a(long j3) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession c2 = B0.c(this.f10293a);
        M.e m3 = T.m(this.f10294b);
        Objects.requireNonNull(m3);
        return AbstractC1214b.a(c2, y.f(m3.f3427a), j3);
    }
}
