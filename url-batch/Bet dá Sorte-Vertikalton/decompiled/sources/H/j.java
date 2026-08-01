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
import g.C0120a;
import g.C0121b;
import g.C0123d;
import g.C0124e;
import g.DialogInterfaceC0125f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0158n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f289a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f290b;

    public j() {
        this.f290b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0125f a() {
        C0121b c0121b = (C0121b) this.f290b;
        DialogInterfaceC0125f dialogInterfaceC0125f = new DialogInterfaceC0125f(c0121b.f2400a, this.f289a);
        View view = c0121b.f2403e;
        C0124e c0124e = dialogInterfaceC0125f.f2429f;
        if (view != null) {
            c0124e.f2418n = view;
        } else {
            CharSequence charSequence = c0121b.d;
            if (charSequence != null) {
                c0124e.d = charSequence;
                TextView textView = c0124e.f2416l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0121b.f2402c;
            if (drawable != null) {
                c0124e.f2414j = drawable;
                ImageView imageView = c0124e.f2415k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0124e.f2415k.setImageDrawable(drawable);
                }
            }
        }
        if (c0121b.f2405g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0121b.f2401b.inflate(c0124e.f2422r, (ViewGroup) null);
            int i = c0121b.i ? c0124e.f2423s : c0124e.f2424t;
            Object obj = c0121b.f2405g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0123d(c0121b.f2400a, i, R.id.text1, null);
            }
            c0124e.f2419o = r7;
            c0124e.f2420p = c0121b.f2406j;
            if (c0121b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0120a(c0121b, c0124e));
            }
            if (c0121b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0124e.f2411e = alertController$RecycleListView;
        }
        dialogInterfaceC0125f.setCancelable(true);
        dialogInterfaceC0125f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0125f.setOnCancelListener(null);
        dialogInterfaceC0125f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0158n dialogInterfaceOnKeyListenerC0158n = c0121b.f2404f;
        if (dialogInterfaceOnKeyListenerC0158n != null) {
            dialogInterfaceC0125f.setOnKeyListener(dialogInterfaceOnKeyListenerC0158n);
        }
        return dialogInterfaceC0125f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f290b).B(this.f289a);
        return true;
    }

    public int c() {
        if ((this.f289a & 128) != 0) {
            return ((int[]) this.f290b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f289a < ((ArrayList) this.f290b).size();
    }

    public void e(j jVar) {
        b1.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f289a) != 0) {
                f(i, ((int[]) jVar.f290b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f290b;
            if (i >= iArr.length) {
                return;
            }
            this.f289a = (1 << i) | this.f289a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f290b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0125f.i(context, 0);
        this.f290b = new C0121b(new ContextThemeWrapper(context, DialogInterfaceC0125f.i(context, i)));
        this.f289a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f289a = i;
        this.f290b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f290b = bottomSheetBehavior;
        this.f289a = i;
    }
}
