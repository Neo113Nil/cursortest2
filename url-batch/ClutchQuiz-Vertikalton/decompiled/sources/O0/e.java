package O0;

import K.C0021w;
import T.A;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import d0.InterfaceC0091e;
import java.io.Serializable;
import k.InterfaceC0178x;
import k.MenuC0167m;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public class e implements X0.h, InterfaceC0091e, InterfaceC0178x {

    /* renamed from: b, reason: collision with root package name */
    public static e f511b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f512a;

    public /* synthetic */ e(int i) {
        this.f512a = i;
    }

    public static e a(Context context, int i) {
        A.c.i(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0361a.f3737m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        A.c.H(context, obtainStyledAttributes, 4);
        A.c.H(context, obtainStyledAttributes, 9);
        A.c.H(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(21);
        A.c.j(rect.left);
        A.c.j(rect.top);
        A.c.j(rect.right);
        A.c.j(rect.bottom);
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(V.b bVar, Editable editable, int i, int i2, boolean z2) {
        int min;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z2) {
            int max = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char charAt = editable.charAt(selectionStart);
                            if (z3) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else {
                                if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                }
                                z3 = true;
                            }
                        } else if (!z3) {
                            selectionStart = 0;
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i2, 0);
            min = editable.length();
            if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (max2 == 0) {
                            min = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd < min) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z4) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else {
                                if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                }
                                selectionEnd++;
                                z4 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            min = -1;
            if (selectionStart == -1 || min == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            min = Math.min(selectionEnd + i2, editable.length());
        }
        A[] aArr = (A[]) editable.getSpans(selectionStart, min, A.class);
        if (aArr == null || aArr.length <= 0) {
            return false;
        }
        for (A a2 : aArr) {
            int spanStart = editable.getSpanStart(a2);
            int spanEnd = editable.getSpanEnd(a2);
            selectionStart = Math.min(spanStart, selectionStart);
            min = Math.max(spanEnd, min);
        }
        int max3 = Math.max(selectionStart, 0);
        int min2 = Math.min(min, editable.length());
        bVar.beginBatchEdit();
        editable.delete(max3, min2);
        bVar.endBatchEdit();
        return true;
    }

    private final void f() {
    }

    private final void h(int i, Serializable serializable) {
    }

    @Override // k.InterfaceC0178x
    public void b(MenuC0167m menuC0167m, boolean z2) {
    }

    public Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean e(CharSequence charSequence) {
        return false;
    }

    @Override // k.InterfaceC0178x
    public boolean g(MenuC0167m menuC0167m) {
        return false;
    }

    @Override // d0.InterfaceC0091e
    public void k(int i, Serializable serializable) {
        String str;
        switch (this.f512a) {
            case 22:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // d0.InterfaceC0091e
    public void o() {
        switch (this.f512a) {
            case 22:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public /* synthetic */ e(View view, int i) {
        this.f512a = i;
    }

    public e(View view) {
        this.f512a = 3;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0021w(view, 2);
        } else {
            new e(view, 2);
        }
    }
}
