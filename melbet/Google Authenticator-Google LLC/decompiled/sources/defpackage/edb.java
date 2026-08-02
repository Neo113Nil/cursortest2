package defpackage;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edb {
    public Object a;
    public Object b;
    public Object c;
    private final Object d;

    public edb(TextView textView) {
        this.a = gyf.a;
        int i = hel.d;
        this.c = his.a;
        this.d = textView;
    }

    public static gzp f(dze dzeVar) {
        Object obj = dzeVar.b;
        if (obj != null) {
            gzp gzpVar = ((dpo) obj).b;
            if (gzpVar.f()) {
                return gzpVar;
            }
        }
        return gyf.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final eda g(float f) {
        Object next;
        Object obj;
        String str;
        ?? r0 = this.c;
        String str2 = null;
        if (r0 instanceof Collection) {
            if (!((Collection) r0).isEmpty()) {
                if (r0 instanceof List) {
                    obj = hnu.W((List) r0);
                } else if (r0 instanceof SortedSet) {
                    obj = ((SortedSet) r0).last();
                }
                float f2 = 0.0f;
                str = (String) obj;
                boolean z = false;
                if (f > 0.0f) {
                    TextPaint paint = ((TextView) this.d).getPaint();
                    Iterator it = this.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        float measureText = paint.measureText(str3);
                        if (measureText <= f) {
                            z = true;
                            str2 = str3;
                            f2 = measureText;
                            break;
                        }
                        f2 = measureText;
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                }
                if (str != null || !str.contentEquals(((TextView) this.d).getText())) {
                    ((TextView) this.d).setText(str);
                }
                return new eda(z, f2);
            }
            obj = null;
            float f22 = 0.0f;
            str = (String) obj;
            boolean z2 = false;
            if (f > 0.0f) {
            }
            if (str != null) {
            }
            ((TextView) this.d).setText(str);
            return new eda(z2, f22);
        }
        Iterator it2 = r0.iterator();
        if (it2.hasNext()) {
            do {
                next = it2.next();
            } while (it2.hasNext());
            obj = next;
            float f222 = 0.0f;
            str = (String) obj;
            boolean z22 = false;
            if (f > 0.0f) {
            }
            if (str != null) {
            }
            ((TextView) this.d).setText(str);
            return new eda(z22, f222);
        }
        obj = null;
        float f2222 = 0.0f;
        str = (String) obj;
        boolean z222 = false;
        if (f > 0.0f) {
        }
        if (str != null) {
        }
        ((TextView) this.d).setText(str);
        return new eda(z222, f2222);
    }

    public final void a(hel helVar) {
        this.c = hnu.S(helVar, new bwt(7));
        this.b = ((gzp) this.a).f() ? g(((Float) ((gzp) this.a).b()).floatValue()) : null;
    }

    public final void b(int i) {
        Object obj = this.d;
        TextView textView = (TextView) obj;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight();
        if (obj instanceof Chip) {
            fgy fgyVar = ((Chip) obj).c;
            paddingLeft += (fgyVar != null ? fgyVar.i : 0.0f) + (fgyVar != null ? fgyVar.j : 0.0f);
        }
        float f = i - paddingLeft;
        if (((gzp) this.a).f() && f == ((Float) ((gzp) this.a).b()).floatValue() && this.b != null) {
            return;
        }
        this.a = gzp.h(Float.valueOf(f));
        this.b = g(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dpq, java.lang.Object] */
    public final void c(dps dpsVar, Object obj) {
        if (obj == null || dpsVar == null) {
            return;
        }
        dpsVar.b(obj).b(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dpq, java.lang.Object] */
    public final void d(dps dpsVar, Object obj) {
        if (obj == null || dpsVar == null) {
            return;
        }
        dpsVar.b(obj).c(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dps, java.lang.Object] */
    public final void e(dps dpsVar) {
        fao.c();
        d(this.a, this.c);
        this.a = dpsVar;
        c(dpsVar, this.c);
    }

    public edb(dpq dpqVar) {
        this.d = dpqVar;
    }
}
