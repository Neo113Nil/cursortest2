package H0;

import T.z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.luckyarcade.spinthrow.GameConfig;
import g.InterfaceC0150b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.InterfaceC0213x;
import k.MenuC0202m;
import n0.AbstractC0305a;

/* loaded from: classes.dex */
public class e implements c0.d, InterfaceC0150b, InterfaceC0213x {

    /* renamed from: b, reason: collision with root package name */
    public static e f255b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256a;

    public /* synthetic */ e(int i) {
        this.f256a = i;
    }

    public static ArrayList a(List list) {
        X0.f.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((i1.v) obj) != i1.v.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(O0.j.c0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i1.v) it.next()).f2779a);
        }
        return arrayList2;
    }

    public static byte[] c(List list) {
        X0.f.e(list, "protocols");
        v1.f fVar = new v1.f();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            fVar.u(str.length());
            fVar.x(str);
        }
        return fVar.j(fVar.f4488b);
    }

    public static e d(Context context, int i) {
        q1.d.f("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0305a.f3644m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        q1.d.y(context, obtainStyledAttributes, 4);
        q1.d.y(context, obtainStyledAttributes, 9);
        q1.d.y(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(21);
        q1.d.g(rect.left);
        q1.d.g(rect.top);
        q1.d.g(rect.right);
        q1.d.g(rect.bottom);
        return eVar;
    }

    public static Path e(float f2, float f3, float f4, float f5) {
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
    public static boolean h(V.b bVar, Editable editable, int i, int i2, boolean z2) {
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
        z[] zVarArr = (z[]) editable.getSpans(selectionStart, min, z.class);
        if (zVarArr == null || zVarArr.length <= 0) {
            return false;
        }
        for (z zVar : zVarArr) {
            int spanStart = editable.getSpanStart(zVar);
            int spanEnd = editable.getSpanEnd(zVar);
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

    public static boolean i() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private final void l() {
    }

    private final void m(int i, Serializable serializable) {
    }

    @Override // k.InterfaceC0213x
    public void b(MenuC0202m menuC0202m, boolean z2) {
    }

    public Signature[] f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // k.InterfaceC0213x
    public boolean g(MenuC0202m menuC0202m) {
        return false;
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    @Override // c0.d
    public void k(int i, Serializable serializable) {
        String str;
        switch (this.f256a) {
            case 17:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case GameConfig.COMBO_EVERY /* 3 */:
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
                    case GameConfig.SCORE_PER_STICK /* 10 */:
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

    @Override // c0.d
    public void o() {
        switch (this.f256a) {
            case 17:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public String toString() {
        switch (this.f256a) {
            case 24:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public e(RecyclerView recyclerView) {
        this.f256a = 22;
    }
}
