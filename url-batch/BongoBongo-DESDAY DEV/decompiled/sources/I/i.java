package I;

import M.s;
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
import g.C0098a;
import g.C0099b;
import g.C0101d;
import g.C0102e;
import g.DialogInterfaceC0103f;
import java.util.ArrayList;
import l.DialogInterfaceOnKeyListenerC0170n;

/* loaded from: classes.dex */
public final class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f335a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f336b;

    public i() {
        this.f336b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0103f a() {
        C0099b c0099b = (C0099b) this.f336b;
        DialogInterfaceC0103f dialogInterfaceC0103f = new DialogInterfaceC0103f(c0099b.f2300a, this.f335a);
        View view = c0099b.f2303e;
        C0102e c0102e = dialogInterfaceC0103f.f2331f;
        if (view != null) {
            c0102e.f2320n = view;
        } else {
            CharSequence charSequence = c0099b.d;
            if (charSequence != null) {
                c0102e.d = charSequence;
                TextView textView = c0102e.f2318l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0099b.f2302c;
            if (drawable != null) {
                c0102e.f2316j = drawable;
                ImageView imageView = c0102e.f2317k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0102e.f2317k.setImageDrawable(drawable);
                }
            }
        }
        if (c0099b.f2305g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0099b.f2301b.inflate(c0102e.f2324r, (ViewGroup) null);
            int i = c0099b.i ? c0102e.f2325s : c0102e.f2326t;
            Object obj = c0099b.f2305g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0101d(c0099b.f2300a, i, R.id.text1, null);
            }
            c0102e.f2321o = r7;
            c0102e.f2322p = c0099b.f2307j;
            if (c0099b.f2306h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0098a(c0099b, c0102e));
            }
            if (c0099b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0102e.f2312e = alertController$RecycleListView;
        }
        dialogInterfaceC0103f.setCancelable(true);
        dialogInterfaceC0103f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0103f.setOnCancelListener(null);
        dialogInterfaceC0103f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0170n dialogInterfaceOnKeyListenerC0170n = c0099b.f2304f;
        if (dialogInterfaceOnKeyListenerC0170n != null) {
            dialogInterfaceC0103f.setOnKeyListener(dialogInterfaceOnKeyListenerC0170n);
        }
        return dialogInterfaceC0103f;
    }

    @Override // M.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f336b).B(this.f335a);
        return true;
    }

    public int c() {
        if ((this.f335a & 128) != 0) {
            return ((int[]) this.f336b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f335a < ((ArrayList) this.f336b).size();
    }

    public void e(i iVar) {
        h1.d.e(iVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & iVar.f335a) != 0) {
                f(i, ((int[]) iVar.f336b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f336b;
            if (i >= iArr.length) {
                return;
            }
            this.f335a = (1 << i) | this.f335a;
            iArr[i] = i2;
        }
    }

    public i(ArrayList arrayList) {
        this.f336b = arrayList;
    }

    public i(Context context) {
        int i = DialogInterfaceC0103f.i(context, 0);
        this.f336b = new C0099b(new ContextThemeWrapper(context, DialogInterfaceC0103f.i(context, i)));
        this.f335a = i;
    }

    public i(int i, j[] jVarArr) {
        this.f335a = i;
        this.f336b = jVarArr;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f336b = bottomSheetBehavior;
        this.f335a = i;
    }
}
