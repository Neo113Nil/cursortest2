package B;

import E.j;
import N.f;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import e.C0024a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.i;
import io.flutter.view.k;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import n.AbstractC0077d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Object f7a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10d;

    public e(C0024a c0024a) {
        this.f10d = c0024a;
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public SpannableString a() {
        if (((String) this.f7a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f7a);
        ArrayList arrayList = (ArrayList) this.f8b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                int a2 = AbstractC0077d.a(kVar.f803c);
                if (a2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f801a, kVar.f802b, 0);
                } else if (a2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((i) kVar).f800d)), kVar.f801a, kVar.f802b, 0);
                }
            }
        }
        String str = (String) this.f10d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f10d), 0, ((String) this.f7a).length(), 0);
        }
        String str2 = (String) this.f9c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f9c)), 0, ((String) this.f7a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((C0024a) this.f10d).f469c[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((C0024a) this.f10d).h(i2);
    }

    public File e(Context context) {
        ((b) this.f8b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void f(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((j) this.f10d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void g(Serializable serializable, N.c cVar) {
        ((f) this.f7a).f((String) this.f8b, ((N.i) this.f9c).c(serializable), cVar == null ? null : new N.a(0, this, cVar));
    }

    public void h(N.b bVar) {
        String str = (String) this.f8b;
        f fVar = (f) this.f7a;
        b bVar2 = (b) this.f10d;
        if (bVar2 != null) {
            fVar.a(str, bVar != null ? new a(this, bVar, 11, false) : null, bVar2);
        } else {
            fVar.b(str, bVar != null ? new a(this, bVar, 11, false) : null);
        }
    }

    public Object[] i(Object[] objArr, int i2) {
        int i3 = ((C0024a) this.f10d).f470d;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = b(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public e(f fVar, String str, N.i iVar, b bVar) {
        this.f7a = fVar;
        this.f8b = str;
        this.f9c = iVar;
        this.f10d = bVar;
    }
}
