package D1;

import N.r;
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
import h.C0124a;
import h.C0125b;
import h.C0127d;
import h.C0128e;
import h.DialogInterfaceC0129f;
import java.util.ArrayList;
import m.DialogInterfaceOnKeyListenerC0230n;

/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f270a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f271b;

    public p(ArrayList arrayList) {
        this.f271b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0129f a() {
        C0125b c0125b = (C0125b) this.f271b;
        DialogInterfaceC0129f dialogInterfaceC0129f = new DialogInterfaceC0129f(c0125b.f2770a, this.f270a);
        View view = c0125b.e;
        C0128e c0128e = dialogInterfaceC0129f.f2798f;
        if (view != null) {
            c0128e.f2788n = view;
        } else {
            CharSequence charSequence = c0125b.f2773d;
            if (charSequence != null) {
                c0128e.f2781d = charSequence;
                TextView textView = c0128e.f2786l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0125b.f2772c;
            if (drawable != null) {
                c0128e.j = drawable;
                ImageView imageView = c0128e.f2785k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0128e.f2785k.setImageDrawable(drawable);
                }
            }
        }
        if (c0125b.f2775g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0125b.f2771b.inflate(c0128e.f2792r, (ViewGroup) null);
            int i = c0125b.i ? c0128e.f2793s : c0128e.f2794t;
            Object obj = c0125b.f2775g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0127d(c0125b.f2770a, i, R.id.text1, null);
            }
            c0128e.f2789o = r7;
            c0128e.f2790p = c0125b.j;
            if (c0125b.f2776h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0124a(c0125b, c0128e));
            }
            if (c0125b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0128e.e = alertController$RecycleListView;
        }
        dialogInterfaceC0129f.setCancelable(true);
        dialogInterfaceC0129f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0129f.setOnCancelListener(null);
        dialogInterfaceC0129f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0230n dialogInterfaceOnKeyListenerC0230n = c0125b.f2774f;
        if (dialogInterfaceOnKeyListenerC0230n != null) {
            dialogInterfaceC0129f.setOnKeyListener(dialogInterfaceOnKeyListenerC0230n);
        }
        return dialogInterfaceC0129f;
    }

    @Override // N.r
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f271b).H(this.f270a);
        return true;
    }

    public boolean c() {
        return this.f270a < ((ArrayList) this.f271b).size();
    }

    public p(Context context) {
        int i = DialogInterfaceC0129f.i(context, 0);
        this.f271b = new C0125b(new ContextThemeWrapper(context, DialogInterfaceC0129f.i(context, i)));
        this.f270a = i;
    }

    public p(int i, J.i[] iVarArr) {
        this.f270a = i;
        this.f271b = iVarArr;
    }

    public p(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f271b = bottomSheetBehavior;
        this.f270a = i;
    }
}
