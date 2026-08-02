package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import com.google.android.apps.authenticator2.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efg {
    public boolean a;
    public final Object b;

    public efg(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper(), new bdy());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final void a(Runnable runnable) {
        if (this.a) {
            this.b.schedule(new drn(runnable, this, 10, null), 5L, TimeUnit.SECONDS).getClass();
        } else {
            runnable.run();
        }
    }

    public final synchronized void b(bdv bdvVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            bdvVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, bdvVar).sendToTarget();
    }

    public final void c() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006a A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:3:0x0028, B:5:0x002e, B:8:0x0034, B:9:0x0063, B:11:0x006a, B:12:0x0075, B:14:0x007c, B:21:0x0045, B:23:0x004b, B:25:0x0051), top: B:2:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:3:0x0028, B:5:0x002e, B:8:0x0034, B:9:0x0063, B:11:0x006a, B:12:0x0075, B:14:0x007c, B:21:0x0045, B:23:0x004b, B:25:0x0051), top: B:2:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet) {
        int h;
        int h2;
        Object obj = this.b;
        CheckedTextView checkedTextView = (CheckedTextView) obj;
        Context context = checkedTextView.getContext();
        int[] iArr = em.l;
        byo u = byo.u(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        yq.k((View) obj, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) u.a, R.attr.checkedTextViewStyle, 0);
        try {
            if (u.p(1) && (h2 = u.h(1, 0)) != 0) {
                try {
                    ((CheckedTextView) obj).setCheckMarkDrawable(e.f(((CheckedTextView) obj).getContext(), h2));
                } catch (Resources.NotFoundException unused) {
                }
                if (u.p(2)) {
                    ((CheckedTextView) this.b).setCheckMarkTintList(u.i(2));
                }
                if (u.p(3)) {
                    Object obj2 = this.b;
                    int e = u.e(3, -1);
                    Rect rect = jl.a;
                    ((CheckedTextView) obj2).setCheckMarkTintMode(a.q(e, null));
                }
            }
            if (u.p(0) && (h = u.h(0, 0)) != 0) {
                Object obj3 = this.b;
                ((CheckedTextView) obj3).setCheckMarkDrawable(e.f(((CheckedTextView) obj3).getContext(), h));
            }
            if (u.p(2)) {
            }
            if (u.p(3)) {
            }
        } finally {
            u.n();
        }
    }

    public efg(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = true;
    }

    public efg(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    public efg() {
        this.b = new afc(false);
    }
}
