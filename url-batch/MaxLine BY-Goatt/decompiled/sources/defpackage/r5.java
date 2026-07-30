package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r5 {
    public int a;
    public Object b;

    public r5(Context context) {
        int g = s5.g(context, 0);
        this.b = new n5(new ContextThemeWrapper(context, s5.g(context, g)));
        this.a = g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r5 e(Resources resources, int i, Resources.Theme theme) {
        int next;
        int i2;
        int i3;
        float f;
        float f2;
        Object radialGradient;
        int i4;
        TypedArray obtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new r5(lw.b(resources, xml, asAttributeSet, theme).getDefaultColor(), obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = z52.e;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i2 = 0;
            i3 = obtainAttributes.getColor(1, 0);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i6 = 1;
        int i7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? obtainAttributes.getInt(6, i2) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i6) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = z52.f;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i4 = 0;
                } else {
                    i4 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i4);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = obtainStyledAttributes.getColor(0, 0);
                float f11 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i6 = 1;
        }
        qr qrVar = arrayList2.size() > 0 ? new qr(arrayList2, arrayList) : null;
        if (qrVar == null) {
            qrVar = z ? new qr(color, color2, i3) : new qr(color, i3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                radialGradient = new LinearGradient(f, f2, f5, f6, qrVar.a, qrVar.b, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f7, f8, qrVar.a, qrVar.b);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f10, qrVar.a, qrVar.b, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new r5(0, radialGradient);
    }

    public static void f(String str) {
        if (tp2.i(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.c(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a(long j) {
        if (c(j)) {
            return;
        }
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.b = jArr;
        }
        jArr[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public void b() {
        this.a = 0;
        Iterator it = ((LinkedHashMap) this.b).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                k72 k72Var = (k72) zv.v(arrayList);
                if ((k72Var != null ? (Bitmap) k72Var.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((k72) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean c(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public s5 d() {
        n5 n5Var = (n5) this.b;
        s5 s5Var = new s5(n5Var.a, this.a);
        View view = n5Var.e;
        q5 q5Var = s5Var.s;
        if (view != null) {
            q5Var.n = view;
        } else {
            CharSequence charSequence = n5Var.d;
            if (charSequence != null) {
                q5Var.d = charSequence;
                TextView textView = q5Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = n5Var.c;
            if (drawable != null) {
                q5Var.j = drawable;
                ImageView imageView = q5Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    q5Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (n5Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) n5Var.b.inflate(q5Var.r, (ViewGroup) null);
            int i = n5Var.i ? q5Var.s : q5Var.t;
            ListAdapter listAdapter = n5Var.g;
            if (listAdapter == null) {
                listAdapter = new p5(n5Var.a, i, R.id.text1, null);
            }
            q5Var.o = listAdapter;
            q5Var.p = n5Var.j;
            if (n5Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new m5(n5Var, q5Var));
            }
            if (n5Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            q5Var.e = alertController$RecycleListView;
        }
        s5Var.setCancelable(true);
        s5Var.setCanceledOnTouchOutside(true);
        s5Var.setOnCancelListener(null);
        s5Var.setOnDismissListener(null);
        gk1 gk1Var = n5Var.f;
        if (gk1Var != null) {
            s5Var.setOnKeyListener(gk1Var);
        }
        return s5Var;
    }

    public boolean g() {
        return this.a < ((ArrayList) this.b).size();
    }

    public void h(zs0 zs0Var, int i, int i2) {
        ((ib2) this.b).e(new zq2(zs0Var), i, i2);
    }

    public void i(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public synchronized void j(ak1 ak1Var, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
            Object obj = linkedHashMap.get(ak1Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(ak1Var, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            k72 k72Var = new k72(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(k72Var);
                    break;
                }
                k72 k72Var2 = (k72) arrayList.get(i2);
                if (i < k72Var2.d) {
                    i2++;
                } else if (k72Var2.a == identityHashCode && k72Var2.b.get() == bitmap) {
                    arrayList.set(i2, k72Var);
                } else {
                    arrayList.add(i2, k72Var);
                }
            }
            int i3 = this.a;
            this.a = i3 + 1;
            if (i3 >= 10) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public r5(c10 c10Var, int i) {
        ll3.v(c10Var);
        this.b = c10Var;
        this.a = i;
    }

    public r5(int i, int i2) {
        switch (i2) {
            case 5:
                this.a = i;
                break;
            default:
                this.b = new byte[i];
                this.a = 0;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r5(ib2 ib2Var, int i) {
        this(i, 5);
        this.b = ib2Var;
    }

    public r5(int i, ak0... ak0VarArr) {
        this.a = i;
        this.b = ak0VarArr;
    }

    public /* synthetic */ r5(int i, Object obj) {
        this.b = obj;
        this.a = i;
    }
}
