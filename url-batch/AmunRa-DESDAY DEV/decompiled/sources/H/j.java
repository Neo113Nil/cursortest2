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
import g.C0123a;
import g.C0124b;
import g.C0126d;
import g.C0127e;
import g.DialogInterfaceC0128f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0159n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f213a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f214b;

    public j() {
        this.f214b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0128f a() {
        C0124b c0124b = (C0124b) this.f214b;
        DialogInterfaceC0128f dialogInterfaceC0128f = new DialogInterfaceC0128f(c0124b.f2359a, this.f213a);
        View view = c0124b.f2362e;
        C0127e c0127e = dialogInterfaceC0128f.f2388f;
        if (view != null) {
            c0127e.f2377n = view;
        } else {
            CharSequence charSequence = c0124b.d;
            if (charSequence != null) {
                c0127e.d = charSequence;
                TextView textView = c0127e.f2375l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0124b.f2361c;
            if (drawable != null) {
                c0127e.f2373j = drawable;
                ImageView imageView = c0127e.f2374k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0127e.f2374k.setImageDrawable(drawable);
                }
            }
        }
        if (c0124b.f2364g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0124b.f2360b.inflate(c0127e.f2381r, (ViewGroup) null);
            int i = c0124b.i ? c0127e.f2382s : c0127e.f2383t;
            Object obj = c0124b.f2364g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0126d(c0124b.f2359a, i, R.id.text1, null);
            }
            c0127e.f2378o = r7;
            c0127e.f2379p = c0124b.f2365j;
            if (c0124b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0123a(c0124b, c0127e));
            }
            if (c0124b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0127e.f2370e = alertController$RecycleListView;
        }
        dialogInterfaceC0128f.setCancelable(true);
        dialogInterfaceC0128f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0128f.setOnCancelListener(null);
        dialogInterfaceC0128f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0159n dialogInterfaceOnKeyListenerC0159n = c0124b.f2363f;
        if (dialogInterfaceOnKeyListenerC0159n != null) {
            dialogInterfaceC0128f.setOnKeyListener(dialogInterfaceOnKeyListenerC0159n);
        }
        return dialogInterfaceC0128f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f214b).B(this.f213a);
        return true;
    }

    public int c() {
        if ((this.f213a & 128) != 0) {
            return ((int[]) this.f214b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f213a < ((ArrayList) this.f214b).size();
    }

    public void e(j jVar) {
        Z0.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f213a) != 0) {
                f(i, ((int[]) jVar.f214b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f214b;
            if (i >= iArr.length) {
                return;
            }
            this.f213a = (1 << i) | this.f213a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f214b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0128f.i(context, 0);
        this.f214b = new C0124b(new ContextThemeWrapper(context, DialogInterfaceC0128f.i(context, i)));
        this.f213a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f213a = i;
        this.f214b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f214b = bottomSheetBehavior;
        this.f213a = i;
    }
}
