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
import g.C0098a;
import g.C0099b;
import g.C0101d;
import g.C0102e;
import g.DialogInterfaceC0103f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0165n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f275a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f276b;

    public j() {
        this.f276b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0103f a() {
        C0099b c0099b = (C0099b) this.f276b;
        DialogInterfaceC0103f dialogInterfaceC0103f = new DialogInterfaceC0103f(c0099b.f2182a, this.f275a);
        View view = c0099b.f2185e;
        C0102e c0102e = dialogInterfaceC0103f.f2211f;
        if (view != null) {
            c0102e.f2200n = view;
        } else {
            CharSequence charSequence = c0099b.d;
            if (charSequence != null) {
                c0102e.d = charSequence;
                TextView textView = c0102e.f2198l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0099b.f2184c;
            if (drawable != null) {
                c0102e.f2196j = drawable;
                ImageView imageView = c0102e.f2197k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0102e.f2197k.setImageDrawable(drawable);
                }
            }
        }
        if (c0099b.f2187g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0099b.f2183b.inflate(c0102e.f2204r, (ViewGroup) null);
            int i = c0099b.i ? c0102e.f2205s : c0102e.f2206t;
            Object obj = c0099b.f2187g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0101d(c0099b.f2182a, i, R.id.text1, null);
            }
            c0102e.f2201o = r7;
            c0102e.f2202p = c0099b.f2188j;
            if (c0099b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0098a(c0099b, c0102e));
            }
            if (c0099b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0102e.f2193e = alertController$RecycleListView;
        }
        dialogInterfaceC0103f.setCancelable(true);
        dialogInterfaceC0103f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0103f.setOnCancelListener(null);
        dialogInterfaceC0103f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0165n dialogInterfaceOnKeyListenerC0165n = c0099b.f2186f;
        if (dialogInterfaceOnKeyListenerC0165n != null) {
            dialogInterfaceC0103f.setOnKeyListener(dialogInterfaceOnKeyListenerC0165n);
        }
        return dialogInterfaceC0103f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f276b).B(this.f275a);
        return true;
    }

    public int c() {
        if ((this.f275a & 128) != 0) {
            return ((int[]) this.f276b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f275a < ((ArrayList) this.f276b).size();
    }

    public void e(j jVar) {
        d1.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f275a) != 0) {
                f(i, ((int[]) jVar.f276b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f276b;
            if (i >= iArr.length) {
                return;
            }
            this.f275a = (1 << i) | this.f275a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f276b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0103f.i(context, 0);
        this.f276b = new C0099b(new ContextThemeWrapper(context, DialogInterfaceC0103f.i(context, i)));
        this.f275a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f275a = i;
        this.f276b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f276b = bottomSheetBehavior;
        this.f275a = i;
    }
}
