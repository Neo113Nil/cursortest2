package R0;

import U.y;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import e0.InterfaceC0106e;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.InterfaceC0201y;
import k.MenuC0189m;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class e implements InterfaceC0106e, b1.i, InterfaceC0201y {

    /* renamed from: b, reason: collision with root package name */
    public static e f901b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f902a;

    public /* synthetic */ e(int i) {
        this.f902a = i;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f3601e;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != 10) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z3 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z3) {
                    i3 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    byte[] bArr4 = A1.c.f13a;
                    int i14 = b2 & 255;
                    z2 = z3;
                    i3 = i14;
                }
                byte b3 = bArr[i8 + i13];
                byte[] bArr5 = A1.c.f13a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z3 = z2;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z3 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            Charset charset = StandardCharsets.UTF_8;
                            k1.e.d(charset, "UTF_8");
                            return new String(bArr, i8, i10, charset);
                        }
                    }
                }
                i6 = i2 + 1;
                i5 = -1;
            }
            length = i7;
            i5 = -1;
        }
        return null;
    }

    public static ArrayList d(List list) {
        k1.e.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((z1.q) obj) != z1.q.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Y0.l.z0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((z1.q) it.next()).f4748a);
        }
        return arrayList2;
    }

    public static byte[] e(List list) {
        k1.e.e(list, "protocols");
        M1.f fVar = new M1.f();
        Iterator it = d(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            fVar.A(str.length());
            fVar.D(str);
        }
        return fVar.k(fVar.f799b);
    }

    public static e f(Context context, int i) {
        H1.d.h("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0393a.f4552m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        H1.l.B(context, obtainStyledAttributes, 4);
        H1.l.B(context, obtainStyledAttributes, 9);
        H1.l.B(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(20);
        H1.d.i(rect.left);
        H1.d.i(rect.top);
        H1.d.i(rect.right);
        H1.d.i(rect.bottom);
        return eVar;
    }

    public static M1.i g(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (N1.b.a(str.charAt(i2 + 1)) + (N1.b.a(str.charAt(i2)) << 4));
        }
        return new M1.i(bArr);
    }

    public static M1.i h(String str) {
        k1.e.e(str, "<this>");
        byte[] bytes = str.getBytes(r1.a.f3833a);
        k1.e.d(bytes, "this as java.lang.String).getBytes(charset)");
        M1.i iVar = new M1.i(bytes);
        iVar.f802c = str;
        return iVar;
    }

    public static Path j(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(W.b bVar, Editable editable, int i, int i2, boolean z2) {
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
        y[] yVarArr = (y[]) editable.getSpans(selectionStart, min, y.class);
        if (yVarArr == null || yVarArr.length <= 0) {
            return false;
        }
        for (y yVar : yVarArr) {
            int spanStart = editable.getSpanStart(yVar);
            int spanEnd = editable.getSpanEnd(yVar);
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

    public static boolean n() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private final void p() {
    }

    private final void q(int i, Serializable serializable) {
    }

    @Override // k.InterfaceC0201y
    public void b(MenuC0189m menuC0189m, boolean z2) {
    }

    @Override // k.InterfaceC0201y
    public boolean c(MenuC0189m menuC0189m) {
        return false;
    }

    @Override // e0.InterfaceC0106e
    public void i(int i, Serializable serializable) {
        String str;
        switch (this.f902a) {
            case 21:
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

    public Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // e0.InterfaceC0106e
    public void l() {
        switch (this.f902a) {
            case 21:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public boolean o(CharSequence charSequence) {
        return false;
    }
}
