package r2;

import a0.g1;
import a0.l1;
import a7.u;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b6.i0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.snovikpovik.vuevnxsj.R;
import d2.s;
import d2.v;
import f1.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import m0.e1;
import m0.e2;
import m0.i2;
import m0.o2;
import m0.t;
import m0.t1;
import m0.t2;
import m0.z0;
import o.e0;
import o.j0;
import t.z;
import u.a0;
import u.b0;
import w1.f0;
import x.v0;
import x1.b1;
import x1.g0;
import y3.c0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r {
    public static final v3.a A(View view) {
        v3.a aVar = (v3.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        v3.a aVar2 = new v3.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static boolean D(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static x6.f E(p6.e eVar) {
        x6.f fVar = new x6.f();
        fVar.f8674f = m.a.o(fVar, fVar, eVar);
        return fVar;
    }

    public static final void F(String str) {
        q6.i.e(str, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    public static float I(EdgeEffect edgeEffect, float f6, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u3.c.c(edgeEffect, f6, f8);
        }
        u3.b.a(edgeEffect, f6, f8);
        return f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void N(ViewStructure viewStructure, f0 f0Var, AutofillId autofillId, String str, e2.a aVar) {
        int i;
        long j7;
        long j8;
        char c8;
        long j9;
        f2.a aVar2;
        d2.g gVar;
        g2.e eVar;
        z0.c cVar;
        boolean z3;
        z0.m mVar;
        Boolean bool;
        boolean z7;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        boolean z8;
        String[] D;
        AutofillValue forText;
        String t3;
        String[] D2;
        String[] D3;
        j0 j0Var;
        long[] jArr;
        Object[] objArr;
        Integer num3;
        long[] jArr2;
        Object[] objArr2;
        j0 j0Var2;
        f2.a aVar3;
        d2.g gVar2;
        g2.e eVar2;
        int i8;
        Integer num4 = 1;
        v vVar = s.f2188a;
        v vVar2 = d2.i.f2125a;
        d2.j u7 = f0Var.u();
        int i9 = 8;
        if (u7 == null || (j0Var2 = u7.f2150d) == null) {
            i = 2;
            j7 = 128;
            j8 = 255;
            c8 = 7;
            j9 = -9187201950435737472L;
            aVar2 = null;
            gVar = null;
            eVar = null;
            cVar = null;
            z3 = false;
            mVar = null;
            bool = null;
            z7 = false;
            num = null;
        } else {
            j7 = 128;
            Object[] objArr3 = j0Var2.f5483b;
            Object[] objArr4 = j0Var2.f5484c;
            long[] jArr3 = j0Var2.f5482a;
            j8 = 255;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                int i10 = 0;
                cVar = null;
                z3 = false;
                aVar3 = null;
                mVar = null;
                bool = null;
                gVar2 = null;
                z7 = false;
                num = null;
                eVar2 = null;
                c8 = 7;
                while (true) {
                    long j10 = jArr3[i10];
                    j9 = -9187201950435737472L;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j10 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                Object obj2 = objArr4[i13];
                                v vVar3 = (v) obj;
                                i8 = i9;
                                if (q6.i.a(vVar3, s.f2204r)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    cVar = (z0.c) obj2;
                                } else if (q6.i.a(vVar3, s.f2188a)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) d6.m.S((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (q6.i.a(vVar3, s.f2203q)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    mVar = (z0.m) obj2;
                                } else if (q6.i.a(vVar3, s.D)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    eVar2 = (g2.e) obj2;
                                } else if (q6.i.a(vVar3, s.f2197k)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (q6.i.a(vVar3, s.L)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (q6.i.a(vVar3, s.H)) {
                                    z7 = true;
                                } else if (q6.i.a(vVar3, s.f2209w)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    gVar2 = (d2.g) obj2;
                                } else if (q6.i.a(vVar3, s.F)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (q6.i.a(vVar3, s.G)) {
                                    q6.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar3 = (f2.a) obj2;
                                } else if (q6.i.a(vVar3, d2.i.f2126b)) {
                                    viewStructure.setClickable(true);
                                } else if (q6.i.a(vVar3, d2.i.f2127c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (q6.i.a(vVar3, d2.i.f2144u)) {
                                    viewStructure.setFocusable(true);
                                } else if (q6.i.a(vVar3, d2.i.f2133j)) {
                                    z3 = true;
                                }
                            } else {
                                i8 = i9;
                            }
                            j10 >>= i8;
                            i12++;
                            i9 = i8;
                        }
                        if (i11 != i9) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    i9 = 8;
                }
            } else {
                c8 = 7;
                j9 = -9187201950435737472L;
                cVar = null;
                z3 = false;
                aVar3 = null;
                mVar = null;
                bool = null;
                gVar2 = null;
                z7 = false;
                num = null;
                eVar2 = null;
            }
            aVar2 = aVar3;
            gVar = gVar2;
            eVar = eVar2;
        }
        d2.j u8 = f0Var.u();
        if (u8 != null && u8.f2152f && !u8.f2153g) {
            u8 = u8.a();
            e0 e0Var = new e0(((o0.b) f0Var.m()).f5572d.f5580f);
            e0Var.b(f0Var.m());
            while (e0Var.h()) {
                f0 f0Var2 = (f0) e0Var.j(e0Var.f5443b - 1);
                d2.j u9 = f0Var2.u();
                if (u9 != null && !u9.f2152f) {
                    u8.c(u9);
                    if (!u9.f2153g) {
                        e0Var.b(f0Var2.m());
                    }
                }
            }
        }
        if (u8 != null && (j0Var = u8.f2150d) != null) {
            Object[] objArr5 = j0Var.f5483b;
            Object[] objArr6 = j0Var.f5484c;
            long[] jArr4 = j0Var.f5482a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                list = null;
                while (true) {
                    long j11 = jArr4[i14];
                    if ((((~j11) << c8) & j11 & j9) != j9) {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j11 & j8) < j7) {
                                int i17 = (i14 << 3) + i16;
                                Object obj3 = objArr5[i17];
                                num3 = num4;
                                Object obj4 = objArr6[i17];
                                jArr2 = jArr4;
                                v vVar4 = (v) obj3;
                                objArr2 = objArr5;
                                if (q6.i.a(vVar4, s.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (q6.i.a(vVar4, s.f2212z)) {
                                    q6.i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j11 >>= 8;
                            i16++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i15 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i14 == length2) {
                        break;
                    }
                    i14++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num4 = num2;
                }
                Integer valueOf2 = Integer.valueOf(f0Var.f7640e);
                if (f0Var.s() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (cVar == null && !z3) ? aVar2 == null ? Integer.valueOf(i) : null : num2;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (mVar != null && (D3 = o.D(mVar)) != null) {
                    viewStructure.setAutofillHints(D3);
                }
                aVar.f2470a.f(f0Var.f7640e, new z0.n(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (aVar2 != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(aVar2 == f2.a.f2711d);
                } else if (bool != null && (gVar == null || gVar.f2122a != 4)) {
                    z8 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                    z0.m.f9116a.getClass();
                    D = o.D(z0.l.f9115b);
                    q6.i.e(D, "<this>");
                    if (D.length != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    boolean z9 = (mVar == null || (D2 = o.D(mVar)) == null || d6.l.P(D2, D[0]) < 0) ? false : z8;
                    if (!z7 && !z9) {
                        z8 = false;
                    }
                    if (z8) {
                        viewStructure.setDataIsSensitive(true);
                    }
                    viewStructure.setVisibility(f0Var.F.f7598d.M0() ? 4 : 0);
                    if (list != null) {
                        int size = list.size();
                        String str2 = "";
                        for (int i18 = 0; i18 < size; i18++) {
                            str2 = str2 + ((g2.e) list.get(i18)).f2928e + '\n';
                        }
                        viewStructure.setText(str2);
                        viewStructure.setClassName("android.widget.TextView");
                    }
                    if (((o0.b) f0Var.m()).isEmpty() && gVar != null && (t3 = g0.t(gVar.f2122a)) != null) {
                        viewStructure.setClassName(t3);
                    }
                    if (z3) {
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (eVar != null) {
                            forText = AutofillValue.forText(eVar.f2928e);
                            viewStructure.setAutofillValue(forText);
                        }
                        if (z8) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z8 = true;
                z0.m.f9116a.getClass();
                D = o.D(z0.l.f9115b);
                q6.i.e(D, "<this>");
                if (D.length != 0) {
                }
            }
        }
        num2 = num4;
        list = null;
        Integer valueOf22 = Integer.valueOf(f0Var.f7640e);
        if (f0Var.s() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (cVar == null) {
            if (valueOf != null) {
            }
            if (mVar != null) {
                viewStructure.setAutofillHints(D3);
            }
            aVar.f2470a.f(f0Var.f7640e, new z0.n(viewStructure));
            if (bool != null) {
            }
            if (aVar2 != null) {
            }
            z8 = true;
            z0.m.f9116a.getClass();
            D = o.D(z0.l.f9115b);
            q6.i.e(D, "<this>");
            if (D.length != 0) {
            }
        }
        if (valueOf != null) {
        }
        if (mVar != null) {
        }
        aVar.f2470a.f(f0Var.f7640e, new z0.n(viewStructure));
        if (bool != null) {
        }
        if (aVar2 != null) {
        }
        z8 = true;
        z0.m.f9116a.getClass();
        D = o.D(z0.l.f9115b);
        q6.i.e(D, "<this>");
        if (D.length != 0) {
        }
    }

    public static void O(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static TypedValue P(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int Q(Context context, int i, int i8) {
        TypedValue P = P(context, i);
        return (P == null || P.type != 16) ? i8 : P.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130 A[Catch: NumberFormatException -> 0x0144, LOOP:3: B:47:0x00ff->B:57:0x0130, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:57:0x0130, B:61:0x0136, B:66:0x014b, B:79:0x0150, B:81:0x0153, B:86:0x015f, B:87:0x0164, B:89:0x0165, B:90:0x016a), top: B:43:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136 A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:57:0x0130, B:61:0x0136, B:66:0x014b, B:79:0x0150, B:81:0x0153, B:86:0x015f, B:87:0x0164, B:89:0x0165, B:90:0x016a), top: B:43:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:57:0x0130, B:61:0x0136, B:66:0x014b, B:79:0x0150, B:81:0x0153, B:86:0x015f, B:87:0x0164, B:89:0x0165, B:90:0x016a), top: B:43:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TimeInterpolator R(Context context, int i, TimeInterpolator timeInterpolator) {
        int i8;
        String trim;
        float[] fArr;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!D(valueOf, "cubic-bezier") && !D(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (D(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(z(split, 0), z(split, 1), z(split, 2), z(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!D(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i11 < substring.length()) {
            while (i11 < substring.length()) {
                char charAt = substring.charAt(i11);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i11++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = substring.substring(i10, i11).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i9) == 'z' || trim.charAt(i9) == 'Z') {
                            fArr = new float[i9];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i12 = i9;
                                int i13 = 1;
                                while (i13 < length) {
                                    int i14 = i9;
                                    int i15 = i14;
                                    int i16 = i15;
                                    int i17 = i16;
                                    for (int i18 = i13; i18 < trim.length(); i18++) {
                                        char charAt2 = trim.charAt(i18);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i18 != i13 && i14 == 0) {
                                                            i14 = 0;
                                                            i16 = 1;
                                                            i17 = 1;
                                                            break;
                                                        }
                                                        i14 = 0;
                                                        break;
                                                    case '.':
                                                        if (i15 == 0) {
                                                            i14 = 0;
                                                            i15 = 1;
                                                            break;
                                                        }
                                                        i14 = 0;
                                                        i16 = 1;
                                                        i17 = 1;
                                                        break;
                                                    default:
                                                        i14 = 0;
                                                        break;
                                                }
                                            } else {
                                                i14 = 1;
                                            }
                                            if (i16 == 0) {
                                                if (i13 < i18) {
                                                    fArr2[i12] = Float.parseFloat(trim.substring(i13, i18));
                                                    i12++;
                                                }
                                                i13 = i17 == 0 ? i18 : i18 + 1;
                                                i9 = 0;
                                            }
                                        }
                                        i14 = 0;
                                        i16 = 1;
                                        if (i16 == 0) {
                                        }
                                    }
                                    if (i13 < i18) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    i9 = 0;
                                }
                                if (i12 < 0) {
                                    throw new IllegalArgumentException();
                                }
                                int length2 = fArr2.length;
                                if (length2 < 0) {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                                fArr = new float[i12];
                                System.arraycopy(fArr2, 0, fArr, 0, Math.min(i12, length2));
                                i9 = 0;
                            } catch (NumberFormatException e8) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e8);
                            }
                        }
                        arrayList.add(new i3.e(trim.charAt(i9), fArr));
                    }
                    i10 = i11;
                    i11++;
                    i9 = 0;
                }
                i11++;
            }
            trim = substring.substring(i10, i11).trim();
            if (!trim.isEmpty()) {
            }
            i10 = i11;
            i11++;
            i9 = 0;
        }
        if (i11 - i10 != 1 || i10 >= substring.length()) {
            i8 = 0;
        } else {
            i8 = 0;
            arrayList.add(new i3.e(substring.charAt(i10), new float[0]));
        }
        try {
            i3.e.b((i3.e[]) arrayList.toArray(new i3.e[i8]), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e9) {
            throw new RuntimeException("Error in parsing ".concat(substring), e9);
        }
    }

    public static TypedValue S(Context context, int i, String str) {
        TypedValue P = P(context, i);
        if (P != null) {
            return P;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final void U(View view, x4.f fVar) {
        q6.i.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final void V(d2.n nVar, r3.f fVar) {
        Object g3 = nVar.k().f2150d.g(s.f2194g);
        if (g3 == null) {
            g3 = null;
        }
        if (g3 != null) {
            throw new ClassCastException();
        }
        d2.n l3 = nVar.l();
        if (l3 == null) {
            return;
        }
        Object g7 = l3.k().f2150d.g(s.f2192e);
        if (g7 == null) {
            g7 = null;
        }
        if (g7 != null) {
            Object g8 = l3.k().f2150d.g(s.f2193f);
            d2.b bVar = (d2.b) (g8 != null ? g8 : null);
            if (bVar == null || (bVar.f2110a >= 0 && bVar.f2111b >= 0)) {
                if (nVar.k().f2150d.c(s.F)) {
                    ArrayList arrayList = new ArrayList();
                    List j7 = d2.n.j(4, l3);
                    int size = j7.size();
                    int i = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        d2.n nVar2 = (d2.n) j7.get(i8);
                        if (nVar2.k().f2150d.c(s.F)) {
                            arrayList.add(nVar2);
                            if (nVar2.f2158c.t() < nVar.f2158c.t()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean k3 = k(arrayList);
                    int i9 = k3 ? 0 : i;
                    int i10 = k3 ? i : 0;
                    Object g9 = nVar.k().f2150d.g(s.F);
                    if (g9 == null) {
                        g9 = Boolean.FALSE;
                    }
                    fVar.f6557a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, 1, i10, 1, false, ((Boolean) g9).booleanValue()));
                }
            }
        }
    }

    public static void W(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z7 = hasOnClickListeners || z3;
        checkableImageButton.setFocusable(z7);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z7 ? 1 : 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r.p1, x0.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList X(e2 e2Var, int i, Integer num) {
        ?? hVar = new x0.h(e2Var);
        int q4 = e2Var.q(i);
        m0.a a8 = e2Var.a(i);
        while (i >= 0) {
            hVar.c(e2Var.f4907a.g(i), num);
            if (q4 >= 0) {
                m0.a aVar = a8;
                a8 = e2Var.a(q4);
                i = q4;
                q4 = e2Var.q(q4);
                num = aVar;
            } else {
                i = q4;
                num = a8;
            }
        }
        return (ArrayList) hVar.f6389a;
    }

    public static final Exception Z(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z3 = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            q6.i.d(method, "getMethod(...)");
            try {
                Parcel obtain = Parcel.obtain();
                q6.i.d(obtain, "obtain(...)");
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i = obtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            q6.i.c(invoke, "null cannot be cast to non-null type kotlin.String");
            z3 = ((String) invoke).equals("true");
        } catch (Throwable th) {
            s6.a.e(fileNotFoundException, th);
        }
        if (z3 || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new c0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void a(y0.m mVar, p6.c cVar, m0.s sVar, int i) {
        int i8;
        sVar.W(-932836462);
        if ((i & 6) == 0) {
            i8 = (sVar.f(mVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.N(i8 & 1, (i8 & 19) != 18)) {
            v0.a(sVar, androidx.compose.ui.draw.a.a(mVar, cVar));
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new i0(i, 6, mVar, cVar);
        }
    }

    public static final void b(int i, int i8, m0.s sVar, p6.c cVar, t.j jVar, u.i iVar, x.d dVar, x.f0 f0Var, y0.d dVar2, y0.m mVar, z.p pVar, boolean z3) {
        int i9;
        int i10;
        int i11;
        f7.i iVar2;
        y0.m mVar2;
        sVar.W(924924659);
        if ((i & 6) == 0) {
            i9 = (sVar.f(mVar) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= sVar.f(pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= sVar.f(f0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= sVar.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= sVar.g(false) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i9 |= sVar.f(iVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= sVar.g(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= sVar.f(jVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= 33554432;
        }
        int i12 = i9 | 805306368;
        int i13 = i8 | 6;
        if ((i8 & 48) == 0) {
            i13 |= sVar.f(dVar2) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i13 |= sVar.f(dVar) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i13 |= sVar.h(cVar) ? 2048 : 1024;
        }
        int i14 = i13;
        boolean z7 = true;
        if (sVar.N(i12 & 1, ((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170) ? false : true)) {
            sVar.S();
            if ((i & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            int i15 = i12 & (-234881025);
            sVar.q();
            int i16 = i15 >> 3;
            int i17 = i16 & 14;
            int i18 = i17 | ((i14 >> 6) & 112);
            z0 t3 = m0.b.t(cVar, sVar);
            boolean z8 = (((i18 & 14) ^ 6) > 4 && sVar.f(pVar)) || (i18 & 6) == 4;
            Object K = sVar.K();
            boolean z9 = z8;
            Object obj = m0.n.f5019a;
            if (z9 || K == obj) {
                z.c cVar2 = new z.c();
                i10 = i16;
                i11 = i17;
                cVar2.f9011a = new e1(Integer.MAX_VALUE);
                cVar2.f9012b = new e1(Integer.MAX_VALUE);
                a0.c0 c0Var = new a0.c0(t3, 8);
                m0.v0 v0Var = m0.v0.f5134g;
                g1 g1Var = o2.f5033a;
                K = new f7.i(0, 1, t2.class, new m0.e0(new b0.a(new m0.e0(c0Var, v0Var), pVar, cVar2, 5), v0Var), "value", "getValue()Ljava/lang/Object;");
                sVar.f0(K);
            } else {
                i10 = i16;
                i11 = i17;
            }
            f7.i iVar3 = (f7.i) K;
            int i19 = i15 >> 9;
            int i20 = i11 | (i19 & 112);
            boolean z10 = ((((i20 & 112) ^ 48) > 32 && sVar.g(false)) || (i20 & 48) == 32) | ((((i20 & 14) ^ 6) > 4 && sVar.f(pVar)) || (i20 & 6) == 4);
            Object K2 = sVar.K();
            if (z10 || K2 == obj) {
                K2 = new z.d(pVar);
                sVar.f0(K2);
            }
            z.d dVar3 = (z.d) K2;
            Object K3 = sVar.K();
            if (K3 == obj) {
                K3 = m0.b.l(sVar);
                sVar.f0(K3);
            }
            u uVar = (u) K3;
            x xVar = (x) sVar.j(b1.f8369g);
            a0.i iVar4 = !((Boolean) sVar.j(b1.f8383v)).booleanValue() ? l1.f113a : null;
            int i21 = i14 << 18;
            int i22 = (i15 & 65520) | (i19 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | ((i14 << 27) & 1879048192);
            boolean d8 = ((((i22 & 112) ^ 48) > 32 && sVar.f(pVar)) || (i22 & 48) == 32) | ((((i22 & 896) ^ 384) > 256 && sVar.f(f0Var)) || (i22 & 384) == 256) | ((((i22 & 7168) ^ 3072) > 2048 && sVar.g(false)) || (i22 & 3072) == 2048) | ((((57344 & i22) ^ 24576) > 16384 && sVar.g(false)) || (i22 & 24576) == 16384) | sVar.d(0) | (((i22 & 3670016) ^ 1572864) > 1048576 && sVar.f(null)) | ((((i22 & 29360128) ^ 12582912) > 8388608 && sVar.f(dVar2)) || (i22 & 12582912) == 8388608) | ((((i22 & 234881024) ^ 100663296) > 67108864 && sVar.f(dVar)) || (i22 & 100663296) == 67108864) | (((i22 & 1879048192) ^ 805306368) > 536870912 && sVar.f(null)) | sVar.f(xVar) | sVar.f(iVar4);
            Object K4 = sVar.K();
            if (d8 || K4 == obj) {
                Object jVar2 = new z.j(pVar, f0Var, iVar3, dVar, uVar, xVar, iVar4, dVar2);
                iVar2 = iVar3;
                sVar.f0(jVar2);
                K4 = jVar2;
            } else {
                iVar2 = iVar3;
            }
            z.j jVar3 = (z.j) K4;
            u.j0 j0Var = u.j0.f7028e;
            if (z3) {
                sVar.V(-2077085864);
                if ((((i10 & 14) ^ 6) <= 4 || !sVar.f(pVar)) && (i10 & 6) != 4) {
                    z7 = false;
                }
                boolean d9 = z7 | sVar.d(0);
                Object K5 = sVar.K();
                if (d9 || K5 == obj) {
                    K5 = new z.e(pVar);
                    sVar.f0(K5);
                }
                mVar2 = androidx.compose.foundation.lazy.layout.a.a((z.e) K5, pVar.f9090o, j0Var);
                sVar.p(false);
            } else {
                sVar.V(-2076657041);
                sVar.p(false);
                mVar2 = y0.j.f8705a;
            }
            a0.g0.a(iVar2, androidx.compose.foundation.a.f(androidx.compose.foundation.lazy.layout.a.b(mVar.d(pVar.f9087l).d(pVar.f9088m), iVar2, dVar3, j0Var, z3).d(mVar2).d(pVar.f9089n.i), pVar, j0Var, z3, iVar, pVar.f9083g, false, jVar), pVar.f9091p, jVar3, sVar, 0);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new z.b(mVar, pVar, f0Var, iVar, z3, jVar, dVar2, dVar, cVar, i, i8);
        }
    }

    public static final long c(float f6, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static float d(EdgeEffect edgeEffect, float f6, float f8, c cVar) {
        float f9 = z.f6890a;
        double b8 = cVar.b() * 386.0878f * 160.0f * 0.84f;
        double d8 = z.f6890a * b8;
        float exp = (float) (Math.exp((z.f6891b / z.f6892c) * Math.log((Math.abs(f6) * 0.35f) / d8)) * d8);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? t.m.b(edgeEffect) : 0.0f) * f8) {
            return 0.0f;
        }
        int B = s6.a.B(f6);
        if (i >= 31) {
            edgeEffect.onAbsorb(B);
            return f6;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(B);
        }
        return f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(File file, p6.c cVar, i6.c cVar2) {
        y3.i0 i0Var;
        int i;
        try {
            if (cVar2 instanceof y3.i0) {
                i0Var = (y3.i0) cVar2;
                int i8 = i0Var.i;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    i0Var.i = i8 - Integer.MIN_VALUE;
                    Object obj = i0Var.f8889h;
                    i = i0Var.i;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        File file2 = i0Var.f8888g;
                        s6.a.K(obj);
                        return obj;
                    }
                    s6.a.K(obj);
                    i0Var.f8888g = file;
                    i0Var.i = 1;
                    Object i9 = cVar.i(i0Var);
                    Object obj2 = h6.a.f3204d;
                    return i9 == obj2 ? obj2 : i9;
                }
            }
            if (i == 0) {
            }
        } catch (IOException e8) {
            if (e8 instanceof y3.b) {
                throw e8;
            }
            q6.i.e(file, "file");
            if (!file.exists()) {
                throw o.h(file, e8);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw o.h(file, e8);
                    }
                    throw o.h(file, e8);
                }
                if (file.canWrite()) {
                    throw o.h(file, e8);
                }
                throw o.h(file, e8);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw o.h(file, e8);
                }
                throw o.h(file, e8);
            }
            if (file.canWrite()) {
                throw o.h(file, e8);
            }
            throw o.h(file, e8);
        }
        i0Var = new y3.i0(cVar2);
        Object obj3 = i0Var.f8889h;
        i = i0Var.i;
    }

    public static void f(StringBuilder sb, Object obj, p6.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.i(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void g(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(q1.r rVar, q1.g gVar, i6.a aVar) {
        a0 a0Var;
        int i;
        h6.a aVar2;
        int size;
        int i8;
        if (aVar instanceof a0) {
            a0Var = (a0) aVar;
            int i9 = a0Var.f6928j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                a0Var.f6928j = i9 - Integer.MIN_VALUE;
                Object obj = a0Var.i;
                i = a0Var.f6928j;
                if (i != 0) {
                    s6.a.K(obj);
                    ?? r9 = rVar.i.f6032v.f5986a;
                    int size2 = r9.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (((q1.k) r9.get(i10)).f5997d) {
                            a0Var.f6926g = rVar;
                            a0Var.f6927h = gVar;
                            a0Var.f6928j = 1;
                            obj = rVar.a(gVar, a0Var);
                            aVar2 = h6.a.f3204d;
                            if (obj == aVar2) {
                            }
                            ?? r92 = ((q1.f) obj).f5986a;
                            size = r92.size();
                            i8 = 0;
                            while (i8 < size) {
                            }
                            return c6.m.f1757a;
                        }
                    }
                    return c6.m.f1757a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q1.g gVar2 = a0Var.f6927h;
                q1.r rVar2 = a0Var.f6926g;
                s6.a.K(obj);
                gVar = gVar2;
                rVar = rVar2;
                ?? r922 = ((q1.f) obj).f5986a;
                size = r922.size();
                i8 = 0;
                while (i8 < size) {
                    if (((q1.k) r922.get(i8)).f5997d) {
                        a0Var.f6926g = rVar;
                        a0Var.f6927h = gVar;
                        a0Var.f6928j = 1;
                        obj = rVar.a(gVar, a0Var);
                        aVar2 = h6.a.f3204d;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        ?? r9222 = ((q1.f) obj).f5986a;
                        size = r9222.size();
                        i8 = 0;
                        while (i8 < size) {
                        }
                    } else {
                        i8++;
                    }
                }
                return c6.m.f1757a;
            }
        }
        a0Var = new a0(aVar);
        Object obj2 = a0Var.i;
        i = a0Var.f6928j;
        if (i != 0) {
        }
    }

    public static final Object i(q1.o oVar, p6.e eVar, g6.c cVar) {
        h6.a aVar;
        c6.m mVar;
        b0 b0Var = new b0(cVar.f(), eVar, null);
        q1.s sVar = (q1.s) oVar;
        sVar.getClass();
        a7.h hVar = new a7.h(1, m.a.G(cVar));
        hVar.t();
        q1.r rVar = new q1.r(sVar, hVar);
        synchronized (sVar.f6034x) {
            sVar.f6033w.b(rVar);
            g6.c G = m.a.G(m.a.o(rVar, rVar, b0Var));
            aVar = h6.a.f3204d;
            g6.j jVar = new g6.j(G);
            mVar = c6.m.f1757a;
            jVar.k(mVar);
        }
        hVar.v(new b1.e(11, rVar));
        Object s5 = hVar.s();
        return s5 == aVar ? s5 : mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [r.p1, x0.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [m0.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List j(i2 i2Var, Integer num, int i, Integer num2) {
        int i8;
        e0 e0Var;
        if (i2Var.f4973w || i2Var.p() == 0) {
            return d6.u.f2326d;
        }
        ?? hVar = new x0.h(i2Var);
        if (num2 != null) {
            i8 = num2.intValue();
        } else {
            i8 = i2Var.f4972v;
            if (i8 < 0) {
                i8 = i2Var.D(i2Var.f4953b, i);
            }
        }
        if (num == 0) {
            int M = i2Var.i - i2Var.M(i2Var.f4953b, i2Var.r(i));
            o.x xVar = i2Var.f4969s;
            num = Integer.valueOf(M + ((xVar == null || (e0Var = (e0) xVar.b(i)) == null) ? 0 : e0Var.f5443b));
        }
        while (i >= 0) {
            hVar.c(i2Var.N(i), num);
            num = i2Var.b(i);
            if (i8 >= 0) {
                int i9 = i8;
                i8 = i2Var.D(i2Var.f4953b, i8);
                i = i9;
            } else {
                i = i8;
            }
        }
        return (ArrayList) hVar.f6389a;
    }

    public static final boolean k(ArrayList arrayList) {
        List list;
        long j7;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = d6.u.f2326d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int t3 = s6.a.t(arrayList);
                int i = 0;
                while (i < t3) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    d2.n nVar = (d2.n) obj2;
                    d2.n nVar2 = (d2.n) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (nVar2.g().a() >> 32)) - Float.intBitsToFloat((int) (nVar.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (nVar2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (nVar.g().a() & 4294967295L)));
                    arrayList2.add(new e1.b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j7 = ((e1.b) d6.m.R(list)).f2455a;
            } else {
                if (list.isEmpty()) {
                    t2.a.c("Empty collection can't be reduced.");
                }
                Object R = d6.m.R(list);
                int t7 = s6.a.t(list);
                if (1 <= t7) {
                    int i8 = 1;
                    while (true) {
                        R = new e1.b(e1.b.e(((e1.b) R).f2455a, ((e1.b) list.get(i8)).f2455a));
                        if (i8 == t7) {
                            break;
                        }
                        i8++;
                    }
                }
                j7 = ((e1.b) R).f2455a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j7)) >= Float.intBitsToFloat((int) (j7 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void l(int i, int i8) {
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", i8));
        }
    }

    public static final void m(int i, int i8) {
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", i8));
        }
    }

    public static final void n(int i, int i8, int i9) {
        if (i >= 0 && i8 <= i9) {
            if (i > i8) {
                throw new IllegalArgumentException(a0.q.i("fromIndex: ", i, " > toIndex: ", i8));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static final long r(long j7, z6.c cVar, z6.c cVar2) {
        q6.i.e(cVar, "sourceUnit");
        q6.i.e(cVar2, "targetUnit");
        return cVar2.f9293d.convert(j7, cVar.f9293d);
    }

    public static ImageView.ScaleType s(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final float t(float f6) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f6) & 8589934591L) / 3)) + 709952852);
        float f8 = intBitsToFloat - ((intBitsToFloat - (f6 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f8 - ((f8 - (f6 / (f8 * f8))) * 0.33333334f);
    }

    public static final Integer u(e2 e2Var, m0.v vVar, int i, int i8) {
        Integer u7;
        int[] iArr = e2Var.f4908b;
        while (true) {
            if (i >= i8) {
                return null;
            }
            int i9 = iArr[(i * 5) + 3] + i;
            if (e2Var.j(i) && e2Var.i(i) == 206 && q6.i.a(e2Var.p(iArr, i), t.f5112e)) {
                Object h8 = e2Var.h(i, 0);
                m0.p pVar = h8 instanceof m0.p ? (m0.p) h8 : null;
                if (pVar != null && pVar.f5035d.equals(vVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (e2Var.d(i) && (u7 = u(e2Var, vVar, i + 1, i9)) != null) {
                return Integer.valueOf(u7.intValue());
            }
            i = i9;
        }
    }

    public static final x4.f v(View view) {
        q6.i.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            x4.f fVar = tag instanceof x4.f ? (x4.f) tag : null;
            if (fVar != null) {
                return fVar;
            }
            Object L = o.L(view);
            view = L instanceof View ? (View) L : null;
        }
        return null;
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u3.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float z(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public int B(View view) {
        return 0;
    }

    public int C() {
        return 0;
    }

    public abstract void G(int i);

    public abstract void H(Typeface typeface, boolean z3);

    public abstract void K(int i);

    public abstract void L(View view, int i, int i8);

    public abstract void M(View view, float f6, float f8);

    public abstract void T(RecyclerView recyclerView);

    public abstract boolean Y(View view, int i);

    public abstract int o(View view, int i);

    public abstract int p(View view, int i);

    public abstract boolean q(v1.g gVar);

    public abstract Object w(v1.g gVar);

    public abstract void x(w5.x xVar, float f6, float f8);

    public void J(View view, int i) {
    }
}
