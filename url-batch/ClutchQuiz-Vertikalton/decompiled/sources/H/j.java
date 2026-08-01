package H;

import L.t;
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
import g.C0128a;
import g.C0129b;
import g.C0131d;
import g.C0132e;
import g.DialogInterfaceC0133f;
import k.DialogInterfaceOnKeyListenerC0168n;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f235a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f236b;

    public j(Context context) {
        int i = DialogInterfaceC0133f.i(context, 0);
        this.f236b = new C0129b(new ContextThemeWrapper(context, DialogInterfaceC0133f.i(context, i)));
        this.f235a = i;
    }

    @Override // L.t
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f236b).B(this.f235a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0133f b() {
        C0129b c0129b = (C0129b) this.f236b;
        DialogInterfaceC0133f dialogInterfaceC0133f = new DialogInterfaceC0133f(c0129b.f2417a, this.f235a);
        View view = c0129b.f2420e;
        C0132e c0132e = dialogInterfaceC0133f.f2446f;
        if (view != null) {
            c0132e.f2435n = view;
        } else {
            CharSequence charSequence = c0129b.d;
            if (charSequence != null) {
                c0132e.d = charSequence;
                TextView textView = c0132e.f2433l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0129b.f2419c;
            if (drawable != null) {
                c0132e.f2431j = drawable;
                ImageView imageView = c0132e.f2432k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0132e.f2432k.setImageDrawable(drawable);
                }
            }
        }
        if (c0129b.f2422g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0129b.f2418b.inflate(c0132e.f2439r, (ViewGroup) null);
            int i = c0129b.i ? c0132e.f2440s : c0132e.f2441t;
            Object obj = c0129b.f2422g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0131d(c0129b.f2417a, i, R.id.text1, null);
            }
            c0132e.f2436o = r7;
            c0132e.f2437p = c0129b.f2423j;
            if (c0129b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0128a(c0129b, c0132e));
            }
            if (c0129b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0132e.f2428e = alertController$RecycleListView;
        }
        dialogInterfaceC0133f.setCancelable(true);
        dialogInterfaceC0133f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0133f.setOnCancelListener(null);
        dialogInterfaceC0133f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0168n dialogInterfaceOnKeyListenerC0168n = c0129b.f2421f;
        if (dialogInterfaceOnKeyListenerC0168n != null) {
            dialogInterfaceC0133f.setOnKeyListener(dialogInterfaceOnKeyListenerC0168n);
        }
        return dialogInterfaceC0133f;
    }

    public j(int i, k[] kVarArr) {
        this.f235a = i;
        this.f236b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f236b = bottomSheetBehavior;
        this.f235a = i;
    }
}
