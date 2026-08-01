package g2;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.m0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class f implements n0, j.x, k0.q, z0.e {
    public static f g;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1841f;

    public /* synthetic */ f(int i4) {
        this.f1841f = i4;
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i4) {
        int i5;
        boolean z3;
        int i6;
        int i7;
        byte[] bArr3 = PublicSuffixDatabase.f2996e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > -1 && bArr[i9] != 10) {
                i9--;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i5 = i10 + i11;
                if (bArr[i5] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i5 - i10;
            int i13 = i4;
            boolean z4 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z4) {
                    i6 = 46;
                    z3 = false;
                } else {
                    byte b2 = bArr2[i13][i14];
                    byte[] bArr4 = d3.c.f1490a;
                    int i16 = b2 & 255;
                    z3 = z4;
                    i6 = i16;
                }
                byte b4 = bArr[i10 + i15];
                byte[] bArr5 = d3.c.f1490a;
                i7 = i6 - (b4 & 255);
                if (i7 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z4 = z3;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    i14 = -1;
                    z4 = true;
                }
            }
            if (i7 >= 0) {
                if (i7 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset charset = StandardCharsets.UTF_8;
                            u2.c.d(charset, "UTF_8");
                            return new String(bArr, i10, i12, charset);
                        }
                    }
                }
                i8 = i5 + 1;
            }
            length = i9;
        }
        return null;
    }

    public static ArrayList g(List list) {
        u2.c.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c3.r) obj) != c3.r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n2.i.E(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((c3.r) obj2).f1126f);
        }
        return arrayList2;
    }

    public static byte[] h(List list) {
        u2.c.e(list, "protocols");
        p3.f fVar = new p3.f();
        ArrayList g4 = g(list);
        int size = g4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = g4.get(i4);
            i4++;
            String str = (String) obj;
            fVar.x(str.length());
            fVar.B(str);
        }
        return fVar.q(fVar.g);
    }

    public static p3.i j(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) (q3.b.a(str.charAt(i5 + 1)) + (q3.b.a(str.charAt(i5)) << 4));
        }
        return new p3.i(bArr);
    }

    public static p3.i k(String str) {
        u2.c.e(str, "<this>");
        byte[] bytes = str.getBytes(b3.a.f967a);
        u2.c.d(bytes, "this as java.lang.String).getBytes(charset)");
        p3.i iVar = new p3.i(bytes);
        iVar.h = str;
        return iVar;
    }

    public static Path l(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f4, f5);
        path.lineTo(f6, f7);
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
    public static boolean n(t0.b bVar, Editable editable, int i4, int i5, boolean z3) {
        int min;
        if (editable != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z3) {
                    int max = Math.max(i4, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z4) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z4 = true;
                                    }
                                } else if (!z4) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i5, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z5 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z5) {
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
                                        z5 = true;
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
                    selectionStart = Math.max(selectionStart - i4, 0);
                    min = Math.min(selectionEnd + i5, editable.length());
                }
                androidx.emoji2.text.a0[] a0VarArr = (androidx.emoji2.text.a0[]) editable.getSpans(selectionStart, min, androidx.emoji2.text.a0.class);
                if (a0VarArr != null && a0VarArr.length > 0) {
                    for (androidx.emoji2.text.a0 a0Var : a0VarArr) {
                        int spanStart = editable.getSpanStart(a0Var);
                        int spanEnd = editable.getSpanEnd(a0Var);
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

    public static boolean o() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // androidx.lifecycle.n0
    public l0 b(Class cls) {
        switch (this.f1841f) {
            case 7:
                return new m0(true);
            default:
                return new y0.a();
        }
    }

    @Override // z0.e
    public void c() {
        switch (this.f1841f) {
            case 27:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // z0.e
    public void e(int i4, Object obj) {
        String str;
        switch (this.f1841f) {
            case 27:
                break;
            default:
                switch (i4) {
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
                if (i4 != 6 && i4 != 7 && i4 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    @Override // j.x
    public boolean i(j.m mVar) {
        return false;
    }

    public Signature[] m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean p(CharSequence charSequence) {
        return false;
    }

    public f(View view, int i4) {
        this.f1841f = i4;
        switch (i4) {
            case 15:
                if (Build.VERSION.SDK_INT < 30) {
                    new f(view, 14);
                    break;
                } else {
                    new k0.s(view, 14);
                    break;
                }
        }
    }

    private final void q() {
    }

    private final void r(int i4, Object obj) {
    }

    @Override // j.x
    public void a(j.m mVar, boolean z3) {
    }

    @Override // k0.q
    public void onScrollLimit(int i4, int i5, int i6, boolean z3) {
    }

    @Override // k0.q
    public void onScrollProgress(int i4, int i5, int i6, int i7) {
    }
}
