package c0;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.j;
import io.flutter.view.l;
import java.io.File;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Object f70a;

    /* renamed from: b, reason: collision with root package name */
    public Object f71b;

    /* renamed from: c, reason: collision with root package name */
    public Object f72c;

    /* renamed from: d, reason: collision with root package name */
    public Object f73d;

    public e(e.a aVar) {
        this.f73d = aVar;
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public SpannableString a() {
        if (((String) this.f70a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f70a);
        List<l> list = (List) this.f71b;
        if (list != null) {
            for (l lVar : list) {
                int a2 = o.d.a(lVar.f624c);
                if (a2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f622a, lVar.f623b, 0);
                } else if (a2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) lVar).f621d)), lVar.f622a, lVar.f623b, 0);
                }
            }
        }
        String str = (String) this.f73d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f73d), 0, ((String) this.f70a).length(), 0);
        }
        String str2 = (String) this.f72c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f72c)), 0, ((String) this.f70a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((e.a) this.f73d).f101c[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((e.a) this.f73d).h(i2);
    }

    public File e(Context context) {
        ((b) this.f71b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void f(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((f0.l) this.f73d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public Object[] g(Object[] objArr, int i2) {
        int i3 = ((e.a) this.f73d).f102d;
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
}
