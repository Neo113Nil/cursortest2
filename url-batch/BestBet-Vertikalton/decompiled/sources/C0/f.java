package C0;

import L.s;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
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
import k.DialogInterfaceOnKeyListenerC0190n;

/* loaded from: classes.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f95a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f96b;

    public f(ArrayList arrayList) {
        this.f96b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0125f a() {
        C0121b c0121b = (C0121b) this.f96b;
        DialogInterfaceC0125f dialogInterfaceC0125f = new DialogInterfaceC0125f((ContextThemeWrapper) c0121b.f2641c, this.f95a);
        View view = (View) c0121b.f2644g;
        C0124e c0124e = dialogInterfaceC0125f.f2668f;
        if (view != null) {
            c0124e.f2657n = view;
        } else {
            CharSequence charSequence = (CharSequence) c0121b.f2643f;
            if (charSequence != null) {
                c0124e.d = charSequence;
                TextView textView = c0124e.f2655l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) c0121b.f2642e;
            if (drawable != null) {
                c0124e.f2653j = drawable;
                ImageView imageView = c0124e.f2654k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0124e.f2654k.setImageDrawable(drawable);
                }
            }
        }
        if (c0121b.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) c0121b.d).inflate(c0124e.f2661r, (ViewGroup) null);
            int i = c0121b.f2640b ? c0124e.f2662s : c0124e.f2663t;
            Object obj = c0121b.i;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0123d((ContextThemeWrapper) c0121b.f2641c, i, R.id.text1, null);
            }
            c0124e.f2658o = r7;
            c0124e.f2659p = c0121b.f2639a;
            if (((DialogInterface.OnClickListener) c0121b.f2645j) != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0120a(c0121b, c0124e));
            }
            if (c0121b.f2640b) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0124e.f2650e = alertController$RecycleListView;
        }
        dialogInterfaceC0125f.setCancelable(true);
        dialogInterfaceC0125f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0125f.setOnCancelListener(null);
        dialogInterfaceC0125f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0190n dialogInterfaceOnKeyListenerC0190n = (DialogInterfaceOnKeyListenerC0190n) c0121b.h;
        if (dialogInterfaceOnKeyListenerC0190n != null) {
            dialogInterfaceC0125f.setOnKeyListener(dialogInterfaceOnKeyListenerC0190n);
        }
        return dialogInterfaceC0125f;
    }

    public boolean b() {
        return this.f95a < ((ArrayList) this.f96b).size();
    }

    @Override // L.s
    public boolean g(View view) {
        ((BottomSheetBehavior) this.f96b).B(this.f95a);
        return true;
    }

    public f(Context context) {
        int i = DialogInterfaceC0125f.i(context, 0);
        this.f96b = new C0121b(new ContextThemeWrapper(context, DialogInterfaceC0125f.i(context, i)));
        this.f95a = i;
    }

    public f(int i, H.j[] jVarArr) {
        this.f95a = i;
        this.f96b = jVarArr;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f96b = bottomSheetBehavior;
        this.f95a = i;
    }
}
