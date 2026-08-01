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
import g.C0124a;
import g.C0125b;
import g.C0127d;
import g.C0128e;
import g.DialogInterfaceC0129f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0161n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f273a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f274b;

    public j() {
        this.f274b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0129f a() {
        C0125b c0125b = (C0125b) this.f274b;
        DialogInterfaceC0129f dialogInterfaceC0129f = new DialogInterfaceC0129f(c0125b.f2421a, this.f273a);
        View view = c0125b.f2424e;
        C0128e c0128e = dialogInterfaceC0129f.f2450f;
        if (view != null) {
            c0128e.f2439n = view;
        } else {
            CharSequence charSequence = c0125b.d;
            if (charSequence != null) {
                c0128e.d = charSequence;
                TextView textView = c0128e.f2437l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0125b.f2423c;
            if (drawable != null) {
                c0128e.f2435j = drawable;
                ImageView imageView = c0128e.f2436k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0128e.f2436k.setImageDrawable(drawable);
                }
            }
        }
        if (c0125b.f2426g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0125b.f2422b.inflate(c0128e.f2443r, (ViewGroup) null);
            int i = c0125b.i ? c0128e.f2444s : c0128e.f2445t;
            Object obj = c0125b.f2426g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0127d(c0125b.f2421a, i, R.id.text1, null);
            }
            c0128e.f2440o = r7;
            c0128e.f2441p = c0125b.f2427j;
            if (c0125b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0124a(c0125b, c0128e));
            }
            if (c0125b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0128e.f2432e = alertController$RecycleListView;
        }
        dialogInterfaceC0129f.setCancelable(true);
        dialogInterfaceC0129f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0129f.setOnCancelListener(null);
        dialogInterfaceC0129f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0161n dialogInterfaceOnKeyListenerC0161n = c0125b.f2425f;
        if (dialogInterfaceOnKeyListenerC0161n != null) {
            dialogInterfaceC0129f.setOnKeyListener(dialogInterfaceOnKeyListenerC0161n);
        }
        return dialogInterfaceC0129f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f274b).B(this.f273a);
        return true;
    }

    public int c() {
        if ((this.f273a & 128) != 0) {
            return ((int[]) this.f274b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f273a < ((ArrayList) this.f274b).size();
    }

    public void e(j jVar) {
        e1.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f273a) != 0) {
                f(i, ((int[]) jVar.f274b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f274b;
            if (i >= iArr.length) {
                return;
            }
            this.f273a = (1 << i) | this.f273a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f274b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0129f.i(context, 0);
        this.f274b = new C0125b(new ContextThemeWrapper(context, DialogInterfaceC0129f.i(context, i)));
        this.f273a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f273a = i;
        this.f274b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f274b = bottomSheetBehavior;
        this.f273a = i;
    }
}
