package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dym extends ConstraintLayout {
    private static final dyl p = new dyl(new int[][]{new int[]{R.id.og_bento_privacy_policy_button, R.id.og_bento_separator1, R.id.og_bento_tos_button}}, new int[]{R.id.og_bento_separator2, R.id.og_bento_custom_button});
    private static final dyl q = new dyl(new int[][]{new int[]{R.id.og_bento_privacy_policy_button}, new int[]{R.id.og_bento_separator1}, new int[]{R.id.og_bento_tos_button}}, new int[]{R.id.og_bento_separator2, R.id.og_bento_custom_button});
    private static final dyl r = new dyl(new int[][]{new int[]{R.id.og_bento_privacy_policy_button, R.id.og_bento_separator1, R.id.og_bento_tos_button, R.id.og_bento_separator2, R.id.og_bento_custom_button}}, new int[0]);
    private static final dyl s = new dyl(new int[][]{new int[]{R.id.og_bento_privacy_policy_button}, new int[]{R.id.og_bento_separator1}, new int[]{R.id.og_bento_tos_button}, new int[]{R.id.og_bento_separator2}, new int[]{R.id.og_bento_custom_button}}, new int[0]);
    private static final dyl t = new dyl(new int[][]{new int[]{R.id.og_bento_privacy_policy_button, R.id.og_bento_separator1, R.id.og_bento_tos_button}, new int[]{R.id.og_bento_custom_button}}, new int[]{R.id.og_bento_separator2});
    private static final dyl u = new dyl(new int[][]{new int[]{R.id.og_bento_privacy_policy_button}, new int[]{R.id.og_bento_tos_button, R.id.og_bento_separator2, R.id.og_bento_custom_button}}, new int[]{R.id.og_bento_separator1});
    public final MaterialButton i;
    public final MaterialButton j;
    public final MaterialButton k;
    public Integer l;
    public jfx m;
    public final hel n;
    public hel o;

    public dym(Context context) {
        super(context, null);
        hel r2 = hel.r(p, q);
        r2.getClass();
        this.n = r2;
        hel.j(r, t, u, s).getClass();
        this.o = r2;
        LayoutInflater.from(context).inflate(R.layout.og_bento_policy_footer, this);
        View findViewById = findViewById(R.id.og_bento_privacy_policy_button);
        findViewById.getClass();
        this.i = (MaterialButton) findViewById;
        View findViewById2 = findViewById(R.id.og_bento_tos_button);
        findViewById2.getClass();
        this.j = (MaterialButton) findViewById2;
        View findViewById3 = findViewById(R.id.og_bento_separator1);
        findViewById3.getClass();
        View findViewById4 = findViewById(R.id.og_bento_separator2);
        findViewById4.getClass();
        View findViewById5 = findViewById(R.id.og_bento_custom_button);
        findViewById5.getClass();
        this.k = (MaterialButton) findViewById5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int length;
        char c;
        char c2;
        int i3;
        int i4;
        char c3;
        char c4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        Integer num = this.l;
        if (num != null && measuredWidth == num.intValue()) {
            return;
        }
        int i5 = 0;
        hjs listIterator = this.o.listIterator(0);
        listIterator.getClass();
        while (listIterator.hasNext()) {
            E next = listIterator.next();
            next.getClass();
            dyl dylVar = (dyl) next;
            int[][] iArr = dylVar.a;
            int[] iArr2 = dylVar.b;
            tn tnVar = new tn();
            tnVar.c(this);
            int i6 = i5;
            while (true) {
                length = iArr.length;
                c = 3;
                c2 = 4;
                if (i6 >= length) {
                    break;
                }
                int G = i6 == 0 ? i5 : ixc.G(iArr[i6 - 1]);
                int i7 = i6 + 1;
                int G2 = i6 == length + (-1) ? i5 : ixc.G(iArr[i7]);
                int G3 = ixc.G(iArr[i6]);
                tnVar.k(G3, 3, G, G == 0 ? 3 : 4);
                tnVar.k(G3, 4, G2, G2 == 0 ? 4 : 3);
                if (G != 0) {
                    tnVar.k(G, 4, G3, 3);
                }
                if (G2 != 0) {
                    tnVar.k(G2, 3, G3, 4);
                }
                i6 = i7;
            }
            int i8 = i5;
            while (i8 < length) {
                int[] iArr3 = iArr[i8];
                int length2 = iArr3.length;
                int i9 = i5;
                while (i9 < length2) {
                    int i10 = i9 == 0 ? i5 : iArr3[i9 - 1];
                    int i11 = i9 + 1;
                    if (i9 == iArr3.length - 1) {
                        i3 = i5;
                        i4 = i3;
                    } else {
                        i3 = iArr3[i11];
                        i4 = i5;
                    }
                    int i12 = iArr3[i9];
                    tnVar.k(i12, 6, i10, i10 == 0 ? 6 : 7);
                    tnVar.k(i12, 7, i3, i3 == 0 ? 7 : 6);
                    if (i10 != 0) {
                        tnVar.k(i10, 7, i12, 6);
                    }
                    if (i3 != 0) {
                        tnVar.k(i3, 6, i12, 7);
                    }
                    if (i9 > 0) {
                        c3 = 3;
                        tnVar.e(iArr3[i9], 3, iArr3[i4], 3);
                        c4 = 4;
                        tnVar.e(iArr3[i9], 4, iArr3[i4], 4);
                    } else {
                        c3 = 3;
                        c4 = 4;
                    }
                    c = c3;
                    c2 = c4;
                    i9 = i11;
                    i5 = i4;
                }
                i8++;
                c2 = c2;
            }
            int i13 = i5;
            tnVar.b(this);
            int length3 = iArr.length;
            int i14 = i13;
            while (i14 < length3) {
                int[] iArr4 = iArr[i14];
                int length4 = iArr4.length;
                int i15 = i13;
                while (i15 < length4) {
                    findViewById(iArr4[i15]).setVisibility(i13);
                    i15++;
                    i13 = 0;
                }
                int length5 = iArr4.length;
                View findViewById = findViewById(iArr4[length5 >> 1]);
                findViewById.getClass();
                dih.Y(findViewById, 1);
                if (length5 > 1) {
                    View findViewById2 = findViewById(ixc.G(iArr4));
                    iArr4.getClass();
                    View findViewById3 = findViewById(iArr4[length5 - 1]);
                    findViewById2.getClass();
                    dih.Y(findViewById2, 8388613);
                    findViewById3.getClass();
                    dih.Y(findViewById3, 8388611);
                }
                i14++;
                i13 = 0;
            }
            for (int i16 : iArr2) {
                findViewById(i16).setVisibility(8);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                break;
            } else {
                i5 = 0;
            }
        }
        super.onMeasure(i, i2);
        this.l = Integer.valueOf(getMeasuredWidth());
    }
}
