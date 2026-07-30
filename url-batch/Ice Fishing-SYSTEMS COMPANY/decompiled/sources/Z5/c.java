package Z5;

import D6.h;
import I1.f;
import O.X;
import O2.w;
import Y5.e;
import Y5.i;
import Y5.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import b6.C0530a;
import b6.g;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d1.C4455a;
import d1.C4456b;
import g6.C4531a;
import i1.AbstractC4574a;
import i1.C4575b;
import i8.m;
import j1.j;
import j6.AbstractC4599a;
import j6.C4600b;
import j6.C4603e;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import k1.C4628a;
import l7.C4707a;
import u6.C5114a;
import z0.C5260c;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                H.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                H.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                H.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void c(i iVar, String str) {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        new e(iVar, iVar.f4009b, iVar.f4011d);
    }

    public static ImageView.ScaleType d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static ArrayList e(C6.b bVar) {
        C4531a c4531a;
        byte b9 = 2;
        int i = 1;
        ArrayList arrayList = new ArrayList();
        for (E6.d dVar : bVar.f489v) {
            F6.b bVar2 = dVar.f859v;
            String str = dVar.f861x;
            if (str.isEmpty()) {
                str = null;
            }
            C4707a c4707a = C4707a.f39080c;
            f fVar = new f(b9);
            if (str == null) {
                str = null;
            }
            fVar.f(W2.e.n(bVar2.f1138v));
            C4707a a9 = C4707a.a(fVar.b(), str);
            for (E6.f fVar2 : dVar.f860w) {
                h hVar = fVar2.f863v;
                String str2 = hVar.f721v;
                int i4 = U6.a.f3300e;
                C0530a n9 = W2.e.n(hVar.f723x);
                String str3 = hVar.f722w;
                if (str3.isEmpty()) {
                    str3 = null;
                }
                String str4 = fVar2.f865x;
                if (str4 == null) {
                    str4 = null;
                }
                U6.a a10 = U6.a.a(str2, str3, str4, n9);
                for (E6.b bVar3 : fVar2.f864w) {
                    long j9 = bVar3.f853v;
                    byte b10 = (byte) (((byte) i) | b9);
                    h6.i[] values = h6.i.values();
                    int length = values.length;
                    byte b11 = b9;
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = i;
                        h6.i iVar = values[i9];
                        if (iVar.f38246n == bVar3.f855x.f892n) {
                            D6.b bVar4 = bVar3.f857z;
                            g a11 = bVar4 != null ? U2.a.a(bVar4) : null;
                            C0530a n10 = W2.e.n(bVar3.f847A);
                            String c4 = bVar3.f850D.c();
                            String c9 = bVar3.f851E.c();
                            C4603e c4603e = C4603e.f38572c[((byte) (bVar3.f849C & p.f8630b)) & 255];
                            C4600b c4600b = AbstractC4599a.f38569a;
                            if (c9 != null) {
                                C4531a c4531a2 = C4531a.f37920f;
                                if (c9.length() == 16 && !"0000000000000000".contentEquals(c9)) {
                                    char[] cArr = g6.f.f37935a;
                                    int length2 = c9.length();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            if (!g6.f.f37937c[c9.charAt(i11)]) {
                                                break;
                                            }
                                            i11++;
                                        } else if (c4 != null && c4.length() == 32 && !"00000000000000000000000000000000".contentEquals(c4)) {
                                            int length3 = c4.length();
                                            for (int i12 = 0; i12 < length3; i12++) {
                                                if (g6.f.f37937c[c4.charAt(i12)]) {
                                                }
                                            }
                                            c4531a = new C4531a(c4, c9, c4603e, c4600b, true);
                                        }
                                    }
                                }
                            }
                            c4531a = new C4531a("00000000000000000000000000000000", "0000000000000000", c4603e, c4600b, false);
                            C4531a c4531a3 = c4531a;
                            int size = n10.size() + bVar3.f848B;
                            byte b12 = (byte) (b10 | 4);
                            if (b12 != 7) {
                                StringBuilder sb = new StringBuilder();
                                if ((b12 & 1) == 0) {
                                    sb.append(" timestampEpochNanos");
                                }
                                if ((b12 & 2) == 0) {
                                    sb.append(" observedTimestampEpochNanos");
                                }
                                if ((b12 & 4) == 0) {
                                    sb.append(" totalAttributeCount");
                                }
                                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
                            }
                            arrayList.add(new C5114a(a9, a10, j9, bVar3.f854w, c4531a3, iVar, bVar3.f856y, size, n10, a11, bVar3.f852F));
                            b9 = b11;
                            i = i10;
                        } else {
                            i9++;
                            i = i10;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return arrayList;
    }

    public static C5260c f(m refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.h.e(refHolder, "refHolder");
        C5260c c5260c = (C5260c) refHolder.f38384n;
        if (c5260c != null && c5260c.f42109n.equals(sQLiteDatabase)) {
            return c5260c;
        }
        C5260c c5260c2 = new C5260c(sQLiteDatabase);
        refHolder.f38384n = c5260c2;
        return c5260c2;
    }

    public static C4455a g(C4575b c4575b, X0.i iVar) {
        return new C4455a(h1.p.a(c4575b, iVar, 1.0f, h1.f.f38159u, false), 0);
    }

    public static C4456b h(AbstractC4574a abstractC4574a, X0.i iVar, boolean z8) {
        return new C4456b(0, h1.p.a(abstractC4574a, iVar, z8 ? j.c() : 1.0f, h1.f.f38160v, false));
    }

    public static C4455a i(C4575b c4575b, X0.i iVar, int i) {
        J6.i iVar2 = new J6.i(11);
        iVar2.f1421u = i;
        ArrayList a9 = h1.p.a(c4575b, iVar, 1.0f, iVar2, false);
        for (int i4 = 0; i4 < a9.size(); i4++) {
            C4628a c4628a = (C4628a) a9.get(i4);
            e1.c cVar = (e1.c) c4628a.f38672b;
            e1.c cVar2 = (e1.c) c4628a.f38673c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f37240a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f37240a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f6 = Float.NaN;
                    int i9 = 0;
                    for (int i10 = 0; i10 < length2; i10++) {
                        float f9 = fArr3[i10];
                        if (f9 != f6) {
                            fArr3[i9] = f9;
                            i9++;
                            f6 = fArr3[i10];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i9);
                    c4628a = new C4628a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a9.set(i4, c4628a);
        }
        return new C4455a(a9, 1);
    }

    public static C4455a j(AbstractC4574a abstractC4574a, X0.i iVar) {
        return new C4455a(h1.p.a(abstractC4574a, iVar, 1.0f, h1.f.f38161w, false), 2);
    }

    public static C4455a k(C4575b c4575b, X0.i iVar) {
        return new C4455a(h1.p.a(c4575b, iVar, j.c(), h1.f.f38163y, true), 3);
    }

    public static String l(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        u8.h hVar = u8.h.f41278w;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.h.d(encoded, "getEncoded(...)");
        int i = 0;
        u8.h w9 = L2.i.w(encoded, 0, -1234567890);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(w9.f41279n, 0, w9.a());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.h.b(digest);
        new u8.h(digest);
        byte[] map = u8.a.f41262a;
        kotlin.jvm.internal.h.e(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length = digest.length - (digest.length % 3);
        int i4 = 0;
        while (i < length) {
            byte b9 = digest[i];
            int i9 = i + 2;
            byte b10 = digest[i + 1];
            i += 3;
            byte b11 = digest[i9];
            bArr[i4] = map[(b9 & 255) >> 2];
            bArr[i4 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i10 = i4 + 3;
            bArr[i4 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i4 += 4;
            bArr[i10] = map[b11 & com.anythink.core.common.s.a.c.f16476c];
        }
        int length2 = digest.length - length;
        if (length2 == 1) {
            byte b12 = digest[i];
            bArr[i4] = map[(b12 & 255) >> 2];
            bArr[1 + i4] = map[(b12 & 3) << 4];
            bArr[2 + i4] = 61;
            bArr[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b13 = digest[i];
            byte b14 = digest[i11];
            bArr[i4] = map[(b13 & 255) >> 2];
            bArr[1 + i4] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr[i4 + 2] = map[(b14 & 15) << 2];
            bArr[i4 + 3] = 61;
        }
        sb.append(new String(bArr, M7.a.f1916a));
        return sb.toString();
    }

    public static final void m(LinkedHashMap linkedHashMap, String str, String str2) {
        if (str2 != null) {
            linkedHashMap.put(str, str2);
        }
    }

    public static void n(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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
        H.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void o(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = X.f2240a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z8 = onLongClickListener != null;
        boolean z9 = hasOnClickListeners || z8;
        checkableImageButton.setFocusable(z9);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z8);
        checkableImageButton.setImportantForAccessibility(z9 ? 1 : 2);
    }

    public static int p(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static boolean q(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !q((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!w.l(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }
}
