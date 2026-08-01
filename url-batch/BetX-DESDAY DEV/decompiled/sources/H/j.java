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
import g.C0151c;
import g.C0152d;
import g.C0154f;
import g.C0155g;
import g.DialogInterfaceC0156h;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0203n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f240a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f241b;

    public j() {
        this.f241b = new int[10];
    }

    @Override // L.s
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f241b).B(this.f240a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0156h b() {
        C0152d c0152d = (C0152d) this.f241b;
        DialogInterfaceC0156h dialogInterfaceC0156h = new DialogInterfaceC0156h(c0152d.f2547a, this.f240a);
        View view = c0152d.f2551e;
        C0155g c0155g = dialogInterfaceC0156h.f2579f;
        if (view != null) {
            c0155g.f2567n = view;
        } else {
            CharSequence charSequence = c0152d.f2550d;
            if (charSequence != null) {
                c0155g.f2559d = charSequence;
                TextView textView = c0155g.f2565l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0152d.f2549c;
            if (drawable != null) {
                c0155g.f2563j = drawable;
                ImageView imageView = c0155g.f2564k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0155g.f2564k.setImageDrawable(drawable);
                }
            }
        }
        if (c0152d.f2553g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0152d.f2548b.inflate(c0155g.f2571r, (ViewGroup) null);
            int i = c0152d.i ? c0155g.f2572s : c0155g.f2573t;
            Object obj = c0152d.f2553g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0154f(c0152d.f2547a, i, R.id.text1, null);
            }
            c0155g.f2568o = r7;
            c0155g.f2569p = c0152d.f2554j;
            if (c0152d.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0151c(c0152d, c0155g));
            }
            if (c0152d.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0155g.f2560e = alertController$RecycleListView;
        }
        dialogInterfaceC0156h.setCancelable(true);
        dialogInterfaceC0156h.setCanceledOnTouchOutside(true);
        dialogInterfaceC0156h.setOnCancelListener(null);
        dialogInterfaceC0156h.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0203n dialogInterfaceOnKeyListenerC0203n = c0152d.f2552f;
        if (dialogInterfaceOnKeyListenerC0203n != null) {
            dialogInterfaceC0156h.setOnKeyListener(dialogInterfaceOnKeyListenerC0203n);
        }
        return dialogInterfaceC0156h;
    }

    public int c() {
        if ((this.f240a & 128) != 0) {
            return ((int[]) this.f241b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f240a < ((ArrayList) this.f241b).size();
    }

    public void e(j jVar) {
        X0.f.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f240a) != 0) {
                f(i, ((int[]) jVar.f241b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f241b;
            if (i >= iArr.length) {
                return;
            }
            this.f240a = (1 << i) | this.f240a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f241b = arrayList;
    }

    public j(Context context) {
        int g2 = DialogInterfaceC0156h.g(context, 0);
        this.f241b = new C0152d(new ContextThemeWrapper(context, DialogInterfaceC0156h.g(context, g2)));
        this.f240a = g2;
    }

    public j(int i, k[] kVarArr) {
        this.f240a = i;
        this.f241b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f241b = bottomSheetBehavior;
        this.f240a = i;
    }
}
