package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.facebook.bolts.CancellationTokenSource;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FacebookWebFallbackDialog;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.FileLruCache;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.widget.ToolTipPopup;
import com.google.firebase.installations.FirebaseInstallations;
import com.majelw.libystne.MainActivity;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ k3(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x02f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x02f6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [android.app.Activity, com.majelw.libystne.MainActivity] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        long j;
        View findFocus;
        int i = this.m;
        Boolean bool = null;
        int i2 = 3;
        ?? r5 = 1;
        r5 = 1;
        int i3 = 0;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = r3.g;
                Method method = r3.f;
                ?? r4 = Build.VERSION.SDK_INT;
                if (r4 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((r4 != 26 && r4 != 27) || method != null) && (r3.e != null || r3.d != null)) {
                    try {
                        Object obj3 = r3.c.get(activity);
                        if (obj3 != null && (obj = r3.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            q3 q3Var = new q3(activity);
                            application.registerActivityLifecycleCallbacks(q3Var);
                            handler.post(new iu0(i2, q3Var, obj3));
                            if (r4 != 26 && r4 != 27) {
                                r5 = 0;
                            }
                            int i4 = 4;
                            try {
                                if (r5 != 0) {
                                    try {
                                        Boolean bool2 = Boolean.FALSE;
                                        r4 = application;
                                        r5 = q3Var;
                                        method.invoke(obj, obj3, null, null, 0, bool2, null, null, bool2, bool2);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        q3 q3Var2 = q3Var;
                                        handler.post(new iu0(i4, application2, q3Var2));
                                        throw th;
                                    }
                                } else {
                                    r4 = application;
                                    r5 = q3Var;
                                    activity.recreate();
                                }
                                handler.post(new iu0(i4, (Object) r4, (Object) r5));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                t7 t7Var = (t7) obj2;
                t7Var.L0 = false;
                MotionEvent motionEvent = t7Var.D0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    t7Var.H(motionEvent);
                    return;
                } else {
                    lh.g("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                u uVar = (u) obj2;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    uVar.invoke();
                    return;
                } finally {
                }
            case 3:
                b8 b8Var = (b8) obj2;
                Trace.beginSection("measureAndLayout");
                try {
                    b8Var.d.v(true);
                    Unit unit = Unit.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        b8Var.i();
                        Trace.endSection();
                        b8Var.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 4:
                v8 v8Var = (v8) obj2;
                boolean g = v8Var.g();
                t7 t7Var2 = v8Var.m;
                if (g) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        t7Var2.v(true);
                        zm1 zm1Var = v8Var.x;
                        int[] iArr = zm1Var.b;
                        long[] jArr = zm1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = i3; i7 < i6; i7++) {
                                        if ((255 & j2) < 128) {
                                            int i8 = iArr[(i5 << 3) + i7];
                                            if (!v8Var.e().a(i8)) {
                                                j = j2;
                                                v8Var.p.add(new b20(i8, v8Var.w, c20.n, null));
                                                v8Var.t.d(Unit.a);
                                                j2 = j >> 8;
                                            }
                                        }
                                        j = j2;
                                        j2 = j >> 8;
                                    }
                                    if (i6 != 8) {
                                    }
                                }
                                if (i5 != length) {
                                    i5++;
                                    i3 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        v8Var.i(t7Var2.getSemanticsOwner().a(), v8Var.y);
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                        v8Var.c(v8Var.e());
                        v8Var.p();
                        v8Var.z = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 5:
                AppEventQueue.flush$lambda$2((FlushReason) obj2);
                return;
            case 6:
                AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint$lambda$0((GraphRequest) obj2);
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                CancellationTokenSource.cancelAfter$lambda$6$lambda$5((CancellationTokenSource) obj2);
                return;
            case 8:
                CodelessMatcher.startTracking$lambda$1((CodelessMatcher) obj2);
                return;
            case 9:
                tx txVar = (tx) obj2;
                Runnable runnable = txVar.n;
                if (runnable != null) {
                    runnable.run();
                    txVar.n = null;
                    return;
                }
                return;
            case 10:
                ay.a((ay) obj2);
                return;
            case 11:
                DeviceAuthDialog.schedulePoll$lambda$3((DeviceAuthDialog) obj2);
                return;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                FacebookWebFallbackDialog.cancel$lambda$0((FacebookWebFallbackDialog) obj2);
                return;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ((FetchedAppGateKeepersManager.Callback) obj2).onCompleted();
                return;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) obj2).onError();
                return;
            case 15:
                FileLruCache.clearCache$lambda$1((File[]) obj2);
                return;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                FileLruCache.postTrim$lambda$3$lambda$2((FileLruCache) obj2);
                return;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                ((FirebaseInstallations) obj2).lambda$getId$1();
                return;
            case 18:
                sp0 sp0Var = (sp0) obj2;
                synchronized (sp0Var.p) {
                    try {
                        if (sp0Var.t == null) {
                            return;
                        }
                        try {
                            mq0 c = sp0Var.c();
                            int i9 = c.f;
                            if (i9 == 2) {
                                synchronized (sp0Var.p) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = ry2.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                u30 u30Var = sp0Var.o;
                                Context context = sp0Var.m;
                                u30Var.getClass();
                                mq0[] mq0VarArr = {c};
                                th2 th2Var = w03.a;
                                ak2.f("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface e = w03.a.e(context, mq0VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer m = yh2.m(sp0Var.m, c.a);
                                    if (m == null || e == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        js0 js0Var = new js0(e, o70.H(m));
                                        Trace.endSection();
                                        synchronized (sp0Var.p) {
                                            try {
                                                s93 s93Var = sp0Var.t;
                                                if (s93Var != null) {
                                                    s93Var.L(js0Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        sp0Var.b();
                                        return;
                                    } finally {
                                        int i11 = ry2.a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (sp0Var.p) {
                                try {
                                    s93 s93Var2 = sp0Var.t;
                                    if (s93Var2 != null) {
                                        s93Var2.K(th3);
                                    }
                                    sp0Var.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 19:
                ?? r0 = (MainActivity) obj2;
                int i12 = MainActivity.w;
                r0.s(r0);
                return;
            case 20:
                b52 b52Var = (b52) obj2;
                kd1 kd1Var = b52Var.r;
                if (b52Var.n == 0) {
                    b52Var.o = true;
                    kd1Var.f(yc1.ON_PAUSE);
                }
                if (b52Var.m == 0 && b52Var.o) {
                    kd1Var.f(yc1.ON_STOP);
                    b52Var.p = true;
                    return;
                }
                return;
            case 21:
                ya2.setRippleState$lambda$2((ya2) obj2);
                return;
            case 22:
                View view = (View) obj2;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 23:
                Task.Companion.delay$lambda$0((TaskCompletionSource) obj2);
                return;
            case 24:
                uv2 uv2Var = (uv2) obj2;
                mh mhVar = uv2Var.b;
                uv2Var.n = null;
                eo1 eo1Var = uv2Var.m;
                View view2 = uv2Var.a;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    eo1Var.g();
                    return;
                }
                Object[] objArr = eo1Var.m;
                int i13 = eo1Var.o;
                Boolean bool3 = null;
                for (int i14 = 0; i14 < i13; i14++) {
                    tv2 tv2Var = (tv2) objArr[i14];
                    int ordinal = tv2Var.ordinal();
                    if (ordinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (ordinal != 2 && ordinal != 3) {
                        a.b();
                        return;
                    } else {
                        if (!Intrinsics.b(bool, Boolean.FALSE)) {
                            bool3 = Boolean.valueOf(tv2Var == tv2.o);
                        }
                    }
                    bool3 = bool;
                }
                eo1Var.g();
                if (Intrinsics.b(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((y91) mhVar.o).getValue()).restartInput((View) mhVar.n);
                }
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((at0) ((at0) mhVar.p).m).m();
                    } else {
                        ((at0) ((at0) mhVar.p).m).i();
                    }
                }
                if (Intrinsics.b(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((y91) mhVar.o).getValue()).restartInput((View) mhVar.n);
                    return;
                }
                return;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                ToolTipPopup.show$lambda$2((ToolTipPopup) obj2);
                return;
            case 26:
                UserDataStore.setUserDataAndHash$lambda$1((Bundle) obj2);
                return;
            case 27:
                ViewObserver.process$lambda$0((ViewObserver) obj2);
                return;
            default:
                js0 js0Var2 = (js0) obj2;
                ((tc2) js0Var2.p).p(new k4(15, js0Var2));
                return;
        }
    }
}
