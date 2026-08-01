package H;

import L.s;
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
import g.C0150c;
import g.C0151d;
import g.C0153f;
import g.C0154g;
import g.DialogInterfaceC0155h;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0201n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f241a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f242b;

    public j() {
        this.f242b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0155h a() {
        C0151d c0151d = (C0151d) this.f242b;
        DialogInterfaceC0155h dialogInterfaceC0155h = new DialogInterfaceC0155h(c0151d.f2543a, this.f241a);
        View view = c0151d.f2547e;
        C0154g c0154g = dialogInterfaceC0155h.f2575f;
        if (view != null) {
            c0154g.f2563n = view;
        } else {
            CharSequence charSequence = c0151d.f2546d;
            if (charSequence != null) {
                c0154g.f2555d = charSequence;
                TextView textView = c0154g.f2561l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0151d.f2545c;
            if (drawable != null) {
                c0154g.f2559j = drawable;
                ImageView imageView = c0154g.f2560k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0154g.f2560k.setImageDrawable(drawable);
                }
            }
        }
        if (c0151d.f2549g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0151d.f2544b.inflate(c0154g.f2567r, (ViewGroup) null);
            int i = c0151d.i ? c0154g.f2568s : c0154g.f2569t;
            Object obj = c0151d.f2549g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0153f(c0151d.f2543a, i, R.id.text1, null);
            }
            c0154g.f2564o = r7;
            c0154g.f2565p = c0151d.f2550j;
            if (c0151d.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0150c(c0151d, c0154g));
            }
            if (c0151d.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0154g.f2556e = alertController$RecycleListView;
        }
        dialogInterfaceC0155h.setCancelable(true);
        dialogInterfaceC0155h.setCanceledOnTouchOutside(true);
        dialogInterfaceC0155h.setOnCancelListener(null);
        dialogInterfaceC0155h.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0201n dialogInterfaceOnKeyListenerC0201n = c0151d.f2548f;
        if (dialogInterfaceOnKeyListenerC0201n != null) {
            dialogInterfaceC0155h.setOnKeyListener(dialogInterfaceOnKeyListenerC0201n);
        }
        return dialogInterfaceC0155h;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f242b).B(this.f241a);
        return true;
    }

    public int c() {
        if ((this.f241a & 128) != 0) {
            return ((int[]) this.f242b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f241a < ((ArrayList) this.f242b).size();
    }

    public void e(j jVar) {
        X0.f.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f241a) != 0) {
                f(i, ((int[]) jVar.f242b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f242b;
            if (i >= iArr.length) {
                return;
            }
            this.f241a = (1 << i) | this.f241a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f242b = arrayList;
    }

    public j(Context context) {
        int g2 = DialogInterfaceC0155h.g(context, 0);
        this.f242b = new C0151d(new ContextThemeWrapper(context, DialogInterfaceC0155h.g(context, g2)));
        this.f241a = g2;
    }

    public j(int i, k[] kVarArr) {
        this.f241a = i;
        this.f242b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f242b = bottomSheetBehavior;
        this.f241a = i;
    }
}
