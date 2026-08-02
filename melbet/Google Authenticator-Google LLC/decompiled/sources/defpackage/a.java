package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.authenticator2.R;
import j$.time.Instant;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.crypto.Cipher;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class a {
    public static /* synthetic */ int A(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int B(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int C(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void D(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean E(int i) {
        return x(i) != 0;
    }

    public static /* synthetic */ boolean F(int i) {
        return y(i) != 0;
    }

    public static /* synthetic */ boolean G(int i) {
        return A(i) != 0;
    }

    public static /* synthetic */ int H(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ void I(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static boolean J(int i) {
        return i == 13 || i == 14;
    }

    public static /* synthetic */ String K(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static void L(int i, View view, ViewGroup viewGroup) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (by.U(2)) {
                    Objects.toString(view);
                    Objects.toString(viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (by.U(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(4);
                return;
            } else {
                if (by.U(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(8);
                return;
            }
        }
        if (by.U(2)) {
            Objects.toString(view);
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (by.U(2)) {
                Objects.toString(view);
                Objects.toString(viewGroup);
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static final int M(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(Y(i, "Unknown visibility "));
    }

    public static final int N(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return M(view.getVisibility());
    }

    public static /* synthetic */ String O(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static final cn P(ViewGroup viewGroup, e eVar) {
        eVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof cn) {
            return (cn) tag;
        }
        cn cnVar = new cn(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cnVar);
        return cnVar;
    }

    public static final Cipher Q() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
    }

    public static final String R() {
        String valueOf = String.valueOf(Instant.now().toEpochMilli());
        return String.valueOf(UUID.randomUUID().toString().substring(0, 19 - valueOf.length())).concat(String.valueOf(valueOf));
    }

    public static void S(faa faaVar, boo booVar) {
        hoq.X(faaVar, bol.class, new bop(booVar, 1));
        hoq.X(faaVar, bom.class, new bop(booVar, 0));
    }

    public static void T(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void U(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void V(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static brr X(Context context, bd bdVar, boolean z, boolean z2) {
        int u;
        boolean z3;
        az azVar = bdVar.U;
        int i = 0;
        int i2 = azVar == null ? 0 : azVar.f;
        if (z2) {
            if (z) {
                u = bdVar.v();
                z3 = true;
            } else {
                u = bdVar.w();
                z3 = false;
            }
        } else if (z) {
            u = bdVar.t();
            z3 = true;
        } else {
            u = bdVar.u();
            z3 = false;
        }
        boolean z4 = z3;
        bdVar.ag(0, 0, 0, 0);
        ViewGroup viewGroup = bdVar.Q;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            bdVar.Q.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = bdVar.Q;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        bdVar.aA(i2, u);
        bdVar.aB(i2, u);
        if (u != 0) {
            i = u;
        } else if (i2 != 0) {
            i = i2 != 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z4 ? al(context, android.R.attr.activityOpenEnterAnimation) : al(context, android.R.attr.activityOpenExitAnimation) : true != z3 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z4 ? al(context, android.R.attr.activityCloseEnterAnimation) : al(context, android.R.attr.activityCloseExitAnimation) : true != z3 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z3 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (i != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                    if (loadAnimation != null) {
                        return new brr(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                if (loadAnimator != null) {
                    return new brr(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                if (loadAnimation2 != null) {
                    return new brr(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String Y(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String Z(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String aa(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String ab(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String ac(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String ad(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String ae(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String af(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String ag(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String ah(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String ai(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String aj(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    private static int al(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ boolean b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void d(ExecutorService executorService) {
        ForkJoinPool commonPool;
        commonPool = ForkJoinPool.commonPool();
        if (executorService == commonPool || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                z = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    executorService.shutdownNow();
                }
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void e(ExecutorService executorService) {
        ForkJoinPool commonPool;
        commonPool = ForkJoinPool.commonPool();
        if (executorService == commonPool || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                z = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    executorService.shutdownNow();
                }
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean f() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean g() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void h() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean i(long j, int i) {
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return true;
            }
            if (j <= 0 && i <= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean j(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long l(long j, long j2) {
        boolean z = (j ^ j2) < 0;
        long j3 = j2 + j;
        if (z || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ int m(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ Object n(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ Unsafe o() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static /* synthetic */ hvi p(krt krtVar, Object obj) {
        return (hvi) krtVar.a(obj);
    }

    public static /* synthetic */ PorterDuff.Mode q(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ void r(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static /* synthetic */ Set s(gzp gzpVar, koe koeVar) {
        return gzpVar.f() ? new hjn((emk) koeVar.b()) : hjb.a;
    }

    public static /* synthetic */ zz t(View view, zz zzVar) {
        vb f = zzVar.f(519);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = f.c;
        marginLayoutParams.bottomMargin = f.e;
        int i = f.b;
        xf k = zzVar.k();
        marginLayoutParams.leftMargin = i + (k != null ? k.a() : 0);
        marginLayoutParams.rightMargin = f.d + (k != null ? k.b() : 0);
        view.setLayoutParams(marginLayoutParams);
        return zz.a;
    }

    public static /* synthetic */ zz u(View view, zz zzVar) {
        vb f = zzVar.f(519);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = f.c;
        int i = f.b;
        xf k = zzVar.k();
        marginLayoutParams.leftMargin = i + (k != null ? k.a() : 0);
        marginLayoutParams.rightMargin = f.d + (k != null ? k.b() : 0);
        view.setLayoutParams(marginLayoutParams);
        return zz.a;
    }

    public static /* synthetic */ void v(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static /* synthetic */ int x(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int y(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int z(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }
}
