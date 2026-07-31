package w5;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import o.j0;
import o.r0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class f implements j2.o, k.n {

    /* renamed from: e, reason: collision with root package name */
    public static f f8084e;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8085d;

    public /* synthetic */ f(int i) {
        this.f8085d = i;
    }

    public static v0 b(x0 x0Var, t0 t0Var, int i) {
        if ((i & 2) != 0) {
            t0Var = x0Var instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0Var).d() : n4.a.f5370a;
        }
        l4.b e8 = x0Var instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0Var).e() : l4.a.f4828b;
        q6.i.e(t0Var, "factory");
        q6.i.e(e8, "extras");
        return new v0(x0Var.f(), t0Var, e8);
    }

    public static o4.d c(d4.p pVar, o4.o oVar, Bundle bundle, androidx.lifecycle.p pVar2, o4.h hVar) {
        String uuid = UUID.randomUUID().toString();
        q6.i.d(uuid, "toString(...)");
        q6.i.e(oVar, "destination");
        q6.i.e(pVar2, "hostLifecycleState");
        return new o4.d(pVar, oVar, bundle, pVar2, hVar, uuid, null);
    }

    public static Typeface d(String str, j2.k kVar, int i) {
        Typeface create;
        if (i == 0 && q6.i.a(kVar, j2.k.f3995f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f3998d, i == 1);
        return create;
    }

    public static Typeface e(String str, j2.k kVar, int i) {
        if (i == 0 && q6.i.a(kVar, j2.k.f3995f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int w7 = m.a.w(kVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(w7) : Typeface.create(str, w7);
    }

    public static Path h(float f6, float f8, float f9, float f10) {
        Path path = new Path();
        path.moveTo(f6, f8);
        path.lineTo(f9, f10);
        return path;
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
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(f4.b bVar, Editable editable, int i, int i8, boolean z3) {
        int min;
        if (editable != null && i >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z3) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z7 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z7) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z7 = true;
                                    }
                                } else if (!z7) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i8, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z8 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z8) {
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
                                        z8 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i8, editable.length());
                }
                d4.b0[] b0VarArr = (d4.b0[]) editable.getSpans(selectionStart, min, d4.b0.class);
                if (b0VarArr != null && b0VarArr.length > 0) {
                    for (d4.b0 b0Var : b0VarArr) {
                        int spanStart = editable.getSpanStart(b0Var);
                        int spanEnd = editable.getSpanEnd(b0Var);
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
            }
        }
        return false;
    }

    public static f1.b0 l(List list) {
        return new f1.b0(list, 0L, 9187343241974906880L);
    }

    public Typeface f(j2.m mVar, j2.k kVar, int i) {
        String str;
        switch (this.f8085d) {
            case 24:
                mVar.getClass();
                return d("sans-serif", kVar, i);
            default:
                mVar.getClass();
                int i8 = kVar.f3998d / 100;
                if (i8 >= 0 && i8 < 2) {
                    str = "sans-serif-thin";
                } else if (2 > i8 || i8 >= 4) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            str = "sans-serif-medium";
                        } else if ((6 > i8 || i8 >= 8) && 8 <= i8 && i8 < 11) {
                            str = "sans-serif-black";
                        }
                    }
                    str = "sans-serif";
                } else {
                    str = "sans-serif-light";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface e8 = e(str, kVar, i);
                    if (!q6.i.a(e8, Typeface.create(Typeface.DEFAULT, m.a.w(kVar, i))) && !q6.i.a(e8, e(null, kVar, i))) {
                        typeface = e8;
                    }
                }
                return typeface == null ? e("sans-serif", kVar, i) : typeface;
        }
    }

    @Override // k.n
    public boolean g(k.i iVar) {
        return false;
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    public f(h4.j jVar) {
        this.f8085d = 18;
        new CopyOnWriteArrayList();
    }

    public f() {
        this.f8085d = 22;
        new o.s(16);
        long[] jArr = r0.f5528a;
        new j0();
    }

    @Override // k.n
    public void a(k.i iVar, boolean z3) {
    }
}
