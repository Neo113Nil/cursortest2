package F1;

import E1.AbstractC0033i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import b1.C0186a;
import com.fc.barca.football.R;
import h.AbstractC0337a;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l.AbstractC1103z;
import l.C1093o;
import l.P;
import l.h0;
import x.AbstractC1237a;

/* loaded from: classes.dex */
public final class c implements M1.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f486a;

    /* renamed from: b, reason: collision with root package name */
    public Object f487b;

    /* renamed from: c, reason: collision with root package name */
    public Object f488c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f489d;

    /* renamed from: e, reason: collision with root package name */
    public Object f490e;
    public Serializable f;

    public c(String str, String str2, Set set) {
        C0186a c0186a = C0186a.f2545b;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f486a = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f488c = str;
        this.f489d = str2;
        this.f490e = c0186a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f487b = Collections.unmodifiableSet(hashSet);
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i3) {
        int b3 = h0.b(context, R.attr.colorControlHighlight);
        int a3 = h0.a(context, R.attr.colorButtonNormal);
        int[] iArr = h0.f9812b;
        int[] iArr2 = h0.f9814d;
        int a4 = AbstractC1237a.a(b3, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, h0.f9813c, h0.f}, new int[]{a3, a4, AbstractC1237a.a(b3, i3), i3});
    }

    public static void f(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter e3;
        if (AbstractC1103z.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C1093o.f9861b;
        }
        PorterDuff.Mode mode2 = C1093o.f9861b;
        synchronized (C1093o.class) {
            e3 = P.e(i3, mode);
        }
        drawable.setColorFilter(e3);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public v0.h c() {
        String str = ((String) this.f486a) == null ? " transportName" : "";
        if (((v0.k) this.f488c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f489d) == null) {
            str = AbstractC0033i.s(str, " eventMillis");
        }
        if (((Long) this.f490e) == null) {
            str = AbstractC0033i.s(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = AbstractC0033i.s(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new v0.h((String) this.f486a, (Integer) this.f487b, (v0.k) this.f488c, ((Long) this.f489d).longValue(), ((Long) this.f490e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ColorStateList e(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0337a.f5053a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i3 == 2131165254) {
            Object obj2 = AbstractC0337a.f5053a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c3 = h0.c(context, R.attr.colorSwitchThumbNormal);
            if (c3 == null || !c3.isStateful()) {
                iArr[0] = h0.f9812b;
                iArr2[0] = h0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = h0.f9815e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f;
                iArr2[2] = h0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = h0.f9812b;
                iArr[0] = iArr3;
                iArr2[0] = c3.getColorForState(iArr3, 0);
                iArr[1] = h0.f9815e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f;
                iArr2[2] = c3.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return d(context, h0.b(context, R.attr.colorButtonNormal));
        }
        if (i3 == R.drawable.abc_btn_borderless_material) {
            return d(context, 0);
        }
        if (i3 == R.drawable.abc_btn_colored_material) {
            return d(context, h0.b(context, R.attr.colorAccent));
        }
        if (i3 == 2131165251 || i3 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0337a.f5053a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (b((int[]) this.f487b, i3)) {
            return h0.c(context, R.attr.colorControlNormal);
        }
        if (b((int[]) this.f490e, i3)) {
            Object obj4 = AbstractC0337a.f5053a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (b((int[]) this.f, i3)) {
            Object obj5 = AbstractC0337a.f5053a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i3 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0337a.f5053a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }
}
