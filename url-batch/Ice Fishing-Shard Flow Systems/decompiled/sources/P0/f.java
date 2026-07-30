package P0;

import B6.t;
import D6.u;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import b5.C0278a;
import b5.C0279b;
import c4.AbstractC0303i;
import c4.C0299e;
import c4.EnumC0298d;
import c4.EnumC0307m;
import j6.C0588e;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import k6.InterfaceC0608c;
import kotlin.collections.AbstractC0629h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.MatchGroup;
import kotlin.text.StringsKt;
import m6.C0693a;
import m6.C0694b;
import n.C0703c0;
import n.t1;
import n.v1;
import org.json.JSONArray;
import org.json.JSONObject;
import w.AbstractC0987g;
import w.C0983c;
import w.C0986f;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public abstract class f {
    public static final boolean A(StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (kotlin.text.p.l(className, "com.onesignal")) {
                return true;
            }
        }
        return false;
    }

    public static final void F(Object[] objArr, int i2, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i2 < i5) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i2] = null;
            i2++;
        }
    }

    public static void K(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C.b.o(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void L(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i5);
        }
    }

    public static void M(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            t1.a(view, charSequence);
            return;
        }
        v1 v1Var = v1.f6914s;
        if (v1Var != null && v1Var.f6916d == view) {
            v1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new v1(view, charSequence);
            return;
        }
        v1 v1Var2 = v1.f6915t;
        if (v1Var2 != null && v1Var2.f6916d == view) {
            v1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static ActionMode.Callback N(ActionMode.Callback callback) {
        return (!(callback instanceof L.h) || Build.VERSION.SDK_INT < 26) ? callback : ((L.h) callback).f1650a;
    }

    public static Object O(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(O(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(O(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), O(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static ActionMode.Callback P(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof L.h) || callback == null) ? callback : new L.h(callback, textView);
    }

    public static final String a(Object[] objArr, int i2, int i5, AbstractC0629h abstractC0629h) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i7];
            if (obj == abstractC0629h) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final void b(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        if ((tVar instanceof t ? tVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + E.a(tVar.getClass()));
    }

    public static Bitmap c(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case 6:
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                case 2:
                case 4:
                case 5:
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static final B6.s d(y6.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        B6.s sVar = bVar instanceof B6.s ? (B6.s) bVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + E.a(bVar.getClass()));
    }

    public static final x6.f e(String serialName, V6.b kind, x6.e[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.z(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(x6.i.f8442b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        x6.a aVar = new x6.a(serialName);
        builder.invoke(aVar);
        return new x6.f(serialName, kind, aVar.f8415c.size(), kotlin.collections.p.r(typeParameters), aVar);
    }

    public static int l(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, B.b.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void m(C4.d dVar, String name, String value) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = dVar.f300a;
        arrayList.add(name);
        arrayList.add(StringsKt.J(value).toString());
    }

    public static final void n(AbstractC0303i delegate, String typeUrl) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        InterfaceC0608c interfaceC0608c = delegate.f4238b;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        new C0299e(delegate, interfaceC0608c, delegate.f4240d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static U.q o(Context context) {
        ProviderInfo providerInfo;
        F.f fVar;
        ApplicationInfo applicationInfo;
        c2.e cVar = Build.VERSION.SDK_INT >= 28 ? new U.c() : new c2.e();
        PackageManager packageManager = context.getPackageManager();
        AbstractC1053a.j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j) {
                    arrayList.add(signature.toByteArray());
                }
                fVar = new F.f(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
            if (fVar != null) {
                return null;
            }
            return new U.q(new U.p(context, fVar));
        }
        fVar = null;
        if (fVar != null) {
        }
    }

    public static u p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        D0.j a7 = u.f570b.a(0, str);
        if (a7 == null) {
            throw new IllegalArgumentException(C4.p.i("No subtype found for: \"", str, '\"'));
        }
        if (((kotlin.text.e) a7.f332l) == null) {
            a7.f332l = new kotlin.text.e(a7);
        }
        kotlin.text.e eVar = (kotlin.text.e) a7.f332l;
        Intrinsics.b(eVar);
        String str2 = (String) eVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (((kotlin.text.e) a7.f332l) == null) {
            a7.f332l = new kotlin.text.e(a7);
        }
        kotlin.text.e eVar2 = (kotlin.text.e) a7.f332l;
        Intrinsics.b(eVar2);
        String lowerCase2 = ((String) eVar2.get(2)).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) a7.f330e;
        int i2 = C0588e.c(matcher.start(), matcher.end()).f6174e;
        while (true) {
            int i5 = i2 + 1;
            if (i5 >= str.length()) {
                return new u(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            D0.j a8 = u.f571c.a(i5, str);
            if (a8 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i5);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            Matcher matcher2 = (Matcher) a8.f330e;
            kotlin.text.g gVar = (kotlin.text.g) a8.f331i;
            MatchGroup b7 = gVar.b(1);
            String str3 = b7 != null ? b7.f6178a : null;
            if (str3 == null) {
                i2 = C0588e.c(matcher2.start(), matcher2.end()).f6174e;
            } else {
                MatchGroup b8 = gVar.b(2);
                String str4 = b8 != null ? b8.f6178a : null;
                if (str4 == null) {
                    MatchGroup b9 = gVar.b(3);
                    Intrinsics.b(b9);
                    str4 = b9.f6178a;
                } else {
                    Intrinsics.checkNotNullParameter(str4, "<this>");
                    if (str4.length() > 0 && kotlin.text.a.b(str4.charAt(0), '\'', false)) {
                        Intrinsics.checkNotNullParameter(str4, "<this>");
                        if (str4.length() > 0 && kotlin.text.a.b(str4.charAt(StringsKt.w(str4)), '\'', false) && str4.length() > 2) {
                            str4 = str4.substring(1, str4.length() - 1);
                            Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                        }
                    }
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i2 = C0588e.c(matcher2.start(), matcher2.end()).f6174e;
            }
        }
    }

    public static final int q(Cursor c7, String name) {
        String str;
        Intrinsics.checkNotNullParameter(c7, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c7, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c7.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c7.getColumnIndex("`" + name + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && name.length() != 0) {
                    String[] columnNames = c7.getColumnNames();
                    Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
                    Intrinsics.checkNotNullParameter(columnNames, "columnNames");
                    Intrinsics.checkNotNullParameter(name, "name");
                    String concat = ".".concat(name);
                    String i2 = C4.p.i(".", name, '`');
                    int length = columnNames.length;
                    int i5 = 0;
                    int i7 = 0;
                    while (i7 < length) {
                        String str2 = columnNames[i7];
                        int i8 = i5 + 1;
                        if (str2.length() >= name.length() + 2 && (kotlin.text.p.f(str2, concat) || (str2.charAt(0) == '`' && kotlin.text.p.f(str2, i2)))) {
                            columnIndex = i5;
                            break;
                        }
                        i7++;
                        i5 = i8;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c7.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames2, "c.columnNames");
            str = kotlin.collections.p.o(columnNames2, 63);
        } catch (Exception e7) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e7);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static C0279b r(String rootDir, long j) {
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        File file = new File(rootDir);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(30L);
        timeUnit.toMillis(33L);
        TimeUnit.HOURS.toMillis(18L);
        byte b7 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) 8) | 16)) | 1)) | 2)) | 4)) | 1)) | 2);
        C0693a c0693a = C0694b.f6584e;
        m6.d unit = m6.d.f6594n;
        Intrinsics.checkNotNullParameter(unit, "unit");
        long t6 = unit.compareTo(m6.d.f6592l) <= 0 ? AbstractC1053a.t(m6.e.a(72, unit, m6.d.f6590e)) : AbstractC1053a.G(72, unit);
        long f7 = ((((int) t6) & 1) != 1 || C0694b.d(t6)) ? C0694b.f(t6, m6.d.f6591i) : t6 >> 1;
        byte b8 = (byte) (b7 | 4);
        if (b8 == 31) {
            C0278a c0278a = new C0278a(2000L, j, f7);
            if (j <= 2000) {
                throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("destinationDir must be a directory");
            }
            if (file.exists() || file.mkdirs()) {
                C0279b c0279b = new C0279b(new X4.a(new X4.d(new X4.b(file, c0278a)), new B.f(16)));
                Intrinsics.checkNotNullExpressionValue(c0279b, "create(...)");
                return c0279b;
            }
            throw new IllegalStateException("Could not create dir: " + file);
        }
        StringBuilder sb = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb.append(" maxFileAgeForWriteMillis");
        }
        if ((b8 & 2) == 0) {
            sb.append(" minFileAgeForReadMillis");
        }
        if ((b8 & 4) == 0) {
            sb.append(" maxFileAgeForReadMillis");
        }
        if ((b8 & 8) == 0) {
            sb.append(" maxFileSize");
        }
        if ((b8 & 16) == 0) {
            sb.append(" maxFolderSize");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public static SharedPreferences t(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static G.a u(C0703c0 c0703c0) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new G.a(C.b.l(c0703c0));
        }
        TextPaint textPaint = new TextPaint(c0703c0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0703c0.getBreakStrategy();
        int hyphenationFrequency = c0703c0.getHyphenationFrequency();
        if (c0703c0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0703c0.getInputType() & 15) != 3) {
                boolean z7 = c0703c0.getLayoutDirection() == 1;
                switch (c0703c0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z7) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(C.b.c(DecimalFormatSymbols.getInstance(c0703c0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new G.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final void v(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = name.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void w(String value, String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(E6.c.i(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static boolean y(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("ContentSizingFlag", "Could not get metadata", e7);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean z(byte b7) {
        return b7 > -65;
    }

    public abstract void B(R0.h hVar, R0.h hVar2);

    public abstract void C(C0986f c0986f, C0986f c0986f2);

    public abstract void D(R0.h hVar, Thread thread);

    public abstract void E(C0986f c0986f, Thread thread);

    public abstract void G(boolean z7);

    public abstract void I(boolean z7);

    public abstract void J(boolean z7);

    public abstract TransformationMethod Q(TransformationMethod transformationMethod);

    public abstract boolean f(R0.i iVar, R0.d dVar, R0.d dVar2);

    public abstract boolean g(AbstractC0987g abstractC0987g, C0983c c0983c, C0983c c0983c2);

    public abstract boolean h(R0.i iVar, Object obj, Object obj2);

    public abstract boolean i(AbstractC0987g abstractC0987g, Object obj, Object obj2);

    public abstract boolean j(R0.i iVar, R0.h hVar, R0.h hVar2);

    public abstract boolean k(AbstractC0987g abstractC0987g, C0986f c0986f, C0986f c0986f2);

    public abstract InputFilter[] s(InputFilter[] inputFilterArr);

    public abstract boolean x();

    public void H(boolean z7) {
    }
}
