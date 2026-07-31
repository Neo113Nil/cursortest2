package k2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.CursorAnchorInfo;
import d1.o;
import g2.a0;
import g2.h0;
import java.util.ArrayList;
import java.util.Objects;
import t.w0;
import x1.t;
import z0.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final View f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4174b;

    public c(View view) {
        this.f4173a = view;
        this.f4174b = a.a.q(c6.e.f1745d, new o(2, this));
    }

    public AutofillId a(long j7) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession c8 = w0.c(this.f4174b);
        q0.e A = r2.o.A(this.f4173a);
        Objects.requireNonNull(A);
        return i3.b.b(c8, f.a(A.f5938a), j7);
    }

    public c(ContentCaptureSession contentCaptureSession, View view) {
        this.f4174b = contentCaptureSession;
        this.f4173a = view;
    }

    public c(View view, t tVar) {
        new c(view);
        Choreographer.getInstance();
        this.f4173a = view;
        long j7 = h0.f2958b;
        int length = new g2.e("").f2928e.length();
        int i = h0.f2959c;
        int i8 = (int) (j7 >> 32);
        int i9 = i8 < 0 ? 0 : i8;
        i9 = i9 > length ? length : i9;
        int i10 = (int) (j7 & 4294967295L);
        int i11 = i10 >= 0 ? i10 : 0;
        length = i11 <= length ? i11 : length;
        if (i9 != i8 || length != i10) {
            a0.b(i9, length);
        }
        int i12 = b.f4168e;
        new ArrayList();
        this.f4174b = a.a.q(c6.e.f1745d, new o(3, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
