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
import g.C0125a;
import g.C0126b;
import g.C0128d;
import g.C0129e;
import g.DialogInterfaceC0130f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0162n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f221b;

    public j() {
        this.f221b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0130f a() {
        C0126b c0126b = (C0126b) this.f221b;
        DialogInterfaceC0130f dialogInterfaceC0130f = new DialogInterfaceC0130f(c0126b.f2360a, this.f220a);
        View view = c0126b.f2363e;
        C0129e c0129e = dialogInterfaceC0130f.f2389f;
        if (view != null) {
            c0129e.f2378n = view;
        } else {
            CharSequence charSequence = c0126b.d;
            if (charSequence != null) {
                c0129e.d = charSequence;
                TextView textView = c0129e.f2376l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0126b.f2362c;
            if (drawable != null) {
                c0129e.f2374j = drawable;
                ImageView imageView = c0129e.f2375k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0129e.f2375k.setImageDrawable(drawable);
                }
            }
        }
        if (c0126b.f2365g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0126b.f2361b.inflate(c0129e.f2382r, (ViewGroup) null);
            int i = c0126b.i ? c0129e.f2383s : c0129e.f2384t;
            Object obj = c0126b.f2365g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0128d(c0126b.f2360a, i, R.id.text1, null);
            }
            c0129e.f2379o = r7;
            c0129e.f2380p = c0126b.f2366j;
            if (c0126b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0125a(c0126b, c0129e));
            }
            if (c0126b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0129e.f2371e = alertController$RecycleListView;
        }
        dialogInterfaceC0130f.setCancelable(true);
        dialogInterfaceC0130f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0130f.setOnCancelListener(null);
        dialogInterfaceC0130f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0162n dialogInterfaceOnKeyListenerC0162n = c0126b.f2364f;
        if (dialogInterfaceOnKeyListenerC0162n != null) {
            dialogInterfaceC0130f.setOnKeyListener(dialogInterfaceOnKeyListenerC0162n);
        }
        return dialogInterfaceC0130f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f221b).B(this.f220a);
        return true;
    }

    public int c() {
        if ((this.f220a & 128) != 0) {
            return ((int[]) this.f221b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f220a < ((ArrayList) this.f221b).size();
    }

    public void e(j jVar) {
        b1.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f220a) != 0) {
                f(i, ((int[]) jVar.f221b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f221b;
            if (i >= iArr.length) {
                return;
            }
            this.f220a = (1 << i) | this.f220a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f221b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0130f.i(context, 0);
        this.f221b = new C0126b(new ContextThemeWrapper(context, DialogInterfaceC0130f.i(context, i)));
        this.f220a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f220a = i;
        this.f221b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f221b = bottomSheetBehavior;
        this.f220a = i;
    }
}
