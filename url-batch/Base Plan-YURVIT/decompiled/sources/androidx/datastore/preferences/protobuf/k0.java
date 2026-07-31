package androidx.datastore.preferences.protobuf;

import B0.C0000a;
import B0.C0008i;
import W0.AbstractC0061a;
import W0.AbstractC0081v;
import W0.C0074n;
import a.AbstractC0086a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import b1.AbstractC0115a;
import g0.C0131a;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import n.AbstractFutureC0206g;
import n.C0202c;
import n.C0205f;
import o.AbstractC0209a;
import o0.C0214e;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0221a;

/* loaded from: classes.dex */
public abstract class k0 {
    public k0() {
        new ConcurrentHashMap();
    }

    public static void A(C0214e c0214e, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = c0214e.f2924g;
                    int i4 = c0214e.f2923f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    c0214e.f2919b = i3;
                    c0214e.f2918a = i4;
                    c0214e.f2920c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static List B(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0221a.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void C(l0.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", l0.c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static void F(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        i.s0 s0Var = i.s0.f2299j;
        if (s0Var != null && s0Var.f2301a == view) {
            i.s0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new i.s0(view, charSequence);
            return;
        }
        i.s0 s0Var2 = i.s0.f2300k;
        if (s0Var2 != null && s0Var2.f2301a == view) {
            s0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void G(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(O0.p pVar, AbstractC0061a abstractC0061a, AbstractC0061a abstractC0061a2) {
        try {
            AbstractC0115a.g(AbstractC0086a.v(((I0.b) pVar).b(abstractC0061a2, abstractC0061a)), D0.h.f206a);
        } catch (Throwable th) {
            abstractC0061a2.g(AbstractC0086a.l(th));
            throw th;
        }
    }

    public static final Object I(b1.u uVar, b1.u uVar2, O0.p pVar) {
        Object c0074n;
        Object K2;
        try {
            P0.r.a(2, pVar);
            c0074n = pVar.i(uVar2, uVar);
        } catch (Throwable th) {
            c0074n = new C0074n(th, false);
        }
        H0.a aVar = H0.a.f511e;
        if (c0074n == aVar || (K2 = uVar.K(c0074n)) == AbstractC0081v.f978d) {
            return aVar;
        }
        if (K2 instanceof C0074n) {
            throw ((C0074n) K2).f965a;
        }
        return AbstractC0081v.k(K2);
    }

    public static final boolean J(String str, O0.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.h()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static Object K(Object obj) {
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
                jSONArray.put(K(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(K(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), K(entry.getValue()));
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

    public static void L(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Bitmap b(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
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

    public static C0008i c(Map map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get("toolbarColor");
        Integer valueOf = str != null ? Integer.valueOf(Color.parseColor(str) | (-16777216)) : null;
        String str2 = (String) map.get("navigationBarColor");
        Integer valueOf2 = str2 != null ? Integer.valueOf((-16777216) | Color.parseColor(str2)) : null;
        String str3 = (String) map.get("navigationBarDividerColor");
        return new C0008i(valueOf, valueOf2, str3 != null ? Integer.valueOf(Color.parseColor(str3)) : null, 8);
    }

    public static final Bundle d(Map map) {
        P0.h.e(map, "headers");
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean i(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean j2 = j(file, inputStream);
                h(inputStream);
                return j2;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean j(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean p(Method method, P0.e eVar) {
        Class a2 = eVar.a();
        P0.h.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static int s(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static final String t(Context context, boolean z2, B0.E e2) {
        ResolveInfo resolveActivity;
        P0.h.e(context, "context");
        F0.c cVar = new F0.c(10);
        cVar.addAll(c0.c.f1786a);
        Set set = (Set) e2.f20f;
        if (set != null) {
            cVar.addAll(set);
        }
        cVar.f();
        cVar.f467g = true;
        if (cVar.f466f <= 0) {
            cVar = F0.c.f464h;
        }
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = cVar == null ? new ArrayList() : cVar;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z2 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (cVar != null) {
                arrayList2.addAll(cVar);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static File u(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean v(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("ContentSizingFlag", "Could not get metadata");
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static MappedByteBuffer w(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static q.b x(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            G(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0209a.f2911a);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, 500);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                G(xmlResourceParser);
            }
            return new q.e(new C0131a(string, string2, string3, B(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0209a.f2912b);
                    int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = obtainAttributes2.getInt(i3, 0);
                    int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                    String string6 = obtainAttributes2.getString(i5);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        G(xmlResourceParser);
                    }
                    arrayList.add(new q.d(string6, i2, z2, string5, i4, resourceId2));
                } else {
                    G(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new q.c((q.d[]) arrayList.toArray(new q.d[0]));
    }

    public abstract void E(boolean z2);

    public abstract boolean e(AbstractFutureC0206g abstractFutureC0206g, C0202c c0202c);

    public abstract boolean f(AbstractFutureC0206g abstractFutureC0206g, Object obj, Object obj2);

    public abstract boolean g(AbstractFutureC0206g abstractFutureC0206g, C0205f c0205f, C0205f c0205f2);

    public abstract Typeface k(Context context, q.c cVar, Resources resources, int i2);

    public abstract Typeface l(Context context, v.g[] gVarArr, int i2);

    public Typeface m(Context context, InputStream inputStream) {
        File u2 = u(context);
        if (u2 == null) {
            return null;
        }
        try {
            if (j(u2, inputStream)) {
                return Typeface.createFromFile(u2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            u2.delete();
        }
    }

    public Typeface n(Context context, Resources resources, int i2, String str, int i3) {
        File u2 = u(context);
        if (u2 == null) {
            return null;
        }
        try {
            if (i(u2, resources, i2)) {
                return Typeface.createFromFile(u2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            u2.delete();
        }
    }

    public abstract String o(byte[] bArr, int i2, int i3);

    public abstract int q(String str, byte[] bArr, int i2, int i3);

    public v.g r(v.g[] gVarArr, int i2) {
        new C0000a(29);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        v.g gVar = null;
        int i4 = Integer.MAX_VALUE;
        for (v.g gVar2 : gVarArr) {
            int abs = (Math.abs(gVar2.f3075c - i3) * 2) + (gVar2.f3076d == z2 ? 0 : 1);
            if (gVar == null || i4 > abs) {
                gVar = gVar2;
                i4 = abs;
            }
        }
        return gVar;
    }

    public abstract void y(C0205f c0205f, C0205f c0205f2);

    public abstract void z(C0205f c0205f, Thread thread);

    public void D(boolean z2) {
    }
}
