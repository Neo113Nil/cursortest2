package i1;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2719a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2720b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2721c;

    public static final boolean a(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        X0.f.e(bArr, "a");
        X0.f.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static s f(String str) {
        X0.f.e(str, "<this>");
        Matcher matcher = s.f2722c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        X0.f.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        X0.f.d(locale, "US");
        X0.f.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        X0.f.d(group2, "typeSubtype.group(2)");
        X0.f.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = s.f2723d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                X0.f.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (e1.l.z0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    X0.f.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new s(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static int g(Context context, int i, int i2) {
        Integer num;
        TypedValue d02 = q1.l.d0(context, i);
        if (d02 != null) {
            int i3 = d02.resourceId;
            num = Integer.valueOf(i3 != 0 ? A.b.a(context, i3) : d02.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int h(View view, int i) {
        Context context = view.getContext();
        TypedValue h02 = q1.l.h0(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = h02.resourceId;
        return i2 != 0 ? A.b.a(context, i2) : h02.data;
    }

    public static final boolean j(AssertionError assertionError) {
        Logger logger = v1.n.f4499a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? e1.d.B0(message, "getsockname failed") : false;
    }

    public static boolean k(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = C.a.f156a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = red / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = blue / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static int l(int i, int i2, float f2) {
        return C.a.b(C.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static void m(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final boolean n(String str) {
        X0.f.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final v1.c s(Socket socket) {
        Logger logger = v1.n.f4499a;
        v1.v vVar = new v1.v(socket);
        OutputStream outputStream = socket.getOutputStream();
        X0.f.d(outputStream, "getOutputStream(...)");
        return new v1.c(vVar, new v1.c(outputStream, vVar));
    }

    public static final v1.d t(Socket socket) {
        Logger logger = v1.n.f4499a;
        v1.v vVar = new v1.v(socket);
        InputStream inputStream = socket.getInputStream();
        X0.f.d(inputStream, "getInputStream(...)");
        return new v1.d(vVar, 0, new v1.d(inputStream, 1, vVar));
    }

    public abstract boolean b(p.g gVar, p.c cVar);

    public abstract boolean c(p.g gVar, Object obj, Object obj2);

    public abstract boolean d(p.g gVar, p.f fVar, p.f fVar2);

    public float i(View view) {
        if (f2719a) {
            try {
                return j0.x.a(view);
            } catch (NoSuchMethodError unused) {
                f2719a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void o(p.f fVar, p.f fVar2);

    public abstract void p(p.f fVar, Thread thread);

    public void q(View view, float f2) {
        if (f2719a) {
            try {
                j0.x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2719a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void r(View view, int i) {
        if (!f2721c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2720b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2721c = true;
        }
        Field field = f2720b;
        if (field != null) {
            try {
                f2720b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
