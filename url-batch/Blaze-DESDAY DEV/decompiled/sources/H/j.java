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
import g.C0100a;
import g.C0101b;
import g.C0103d;
import g.C0104e;
import g.DialogInterfaceC0105f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0167n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f292a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f293b;

    public j() {
        this.f293b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0105f a() {
        C0101b c0101b = (C0101b) this.f293b;
        DialogInterfaceC0105f dialogInterfaceC0105f = new DialogInterfaceC0105f(c0101b.f2222a, this.f292a);
        View view = c0101b.f2225e;
        C0104e c0104e = dialogInterfaceC0105f.f2251f;
        if (view != null) {
            c0104e.f2240n = view;
        } else {
            CharSequence charSequence = c0101b.d;
            if (charSequence != null) {
                c0104e.d = charSequence;
                TextView textView = c0104e.f2238l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0101b.f2224c;
            if (drawable != null) {
                c0104e.f2236j = drawable;
                ImageView imageView = c0104e.f2237k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0104e.f2237k.setImageDrawable(drawable);
                }
            }
        }
        if (c0101b.f2227g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0101b.f2223b.inflate(c0104e.f2244r, (ViewGroup) null);
            int i = c0101b.i ? c0104e.f2245s : c0104e.f2246t;
            Object obj = c0101b.f2227g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0103d(c0101b.f2222a, i, R.id.text1, null);
            }
            c0104e.f2241o = r7;
            c0104e.f2242p = c0101b.f2228j;
            if (c0101b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0100a(c0101b, c0104e));
            }
            if (c0101b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0104e.f2233e = alertController$RecycleListView;
        }
        dialogInterfaceC0105f.setCancelable(true);
        dialogInterfaceC0105f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0105f.setOnCancelListener(null);
        dialogInterfaceC0105f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0167n dialogInterfaceOnKeyListenerC0167n = c0101b.f2226f;
        if (dialogInterfaceOnKeyListenerC0167n != null) {
            dialogInterfaceC0105f.setOnKeyListener(dialogInterfaceOnKeyListenerC0167n);
        }
        return dialogInterfaceC0105f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f293b).B(this.f292a);
        return true;
    }

    public int c() {
        if ((this.f292a & 128) != 0) {
            return ((int[]) this.f293b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f292a < ((ArrayList) this.f293b).size();
    }

    public void e(j jVar) {
        g1.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f292a) != 0) {
                f(i, ((int[]) jVar.f293b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f293b;
            if (i >= iArr.length) {
                return;
            }
            this.f292a = (1 << i) | this.f292a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f293b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0105f.i(context, 0);
        this.f293b = new C0101b(new ContextThemeWrapper(context, DialogInterfaceC0105f.i(context, i)));
        this.f292a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f292a = i;
        this.f293b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f293b = bottomSheetBehavior;
        this.f292a = i;
    }
}
