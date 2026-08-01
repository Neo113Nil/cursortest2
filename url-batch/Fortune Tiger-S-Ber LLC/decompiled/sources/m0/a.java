package m0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.widget.EdgeEffect;
import b3.e;
import g2.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import k3.k;
import p.f;
import p.g;
import p3.c;
import p3.d;
import p3.m;
import p3.u;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {
    public static final c B(Socket socket) {
        Logger logger = m.f3037a;
        u uVar = new u(socket);
        OutputStream outputStream = socket.getOutputStream();
        u2.c.d(outputStream, "getOutputStream(...)");
        return new c(uVar, new c(outputStream, uVar));
    }

    public static final d C(Socket socket) {
        Logger logger = m.f3037a;
        u uVar = new u(socket);
        InputStream inputStream = socket.getInputStream();
        u2.c.d(inputStream, "getInputStream(...)");
        return new d(uVar, new d(inputStream, uVar, 1), 0);
    }

    public static final boolean a(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        u2.c.e(bArr, "a");
        u2.c.e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = s(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(int i4, Rect rect, Rect rect2, Rect rect3) {
        boolean c = c(i4, rect, rect2);
        if (c(i4, rect, rect3) || !c) {
            return false;
        }
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean c(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final void g(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static void h(int i4, int i5, int i6) {
        if (i4 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
        }
        if (i4 <= i5) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
    }

    public static ColorStateList i(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !k.g(drawable)) {
            return null;
        }
        colorStateList = k.b(drawable).getColorStateList();
        return colorStateList;
    }

    public static float j(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final boolean p(AssertionError assertionError) {
        Logger logger = m.f3037a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? e.d0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(int i4, Rect rect, Rect rect2) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static List r(Object obj) {
        List singletonList = Collections.singletonList(obj);
        u2.c.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int s(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return Math.max(0, i5 - i6);
    }

    public static int t(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static float u(EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o0.c.c(edgeEffect, f4, f5);
        }
        o0.b.a(edgeEffect, f4, f5);
        return f4;
    }

    public static void z(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public abstract void A(z zVar, float f4);

    public abstract boolean d(g gVar, p.c cVar);

    public abstract boolean e(g gVar, Object obj, Object obj2);

    public abstract boolean f(g gVar, f fVar, f fVar2);

    public abstract InputFilter[] k(InputFilter[] inputFilterArr);

    public abstract int l(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float m(z zVar);

    public abstract int n();

    public abstract ViewPropertyAnimator o(View view, int i4);

    public abstract void v(f fVar, f fVar2);

    public abstract void w(f fVar, Thread thread);

    public abstract void x(boolean z3);

    public abstract void y(boolean z3);
}
