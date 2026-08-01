package J;

import N.s;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.C0102a;
import g.C0103b;
import g.C0105d;
import g.C0106e;
import g.DialogInterfaceC0107f;
import h0.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k.n;

/* loaded from: classes.dex */
public final class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f373a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f374b;

    public /* synthetic */ i(int i, Object obj) {
        this.f374b = obj;
        this.f373a = i;
    }

    public static boolean a(U0.g[][] gVarArr, U0.g gVar) {
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (gVarArr[i][i2] == gVar && !z1.d.r(gVarArr, i, i2, gVar).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static U0.g[][] c(U0.g[][] gVarArr) {
        U0.g[][] gVarArr2 = new U0.g[6][];
        for (int i = 0; i < 6; i++) {
            U0.g[] gVarArr3 = gVarArr[i];
            Object[] copyOf = Arrays.copyOf(gVarArr3, gVarArr3.length);
            g1.d.d(copyOf, "copyOf(...)");
            gVarArr2[i] = copyOf;
        }
        return gVarArr2;
    }

    public static Integer e(U0.g[][] gVarArr, U0.g gVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            U0.g[][] c2 = c(gVarArr);
            Integer p2 = z1.d.p(c2, intValue, gVar);
            if (p2 != null && !z1.d.r(c2, p2.intValue(), intValue, gVar).isEmpty()) {
                return Integer.valueOf(intValue);
            }
        }
        return null;
    }

    public static int i(U0.g[][] gVarArr, int i, boolean z2, int i2, int i3) {
        U0.g gVar;
        Integer num;
        Integer num2;
        int i4 = i2;
        int i5 = i3;
        U0.g gVar2 = U0.g.f875c;
        if (a(gVarArr, gVar2)) {
            return i + 100000;
        }
        U0.g gVar3 = U0.g.f874b;
        if (a(gVarArr, gVar3)) {
            return (-100000) - i;
        }
        k1.c v2 = a0.v(0, 7);
        ArrayList arrayList = new ArrayList();
        Iterator it = v2.iterator();
        while (true) {
            k1.b bVar = (k1.b) it;
            boolean z3 = bVar.f2843c;
            gVar = U0.g.f873a;
            if (!z3) {
                break;
            }
            Object next = bVar.next();
            if (gVarArr[0][((Number) next).intValue()] == gVar) {
                arrayList.add(next);
            }
        }
        if (i == 0 || arrayList.isEmpty()) {
            return (z1.d.S(gVarArr, gVar2) * 10) - (z1.d.S(gVarArr, gVar3) * 12);
        }
        if (z2) {
            Iterator it2 = j(arrayList).iterator();
            int i6 = Integer.MIN_VALUE;
            while (it2.hasNext()) {
                int intValue = ((Number) it2.next()).intValue();
                U0.g[][] c2 = c(gVarArr);
                if (intValue >= 0 && intValue < 7) {
                    for (int i7 = 5; -1 < i7; i7--) {
                        U0.g[] gVarArr2 = c2[i7];
                        if (gVarArr2[intValue] == gVar) {
                            gVarArr2[intValue] = gVar2;
                            num2 = Integer.valueOf(i7);
                            break;
                        }
                    }
                }
                num2 = null;
                if (num2 != null) {
                    int i8 = i(c2, i - 1, false, i4, i5);
                    i6 = Math.max(i6, i8);
                    i4 = Math.max(i4, i8);
                    if (i5 <= i4) {
                        break;
                    }
                }
            }
            return i6;
        }
        Iterator it3 = j(arrayList).iterator();
        int i9 = Integer.MAX_VALUE;
        while (it3.hasNext()) {
            int intValue2 = ((Number) it3.next()).intValue();
            U0.g[][] c3 = c(gVarArr);
            if (intValue2 >= 0 && intValue2 < 7) {
                for (int i10 = 5; -1 < i10; i10--) {
                    U0.g[] gVarArr3 = c3[i10];
                    if (gVarArr3[intValue2] == gVar) {
                        gVarArr3[intValue2] = gVar3;
                        num = Integer.valueOf(i10);
                        break;
                    }
                }
            }
            num = null;
            if (num != null) {
                int i11 = i(c3, i - 1, true, i4, i5);
                i9 = Math.min(i9, i11);
                i5 = Math.min(i5, i11);
                if (i5 <= i4) {
                    break;
                }
            }
        }
        return i9;
    }

    public static ArrayList j(ArrayList arrayList) {
        List y02 = X0.k.y0(3, 2, 4, 1, 5, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : y02) {
            if (arrayList.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!y02.contains(Integer.valueOf(((Number) next).intValue()))) {
                arrayList3.add(next);
            }
        }
        return X0.j.D0(arrayList2, arrayList3);
    }

    @Override // N.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f374b).B(this.f373a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0107f d() {
        C0103b c0103b = (C0103b) this.f374b;
        DialogInterfaceC0107f dialogInterfaceC0107f = new DialogInterfaceC0107f(c0103b.f2284a, this.f373a);
        View view = c0103b.f2287e;
        C0106e c0106e = dialogInterfaceC0107f.f2313f;
        if (view != null) {
            c0106e.f2302n = view;
        } else {
            CharSequence charSequence = c0103b.d;
            if (charSequence != null) {
                c0106e.d = charSequence;
                TextView textView = c0106e.f2300l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0103b.f2286c;
            if (drawable != null) {
                c0106e.f2298j = drawable;
                ImageView imageView = c0106e.f2299k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0106e.f2299k.setImageDrawable(drawable);
                }
            }
        }
        if (c0103b.f2289g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0103b.f2285b.inflate(c0106e.f2306r, (ViewGroup) null);
            int i = c0103b.i ? c0106e.f2307s : c0106e.f2308t;
            Object obj = c0103b.f2289g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0105d(c0103b.f2284a, i, R.id.text1, null);
            }
            c0106e.f2303o = r7;
            c0106e.f2304p = c0103b.f2290j;
            if (c0103b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0102a(c0103b, c0106e));
            }
            if (c0103b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0106e.f2295e = alertController$RecycleListView;
        }
        dialogInterfaceC0107f.setCancelable(true);
        dialogInterfaceC0107f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0107f.setOnCancelListener(null);
        dialogInterfaceC0107f.setOnDismissListener(null);
        n nVar = c0103b.f2288f;
        if (nVar != null) {
            dialogInterfaceC0107f.setOnKeyListener(nVar);
        }
        return dialogInterfaceC0107f;
    }

    public int f() {
        if ((this.f373a & 128) != 0) {
            return ((int[]) this.f374b)[7];
        }
        return 65535;
    }

    public boolean g() {
        return this.f373a < ((ArrayList) this.f374b).size();
    }

    public void h(i iVar) {
        g1.d.e(iVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & iVar.f373a) != 0) {
                k(i, ((int[]) iVar.f374b)[i]);
            }
        }
    }

    public void k(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f374b;
            if (i >= iArr.length) {
                return;
            }
            this.f373a = (1 << i) | this.f373a;
            iArr[i] = i2;
        }
    }

    public i() {
        this.f374b = new int[10];
    }

    public i(ArrayList arrayList) {
        this.f374b = arrayList;
    }

    public i(Context context) {
        int i = DialogInterfaceC0107f.i(context, 0);
        this.f374b = new C0103b(new ContextThemeWrapper(context, DialogInterfaceC0107f.i(context, i)));
        this.f373a = i;
    }

    public i(int i, j[] jVarArr) {
        this.f373a = i;
        this.f374b = jVarArr;
    }
}
