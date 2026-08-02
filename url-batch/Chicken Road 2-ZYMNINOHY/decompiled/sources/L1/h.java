package L1;

import E.AbstractC0005f;
import T.C0097o;
import T.N;
import T.Q;
import T.T;
import W.J;
import a0.C0130F;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.rockchicken.pump.up.road.R;
import g.AbstractC0432a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k.AbstractC1213f0;
import k.AbstractC1237x;
import k.C1190N;
import k.C1227n;
import q0.C1353B;
import r2.C1403a;
import v2.I;
import v2.f0;
import x.AbstractC1512a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f1633a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1634b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1635c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1636d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1637e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1638f;

    public h(String str, String str2, Set set) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f1635c = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f1633a = str;
        this.f1637e = str2;
        this.f1638f = C1403a.f15199b;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1636d = Collections.unmodifiableSet(hashSet);
    }

    public static boolean c(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i4) {
        int b4 = AbstractC1213f0.b(context, R.attr.colorControlHighlight);
        int a3 = AbstractC1213f0.a(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC1213f0.f14003b;
        int[] iArr2 = AbstractC1213f0.f14005d;
        int a4 = AbstractC1512a.a(b4, i4);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC1213f0.f14004c, AbstractC1213f0.f14007f}, new int[]{a3, a4, AbstractC1512a.a(b4, i4), i4});
    }

    public static C1353B f(N n, I i4, C1353B c1353b, Q q4) {
        C0130F c0130f = (C0130F) n;
        T q5 = c0130f.q();
        int n4 = c0130f.n();
        Object l4 = q5.p() ? null : q5.l(n4);
        int b4 = (c0130f.w() || q5.p()) ? -1 : q5.f(n4, q4, false).b(J.M(c0130f.o()) - q4.f2685e);
        for (int i5 = 0; i5 < i4.size(); i5++) {
            C1353B c1353b2 = (C1353B) i4.get(i5);
            if (h(c1353b2, l4, c0130f.w(), c0130f.k(), c0130f.l(), b4)) {
                return c1353b2;
            }
        }
        if (i4.isEmpty() && c1353b != null && h(c1353b, l4, c0130f.w(), c0130f.k(), c0130f.l(), b4)) {
            return c1353b;
        }
        return null;
    }

    public static boolean h(C1353B c1353b, Object obj, boolean z, int i4, int i5, int i6) {
        Object obj2 = c1353b.f14812a;
        int i7 = c1353b.f14813b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i7 == i4 && c1353b.f14814c == i5) {
            return true;
        }
        return !z && i7 == -1 && c1353b.f14816e == i6;
    }

    public static void i(Drawable drawable, int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        if (AbstractC1237x.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C1227n.f14049b;
        }
        PorterDuff.Mode mode2 = C1227n.f14049b;
        synchronized (C1227n.class) {
            e4 = C1190N.e(i4, mode);
        }
        drawable.setColorFilter(e4);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1638f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void b(L3.h hVar, C1353B c1353b, T t4) {
        if (c1353b == null) {
            return;
        }
        if (t4.b(c1353b.f14812a) != -1) {
            hVar.d(c1353b, t4);
            return;
        }
        T t5 = (T) ((f0) this.f1635c).get(c1353b);
        if (t5 != null) {
            hVar.d(c1353b, t5);
        }
    }

    public i d() {
        String str = ((String) this.f1633a) == null ? " transportName" : "";
        if (((n) this.f1635c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1636d) == null) {
            str = AbstractC0005f.z(str, " eventMillis");
        }
        if (((Long) this.f1637e) == null) {
            str = AbstractC0005f.z(str, " uptimeMillis");
        }
        if (((HashMap) this.f1638f) == null) {
            str = AbstractC0005f.z(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i((String) this.f1633a, (Integer) this.f1634b, (n) this.f1635c, ((Long) this.f1636d).longValue(), ((Long) this.f1637e).longValue(), (HashMap) this.f1638f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ColorStateList g(Context context, int i4) {
        if (i4 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0432a.f8818a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i4 == 2131165254) {
            Object obj2 = AbstractC0432a.f8818a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i4 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c4 = AbstractC1213f0.c(context, R.attr.colorSwitchThumbNormal);
            if (c4 == null || !c4.isStateful()) {
                iArr[0] = AbstractC1213f0.f14003b;
                iArr2[0] = AbstractC1213f0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = AbstractC1213f0.f14006e;
                iArr2[1] = AbstractC1213f0.b(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1213f0.f14007f;
                iArr2[2] = AbstractC1213f0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = AbstractC1213f0.f14003b;
                iArr[0] = iArr3;
                iArr2[0] = c4.getColorForState(iArr3, 0);
                iArr[1] = AbstractC1213f0.f14006e;
                iArr2[1] = AbstractC1213f0.b(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1213f0.f14007f;
                iArr2[2] = c4.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
            return e(context, AbstractC1213f0.b(context, R.attr.colorButtonNormal));
        }
        if (i4 == R.drawable.abc_btn_borderless_material) {
            return e(context, 0);
        }
        if (i4 == R.drawable.abc_btn_colored_material) {
            return e(context, AbstractC1213f0.b(context, R.attr.colorAccent));
        }
        if (i4 == 2131165251 || i4 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0432a.f8818a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (c((int[]) this.f1634b, i4)) {
            return AbstractC1213f0.c(context, R.attr.colorControlNormal);
        }
        if (c((int[]) this.f1637e, i4)) {
            Object obj4 = AbstractC0432a.f8818a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (c((int[]) this.f1638f, i4)) {
            Object obj5 = AbstractC0432a.f8818a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i4 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0432a.f8818a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public void j(T t4) {
        L3.h hVar = new L3.h(4);
        if (((I) this.f1634b).isEmpty()) {
            b(hVar, (C1353B) this.f1637e, t4);
            if (!Objects.equals((C1353B) this.f1638f, (C1353B) this.f1637e)) {
                b(hVar, (C1353B) this.f1638f, t4);
            }
            if (!Objects.equals((C1353B) this.f1636d, (C1353B) this.f1637e) && !Objects.equals((C1353B) this.f1636d, (C1353B) this.f1638f)) {
                b(hVar, (C1353B) this.f1636d, t4);
            }
        } else {
            for (int i4 = 0; i4 < ((I) this.f1634b).size(); i4++) {
                b(hVar, (C1353B) ((I) this.f1634b).get(i4), t4);
            }
            if (!((I) this.f1634b).contains((C1353B) this.f1636d)) {
                b(hVar, (C1353B) this.f1636d, t4);
            }
        }
        this.f1635c = hVar.a(true);
    }

    public h(j0.o oVar, MediaFormat mediaFormat, C0097o c0097o, Surface surface, MediaCrypto mediaCrypto, B1.j jVar) {
        this.f1633a = oVar;
        this.f1634b = mediaFormat;
        this.f1635c = c0097o;
        this.f1636d = surface;
        this.f1637e = mediaCrypto;
        this.f1638f = jVar;
    }
}
