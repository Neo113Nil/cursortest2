package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsh {
    public static bsh c;
    public final int a;
    public final Object b;

    public bsh() {
        this.a = 1;
        this.b = new ArrayList();
    }

    public static ImageView a(bsg bsgVar) {
        return (ImageView) bsgVar.J().findViewById(R.id.image);
    }

    public static TextView b(bsg bsgVar) {
        return (TextView) bsgVar.J().findViewById(R.id.description);
    }

    public static TextView c(bsg bsgVar) {
        return (TextView) bsgVar.J().findViewById(R.id.title);
    }

    public static bsh f(int i, kbq kbqVar) {
        if (i != 4) {
            i = 5;
        }
        kbqVar.getClass();
        return new bsh(i, kbqVar);
    }

    public final int d() {
        int i = 0;
        int i2 = 0;
        while (true) {
            jpj[] jpjVarArr = (jpj[]) this.b;
            if (i >= jpjVarArr.length) {
                return i2;
            }
            i2 += jpjVarArr[i].a;
            i++;
        }
    }

    public final int e() {
        return this.a * d();
    }

    public bsh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public bsh(Context context) {
        this.b = context;
        this.a = 2;
    }

    public bsh(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public bsh(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public bsh(Object obj, int i, byte[] bArr) {
        this.b = obj;
        this.a = i;
    }

    public bsh(int i) {
        this.b = null;
        this.a = i;
    }

    public bsh(String str, bsg bsgVar) {
        this.b = bsgVar;
        this.a = Integer.parseInt(str);
    }

    public bsh(clg clgVar, int i) {
        oy.at(clgVar);
        this.b = clgVar;
        this.a = i;
    }
}
