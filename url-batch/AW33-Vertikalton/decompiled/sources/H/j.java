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
import g.C0117a;
import g.C0118b;
import g.C0120d;
import g.C0121e;
import g.DialogInterfaceC0122f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0158n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f227a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f228b;

    public j() {
        this.f228b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0122f a() {
        C0118b c0118b = (C0118b) this.f228b;
        DialogInterfaceC0122f dialogInterfaceC0122f = new DialogInterfaceC0122f(c0118b.f2286a, this.f227a);
        View view = c0118b.f2289e;
        C0121e c0121e = dialogInterfaceC0122f.f2315f;
        if (view != null) {
            c0121e.f2304n = view;
        } else {
            CharSequence charSequence = c0118b.d;
            if (charSequence != null) {
                c0121e.d = charSequence;
                TextView textView = c0121e.f2302l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0118b.f2288c;
            if (drawable != null) {
                c0121e.f2300j = drawable;
                ImageView imageView = c0121e.f2301k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0121e.f2301k.setImageDrawable(drawable);
                }
            }
        }
        if (c0118b.f2291g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0118b.f2287b.inflate(c0121e.f2308r, (ViewGroup) null);
            int i = c0118b.i ? c0121e.f2309s : c0121e.f2310t;
            Object obj = c0118b.f2291g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0120d(c0118b.f2286a, i, R.id.text1, null);
            }
            c0121e.f2305o = r7;
            c0121e.f2306p = c0118b.f2292j;
            if (c0118b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0117a(c0118b, c0121e));
            }
            if (c0118b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0121e.f2297e = alertController$RecycleListView;
        }
        dialogInterfaceC0122f.setCancelable(true);
        dialogInterfaceC0122f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0122f.setOnCancelListener(null);
        dialogInterfaceC0122f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0158n dialogInterfaceOnKeyListenerC0158n = c0118b.f2290f;
        if (dialogInterfaceOnKeyListenerC0158n != null) {
            dialogInterfaceC0122f.setOnKeyListener(dialogInterfaceOnKeyListenerC0158n);
        }
        return dialogInterfaceC0122f;
    }

    public int b() {
        if ((this.f227a & 128) != 0) {
            return ((int[]) this.f228b)[7];
        }
        return 65535;
    }

    public boolean c() {
        return this.f227a < ((ArrayList) this.f228b).size();
    }

    public void d(j jVar) {
        X0.e.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f227a) != 0) {
                f(i, ((int[]) jVar.f228b)[i]);
            }
        }
    }

    @Override // L.s
    public boolean e(View view) {
        ((BottomSheetBehavior) this.f228b).B(this.f227a);
        return true;
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f228b;
            if (i >= iArr.length) {
                return;
            }
            this.f227a = (1 << i) | this.f227a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f228b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0122f.i(context, 0);
        this.f228b = new C0118b(new ContextThemeWrapper(context, DialogInterfaceC0122f.i(context, i)));
        this.f227a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f227a = i;
        this.f228b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f228b = bottomSheetBehavior;
        this.f227a = i;
    }
}
